package com.sliit.sliitmadtute04;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.sliit.sliitmadtute04.Database.DBHelper;


public class MainActivity extends AppCompatActivity
{
    DBHelper mDatabaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDatabaseHelper = new DBHelper(this);
        mDatabaseHelper.readAllInfo();

    }

}
