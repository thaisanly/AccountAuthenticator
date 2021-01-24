package com.udinic.accounts_authenticator_example.authentication;

import com.udinic.accounts_authenticator_example.authentication.network.Login;
import com.udinic.accounts_authenticator_example.authentication.network.Response;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface LoginInterface {
    @FormUrlEncoded
    @POST("v1/email-login")
    Call<Response<Login>> login(@Field("email") String email, @Field("password") String password, @Field("device_id") String device_id);
}