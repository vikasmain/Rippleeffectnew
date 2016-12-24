package com.bindass.dell.rippleeffect;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.bindass.dell.rippleeffect.adapters.NavListadapters;
import com.bindass.dell.rippleeffect.fragments.Home;
import com.bindass.dell.rippleeffect.fragments.Home2;
import com.bindass.dell.rippleeffect.fragments.Settings;
import com.bindass.dell.rippleeffect.fragments.classten;
import com.bindass.dell.rippleeffect.fragments.fgrt3;
import com.bindass.dell.rippleeffect.model.Navitem;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("deprecation")
public class fo extends ActionBarActivity {
    DrawerLayout drawerLayout;
    RelativeLayout drawerPane;
    ListView lvNav;
    List<Navitem> navitemList;
    List<Fragment> fragmentList;
    ActionBarDrawerToggle actionBarDrawerToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        drawerLayout=(DrawerLayout) findViewById(R.id.Drawer_pane);
        drawerPane=(RelativeLayout) findViewById(R.id.drawer_pane);
        lvNav=(ListView) findViewById(R.id.list_view);//items will be displaying in list form.
        navitemList=new ArrayList<Navitem>();//NavItem contains title,subtitle,Images.
        navitemList.add(new Navitem("Android-Basics","for beginners",R.drawable.image1_opt));
        navitemList.add(new Navitem("Lets Build Apps","Lets get started",R.drawable.image1_opt));
        navitemList.add(new Navitem("User Interface","Change your screen view",R.drawable.image1_opt));
        navitemList.add(new Navitem("Android Advanced Concepts","Be a Mr.perfector form here",R.drawable.image1_opt));
        navitemList.add(new Navitem("Distribute Your app","Now enjoy here and feel positive for your app from here",R.drawable.image1_opt));

        NavListadapters navListadapters=new NavListadapters(getApplicationContext(),R.layout.item_nav_list,navitemList);
        lvNav.setAdapter(navListadapters);//Adapter is NavListadapters here.
        fragmentList=new ArrayList<Fragment>();
        fragmentList.add(new Home());
        fragmentList.add(new Home2());
        fragmentList.add(new Settings());
        fragmentList.add(new fgrt3());

        fragmentList.add(new classten());
        FragmentManager fragmentManager=getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.main_content,fragmentList.get(0)).commit();
        setTitle(navitemList.get(0).getTitle());
        lvNav.setItemChecked(0,true);
        drawerLayout.closeDrawer(drawerPane);
        lvNav.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.main_content,fragmentList.get(position)).commit();
                setTitle(navitemList.get(position).getTitle());
                lvNav.setItemChecked(position,true);
                drawerLayout.closeDrawer(drawerPane);
            }
        });
        actionBarDrawerToggle= new ActionBarDrawerToggle(this,drawerLayout, R.string.drawer_opened,R.string.drawer_closed){//for ActionBarDrawertoggle button <- sign and -> sign.
            @Override
            public void onDrawerOpened(View drawerView) {
                invalidateOptionsMenu();
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                invalidateOptionsMenu();
            }
        };
        drawerLayout.setDrawerListener(actionBarDrawerToggle);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item))
            return true;
        switch (item.getItemId()) {
            case R.id.blue:
                startActivity(new Intent(getApplicationContext(), andro.class));
                break;
            case R.id.ab:
                startActivity(new Intent(getApplicationContext(), abandroid.class));

                break;
            case R.id.sa:
                startActivity(new Intent(getApplicationContext(),effg.class));
                break;
            case R.id.envi:
                startActivity(new Intent(getApplicationContext(),environment.class));
        }

        return true;
    }
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return true;
    }
}
