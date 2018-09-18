package com.mvvmdemo.ui.main.rating;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = RateUsDialogProvider_ProvideRateUsDialogFactory.RateUsDialogSubcomponent.class
)
public abstract class RateUsDialogProvider_ProvideRateUsDialogFactory {
  private RateUsDialogProvider_ProvideRateUsDialogFactory() {}

  @Binds
  @IntoMap
  @FragmentKey(RateUsDialog.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      RateUsDialogSubcomponent.Builder builder);

  @Subcomponent(modules = RateUsDialogModule.class)
  public interface RateUsDialogSubcomponent extends AndroidInjector<RateUsDialog> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<RateUsDialog> {}
  }
}
