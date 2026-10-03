package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.oplus.accountsdk.base.account.beans.AcEnvInfo;
import com.oplus.accountsdk.base.account.beans.AcEnvInfoPkg;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public class o8 {
    public static final Gson a = new GsonBuilder().disableHtmlEscaping().create();
    public static final AtomicReference<String> b = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference<String> f14830c = new AtomicReference<>();
    public static final AtomicInteger d = new AtomicInteger();

    public static String a(Context context, String str, String str2, String str3, String str4) {
        try {
            return a.toJson(new AcEnvInfo(str, str2, context.getPackageName(), str3, str4, c(context)));
        } catch (Exception e2) {
            AcLogUtil.e("AcEnvUtil", "getEnvInfo error, ", e2);
            return "";
        }
    }

    public static String b(Context context, String str, String str2, String str3, String str4) {
        try {
            return a.toJson(new AcEnvInfoPkg(str, str2, str3, str4, c(context)));
        } catch (Exception e2) {
            AcLogUtil.e("AcEnvUtil", "getEnvInfoPkg error, ", e2);
            return "";
        }
    }

    @WorkerThread
    public static String c(Context context) {
        String strA = kxf.a(context);
        if (TextUtils.isEmpty(strA)) {
            return "";
        }
        return (((long) strA.getBytes(StandardCharsets.UTF_8).length) > 1048576L ? 1 : (((long) strA.getBytes(StandardCharsets.UTF_8).length) == 1048576L ? 0 : -1)) > 0 ? "" : strA;
    }

    public static String d(Context context) {
        AtomicReference<String> atomicReference = b;
        String str = atomicReference.get();
        if (str != null && !str.isEmpty()) {
            return str;
        }
        String packageName = context.getPackageName();
        atomicReference.set(packageName);
        return packageName;
    }

    public static String e(Context context) {
        AtomicReference<String> atomicReference = f14830c;
        String str = atomicReference.get();
        if (str != null && !str.isEmpty()) {
            return str;
        }
        String strC = k7.c(context, d(context));
        atomicReference.set(strC);
        return strC;
    }

    public static int f(Context context) {
        AtomicInteger atomicInteger = d;
        int i = atomicInteger.get();
        if (i != 0) {
            return i;
        }
        int iB = k7.b(context, d(context));
        atomicInteger.set(iB);
        return iB;
    }
}
