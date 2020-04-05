package com.jofiagtech.listfragment.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.jofiagtech.listfragment.R;
import com.jofiagtech.listfragment.fragment.CourseDetailsFragment;
import com.jofiagtech.listfragment.fragment.CourseListFragment;
import com.jofiagtech.listfragment.model.Course;

public class MainActivity extends AppCompatActivity implements CourseListFragment.Callbacks {
    private boolean isTwoPane = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (findViewById(R.id.course_details_container) != null)
            isTwoPane = true;
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


    @Override
    public void onItemSelected(Course course, int position) {

        if (isTwoPane){
           FragmentManager fragmentManager = getSupportFragmentManager();
           CourseDetailsFragment fragment = new CourseDetailsFragment();

           Bundle extra = new Bundle();
           extra.putInt("course_id", position);
           fragment.setArguments(extra);

           fragmentManager.beginTransaction().replace(R.id.course_details_container, fragment)
                   .commit();
        }
        else{
            Intent intent = new Intent(MainActivity.this, CourseDetailsActivity.class);
            intent.putExtra("course_id", position);
            startActivity(intent);
        }

    }
}
