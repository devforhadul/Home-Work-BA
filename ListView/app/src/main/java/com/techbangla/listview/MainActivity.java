package com.techbangla.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    ArrayList< HashMap <String, String> > arraylist = new ArrayList<>();
    HashMap <String, String> myHash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = findViewById(R.id.listview);

        /*Finish Initilization*/

        myHash = new HashMap<>();
        myHash.put("name", "Forhadul Islma");
        myHash.put("Phone", "01984839526");
        myHash.put("email", "forhadul75@gmail.com");
        arraylist.add(myHash);

        myHash = new HashMap<>();
        myHash.put("name", "Abdullah Al Roman");
        myHash.put("Phone", "01800000000");
        myHash.put("email", "abdul@gmail.com");
        arraylist.add(myHash);

        myHash = new HashMap<>();
        myHash.put("name", "Abdullah Al Imran");
        myHash.put("Phone", "01700000000");
        myHash.put("email", "imran@gmail.com");
        arraylist.add(myHash);

        myHash = new HashMap<>();
        myHash.put("name", "Jalina Akter");
        myHash.put("Phone", "01000000000");
        myHash.put("email", "imran@gmail.com");
        arraylist.add(myHash);

        myHash = new HashMap<>();
        myHash.put("name", "Md Mostafa");
        myHash.put("Phone", "01500000000");
        myHash.put("email", "imran@gmail.com");
        arraylist.add(myHash);








        /*Initilization adapter*/
        myAdapter myadap = new myAdapter();
        listview.setAdapter(myadap);

    }

    /*==================================================*/
    /*==================================================*/


    /*Create adapter class*/
    public class myAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return arraylist.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater layInflate = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View myview = layInflate.inflate(R.layout.item, parent, false);

            ImageView myIng = myview.findViewById(R.id.img);
            TextView name = myview.findViewById(R.id.name);
            TextView phone = myview.findViewById(R.id.phone);
            TextView email = myview.findViewById(R.id.email);

            HashMap <String, String> hashMap = arraylist.get(position);
            String myname = hashMap.get("name");
            String myphone = hashMap.get("Phone");
            String myemail = hashMap.get("email");

            name.setText(myname);
            phone.setText(myphone);
            email.setText(myemail);

            myIng.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(MainActivity.this, ""+myname, Toast.LENGTH_LONG).show();

                }
            });





            return myview;
        }
    }


}


