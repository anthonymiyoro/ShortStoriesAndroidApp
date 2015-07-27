package com.example.tony.shortstories;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {
    TextView textView;


    private void createNewItemToCard()

    {
//    waits for a click
        myOnClickListener = new MyOnClickListener(this);
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

//    sets a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        stories = new ArrayList<StoryData>();
        for (int i=0; i<MyData.storyArray.length; i++)
        {
            stories.add(new StoryData(
                            MyData.storyArray[i],
                            MyData.storyArray[i],
                            MyData.storyArray[i],
                    )

            );
        }
        adapter = new MyAdapter(stories);
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceuState) {
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
