package com.bindass.dell.rippleeffect;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.bindass.dell.myripple.RippleView;

import java.util.ArrayList;
@SuppressWarnings("deprecation")

public class MainActivity extends ActionBarActivity
{//vikasbajpayee783@gmail.com password=vikas@123
    private final Boolean isRecyclerview = false;
    private ArrayList<String> sourcesArrayList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (isRecyclerview)
            setContentView(R.layout.activity_main_recycler);
        else
            setContentView(R.layout.activity_main_list);

        final RippleView rippleView = (RippleView) findViewById(R.id.rect1);
        final TextView textView = (TextView) findViewById(R.id.rect_child1);
        final RippleView rippleView1 = (RippleView) findViewById(R.id.rect2);
        final TextView textView1 = (TextView) findViewById(R.id.rect_child2);
        final RippleView rippleView2 = (RippleView) findViewById(R.id.rect3);
        final TextView textView2 = (TextView) findViewById(R.id.rect_child3);
        final RippleView rippleView3 = (RippleView) findViewById(R.id.rect4);
        final TextView textView3 = (TextView) findViewById(R.id.rect_child4);
        final RippleView rippleView4 = (RippleView) findViewById(R.id.rect5);
        final TextView textView4 = (TextView) findViewById(R.id.rect_child5);





        rippleView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               startActivity(new Intent(getApplicationContext(),fo.class));
            }
        });
        rippleView.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Log.d("Sample", "Ripple completed");
            }
        });
        textView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.e("Sample", "Click rect child !");
            }
        });

        rippleView1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getApplicationContext(),lt.class));
            }
        });
        rippleView1.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Log.d("Sample", "Ripple completed");
            }
        });
        textView1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.e("Sample", "Click rect child !");
            }
        });
        rippleView2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getApplicationContext(),jbasics.class));
            }
        });
        rippleView2.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Log.d("Sample", "Ripple completed");
            }
        });
        textView2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.e("Sample", "Click rect child !");
            }
        });

        rippleView3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getApplicationContext(),ConceptActivity.class));
            }
        });
        rippleView3.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Log.d("Sample", "Ripple completed");
            }
        });
        textView3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.e("Sample", "Click rect child !");
            }
        });
        rippleView4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getApplicationContext(),Aboutus.class));
            }
        });
        rippleView4.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Log.d("Sample", "Ripple completed");
            }
        });
        textView4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.e("Sample", "Click rect child !");
            }
        });


        if (isRecyclerview)
        {
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
            recyclerView.setHasFixedSize(true);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
            recyclerView.setLayoutManager(layoutManager);

            CustomAdapter customAdapter = new CustomAdapter();
            customAdapter.updateList(sourcesArrayList);

            customAdapter.setOnTapListener(new OnTapListener()
            {
                @Override
                public void onTapView(int position)
                {
                    Log.e("MainActivity", "Tap item : " + position);
                }
            });
            recyclerView.setAdapter(customAdapter);
        }

    }

    }






