package com.example.draft;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

public class Aunteficator {
    SharedPreferences sharedPreferences;
    int line;
    public Aunteficator(Context context){
        sharedPreferences = context.getSharedPreferences("settings", Context.MODE_PRIVATE);
        line = sharedPreferences.getInt("User", 0);
    }

    public void authIN(){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("User", 1);
        editor.apply();
    }

    public void authON(){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("User", 0);
        editor.apply();
    }
}
