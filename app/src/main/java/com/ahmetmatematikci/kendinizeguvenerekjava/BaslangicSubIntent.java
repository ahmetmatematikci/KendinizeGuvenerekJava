package com.ahmetmatematikci.kendinizeguvenerekjava;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Created by a on 1/30/17.
 */

public class BaslangicSubIntent extends Activity {

    private final static int CEVAP_SORGULA = 332;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baslangicsubintent);


    }

    public void degistirActivity(final View view) {
        switch (view.getId()) {
            case R.id.button :
                startActivity(new Intent(this, SubActivity.class));
                break;

            case R.id.button2:
                startActivityForResult(new Intent(this, SubActivityCevap.class), CEVAP_SORGULA);
                break;

            case R.id.button5:
                startActivity(new Intent(this,IcIntent.class));
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == Activity.RESULT_OK && requestCode ==CEVAP_SORGULA) {
            Toast.makeText(BaslangicSubIntent.this, "Cevabiniz: " + data.getExtras().getInt("Cevap"), Toast.LENGTH_LONG).show();

        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
