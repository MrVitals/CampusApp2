package com.example.campusapp.Campus_App.Logic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.campusapp.R;

public class MainActivity extends AppCompatActivity {

    public void switchToAddEvent(){
        Intent switchToAddEvent = new Intent(MainActivity.this, AddEvent.class);
        startActivity(switchToAddEvent);

    }
    public void switchToEvents(){
        Intent switchToEvents = new Intent(MainActivity.this, Events.class);
        startActivity(switchToEvents);

    }
    public void switchToRoomChecker(){
        Intent switchToRoomChecker = new Intent(MainActivity.this, RoomChecker.class);
        startActivity(switchToRoomChecker);

    }
    public void switchToRoomFinder(){
        Intent switchToRoomFinder = new Intent(MainActivity.this, RoomFinder.class);
        startActivity(switchToRoomFinder);

    }

    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.main_menu, menu);

        return true;

    }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.RoomCheckerLayout_ID: switchToRoomChecker();
                break;

            case R.id.RoomFinderLayout_ID: switchToRoomFinder();
                break;

            case R.id.EventsLayout_ID: switchToEvents();

                break;
            case R.id.AddEvent_ID: switchToAddEvent();
                break;

        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }




}
