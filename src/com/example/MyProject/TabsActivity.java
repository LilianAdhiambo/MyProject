package com.example.MyProject;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by lilian on 8/20/14.
 */
public class TabsActivity extends TabActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabs);

        TabHost tabhost=getTabHost();
        Resources resources=getResources();

        Intent chatActivity=new Intent().setClass(getApplicationContext(),Chat.class);
        TabHost.TabSpec chattabspec=tabhost.newTabSpec("chat").setIndicator("chat",resources.getDrawable(R.drawable.ic_launcher))
                .setContent(chatActivity);

        Intent friendsActivity=new Intent().setClass(getApplicationContext(),Friends.class);
        TabHost.TabSpec friendtabspec=tabhost.newTabSpec("friends").setIndicator("friends",resources.getDrawable(R.drawable.ic_launcher))
                .setContent(friendsActivity);

        Intent roomsActivity=new Intent().setClass(getApplicationContext(),Friends.class);
        TabHost.TabSpec roomstabspec=tabhost.newTabSpec("friends").setIndicator("friends",resources.getDrawable(R.drawable.ic_launcher))
                .setContent(roomsActivity);


    }
}