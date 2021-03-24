package com.android.bluetooth.a2dp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;

import com.android.internal.app.AlertActivity;

public class A2dpEnablingActivity extends AlertActivity {

    public static final String SINK_EXTRA_NAME = "sink_bt_audio";
    private static final String TAG = "A2dpEnablingActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAG, "Updating A2dp Source/Sink setting");

        Intent intent = getIntent();
        boolean shouldSink = intent.getBooleanExtra(SINK_EXTRA_NAME, true);

        SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(this).edit();
        editor.putBoolean(SINK_EXTRA_NAME, shouldSink);
        editor.apply();

        if(shouldSink) {
            Log.v(TAG, "BT A2dp set to sink");
        } else {
            Log.v(TAG, "BT A2dp set to source");
        }

        finish();
    }
}
