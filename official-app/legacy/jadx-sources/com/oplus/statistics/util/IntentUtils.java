package com.oplus.statistics.util;

import android.content.Intent;
import com.oplus.statistics.util.IntentUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class IntentUtils {
    public static /* synthetic */ String f(Exception exc) {
        return "intent getBooleanExtra exception:" + exc;
    }

    public static /* synthetic */ String g(Exception exc) {
        return "intent getIntExtra exception:" + exc;
    }

    public static boolean getBooleanExtra(Intent intent, String str, boolean z) {
        try {
            return intent.getBooleanExtra(str, z);
        } catch (Exception e2) {
            LogUtil.e("IntentUtils", new Supplier() { // from class: com.oplus.aiunit.vision.sda
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return IntentUtils.f(e2);
                }
            });
            return z;
        }
    }

    public static int getIntExtra(Intent intent, String str, int i) {
        try {
            return intent.getIntExtra(str, i);
        } catch (Exception e2) {
            LogUtil.e("IntentUtils", new Supplier() { // from class: com.oplus.aiunit.vision.rda
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return IntentUtils.g(e2);
                }
            });
            return i;
        }
    }

    public static long getLongExtra(Intent intent, String str, long j2) {
        try {
            return intent.getLongExtra(str, j2);
        } catch (Exception e2) {
            LogUtil.e("IntentUtils", new Supplier() { // from class: com.oplus.aiunit.vision.qda
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return IntentUtils.h(e2);
                }
            });
            return j2;
        }
    }

    public static ArrayList<String> getStringArrayListExtra(Intent intent, String str) {
        try {
            return intent.getStringArrayListExtra(str);
        } catch (Exception e2) {
            LogUtil.e("IntentUtils", new Supplier() { // from class: com.oplus.aiunit.vision.uda
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return IntentUtils.i(e2);
                }
            });
            return null;
        }
    }

    public static String getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e2) {
            LogUtil.e("IntentUtils", new Supplier() { // from class: com.oplus.aiunit.vision.tda
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return IntentUtils.j(e2);
                }
            });
            return null;
        }
    }

    public static /* synthetic */ String h(Exception exc) {
        return "intent getLongExtra exception:" + exc;
    }

    public static /* synthetic */ String i(Exception exc) {
        return "intent getStringArrayListExtra exception:" + exc;
    }

    public static /* synthetic */ String j(Exception exc) {
        return "intent getStringExtra exception:" + exc;
    }
}
