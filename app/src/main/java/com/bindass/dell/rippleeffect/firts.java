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
 * Created by dell on 11/11/2016.
 */
public class firts extends Activity {
    String flo[] = {"LinearLayout", "RelativeLayout", "TableLayout", "Listview", "GridView","AbsoluteLayout"};
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firts);
        ActionBar actionBar;

        SearchView serchview;
        ListView listview;
        listview = (ListView) findViewById(R.id.list);
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, flo);
        listview.setAdapter(arrayAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:startActivity(new Intent(getApplicationContext(),ll.class));
                        break;
                    case 1:startActivity(new Intent(getApplicationContext(),rl.class));
                        break;
                    case 2:startActivity(new Intent(getApplicationContext(),tl.class));
                    break;
                    case 3:startActivity(new Intent(getApplicationContext(),lil.class));
                    break;
                    case 4:startActivity(new Intent(getApplicationContext(),gl.class));
                        break;

                    case 5:startActivity(new Intent(getApplicationContext(),Al.class));
                        break;

                    default:break;
                }
            }
        });
    }

}