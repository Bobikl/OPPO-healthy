package com.oplus.drs.rom.sdk.comm.util;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.oplus.aiunit.vision.ooi;
import com.oplus.aiunit.vision.opa;
import com.oplus.aiunit.vision.owj;
import com.oplus.aiunit.vision.poi;
import com.oplus.drs.rom.sdk.comm.DrsSdkCore;
import com.oplus.drs.rom.sdk.comm.log.TrackLogger;
import com.platform.usercenter.tools.device.OpenIDHelper;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class OpenIdUtils {
    public static final byte[] a = {79, 112, 108, 117, 115, 68, 82, 83, 79, 112, 101, 110, 73, 68, 75, 101};
    public static final long b = TimeUnit.HOURS.toMillis(3);
    public static final String DEFAULT_VALUE = "0000";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f19849c = DEFAULT_VALUE;
    public static String d = DEFAULT_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f19850e = false;
    public static opa f = null;
    public static final Object g = new Object();
    public static boolean h = false;
    public static volatile CountDownLatch i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f19851j = 0;
    public static long k = 0;

    public enum IdKind {
        DUID(OpenIDHelper.DUID),
        OUID(OpenIDHelper.OUID);

        final String cacheKey;

        IdKind(String str) {
            this.cacheKey = str;
        }
    }

    public class a implements Runnable {
        public final /* synthetic */ Context i;

        public a(Context context) {
            this.i = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                OpenIdUtils.p(this.i);
            } finally {
                CountDownLatch countDownLatch = OpenIdUtils.i;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
            }
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IdKind.values().length];
            a = iArr;
            try {
                iArr[IdKind.DUID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[IdKind.OUID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static void A() {
        int i2 = f19851j + 1;
        f19851j = i2;
        TrackLogger.o("DRS_SDK_COMMON_OpenIdUtils", "StdID refresh failed, failCount=%s/%s, %s", Integer.valueOf(i2), 3, d());
        if (f19851j >= 3) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = b;
            k = jCurrentTimeMillis + j2;
            f19851j = 0;
            TrackLogger.o("DRS_SDK_COMMON_OpenIdUtils", "StdID refresh failed %s times, enter cooldown %s ms until=%s", 3, Long.valueOf(j2), Long.valueOf(k));
        }
    }

    public static void B(Context context) {
        poi.j(context);
        if (!t(context)) {
            TrackLogger.o("DRS_SDK_COMMON_OpenIdUtils", "refreshFromStdIdSdk: StdIDSDK not supported", new Object[0]);
            poi.a(context);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        i(context);
        boolean zH = poi.h(context);
        f19850e = zH;
        if (zH) {
            j(context);
        }
        TrackLogger.h("DRS_SDK_COMMON_OpenIdUtils", "refreshFromStdIdSdk: final spent=%sms, %s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), d());
        y();
        poi.a(context);
    }

    public static void C() {
        f19851j = 0;
        k = 0L;
    }

    public static void D(IdKind idKind, String str) {
        int i2 = b.a[idKind.ordinal()];
        if (i2 == 1) {
            d = str;
        } else {
            if (i2 != 2) {
                return;
            }
            f19849c = str;
        }
    }

    public static void c(IdKind idKind) {
        CountDownLatch countDownLatch = i;
        if (countDownLatch == null || countDownLatch.getCount() == 0 || Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        try {
            TrackLogger.h("DRS_SDK_COMMON_OpenIdUtils", "awaitFirstRefresh: waiting for StdIDSDK, kind=%s", idKind.name());
            TrackLogger.h("DRS_SDK_COMMON_OpenIdUtils", "awaitFirstRefresh: done=%s, %s", Boolean.valueOf(countDownLatch.await(3000L, TimeUnit.MILLISECONDS)), d());
        } catch (InterruptedException unused) {
            TrackLogger.o("DRS_SDK_COMMON_OpenIdUtils", "awaitFirstRefresh interrupted", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    public static String d() {
        StringBuilder sb = new StringBuilder();
        sb.append("idState{duidValid=");
        sb.append(!r(d));
        sb.append(", ouidValid=");
        sb.append(!r(f19849c));
        sb.append(", ouidStatus=");
        sb.append(f19850e);
        sb.append(", failCount=");
        sb.append(f19851j);
        sb.append(", cooldownUntilMs=");
        sb.append(k);
        sb.append("}");
        return sb.toString();
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str) || DEFAULT_VALUE.equals(str) || !str.startsWith("ENC:")) {
            return str;
        }
        try {
            byte[] bArrDecode = Base64.decode(str.substring(4), 2);
            byte[] bArr = new byte[bArrDecode.length];
            for (int i2 = 0; i2 < bArrDecode.length; i2++) {
                byte b2 = bArrDecode[i2];
                byte[] bArr2 = a;
                bArr[i2] = (byte) (b2 ^ bArr2[i2 % bArr2.length]);
            }
            return new String(bArr, StandardCharsets.UTF_8);
        } catch (Exception unused) {
            return str;
        }
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str) || DEFAULT_VALUE.equals(str)) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            byte[] bArr = new byte[bytes.length];
            for (int i2 = 0; i2 < bytes.length; i2++) {
                byte b2 = bytes[i2];
                byte[] bArr2 = a;
                bArr[i2] = (byte) (b2 ^ bArr2[i2 % bArr2.length]);
            }
            return "ENC:" + Base64.encodeToString(bArr, 2);
        } catch (Exception unused) {
            return str;
        }
    }

    public static void g(Context context) {
        if (f == null) {
            f = opa.a(context, "drs_sdk_storage");
        }
    }

    public static void h(Context context) {
        if (context == null) {
            return;
        }
        if (r(d) || r(f19849c)) {
            c(IdKind.DUID);
            if ((r(d) || r(f19849c)) && Looper.myLooper() != Looper.getMainLooper()) {
                TrackLogger.h("DRS_SDK_COMMON_OpenIdUtils", "ensureStdIdReady: sync refresh, %s", d());
                p(context);
            }
        }
    }

    public static void i(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            ooi ooiVarI = poi.i(context, ooi.Type_DUID);
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (ooiVarI != null) {
                String strA = ooiVarI.a();
                TrackLogger.h("DRS_SDK_COMMON_OpenIdUtils", "fetchDuidAlone: duid=%s, cost=%sms", w(strA), Long.valueOf(jCurrentTimeMillis2));
                if (!TextUtils.isEmpty(strA)) {
                    d = strA;
                }
            } else {
                TrackLogger.o("DRS_SDK_COMMON_OpenIdUtils", "fetchDuidAlone: getStdIds returned null, cost=%sms", Long.valueOf(jCurrentTimeMillis2));
            }
        } catch (Exception e2) {
            TrackLogger.d("DRS_SDK_COMMON_OpenIdUtils", "fetchDuidAlone error", e2, new Object[0]);
        }
    }

    public static void j(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            ooi ooiVarI = poi.i(context, ooi.Type_OUID);
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (ooiVarI != null) {
                String strB = ooiVarI.b();
                TrackLogger.h("DRS_SDK_COMMON_OpenIdUtils", "fetchOuidAlone: ouid=%s, cost=%sms", w(strB), Long.valueOf(jCurrentTimeMillis2));
                if (!TextUtils.isEmpty(strB)) {
                    f19849c = strB;
                }
            } else {
                TrackLogger.o("DRS_SDK_COMMON_OpenIdUtils", "fetchOuidAlone: getStdIds returned null, cost=%sms", Long.valueOf(jCurrentTimeMillis2));
            }
        } catch (Exception e2) {
            TrackLogger.d("DRS_SDK_COMMON_OpenIdUtils", "fetchOuidAlone error", e2, new Object[0]);
        }
    }

    public static String k(Context context) {
        return l(context, IdKind.DUID);
    }

    public static String l(Context context, IdKind idKind) {
        if (context != null && r(m(idKind))) {
            o(context);
        }
        if (r(m(idKind))) {
            c(idKind);
        }
        v(idKind);
        return m(idKind);
    }

    public static String m(IdKind idKind) {
        int i2 = b.a[idKind.ordinal()];
        if (i2 != 1) {
            return i2 != 2 ? DEFAULT_VALUE : f19849c;
        }
        return d;
    }

    public static String n(Context context) {
        return l(context, IdKind.OUID);
    }

    public static void o(Context context) {
        if (context == null) {
            return;
        }
        g(context);
        u();
        TrackLogger.c("DRS_SDK_COMMON_OpenIdUtils", "init: netRequestEnabled=%s, inCooldown=%s, %s", Boolean.valueOf(DrsSdkCore.isEnableNetRequest()), Boolean.valueOf(q()), d());
        x(context);
    }

    public static void p(Context context) {
        if (context == null) {
            return;
        }
        if (q()) {
            TrackLogger.o("DRS_SDK_COMMON_OpenIdUtils", "initInternal skipped: in cooldown, cooldownUntilMs=%s", Long.valueOf(k));
            return;
        }
        Object obj = g;
        synchronized (obj) {
            if (h) {
                return;
            }
            h = true;
            try {
                try {
                    if (DrsSdkCore.isEnableNetRequest()) {
                        TrackLogger.h("DRS_SDK_COMMON_OpenIdUtils", "refreshFromStdIdSdk start: %s", d());
                        B(context);
                        if (s()) {
                            TrackLogger.h("DRS_SDK_COMMON_OpenIdUtils", "refreshFromStdIdSdk success: %s", d());
                            C();
                        } else {
                            TrackLogger.o("DRS_SDK_COMMON_OpenIdUtils", "refreshFromStdIdSdk invalid: %s", d());
                            A();
                        }
                    } else {
                        TrackLogger.c("DRS_SDK_COMMON_OpenIdUtils", "refreshFromStdIdSdk skipped: netRequest disabled, %s", d());
                    }
                    synchronized (obj) {
                        h = false;
                    }
                } catch (Exception e2) {
                    TrackLogger.d("DRS_SDK_COMMON_OpenIdUtils", "initInternal error", e2, new Object[0]);
                    A();
                    synchronized (g) {
                        h = false;
                    }
                }
            } catch (Throwable th) {
                synchronized (g) {
                    h = false;
                    throw th;
                }
            }
        }
    }

    public static boolean q() {
        return k > 0 && System.currentTimeMillis() < k;
    }

    public static boolean r(String str) {
        return TextUtils.isEmpty(str) || DEFAULT_VALUE.equals(str);
    }

    public static boolean s() {
        if (r(d)) {
            return false;
        }
        return (f19850e && r(f19849c)) ? false : true;
    }

    public static boolean t(Context context) {
        try {
            return poi.k();
        } catch (RuntimeException unused) {
            TrackLogger.o("DRS_SDK_COMMON_OpenIdUtils", "isSupported() threw, re-init and retry", new Object[0]);
            poi.j(context);
            return poi.k();
        }
    }

    public static void u() {
        if (f == null) {
            return;
        }
        v(IdKind.DUID);
        v(IdKind.OUID);
    }

    public static void v(IdKind idKind) {
        if (f != null && r(m(idKind)) && f.contains(idKind.cacheKey)) {
            String string = f.getString(idKind.cacheKey, "");
            String strE = e(string);
            D(idKind, strE);
            if (!TextUtils.isEmpty(string) && !string.startsWith("ENC:")) {
                z(idKind, strE);
                TrackLogger.c("DRS_SDK_COMMON_OpenIdUtils", "cache migrated to encrypted: %s", idKind.name());
            }
            TrackLogger.c("DRS_SDK_COMMON_OpenIdUtils", "cache hit: %s, %s", idKind.name(), d());
        }
    }

    public static String w(String str) {
        if (str == null) {
            return "null";
        }
        if (str.isEmpty()) {
            return "empty";
        }
        if (DEFAULT_VALUE.equals(str)) {
            return DEFAULT_VALUE;
        }
        int length = str.length();
        if (length <= 4) {
            return str + "(len=" + length + ")";
        }
        return str.substring(0, 4) + "****(len=" + length + ")";
    }

    public static void x(Context context) {
        if (!(DrsSdkCore.isEnableNetRequest() && (r(d) || (r(f19849c) && f19850e)))) {
            TrackLogger.c("DRS_SDK_COMMON_OpenIdUtils", "maybeRefreshAsync: no need, %s", d());
            return;
        }
        if (q()) {
            TrackLogger.o("DRS_SDK_COMMON_OpenIdUtils", "maybeRefreshAsync skipped: in cooldown, cooldownUntilMs=%s", Long.valueOf(k));
            return;
        }
        Object[] objArr = new Object[2];
        objArr[0] = Boolean.valueOf(Looper.myLooper() == Looper.getMainLooper());
        objArr[1] = d();
        TrackLogger.c("DRS_SDK_COMMON_OpenIdUtils", "maybeRefreshAsync: needRefresh=true, mainThread=%s, %s", objArr);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            p(context);
        } else {
            i = new CountDownLatch(1);
            owj.a(new a(context));
        }
    }

    public static void y() {
        z(IdKind.DUID, d);
        z(IdKind.OUID, f19849c);
    }

    public static void z(IdKind idKind, String str) {
        if (f == null || r(str)) {
            return;
        }
        try {
            f.putString(idKind.cacheKey, f(str));
        } catch (Throwable unused) {
        }
    }
}
