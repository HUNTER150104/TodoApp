package com.example.todoapp;

import android.app.Application;

import com.example.todoapp.utils.Prefs;

import java.util.Properties;

public class App extends Application {

    public static Properties prefs;

    @Override
    public void onCreate() {
        super.onCreate();
        new Prefs(this);
    }
}
