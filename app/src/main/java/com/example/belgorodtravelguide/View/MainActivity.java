package com.example.belgorodtravelguide.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import com.example.belgorodtravelguide.R;
import com.example.belgorodtravelguide.View.Shop.ShopSportFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {

    private static final String APP_PREFERENCES = "points_user";
    private static int points;
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView);
        NavController navController = navHostFragment.getNavController();
        NavigationUI.setupWithNavController(bottomNavigationView, navController);

        prefs =getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);


    }


    protected void onResume() {
        super.onResume();

        if (prefs.contains(APP_PREFERENCES)) {
            points = prefs.getInt(APP_PREFERENCES, 0);

        }
    }

    protected void onPause() {
        super.onPause();

            SharedPreferences.Editor editor =  prefs.edit();
            editor.putInt(APP_PREFERENCES,points).apply();
    }

    public void summpoint(){
        points+=100;
    }
    public static int getpoint(){
        return points;
    }

    public static void setpoint(int i){
        points-=i;
    }

    public static void sumpoint(){
        points+=300;


    }


}