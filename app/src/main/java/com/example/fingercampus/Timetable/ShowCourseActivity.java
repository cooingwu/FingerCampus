package com.example.fingercampus.Timetable;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.fingercampus.R;

public class ShowCourseActivity extends Activity {

    Typeface typeface;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timetable_showcourse);
        setFinishOnTouchOutside(false);

    }
}