package com.bindass.dell.rippleeffect;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by dell on 10/30/2016.
 */
public class helloworld extends Fragment {
ImageView ia,ia2,ia3,ia4;
    Button b1,b2,b3;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.helloworld, container, false);
ia=(ImageView)v.findViewById(R.id.im1);
        ia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),iaopen.class));
            }
        });



        ia3=(ImageView)v.findViewById(R.id.im5);
        ia3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),iaopen3.class));
            }
        });
        b3=(Button)v.findViewById(R.id.terun5);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),co.class));
            }
        });
        return v;
    }

}
