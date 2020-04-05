package com.jofiagtech.listfragment.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.Toast;

import com.jofiagtech.listfragment.R;
import com.jofiagtech.listfragment.fragment.CourseDetailsFragment;

public class CourseDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_details);

        if (savedInstanceState == null){
            Bundle extra = getIntent().getExtras();
            if (extra != null){
                int position = extra.getInt("course_id");
                Toast.makeText(getApplication(), "Position " + position, Toast.LENGTH_SHORT)
                        .show();
            }

            FragmentManager fragmentManager = getSupportFragmentManager();
            CourseDetailsFragment fragment = new CourseDetailsFragment();
            fragment.setArguments(extra);

            fragmentManager.beginTransaction()
                    .add(R.id.course_details_container, fragment)
                    .commit();
        }
    }
}
