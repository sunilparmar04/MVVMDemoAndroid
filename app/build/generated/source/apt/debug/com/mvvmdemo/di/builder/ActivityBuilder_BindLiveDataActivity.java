package com.mvvmdemo.di.builder;

import android.app.Activity;
import com.mvvmdemo.ui.livedata.LiveDataActivity;
import com.mvvmdemo.ui.livedata.LiveDataActivityModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilder_BindLiveDataActivity.LiveDataActivitySubcomponent.class)
public abstract class ActivityBuilder_BindLiveDataActivity {
  private ActivityBuilder_BindLiveDataActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(LiveDataActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      LiveDataActivitySubcomponent.Builder builder);

  @Subcomponent(modules = LiveDataActivityModule.class)
  public interface LiveDataActivitySubcomponent extends AndroidInjector<LiveDataActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<LiveDataActivity> {}
  }
}
