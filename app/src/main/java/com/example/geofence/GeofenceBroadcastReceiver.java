package com.example.geofence;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class GeofenceBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the GeofenceBroadcastReceiver is receiving
        // an Intent broadcast.
        Toast.makeText(context, "Geofence triggered", Toast.LENGTH_LONG).show();
    }
}