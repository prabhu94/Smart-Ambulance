package com.example.prabhat.tester_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class HospitalUserUpdateForm extends AppCompatActivity {
    Button update;
CheckBox checkdepA;
CheckBox checkdepB;
CheckBox checkdepC;
    int a=0;
    int b=0;
    int c=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_user_update_form);
        addListenerOnDepartment();
        addListenerOnButton();
    }

    public void addListenerOnDepartment(){
        checkdepA = (CheckBox) findViewById(R.id.checkBox1);
        checkdepA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox) v).isChecked()){
                   Toast.makeText(HospitalUserUpdateForm.this,"department A is ready",Toast.LENGTH_LONG).show();
                }
            }
        });
        checkdepB = (CheckBox) findViewById(R.id.checkBox);
        checkdepB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox) v).isChecked()){
                    Toast.makeText(HospitalUserUpdateForm.this,"department B is ready",Toast.LENGTH_LONG).show();
                }
            }
        });
        checkdepC = (CheckBox) findViewById(R.id.checkBox2);
        checkdepC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox) v).isChecked()){
                    Toast.makeText(HospitalUserUpdateForm.this,"department C is ready",Toast.LENGTH_LONG).show();
                }
            }
        });
           }
    public  void addListenerOnButton(){
        checkdepA=(CheckBox)findViewById(R.id.checkBox1);
        checkdepB = (CheckBox) findViewById(R.id.checkBox);
        checkdepC = (CheckBox) findViewById(R.id.checkBox2);

        update= (Button) findViewById(R.id.update);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result= new StringBuffer();
                result.append("Department A check: ").append(checkdepA.isChecked());
                result.append("Department B check: ").append(checkdepB.isChecked());
                result.append("Department C check: ").append(checkdepB.isChecked());

                Toast.makeText(HospitalUserUpdateForm.this,result,Toast.LENGTH_LONG).show();

           }
        });
    }
}
