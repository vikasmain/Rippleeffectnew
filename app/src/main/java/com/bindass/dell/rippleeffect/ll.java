package com.bindass.dell.rippleeffect;

import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by dell on 11/11/2016.
 */
public class ll extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ll);
        TextView txtContent = (TextView) findViewById(R.id.txtContent);
        ImageView imgAssets = (ImageView) findViewById(R.id.imgAssets);

        AssetManager assetManager = getAssets();


// To load text file
        InputStream input;
        try {
            input = assetManager.open("ll.txt");
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
        try {
// get input stream
            InputStream ims = assetManager.open("ll.png");
// create drawable from stream
            Drawable d = Drawable.createFromStream(ims, null);
// set the drawable to imageview
            imgAssets.setImageDrawable(d);
        }
        catch(IOException ex) {
            return;
        }
    }
    }
