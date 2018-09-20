package com.mvvmdemo.ui.livedata;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.mvvmdemo.data.model.api.LiveDataResponse;
import com.mvvmdemo.databinding.ItemLiveDataBinding;
import com.mvvmdemo.ui.base.BaseViewHolder;

import java.util.List;

public class LiveDataAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private List<LiveDataResponse> liveDataResponseList;


    public LiveDataAdapter(List<LiveDataResponse> liveDataResponseList) {
        this.liveDataResponseList = liveDataResponseList;
    }

    public class LiveDataHolder extends BaseViewHolder implements LiveDataItemViewModel.LiveDataModelListener {
        ItemLiveDataBinding mBinding;
        LiveDataItemViewModel mLiveDataItemModel;

        public LiveDataHolder(ItemLiveDataBinding mBinding) {
            super(mBinding.getRoot());
            this.mBinding = mBinding;
        }

        @Override
        public void onBind(int position) {
            LiveDataResponse liveDataResponse = liveDataResponseList.get(position);
            mLiveDataItemModel = new LiveDataItemViewModel(liveDataResponse.getName(), this);
            mBinding.setViewModel(mLiveDataItemModel);

            // Immediate Binding
            // When a variable or observable changes, the binding will be scheduled to change before
            // the next frame. There are times, however, when binding must be executed immediately.
            // To force execution, use the executePendingBindings() method.
            mBinding.executePendingBindings();

        }

        @Override
        public void onItemClick(String name) {
            Log.v("click_item","name:"+name);

        }
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        ItemLiveDataBinding liveDataViewBinding = ItemLiveDataBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false);
        return new LiveDataHolder(liveDataViewBinding);

    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.onBind(position);
    }

    @Override
    public int getItemCount() {
        return liveDataResponseList.size();
    }


    public void addItems(List<LiveDataResponse> blogList) {
        liveDataResponseList.addAll(blogList);
        notifyDataSetChanged();
    }


    public void clearItems() {
        liveDataResponseList.clear();
    }


}
