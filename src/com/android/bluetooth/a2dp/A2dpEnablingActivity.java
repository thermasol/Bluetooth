package com.android.bluetooth.a2dp;

import android.os.Bundle;
import android.util.Log;
import com.android.internal.app.AlertActivity;

public class A2dpEnablingActivity extends AlertActivity {

    private static final String TAG = "A2dpEnablingActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAG, "Updating A2dp Source/Sink setting");
        finish();
    }
}
