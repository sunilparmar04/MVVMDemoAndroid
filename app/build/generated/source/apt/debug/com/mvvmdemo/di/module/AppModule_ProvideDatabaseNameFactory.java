// Generated by Dagger (https://google.github.io/dagger).
package com.mvvmdemo.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class AppModule_ProvideDatabaseNameFactory implements Factory<String> {
  private final AppModule module;

  public AppModule_ProvideDatabaseNameFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return Preconditions.checkNotNull(
        module.provideDatabaseName(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AppModule_ProvideDatabaseNameFactory create(AppModule module) {
    return new AppModule_ProvideDatabaseNameFactory(module);
  }

  public static String proxyProvideDatabaseName(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.provideDatabaseName(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
