package com.example.prabhat.tester_app.com.example.prabhat.tester_app.userambulance;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.prabhat.tester_app.R;

public class AmbulanceUser extends AppCompatActivity {
    Button caseevaluation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulance_user);
        CaseNotification();
        caseevaluation=(Button)findViewById(R.id.caseevaluation);

        caseevaluation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(AmbulanceUser.this,CaseEvaluationActivity.class);
                startActivity(i);
            }
        });


    }

    private void CaseNotification() {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setAutoCancel(true);
        builder.setContentTitle("Case Notified");
        builder.setContentText("Case route identified \n Case Distance: 2km \n Case ETA : 3 minutes");
        builder.setSmallIcon(R.drawable.img1);
        Notification notif = builder.build();
        NotificationManager mgr = (NotificationManager) this.getSystemService(NOTIFICATION_SERVICE);
        mgr.notify(8, notif);

    }
}
