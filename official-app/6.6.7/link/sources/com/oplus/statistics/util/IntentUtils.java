package com.oplus.statistics.util;

import android.content.Intent;
import com.oplus.statistics.util.IntentUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
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
        } catch (Exception e) {
            LogUtil.e("IntentUtils", new Supplier() { // from class: com.oplus.aiunit.vision.afa
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return IntentUtils.f(e);
                }
            });
            return z;
        }
    }

    public static int getIntExtra(Intent intent, String str, int i) {
        try {
            return intent.getIntExtra(str, i);
        } catch (Exception e) {
            LogUtil.e("IntentUtils", new Supplier() { // from class: com.oplus.aiunit.vision.zea
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return IntentUtils.g(e);
                }
            });
            return i;
        }
    }

    public static long getLongExtra(Intent intent, String str, long j) {
        try {
            return intent.getLongExtra(str, j);
        } catch (Exception e) {
            LogUtil.e("IntentUtils", new Supplier() { // from class: com.oplus.aiunit.vision.yea
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return IntentUtils.h(e);
                }
            });
            return j;
        }
    }

    public static ArrayList<String> getStringArrayListExtra(Intent intent, String str) {
        try {
            return intent.getStringArrayListExtra(str);
        } catch (Exception e) {
            LogUtil.e("IntentUtils", new Supplier() { // from class: com.oplus.aiunit.vision.cfa
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return IntentUtils.i(e);
                }
            });
            return null;
        }
    }

    public static String getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            LogUtil.e("IntentUtils", new Supplier() { // from class: com.oplus.aiunit.vision.bfa
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return IntentUtils.j(e);
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
