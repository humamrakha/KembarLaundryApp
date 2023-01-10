package com.example.kembarlaundryapp;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.kembarlaundryapp.User.User;

public class SharedPrefManager {
    private static final String PREFERENCE_NAME = "login_preferences";
    private static final String KEY_USERNAME = "username";
    private static final String KEY_PASSWORD = "password";
    private static final String KEY_USER_LEVEL = "user_level";

    private static SharedPrefManager sInstance;
    private final SharedPreferences mPreferences;

    private SharedPrefManager(Context context) {
        mPreferences = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
    }

    public static SharedPrefManager getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new SharedPrefManager(context);
        }
        return sInstance;
    }

    public void saveLoginDetails(String username, String password, String userLevel) {
        SharedPreferences.Editor editor = mPreferences.edit();
        editor.putString(KEY_USERNAME, username);
        editor.putString(KEY_PASSWORD, password);
        editor.putString(KEY_USER_LEVEL, userLevel);
        editor.apply();
    }

    public String getUsername() {
        return mPreferences.getString(KEY_USERNAME, null);
    }

    public String getPassword() {
        return mPreferences.getString(KEY_PASSWORD, null);
    }

    public String getUserLevel() {
        return mPreferences.getString(KEY_USER_LEVEL, null);
    }

    public void clearLoginDetails() {
        SharedPreferences.Editor editor = mPreferences.edit();
        editor.remove(KEY_USERNAME);
        editor.remove(KEY_PASSWORD);
        editor.remove(KEY_USER_LEVEL);
        editor.apply();
    }

    public void saveLoginDetails(User admin) {
    }
}
