package com.mvvmdemo.ui.about;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = AboutFragmentProvider_ProvideAboutFragmentFactory.AboutFragmentSubcomponent.class
)
public abstract class AboutFragmentProvider_ProvideAboutFragmentFactory {
  private AboutFragmentProvider_ProvideAboutFragmentFactory() {}

  @Binds
  @IntoMap
  @FragmentKey(AboutFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      AboutFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = AboutFragmentModule.class)
  public interface AboutFragmentSubcomponent extends AndroidInjector<AboutFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<AboutFragment> {}
  }
}
