package com.bindass.dell.rippleeffect;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

public class jbasics extends AppCompatActivity {
    String flo[] = {"Java Basics Concept","Hello World In Java","this keyword", "final keyword", "static keyword","super keyword","Abstract class","packages in java","inheritance in java","Java IO"};
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jbasics);
        SearchView serchview;
        ListView listview;
        listview=(ListView)findViewById(R.id.list);
        serchview=(SearchView) findViewById(R.id.se);
        arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,flo);
        listview.setAdapter(arrayAdapter);
        serchview.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                arrayAdapter.getFilter().filter(newText);
                return false;
            }
        });
    listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            switch(position)
            {
                case 0: startActivity(new Intent(getApplicationContext(),jcon.class));
                    break;
                case 1: startActivity(new Intent(getApplicationContext(),hw.class));
                    break;
                case 2:startActivity(new Intent(getApplicationContext(),thisk.class));
                    break;
                case 3:startActivity(new Intent(getApplicationContext(),finalk.class));
                    break;
                case 4:startActivity(new Intent(getApplicationContext(),stat.class));
                    break;
                case 5:startActivity(new Intent(getApplicationContext(),sup.class));
                    break;
                case 6:startActivity(new Intent(getApplicationContext(),abs.class));
                    break;

                case 7:startActivity(new Intent(getApplicationContext(),pack.class));
                    break;


                case 8:startActivity(new Intent(getApplicationContext(),inheri.class));
                    break;
                case 9:startActivity(new Intent(getApplicationContext(),javaio.class));
                    break;
                default:break;
            }
        }
    });
    }


}

