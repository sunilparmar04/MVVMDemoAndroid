package com.mvvmdemo.ui.livedata;

import android.databinding.ObservableField;

public class LiveDataItemViewModel {

    public final ObservableField<String> name;

    public final LiveDataModelListener mListener;


    public LiveDataItemViewModel(String name, LiveDataModelListener mListener) {
        this.name = new ObservableField<>(name);
        this.mListener = mListener;
    }

    public void onItemClick() {
        mListener.onItemClick(name.get());
    }


    public interface LiveDataModelListener {

        void onItemClick(String name);
    }
}
