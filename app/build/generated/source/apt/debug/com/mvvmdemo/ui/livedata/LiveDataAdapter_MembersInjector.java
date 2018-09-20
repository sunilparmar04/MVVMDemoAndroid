// Generated by Dagger (https://google.github.io/dagger).
package com.mvvmdemo.ui.livedata;

import android.content.Context;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class LiveDataAdapter_MembersInjector implements MembersInjector<LiveDataAdapter> {
  private final Provider<Context> mContextProvider;

  public LiveDataAdapter_MembersInjector(Provider<Context> mContextProvider) {
    this.mContextProvider = mContextProvider;
  }

  public static MembersInjector<LiveDataAdapter> create(Provider<Context> mContextProvider) {
    return new LiveDataAdapter_MembersInjector(mContextProvider);
  }

  @Override
  public void injectMembers(LiveDataAdapter instance) {
    injectMContext(instance, mContextProvider.get());
  }

  public static void injectMContext(LiveDataAdapter instance, Context mContext) {
    instance.mContext = mContext;
  }
}
