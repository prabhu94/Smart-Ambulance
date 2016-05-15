package com.example.prabhat.tester_app;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HospitalUserActivity extends AppCompatActivity {
    Button viewdetails;
    Button updatedetails;
    Button listedcases;
    Button logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_user);
        HospitalUseronCreate();
        viewdetails= (Button)findViewById(R.id.viewdetails);
        viewdetails.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HospitalUserActivity.this,HospitalUserViewDetails.class);
                HospitalUserActivity.this.startActivity(i);
                HospitalnotificationService();
            }
        });
        updatedetails= (Button)findViewById(R.id.updatedetails);
        updatedetails.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HospitalUserActivity.this,HospitalUserUpdateForm.class);
                HospitalUserActivity.this.startActivity(i);
                HospitalnotificationService();
            }
        });
        listedcases= (Button)findViewById(R.id.listedcases);
        listedcases.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HospitalUserActivity.this,ListedCasesActivity.class);
                HospitalUserActivity.this.startActivity(i);
                HospitalnotificationService();
            }
        });
        logout= (Button)findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HospitalUserActivity.this,LoginPage.class);
                HospitalUserActivity.this.startActivity(i);
            }
        });
    }



    private void  HospitalnotificationService(){
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setAutoCancel(true);
        builder.setContentTitle("Button Clicked");
        builder.setContentText("button Clicked" );
        builder.setSmallIcon(R.drawable.img1);
        Notification notif = builder.build();
        NotificationManager mgr = (NotificationManager)this.getSystemService(NOTIFICATION_SERVICE);
        mgr.notify(8,notif);
    }
    private void  HospitalUseronCreate(){
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setAutoCancel(true);
        builder.setContentTitle("Ambulance in 15 minutes");
        builder.setContentText("Request to be ready" );
        builder.setSmallIcon(R.drawable.img1);
        Notification notif = builder.build();
        NotificationManager mgr = (NotificationManager)this.getSystemService(NOTIFICATION_SERVICE);
        mgr.notify(8,notif);
    }
}
