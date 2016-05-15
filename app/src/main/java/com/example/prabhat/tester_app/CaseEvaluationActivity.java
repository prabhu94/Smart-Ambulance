package com.example.prabhat.tester_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CaseEvaluationActivity extends AppCompatActivity {
    Button sendreport;
    Button getroute;
    CheckBox head;
    CheckBox rightarm;
    CheckBox rightleg;
    CheckBox leftleg;
    CheckBox leftarm;
    CheckBox tabdo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case_evaluation);
    addListenerOnSendReport();
        addListenerOngetRoute();
    }
    public  void addListenerOnSendReport(){
        head= (CheckBox)findViewById(R.id.head);
        rightarm= (CheckBox)findViewById(R.id.rightarm);
        rightleg= (CheckBox)findViewById(R.id.rightleg);
        leftarm= (CheckBox)findViewById(R.id.leftarm);
        leftleg= (CheckBox)findViewById(R.id.leftleg);
        tabdo= (CheckBox)findViewById(R.id.tabdo);


        sendreport= (Button) findViewById(R.id.sendreport);
        sendreport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result= new StringBuffer();
                result.append("Head Value : ").append(head.isChecked());
                result.append("Right arm Value : ").append(rightarm.isChecked());
                result.append("Right leg Value : ").append(rightleg.isChecked());
                result.append("Left leg Value : ").append(leftleg.isChecked());
                result.append("Left arm Value : ").append(leftarm.isChecked());
                result.append("Torso/abdomen Value : ").append(tabdo.isChecked());

                Toast.makeText(CaseEvaluationActivity.this,result,Toast.LENGTH_LONG).show();

            }
        });
    }
    public  void addListenerOngetRoute(){


        getroute= (Button) findViewById(R.id.getroute);
        getroute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CaseEvaluationActivity.this,GetRouteToPatientMap.class);
                startActivity(i);

            }
        });
    }
}
