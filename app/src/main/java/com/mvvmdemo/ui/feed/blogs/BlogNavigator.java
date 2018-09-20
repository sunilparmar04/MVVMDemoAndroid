package com.mvvmdemo.ui.feed.blogs;


import com.mvvmdemo.data.model.api.BlogResponse;

import java.util.List;


public interface BlogNavigator {

    void handleError(Throwable throwable);

    void updateBlog(List<BlogResponse.Blog> blogList);
}
