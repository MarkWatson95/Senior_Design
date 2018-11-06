package com.example.mark.senior_design;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lv = (ListView) findViewById(R.id.listview);

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("android");
        arrayList.add("Study Science");
        arrayList.add("Learn to Play the Piano");
        arrayList.add("Read new book");


        ArrayAdapter AA = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);

        lv.setAdapter(AA);
    }


}
