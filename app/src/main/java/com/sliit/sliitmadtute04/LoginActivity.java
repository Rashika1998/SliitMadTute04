package com.sliit.sliitmadtute04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.sliit.sliitmadtute04.Database.DBHelper;

public class LoginActivity extends AppCompatActivity
{

    private EditText username;
    private EditText password;
    private Button SelectAll , Add , Delete , SignIn , Update;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);

        SelectAll = (Button) findViewById(R.id.select_all);
        Add = (Button) findViewById(R.id.add);
        Delete = (Button) findViewById(R.id.delete);
        SignIn = (Button) findViewById(R.id.sign_in);
        Update = (Button) findViewById(R.id.update);


        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

            }
        });
    }
}
