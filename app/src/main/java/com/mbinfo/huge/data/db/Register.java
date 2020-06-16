package com.mbinfo.huge.data.db;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "register")
public class Register {

    public String userid;
    @PrimaryKey
    @NonNull
    public String username;
    public String fathername;
    public String address;
    public String village;
    public String landmark;
    public String ward;
    public String block;
    public String distict;
    public String state;
    public String pincode;
    public String adhar;

    public Register(@NonNull String username, String fathername, String address, String village, String landmark, String ward, String block,
                    String distict, String state, String pincode, String adhar) {

        this.username = username;
        this.fathername = fathername;
        this.address = address;
        this.village = village;
        this.landmark = landmark;
        this.ward = ward;
        this.block = block;
        this.distict = distict;
        this.state = state;
        this.pincode = pincode;
        this.adhar = adhar;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getDistict() {
        return distict;
    }

    public void setDistict(String distict) {
        this.distict = distict;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getAdhar() {
        return adhar;
    }

    public void setAdhar(String adhar) {
        this.adhar = adhar;
    }
}
