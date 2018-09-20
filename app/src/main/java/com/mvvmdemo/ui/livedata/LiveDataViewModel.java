package com.mvvmdemo.ui.livedata;

import android.arch.lifecycle.MutableLiveData;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;

import com.mvvmdemo.data.DataManager;
import com.mvvmdemo.data.model.api.LiveDataResponse;
import com.mvvmdemo.ui.base.BaseViewModel;
import com.mvvmdemo.utils.rx.SchedulerProvider;

import java.util.ArrayList;
import java.util.List;

public class LiveDataViewModel extends BaseViewModel<LiveDataNavigator> {

    public final ObservableList<LiveDataResponse> livedataObservableArrayList = new ObservableArrayList<>();


    private final MutableLiveData<List<LiveDataResponse>> liveDataListLiveData;

    public LiveDataViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);

        liveDataListLiveData = new MutableLiveData<>();
        livedataParse();

    }


    public void onNavBackClick() {
        getNavigator().goBack();
    }

    public void addLiveItemsToList(List<LiveDataResponse> responseList) {
        livedataObservableArrayList.clear();
        livedataObservableArrayList.addAll(responseList);
    }

    private void livedataParse() {
        List<LiveDataResponse> liveDataResponses=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            LiveDataResponse response = new LiveDataResponse();
            response.setName("Sunil " + i);
            liveDataResponses.add(response);

        }

        liveDataListLiveData.setValue(liveDataResponses);
    }

    public MutableLiveData<List<LiveDataResponse>> getLiveMutableDataListLiveData() {
        return liveDataListLiveData;
    }

    public ObservableList<LiveDataResponse> getLiveObservableList() {
        return livedataObservableArrayList;
    }

}
