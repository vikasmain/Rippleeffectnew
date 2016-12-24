package com.bindass.dell.rippleeffect;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

/**
 * Created by dell on 11/24/2016.
 */
public class abandroid extends Activity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abandroid);
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
    }
}
