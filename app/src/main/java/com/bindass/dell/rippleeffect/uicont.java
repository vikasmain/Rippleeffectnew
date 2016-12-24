package com.bindass.dell.rippleeffect;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by dell on 11/12/2016.
 */
public class uicont extends Fragment {
    @Nullable


    Button b1;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.uicont, container, false);
b1=(Button)v.findViewById(R.id.dkd);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              startActivity(new Intent(getContext(),luic.class));
            }
        });
        return v;
    }
}
