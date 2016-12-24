package com.bindass.dell.rippleeffect;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class et extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spring_bar_et);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplication(),etimage.class));            }
        });

        TextView txtContent = (TextView) findViewById(R.id.txa);
        AssetManager assetManager = getAssets();


// To load text file
        InputStream input;
        try {
            input = assetManager.open("edittext.txt");
            int size = input.available();
            byte[] buffer = new byte[size];
            input.read(buffer);
            input.close();
// byte buffer into a string
            String text = new String(buffer);
            txtContent.setText(text);
            txtContent.setTextSize(18);

        } catch (IOException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


}
