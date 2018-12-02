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


    //ListView lv = (ListView) findViewById(R.id.listview);
    //ArrayList<String> arrayList = new ArrayList<String>();
    //int taskNumber = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView lv = (ListView) findViewById(R.id.listview);
        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayAdapter AA = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);

        arrayList.add("Study Science");
        arrayList.add("Learn to Play the Piano");
        arrayList.add("Read new book");

        lv.setAdapter(AA);

        /*Button button = findViewById(R.id.add_task_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //arrayList.add("Task" + taskNumber.toString());
                //taskNumber++;
                //lv.setAdapter(AA);
            }
        });*/


        //ArrayAdapter AA = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);

    }


    //public void addTask(View view){
        //ArrayAdapter AA = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);

        //arrayList.add("Task" + taskNumber);
        //taskNumber++;
        //lv.setAdapter(AA);
    //}


}
