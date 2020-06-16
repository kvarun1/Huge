package com.mbinfo.huge.data.model.retailer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RetailerModel {
    @SerializedName("status")
    @Expose
    private int status;
    @SerializedName("message")
    @Expose
    private List<RetailerDetail> message = null;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<RetailerDetail> getMessage() {
        return message;
    }

    public void setMessage(List<RetailerDetail> message) {
        this.message = message;
    }
}
