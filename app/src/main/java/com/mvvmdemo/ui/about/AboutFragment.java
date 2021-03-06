package com.mvvmdemo.ui.about;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.mvvmdemo.R;

import javax.inject.Inject;

import com.mvvmdemo.BR;

import com.mvvmdemo.databinding.FragmentAboutBinding;
import com.mvvmdemo.ui.base.BaseFragment;


public class AboutFragment extends BaseFragment<FragmentAboutBinding, AboutViewModel> implements AboutNavigator {

    public static final String TAG = AboutFragment.class.getSimpleName();
    @Inject
    AboutViewModel mAboutViewModel;

    public static AboutFragment newInstance() {
        Bundle args = new Bundle();
        AboutFragment fragment = new AboutFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_about;
    }

    @Override
    public AboutViewModel getViewModel() {
        return mAboutViewModel;
    }

    @Override
    public void goBack() {
        getBaseActivity().onFragmentDetached(TAG);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAboutViewModel.setNavigator(this);
    }
}
