package com.bindass.dell.rippleeffect;

import android.app.Activity;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by dell on 11/12/2016.
 */
public class evexample extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eve);
        TextView txtContent = (TextView) findViewById(R.id.txtContent2);
                AssetManager assetManager = getAssets();


// To load text file
        InputStream input;
        try {
            input = assetManager.open("events.txt");
            int size = input.available();
            byte[] buffer = new byte[size];
            input.read(buffer);
            input.close();
// byte buffer into a string
            String text = new String(buffer);
            txtContent.setText(text);
            txtContent.setTextSize(16);

        } catch (IOException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
