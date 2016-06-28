package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ReportCard> reportCardArrayList = new ArrayList<ReportCard>();

        reportCardArrayList.add(new ReportCard("Foo", "A"));
        reportCardArrayList.add(new ReportCard("Bar", "B"));
        reportCardArrayList.add(new ReportCard("Faux", "C"));

        for (int index = 0; index < reportCardArrayList.size(); index++) {
            this.toString();
        }

    }
}
