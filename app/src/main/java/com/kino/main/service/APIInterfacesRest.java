package com.kino.main.service;

/**
 * Created by user on 1/10/2018.
 */



import com.kino.main.modelservice.LoginModel.LoginModel;
import com.kino.main.modelservice.Market;
import com.kino.main.modelservice.Produk;
import com.kino.main.modelservice.UpdateOrder;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

/**
 * Created by anupamchugh on 09/01/17.
 */

 public interface APIInterfacesRest {

 @GET("api/kino/market")
 Call<Market> getMarket();

 @GET("api/kino/product")
 Call<Produk> getProduk(@Query("outlet_id") String outlet_id, @Query("market_id") String market_id,@Query("type") String type);


    @FormUrlEncoded
    @POST("api/user/login")
    Call<LoginModel> getAuthentication(@Field("username") String username, @Field("password") String password);

/*
    @GET("api/tbl_order/all")
    Call<Order> getOrder(@Query("filter") String filter, @Query("field") String field, @Query("start") String start, @Query("limit") String limit);
*/
   @Multipart
   @POST("api/activityreport/add")
   Call<UpdateOrder> updateData(
           @Part("jawaban") RequestBody jawaban,
           @Part("outlet_id") RequestBody outlet_id,
           @Part("lonlat") RequestBody lonlat,


           @Part("photo\"; filename=\"image.jpeg\"") RequestBody photo
   );




}

