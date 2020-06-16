package com.mbinfo.huge.data.model.ordermodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OrderDetail {
    @SerializedName("status")
    @Expose
    private int status;
    @SerializedName("message")
    @Expose
    private List<OrderDetailData> message = null;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<OrderDetailData> getMessage() {
        return message;
    }

    public void setMessage(List<OrderDetailData> message) {
        this.message = message;
    }
}
