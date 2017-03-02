package com.easedroid.password.util;

import android.util.Log;

import com.easedroid.password.BuildConfig;

/**
 * Created by kevin on 2017/3/2.
 */

public class XLog {

    private static final boolean DEBUG = BuildConfig.DEBUG;

    public static final void i(String tag, String info) {
        if (DEBUG) {
            Log.i(tag, info);
        }
    }

    public static final void d(String tag, String debug) {
        if (DEBUG) {
            Log.d(tag, debug);
        }
    }
}
