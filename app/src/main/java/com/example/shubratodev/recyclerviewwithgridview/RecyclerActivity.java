package com.example.shubratodev.recyclerviewwithgridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.shubratodev.recyclerviewwithgridview.adapter.MyAdapter;

public class RecyclerActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    GridLayoutManager layoutManager;

    private String nameList[]=
            {
                    "Protom Alo", "Somokal",
                    "Somoy", "Janakontho",
                    "Daily Star", "BBC Bangla",
                    "BD News 24", "BD News"
            };

    private int iconId[]=
            {
              R.drawable.prothomalo, R.drawable.somokal,
                    R.drawable.somoy, R.drawable.ejanakantha,
                    R.drawable.dailystar, R.drawable.bbcbangla,
                    R.drawable.bdnews, R.drawable.bngnews
            };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        recyclerView =findViewById(R.id.recycler_id);
        layoutManager =new GridLayoutManager(RecyclerActivity.this,2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        MyAdapter myAdapter = new MyAdapter(RecyclerActivity.this,iconId,nameList);
        recyclerView.setAdapter(myAdapter);

    }
}
