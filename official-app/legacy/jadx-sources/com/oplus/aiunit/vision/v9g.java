package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.health.base.encrypt.AesGcmAndroidKeyStore;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.home.sp.HomeSpConfig;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import com.tencent.mmkv.MMKV;
import com.tencent.mmkv.MMKVLogLevel;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;

/* JADX INFO: loaded from: classes15.dex */
public class v9g {
    public static final String ECG_MEASURE_TYPE = "ecg_measure_type";
    public static final String ECG_MEASURE_TYPE_MODE = "ecg_notch_flag";
    public static final String ECG_SETTING_TABLE = "ecg_setting_table";
    public static final String HIGH_WARN_HEART_RATE_SP_KEY = "highWarnHeartRate";
    public static final String LOW_FREQ_SWITCH_KEY = "lowFreqSwitch";
    public static final String LOW_WARN_HEART_RATE_SP_KEY = "lowWarnHeartRate";
    public static final String POWER_FREQ_FILTER_50_KEY = "powerFreq50hz";
    public static final String POWER_FREQ_FILTER_60_KEY = "powerFreq60hz";
    public static final String TEST_MODE_OPEN_SP_KEY = "testModeOpen";
    public static volatile MMKV f;
    public static volatile MMKV g;
    public static com.heytap.health.base.sp.b h;
    public final MMKV a;
    public final String b = "migrate_to_mmkv_key";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f17759c;
    public static final Map<String, v9g> d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map<String, Object> f17758e = new HashMap();
    public static boolean i = true;

    public class a implements zaf.c {
        public final /* synthetic */ UnsatisfiedLinkError a;
        public final /* synthetic */ Runnable b;

        public a(UnsatisfiedLinkError unsatisfiedLinkError, Runnable runnable) {
            this.a = unsatisfiedLinkError;
            this.b = runnable;
        }

        @Override // com.oplus.aiunit.vision.zaf.c
        public void a(Throwable th) {
            a7b.f("SPUtils", "loadLibrary e " + this.a.getMessage());
            this.b.run();
        }

        @Override // com.oplus.aiunit.vision.zaf.c
        public void success() {
            a7b.f("SPUtils", "loadLibrary success");
        }
    }

    public static class b {
        public b() {
        }

        public MMKV a(String str, MMKV mmkv) {
            MMKV mmkvC = c(str);
            if (mmkvC != null) {
                return mmkvC;
            }
            MMKV mmkvB = b(str, mmkv);
            try {
                try {
                    d(str, mmkvB);
                } catch (Exception e2) {
                    a7b.b("MMKVReKey", "set new key e:" + e2.getMessage());
                }
                return mmkvB;
            } finally {
                a7b.f("MMKVReKey", "create finish");
            }
        }

        public final MMKV b(String str, MMKV mmkv) {
            AesGcmAndroidKeyStore aesGcmAndroidKeyStoreG = AesGcmAndroidKeyStore.g();
            String strB = aesGcmAndroidKeyStoreG.i(ooa.MMKV_KEY, str) ? aesGcmAndroidKeyStoreG.b(ooa.MMKV_KEY, str) : vo6.b(b78.a(), y80.DB_KEY);
            MMKV mmkvI = !mmkv.getBoolean(str, false) ? MMKV.I(str, 2) : MMKV.J(str, 2, strB);
            StringBuilder sb = new StringBuilder();
            sb.append("create previous mmkv ,spName is ");
            sb.append(str);
            sb.append(" ,key is ");
            sb.append(strB);
            sb.append(" ,thread is ");
            sb.append(ThreadUtils.getName());
            return mmkvI;
        }

        public final MMKV c(String str) {
            if (!v9g.g.c(str)) {
                return null;
            }
            String strC = wna.b().c();
            StringBuilder sb = new StringBuilder();
            sb.append("MMKV create spName is ");
            sb.append(str);
            sb.append(" uniqueKey is ");
            sb.append(strC);
            return MMKV.J(str, 2, strC);
        }

        public final void d(String str, MMKV mmkv) {
            String strC = wna.b().c();
            if (TextUtils.equals(mmkv.cryptKey(), strC) || AesGcmAndroidKeyStore.KEY_STORE_MODULE.equals(str)) {
                return;
            }
            mmkv.reKey(strC);
            v9g.g.putBoolean(str, true);
            StringBuilder sb = new StringBuilder();
            sb.append("setNewKey to unique key for spName ");
            sb.append(str);
        }
    }

