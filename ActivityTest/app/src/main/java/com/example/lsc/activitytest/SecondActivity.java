package com.example.lsc.activitytest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by LSC on 2017/10/6.
 */

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.second_layout);
    }
}
