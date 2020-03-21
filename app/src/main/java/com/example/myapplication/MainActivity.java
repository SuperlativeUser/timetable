package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.List;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private List<Info> times = new ArrayList<>();
    private List<Info> lessons = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInitialData();

        ListView TimeList = (ListView) findViewById(R.id.TimeList);
        ListView LessonsList = (ListView) findViewById(R.id.LessonsList);



        Time_Adapter TIME = new Time_Adapter(this, com.example.myapplication.R.layout.time_layout, times);

        // устанавливаем адаптер
        TimeList.setAdapter(TIME);
       // LessonsList.setAdapter(LESSONS);

    }

    private void setInitialData(){

        times.add(new Info ("08:00 - 09:35"));
        times.add(new Info ("09:50 - 11:25"));
        times.add(new Info ("11:50 - 13:30"));
        times.add(new Info ("13:45 - 15:20"));
        times.add(new Info ("15:50 - 17:25"));
        times.add(new Info ("19:30 - 21:05"));

        lessons.add(new Info ("Пара"));
        lessons.add(new Info ("Пара"));
        lessons.add(new Info ("Пара"));
        lessons.add(new Info ("Пара"));
        lessons.add(new Info ("Пара"));
        lessons.add(new Info ("Пара"));

    }
}
