package com.bindass.dell.rippleeffect;

import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by dell on 11/12/2016.
 */
public class rbimage extends Activity {
    AssetManager assetManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rbimg);
     ImageView imgAssets=(ImageView)findViewById(R.id.ima);
        assetManager = getAssets();

        try {
// get input stream
            InputStream ims = assetManager.open("rbutton.png");
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

