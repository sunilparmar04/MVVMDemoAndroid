package com.mvvmdemo.ui.about;


import com.mvvmdemo.data.DataManager;
import com.mvvmdemo.ui.base.BaseViewModel;
import com.mvvmdemo.utils.rx.SchedulerProvider;

public class AboutViewModel extends BaseViewModel<AboutNavigator> {

    public AboutViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }

    public void onNavBackClick() {
        getNavigator().goBack();
    }
}
