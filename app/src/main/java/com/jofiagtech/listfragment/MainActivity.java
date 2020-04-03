package com.jofiagtech.listfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //addFragment(new CourseListFragment(), R.id.container);
    }

    private void addFragment(Fragment fragmentToAdd, int container){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(container);

        if (fragment == null){
            fragment = fragmentToAdd;
            fragmentManager.beginTransaction()
                    .add(container, fragment)
                    .commit();
        }
    }
}
