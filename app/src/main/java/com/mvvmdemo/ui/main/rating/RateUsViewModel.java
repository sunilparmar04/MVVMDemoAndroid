package com.mvvmdemo.ui.main.rating;

import com.mvvmdemo.data.DataManager;
import com.mvvmdemo.ui.base.BaseViewModel;
import com.mvvmdemo.utils.rx.SchedulerProvider;

public class RateUsViewModel extends BaseViewModel<RateUsCallback> {

    public RateUsViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }

    public void onLaterClick() {
        getNavigator().dismissDialog();
    }

    public void onSubmitClick() {
        getNavigator().dismissDialog();
    }
}
