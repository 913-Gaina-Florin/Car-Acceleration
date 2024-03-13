package com.example.car.controller;

import android.content.Context;

import com.example.car.Repository.DiskRepository;
import com.example.car.activity.ResultsActivity;
import com.example.car.model.Result;

import java.util.ArrayList;

public class ResultsActivityController {
    private DiskRepository repository;
    private Context activityContext;

    public ResultsActivityController(DiskRepository iRepository, Context iActivityContext){
        this.repository = iRepository;
        this.activityContext = iActivityContext;

        this.updateResult();
    }

    private Result getLastResult(){
        ArrayList<Result> resultList = this.repository.getAllEntities();

        if (resultList.size() > 0)
            return resultList.get(resultList.size() - 1);
        else
            return new Result(0, 0, 0, "2000/01/01 00:00:00");
    }

    private void updateResult(){
        Result lastResult = this.getLastResult();
        ResultsActivity resultsActivity = (ResultsActivity) this.activityContext;

        resultsActivity.updateTotalTimeTextView("Total time " + lastResult.getTime_0_100());
        resultsActivity.updateMaxSpeedTextView("Max speed " + lastResult.getMaxSpeed());
        resultsActivity.updateAverageSpeedTextView("Avg speed " + lastResult.getAverageSpeed());
    }

}
