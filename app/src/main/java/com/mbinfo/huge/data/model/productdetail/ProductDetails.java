package com.mbinfo.huge.data.model.productdetail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductDetails {
    @SerializedName("status")
    @Expose
    private int status;
    @SerializedName("message")
    @Expose
    private ProductDetailShow message;

    public int getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ProductDetailShow getMessage() {
        return message;
    }

    public void setMessage(ProductDetailShow message) {
        this.message = message;
    }
}
