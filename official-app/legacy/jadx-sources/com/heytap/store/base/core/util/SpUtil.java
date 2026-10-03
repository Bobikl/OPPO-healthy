package com.heytap.store.base.core.util;

import android.content.SharedPreferences;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.tencent.mmkv.MMKV;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class SpUtil {
    private static final String SP_NAME = "oppo_store_sp";
    private static MMKV kv;

    public static abstract class SpResultSubscriber<T> implements bed<T> {
        @Override // com.oplus.aiunit.vision.bed
        public void onComplete() {
        }

        @Override // com.oplus.aiunit.vision.bed
        @Deprecated
        public void onError(Throwable th) {
            onFailure(th);
        }

        public void onFailure(Throwable th) {
            if (th != null) {
                th.printStackTrace();
            }
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onNext(T t) {
            try {
                if (t == null) {
                    onFailure(new EmptyException());
                } else {
                    onSuccess(t);
                }
            } catch (Throwable th) {
                onFailure(th);
            }
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onSubscribe(cv5 cv5Var) {
        }

        public abstract void onSuccess(T t);
    }

    static {
        SharedPreferences sharedPreferences;
        MMKV mmkv;
        try {
            ContextGetterUtils contextGetterUtils = ContextGetterUtils.INSTANCE;
            MMKV.C(contextGetterUtils.getApp());
            kv = MMKV.o();
            sharedPreferences = contextGetterUtils.getApp().getSharedPreferences(SP_NAME, 0);
        } catch (Exception unused) {
            sharedPreferences = ContextGetterUtils.INSTANCE.getApp().createDeviceProtectedStorageContext().getSharedPreferences(SP_NAME, 0);
        }
        if (sharedPreferences == null || (mmkv = kv) == null) {
            return;
        }
        mmkv.B(sharedPreferences);
        sharedPreferences.edit().clear().apply();
    }

    public static void clearValues(String... strArr) {
        MMKV mmkv = kv;
        if (mmkv == null) {
            return;
        }
        mmkv.removeValuesForKeys(strArr);
    }

    public static boolean getBoolean(String str, boolean z) {
        MMKV mmkv = kv;
        return mmkv == null ? z : mmkv.e(str, z);
    }

    public static void getBooleanAsync(String str, boolean z, SpResultSubscriber<Boolean> spResultSubscriber) {
        MMKV mmkv = kv;
        if (mmkv != null) {
            z = mmkv.e(str, z);
        }
        if (spResultSubscriber != null) {
            spResultSubscriber.onNext(Boolean.valueOf(z));
            spResultSubscriber.onComplete();
        }
    }

    public static double getDouble(String str, double d) {
        MMKV mmkv = kv;
        return mmkv == null ? d : mmkv.g(str, d);
    }

    public static float getFloat(String str, float f) {
        MMKV mmkv = kv;
        return mmkv == null ? f : mmkv.h(str, f);
    }

    public static int getInt(String str, int i) {
        MMKV mmkv = kv;
        return mmkv == null ? i : mmkv.i(str, i);
    }

    public static void getIntAsync(String str, int i, SpResultSubscriber<Integer> spResultSubscriber) {
        MMKV mmkv = kv;
        if (mmkv != null) {
            i = mmkv.i(str, i);
        }
        if (spResultSubscriber != null) {
            spResultSubscriber.onNext(Integer.valueOf(i));
            spResultSubscriber.onComplete();
        }
    }

    public static Long getLong(String str, int i) {
        MMKV mmkv = kv;
        return mmkv == null ? Long.valueOf(i) : Long.valueOf(mmkv.j(str, i));
    }

    public static void getLongAsync(String str, long j2, SpResultSubscriber<Long> spResultSubscriber) {
        MMKV mmkv = kv;
        if (mmkv != null) {
            j2 = mmkv.j(str, j2);
        }
        if (spResultSubscriber != null) {
            spResultSubscriber.onNext(Long.valueOf(j2));
            spResultSubscriber.onComplete();
        }
    }

    public static Set<String> getSet(String str) {
        MMKV mmkv = kv;
        return mmkv == null ? Collections.emptySet() : mmkv.l(str);
    }

    public static String getString(String str, String str2) {
        MMKV mmkv = kv;
        return mmkv == null ? str2 : mmkv.k(str, str2);
    }

    public static void getStringAsync(String str, String str2, SpResultSubscriber<String> spResultSubscriber) {
        MMKV mmkv = kv;
        if (mmkv != null) {
            str2 = mmkv.k(str, str2);
        }
        if (spResultSubscriber != null) {
            spResultSubscriber.onNext(str2);
            spResultSubscriber.onComplete();
        }
    }

    public static void pubIntegerOnBackground(String str, int i) {
        try {
            MMKV mmkv = kv;
            if (mmkv == null) {
                return;
            }
            mmkv.u(str, i);
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
    }

    public static void putBooleanOnBackground(String str, boolean z) {
        try {
            MMKV mmkv = kv;
            if (mmkv == null) {
                return;
            }
            mmkv.y(str, z);
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
    }

    public static void putDouble(String str, double d) {
        try {
            MMKV mmkv = kv;
            if (mmkv == null) {
                return;
            }
            mmkv.s(str, d);
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
    }

    public static void putFloat(String str, float f) {
        try {
            MMKV mmkv = kv;
            if (mmkv == null) {
                return;
            }
            mmkv.t(str, f);
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
    }

    public static void putInt(String str, int i) {
        try {
            MMKV mmkv = kv;
            if (mmkv == null) {
                return;
            }
            mmkv.u(str, i);
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
    }

    public static void putLong(String str, long j2) {
        try {
            MMKV mmkv = kv;
            if (mmkv == null) {
                return;
            }
            mmkv.v(str, j2);
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
    }

    public static void putLongOnBackground(String str, long j2) {
        try {
            MMKV mmkv = kv;
            if (mmkv == null) {
                return;
            }
            mmkv.v(str, j2);
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
    }

    public static void putSet(String str, Set<String> set) {
        try {
            MMKV mmkv = kv;
            if (mmkv == null) {
                return;
            }
            mmkv.x(str, set);
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
    }

    public static void putString(String str, String str2) {
        try {
            MMKV mmkv = kv;
            if (mmkv == null) {
                return;
            }
            mmkv.w(str, str2);
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
    }

    public static void putStringOnBackground(String str, String str2) {
        try {
            MMKV mmkv = kv;
            if (mmkv == null) {
                return;
            }
            mmkv.w(str, str2);
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
    }

    public static long getLong(String str, long j2) {
        MMKV mmkv = kv;
        return mmkv == null ? j2 : mmkv.j(str, j2);
    }
}
