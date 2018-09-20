// Generated by Dagger (https://google.github.io/dagger).
package com.mvvmdemo.ui.livedata;

import com.mvvmdemo.data.DataManager;
import com.mvvmdemo.utils.rx.SchedulerProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class LiveDataActivityModule_ProvideLiveDataViewModelFactory
    implements Factory<LiveDataViewModel> {
  private final LiveDataActivityModule module;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  public LiveDataActivityModule_ProvideLiveDataViewModelFactory(
      LiveDataActivityModule module,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider) {
    this.module = module;
    this.dataManagerProvider = dataManagerProvider;
    this.schedulerProvider = schedulerProvider;
  }

  @Override
  public LiveDataViewModel get() {
    return Preconditions.checkNotNull(
        module.provideLiveDataViewModel(dataManagerProvider.get(), schedulerProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static LiveDataActivityModule_ProvideLiveDataViewModelFactory create(
      LiveDataActivityModule module,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider) {
    return new LiveDataActivityModule_ProvideLiveDataViewModelFactory(
        module, dataManagerProvider, schedulerProvider);
  }

  public static LiveDataViewModel proxyProvideLiveDataViewModel(
      LiveDataActivityModule instance,
      DataManager dataManager,
      SchedulerProvider schedulerProvider) {
    return Preconditions.checkNotNull(
        instance.provideLiveDataViewModel(dataManager, schedulerProvider),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}