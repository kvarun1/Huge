package com.mbinfo.huge.data.model.profilemodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Profile {
    @SerializedName("status")
    @Expose
    private int status;
    @SerializedName("message")
    @Expose
    private ProfileData message;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public ProfileData getMessage() {
        return message;
    }

    public void setMessage(ProfileData message) {
        this.message = message;
    }
}
