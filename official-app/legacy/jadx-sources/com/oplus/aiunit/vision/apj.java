package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import com.heytap.health.base.task.ThreadUtils;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes15.dex */
public class apj {
    public static final boolean DEBUG = a7b.i("TaskUtils", 3);
    public static final long MAX_CALLER_LENGTH = 12;
    public static final boolean RECOVER_THREAD_NAME;
    public static final String Thread_Type_Executor_Cached = "EC";
    public static final String Thread_Type_Executor_Fixed = "EF";
    public static final String Thread_Type_Executor_Single = "ES";
    public static final String Thread_Type_KotlinCoroutine_Default = "KD";
    public static final String Thread_Type_KotlinCoroutine_IO = "KO";
    public static final String Thread_Type_KotlinCoroutine_Main = "KM";
    public static final String Thread_Type_KotlinCoroutine_Unconfined = "KU";
    public static final String Thread_Type_Rxjava_Computation = "RC";
    public static final String Thread_Type_Rxjava_Io = "RI";
    public static final String Thread_Type_Rxjava_NewThread = "RN";
    public static final String Thread_Type_Rxjava_Single = "RS";
    public static final String Thread_Type_Rxjava_Trampoline = "RT";
    public static final String Thread_Type_ScheduledExecutor_Single = "SS";
    public static final String Thread_Type_Thread_Alone = "TA";
    public static final String Thread_Type_Thread_Utils = "TU";
    public static final HashSet<String> a;
    public static final HashSet<String> b;

    static {
        RECOVER_THREAD_NAME = (qe0.t() || qe0.D()) ? false : true;
        HashSet<String> hashSet = new HashSet<>();
        a = hashSet;
        HashSet<String> hashSet2 = new HashSet<>();
        b = hashSet2;
        hashSet.add("dalvik.");
        hashSet.add("java.");
        hashSet.add("android.");
        hashSet.add(g4g.class.getPackage().getName());
        hashSet.add(hfg.class.getPackage().getName());
        hashSet.add(pr3.class.getPackage().getName());
        hashSet.add(wt7.class.getPackage().getName());
        hashSet.add(xnb.class.getPackage().getName());
        hashSet.add(avc.class.getPackage().getName());
        hashSet.add(lbd.class.getPackage().getName());
        hashSet.add(cfg.class.getPackage().getName());
        hashSet.add(f5h.class.getPackage().getName());
        hashSet.add(su8.class.getPackage().getName());
        hashSet2.add(pu8.class.getName());
        hashSet2.add(apj.class.getName());
        hashSet2.add(Coroutine.class.getName());
        hashSet2.add(yq8.class.getName());
        hashSet2.add(rv8.class.getName());
        hashSet2.add(ru8.class.getName());
        hashSet2.add(fw8.class.getName());
        hashSet2.add(zq8.class.getName());
        hashSet2.add(su8.class.getName());
        hashSet2.add(qv8.class.getName());
        hashSet2.add(wq8.class.getName());
        hashSet2.add(ThreadUtils.class.getName());
    }

    public static void a(String str, String str2, Throwable th) {
    }

    @NonNull
    public static String b() {
        String className;
        boolean z;
        boolean z2;
        long jCurrentTimeMillis = DEBUG ? System.currentTimeMillis() : 0L;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                className = "undefined";
                break;
            }
            className = stackTrace[i].getClassName();
            Iterator<String> it = a.iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                if (className.startsWith(it.next())) {
                    z2 = true;
                    break;
                }
            }
            if (!z2) {
                Iterator<String> it2 = b.iterator();
                do {
                    if (!it2.hasNext()) {
                        z = z2;
                        break;
                    }
                } while (!className.equals(it2.next()));
            } else {
                z = z2;
                break;
            }
            if (!z) {
                break;
            }
            i++;
        }
        if (DEBUG) {
            a("TaskUtils", "getCaller() cost: " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms", null);
        }
        return className;
    }

    public static String c(@Size(max = 2) String str, @Nullable @Size(max = MAX_CALLER_LENGTH) String str2) {
        int length = 14 - str.length();
        if (TextUtils.isEmpty(str2)) {
            str2 = b();
        } else if (qe0.t() && str2.length() > length) {
            String str3 = "Current caller's [" + str2 + "]length too long, should be less than:" + length;
            a("TaskUtils", str3, new IllegalArgumentException(str3));
        }
        a("TaskUtils", "getThreadName() called with: caller = [" + str2 + "]", null);
        String str4 = str + "#" + d(str2, length);
        a("TaskUtils", "getThreadName() called with: threadName = [" + str4 + "]", null);
        return str4;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000c  */
    public static String d(String str, int i) {
        int length = str.length();
        if (str.endsWith("Activity")) {
            length -= 5;
        } else if (str.endsWith("Service")) {
            length -= 4;
        } else if (str.endsWith("Provider") || str.endsWith("Receiver")) {
            length -= 5;
        }
        return str.substring(Math.max(0, length - i), length);
    }
}
