package com.jofiagtech.listfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.jofiagtech.listfragment.data.Course;
import com.jofiagtech.listfragment.data.CourseArrayAdapter;
import com.jofiagtech.listfragment.data.CourseData;

import java.util.List;

public class MyFragment extends androidx.fragment.app.ListFragment {
    List<Course> mCourseList = new CourseData().getCourseList();

    public MyFragment(){
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CourseArrayAdapter arrayAdapter = new CourseArrayAdapter(getActivity(),
                R.layout.item, mCourseList);

        setListAdapter(arrayAdapter);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);
        return view;
    }
}
