
package android.databinding;
import com.mvvmdemo.BR;
class DataBinderMapperImpl extends android.databinding.DataBinderMapper {
    public DataBinderMapperImpl() {
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.mvvmdemo.R.layout.activity_login:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_login_0".equals(tag)) {
                            return new com.mvvmdemo.databinding.ActivityLoginBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
                }
                case com.mvvmdemo.R.layout.activity_main:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_main_0".equals(tag)) {
                            return new com.mvvmdemo.databinding.ActivityMainBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
                }
                case com.mvvmdemo.R.layout.fragment_about:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/fragment_about_0".equals(tag)) {
                            return new com.mvvmdemo.databinding.FragmentAboutBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for fragment_about is invalid. Received: " + tag);
                }
                case com.mvvmdemo.R.layout.dialog_rate_us:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/dialog_rate_us_0".equals(tag)) {
                            return new com.mvvmdemo.databinding.DialogRateUsBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for dialog_rate_us is invalid. Received: " + tag);
                }
                case com.mvvmdemo.R.layout.nav_header_main:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/nav_header_main_0".equals(tag)) {
                            return new com.mvvmdemo.databinding.NavHeaderMainBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for nav_header_main is invalid. Received: " + tag);
                }
                case com.mvvmdemo.R.layout.activity_splash:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_splash_0".equals(tag)) {
                            return new com.mvvmdemo.databinding.ActivitySplashBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
                }
        }
        return null;
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    @Override
    public int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case -237232145: {
                if(tag.equals("layout/activity_login_0")) {
                    return com.mvvmdemo.R.layout.activity_login;
                }
                break;
            }
            case 423753077: {
                if(tag.equals("layout/activity_main_0")) {
                    return com.mvvmdemo.R.layout.activity_main;
                }
                break;
            }
            case 1771501908: {
                if(tag.equals("layout/fragment_about_0")) {
                    return com.mvvmdemo.R.layout.fragment_about;
                }
                break;
            }
            case -1481137956: {
                if(tag.equals("layout/dialog_rate_us_0")) {
                    return com.mvvmdemo.R.layout.dialog_rate_us;
                }
                break;
            }
            case -477551781: {
                if(tag.equals("layout/nav_header_main_0")) {
                    return com.mvvmdemo.R.layout.nav_header_main;
                }
                break;
            }
            case 1573928931: {
                if(tag.equals("layout/activity_splash_0")) {
                    return com.mvvmdemo.R.layout.activity_splash;
                }
                break;
            }
        }
        return 0;
    }
    @Override
    public String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"viewModel"};
    }
}