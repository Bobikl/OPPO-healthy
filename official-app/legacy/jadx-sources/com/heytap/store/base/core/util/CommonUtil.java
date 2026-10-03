package com.heytap.store.base.core.util;

import android.app.Activity;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.heytap.health.bitmap.BitmapProviderService;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.oplus.aiunit.vision.ix3;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class CommonUtil {
    public static final String TAG = "CommonUtil";

    public static boolean checkFreeSpace() {
        return getSDFreeSpace() < ((long) ix3.DEFAULT_MQTT_MAX_SIZE);
    }

    private static boolean checkFsWritable() {
        String str = Environment.getExternalStorageDirectory().toString() + "/DCIM";
        File file = new File(str);
        if (!file.isDirectory() && !file.mkdirs()) {
            return false;
        }
        File file2 = new File(str, ".probe");
        try {
            if (file2.exists()) {
                file2.delete();
            }
            if (!file2.createNewFile()) {
                return false;
            }
            file2.delete();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static void checkNotOnMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("This method should not be called from the main/UI thread.");
        }
    }

    public static void checkOnMainThread() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("This method must be called from the main/UI thread.");
        }
    }

    public static String formatData(long j2) {
        String str;
        if (j2 <= 0 || j2 >= 1024.0f) {
            str = "0 Kb";
        } else {
            str = String.valueOf(j2) + " B";
        }
        float f = j2;
        if (f >= 1024.0f && f < 1048576.0f) {
            return new DecimalFormat("#0.0 KB").format(f / 1024.0f);
        }
        if (f < 1048576.0f || f >= 1.07374182E9f) {
            return f >= 1.07374182E9f ? new DecimalFormat("#0.0 GB").format(f / 1.07374182E9f) : str;
        }
        return new DecimalFormat("#0.0 MB").format(f / 1048576.0f);
    }

    public static String formatLivePeople(long j2) {
        double dDoubleValue;
        if (j2 < 0) {
            return "";
        }
        if (j2 < 99999) {
            return j2 + "人观看";
        }
        long j3 = (j2 % 10000) / 100;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j2 / 10000.0d);
        if (j3 % 10 != 0) {
            dDoubleValue = bigDecimalValueOf.setScale(2, 4).doubleValue();
        } else {
            if (j3 % 100 == 0) {
                return bigDecimalValueOf.intValue() + "万人观看";
            }
            dDoubleValue = bigDecimalValueOf.setScale(1, 4).doubleValue();
        }
        return dDoubleValue + "万人观看";
    }

    public static long getSDFreeSpace() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        } catch (Exception unused) {
            return BitmapProviderService.BITMAP_MAX_SIZE;
        }
    }

    public static boolean hasStorage(boolean z) {
        String externalStorageState = Environment.getExternalStorageState();
        if (!"mounted".equals(externalStorageState)) {
            return !z && "mounted_ro".equals(externalStorageState);
        }
        if (z) {
            return checkFsWritable();
        }
        return true;
    }

    public static boolean hideKeyboard(Activity activity, View view) {
        InputMethodManager inputMethodManager;
        View currentFocus;
        if (activity == null || (inputMethodManager = (InputMethodManager) activity.getSystemService("input_method")) == null || view == null || !inputMethodManager.isActive(view) || (currentFocus = activity.getCurrentFocus()) == null) {
            return false;
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
        return true;
    }

    public static boolean isDarkTheme() {
        return (ContextGetterUtils.INSTANCE.getApp().getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static void recycleList(List... listArr) {
        for (List list : listArr) {
            if (list != null) {
                list.clear();
            }
        }
    }

    public static String replaceBlank(String str) {
        return str != null ? Pattern.compile("\\s*|\t|\r|\n").matcher(str).replaceAll("") : "";
    }

    public static float spacing(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x * x) + (y * y));
    }

    public static void hideKeyboard(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        View currentFocus = activity.getCurrentFocus();
        if (!inputMethodManager.isActive() || currentFocus == null || currentFocus.getWindowToken() == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
    }
}
