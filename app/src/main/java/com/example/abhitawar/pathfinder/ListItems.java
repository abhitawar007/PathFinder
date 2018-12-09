package com.example.abhitawar.pathfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ListItems extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_items);

//        Window window = getWindow();
        setTitle("All Items");

        listView = (ListView)findViewById(R.id.listview);

        InputStream ip = getResources().openRawResource(R.raw.entries);
        Parser parser = new Parser(ip);
        final List<Item> items = parser.read();

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,items);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent itemIntent = new Intent(view.getContext(), ItemDetails.class);
                itemIntent.putExtra("serialized_item", items.get(position));
                startActivity(itemIntent);
                Toast.makeText(ListItems.this, "Clicked item: " + position + " " + items.get(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
