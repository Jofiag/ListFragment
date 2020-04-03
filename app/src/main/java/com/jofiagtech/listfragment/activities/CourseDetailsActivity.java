package com.jofiagtech.listfragment.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.jofiagtech.listfragment.R;
import com.jofiagtech.listfragment.fragment.CourseDetailsFragment;

public class CourseDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_details);

        if (savedInstanceState == null){
            addFragment(new CourseDetailsFragment(), R.id.course_details_container);
        }
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
