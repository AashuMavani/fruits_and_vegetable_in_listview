package com.example.fruits_and_vegetable_in_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Listview_activity extends AppCompatActivity {
    ListView listView;
    int[] imgf = {R.drawable.banana, R.drawable.cherry, R.drawable.dregun, R.drawable.gavava,
            R.drawable.kiwi, R.drawable.lichi, R.drawable.mango, R.drawable.pich, R.drawable.strawberry, R.drawable.grapes};
    String[] namef = {"Banana", "Cherry", "Dregon", "Gavava", "Kiwi", "Lichi", "Mango", "Pich", "Srawberry", "Grapes"};
    String[] subtitlef = {"Banana", "Cherry", "Dregon", "Gavava", "Kiwi", "Lichi", "Mango", "Pich", "Srawberry", "Grapes"};

    int[] imgveg = {R.drawable.bangun, R.drawable.bhindi, R.drawable.tmatur, R.drawable.potato, R.drawable.carrot,
            R.drawable.peas, R.drawable.capsicum, R.drawable.beetroot, R.drawable.corn, R.drawable.cabbege};
    String[] nameveg = {"Bangun", "Bhindi", "Tmatur", "Potato", "Carrot", "Peas", "Capsicum", "Beetroot", "Corn", "Cabbege"};
    String[] subtitleveg = {"Bangun", "Bhindi", "Tmatur", "Potato", "Carrot", "Peas", "Capsicum", "Beetroot", "Corn", "Cabbege"};
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listView=findViewById(R.id.listview);


        String item = getIntent().getStringExtra("item");
        if (item.equals("fruit")) {
            adapter = new CustomAdapter(Listview_activity.this,imgf,namef,subtitlef);
        } else {
            adapter = new CustomAdapter(Listview_activity.this, imgveg, nameveg, subtitleveg);
        }
          listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(Listview_activity.this, Detail_activity.class);
                if (item.equals("fruit")) {
                    intent.putExtra("position", position);
                    intent.putExtra("imgarr", imgf);
                    intent.putExtra("namearr", namef);
                    intent.putExtra("subtitle", subtitlef);

                } else {
                    intent.putExtra("position", position);
                    intent.putExtra("imgarr", imgveg);
                    intent.putExtra("namearr", nameveg);
                    intent.putExtra("subtitle", subtitleveg);

                }
                startActivity(intent);
            }
        });
    }
}