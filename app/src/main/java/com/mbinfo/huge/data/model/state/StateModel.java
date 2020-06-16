
package com.mbinfo.huge.data.model.state;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class StateModel {
    @SerializedName("status")
    @Expose
    private int status;
    @SerializedName("message")
    @Expose
    private List<StateData> message = null;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<StateData> getMessage() {
        return message;
    }

    public void setMessage(List<StateData> message) {
        this.message = message;
    }

}
