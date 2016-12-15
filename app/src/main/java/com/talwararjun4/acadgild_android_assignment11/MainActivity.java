package com.talwararjun4.acadgild_android_assignment11;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    Button loginButton = null;
    EditText editText = null;
    EditText editPwd = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginButton = (Button)findViewById(R.id.button);
        editText =(EditText)findViewById(R.id.editText);

        editPwd =(EditText)findViewById(R.id.editPwd);

    }

    public void onButtonClick(View view) {

        String username = editText.getText().toString();
        String password = editPwd.getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("Username", username);
        bundle.putString("Password",password);
        Intent welcomePage = new Intent(getApplicationContext(),WelcomePage.class);
        welcomePage.putExtras(bundle);
        startActivity(welcomePage);
    }


}
