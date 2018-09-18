// Generated by Dagger (https://google.github.io/dagger).
package com.mvvmdemo.ui.about;

import com.mvvmdemo.data.DataManager;
import com.mvvmdemo.utils.rx.SchedulerProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class AboutFragmentModule_ProvideAboutViewModelFactory
    implements Factory<AboutViewModel> {
  private final AboutFragmentModule module;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  public AboutFragmentModule_ProvideAboutViewModelFactory(
      AboutFragmentModule module,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider) {
    this.module = module;
    this.dataManagerProvider = dataManagerProvider;
    this.schedulerProvider = schedulerProvider;
  }

  @Override
  public AboutViewModel get() {
    return Preconditions.checkNotNull(
        module.provideAboutViewModel(dataManagerProvider.get(), schedulerProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AboutFragmentModule_ProvideAboutViewModelFactory create(
      AboutFragmentModule module,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider) {
    return new AboutFragmentModule_ProvideAboutViewModelFactory(
        module, dataManagerProvider, schedulerProvider);
  }

  public static AboutViewModel proxyProvideAboutViewModel(
      AboutFragmentModule instance, DataManager dataManager, SchedulerProvider schedulerProvider) {
    return Preconditions.checkNotNull(
        instance.provideAboutViewModel(dataManager, schedulerProvider),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
