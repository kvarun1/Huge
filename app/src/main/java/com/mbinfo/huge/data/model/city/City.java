package com.mbinfo.huge.data.model.city;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class City {
    @SerializedName("status")
    @Expose
    private int status;
    @SerializedName("message")
    @Expose
    private List<CityData> message = null;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<CityData> getMessage() {
        return message;
    }

    public void setMessage(List<CityData> message) {
        this.message = message;
    }

}

