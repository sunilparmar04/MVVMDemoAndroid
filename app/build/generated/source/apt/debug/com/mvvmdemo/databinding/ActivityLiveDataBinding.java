package com.mvvmdemo.databinding;
import com.mvvmdemo.R;
import com.mvvmdemo.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLiveDataBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    public final android.support.v7.widget.RecyclerView blogRecyclerView;
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    @NonNull
    public final android.widget.ImageButton navBackBtn;
    // variables
    @Nullable
    private com.mvvmdemo.ui.livedata.LiveDataViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityLiveDataBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds);
        this.blogRecyclerView = (android.support.v7.widget.RecyclerView) bindings[2];
        this.blogRecyclerView.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.navBackBtn = (android.widget.ImageButton) bindings[1];
        this.navBackBtn.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new android.databinding.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.mvvmdemo.ui.livedata.LiveDataViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.mvvmdemo.ui.livedata.LiveDataViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public com.mvvmdemo.ui.livedata.LiveDataViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelLivedataObservableArrayList((android.databinding.ObservableList<com.mvvmdemo.data.model.api.LiveDataResponse>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelLivedataObservableArrayList(android.databinding.ObservableList<com.mvvmdemo.data.model.api.LiveDataResponse> ViewModelLivedataObservableArrayList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        android.databinding.ObservableList<com.mvvmdemo.data.model.api.LiveDataResponse> viewModelLivedataObservableArrayList = null;
        com.mvvmdemo.ui.livedata.LiveDataViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.livedataObservableArrayList
                    viewModelLivedataObservableArrayList = viewModel.livedataObservableArrayList;
                }
                updateRegistration(0, viewModelLivedataObservableArrayList);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.mvvmdemo.utils.BindingUtils.addLiveDataItems(this.blogRecyclerView, viewModelLivedataObservableArrayList);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.navBackBtn.setOnClickListener(mCallback4);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.mvvmdemo.ui.livedata.LiveDataViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onNavBackClick();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityLiveDataBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLiveDataBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityLiveDataBinding>inflate(inflater, com.mvvmdemo.R.layout.activity_live_data, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityLiveDataBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLiveDataBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.mvvmdemo.R.layout.activity_live_data, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityLiveDataBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLiveDataBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_live_data_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityLiveDataBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.livedataObservableArrayList
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}