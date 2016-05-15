package com.example.prabhat.tester_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PoliceCaseList extends AppCompatActivity {
    ListView mylistview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_case_list);
        String[] mylist= {"C/1001/123/A/P1","C/1002/123/A/P1"," C/1003/123/A/P1","C/1004/123/A/P1", "C/1005/123/A/P1"};
        ArrayAdapter<String> arrayadap=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mylist);
        mylistview= (ListView)findViewById(R.id.policecaselist);
        mylistview.setAdapter(arrayadap);
    }
}
