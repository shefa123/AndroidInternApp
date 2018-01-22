package com.shefali.assignmentapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        //Make the drawer full screen
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        DrawerLayout.LayoutParams params = (DrawerLayout.LayoutParams) navigationView.getLayoutParams();
        params.width = metrics.widthPixels;
        navigationView.setLayoutParams(params);

        //hide statusbar
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Get navigation widgets
        LinearLayout logout = navigationView.findViewById(R.id.logout);
        ImageView close = navigationView.findViewById(R.id.imageView2);

        LinearLayout feed = navigationView.findViewById(R.id.feed);
        LinearLayout list = navigationView.findViewById(R.id.list);
        LinearLayout gallery = navigationView.findViewById(R.id.gallery);
        LinearLayout timeline = navigationView.findViewById(R.id.timeline);
        LinearLayout compose = navigationView.findViewById(R.id.compose);
        LinearLayout capture = navigationView.findViewById(R.id.capture);
        LinearLayout profile = navigationView.findViewById(R.id.profile);
        LinearLayout stats = navigationView.findViewById(R.id.stats);
        LinearLayout settings = navigationView.findViewById(R.id.settings);
        LinearLayout discover = navigationView.findViewById(R.id.discover);

        //set click listeners
        logout.setOnClickListener(this);
        close.setOnClickListener(this);
        feed.setOnClickListener(this);
        list.setOnClickListener(this);
        gallery.setOnClickListener(this);
        timeline.setOnClickListener(this);
        compose.setOnClickListener(this);
        capture.setOnClickListener(this);
        profile.setOnClickListener(this);
        stats.setOnClickListener(this);
        settings.setOnClickListener(this);
        discover.setOnClickListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.logout:
                finish();
                break;
            case R.id.imageView2:
                onBackPressed();
                break;
            case R.id.feed:
                onBackPressed();
                Toast.makeText(MainActivity.this, "Feed clicked.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.list:
                onBackPressed();
                Toast.makeText(MainActivity.this, "List clicked.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.gallery:
                onBackPressed();
                Toast.makeText(MainActivity.this, "Gallery clicked.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.timeline:
                onBackPressed();
                Toast.makeText(MainActivity.this, "Timeline clicked.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.compose:
                onBackPressed();
                Toast.makeText(MainActivity.this, "Compose clicked.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.capture:
                onBackPressed();
                Toast.makeText(MainActivity.this, "Capture clicked.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.profile:
                onBackPressed();
                Toast.makeText(MainActivity.this, "Profile clicked.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.stats:
                onBackPressed();
                Toast.makeText(MainActivity.this, "Stats clicked.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.settings:
                onBackPressed();
                Toast.makeText(MainActivity.this, "Settings clicked.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.discover:
                onBackPressed();
                Toast.makeText(MainActivity.this, "Discover clicked.", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
