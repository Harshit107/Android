package com.harshit.firstapp;

import androidx.annotation.LongDef;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "xyz";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //finding Id
        EditText emailEt =  findViewById(R.id.email_id_et);
        TextView emailTv =  findViewById(R.id.email_id_tv);
        Button button =     findViewById(R.id.button);
//

        //onClick through button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //when we click button
                String userEmail = emailEt.getText().toString();
                Log.d(TAG,userEmail);
                emailTv.setText(userEmail);

            }
        });

    }


    //life cycle
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"At On start");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"At On resume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"At On pause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"At On stop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"At On Destroy");

    }
}