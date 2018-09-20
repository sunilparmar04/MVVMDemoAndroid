package com.mvvmdemo.ui.feed.blogs;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;


@Module
public abstract class BlogFragmentProvider {

    @ContributesAndroidInjector(modules = BlogFragmentModule.class)
    abstract BlogFragment provideBlogFragmentFactory();
}
