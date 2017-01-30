package com.ahmetmatematikci.kendinizeguvenerekjava;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by a on 1/30/17.
 */

public class SubActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subactivity);
    }
}
