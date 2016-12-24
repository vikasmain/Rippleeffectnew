package com.bindass.dell.rippleeffect.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.bindass.dell.rippleeffect.Audiocap;
import com.bindass.dell.rippleeffect.Webview;
import com.bindass.dell.rippleeffect.alertdialogs;
import com.bindass.dell.rippleeffect.animations;
import com.bindass.dell.rippleeffect.asset;
import com.bindass.dell.rippleeffect.camera;
import com.bindass.dell.rippleeffect.customfonts;
import com.bindass.dell.rippleeffect.phonecalls;
import com.bindass.dell.rippleeffect.sendingemail;
import com.bindass.dell.rippleeffect.sendingsms;
import com.bindass.dell.rippleeffect.spinner;

/**
 * Created by dell on 5/24/2016.
 */
public class fgrt3 extends ListFragment {
    Intent intent;
    String[] players={"Alert Dialogs","Animations","Audio Capture","Assets","Camera","Custom Fonts","Phone Calls","Sending SMS","Sending Email","Spinner","WebView"};
    ArrayAdapter<String> adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,players);
        setListAdapter(adapter);



        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        intent = new Intent(getActivity().getApplicationContext(),alertdialogs.class);
                        break;
                    case 1:
                        intent = new Intent(getActivity().getApplicationContext(),animations.class);

                        break;
                    case 2:
                        intent=new Intent(getActivity().getApplicationContext(),Audiocap.class);
                        break;
                    case 3:
                        intent=new Intent(getActivity().getApplicationContext(),asset.class);
                        break;

                    case 4:
                        intent=new Intent(getActivity().getApplicationContext(),camera.class);
                        break;
                    case 5:
                        intent=new Intent(getActivity().getApplicationContext(),customfonts.class);
                        break;
                    case 6:
                        intent=new Intent(getActivity().getApplicationContext(),phonecalls.class);
                        break;
                    case 7:
                        intent=new Intent(getActivity().getApplicationContext(),sendingsms.class);
                        break;
                    case 8:
                        intent=new Intent(getActivity().getApplicationContext(),sendingemail.class);
                        break;
                    case 9:
                        intent=new Intent(getActivity().getApplicationContext(),spinner.class);
                        break;
                    case 10:
                        intent=new Intent(getActivity().getApplicationContext(),Webview.class);
                        break;

                    default:break;
                }
                startActivity(intent);
            }


        });
    }
}