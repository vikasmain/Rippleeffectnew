package com.bindass.dell.rippleeffect;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.bindass.dell.mycirc.CircleMenuLayout;


public class lt extends Activity
{

    private CircleMenuLayout mCircleMenuLayout;

    private String[] mItemTexts = new String[] {"", "","",""};
    private int[] mItemImgs = new int[] { R.drawable.image1_opt,
            R.drawable.white_button,
            R.drawable.ic_launcher,  R.drawable.image2_opt};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main02);
//		setContentView(R.layout.activity_main);

        mCircleMenuLayout = (CircleMenuLayout) findViewById(R.id.id_menulayout);
        mCircleMenuLayout.setMenuItemIconsAndTexts(mItemImgs, mItemTexts);



        mCircleMenuLayout.setOnMenuItemClickListener(new CircleMenuLayout.OnMenuItemClickListener()
        {

            @Override
            public void itemClick(View view, int pos)
            {
                switch (pos){
                    case 0:startActivity(new Intent(getApplicationContext(),newp.class));
                        break;
                    case 1:startActivity(new Intent(getApplicationContext(),newp2.class));
                        break;
                    case 2:startActivity(new Intent(getApplicationContext(),newp3.class));
                        break;
                    case 3:startActivity(new Intent(getApplicationContext(),newp4.class));
                        break;
                }

            }

            @Override
            public void itemCenterClick(View view)
            {
                startActivity(new Intent(getApplicationContext(),fo.class));
            }
        });

    }

}
