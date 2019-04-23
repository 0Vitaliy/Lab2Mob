package com.example.makovskyi41pilab02;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText editText;
    public static final String EXTRA_MESSAGE = "FILES_LIST";
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);
    }
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, MainTwoActivity.class);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);




//        Intent intent = new Intent(Intent.ACTION_SEND);
//        String msg = editText.getText().toString();
//        intent.setType("text/plain");
//        intent.putExtra(intent.EXTRA_TEXT,msg);
//        startActivity(Intent.createChooser(intent, "Send mail..."));
//        Uri uri = Uri.parse("http://fi.npu.edu.ua");
//        Intent openLink = new Intent(Intent.ACTION_VIEW, uri);
//        startActivity(openLink);



//


    }
}
