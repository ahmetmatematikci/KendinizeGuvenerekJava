package com.ahmetmatematikci.kendinizeguvenerekjava;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

/**
 * Created by a on 1/30/17.
 */

public class IcIntent extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.icintent);


    }

    public void onNavButtonClick(final View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.button4:
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:03223243065"));
                startActivity(intent);
                break;

            case R.id.button6:
                String telNo = "5321111111";//mesaj gönderilecek numara
                String mesaj = "Bu mesaj mobilhanem.com tarafından gönderilmiştir."; //mesaj
                Intent mesajGonder = new Intent(Intent.ACTION_VIEW);
                mesajGonder.setData(Uri.parse("sms:"+ telNo));
                mesajGonder.putExtra("sms_body", mesaj);
                startActivity(mesajGonder);

                break;


            case R.id.button7:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                startActivity(intent);
                break;
        }
    }
}
