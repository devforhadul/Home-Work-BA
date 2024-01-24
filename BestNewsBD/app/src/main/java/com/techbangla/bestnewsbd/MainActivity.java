package com.techbangla.bestnewsbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    HashMap<String, String> hashMap;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    TextView marqueeText, textvlloy;

    String hosturl = "https://devforhadul.com/myapp/myapp.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);
        marqueeText = findViewById(R.id.marqueeText);
        textvlloy = findViewById(R.id.textvlloy);


        //finish initilization



        vollyhost();



        marqueeText.setSelected(true);

        dataTable();
        myAdapter myadapter = new myAdapter();
        listView.setAdapter(myadapter);

    }//finish on create method

    //start adapter
    private class myAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return arrayList.size();
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

            LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View myview = layoutInflater.inflate(R.layout.list_iteam, parent, false);

            ImageView img = myview.findViewById(R.id.image);
            TextView cat = myview.findViewById(R.id.cat);
            TextView title = myview.findViewById(R.id.title);
            TextView des = myview.findViewById(R.id.des);
            LinearLayout layItem = myview.findViewById(R.id.layItem);

            HashMap<String, String> hash = arrayList.get(position);
            String img_url = hash.get("img_url");
            String catt = hash.get("cat");
            String titlet = hash.get("title");
            String dis = hash.get("dis");


            Picasso.get()
                    .load(img_url)
                    .placeholder(R.drawable.shakib_photo)
                    .resize(50, 50)
                    .centerCrop()
                    .into(img);




            cat.setText(catt);
            title.setText(titlet);
            des.setText(dis);


            Random rnd = new Random();
            int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            cat.setBackgroundColor(color);

            layItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Item_Details.TITLE = titlet;
                    Item_Details.DIS = dis;
                    Bitmap mybit = ((BitmapDrawable) img.getDrawable()).getBitmap();
                    Item_Details.myBIT = mybit;

                    startActivity(new Intent(MainActivity.this, Item_Details.class));

                }
            });


            return myview;
        }
    }
    //finsh adatptert


    //Data table start
    private void dataTable() {

        hashMap = new HashMap<>();
        hashMap.put("img_url", "https://square.github.io/picasso/static/sample.png");
        hashMap.put("cat", "Cricket");
        hashMap.put("title", "মিরপুরে সাকিব: এটা কিন্তু রাজনীতির মাঠ নয়…");
        hashMap.put("dis", "খবরটা ছড়িয়ে পড়ার পরই মিরপুর শেরেবাংলা স্টেডিয়ামের মাঠকর্মীদের মধ্যে ব্যস্ততা বেড়ে গেল। একজন ফোনে যোগাযোগ করে ফুলের ব্যবস্থা করলেন। আরেকজন মাঠকর্মীদের ডেকে নিয়ে যান মিরপুর স্টেডিয়ামের ইনডোরে। সেখানে গত ৬ নভেম্বর শ্রীলঙ্কার বিপক্ষে বিশ্বকাপের ম্যাচের পর আজ প্রথম ব্যাটিং অনুশীলনে নেমেছিলেন সাকিব আল হাসান।\n" +
                "\n" +
                "এর মধ্যে সাকিবের জীবনে যে বিরাট বড় বাঁকবদল ঘটেছে, তা সবারই জানা। গতকালই জাতীয় সংসদ নির্বাচনে মাগুরা–১ আসন থেকে সংসদ সদস্য নির্বাচিত হয়েছেন সাকিব। রাতেই মাগুরা থেকে রওনা দিয়ে আজই মিরপুরে হাজির এই তারকা অলরাউন্ডার। সে জন্যই সাকিবকে নতুন করে বরণ করে নেওয়ার প্রস্তুতি নিচ্ছিলেন মাঠকর্মীরা।");
        arrayList.add(hashMap);

        //2
        hashMap = new HashMap<>();
        hashMap.put("img_url", "https://images.prothomalo.com/prothomalo-bangla%2F2024-01%2F6d78d7e1-3e98-46d9-9bcf-6aeefa1cb3c4%2FWhatsApp_Image_2024_01_07_at_12_37_18_e2622abe.jpg?auto=format%2Ccompress&fmt=webp&format=webp&w=300&dpr=1.0");
        hashMap.put("cat", "Crime");
        hashMap.put("title", "বরগুনা জাল ভোট দেওয়ায় তরুণকে ৬ মাসের কারাদণ্ড");
        hashMap.put("dis", "বরগুনা সদর উপজেলার পরীরখাল মাধ্যমিক বিদ্যালয় ভোটকেন্দ্রে জাল ভোট দেওয়ার দায়ে সাবেত হোসাইন (১৮) নামের এক তরুণকে ছয় মাসের কারাদণ্ড দিয়েছেন ভ্রাম্যমাণ আদালত। আজ রোববার সকাল ১০টার দিকে ভ্রাম্যমাণ আদালতের নির্বাহী ম্যাজিস্ট্রেট আবু সালেহ মো. আরমান ভূঁইয়া এ দণ্ডাদেশ দেন। সাবেত হোসাইন পরীরখাল এলাকার বাসিন্দা সগীর হোসেনের ছেলে।\n" +
                "\n" +
                "বরগুনা সদর উপজেলা নির্বাহী কর্মকর্তা (ইউএনও) মো. শামীম মিঞা প্রথম আলোকে বলেন, সদর উপজেলার এম বালিয়াতলী ইউনিয়নের ভোটকেন্দ্র পরীরখাল মাধ্যমিক বিদ্যালয়ে জাল ভোট প্রদানের দায়ে সাবেত হোসাইনকে দণ্ডবিধি ১৮৬০–এর ১৭১ (চ) ধারা অনুযায়ী ছয় মাসের সশ্রম কারাদণ্ড দেওয়া হয়েছে। তিনি বলেন, ‘সকাল ৮টা থেকে বরগুনায় ৩৩১টি ভোটকেন্দ্রে ভোট গ্রহণ শুরু হয়। সুষ্ঠুভাবে ভোট গ্রহণ চলছে।’");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img_url", "https://images.prothomalo.com/prothomalo-bangla%2F2024-01%2F6d78d7e1-3e98-46d9-9bcf-6aeefa1cb3c4%2FWhatsApp_Image_2024_01_07_at_12_37_18_e2622abe.jpg?auto=format%2Ccompress&fmt=webp&format=webp&w=300&dpr=1.0");
        hashMap.put("cat", "Crime");
        hashMap.put("title", "বরগুনা  জাল ভোট দেওয়ায় তরুণকে ৬ মাসের কারাদণ্ড");
        hashMap.put("dis", "বরগুনা সদর উপজেলার পরীরখাল মাধ্যমিক বিদ্যালয় ভোটকেন্দ্রে জাল ভোট দেওয়ার দায়ে সাবেত হোসাইন (১৮) নামের এক তরুণকে ছয় মাসের কারাদণ্ড দিয়েছেন ভ্রাম্যমাণ আদালত। আজ রোববার সকাল ১০টার দিকে ভ্রাম্যমাণ আদালতের নির্বাহী ম্যাজিস্ট্রেট আবু সালেহ মো. আরমান ভূঁইয়া এ দণ্ডাদেশ দেন। সাবেত হোসাইন পরীরখাল এলাকার বাসিন্দা সগীর হোসেনের ছেলে।\n" +
                "\n" +
                "বরগুনা সদর উপজেলা নির্বাহী কর্মকর্তা (ইউএনও) মো. শামীম মিঞা প্রথম আলোকে বলেন, সদর উপজেলার এম বালিয়াতলী ইউনিয়নের ভোটকেন্দ্র পরীরখাল মাধ্যমিক বিদ্যালয়ে জাল ভোট প্রদানের দায়ে সাবেত হোসাইনকে দণ্ডবিধি ১৮৬০–এর ১৭১ (চ) ধারা অনুযায়ী ছয় মাসের সশ্রম কারাদণ্ড দেওয়া হয়েছে। তিনি বলেন, ‘সকাল ৮টা থেকে বরগুনায় ৩৩১টি ভোটকেন্দ্রে ভোট গ্রহণ শুরু হয়। সুষ্ঠুভাবে ভোট গ্রহণ চলছে।’");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img_url", "https://images.prothomalo.com/prothomalo-bangla%2F2024-01%2F6d78d7e1-3e98-46d9-9bcf-6aeefa1cb3c4%2FWhatsApp_Image_2024_01_07_at_12_37_18_e2622abe.jpg?auto=format%2Ccompress&fmt=webp&format=webp&w=300&dpr=1.0");
        hashMap.put("cat", "Crime");
        hashMap.put("title", "বরগুনা জাল ভোট দেওয়ায় তরুণকে ৬ মাসের কারাদণ্ড");
        hashMap.put("dis", "বরগুনা সদর উপজেলার পরীরখাল মাধ্যমিক বিদ্যালয় ভোটকেন্দ্রে জাল ভোট দেওয়ার দায়ে সাবেত হোসাইন (১৮) নামের এক তরুণকে ছয় মাসের কারাদণ্ড দিয়েছেন ভ্রাম্যমাণ আদালত। আজ রোববার সকাল ১০টার দিকে ভ্রাম্যমাণ আদালতের নির্বাহী ম্যাজিস্ট্রেট আবু সালেহ মো. আরমান ভূঁইয়া এ দণ্ডাদেশ দেন। সাবেত হোসাইন পরীরখাল এলাকার বাসিন্দা সগীর হোসেনের ছেলে।\n" +
                "\n" +
                "বরগুনা সদর উপজেলা নির্বাহী কর্মকর্তা (ইউএনও) মো. শামীম মিঞা প্রথম আলোকে বলেন, সদর উপজেলার এম বালিয়াতলী ইউনিয়নের ভোটকেন্দ্র পরীরখাল মাধ্যমিক বিদ্যালয়ে জাল ভোট প্রদানের দায়ে সাবেত হোসাইনকে দণ্ডবিধি ১৮৬০–এর ১৭১ (চ) ধারা অনুযায়ী ছয় মাসের সশ্রম কারাদণ্ড দেওয়া হয়েছে। তিনি বলেন, ‘সকাল ৮টা থেকে বরগুনায় ৩৩১টি ভোটকেন্দ্রে ভোট গ্রহণ শুরু হয়। সুষ্ঠুভাবে ভোট গ্রহণ চলছে।’");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("img_url", "https://images.prothomalo.com/prothomalo-bangla%2F2024-01%2F6d78d7e1-3e98-46d9-9bcf-6aeefa1cb3c4%2FWhatsApp_Image_2024_01_07_at_12_37_18_e2622abe.jpg?auto=format%2Ccompress&fmt=webp&format=webp&w=300&dpr=1.0");
        hashMap.put("cat", "Crime");
        hashMap.put("title", "বরগুনা জাল ভোট দেওয়ায় তরুণকে ৬ মাসের কারাদণ্ড");
        hashMap.put("dis", "বরগুনা সদর উপজেলার পরীরখাল মাধ্যমিক বিদ্যালয় ভোটকেন্দ্রে জাল ভোট দেওয়ার দায়ে সাবেত হোসাইন (১৮) নামের এক তরুণকে ছয় মাসের কারাদণ্ড দিয়েছেন ভ্রাম্যমাণ আদালত। আজ রোববার সকাল ১০টার দিকে ভ্রাম্যমাণ আদালতের নির্বাহী ম্যাজিস্ট্রেট আবু সালেহ মো. আরমান ভূঁইয়া এ দণ্ডাদেশ দেন। সাবেত হোসাইন পরীরখাল এলাকার বাসিন্দা সগীর হোসেনের ছেলে।\n" +
                "\n" +
                "বরগুনা সদর উপজেলা নির্বাহী কর্মকর্তা (ইউএনও) মো. শামীম মিঞা প্রথম আলোকে বলেন, সদর উপজেলার এম বালিয়াতলী ইউনিয়নের ভোটকেন্দ্র পরীরখাল মাধ্যমিক বিদ্যালয়ে জাল ভোট প্রদানের দায়ে সাবেত হোসাইনকে দণ্ডবিধি ১৮৬০–এর ১৭১ (চ) ধারা অনুযায়ী ছয় মাসের সশ্রম কারাদণ্ড দেওয়া হয়েছে। তিনি বলেন, ‘সকাল ৮টা থেকে বরগুনায় ৩৩১টি ভোটকেন্দ্রে ভোট গ্রহণ শুরু হয়। সুষ্ঠুভাবে ভোট গ্রহণ চলছে।’");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("img_url", "https://images.prothomalo.com/prothomalo-bangla%2F2024-01%2F6d78d7e1-3e98-46d9-9bcf-6aeefa1cb3c4%2FWhatsApp_Image_2024_01_07_at_12_37_18_e2622abe.jpg?auto=format%2Ccompress&fmt=webp&format=webp&w=300&dpr=1.0");
        hashMap.put("cat", "Crime");
        hashMap.put("title", "বরগুনা  জাল ভোট দেওয়ায় তরুণকে ৬ মাসের কারাদণ্ড");
        hashMap.put("dis", "বরগুনা সদর উপজেলার পরীরখাল মাধ্যমিক বিদ্যালয় ভোটকেন্দ্রে জাল ভোট দেওয়ার দায়ে সাবেত হোসাইন (১৮) নামের এক তরুণকে ছয় মাসের কারাদণ্ড দিয়েছেন ভ্রাম্যমাণ আদালত। আজ রোববার সকাল ১০টার দিকে ভ্রাম্যমাণ আদালতের নির্বাহী ম্যাজিস্ট্রেট আবু সালেহ মো. আরমান ভূঁইয়া এ দণ্ডাদেশ দেন। সাবেত হোসাইন পরীরখাল এলাকার বাসিন্দা সগীর হোসেনের ছেলে।\n" +
                "\n" +
                "বরগুনা সদর উপজেলা নির্বাহী কর্মকর্তা (ইউএনও) মো. শামীম মিঞা প্রথম আলোকে বলেন, সদর উপজেলার এম বালিয়াতলী ইউনিয়নের ভোটকেন্দ্র পরীরখাল মাধ্যমিক বিদ্যালয়ে জাল ভোট প্রদানের দায়ে সাবেত হোসাইনকে দণ্ডবিধি ১৮৬০–এর ১৭১ (চ) ধারা অনুযায়ী ছয় মাসের সশ্রম কারাদণ্ড দেওয়া হয়েছে। তিনি বলেন, ‘সকাল ৮টা থেকে বরগুনায় ৩৩১টি ভোটকেন্দ্রে ভোট গ্রহণ শুরু হয়। সুষ্ঠুভাবে ভোট গ্রহণ চলছে।’");
        arrayList.add(hashMap);


    }

    private void vollyhost(){

        RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
        String url = "https://devforhadul.com/myapp/myapp.php";

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        textvlloy.setText("Resone is: "+response);

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();


            }
        });

// Add the request to the RequestQueue.
        queue.add(stringRequest);

    }




//finish main class
}