package com.dinesh.maurya.dineshpmutils.Utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class Utils {


    public static Boolean isConnectingToInternet(final Context context) {
        Boolean activeOrNot = false;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            activeOrNot = true;
        } else {
            activeOrNot = false;
        }
        return activeOrNot;
    }
}
