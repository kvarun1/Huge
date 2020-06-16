package com.mbinfo.huge.data.model.tehsil;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TehsilData {
    @SerializedName("tehsil")
    @Expose
    private String tehsil;
    @SerializedName("id")
    @Expose
    private int id;

    public String getTehsil() {
        return tehsil;
    }

    public void setTehsil(String tehsil) {
        this.tehsil = tehsil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
