package com.example.tony.shortstories;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView2)
        FragmentManager fragmentManager= getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        StoryFragment storyFragment = new StoryFragment();
        fragmentTransaction.add(R.id.fragment_container,cv);
        fragmentTransaction.commit();
        textView.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View v){
                FragmentManager fragmentManager= getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                StoryFragment registerFragment = new StoryFragment();
                FragmentTransaction.replace(R.id.fragment_container,registerFragment);
                fragmentTransaction.commit();
            }
        });


    }

}
