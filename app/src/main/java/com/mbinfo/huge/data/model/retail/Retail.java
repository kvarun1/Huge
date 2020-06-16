package com.mbinfo.huge.data.model.retail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Retail {
    @SerializedName("status")
    @Expose
    private int status;
    @SerializedName("message")
    @Expose
    private List<RetailData> message = null;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<RetailData> getMessage() {
        return message;
    }

    public void setMessage(List<RetailData> message) {
        this.message = message;
    }
}
