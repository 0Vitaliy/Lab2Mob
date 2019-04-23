package com.example.makovskyi41pilab02;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



public class MainTwoActivity extends AppCompatActivity {
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView.findViewById(R.id.textView);
//

        Intent intent =getIntent();
        String message= intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        textView.setText(message);
    }





//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        if (data == null) {return;}
//        String name = data.getStringExtra("FILES_LIST");
//        qwe.setText("Your name is " + name);
//    }
}
