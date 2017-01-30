package com.ahmetmatematikci.kendinizeguvenerekjava;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by a on 1/30/17.
 */

public class SubActivityCevap extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subactivitycevap);
    }

    public void cevapVer(final View view) {
        final Intent intent = new Intent();
        intent.putExtra("Cevap", 42);
        setResult(RESULT_OK, intent);
        finish();
    }
}
