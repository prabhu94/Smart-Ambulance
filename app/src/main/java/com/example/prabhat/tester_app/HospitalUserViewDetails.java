package com.example.prabhat.tester_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HospitalUserViewDetails extends AppCompatActivity {
    ListView mylistview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_user_view_details);
        String[] mylist= {"ABC Hospital","123 Hospital Station, Hyderabad-62", "Multi-Speciality Hospital", "MS-3"};
        ArrayAdapter<String> arrayadap=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mylist);
        mylistview= (ListView)findViewById(R.id.mylistview);
        mylistview.setAdapter(arrayadap);
    }
}
