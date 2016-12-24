package com.bindass.dell.rippleeffect;

import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by dell on 11/13/2016.
 */
public class sendingsms extends Activity {
   private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alert);
        MobileAds.initialize(this, "ca-app-pub-3571509120003278~1334979946");

        // Gets the ad view defined in layout/ad_fragment.xml with ad unit ID set in
        // values/strings.xml.
        mAdView = (AdView) findViewById(R.id.ad_view);

        // Create an ad request. Check your logcat output for the hashed device ID to
        // get test ads on a physical device. e.g.
        // "Use AdRequest.Builder.addTestDevice("ABCDEF012345") to get test ads on this device."
        AdRequest adRequest = new AdRequest.Builder()
                .build();

        // Start loading the ad in the background.
        mAdView.loadAd(adRequest);
        TextView txtContent = (TextView) findViewById(R.id.ta);
        ImageView imgAssets=(ImageView)findViewById(R.id.imad);

        AssetManager assetManager = getAssets();


// To load text file
        InputStream input;
        try {
            input = assetManager.open("sendingsms.txt");
            int size = input.available();
            byte[] buffer = new byte[size];
            input.read(buffer);
            input.close();
// byte buffer into a string
            String text = new String(buffer);
            txtContent.setText(text);
            txtContent.setTextSize(19);

        } catch (IOException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }


        try {
// get input stream
            InputStream ims = assetManager.open("sms.png");
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
