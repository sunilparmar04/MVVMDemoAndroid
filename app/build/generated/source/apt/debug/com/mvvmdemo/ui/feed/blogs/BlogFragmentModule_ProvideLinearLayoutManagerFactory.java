// Generated by Dagger (https://google.github.io/dagger).
package com.mvvmdemo.ui.feed.blogs;

import android.support.v7.widget.LinearLayoutManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class BlogFragmentModule_ProvideLinearLayoutManagerFactory
    implements Factory<LinearLayoutManager> {
  private final BlogFragmentModule module;

  private final Provider<BlogFragment> fragmentProvider;

  public BlogFragmentModule_ProvideLinearLayoutManagerFactory(
      BlogFragmentModule module, Provider<BlogFragment> fragmentProvider) {
    this.module = module;
    this.fragmentProvider = fragmentProvider;
  }

  @Override
  public LinearLayoutManager get() {
    return Preconditions.checkNotNull(
        module.provideLinearLayoutManager(fragmentProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static BlogFragmentModule_ProvideLinearLayoutManagerFactory create(
      BlogFragmentModule module, Provider<BlogFragment> fragmentProvider) {
    return new BlogFragmentModule_ProvideLinearLayoutManagerFactory(module, fragmentProvider);
  }

  public static LinearLayoutManager proxyProvideLinearLayoutManager(
      BlogFragmentModule instance, BlogFragment fragment) {
    return Preconditions.checkNotNull(
        instance.provideLinearLayoutManager(fragment),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
