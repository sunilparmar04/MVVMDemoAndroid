// Generated by Dagger (https://google.github.io/dagger).
package com.mvvmdemo.ui.feed;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class FeedActivityModule_ProvideFeedPagerAdapterFactory
    implements Factory<FeedPagerAdapter> {
  private final FeedActivityModule module;

  private final Provider<FeedActivity> activityProvider;

  public FeedActivityModule_ProvideFeedPagerAdapterFactory(
      FeedActivityModule module, Provider<FeedActivity> activityProvider) {
    this.module = module;
    this.activityProvider = activityProvider;
  }

  @Override
  public FeedPagerAdapter get() {
    return Preconditions.checkNotNull(
        module.provideFeedPagerAdapter(activityProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static FeedActivityModule_ProvideFeedPagerAdapterFactory create(
      FeedActivityModule module, Provider<FeedActivity> activityProvider) {
    return new FeedActivityModule_ProvideFeedPagerAdapterFactory(module, activityProvider);
  }

  public static FeedPagerAdapter proxyProvideFeedPagerAdapter(
      FeedActivityModule instance, FeedActivity activity) {
    return Preconditions.checkNotNull(
        instance.provideFeedPagerAdapter(activity),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
