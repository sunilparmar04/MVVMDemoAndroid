package com.mvvmdemo.ui.splash;

import com.mvvmdemo.data.DataManager;
import com.mvvmdemo.utils.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;


@Module
public class SplashActivityModule {

    @Provides
    SplashViewModel provideSplashViewModel(DataManager dataManager,SchedulerProvider schedulerProvider) {
        return new SplashViewModel( dataManager,schedulerProvider);
    }
}
