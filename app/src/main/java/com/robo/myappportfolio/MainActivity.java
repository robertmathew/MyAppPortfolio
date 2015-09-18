package com.robo.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View v){
        switch(v.getId()){
            case R.id.btnSpotify:
                Toast.makeText(MainActivity.this, "This button will be launching Spotify Streamer", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnSuperDuo1:
                Toast.makeText(MainActivity.this, "This button will be launching Football Scores App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnSuperduo2:
                Toast.makeText(MainActivity.this, "This button will be launching Library App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnBigger:
                Toast.makeText(MainActivity.this, "This button will be launching Build It Bigger", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnXyzReader:
                Toast.makeText(MainActivity.this, "This button will be launching XYZ Reader", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnCapstone:
                Toast.makeText(MainActivity.this, "This button will be launching Capstone", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
