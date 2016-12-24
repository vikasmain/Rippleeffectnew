package com.bindass.dell.rippleeffect;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
/**
 * Created by dell on 11/21/2016.
 */
public class Aboutus extends Activity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sbout);
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
        Button startBtn = (Button) findViewById(R.id.sendemail);
        startBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) { sendEmail(); }
        });
    }
    protected void sendEmail() {
        Log.i("Send email", "");
        String[] TO = {"vikasbajpayee783@gmail.com"};
        String[] CC = {""};
        Intent emailIntent = new Intent(Intent.ACTION_SEND); emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain"); emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Your subject");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message goes here");
        try
        {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            finish();
            Log.i("Finished sending email...", ""); }
        catch (android.content.ActivityNotFoundException ex)
    { Toast.makeText(Aboutus.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
    }
    }

    /** Called when returning to the activity */


    /** Called before the activity is destroyed */

}


