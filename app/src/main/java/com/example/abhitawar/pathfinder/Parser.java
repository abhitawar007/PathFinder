package com.example.abhitawar.pathfinder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Parser
{
    InputStream inputStream;
    public Parser(InputStream inputStream)
    {
        this.inputStream = inputStream;
    }

    public List<Item> read()
    {
        List<Item> items = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        try
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                String[] row = line.split("\\|");
                Item item = new Item(row[0], row[1], Integer.parseInt(row[2]), Double.parseDouble(row[3]), row[4], row[5]);
                items.add(item);
            }
        }
        catch (IOException ex)
        {
            throw new RuntimeException("Error in reading file " + ex);
        }

        finally
        {
            try
            {
                inputStream.close();
            }
            catch (IOException ex)
            {
                throw new RuntimeException("Error while closing the file " + ex);
            }
        }

        return items;

    }

}



