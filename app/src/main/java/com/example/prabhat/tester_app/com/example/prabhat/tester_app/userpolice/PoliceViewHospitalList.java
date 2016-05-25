package com.example.prabhat.tester_app.com.example.prabhat.tester_app.userpolice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.prabhat.tester_app.R;

public class PoliceViewHospitalList extends AppCompatActivity {
    ListView mylistview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_view_hospital_list);
        String[] mylist= {"P1 - ABC Hospital(MS-3)"};
        ArrayAdapter<String> arrayadap=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mylist);
        mylistview= (ListView)findViewById(R.id.policeviewhospitallist);
        mylistview.setAdapter(arrayadap);
    }
}
