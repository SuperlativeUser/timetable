package com.example.myapplication;

import android.content.Context;

import java.util.List;

public class AdapterFactory {
    private Context context;
    private List<Info> legend;
    AdapterFactory (Context context, List<Info> legend){
        this.context = context;
        this.legend = legend;
    }

    public Time_Adapter getAdapter( int resourse) {
        return new Time_Adapter(context,resourse,legend);
    }
}
