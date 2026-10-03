package com.oplus.aiunit.vision;

import android.os.Build;
import com.heytap.health.sleep.day.SleepPhoneMeasureActivity;
import com.oplus.compat.utils.util.UnSupportedApiVersionException;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0002"}, d2 = {"", "a", "sleep_release"}, k = 2, mv = {1, 8, 0})
public final class fmh {
    public static final int a() {
        if (Build.VERSION.SDK_INT < 30) {
            return -1;
        }
        try {
            return wwc.a();
        } catch (UnSupportedApiVersionException e2) {
            a7b.f(SleepPhoneMeasureActivity.TAG, "get current zen mode ex: " + a7b.e(e2));
            return -1;
        }
    }
}
