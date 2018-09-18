package com.mvvmdemo.di.builder;

import android.app.Activity;
import com.mvvmdemo.ui.login.LoginActivity;
import com.mvvmdemo.ui.login.LoginActivityModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilder_BindLoginActivity.LoginActivitySubcomponent.class)
public abstract class ActivityBuilder_BindLoginActivity {
  private ActivityBuilder_BindLoginActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(LoginActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      LoginActivitySubcomponent.Builder builder);

  @Subcomponent(modules = LoginActivityModule.class)
  public interface LoginActivitySubcomponent extends AndroidInjector<LoginActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<LoginActivity> {}
  }
}
