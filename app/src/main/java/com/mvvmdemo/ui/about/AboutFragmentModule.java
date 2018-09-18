package com.mvvmdemo.ui.about;

import com.mvvmdemo.data.DataManager;
import com.mvvmdemo.utils.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;


@Module
public class AboutFragmentModule {

    @Provides
    AboutViewModel provideAboutViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        return new AboutViewModel(dataManager, schedulerProvider);
    }
}
