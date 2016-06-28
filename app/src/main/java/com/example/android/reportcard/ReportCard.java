package com.example.android.reportcard;

import android.content.Context;

/**
 * Created by vaibhavmule on 28/6/16.
 */
public class ReportCard {
    private String mStudentName;
    private String mStudentGrade;

    public ReportCard(String name, String grade) {
        mStudentGrade = name;
        mStudentGrade = grade;
    }

    public String getName() {
        return mStudentName;
    }

    public String getGrade() {
        return mStudentGrade;
    }

    public void setName(String name) {
        mStudentName = name;
    }

    public void setGrade(String grade) {
        mStudentGrade = grade;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "mStudentName='" + mStudentName + '\'' +
                ", mStudentGrade='" + mStudentGrade + '\'' +
                '}';
    }
}
