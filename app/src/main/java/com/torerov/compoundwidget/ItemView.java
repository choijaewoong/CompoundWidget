package com.torerov.compoundwidget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Tacademy on 2015-10-05.
 */
public class ItemView extends FrameLayout {
    public ItemView(Context context) {
        super(context);
        init();
    }

    public ItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    ImageView iconView;
    TextView titleView, descView;
    ItemData mData;

    private void init(){
        //레이아웃 설계도로부터(XML) 뷰를 만듬. => LayoutInflater
        //FrameLayout 안에 view_item을 child로 넣음.
        //inflate(getContext(), R.layout.view_item, this);
        LayoutInflater.from(getContext()).inflate(R.layout.view_item, this);
        iconView = (ImageView)findViewById(R.id.imageView);
        titleView = (TextView)findViewById(R.id.text_1);
        descView = (TextView)findViewById(R.id.text_2);
    }
    public void setItemData(ItemData data){
        mData = data;
        if(data.icon != null){
            iconView.setImageDrawable(data.icon);
        }
        titleView.setText(data.title);
        descView.setText(data.desc);

    }
}
