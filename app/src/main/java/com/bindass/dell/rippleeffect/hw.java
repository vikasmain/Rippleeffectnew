package com.bindass.dell.rippleeffect;

import android.app.Activity;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by dell on 11/14/2016.
 */
public class hw extends Activity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jabasics);
        TextView txtContent = (TextView) findViewById(R.id.tjbasics);
        MobileAds.initialize(this, "ca-app-pub-3571509120003278~1334979946");

        mAdView = (AdView) findViewById(R.id.ad_view);

        // Create an ad request. Check your logcat output for the hashed device ID to
        // get test ads on a physical device. e.g.
        // "Use AdRequest.Builder.addTestDevice("ABCDEF012345") to get test ads on this device."
        AdRequest adRequest = new AdRequest.Builder()
                .build();

        // Start loading the ad in the background.
        mAdView.loadAd(adRequest);
        AssetManager assetManager = getAssets();


// To load text file
        InputStream input;
        try {
            input = assetManager.open("hw.txt");
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
