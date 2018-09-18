package com.mvvmdemo.di.builder;

import android.app.Activity;
import com.mvvmdemo.ui.about.AboutFragmentProvider;
import com.mvvmdemo.ui.main.MainActivity;
import com.mvvmdemo.ui.main.MainActivityModule;
import com.mvvmdemo.ui.main.rating.RateUsDialogProvider;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilder_BindMainActivity.MainActivitySubcomponent.class)
public abstract class ActivityBuilder_BindMainActivity {
  private ActivityBuilder_BindMainActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(MainActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Builder builder);

  @Subcomponent(
    modules = {MainActivityModule.class, AboutFragmentProvider.class, RateUsDialogProvider.class}
  )
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {}
  }
}
