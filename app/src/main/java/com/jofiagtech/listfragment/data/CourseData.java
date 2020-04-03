package com.jofiagtech.listfragment.data;

import com.jofiagtech.listfragment.model.Course;

import java.util.ArrayList;

public class CourseData {
    private String[] courseNames = {"First Course", "Second Course", "Third Course", "Fourth Course",
            "Fifth Course", "Sixth Course", "Seventh Course"};

    public ArrayList<Course> getCourseList(){
        ArrayList<Course> list = new ArrayList<>();

        for (String courseName : courseNames) {
            Course course = new Course(courseName,
                    courseName.replace(" ", "").toLowerCase());

            list.add(course);
        }

        return list;
    }
}
