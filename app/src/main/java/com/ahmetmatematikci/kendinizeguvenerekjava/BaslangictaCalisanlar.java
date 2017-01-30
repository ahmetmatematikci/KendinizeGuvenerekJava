package com.ahmetmatematikci.kendinizeguvenerekjava;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by a on 1/30/17.
 */

public class BaslangictaCalisanlar extends Activity {

    private static  final String TAG= BaslangictaCalisanlar.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baslangictacalisanlar);
        Log.d(TAG,"Başlatıldı");
    }


    @Override
    protected void onStart() {
        Log.d(TAG," onStart Başlatıldı");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.d(TAG,"onStop Başlatıldı");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.d(TAG,"onRestart Başlatıldı");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG,"onResume Başlatıldı");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG,"onPause Başlatıldı");
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG,"onDestroy Başlatıldı");
        super.onDestroy();
    }
}
