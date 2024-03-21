package com.example.fruits_and_vegetable_in_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgfruit,imgveg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.imgfruit).setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity.this,Listview_activity.class);
            intent.putExtra("item","fruit");
            startActivity(intent);
        });
        findViewById(R.id.imgveg).setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity.this,Listview_activity.class);
            intent.putExtra("item","veg");
            startActivity(intent);
        });
    }
}