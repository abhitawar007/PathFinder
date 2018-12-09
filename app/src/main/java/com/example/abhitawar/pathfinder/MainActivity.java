package com.example.abhitawar.pathfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked_allItems(View v)
    {
        try
        {
            System.out.println("allItems button clicked!");

            Intent myIntent = new Intent(v.getContext(), ListItems.class);
            startActivityForResult(myIntent, 0);
        }
        catch (RuntimeException ex)
        {
            throw new RuntimeException("File not found! " + ex);
        }
    }

}
