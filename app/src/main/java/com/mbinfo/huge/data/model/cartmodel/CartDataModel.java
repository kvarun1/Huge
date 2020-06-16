package com.mbinfo.huge.data.model.cartmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CartDataModel {
    @SerializedName("status")
    @Expose
    private int status;
    @SerializedName("message")
    @Expose
    private List<CartShowData> message = null;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<CartShowData> getMessage() {
        return message;
    }

    public void setMessage(List<CartShowData> message) {
        this.message = message;
    }
}
