// Generated by Dagger (https://google.github.io/dagger).
package com.mvvmdemo.data.local.db;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class AppDbHelper_Factory implements Factory<AppDbHelper> {
  private final Provider<AppDatabase> appDatabaseProvider;

  public AppDbHelper_Factory(Provider<AppDatabase> appDatabaseProvider) {
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public AppDbHelper get() {
    return new AppDbHelper(appDatabaseProvider.get());
  }

  public static AppDbHelper_Factory create(Provider<AppDatabase> appDatabaseProvider) {
    return new AppDbHelper_Factory(appDatabaseProvider);
  }
}
