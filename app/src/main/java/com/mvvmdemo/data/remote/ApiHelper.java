package com.mvvmdemo.data.remote;

import com.mvvmdemo.data.model.api.BlogResponse;
import com.mvvmdemo.data.model.api.LoginRequest;
import com.mvvmdemo.data.model.api.LoginResponse;
import com.mvvmdemo.data.model.api.LogoutResponse;
import com.mvvmdemo.data.model.api.OpenSourceResponse;

import io.reactivex.Single;

public interface ApiHelper {

    Single<LoginResponse> doFacebookLoginApiCall(LoginRequest.FacebookLoginRequest request);

    Single<LoginResponse> doGoogleLoginApiCall(LoginRequest.GoogleLoginRequest request);

    Single<LogoutResponse> doLogoutApiCall();

    Single<LoginResponse> doServerLoginApiCall(LoginRequest.ServerLoginRequest request);

    ApiHeader getApiHeader();

    Single<BlogResponse> getBlogApiCall();

    Single<OpenSourceResponse> getOpenSourceApiCall();
}
