package com.example.camera;

import android.content.Context;
import android.widget.Toast;

public class TempCamera {
    private final Context context;
    public TempCamera(Context context) {
        this.context = context;
    }

    public void openCam(String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
