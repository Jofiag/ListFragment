package com.jofiagtech.listfragment.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.jofiagtech.listfragment.R;
import com.jofiagtech.listfragment.fragment.CourseListFragment;
import com.jofiagtech.listfragment.model.Course;

public class MainActivity extends AppCompatActivity implements CourseListFragment.Callbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        Toast.makeText(getApplication(), "Course", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(MainActivity.this, CourseDetailsActivity.class);
        intent.putExtra("course_id", position);
        startActivity(intent);
    }
}
