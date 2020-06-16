package com.mbinfo.huge.data.model.tehsil;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Tehsil {
    @SerializedName("status")
    @Expose
    private int status;
    @SerializedName("message")
    @Expose
    private List<TehsilData> message = null;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<TehsilData> getMessage() {
        return message;
    }

    public void setMessage(List<TehsilData> message) {
        this.message = message;
    }
}
