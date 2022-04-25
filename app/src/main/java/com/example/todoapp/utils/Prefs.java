package com.example.todoapp.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;

public class Prefs {
    private static Prefs prefs;
    private SharedPreferences preferences;

    public Prefs(Context context) {
        prefs = this;
        preferences = context.getSharedPreferences("Billy", Context.MODE_PRIVATE);
    }

    public static Prefs getInstance() {
        return prefs;
    }

    public void saveImage(Uri uri) {
        preferences.edit().putString("image", uri.toString()).apply();
    }

    public String getImage() {
        return preferences.getString("image", "");
    }

}
