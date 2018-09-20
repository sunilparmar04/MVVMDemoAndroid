package com.mvvmdemo.di.builder;

import com.mvvmdemo.ui.livedata.LiveDataActivity;
import com.mvvmdemo.ui.livedata.LiveDataActivityModule;
import com.mvvmdemo.ui.about.AboutFragmentProvider;
import com.mvvmdemo.ui.feed.FeedActivity;
import com.mvvmdemo.ui.feed.FeedActivityModule;
import com.mvvmdemo.ui.feed.blogs.BlogFragmentProvider;
import com.mvvmdemo.ui.login.LoginActivity;
import com.mvvmdemo.ui.login.LoginActivityModule;
import com.mvvmdemo.ui.main.MainActivity;
import com.mvvmdemo.ui.main.MainActivityModule;
import com.mvvmdemo.ui.main.rating.RateUsDialogProvider;
import com.mvvmdemo.ui.splash.SplashActivity;
import com.mvvmdemo.ui.splash.SplashActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;


@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = {
            FeedActivityModule.class,
            BlogFragmentProvider.class})
    abstract FeedActivity bindFeedActivity();


    @ContributesAndroidInjector(modules = {
            MainActivityModule.class,
            AboutFragmentProvider.class,
            RateUsDialogProvider.class})
    abstract MainActivity bindMainActivity();


    @ContributesAndroidInjector(modules = SplashActivityModule.class)
    abstract SplashActivity bindSplashActivity();

    @ContributesAndroidInjector(modules = LoginActivityModule.class)
    abstract LoginActivity bindLoginActivity();

    @ContributesAndroidInjector(modules = LiveDataActivityModule.class)
    abstract LiveDataActivity bindLiveDataActivity();
}
