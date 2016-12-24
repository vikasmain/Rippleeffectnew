package com.bindass.dell.rippleeffect.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TabHost;

import com.bindass.dell.rippleeffect.R;
import com.bindass.dell.rippleeffect.adapters.Myfragmentpageradapter;
import com.bindass.dell.rippleeffect.adb;
import com.bindass.dell.rippleeffect.ddms;
import com.bindass.dell.rippleeffect.distribute;
import com.bindass.dell.rippleeffect.gradle;
import com.bindass.dell.rippleeffect.logcat;

/**
 * Created by dell on 5/14/2016.
 */
@SuppressWarnings("deprecation")
public class classten extends Fragment {
    private ViewPager vg;
    private TabHost tabhost;
    int i = 0;
    View v;
    private Myfragmentpageradapter m;
private Button b1,b2,b3,b4,b5;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.rnjd, container, false);
        b1=(Button)v.findViewById(R.id.button);
        b2=(Button)v.findViewById(R.id.button2);
        b3=(Button)v.findViewById(R.id.button3);
        b4=(Button)v.findViewById(R.id.button4);
        b5=(Button)v.findViewById(R.id.button5);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),adb.class));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
startActivity(new Intent(getContext(),gradle.class));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),logcat.class));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),ddms.class));
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),distribute.class));
            }
        });

        return v;
    }
}
