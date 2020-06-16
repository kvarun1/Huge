package com.mbinfo.huge.data.model.state;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StateData {
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("id")
    @Expose
    private int id;
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}


