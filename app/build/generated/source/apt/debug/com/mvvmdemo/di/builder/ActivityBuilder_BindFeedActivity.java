package com.mvvmdemo.di.builder;

import android.app.Activity;
import com.mvvmdemo.ui.feed.FeedActivity;
import com.mvvmdemo.ui.feed.FeedActivityModule;
import com.mvvmdemo.ui.feed.blogs.BlogFragmentProvider;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilder_BindFeedActivity.FeedActivitySubcomponent.class)
public abstract class ActivityBuilder_BindFeedActivity {
  private ActivityBuilder_BindFeedActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(FeedActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      FeedActivitySubcomponent.Builder builder);

  @Subcomponent(modules = {FeedActivityModule.class, BlogFragmentProvider.class})
  public interface FeedActivitySubcomponent extends AndroidInjector<FeedActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<FeedActivity> {}
  }
}
