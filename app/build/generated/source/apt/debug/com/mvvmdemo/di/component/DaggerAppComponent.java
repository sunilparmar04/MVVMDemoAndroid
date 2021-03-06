// Generated by Dagger (https://google.github.io/dagger).
package com.mvvmdemo.di.component;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.ViewModelProvider;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import com.google.gson.Gson;
import com.mvvmdemo.MvvmApp;
import com.mvvmdemo.MvvmApp_MembersInjector;
import com.mvvmdemo.data.AppDataManager;
import com.mvvmdemo.data.AppDataManager_Factory;
import com.mvvmdemo.data.DataManager;
import com.mvvmdemo.data.local.db.AppDatabase;
import com.mvvmdemo.data.local.db.AppDbHelper;
import com.mvvmdemo.data.local.db.AppDbHelper_Factory;
import com.mvvmdemo.data.local.db.DbHelper;
import com.mvvmdemo.data.local.prefs.AppPreferencesHelper_Factory;
import com.mvvmdemo.data.local.prefs.PreferencesHelper;
import com.mvvmdemo.data.remote.ApiHeader;
import com.mvvmdemo.data.remote.ApiHeader_Factory;
import com.mvvmdemo.data.remote.ApiHeader_PublicApiHeader_Factory;
import com.mvvmdemo.data.remote.ApiHelper;
import com.mvvmdemo.data.remote.AppApiHelper;
import com.mvvmdemo.data.remote.AppApiHelper_Factory;
import com.mvvmdemo.di.builder.ActivityBuilder_BindFeedActivity;
import com.mvvmdemo.di.builder.ActivityBuilder_BindLiveDataActivity;
import com.mvvmdemo.di.builder.ActivityBuilder_BindLoginActivity;
import com.mvvmdemo.di.builder.ActivityBuilder_BindMainActivity;
import com.mvvmdemo.di.builder.ActivityBuilder_BindSplashActivity;
import com.mvvmdemo.di.module.AppModule;
import com.mvvmdemo.di.module.AppModule_ProvideApiHelperFactory;
import com.mvvmdemo.di.module.AppModule_ProvideApiKeyFactory;
import com.mvvmdemo.di.module.AppModule_ProvideAppDatabaseFactory;
import com.mvvmdemo.di.module.AppModule_ProvideContextFactory;
import com.mvvmdemo.di.module.AppModule_ProvideDataManagerFactory;
import com.mvvmdemo.di.module.AppModule_ProvideDatabaseNameFactory;
import com.mvvmdemo.di.module.AppModule_ProvideDbHelperFactory;
import com.mvvmdemo.di.module.AppModule_ProvideGsonFactory;
import com.mvvmdemo.di.module.AppModule_ProvidePreferenceNameFactory;
import com.mvvmdemo.di.module.AppModule_ProvidePreferencesHelperFactory;
import com.mvvmdemo.di.module.AppModule_ProvideProtectedApiHeaderFactory;
import com.mvvmdemo.di.module.AppModule_ProvideSchedulerProviderFactory;
import com.mvvmdemo.ui.about.AboutFragment;
import com.mvvmdemo.ui.about.AboutFragmentModule;
import com.mvvmdemo.ui.about.AboutFragmentModule_ProvideAboutViewModelFactory;
import com.mvvmdemo.ui.about.AboutFragmentProvider_ProvideAboutFragmentFactory;
import com.mvvmdemo.ui.about.AboutFragment_MembersInjector;
import com.mvvmdemo.ui.about.AboutViewModel;
import com.mvvmdemo.ui.feed.FeedActivity;
import com.mvvmdemo.ui.feed.FeedActivityModule;
import com.mvvmdemo.ui.feed.FeedActivityModule_ProvideFeedPagerAdapterFactory;
import com.mvvmdemo.ui.feed.FeedActivityModule_ProvideFeedViewModelFactory;
import com.mvvmdemo.ui.feed.FeedActivity_MembersInjector;
import com.mvvmdemo.ui.feed.FeedPagerAdapter;
import com.mvvmdemo.ui.feed.FeedViewModel;
import com.mvvmdemo.ui.feed.blogs.BlogFragment;
import com.mvvmdemo.ui.feed.blogs.BlogFragmentModule;
import com.mvvmdemo.ui.feed.blogs.BlogFragmentModule_BlogViewModelFactory;
import com.mvvmdemo.ui.feed.blogs.BlogFragmentModule_ProvideBlogAdapterFactory;
import com.mvvmdemo.ui.feed.blogs.BlogFragmentModule_ProvideBlogViewModelFactory;
import com.mvvmdemo.ui.feed.blogs.BlogFragmentModule_ProvideLinearLayoutManagerFactory;
import com.mvvmdemo.ui.feed.blogs.BlogFragmentProvider_ProvideBlogFragmentFactory;
import com.mvvmdemo.ui.feed.blogs.BlogFragment_MembersInjector;
import com.mvvmdemo.ui.feed.blogs.BlogViewModel;
import com.mvvmdemo.ui.livedata.LiveDataActivity;
import com.mvvmdemo.ui.livedata.LiveDataActivityModule;
import com.mvvmdemo.ui.livedata.LiveDataActivityModule_ProvideLinearLayoutManagerFactory;
import com.mvvmdemo.ui.livedata.LiveDataActivityModule_ProvideLiveDataAdapterFactory;
import com.mvvmdemo.ui.livedata.LiveDataActivityModule_ProvideLiveDataViewModelFactory;
import com.mvvmdemo.ui.livedata.LiveDataActivity_MembersInjector;
import com.mvvmdemo.ui.livedata.LiveDataViewModel;
import com.mvvmdemo.ui.login.LoginActivity;
import com.mvvmdemo.ui.login.LoginActivityModule;
import com.mvvmdemo.ui.login.LoginActivityModule_ProvideLoginViewModelFactory;
import com.mvvmdemo.ui.login.LoginActivity_MembersInjector;
import com.mvvmdemo.ui.login.LoginViewModel;
import com.mvvmdemo.ui.main.MainActivity;
import com.mvvmdemo.ui.main.MainActivityModule;
import com.mvvmdemo.ui.main.MainActivityModule_MainViewModelProviderFactory;
import com.mvvmdemo.ui.main.MainActivityModule_ProvideMainViewModelFactory;
import com.mvvmdemo.ui.main.MainActivity_MembersInjector;
import com.mvvmdemo.ui.main.MainViewModel;
import com.mvvmdemo.ui.main.rating.RateUsDialog;
import com.mvvmdemo.ui.main.rating.RateUsDialogModule;
import com.mvvmdemo.ui.main.rating.RateUsDialogModule_ProvideRateUsViewModelFactory;
import com.mvvmdemo.ui.main.rating.RateUsDialogProvider_ProvideRateUsDialogFactory;
import com.mvvmdemo.ui.main.rating.RateUsDialog_MembersInjector;
import com.mvvmdemo.ui.main.rating.RateUsViewModel;
import com.mvvmdemo.ui.splash.SplashActivity;
import com.mvvmdemo.ui.splash.SplashActivityModule;
import com.mvvmdemo.ui.splash.SplashActivityModule_ProvideSplashViewModelFactory;
import com.mvvmdemo.ui.splash.SplashActivity_MembersInjector;
import com.mvvmdemo.ui.splash.SplashViewModel;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import javax.inject.Provider;

