package com.mbinfo.huge.data.network

import com.mbinfo.huge.data.model.CheckOutModel
import com.mbinfo.huge.data.model.Sms
import com.mbinfo.huge.data.model.SpinnerDataModel
import com.mbinfo.huge.data.model.cartmodel.CartDataModel
import com.mbinfo.huge.data.model.cartmodel.CartModel
import com.mbinfo.huge.data.model.catmodel.CatModel
import com.mbinfo.huge.data.model.city.City
import com.mbinfo.huge.data.model.dataremove.RemoveItem
import com.mbinfo.huge.data.model.ordermodel.OrderDetail
import com.mbinfo.huge.data.model.product.Product
import com.mbinfo.huge.data.model.productdetail.ProductDetails
import com.mbinfo.huge.data.model.profilemodel.Profile
import com.mbinfo.huge.data.model.retail.Retail
import com.mbinfo.huge.data.model.retailer.RetailerModel
import com.mbinfo.huge.data.model.state.StateModel
import com.mbinfo.huge.data.model.tabmodel.TabProduct
import com.mbinfo.huge.data.model.tehsil.Tehsil
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface ApiRequestNet {
    @FormUrlEncoded
    @POST("send-otp.php")
    suspend fun processOtp(@Field("mobile") mobile: String?,@Field("device_id") deviceid: String): Response<Sms>?

    @FormUrlEncoded
    @POST("verify-number.php")
    suspend fun processVerify(@Field("otp") otp: String?, @Field("mobile") mobile: String?, deviceid: String?): Response<Sms?>?

    @GET("users/getusertype")
    fun loadSpinner(): Call<SpinnerDataModel?>?

    @GET("users/getretailers")
    fun loadRetail(): Call<Retail?>?

    @GET("users/getaddresslist")
    fun loadState(): Call<StateModel?>?

    @FormUrlEncoded
    @POST("users/register")
    fun processReg(@Field("name") username: String?, @Field("f_name") fathername: String?,
                   @Field("b_name") businessname: String?, @Field("mobile") mobile: String?,
                   @Field("utype") utype: String?, @Field("aadhaar") adhar: String?,
                   @Field("gstin") gstin: String?, @Field("village") village: String?,
                   @Field("landmark") landmark: String?, @Field("panchayat") panchyat: String?,
                   @Field("tehsil") teshil: String?, @Field("district") district: String?,
                   @Field("state") state: String?, @Field("pincode") pincode: String?): Call<Sms?>?

    @Multipart
    @POST("users/upload/profilepic")
    fun uploadImage(@Header("x-auth-token") auth: String?, @Part file: MultipartBody.Part?,
                    @Part("pic") description: RequestBody?): Call<Sms?>?

    @GET("users/getuser")
    fun profileGet(@Header("x-auth-token") authkey: String?): Call<Profile?>?

    @get:GET("users/getcategory")
    val catData: Call<CatModel?>?

    @GET("users/getlisttabs")
    fun loadTabpinner(): Call<TabProduct?>?

    @FormUrlEncoded
    @POST("users/getproducts")
    fun productGet(@Header("x-auth-token") authkey: String?, @Field("tab") tab: Int, @Field("cat") cat: Int): Call<Product?>?

    @FormUrlEncoded
    @POST("users/getproducts")
    fun productGetTab(@Header("x-auth-token") authkey: String?, @Field("tab") tab: Int, @Field("cat") cat: Int): Call<RetailerModel?>?

    @FormUrlEncoded
    @POST("users/getproduct")
    fun productGetDetail(@Header("x-auth-token") authkey: String?, @Field("pid") pid: Int): Call<ProductDetails?>?

    @FormUrlEncoded
    @POST("users/addtocart")
    fun addCartDetail(@Header("x-auth-token") authkey: String?, @Field("pid") pid: Int, @Field("quantity") quantiy: Int, @Field("price") price: Float?): Call<CartModel?>?

    @GET("users/getcartitems")
    fun getCartData(@Header("x-auth-token") authkey: String?): Call<CartDataModel?>?

    @FormUrlEncoded
    @POST("users/deletecartitem")
    fun removeCartItem(@Header("x-auth-token") authkey: String?, @Field("pid") pid: Int): Call<RemoveItem?>?

    @POST("users/emptycart")
    fun removeCartAllItem(@Header("x-auth-token") authkey: String?): Call<RemoveItem?>?

    @FormUrlEncoded
    @POST("users/placeorder")
    fun OrderPlace(@Header("x-auth-token") authkey: String?,
                   @Field("village") village: String?, @Field("landmark") landmark: String?,
                   @Field("panchayat") panchyat: String?, @Field("tehsil") tehsil: String?,
                   @Field("district") distict: String?,
                   @Field("state") state: String?, @Field("pincode") pincode: String?,
                   @Field("alt_mobile") mobile: String?, @Field("pay_mode") mode: String?): Call<CheckOutModel?>?

    @GET("users/orders")
    fun OrderGet(@Header("x-auth-token") authkey: String?): Call<OrderDetail?>?

    @FormUrlEncoded
    @POST("users/getaddresslist")
    fun loadCity(@Field("stateid") stateid: String?): Call<City?>?

    @FormUrlEncoded
    @POST("users/getaddresslist")
    fun loadTehsilData(@Field("cityid") cityid: Int): Call<Tehsil?>?


    }

