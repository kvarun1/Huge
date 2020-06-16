package com.mbinfo.huge.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SpinnerDataModel {
    @SerializedName("status")
    @Expose
    private int status;
    @SerializedName("message")
    @Expose
    private List<SpinerMessage> message = null;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<SpinerMessage> getMessage() {
        return message;
    }

    public void setMessage(List<SpinerMessage> message) {
        this.message = message;
    }
}
