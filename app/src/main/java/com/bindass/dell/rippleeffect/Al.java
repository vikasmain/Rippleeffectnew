package com.bindass.dell.rippleeffect;

import android.app.Activity;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by dell on 11/11/2016.
 */
public class Al extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.al);
        TextView txtContent = (TextView) findViewById(R.id.txtContent);
        AssetManager assetManager = getAssets();


// To load text file
        InputStream input;
        try {
            input = assetManager.open("al.txt");
            int size = input.available();
            byte[] buffer = new byte[size];
            input.read(buffer);
            input.close();
// byte buffer into a string
            String text = new String(buffer);
            txtContent.setText(text);
            txtContent.setTextSize(20);

        } catch (IOException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
// To load image

    }
    }

