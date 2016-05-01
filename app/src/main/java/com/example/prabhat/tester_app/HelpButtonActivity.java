package com.example.prabhat.tester_app;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HelpButtonActivity extends AppCompatActivity {
    private  String content="The help notification has been sent. Please wait while the ambulance is identified";
    Button help;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_button);
        help=(Button)findViewById(R.id.help);

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(HelpButtonActivity.this,MapsActivity.class);
                startActivity(i);
                HelpNotificationMethod();
            }
        });
    }

    private void  HelpNotificationMethod()
    {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setAutoCancel(true);
        builder.setContentTitle("Help Notification Activated");
        builder.setContentText(content);
        builder.setSmallIcon(R.drawable.img1);
        Notification notif = builder.build();
        NotificationManager mgr = (NotificationManager)this.getSystemService(NOTIFICATION_SERVICE);
        mgr.notify(8,notif);

    }


}
