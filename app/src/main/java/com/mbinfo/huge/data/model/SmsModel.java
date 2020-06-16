
package com.mbinfo.huge.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class SmsModel implements Parcelable
{

    @SerializedName("status")
    @Expose
    private int status;
    @SerializedName("message")
    @Expose
    private String message;
    public final static Creator<SmsModel> CREATOR = new Creator<SmsModel>() {


        @SuppressWarnings({
            "unchecked"
        })
        public SmsModel createFromParcel(Parcel in) {
            return new SmsModel(in);
        }

        public SmsModel[] newArray(int size) {
            return (new SmsModel[size]);
        }

    }
    ;

    protected SmsModel(Parcel in) {
        this.status = ((int) in.readValue((Integer.class.getClassLoader())));
        this.message = ((String) in.readValue((String.class.getClassLoader())));
    }

    public SmsModel() {
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(status);
        dest.writeValue(message);
    }

    public int describeContents() {
        return  0;
    }

}
