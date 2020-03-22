package com.example.myapplication;

import android.content.Context;

import java.util.List;

public class AdapterFactory implements AdapterFactoryInterface {

    private Context context;
    private int time_resource;
    private int lesson_resource;
    private List<Info> time_legend;
    private List<Info> lesson_legend;


    AdapterFactory (Context context, int time_resource, List<Info> time_legend, int lesson_resource, List<Info> lesson_legend) {
        this.context = context;
        this.lesson_legend =lesson_legend;
        this.lesson_resource = lesson_resource;
        this.time_legend = time_legend;
        this.time_resource = time_resource;
    }

    @Override
    public Time_Adapter getTimeAdapter() {
        return new Time_Adapter(context,time_resource,time_legend);
    }

    @Override
    public Lesson_Adapter getLessonAdapter() {
        return new Lesson_Adapter(context,lesson_resource,lesson_legend);
    }

}
