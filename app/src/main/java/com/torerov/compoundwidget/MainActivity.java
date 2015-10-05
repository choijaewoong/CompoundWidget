package com.torerov.compoundwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ItemView myView;
    ItemView myView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myView = (ItemView)findViewById(R.id.item_my);
        ItemData data = new ItemData();
        data.icon = getResources().getDrawable(R.drawable.lion);
        data.title="title";
        data.desc = "desc";
        myView.setItemData(data);

        myView2 = (ItemView)findViewById(R.id.item_my2);
        data = new ItemData();
        data.icon = getResources().getDrawable(R.drawable.lion);
        data.title="title";
        data.desc = "desc";
        myView2.setItemData(data);
    }
}
