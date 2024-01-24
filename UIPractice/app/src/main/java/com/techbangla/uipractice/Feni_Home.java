package com.techbangla.uipractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class Feni_Home extends AppCompatActivity {

    ImageSlider image_slider;
    GridView gridView;
    TextView marqueeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feni_home);

        gridView = findViewById(R.id.gridView);
        marqueeText = findViewById(R.id.marqueeText);
        image_slider =  findViewById(R.id.image_slider);

        //==============================


        marqueeText.setSelected(true);

        imgSlider();



        myAdapter myAdapter = new myAdapter();
        gridView.setAdapter(myAdapter);

    }
    /*finish on create*/

    private void imgSlider(){

        ArrayList<SlideModel> imageList = new ArrayList<>();
        //imageList.add(new SlideModel(R.drawable.slide_1, null));
        imageList.add(new SlideModel(R.drawable.img_slider1, "Royel Distric Feni", null));
        imageList.add(new SlideModel(R.drawable.img_slider1, "Digital Feni", null));
        imageList.add(new SlideModel(R.drawable.img_slider1, "Our Feni", null));
        image_slider.setImageList(imageList, ScaleTypes.CENTER_CROP);

    }

    private class myAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return 30;
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

            LayoutInflater layInflate  = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View myView = layInflate.inflate(R.layout.item_feni, parent, false );



            return myView;
        }
    }






}