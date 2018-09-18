package com.mvvmdemo.ui.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;


import com.mvvmdemo.R;

import javax.inject.Inject;

import com.mvvmdemo.databinding.ActivitySplashBinding;
import com.mvvmdemo.ui.base.BaseActivity;

import com.mvvmdemo.BR;
import com.mvvmdemo.ui.login.LoginActivity;
import com.mvvmdemo.ui.main.MainActivity;

public class SplashActivity extends BaseActivity<ActivitySplashBinding, SplashViewModel> implements SplashNavigator {

    @Inject
    SplashViewModel mSplashViewModel;

    public static Intent newIntent(Context context) {
        return new Intent(context, SplashActivity.class);
    }

    @Override
    public int getBindingVariable() {
        Log.v("home_activity", "getBindingVariable");
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    public SplashViewModel getViewModel() {
        return mSplashViewModel;
    }

    @Override
    public void openLoginActivity() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= LoginActivity.newIntent(SplashActivity.this);
                startActivity(intent);
                finish();
            }
        },2000);

    }

    @Override
    public void openMainActivity() {

        Log.v("home_activity", "openMainActivity");

        Intent intent= MainActivity.newIntent(this);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("home_activity", "onCreate");
        mSplashViewModel.setNavigator(this);
        mSplashViewModel.decideNextActivity();
    }
}
