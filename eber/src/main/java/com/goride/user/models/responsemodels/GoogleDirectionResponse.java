package com.goride.user.models.responsemodels;

import java.util.List;

import com.goride.user.models.datamodels.RoutesItem;
import com.google.gson.annotations.SerializedName;

public class GoogleDirectionResponse{

    @SerializedName("routes")
    private List<RoutesItem> routes;

    @SerializedName("status")
    private String status;

    public List<RoutesItem> getRoutes(){
        return routes;
    }

    public String getStatus(){
        return status;
    }
}