public final class DaggerAppComponent implements AppComponent {
  private AppModule appModule;

  private Provider<ActivityBuilder_BindFeedActivity.FeedActivitySubcomponent.Builder>
      feedActivitySubcomponentBuilderProvider;

  private Provider<ActivityBuilder_BindMainActivity.MainActivitySubcomponent.Builder>
      mainActivitySubcomponentBuilderProvider;

  private Provider<ActivityBuilder_BindSplashActivity.SplashActivitySubcomponent.Builder>
      splashActivitySubcomponentBuilderProvider;

  private Provider<ActivityBuilder_BindLoginActivity.LoginActivitySubcomponent.Builder>
      loginActivitySubcomponentBuilderProvider;

  private Provider<ActivityBuilder_BindLiveDataActivity.LiveDataActivitySubcomponent.Builder>
      liveDataActivitySubcomponentBuilderProvider;

  private Provider<Application> applicationProvider;

  private Provider<Context> provideContextProvider;

  private AppModule_ProvideDatabaseNameFactory provideDatabaseNameProvider;

  private Provider<AppDatabase> provideAppDatabaseProvider;

  private Provider<AppDbHelper> appDbHelperProvider;

  private Provider<DbHelper> provideDbHelperProvider;

  private AppModule_ProvidePreferenceNameFactory providePreferenceNameProvider;

