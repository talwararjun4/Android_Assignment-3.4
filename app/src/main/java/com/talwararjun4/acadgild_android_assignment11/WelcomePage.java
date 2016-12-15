package com.talwararjun4.acadgild_android_assignment11;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by artalwar on 12/15/2016.
 */

public class WelcomePage extends AppCompatActivity {

    TextView textView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page);
        textView =(TextView)findViewById(R.id.tview);

        Bundle bundle = getIntent().getExtras();
        if(bundle.getString("Password").equalsIgnoreCase("ARJUN123")){
            textView.setText(textView.getText().toString() +bundle.getString("Username"));
        }
        else{
            textView.setText("Invalid Password Entered.");
        }


    }
}
