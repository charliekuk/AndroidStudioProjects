package com.example.chaominggu.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    //the first argument of .putExtra must be set as the name of this package being prefix
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        //实例化一个intent，第一个参量为context（this表示activity类是context的子类；第二个参量为要跳转到的活动）
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        //.getText()get the content user entered; .toSting()convert the content to string.
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);//start next activity
    }
}
