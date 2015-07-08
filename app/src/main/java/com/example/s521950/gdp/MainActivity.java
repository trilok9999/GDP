package com.example.s521950.gdp;

import android.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {
ActionBar.Tab tab1,tab2,tab3,tab4,tab5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);

        tab1 = actionBar.newTab().setText("Tab1").setTabListener(new TabListener<SportFragment>(this,"tennis",SportFragment.class));

        tab2 = actionBar.newTab().setText("Tab2").setTabListener(new TabListener<ImageFragment>(this,"bask",ImageFragment.class));
        tab3 = actionBar.newTab().setText("Tab3").setTabListener(new TabListener<AddSport>(this,"rugby",AddSport.class));


        actionBar.addTab(tabA);
        actionBar.addTab(tabB);
        actionBar.addTab(tabC);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
