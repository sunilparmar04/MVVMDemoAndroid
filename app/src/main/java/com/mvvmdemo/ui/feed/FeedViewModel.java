package com.mvvmdemo.ui.feed;

import com.mvvmdemo.data.DataManager;
import com.mvvmdemo.ui.base.BaseViewModel;
import com.mvvmdemo.utils.rx.SchedulerProvider;

public class FeedViewModel extends BaseViewModel {

    public FeedViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }
}
