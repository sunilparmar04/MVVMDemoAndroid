package com.mvvmdemo.ui.splash;

import com.mvvmdemo.data.DataManager;
import com.mvvmdemo.ui.base.BaseViewModel;
import com.mvvmdemo.utils.rx.SchedulerProvider;


public class SplashViewModel extends BaseViewModel<SplashNavigator> {

    public SplashViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }


    public void decideNextActivity() {
        if (getDataManager().getCurrentUserLoggedInMode() == DataManager.LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT.getType()) {
            getNavigator().openLoginActivity();

        } else {
            getNavigator().openMainActivity();
        }
    }



}
