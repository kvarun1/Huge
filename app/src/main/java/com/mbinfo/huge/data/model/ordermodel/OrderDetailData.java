package com.mbinfo.huge.data.model.ordermodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OrderDetailData {
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("order_id")
    @Expose
    private String orderId;
    @SerializedName("prod_id")
    @Expose
    private int prodId;
    @SerializedName("cid")
    @Expose
    private int cid;
    @SerializedName("add_id")
    @Expose
    private int addId;
    @SerializedName("order_datetime")
    @Expose
    private String orderDatetime;
    @SerializedName("quantity")
    @Expose
    private int quantity;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("discount")
    @Expose
    private int discount;
    @SerializedName("payble_amt")
    @Expose
    private String paybleAmt;
    @SerializedName("payment_mode")
    @Expose
    private String paymentMode;
    @SerializedName("ip")
    @Expose
    private String ip;
    @SerializedName("alt_mobile")
    @Expose
    private String altMobile;
    @SerializedName("payment_confirmation")
    @Expose
    private String paymentConfirmation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getAddId() {
        return addId;
    }

    public void setAddId(int addId) {
        this.addId = addId;
    }

    public String getOrderDatetime() {
        return orderDatetime;
    }

    public void setOrderDatetime(String orderDatetime) {
        this.orderDatetime = orderDatetime;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getPaybleAmt() {
        return paybleAmt;
    }

    public void setPaybleAmt(String paybleAmt) {
        this.paybleAmt = paybleAmt;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getAltMobile() {
        return altMobile;
    }

    public void setAltMobile(String altMobile) {
        this.altMobile = altMobile;
    }

    public String getPaymentConfirmation() {
        return paymentConfirmation;
    }

    public void setPaymentConfirmation(String paymentConfirmation) {
        this.paymentConfirmation = paymentConfirmation;
    }
}
