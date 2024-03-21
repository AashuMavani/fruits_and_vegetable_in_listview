package com.example.fruits_and_vegetable_in_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail_activity extends AppCompatActivity {
    ImageView image;
    TextView txt1,txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        image=findViewById(R.id.image);
        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);

        int position=getIntent().getIntExtra("position",0);
        String [] name=getIntent().getStringArrayExtra("namearr");
        String[] subtitle=getIntent().getStringArrayExtra("subtitle");
        int [] img=getIntent().getIntArrayExtra("imgarr");

         image.setImageResource(img[position]);
         txt1.setText(name[position]);
         txt2.setText(subtitle[position]);
    }
}