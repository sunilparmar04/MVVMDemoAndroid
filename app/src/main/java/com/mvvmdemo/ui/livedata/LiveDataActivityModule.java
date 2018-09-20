package com.mvvmdemo.ui.livedata;

import android.support.v7.widget.LinearLayoutManager;

import com.mvvmdemo.data.DataManager;
import com.mvvmdemo.utils.rx.SchedulerProvider;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;

@Module
public class LiveDataActivityModule {


    @Provides
    LiveDataViewModel provideLiveDataViewModel(DataManager dataManager,
                                           SchedulerProvider schedulerProvider) {
        return new LiveDataViewModel(dataManager, schedulerProvider);
    }

    @Provides
    LiveDataAdapter provideLiveDataAdapter() {
        return new LiveDataAdapter(new ArrayList<>());
    }

    @Provides
    LinearLayoutManager provideLinearLayoutManager(LiveDataActivity liveDataActivity) {
        return new LinearLayoutManager(liveDataActivity);
    }


    @Provides
    WeakReference<LiveDataActivity> provideWeakReferenceContext(LiveDataActivity activity) {
        return new WeakReference<>(activity);
    }


}
