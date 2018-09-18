package com.mvvmdemo.ui.main.rating;

import com.mvvmdemo.data.DataManager;
import com.mvvmdemo.utils.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;

@Module
public class RateUsDialogModule {

    @Provides
    RateUsViewModel provideRateUsViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        return new RateUsViewModel(dataManager, schedulerProvider);
    }
}
