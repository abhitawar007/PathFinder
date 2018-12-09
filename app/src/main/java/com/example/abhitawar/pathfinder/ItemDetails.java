package com.example.abhitawar.pathfinder;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class ItemDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_details);
//        Window window = getWindow();
        setTitle("Item Details");
        Item item = (Item) getIntent().getSerializableExtra("serialized_item");

        // Show in table view

        TableLayout table = (TableLayout)findViewById(R.id.detailsLayout);
//        table.removeAllViewsInLayout();

        TextView brandValue = (TextView)findViewById(R.id.brandValue);
        brandValue.setText(item.getBrand());

        TextView nameValue = (TextView)findViewById(R.id.nameValue);
        nameValue.setText(item.getName());

        TextView priceValue = (TextView)findViewById(R.id.priceValue);
        priceValue.setText("$" + Double.toString(item.getPrice()));

        TextView storeValue = (TextView)findViewById(R.id.storeValue);
        storeValue.setText(item.getStore());

        TextView locationValue = (TextView)findViewById(R.id.locationValue);
        locationValue.setText(item.getLocation());
    }
}
