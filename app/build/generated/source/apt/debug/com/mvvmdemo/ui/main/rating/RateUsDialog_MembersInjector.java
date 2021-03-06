// Generated by Dagger (https://google.github.io/dagger).
package com.mvvmdemo.ui.main.rating;

import dagger.MembersInjector;
import javax.inject.Provider;

public final class RateUsDialog_MembersInjector implements MembersInjector<RateUsDialog> {
  private final Provider<RateUsViewModel> mRateUsViewModelProvider;

  public RateUsDialog_MembersInjector(Provider<RateUsViewModel> mRateUsViewModelProvider) {
    this.mRateUsViewModelProvider = mRateUsViewModelProvider;
  }

  public static MembersInjector<RateUsDialog> create(
      Provider<RateUsViewModel> mRateUsViewModelProvider) {
    return new RateUsDialog_MembersInjector(mRateUsViewModelProvider);
  }

  @Override
  public void injectMembers(RateUsDialog instance) {
    injectMRateUsViewModel(instance, mRateUsViewModelProvider.get());
  }

  public static void injectMRateUsViewModel(
      RateUsDialog instance, RateUsViewModel mRateUsViewModel) {
    instance.mRateUsViewModel = mRateUsViewModel;
  }
}
