package com.dilmaj.hello.view;

import android.content.Context;
import android.widget.Toast;

public class NotificationHandler {
    public static void toast(Context context, String message) {
        Toast.makeText(context,	message, Toast.LENGTH_SHORT).show();
    }
}
