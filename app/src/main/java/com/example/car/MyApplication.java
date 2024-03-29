package com.example.car;

import android.app.Application;

import com.example.car.Repository.DiskRepository;

public class MyApplication extends Application {
    private DiskRepository resultsRepository;
    @Override
    public void onCreate() {
        super.onCreate();
        resultsRepository = new DiskRepository(getApplicationContext());
    }

    public DiskRepository getResultsRepository(){
        return this.resultsRepository;
    }
}