  private AppPreferencesHelper_Factory appPreferencesHelperProvider;

  private Provider<PreferencesHelper> providePreferencesHelperProvider;

  private AppModule_ProvideApiKeyFactory provideApiKeyProvider;

  private ApiHeader_PublicApiHeader_Factory publicApiHeaderProvider;

  private Provider<ApiHeader.ProtectedApiHeader> provideProtectedApiHeaderProvider;

  private Provider<ApiHeader> apiHeaderProvider;

  private Provider<AppApiHelper> appApiHelperProvider;

  private Provider<ApiHelper> provideApiHelperProvider;

  private Provider<Gson> provideGsonProvider;

  private Provider<AppDataManager> appDataManagerProvider;

  private Provider<DataManager> provideDataManagerProvider;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  private Map<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
      getMapOfClassOfAndProviderOfFactoryOf() {
    return MapBuilder
        .<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
            newMapBuilder(5)
        .put(FeedActivity.class, (Provider) feedActivitySubcomponentBuilderProvider)
        .put(MainActivity.class, (Provider) mainActivitySubcomponentBuilderProvider)
        .put(SplashActivity.class, (Provider) splashActivitySubcomponentBuilderProvider)
        .put(LoginActivity.class, (Provider) loginActivitySubcomponentBuilderProvider)
        .put(LiveDataActivity.class, (Provider) liveDataActivitySubcomponentBuilderProvider)
        .build();
  }

