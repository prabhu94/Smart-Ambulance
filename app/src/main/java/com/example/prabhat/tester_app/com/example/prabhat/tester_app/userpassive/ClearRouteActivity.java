package com.example.prabhat.tester_app.com.example.prabhat.tester_app.userpassive;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.prabhat.tester_app.ClearRouteMap;
import com.example.prabhat.tester_app.R;

public class ClearRouteActivity extends AppCompatActivity {
    private  String content="The clear route notification has been sent.";
    Button clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clear_route);
        clear=(Button)findViewById(R.id.clear);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ClearRouteActivity.this,ClearRouteMap.class);
                startActivity(i);
                ClearNotificationMethod();
            }
        });
    }

    private void  ClearNotificationMethod()
    {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setAutoCancel(true);
        builder.setContentTitle("Clear Notification Activated");
        builder.setContentText(content);
        builder.setSmallIcon(R.drawable.img1);
        Notification notif = builder.build();
        NotificationManager mgr = (NotificationManager)this.getSystemService(NOTIFICATION_SERVICE);
        mgr.notify(8,notif);

    }


}
