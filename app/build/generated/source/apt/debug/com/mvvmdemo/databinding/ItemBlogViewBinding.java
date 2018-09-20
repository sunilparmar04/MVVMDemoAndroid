package com.mvvmdemo.databinding;
import com.mvvmdemo.R;
import com.mvvmdemo.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemBlogViewBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

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
    public final android.widget.TextView authorTextView;
    @NonNull
    public final android.widget.TextView contentTextView;
    @NonNull
    public final android.widget.ImageView coverImageView;
    @NonNull
    public final android.widget.TextView dateTextView;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.support.v7.widget.CardView mboundView1;
    @NonNull
    public final android.widget.TextView titleTextView;
    // variables
    @Nullable
    private com.mvvmdemo.ui.feed.blogs.BlogItemViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemBlogViewBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 5);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.authorTextView = (android.widget.TextView) bindings[4];
        this.authorTextView.setTag(null);
        this.contentTextView = (android.widget.TextView) bindings[6];
        this.contentTextView.setTag(null);
        this.coverImageView = (android.widget.ImageView) bindings[2];
        this.coverImageView.setTag(null);
        this.dateTextView = (android.widget.TextView) bindings[5];
        this.dateTextView.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.support.v7.widget.CardView) bindings[1];
        this.mboundView1.setTag(null);
        this.titleTextView = (android.widget.TextView) bindings[3];
        this.titleTextView.setTag(null);
        setRootTag(root);
        // listeners
        mCallback10 = new android.databinding.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
            setViewModel((com.mvvmdemo.ui.feed.blogs.BlogItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.mvvmdemo.ui.feed.blogs.BlogItemViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public com.mvvmdemo.ui.feed.blogs.BlogItemViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelTitle((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelAuthor((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelDate((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelImageUrl((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelContent((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelTitle(android.databinding.ObservableField<java.lang.String> ViewModelTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAuthor(android.databinding.ObservableField<java.lang.String> ViewModelAuthor, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDate(android.databinding.ObservableField<java.lang.String> ViewModelDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelImageUrl(android.databinding.ObservableField<java.lang.String> ViewModelImageUrl, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelContent(android.databinding.ObservableField<java.lang.String> ViewModelContent, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        java.lang.String viewModelContentGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelTitle = null;
        java.lang.String viewModelAuthorGet = null;
        java.lang.String viewModelTitleGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelAuthor = null;
        android.databinding.ObservableField<java.lang.String> viewModelDate = null;
        java.lang.String viewModelDateGet = null;
        java.lang.String viewModelImageUrlGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelImageUrl = null;
        android.databinding.ObservableField<java.lang.String> viewModelContent = null;
        com.mvvmdemo.ui.feed.blogs.BlogItemViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.title
                        viewModelTitle = viewModel.title;
                    }
                    updateRegistration(0, viewModelTitle);


                    if (viewModelTitle != null) {
                        // read viewModel.title.get()
                        viewModelTitleGet = viewModelTitle.get();
                    }
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.author
                        viewModelAuthor = viewModel.author;
                    }
                    updateRegistration(1, viewModelAuthor);


                    if (viewModelAuthor != null) {
                        // read viewModel.author.get()
                        viewModelAuthorGet = viewModelAuthor.get();
                    }
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.date
                        viewModelDate = viewModel.date;
                    }
                    updateRegistration(2, viewModelDate);


                    if (viewModelDate != null) {
                        // read viewModel.date.get()
                        viewModelDateGet = viewModelDate.get();
                    }
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.imageUrl
                        viewModelImageUrl = viewModel.imageUrl;
                    }
                    updateRegistration(3, viewModelImageUrl);


                    if (viewModelImageUrl != null) {
                        // read viewModel.imageUrl.get()
                        viewModelImageUrlGet = viewModelImageUrl.get();
                    }
            }
            if ((dirtyFlags & 0x70L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.content
                        viewModelContent = viewModel.content;
                    }
                    updateRegistration(4, viewModelContent);


                    if (viewModelContent != null) {
                        // read viewModel.content.get()
                        viewModelContentGet = viewModelContent.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.authorTextView, viewModelAuthorGet);
        }
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.contentTextView, viewModelContentGet);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            com.mvvmdemo.utils.BindingUtils.setImageUrl(this.coverImageView, viewModelImageUrlGet);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.dateTextView, viewModelDateGet);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback10);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.titleTextView, viewModelTitleGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.mvvmdemo.ui.feed.blogs.BlogItemViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onItemClick();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemBlogViewBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemBlogViewBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemBlogViewBinding>inflate(inflater, com.mvvmdemo.R.layout.item_blog_view, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemBlogViewBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemBlogViewBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.mvvmdemo.R.layout.item_blog_view, null, false), bindingComponent);
    }
    @NonNull
    public static ItemBlogViewBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemBlogViewBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_blog_view_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemBlogViewBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.title
        flag 1 (0x2L): viewModel.author
        flag 2 (0x3L): viewModel.date
        flag 3 (0x4L): viewModel.imageUrl
        flag 4 (0x5L): viewModel.content
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}