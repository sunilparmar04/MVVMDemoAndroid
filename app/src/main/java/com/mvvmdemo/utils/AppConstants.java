
package com.mvvmdemo.utils;

public final class AppConstants {

    public static final int API_STATUS_CODE_LOCAL_ERROR = 0;

    public static final String DB_NAME = "mvvm.db";

    public static final long NULL_INDEX = -1L;

    public static final String PREF_NAME = "mvvm_pref";

    public static final String SEED_DATABASE_OPTIONS = "seed/options.json";

    public static final String SEED_DATABASE_QUESTIONS = "seed/questions.json";

    public static final String STATUS_CODE_FAILED = "failed";

    public static final String STATUS_CODE_SUCCESS = "success";

    public static final String TIMESTAMP_FORMAT = "yyyyMMdd_HHmmss";



    public static final boolean DEBUG = Boolean.parseBoolean("true");
    public static final String APPLICATION_ID = "com.mvvmdemo";
    public static final String BUILD_TYPE = "debug";
    public static final String FLAVOR = "";
    public static final int VERSION_CODE = 1;
    public static final String VERSION_NAME = "1.0";
    // Fields from build type: debug
    public static final String API_KEY = "ABCXYZ123TEST";
    public static final String BASE_URL = "http://www.mocky.io/v2";

    private AppConstants() {
        // This utility class is not publicly instantiable
    }
}
