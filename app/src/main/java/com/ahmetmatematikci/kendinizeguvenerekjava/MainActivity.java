package com.ahmetmatematikci.kendinizeguvenerekjava;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    String[] sayfalar = {"BaslangictaCalisanlar" ,"BaslangicSubIntent","IcIntent"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setListAdapter(new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, sayfalar));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String sayfa = sayfalar[position];

        Class gis;

        try {
            gis = Class.forName("com.ahmetmatematikci.kendinizeguvenerekjava." + sayfa);
            Intent i = new Intent(MainActivity.this, gis);
            startActivity(i);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
