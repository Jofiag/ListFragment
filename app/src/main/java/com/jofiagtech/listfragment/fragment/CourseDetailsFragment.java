package com.jofiagtech.listfragment.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.jofiagtech.listfragment.R;
import com.jofiagtech.listfragment.model.Course;

public class CourseDetailsFragment extends Fragment {
    Course mCourse;

    public CourseDetailsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.course_details_fragment, container, false);

        if (mCourse != null){
            TextView courseName = view.findViewById(R.id.details_name);
            TextView courseDescription = view.findViewById(R.id.details_description);
            ImageView courseImage = view.findViewById(R.id.details_image);

            courseName.setText(mCourse.getCourseName());
            courseDescription.setText(mCourse.getCourseName());
            courseImage.setImageResource(mCourse.getImageRessourceId(getActivity()));
        }

        return view;
    }
}
