package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageManager;
import com.oplus.drs.core.model.TrackType;
import com.oplus.drs.rom.sdk.comm.log.TrackLogger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public final class s56 {
    public static final int ID_DRS_IMPL = 1;
    public static final int ID_TRACK_IMPL = 0;
    public static volatile Context a;
    public static final ConcurrentHashMap<String, Boolean> b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Boolean f16474c = null;
    public static opa d;

    public class a implements ju9<Boolean> {
        public final /* synthetic */ boolean[] a;
        public final /* synthetic */ boolean[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f16475c;

        public a(boolean[] zArr, boolean[] zArr2, CountDownLatch countDownLatch) {
            this.a = zArr;
            this.b = zArr2;
            this.f16475c = countDownLatch;
        }

        @Override // com.oplus.aiunit.vision.ju9
        public void a(int i, String str, Throwable th) {
            TrackLogger.d("DRS_SDK_COMMON_DrsChannelManager", "getSwitchConfig failed, code=%s, msg=%s", th, Integer.valueOf(i), str);
            this.b[0] = false;
            this.f16475c.countDown();
        }

        @Override // com.oplus.aiunit.vision.ju9
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Boolean bool) {
            if (s56.d != null) {
                s56.d.putBoolean("channel_remote", bool.booleanValue());
            }
            TrackLogger.h("DRS_SDK_COMMON_DrsChannelManager", "channel_remote", bool);
            if (bool != null) {
                this.a[0] = bool.booleanValue();
                this.b[0] = true;
            }
            this.f16475c.countDown();
        }
    }

    public static opa b(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return opa.a(context.getApplicationContext(), "drs_sdk_storage");
        } catch (Throwable th) {
            TrackLogger.d("DRS_SDK_COMMON_DrsChannelManager", "ensureStore failed", th, new Object[0]);
            return null;
        }
    }

    public static void c(Context context) {
        opa opaVarB = b(context);
        if (opaVarB == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() + 86400000;
        opaVarB.putLong("ipc_force_dcs_old_until_ms", jCurrentTimeMillis);
        TrackLogger.e("DRS_SDK_COMMON_DrsChannelManager", "forceDcsOldChannelForOneDay until=%s", Long.valueOf(jCurrentTimeMillis));
        b.clear();
    }

    public static void d(Context context) {
        opa opaVarB = b(context);
        if (opaVarB == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() + 86400000;
        opaVarB.putLong("ipc_force_standalone_until_ms", jCurrentTimeMillis);
        TrackLogger.e("DRS_SDK_COMMON_DrsChannelManager", "forceStandaloneForOneDay until=%s", Long.valueOf(jCurrentTimeMillis));
        b.clear();
    }

    public static long e() {
        opa opaVarB = d;
        if (opaVarB == null) {
            opaVarB = b(a);
        }
        if (opaVarB == null) {
            return 0L;
        }
        long j2 = opaVarB.getLong("ipc_force_dcs_old_until_ms", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j2 > jCurrentTimeMillis) {
            return j2 - jCurrentTimeMillis;
        }
        return 0L;
    }

    public static void f(Context context, TrackType trackType, int i) {
        if (context == null) {
            TrackLogger.e("DRS_SDK_COMMON_DrsChannelManager", "initIPC: context is null", new Object[0]);
            return;
        }
        if (a == null) {
            a = context.getApplicationContext();
        }
        d = opa.a(context, "drs_sdk_storage");
        try {
            ku9.f().k(a, trackType);
            ku9.f().o(i);
            ku9.f().n();
        } catch (Exception e2) {
            TrackLogger.d("DRS_SDK_COMMON_DrsChannelManager", "initIPC failed", e2, new Object[0]);
        }
    }

    public static boolean g() {
        opa opaVar;
        return h() && !j() && (opaVar = d) != null && opaVar.getBoolean("channel_remote", true);
    }

    public static boolean h() {
        Boolean bool = f16474c;
        if (bool != null) {
            return bool.booleanValue();
        }
        Context context = a;
        boolean z = true;
        if (context == null) {
            TrackLogger.o("DRS_SDK_COMMON_DrsChannelManager", "isDrsInstalled: appContext is null, skip package check", new Object[0]);
            return true;
        }
        try {
            context.getPackageManager().getPackageInfo(te0.DRS_PACKAGE_NAME, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            TrackLogger.h("DRS_SDK_COMMON_DrsChannelManager", "isDrsInstalled: DRS apk not found, pkg=%s", te0.DRS_PACKAGE_NAME);
            z = false;
        } catch (Exception e2) {
            TrackLogger.d("DRS_SDK_COMMON_DrsChannelManager", "isDrsInstalled: check failed, keep useDrs enabled", e2, new Object[0]);
        }
        f16474c = Boolean.valueOf(z);
        return z;
    }

    public static boolean i() {
        opa opaVarB = d;
        if (opaVarB == null) {
            opaVarB = b(a);
        }
        return opaVarB != null && opaVarB.getLong("ipc_force_dcs_old_until_ms", 0L) > System.currentTimeMillis();
    }

    public static boolean j() {
        opa opaVarB = d;
        if (opaVarB == null) {
            opaVarB = b(a);
        }
        return opaVarB != null && opaVarB.getLong("ipc_force_standalone_until_ms", 0L) > System.currentTimeMillis();
    }

    public static boolean k(String str) {
        if (str == null || str.isEmpty()) {
            TrackLogger.o("DRS_SDK_COMMON_DrsChannelManager", "useDrs: empty packageName", new Object[0]);
            return false;
        }
        if (j() || i()) {
            return false;
        }
        ConcurrentHashMap<String, Boolean> concurrentHashMap = b;
        Boolean bool = concurrentHashMap.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!h()) {
            concurrentHashMap.put(str, Boolean.FALSE);
            return false;
        }
        synchronized (s56.class) {
            Boolean bool2 = concurrentHashMap.get(str);
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            boolean[] zArr = new boolean[1];
            boolean[] zArr2 = new boolean[1];
            ku9.f().h(str, new a(zArr, zArr2, countDownLatch));
            try {
                if (!countDownLatch.await(2000L, TimeUnit.MILLISECONDS)) {
                    TrackLogger.o("DRS_SDK_COMMON_DrsChannelManager", "getSwitchConfig timeout, useDrs=false, packageName=%s", str);
                    return false;
                }
                if (!zArr2[0]) {
                    return false;
                }
                boolean z = zArr[0];
                concurrentHashMap.put(str, Boolean.valueOf(z));
                return z;
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                TrackLogger.d("DRS_SDK_COMMON_DrsChannelManager", "getSwitchConfig interrupted, packageName=%s", e2, str);
                return false;
            }
        }
    }
}
