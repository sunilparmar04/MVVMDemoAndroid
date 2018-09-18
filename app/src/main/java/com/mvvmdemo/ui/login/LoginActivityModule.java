package com.mvvmdemo.ui.login;


import com.mvvmdemo.data.DataManager;
import com.mvvmdemo.utils.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginActivityModule {

    @Provides
    LoginViewModel provideLoginViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        return new LoginViewModel(dataManager, schedulerProvider);
    }
}
