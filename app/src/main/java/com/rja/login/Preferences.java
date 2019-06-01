package com.rja.login;

import android.content.Context;

import androidx.annotation.Nullable;

/**
 * Created by rjaylward on 2019-06-01
 */
public class Preferences {

    private static final String NAME = "login-prefs";
    private static final String USERNAME_KEY = "username";

    public static void setUserName(Context context, @Nullable String username){
        context.getSharedPreferences(NAME, Context.MODE_PRIVATE).edit().putString(USERNAME_KEY, username).apply();
    }

    @Nullable
    public static String getUserName(Context context){
        return context.getSharedPreferences(NAME, Context.MODE_PRIVATE).getString(USERNAME_KEY, null);
    }
}
