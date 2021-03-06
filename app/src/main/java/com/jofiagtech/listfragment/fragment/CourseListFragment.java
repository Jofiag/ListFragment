package com.jofiagtech.listfragment.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.jofiagtech.listfragment.R;
import com.jofiagtech.listfragment.Util.ScreenUtility;
import com.jofiagtech.listfragment.model.Course;
import com.jofiagtech.listfragment.adapter.CourseArrayAdapter;
import com.jofiagtech.listfragment.data.CourseData;

import java.util.List;

public class CourseListFragment extends androidx.fragment.app.ListFragment {
    List<Course> mCourseList = new CourseData().getCourseList();
    private Callbacks activity;

    public CourseListFragment(){
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ScreenUtility screenUtility = new ScreenUtility(getActivity());

        Log.d("Screen", "onCreate: " + screenUtility.getDisplayWidth() + ", " + screenUtility.getDisplayHeight());

        CourseArrayAdapter arrayAdapter = new CourseArrayAdapter(getActivity(),
                R.layout.item, mCourseList);

        setListAdapter(arrayAdapter);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.course_list_fragment, container, false);
        return view;
    }

    public interface Callbacks{
        public void onItemSelected(Course course, int position);
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        Course course = mCourseList.get(position);
        this.activity.onItemSelected(course, position);
        Toast.makeText(getActivity(), "Name : " + course.getCourseName(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.activity = (Callbacks) context;
    }
}
