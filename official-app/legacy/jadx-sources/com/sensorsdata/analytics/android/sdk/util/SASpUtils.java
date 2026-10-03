package com.sensorsdata.analytics.android.sdk.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.sensorsdata.analytics.android.sdk.SALog;

/* JADX INFO: loaded from: classes10.dex */
public class SASpUtils {
    private static final String TAG = "SA.SASpUtils";
    private static ISharedPreferencesProvider mSharedPreferencesProvider;

    public interface ISharedPreferencesProvider {
        SharedPreferences createSharedPreferences(Context context, String str, int i);
    }

    public static SharedPreferences getSharedPreferences(Context context, String str, int i) {
        SharedPreferences sharedPreferencesCreateSharedPreferences;
        ISharedPreferencesProvider iSharedPreferencesProvider = mSharedPreferencesProvider;
        if (iSharedPreferencesProvider == null || (sharedPreferencesCreateSharedPreferences = iSharedPreferencesProvider.createSharedPreferences(context, str, i)) == null) {
            return context.getSharedPreferences(str, i);
        }
        SALog.i(TAG, "create SharedPreferences by user default, file name is: " + str);
        return sharedPreferencesCreateSharedPreferences;
    }

    public static void setSharedPreferencesProvider(ISharedPreferencesProvider iSharedPreferencesProvider) {
        mSharedPreferencesProvider = iSharedPreferencesProvider;
    }
}
