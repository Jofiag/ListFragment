package com.jofiagtech.listfragment.data;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.jofiagtech.listfragment.R;

import java.util.List;

public class CourseArrayAdapter extends ArrayAdapter<Course> {
    private Context mContext;
    private List<Course> mCourseList;

    public CourseArrayAdapter(@NonNull Context context, int resource, List<Course> courseList) {
        super(context, resource, courseList);
        mContext = context;
        mCourseList = courseList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) mContext.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

        View view = layoutInflater.inflate(R.layout.item, null);

        return view;
    }
}