    public v9g(String str, int i2) {
        this.f17759c = str;
        Y("<init>");
        if (H()) {
            this.a = null;
            return;
        }
        o(b78.a().getSharedPreferences("mmkvReKey", i2), f);
        SharedPreferences sharedPreferences = b78.a().getSharedPreferences(str, i2);
        f.lock();
        MMKV mmkvA = new b().a(str, f);
        this.a = mmkvA;
        f.unlock();
        o(sharedPreferences, mmkvA);
    }

    public static boolean H() {
        if (i) {
            return false;
        }
        ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.s9g
            @Override // java.lang.Runnable
            public final void run() {
                v9g.N();
            }
        });
        return true;
    }

    public static void I(final Context context) {
        m(context);
        boolean zH = H();
        a7b.f("SPUtils", "initMMKV handleNoPermission is " + zH);
        if (zH) {
            return;
        }
        final Runnable runnable = new Runnable() { // from class: com.oplus.aiunit.vision.p9g
            @Override // java.lang.Runnable
            public final void run() {
                v9g.P(context);
            }
        };
        try {
            MMKV.D(context, new MMKV.b() { // from class: com.oplus.aiunit.vision.q9g
                @Override // com.tencent.mmkv.MMKV.b
                public final void a(String str) {
                    v9g.Q(context, runnable, str);
                }
            }, qe0.w() ? MMKVLogLevel.LevelInfo : MMKVLogLevel.LevelWarning);
        } catch (UnsatisfiedLinkError e2) {
            a7b.f("SPUtils", "initialize e " + e2.getMessage());
            runnable.run();
        }
        Z();
        f = MMKV.I("mmkvReKey", 2);
        g = MMKV.I("mmkvUniqueKeyRecord", 2);
        if (gxe.k(context)) {
            ThreadUtils.doInBackground("checkKS", new Runnable() { // from class: com.oplus.aiunit.vision.r9g
                @Override // java.lang.Runnable
                public final void run() {
                    v9g.j();
                }
            });
        } else {
            j();
        }
    }

    public static boolean J(String str) {
        return !TextUtils.isEmpty(str) && str.contains("No space left on device");
    }

    public static boolean K(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!Character.isWhitespace(str.charAt(i2))) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ Boolean L(String str, Context context, String str2) throws Exception {
        try {
            a7b.f("SPUtils", "futureTask mkdir");
            Os.mkdir(str, 1529);
        } catch (ErrnoException e2) {
            int iN = ilj.n(context);
            int iJ = ilj.j(str2);
            boolean zJ = J(e2.getMessage());
            a7b.f("SPUtils", "comfirmCacheDirPermission e | " + e2.getMessage() + " | errno is " + e2.errno + " appUid is " + iN + " dataDirUid is " + iJ + ", isNoSpace = " + zJ);
            if (e2.errno != OsConstants.EEXIST && !zJ) {
                i = false;
            }
        }
        return Boolean.valueOf(i);
    }

    public static /* synthetic */ Object M(String str) {
        return new Object();
    }

    public static /* synthetic */ void N() {
        Toast.makeText(b78.a(), "私有文件夹权限异常，请卸载重装后重试。", 0).show();
    }

    public static /* synthetic */ void O(Context context) {
        Toast.makeText(context, "加载so失败，请重新安装应用。", 0).show();
    }

    public static /* synthetic */ void P(final Context context) {
        ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.t9g
            @Override // java.lang.Runnable
            public final void run() {
                v9g.O(context);
            }
        });
        gxe.p("SPUtils, so load fail");
    }

    public static /* synthetic */ void Q(Context context, Runnable runnable, String str) {
        try {
            System.loadLibrary(str);
        } catch (UnsatisfiedLinkError e2) {
            a7b.f("SPUtils", "initMMKV e " + e2.getMessage());
            zaf.b(context, str, new a(e2, runnable));
        }
    }

    public static void Z() {
        if (h == null) {
            com.heytap.health.base.sp.b bVar = new com.heytap.health.base.sp.b();
            h = bVar;
            MMKV.L(bVar);
        }
    }

    public static void j() {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                if (wna.b().c() == null) {
                    wna.e();
                }
            } catch (Throwable th) {
                a7b.n("SPUtils", "checkKeyStore e: " + th.getMessage(), th);
            }
        }
    }

    public static void m(final Context context) {
        final String path = context.getCacheDir().getPath();
        final String str = path + File.pathSeparator + "cachetest";
        try {
            File file = new File(str);
            boolean zExists = file.exists();
            a7b.f("SPUtils", "comfirmCacheDirPermission exists " + zExists);
            if (zExists) {
                a7b.f("SPUtils", "comfirmCacheDirPermission delete " + file.delete());
            }
        } catch (Exception e2) {
            a7b.f("SPUtils", "comfirmCacheDirPermission e " + e2.getMessage());
        }
        FutureTask futureTask = new FutureTask(new Callable() { // from class: com.oplus.aiunit.vision.u9g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return v9g.L(str, context, path);
            }
        });
        zq8.e("CacheDirPerm").execute(futureTask);
        try {
            a7b.f("SPUtils", "result is " + ((Boolean) futureTask.get(1000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException | ExecutionException | TimeoutException e3) {
            a7b.f("SPUtils", "msg is " + e3.getMessage());
        }
        a7b.f("SPUtils", "comfirmCacheDirPermission | sHasCacheDirPermissions is " + i);
    }

    @Deprecated
    public static v9g w() {
        return x(HomeSpConfig.DEFAULT_SP_NAME);
    }

    public static v9g x(String str) {
        Object objComputeIfAbsent;
        if (K(str)) {
            str = "spUtils";
        }
        Map<String, v9g> map = d;
        v9g v9gVar = map.get(str);
        if (v9gVar != null) {
            return v9gVar;
        }
        Map<String, Object> map2 = f17758e;
        synchronized (map2) {
            objComputeIfAbsent = map2.computeIfAbsent(str, new Function() { // from class: com.oplus.aiunit.vision.o9g
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return v9g.M((String) obj);
                }
            });
        }
        synchronized (objComputeIfAbsent) {
            v9g v9gVar2 = map.get(str);
            if (v9gVar2 != null) {
                return v9gVar2;
            }
            String strC = wna.b().c();
            boolean zB = zr0.b(str);
            StringBuilder sb = new StringBuilder();
            sb.append("getInstance hasName is ");
            sb.append(zB);
            sb.append(", spName is ");
            sb.append(a7b.l(str));
            sb.append(", has password ");
            sb.append(!TextUtils.isEmpty(strC));
            a7b.f("SPUtils", sb.toString());
            v9g aVar = zB ? new com.heytap.health.base.sp.a(str, 0, strC) : new v9g(str, 0);
            map.put(str, aVar);
            return aVar;
        }
    }

    public long A(@NonNull String str) {
        if (H()) {
            return -1L;
        }
        Y(str);
        return B(str, -1L);
    }

    public long B(@NonNull String str, long j2) {
        if (H()) {
            return j2;
        }
        Y(str);
        return this.a.getLong(str, j2);
    }

    public String C() {
        return "migrate_to_mmkv_key";
    }

    public String D(@NonNull String str) {
        if (H()) {
            return "";
        }
        Y(str);
        return E(str, "");
    }

    public String E(@NonNull String str, @NonNull String str2) {
        if (H()) {
            return str2;
        }
        Y(str);
        if (!k9g.sZipKeyList.contains(str)) {
            return this.a.getString(str, str2);
        }
        String string = this.a.getString(str + "_encode", str2);
        if (TextUtils.equals(string, str2)) {
            return str2;
        }
        try {
            return u7m.e(string);
        } catch (IOException unused) {
            return string;
        }
    }

    public Set<String> F(@NonNull String str) {
        if (H()) {
            return new HashSet();
        }
        Y(str);
        return G(str, Collections.emptySet());
    }

    public Set<String> G(@NonNull String str, Set<String> set) {
        if (H()) {
            return set;
        }
        Y(str);
        return this.a.getStringSet(str, set);
    }

    public void R(@NonNull String str, float f2) {
        if (H()) {
            return;
        }
        Y(str);
        this.a.putFloat(str, f2);
    }

    public void S(@NonNull String str, int i2) {
        if (H()) {
            return;
        }
        Y(str);
        this.a.putInt(str, i2);
    }

    public void T(@NonNull String str, long j2) {
        if (H()) {
            return;
        }
        Y(str);
        this.a.putLong(str, j2);
    }

    public void U(@NonNull String str, String str2) {
        if (H()) {
            return;
        }
        Y(str);
        if (!k9g.sZipKeyList.contains(str)) {
            this.a.putString(str, str2);
            return;
        }
        try {
            this.a.putString(str + "_encode", u7m.a(str2));
        } catch (IOException unused) {
        }
    }

    public void V(@NonNull String str, Set<String> set) {
        if (H()) {
            return;
        }
        Y(str);
        this.a.putStringSet(str, set);
    }

    public void W(@NonNull String str, boolean z) {
        if (H()) {
            return;
        }
        Y(str);
        this.a.putBoolean(str, z);
    }

    public void X(@NonNull String str, byte[] bArr) {
        if (H()) {
            return;
        }
        Y(str);
        if (!k9g.sZipKeyList.contains(str)) {
            this.a.K(str, bArr);
            return;
        }
        try {
            this.a.K(str + "_encode", u7m.b(bArr));
        } catch (IOException unused) {
        }
    }

    public final void Y(String str) {
        c4i.d(this.f17759c);
        c4i.c(str);
    }

    public void a0(@NonNull String str) {
        if (H()) {
            return;
        }
        Y(EventType.STATE_PACKAGE_CHANGED_REMOVE);
        this.a.remove(str);
    }

    public final void b0(MMKV mmkv) {
        for (String str : k9g.sZipKeyList) {
            if (mmkv.contains(str)) {
                String string = mmkv.getString(str, "");
                try {
                    string = u7m.a(string);
                } catch (IOException unused) {
                }
                mmkv.remove(str);
                mmkv.putString(str + "_encode", string);
            }
        }
    }

    @Deprecated
    public void i() {
        if (H()) {
            return;
        }
        Y("apply");
        this.a.apply();
    }

    public void k() {
        if (H()) {
            return;
        }
        Y("clear");
        this.a.clearAll();
    }

    public void l(boolean z) {
        if (H()) {
            return;
        }
        Y("clear");
        this.a.clearAll();
    }

    public boolean n(@NonNull String str) {
        if (H()) {
            return false;
        }
        Y("contains");
        return this.a.c(str);
    }

    public final void o(SharedPreferences sharedPreferences, MMKV mmkv) {
        if (mmkv.getBoolean("migrate_to_mmkv_key", false)) {
            return;
        }
        if (mmkv.B(sharedPreferences) > 0) {
            b0(mmkv);
        }
        mmkv.putBoolean("migrate_to_mmkv_key", true);
    }

    public String[] p() {
        if (H()) {
            return new String[0];
        }
        Y("getAllKeys");
        return this.a.a();
    }

    public boolean q(@NonNull String str) {
        if (H()) {
            return false;
        }
        Y(str);
        return r(str, false);
    }

    public boolean r(@NonNull String str, boolean z) {
        if (H()) {
            return z;
        }
        Y(str);
        return this.a.getBoolean(str, z);
    }

    public byte[] s(@NonNull String str, @Nullable byte[] bArr) {
        if (H()) {
            return bArr;
        }
        Y(str);
        if (!k9g.sZipKeyList.contains(str)) {
            return this.a.A(str, bArr);
        }
        byte[] bArrA = this.a.A(str + "_encode", bArr);
        if (Arrays.equals(bArrA, bArr)) {
            return bArr;
        }
        try {
            return u7m.f(bArrA);
        } catch (IOException unused) {
            return bArrA;
        }
    }

    public long t() {
        if (H()) {
            return 0L;
        }
        Y("getCount");
        return this.a.d();
    }

    public float u(@NonNull String str) {
        if (H()) {
            return -1.0f;
        }
        Y(str);
        return v(str, -1.0f);
    }

    public float v(@NonNull String str, float f2) {
        if (H()) {
            return f2;
        }
        Y(str);
        return this.a.getFloat(str, f2);
    }

    public int y(@NonNull String str) {
        if (H()) {
            return -1;
        }
        Y(str);
        return z(str, -1);
    }

    public int z(@NonNull String str, int i2) {
        if (H()) {
            return i2;
        }
        Y(str);
        return this.a.getInt(str, i2);
    }
}
