package com.jofiagtech.listfragment.data;

import android.content.Context;

public class Course {
    private String courseName;
    private String courseImage;

    public Course() {
    }

    private int getImageRessourceId(Context context){
        return context.getResources().getIdentifier(this.courseName, "drawable", context.getPackageName());
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseImage() {
        return courseImage;
    }

    public void setCourseImage(String courseImage) {
        this.courseImage = courseImage;
    }
}
