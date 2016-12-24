package com.bindass.dell.rippleeffect;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

/**
 * Created by dell on 11/12/2016.
 */
public class luic extends Activity {
    String flo2[]={"Textview","Buttons","Edittext","ImageButton","RadioButton"};
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uicms);
        ActionBar actionBar;

        SearchView serchview;
        ListView listview;
        listview = (ListView) findViewById(R.id.list2);
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, flo2);
        listview.setAdapter(arrayAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:startActivity(new Intent(getApplicationContext(),tt.class));
                        break;
                    case 1:startActivity(new Intent(getApplicationContext(),bt.class));
                        break;
                    case 2:startActivity(new Intent(getApplicationContext(),et.class));
                        break;
                    case 3:startActivity(new Intent(getApplicationContext(),im.class));
                        break;


                    case 4:startActivity(new Intent(getApplicationContext(),rb.class));
                        break;

                    default:break;
                }
            }
        });
    }
}
