package com.example.mark.senior_design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> arrayList;
    private ArrayAdapter<String> AA;
    private int taskNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        taskNumber = 0;


        ListView lv = (ListView) findViewById(R.id.listview);
        arrayList = new ArrayList<String>();
        AA = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        lv.setAdapter(AA);

        arrayList.add("Study Science");
        arrayList.add("Learn to Play the Piano");
        arrayList.add("Read new book");



        Button button = findViewById(R.id.add_task_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                arrayList.add("Task" + taskNumber);
                taskNumber++;
                AA.notifyDataSetChanged();
            }
        });


    }



}
