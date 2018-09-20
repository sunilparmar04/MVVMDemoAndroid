package com.mvvmdemo.ui.livedata;

import android.arch.lifecycle.Observer;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;

import com.android.databinding.library.baseAdapters.BR;
import com.mvvmdemo.R;
import com.mvvmdemo.data.model.api.LiveDataResponse;
import com.mvvmdemo.databinding.ActivityLiveDataBinding;
import com.mvvmdemo.ui.base.BaseActivity;

import java.util.List;

import javax.inject.Inject;

public class LiveDataActivity extends BaseActivity<ActivityLiveDataBinding, LiveDataViewModel> implements LiveDataNavigator {

    @Inject
    LiveDataViewModel mLiveDataViewModel;

    ActivityLiveDataBinding mActivityLiveDataBinding;

    @Inject
    LinearLayoutManager mLayoutManager;

    @Inject
    LiveDataAdapter mLiveDataAdapter;

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_live_data;
    }

    @Override
    public LiveDataViewModel getViewModel() {
        return mLiveDataViewModel;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityLiveDataBinding = getViewDataBinding();
        mLiveDataViewModel.setNavigator(this);

        setup();

        subscribeToLiveData();

        //wait for 10 sec below data will updated on UI
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                LiveDataResponse liveDataResponse = new LiveDataResponse();
                liveDataResponse.setName("Test");

                mLiveDataViewModel.livedataObservableArrayList.add(liveDataResponse);


                mLiveDataViewModel.getLiveObservableList().get(3).setName("Modified");
            }
        }, 10000);
    }

    @Override
    public void goBack() {
        finish();
    }

    private void setup() {
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mActivityLiveDataBinding.blogRecyclerView.setLayoutManager(mLayoutManager);
        mActivityLiveDataBinding.blogRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mActivityLiveDataBinding.blogRecyclerView.setAdapter(mLiveDataAdapter);
    }

    private void subscribeToLiveData() {

        mLiveDataViewModel.getLiveMutableDataListLiveData().observe(this, new Observer<List<LiveDataResponse>>() {
            @Override
            public void onChanged(@Nullable List<LiveDataResponse> liveDataResponseList) {
                mLiveDataViewModel.addLiveItemsToList(liveDataResponseList);
            }
        });
    }
}
