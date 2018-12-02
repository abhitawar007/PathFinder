package com.example.abhitawar.pathfinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

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
            System.out.println("@@@ allItems button clicked!");
            InputStream ip = getResources().openRawResource(R.raw.entries);
            Parser parser = new Parser(ip);
            List<Item> items = parser.read();
            for (Item item: items)
            {
                System.out.println(item.getBrand());
                System.out.println(item.getName());
                System.out.println(item.getId());
                System.out.println(item.getPrice());
                System.out.println(item.getStore());
                System.out.println(item.getLocation());
                System.out.println("------------");
            }
        }
        catch (RuntimeException ex)
        {
            throw new RuntimeException("File not found! " + ex);
        }
    }

}
