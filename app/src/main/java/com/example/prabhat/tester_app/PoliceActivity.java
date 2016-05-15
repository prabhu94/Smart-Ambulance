package com.example.prabhat.tester_app;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PoliceActivity extends AppCompatActivity {
    Button clearroad;
    Button viewcaselist;
    Button viewhospitallist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police);
        viewcaselist=(Button)findViewById(R.id.viewcaselist);
        viewcaselist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PoliceActivity.this,PoliceCaseList.class);
                startActivity(i);
            }
        });
        viewhospitallist=(Button)findViewById(R.id.viewhospitallist);
        viewhospitallist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PoliceActivity.this,PoliceViewHospitalList.class);
                startActivity(i);
            }
        });
        clearroad=(Button)findViewById(R.id.clearroad);
        clearroad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PoliceActivity.this,"Implementation to be decided",Toast.LENGTH_LONG).show();
            }
        });

    }
    private void  PoliceNotificationService()
    {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setAutoCancel(true);
        builder.setContentTitle("AMBULANCE APPROACHING !!!");
        builder.setContentText("Distance from the ambulance : 3km\n" + "Expected time of arrival : 5 minutes" );
        builder.setSmallIcon(R.drawable.img1);
        Notification notif = builder.build();
        NotificationManager mgr = (NotificationManager)this.getSystemService(NOTIFICATION_SERVICE);
        mgr.notify(8,notif);
    }
}
