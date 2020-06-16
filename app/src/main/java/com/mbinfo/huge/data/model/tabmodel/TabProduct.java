package com.mbinfo.huge.data.model.tabmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TabProduct {
    @SerializedName("status")
    @Expose
    private int status;
    @SerializedName("message")
    @Expose
    private List<ProductMessage> message = null;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<ProductMessage> getMessage() {
        return message;
    }

    public void setMessage(List<ProductMessage> message) {
        this.message = message;
    }
}
