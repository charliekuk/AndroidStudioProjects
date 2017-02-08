package com.example.chaominggu.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();//在不同的活动之间传递数据时使用
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);//display the string passed here, can't be edited
        textView.setTextSize(40);//set up size
        textView.setText(message);//set up the content

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        //make the layout as an instance
        layout.addView(textView);//add the text into the layout
    }
}
