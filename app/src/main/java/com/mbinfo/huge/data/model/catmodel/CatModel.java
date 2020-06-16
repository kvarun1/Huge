package com.mbinfo.huge.data.model.catmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CatModel {
    @SerializedName("status")
    @Expose
    private int status;
    @SerializedName("message")
    @Expose
    private List<CatList> message = null;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<CatList> getMessage() {
        return message;
    }

    public void setMessage(List<CatList> message) {
        this.message = message;
    }
}
