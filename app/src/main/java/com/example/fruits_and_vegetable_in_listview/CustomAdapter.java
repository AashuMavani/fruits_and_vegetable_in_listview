package com.example.fruits_and_vegetable_in_listview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Listview_activity listview_activity;
   int[]img;
   String[]name;
    String[] subname;
   public CustomAdapter(Listview_activity listview_activity,int[] img,String[]name,String[]subname){
               this.listview_activity=listview_activity;
               this.img=img;
               this.name=name;
               this.subname=subname;
   }



    @Override
    public int getCount() {
        return img.length;
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
    public View getView(int position, View view, ViewGroup parent) {
       view= LayoutInflater.from(listview_activity).inflate(R.layout.item_list_layout,parent,false);
        ImageView image=view.findViewById(R.id.img);
        TextView txt1=view.findViewById(R.id.t1);
        TextView txt2=view.findViewById(R.id.t2);

        image.setImageResource(img[position]);
        txt1.setText(""+name[position]);
        txt2.setText(""+subname[position]);
        return view;
    }
}
