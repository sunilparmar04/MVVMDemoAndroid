package com.mvvmdemo.ui.feed.blogs;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = BlogFragmentProvider_ProvideBlogFragmentFactory.BlogFragmentSubcomponent.class
)
public abstract class BlogFragmentProvider_ProvideBlogFragmentFactory {
  private BlogFragmentProvider_ProvideBlogFragmentFactory() {}

  @Binds
  @IntoMap
  @FragmentKey(BlogFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      BlogFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = BlogFragmentModule.class)
  public interface BlogFragmentSubcomponent extends AndroidInjector<BlogFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BlogFragment> {}
  }
}