  private DispatchingAndroidInjector<Activity> getDispatchingAndroidInjectorOfActivity() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.feedActivitySubcomponentBuilderProvider =
        new Provider<ActivityBuilder_BindFeedActivity.FeedActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuilder_BindFeedActivity.FeedActivitySubcomponent.Builder get() {
            return new FeedActivitySubcomponentBuilder();
          }
        };
    this.mainActivitySubcomponentBuilderProvider =
        new Provider<ActivityBuilder_BindMainActivity.MainActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuilder_BindMainActivity.MainActivitySubcomponent.Builder get() {
            return new MainActivitySubcomponentBuilder();
          }
        };
    this.splashActivitySubcomponentBuilderProvider =
        new Provider<ActivityBuilder_BindSplashActivity.SplashActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuilder_BindSplashActivity.SplashActivitySubcomponent.Builder get() {
            return new SplashActivitySubcomponentBuilder();
          }
        };
    this.loginActivitySubcomponentBuilderProvider =
        new Provider<ActivityBuilder_BindLoginActivity.LoginActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuilder_BindLoginActivity.LoginActivitySubcomponent.Builder get() {
            return new LoginActivitySubcomponentBuilder();
          }
        };
    this.liveDataActivitySubcomponentBuilderProvider =
        new Provider<ActivityBuilder_BindLiveDataActivity.LiveDataActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuilder_BindLiveDataActivity.LiveDataActivitySubcomponent.Builder get() {
            return new LiveDataActivitySubcomponentBuilder();
          }
        };
    this.applicationProvider = InstanceFactory.create(builder.application);
    this.provideContextProvider =
        DoubleCheck.provider(
            AppModule_ProvideContextFactory.create(builder.appModule, applicationProvider));
    this.provideDatabaseNameProvider =
        AppModule_ProvideDatabaseNameFactory.create(builder.appModule);
    this.provideAppDatabaseProvider =
        DoubleCheck.provider(
            AppModule_ProvideAppDatabaseFactory.create(
                builder.appModule, provideDatabaseNameProvider, provideContextProvider));
    this.appDbHelperProvider =
        DoubleCheck.provider(AppDbHelper_Factory.create(provideAppDatabaseProvider));
    this.provideDbHelperProvider =
        DoubleCheck.provider(
            AppModule_ProvideDbHelperFactory.create(builder.appModule, appDbHelperProvider));
    this.providePreferenceNameProvider =
        AppModule_ProvidePreferenceNameFactory.create(builder.appModule);
    this.appPreferencesHelperProvider =
        AppPreferencesHelper_Factory.create(provideContextProvider, providePreferenceNameProvider);
    this.providePreferencesHelperProvider =
        DoubleCheck.provider(
            AppModule_ProvidePreferencesHelperFactory.create(
                builder.appModule, appPreferencesHelperProvider));
    this.provideApiKeyProvider = AppModule_ProvideApiKeyFactory.create(builder.appModule);
    this.publicApiHeaderProvider = ApiHeader_PublicApiHeader_Factory.create(provideApiKeyProvider);
    this.provideProtectedApiHeaderProvider =
        DoubleCheck.provider(
            AppModule_ProvideProtectedApiHeaderFactory.create(
                builder.appModule, provideApiKeyProvider, providePreferencesHelperProvider));
    this.apiHeaderProvider =
        DoubleCheck.provider(
            ApiHeader_Factory.create(publicApiHeaderProvider, provideProtectedApiHeaderProvider));
    this.appApiHelperProvider =
        DoubleCheck.provider(AppApiHelper_Factory.create(apiHeaderProvider));
    this.provideApiHelperProvider =
        DoubleCheck.provider(
            AppModule_ProvideApiHelperFactory.create(builder.appModule, appApiHelperProvider));
    this.provideGsonProvider =
        DoubleCheck.provider(AppModule_ProvideGsonFactory.create(builder.appModule));
    this.appDataManagerProvider =
        DoubleCheck.provider(
            AppDataManager_Factory.create(
                provideContextProvider,
                provideDbHelperProvider,
                providePreferencesHelperProvider,
                provideApiHelperProvider,
                provideGsonProvider));
    this.provideDataManagerProvider =
        DoubleCheck.provider(
            AppModule_ProvideDataManagerFactory.create(builder.appModule, appDataManagerProvider));
    this.appModule = builder.appModule;
  }

  @Override
  public void inject(MvvmApp app) {
    injectMvvmApp(app);
  }

  private MvvmApp injectMvvmApp(MvvmApp instance) {
    MvvmApp_MembersInjector.injectActivityDispatchingAndroidInjector(
        instance, getDispatchingAndroidInjectorOfActivity());
    return instance;
  }

  private static final class Builder implements AppComponent.Builder {
    private AppModule appModule;

    private Application application;

    @Override
    public AppComponent build() {
      if (appModule == null) {
        this.appModule = new AppModule();
      }
      if (application == null) {
        throw new IllegalStateException(Application.class.getCanonicalName() + " must be set");
      }
      return new DaggerAppComponent(this);
    }

    @Override
    public Builder application(Application application) {
      this.application = Preconditions.checkNotNull(application);
      return this;
    }
  }

  private final class FeedActivitySubcomponentBuilder
      extends ActivityBuilder_BindFeedActivity.FeedActivitySubcomponent.Builder {
    private FeedActivityModule feedActivityModule;

    private FeedActivity seedInstance;

    @Override
    public ActivityBuilder_BindFeedActivity.FeedActivitySubcomponent build() {
      if (feedActivityModule == null) {
        this.feedActivityModule = new FeedActivityModule();
      }
      if (seedInstance == null) {
        throw new IllegalStateException(FeedActivity.class.getCanonicalName() + " must be set");
      }
      return new FeedActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(FeedActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class FeedActivitySubcomponentImpl
      implements ActivityBuilder_BindFeedActivity.FeedActivitySubcomponent {
    private FeedActivityModule feedActivityModule;

    private FeedActivity seedInstance;

    private Provider<
            BlogFragmentProvider_ProvideBlogFragmentFactory.BlogFragmentSubcomponent.Builder>
        blogFragmentSubcomponentBuilderProvider;

    private FeedActivitySubcomponentImpl(FeedActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private Map<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
        getMapOfClassOfAndProviderOfFactoryOf() {
      return Collections
          .<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
              singletonMap(BlogFragment.class, (Provider) blogFragmentSubcomponentBuilderProvider);
    }

    private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          getMapOfClassOfAndProviderOfFactoryOf());
    }

    private FeedViewModel getFeedViewModel() {
      return FeedActivityModule_ProvideFeedViewModelFactory.proxyProvideFeedViewModel(
          feedActivityModule,
          DaggerAppComponent.this.provideDataManagerProvider.get(),
          AppModule_ProvideSchedulerProviderFactory.proxyProvideSchedulerProvider(
              DaggerAppComponent.this.appModule));
    }

    private FeedPagerAdapter getFeedPagerAdapter() {
      return FeedActivityModule_ProvideFeedPagerAdapterFactory.proxyProvideFeedPagerAdapter(
          feedActivityModule, seedInstance);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final FeedActivitySubcomponentBuilder builder) {
      this.blogFragmentSubcomponentBuilderProvider =
          new Provider<
              BlogFragmentProvider_ProvideBlogFragmentFactory.BlogFragmentSubcomponent.Builder>() {
            @Override
            public BlogFragmentProvider_ProvideBlogFragmentFactory.BlogFragmentSubcomponent.Builder
                get() {
              return new BlogFragmentSubcomponentBuilder();
            }
          };
      this.feedActivityModule = builder.feedActivityModule;
      this.seedInstance = builder.seedInstance;
    }

    @Override
    public void inject(FeedActivity arg0) {
      injectFeedActivity(arg0);
    }

    private FeedActivity injectFeedActivity(FeedActivity instance) {
      FeedActivity_MembersInjector.injectFragmentDispatchingAndroidInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      FeedActivity_MembersInjector.injectMFeedViewModel(instance, getFeedViewModel());
      FeedActivity_MembersInjector.injectMPagerAdapter(instance, getFeedPagerAdapter());
      return instance;
    }

    private final class BlogFragmentSubcomponentBuilder
        extends BlogFragmentProvider_ProvideBlogFragmentFactory.BlogFragmentSubcomponent.Builder {
      private BlogFragmentModule blogFragmentModule;

      private BlogFragment seedInstance;

      @Override
      public BlogFragmentProvider_ProvideBlogFragmentFactory.BlogFragmentSubcomponent build() {
        if (blogFragmentModule == null) {
          this.blogFragmentModule = new BlogFragmentModule();
        }
        if (seedInstance == null) {
          throw new IllegalStateException(BlogFragment.class.getCanonicalName() + " must be set");
        }
        return new BlogFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(BlogFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class BlogFragmentSubcomponentImpl
        implements BlogFragmentProvider_ProvideBlogFragmentFactory.BlogFragmentSubcomponent {
      private BlogFragmentModule blogFragmentModule;

      private BlogFragment seedInstance;

      private BlogFragmentSubcomponentImpl(BlogFragmentSubcomponentBuilder builder) {
        initialize(builder);
      }

      private LinearLayoutManager getLinearLayoutManager() {
        return BlogFragmentModule_ProvideLinearLayoutManagerFactory.proxyProvideLinearLayoutManager(
            blogFragmentModule, seedInstance);
      }

      private BlogViewModel getBlogViewModel() {
        return BlogFragmentModule_BlogViewModelFactory.proxyBlogViewModel(
            blogFragmentModule,
            DaggerAppComponent.this.provideDataManagerProvider.get(),
            AppModule_ProvideSchedulerProviderFactory.proxyProvideSchedulerProvider(
                DaggerAppComponent.this.appModule));
      }

      private ViewModelProvider.Factory getFactory() {
        return BlogFragmentModule_ProvideBlogViewModelFactory.proxyProvideBlogViewModel(
            blogFragmentModule, getBlogViewModel());
      }

      @SuppressWarnings("unchecked")
      private void initialize(final BlogFragmentSubcomponentBuilder builder) {
        this.blogFragmentModule = builder.blogFragmentModule;
        this.seedInstance = builder.seedInstance;
      }

      @Override
      public void inject(BlogFragment arg0) {
        injectBlogFragment(arg0);
      }

      private BlogFragment injectBlogFragment(BlogFragment instance) {
        BlogFragment_MembersInjector.injectMBlogAdapter(
            instance,
            BlogFragmentModule_ProvideBlogAdapterFactory.proxyProvideBlogAdapter(
                blogFragmentModule));
        BlogFragment_MembersInjector.injectMLayoutManager(instance, getLinearLayoutManager());
        BlogFragment_MembersInjector.injectMViewModelFactory(instance, getFactory());
        return instance;
      }
    }
  }

  private final class MainActivitySubcomponentBuilder
      extends ActivityBuilder_BindMainActivity.MainActivitySubcomponent.Builder {
    private MainActivityModule mainActivityModule;

    private MainActivity seedInstance;

    @Override
    public ActivityBuilder_BindMainActivity.MainActivitySubcomponent build() {
      if (mainActivityModule == null) {
        this.mainActivityModule = new MainActivityModule();
      }
      if (seedInstance == null) {
        throw new IllegalStateException(MainActivity.class.getCanonicalName() + " must be set");
      }
      return new MainActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(MainActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class MainActivitySubcomponentImpl
      implements ActivityBuilder_BindMainActivity.MainActivitySubcomponent {
    private MainActivityModule mainActivityModule;

    private Provider<
            AboutFragmentProvider_ProvideAboutFragmentFactory.AboutFragmentSubcomponent.Builder>
        aboutFragmentSubcomponentBuilderProvider;

    private Provider<
            RateUsDialogProvider_ProvideRateUsDialogFactory.RateUsDialogSubcomponent.Builder>
        rateUsDialogSubcomponentBuilderProvider;

    private MainActivitySubcomponentImpl(MainActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private Map<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
        getMapOfClassOfAndProviderOfFactoryOf() {
      return MapBuilder
          .<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
              newMapBuilder(2)
          .put(AboutFragment.class, (Provider) aboutFragmentSubcomponentBuilderProvider)
          .put(RateUsDialog.class, (Provider) rateUsDialogSubcomponentBuilderProvider)
          .build();
    }

    private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          getMapOfClassOfAndProviderOfFactoryOf());
    }

    private MainViewModel getMainViewModel() {
      return MainActivityModule_ProvideMainViewModelFactory.proxyProvideMainViewModel(
          mainActivityModule,
          DaggerAppComponent.this.provideDataManagerProvider.get(),
          AppModule_ProvideSchedulerProviderFactory.proxyProvideSchedulerProvider(
              DaggerAppComponent.this.appModule));
    }

    private ViewModelProvider.Factory getFactory() {
      return MainActivityModule_MainViewModelProviderFactory.proxyMainViewModelProvider(
          mainActivityModule, getMainViewModel());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final MainActivitySubcomponentBuilder builder) {
      this.aboutFragmentSubcomponentBuilderProvider =
          new Provider<
              AboutFragmentProvider_ProvideAboutFragmentFactory.AboutFragmentSubcomponent
                  .Builder>() {
            @Override
            public AboutFragmentProvider_ProvideAboutFragmentFactory.AboutFragmentSubcomponent
                    .Builder
                get() {
              return new AboutFragmentSubcomponentBuilder();
            }
          };
      this.rateUsDialogSubcomponentBuilderProvider =
          new Provider<
              RateUsDialogProvider_ProvideRateUsDialogFactory.RateUsDialogSubcomponent.Builder>() {
            @Override
            public RateUsDialogProvider_ProvideRateUsDialogFactory.RateUsDialogSubcomponent.Builder
                get() {
              return new RateUsDialogSubcomponentBuilder();
            }
          };
      this.mainActivityModule = builder.mainActivityModule;
    }

    @Override
    public void inject(MainActivity arg0) {
      injectMainActivity(arg0);
    }

    private MainActivity injectMainActivity(MainActivity instance) {
      MainActivity_MembersInjector.injectFragmentDispatchingAndroidInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      MainActivity_MembersInjector.injectMViewModelFactory(instance, getFactory());
      return instance;
    }

    private final class AboutFragmentSubcomponentBuilder
        extends AboutFragmentProvider_ProvideAboutFragmentFactory.AboutFragmentSubcomponent
            .Builder {
      private AboutFragmentModule aboutFragmentModule;

      private AboutFragment seedInstance;

      @Override
      public AboutFragmentProvider_ProvideAboutFragmentFactory.AboutFragmentSubcomponent build() {
        if (aboutFragmentModule == null) {
          this.aboutFragmentModule = new AboutFragmentModule();
        }
        if (seedInstance == null) {
          throw new IllegalStateException(AboutFragment.class.getCanonicalName() + " must be set");
        }
        return new AboutFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(AboutFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class AboutFragmentSubcomponentImpl
        implements AboutFragmentProvider_ProvideAboutFragmentFactory.AboutFragmentSubcomponent {
      private AboutFragmentModule aboutFragmentModule;

      private AboutFragmentSubcomponentImpl(AboutFragmentSubcomponentBuilder builder) {
        initialize(builder);
      }

      private AboutViewModel getAboutViewModel() {
        return AboutFragmentModule_ProvideAboutViewModelFactory.proxyProvideAboutViewModel(
            aboutFragmentModule,
            DaggerAppComponent.this.provideDataManagerProvider.get(),
            AppModule_ProvideSchedulerProviderFactory.proxyProvideSchedulerProvider(
                DaggerAppComponent.this.appModule));
      }

      @SuppressWarnings("unchecked")
      private void initialize(final AboutFragmentSubcomponentBuilder builder) {
        this.aboutFragmentModule = builder.aboutFragmentModule;
      }

      @Override
      public void inject(AboutFragment arg0) {
        injectAboutFragment(arg0);
      }

      private AboutFragment injectAboutFragment(AboutFragment instance) {
        AboutFragment_MembersInjector.injectMAboutViewModel(instance, getAboutViewModel());
        return instance;
      }
    }

    private final class RateUsDialogSubcomponentBuilder
        extends RateUsDialogProvider_ProvideRateUsDialogFactory.RateUsDialogSubcomponent.Builder {
      private RateUsDialogModule rateUsDialogModule;

      private RateUsDialog seedInstance;

      @Override
      public RateUsDialogProvider_ProvideRateUsDialogFactory.RateUsDialogSubcomponent build() {
        if (rateUsDialogModule == null) {
          this.rateUsDialogModule = new RateUsDialogModule();
        }
        if (seedInstance == null) {
          throw new IllegalStateException(RateUsDialog.class.getCanonicalName() + " must be set");
        }
        return new RateUsDialogSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(RateUsDialog arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class RateUsDialogSubcomponentImpl
        implements RateUsDialogProvider_ProvideRateUsDialogFactory.RateUsDialogSubcomponent {
      private RateUsDialogModule rateUsDialogModule;

      private RateUsDialogSubcomponentImpl(RateUsDialogSubcomponentBuilder builder) {
        initialize(builder);
      }

      private RateUsViewModel getRateUsViewModel() {
        return RateUsDialogModule_ProvideRateUsViewModelFactory.proxyProvideRateUsViewModel(
            rateUsDialogModule,
            DaggerAppComponent.this.provideDataManagerProvider.get(),
            AppModule_ProvideSchedulerProviderFactory.proxyProvideSchedulerProvider(
                DaggerAppComponent.this.appModule));
      }

      @SuppressWarnings("unchecked")
      private void initialize(final RateUsDialogSubcomponentBuilder builder) {
        this.rateUsDialogModule = builder.rateUsDialogModule;
      }

      @Override
      public void inject(RateUsDialog arg0) {
        injectRateUsDialog(arg0);
      }

      private RateUsDialog injectRateUsDialog(RateUsDialog instance) {
        RateUsDialog_MembersInjector.injectMRateUsViewModel(instance, getRateUsViewModel());
        return instance;
      }
    }
  }

  private final class SplashActivitySubcomponentBuilder
      extends ActivityBuilder_BindSplashActivity.SplashActivitySubcomponent.Builder {
    private SplashActivityModule splashActivityModule;

    private SplashActivity seedInstance;

    @Override
    public ActivityBuilder_BindSplashActivity.SplashActivitySubcomponent build() {
      if (splashActivityModule == null) {
        this.splashActivityModule = new SplashActivityModule();
      }
      if (seedInstance == null) {
        throw new IllegalStateException(SplashActivity.class.getCanonicalName() + " must be set");
      }
      return new SplashActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(SplashActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class SplashActivitySubcomponentImpl
      implements ActivityBuilder_BindSplashActivity.SplashActivitySubcomponent {
    private SplashActivityModule splashActivityModule;

    private SplashActivitySubcomponentImpl(SplashActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private SplashViewModel getSplashViewModel() {
      return SplashActivityModule_ProvideSplashViewModelFactory.proxyProvideSplashViewModel(
          splashActivityModule,
          DaggerAppComponent.this.provideDataManagerProvider.get(),
          AppModule_ProvideSchedulerProviderFactory.proxyProvideSchedulerProvider(
              DaggerAppComponent.this.appModule));
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SplashActivitySubcomponentBuilder builder) {
      this.splashActivityModule = builder.splashActivityModule;
    }

    @Override
    public void inject(SplashActivity arg0) {
      injectSplashActivity(arg0);
    }

    private SplashActivity injectSplashActivity(SplashActivity instance) {
      SplashActivity_MembersInjector.injectMSplashViewModel(instance, getSplashViewModel());
      return instance;
    }
  }

  private final class LoginActivitySubcomponentBuilder
      extends ActivityBuilder_BindLoginActivity.LoginActivitySubcomponent.Builder {
    private LoginActivityModule loginActivityModule;

    private LoginActivity seedInstance;

    @Override
    public ActivityBuilder_BindLoginActivity.LoginActivitySubcomponent build() {
      if (loginActivityModule == null) {
        this.loginActivityModule = new LoginActivityModule();
      }
      if (seedInstance == null) {
        throw new IllegalStateException(LoginActivity.class.getCanonicalName() + " must be set");
      }
      return new LoginActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(LoginActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class LoginActivitySubcomponentImpl
      implements ActivityBuilder_BindLoginActivity.LoginActivitySubcomponent {
    private LoginActivityModule loginActivityModule;

    private LoginActivitySubcomponentImpl(LoginActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private LoginViewModel getLoginViewModel() {
      return LoginActivityModule_ProvideLoginViewModelFactory.proxyProvideLoginViewModel(
          loginActivityModule,
          DaggerAppComponent.this.provideDataManagerProvider.get(),
          AppModule_ProvideSchedulerProviderFactory.proxyProvideSchedulerProvider(
              DaggerAppComponent.this.appModule));
    }

    @SuppressWarnings("unchecked")
    private void initialize(final LoginActivitySubcomponentBuilder builder) {
      this.loginActivityModule = builder.loginActivityModule;
    }

    @Override
    public void inject(LoginActivity arg0) {
      injectLoginActivity(arg0);
    }

    private LoginActivity injectLoginActivity(LoginActivity instance) {
      LoginActivity_MembersInjector.injectMLoginViewModel(instance, getLoginViewModel());
      return instance;
    }
  }

  private final class LiveDataActivitySubcomponentBuilder
      extends ActivityBuilder_BindLiveDataActivity.LiveDataActivitySubcomponent.Builder {
    private LiveDataActivityModule liveDataActivityModule;

    private LiveDataActivity seedInstance;

    @Override
    public ActivityBuilder_BindLiveDataActivity.LiveDataActivitySubcomponent build() {
      if (liveDataActivityModule == null) {
        this.liveDataActivityModule = new LiveDataActivityModule();
      }
      if (seedInstance == null) {
        throw new IllegalStateException(LiveDataActivity.class.getCanonicalName() + " must be set");
      }
      return new LiveDataActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(LiveDataActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class LiveDataActivitySubcomponentImpl
      implements ActivityBuilder_BindLiveDataActivity.LiveDataActivitySubcomponent {
    private LiveDataActivityModule liveDataActivityModule;

    private LiveDataActivity seedInstance;

    private LiveDataActivitySubcomponentImpl(LiveDataActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private LiveDataViewModel getLiveDataViewModel() {
      return LiveDataActivityModule_ProvideLiveDataViewModelFactory.proxyProvideLiveDataViewModel(
          liveDataActivityModule,
          DaggerAppComponent.this.provideDataManagerProvider.get(),
          AppModule_ProvideSchedulerProviderFactory.proxyProvideSchedulerProvider(
              DaggerAppComponent.this.appModule));
    }

    private LinearLayoutManager getLinearLayoutManager() {
      return LiveDataActivityModule_ProvideLinearLayoutManagerFactory
          .proxyProvideLinearLayoutManager(liveDataActivityModule, seedInstance);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final LiveDataActivitySubcomponentBuilder builder) {
      this.liveDataActivityModule = builder.liveDataActivityModule;
      this.seedInstance = builder.seedInstance;
    }

    @Override
    public void inject(LiveDataActivity arg0) {
      injectLiveDataActivity(arg0);
    }

    private LiveDataActivity injectLiveDataActivity(LiveDataActivity instance) {
      LiveDataActivity_MembersInjector.injectMLiveDataViewModel(instance, getLiveDataViewModel());
      LiveDataActivity_MembersInjector.injectMLayoutManager(instance, getLinearLayoutManager());
      LiveDataActivity_MembersInjector.injectMLiveDataAdapter(
          instance,
          LiveDataActivityModule_ProvideLiveDataAdapterFactory.proxyProvideLiveDataAdapter(
              liveDataActivityModule));
      return instance;
    }
  }
}
