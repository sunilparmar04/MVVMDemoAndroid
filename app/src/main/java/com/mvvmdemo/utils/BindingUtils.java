package com.mvvmdemo.utils;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.mvvmdemo.data.model.api.BlogResponse;
import com.mvvmdemo.data.model.api.LiveDataResponse;
import com.mvvmdemo.ui.livedata.LiveDataAdapter;
import com.mvvmdemo.ui.feed.blogs.BlogAdapter;

import java.util.List;


public final class BindingUtils {

    private BindingUtils() {
        // This class is not publicly instantiable
    }

    @BindingAdapter({"adapter"})
    public static void addBlogItems(RecyclerView recyclerView, List<BlogResponse.Blog> blogs) {
        BlogAdapter adapter = (BlogAdapter) recyclerView.getAdapter();
        if (adapter != null) {
            adapter.clearItems();
            adapter.addItems(blogs);
        }
    }


    @BindingAdapter("imageUrl")
    public static void setImageUrl(ImageView imageView, String url) {
        Context context = imageView.getContext();
        Glide.with(context).load(url).into(imageView);
    }



    @BindingAdapter({"adapter"})
    public static void addLiveDataItems(RecyclerView recyclerView, List<LiveDataResponse> blogs) {
        LiveDataAdapter adapter = (LiveDataAdapter) recyclerView.getAdapter();
        if (adapter != null) {
            adapter.clearItems();
            adapter.addItems(blogs);
        }
    }




}
