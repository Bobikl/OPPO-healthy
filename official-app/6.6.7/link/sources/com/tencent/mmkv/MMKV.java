package com.tencent.mmkv;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.util.Log;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.r87;
import com.oplus.aiunit.vision.xdb;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class MMKV implements SharedPreferences, SharedPreferences.Editor {
    public static final int ExpireInDay = 86400;
    public static final int ExpireInHour = 3600;
    public static final int ExpireInMinute = 60;
    public static final int ExpireInMonth = 2592000;
    public static final int ExpireInYear = 946080000;
    public static final int ExpireNever = 0;
    public static final int MULTI_PROCESS_MODE = 2;
    public static final int SINGLE_PROCESS_MODE = 1;
    public static final EnumMap<MMKVRecoverStrategic, Integer> a;
    public static final EnumMap<MMKVLogLevel, Integer> b;
    public static final MMKVLogLevel[] c;
    public static final Set<Long> d;
    public static String e;
    public static boolean f;
    public static final HashMap<String, Parcelable.Creator<?>> g;
    public static xdb h;
    public static boolean i;
    private final long nativeHandle;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MMKVLogLevel.values().length];
            a = iArr;
            try {
                iArr[MMKVLogLevel.LevelDebug.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[MMKVLogLevel.LevelWarning.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[MMKVLogLevel.LevelError.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[MMKVLogLevel.LevelNone.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[MMKVLogLevel.LevelInfo.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public interface b {
        void a(String str);
    }

    static {
        EnumMap<MMKVRecoverStrategic, Integer> enumMap = new EnumMap<>(MMKVRecoverStrategic.class);
        a = enumMap;
        enumMap.put(MMKVRecoverStrategic.OnErrorDiscard, 0);
        enumMap.put(MMKVRecoverStrategic.OnErrorRecover, 1);
        EnumMap<MMKVLogLevel, Integer> enumMap2 = new EnumMap<>(MMKVLogLevel.class);
        b = enumMap2;
        MMKVLogLevel mMKVLogLevel = MMKVLogLevel.LevelDebug;
        enumMap2.put(mMKVLogLevel, 0);
        MMKVLogLevel mMKVLogLevel2 = MMKVLogLevel.LevelInfo;
        enumMap2.put(mMKVLogLevel2, 1);
        MMKVLogLevel mMKVLogLevel3 = MMKVLogLevel.LevelWarning;
        enumMap2.put(mMKVLogLevel3, 2);
        MMKVLogLevel mMKVLogLevel4 = MMKVLogLevel.LevelError;
        enumMap2.put(mMKVLogLevel4, 3);
        MMKVLogLevel mMKVLogLevel5 = MMKVLogLevel.LevelNone;
        enumMap2.put(mMKVLogLevel5, 4);
        c = new MMKVLogLevel[]{mMKVLogLevel, mMKVLogLevel2, mMKVLogLevel3, mMKVLogLevel4, mMKVLogLevel5};
        d = new HashSet();
        e = null;
        f = true;
        g = new HashMap<>();
        i = false;
    }

    public MMKV(long j) {
        this.nativeHandle = j;
    }

    public static String C(Context context) {
        return E(context, context.getFilesDir().getAbsolutePath() + "/mmkv", null, MMKVLogLevel.LevelInfo, null);
    }

    public static String D(Context context, b bVar, MMKVLogLevel mMKVLogLevel) {
        return E(context, context.getFilesDir().getAbsolutePath() + "/mmkv", bVar, mMKVLogLevel, null);
    }

    public static String E(Context context, String str, b bVar, MMKVLogLevel mMKVLogLevel, xdb xdbVar) {
        if ((context.getApplicationInfo().flags & 2) == 0) {
            p();
        } else {
            r();
        }
        String absolutePath = context.getCacheDir().getAbsolutePath();
        h = xdbVar;
        if (xdbVar != null && xdbVar.d()) {
            i = true;
        }
        String strQ = q(str, absolutePath, bVar, mMKVLogLevel, i);
        if (h != null) {
            setCallbackHandler(i, true);
        }
        return strQ;
    }

    public static int F(MMKVLogLevel mMKVLogLevel) {
        int i2 = a.a[mMKVLogLevel.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        int i3 = 2;
        if (i2 != 2) {
            i3 = 3;
            if (i2 != 3) {
                i3 = 4;
                if (i2 != 4) {
                    return 1;
                }
            }
        }
        return i3;
    }

    public static MMKV G(String str, int i2, int i3, String str2) throws RuntimeException {
        long mMKVWithAshmemFD = getMMKVWithAshmemFD(str, i2, i3, str2);
        if (mMKVWithAshmemFD != 0) {
            return new MMKV(mMKVWithAshmemFD);
        }
        throw new RuntimeException("Fail to create an ashmem MMKV instance [" + str + "] in JNI");
    }

    public static MMKV H(Context context, String str, int i2, int i3, @Nullable String str2) throws RuntimeException {
        MMKV mmkv;
        if (e == null) {
            throw new IllegalStateException("You should Call MMKV.initialize() first.");
        }
        String processNameByPID = MMKVContentProvider.getProcessNameByPID(context, Process.myPid());
        if (processNameByPID == null || processNameByPID.length() == 0) {
            N(MMKVLogLevel.LevelError, "process name detect fail, try again later");
            throw new IllegalStateException("process name detect fail, try again later");
        }
        if (processNameByPID.contains(":")) {
            Uri uriContentUri = MMKVContentProvider.contentUri(context);
            if (uriContentUri == null) {
                N(MMKVLogLevel.LevelError, "MMKVContentProvider has invalid authority");
                throw new IllegalStateException("MMKVContentProvider has invalid authority");
            }
            MMKVLogLevel mMKVLogLevel = MMKVLogLevel.LevelInfo;
            N(mMKVLogLevel, "getting parcelable mmkv in process, Uri = " + uriContentUri);
            Bundle bundle = new Bundle();
            bundle.putInt("KEY_SIZE", i2);
            bundle.putInt("KEY_MODE", i3);
            if (str2 != null) {
                bundle.putString("KEY_CRYPT", str2);
            }
            Bundle bundleCall = context.getContentResolver().call(uriContentUri, "mmkvFromAshmemID", str, bundle);
            if (bundleCall != null) {
                bundleCall.setClassLoader(ParcelableMMKV.class.getClassLoader());
                ParcelableMMKV parcelableMMKV = (ParcelableMMKV) bundleCall.getParcelable("KEY");
                if (parcelableMMKV != null && (mmkv = parcelableMMKV.toMMKV()) != null) {
                    N(mMKVLogLevel, mmkv.mmapID() + " fd = " + mmkv.ashmemFD() + ", meta fd = " + mmkv.ashmemMetaFD());
                    return mmkv;
                }
            }
        }
        N(MMKVLogLevel.LevelInfo, "getting mmkv in main process");
        long mMKVWithIDAndSize = getMMKVWithIDAndSize(str, i2, i3 | 8, str2);
        if (mMKVWithIDAndSize != 0) {
            return new MMKV(mMKVWithIDAndSize);
        }
        throw new IllegalStateException("Fail to create an Ashmem MMKV instance [" + str + "]");
    }

    public static MMKV I(String str, int i2) throws RuntimeException {
        if (e != null) {
            return b(getMMKVWithID(str, i2, null, null, 0L), str, i2);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    public static MMKV J(String str, int i2, @Nullable String str2) throws RuntimeException {
        if (e != null) {
            return b(getMMKVWithID(str, i2, str2, null, 0L), str, i2);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    public static void L(xdb xdbVar) {
        h = xdbVar;
        boolean zD = xdbVar.d();
        i = zD;
        setCallbackHandler(zD, true);
    }

    public static void N(MMKVLogLevel mMKVLogLevel, String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = stackTrace[stackTrace.length - 1];
        Integer num = b.get(mMKVLogLevel);
        mmkvLogImp(num == null ? 0 : num.intValue(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), stackTraceElement.getMethodName(), str);
    }

    private native long actualSize(long j);

    private native String[] allKeys(long j, boolean z);

    public static MMKV b(long j, String str, int i2) throws RuntimeException {
        String str2;
        if (j == 0) {
            throw new RuntimeException("Fail to create an MMKV instance [" + str + "] in JNI");
        }
        if (!f) {
            return new MMKV(j);
        }
        Set<Long> set = d;
        synchronized (set) {
            if (!set.contains(Long.valueOf(j))) {
                if (!checkProcessMode(j)) {
                    if (i2 == 1) {
                        str2 = "Opening a multi-process MMKV instance [" + str + "] with SINGLE_PROCESS_MODE!";
                    } else {
                        str2 = ("Opening an MMKV instance [" + str + "] with MULTI_PROCESS_MODE, ") + "while it's already been opened with SINGLE_PROCESS_MODE by someone somewhere else!";
                    }
                    throw new IllegalArgumentException(str2);
                }
                set.add(Long.valueOf(j));
            }
        }
        return new MMKV(j);
    }

    public static native long backupAllToDirectory(String str);

    public static native boolean backupOneToDirectory(String str, String str2, @Nullable String str3);

    private static native boolean checkProcessMode(long j);

    private native boolean containsKey(long j, String str);

    private native long count(long j, boolean z);

    private static native long createNB(int i2);

    private native boolean decodeBool(long j, String str, boolean z);

    @Nullable
    private native byte[] decodeBytes(long j, String str);

    private native double decodeDouble(long j, String str, double d2);

    private native float decodeFloat(long j, String str, float f2);

    private native int decodeInt(long j, String str, int i2);

    private native long decodeLong(long j, String str, long j2);

    @Nullable
    private native String decodeString(long j, String str, @Nullable String str2);

    @Nullable
    private native String[] decodeStringSet(long j, String str);

    private static native void destroyNB(long j, int i2);

    private native boolean encodeBool(long j, String str, boolean z);

    private native boolean encodeBool_2(long j, String str, boolean z, int i2);

    private native boolean encodeBytes(long j, String str, @Nullable byte[] bArr);

    private native boolean encodeBytes_2(long j, String str, @Nullable byte[] bArr, int i2);

    private native boolean encodeDouble(long j, String str, double d2);

    private native boolean encodeDouble_2(long j, String str, double d2, int i2);

    private native boolean encodeFloat(long j, String str, float f2);

    private native boolean encodeFloat_2(long j, String str, float f2, int i2);

    private native boolean encodeInt(long j, String str, int i2);

    private native boolean encodeInt_2(long j, String str, int i2, int i3);

    private native boolean encodeLong(long j, String str, long j2);

    private native boolean encodeLong_2(long j, String str, long j2, int i2);

    private native boolean encodeSet(long j, String str, @Nullable String[] strArr);

    private native boolean encodeSet_2(long j, String str, @Nullable String[] strArr, int i2);

    private native boolean encodeString(long j, String str, @Nullable String str2);

    private native boolean encodeString_2(long j, String str, @Nullable String str2, int i2);

    private static native long getDefaultMMKV(int i2, @Nullable String str);

    private static native long getMMKVWithAshmemFD(String str, int i2, int i3, @Nullable String str2);

    private static native long getMMKVWithID(String str, int i2, @Nullable String str2, @Nullable String str3, long j);

    private static native long getMMKVWithIDAndSize(String str, int i2, int i3, @Nullable String str2);

    private native boolean isCompareBeforeSetEnabled();

    @r87
    private native boolean isEncryptionEnabled();

    @r87
    private native boolean isExpirationEnabled();

    public static native boolean isFileValid(String str, @Nullable String str2);

    private static native void jniInitialize(String str, String str2, int i2, boolean z);

    private static void mmkvLogImp(int i2, String str, int i3, String str2, String str3) {
        xdb xdbVar = h;
        if (xdbVar != null && i) {
            xdbVar.a(c[i2], str, i3, str2, str3);
            return;
        }
        int i4 = a.a[c[i2].ordinal()];
        if (i4 == 1) {
            Log.d("MMKV", str3);
            return;
        }
        if (i4 == 2) {
            Log.w("MMKV", str3);
        } else if (i4 == 3) {
            Log.e("MMKV", str3);
        } else {
            if (i4 != 5) {
                return;
            }
            Log.i("MMKV", str3);
        }
    }

    @r87
    private native void nativeEnableCompareBeforeSet();

    public static MMKV o() throws RuntimeException {
        if (e != null) {
            return b(getDefaultMMKV(1, null), "DefaultMMKV", 1);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    private static void onContentChangedByOuterProcess(String str) {
    }

    public static native void onExit();

    private static int onMMKVCRCCheckFail(String str) {
        MMKVRecoverStrategic mMKVRecoverStrategicB = MMKVRecoverStrategic.OnErrorDiscard;
        xdb xdbVar = h;
        if (xdbVar != null) {
            mMKVRecoverStrategicB = xdbVar.b(str);
        }
        N(MMKVLogLevel.LevelInfo, "Recover strategic for " + str + " is " + mMKVRecoverStrategicB);
        Integer num = a.get(mMKVRecoverStrategicB);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private static int onMMKVFileLengthError(String str) {
        MMKVRecoverStrategic mMKVRecoverStrategicC = MMKVRecoverStrategic.OnErrorDiscard;
        xdb xdbVar = h;
        if (xdbVar != null) {
            mMKVRecoverStrategicC = xdbVar.c(str);
        }
        N(MMKVLogLevel.LevelInfo, "Recover strategic for " + str + " is " + mMKVRecoverStrategicC);
        Integer num = a.get(mMKVRecoverStrategicC);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static void p() {
        synchronized (d) {
            f = false;
        }
        Log.i("MMKV", "Disable checkProcessMode()");
    }

    public static native int pageSize();

    public static String q(String str, String str2, b bVar, MMKVLogLevel mMKVLogLevel, boolean z) {
        if (bVar != null) {
            bVar.a("mmkv");
        } else {
            System.loadLibrary("mmkv");
        }
        jniInitialize(str, str2, F(mMKVLogLevel), z);
        e = str;
        return str;
    }

    public static void r() {
        synchronized (d) {
            f = true;
        }
        Log.i("MMKV", "Enable checkProcessMode()");
    }

    private native void removeValueForKey(long j, String str);

    public static native long restoreAllFromDirectory(String str);

    public static native boolean restoreOneMMKVFromDirectory(String str, String str2, @Nullable String str3);

    private static native void setCallbackHandler(boolean z, boolean z2);

    private static native void setLogLevel(int i2);

    private static native void setWantsContentChangeNotify(boolean z);

    private native void sync(boolean z);

    private native long totalSize(long j);

    private native int valueSize(long j, String str, boolean z);

    public static native String version();

    private native int writeValueToNB(long j, String str, long j2, int i2);

    public byte[] A(String str, @Nullable byte[] bArr) {
        return f(str, bArr);
    }

    public int B(SharedPreferences sharedPreferences) {
        Map<String, ?> all = sharedPreferences.getAll();
        if (all == null || all.size() <= 0) {
            return 0;
        }
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && value != null) {
                if (value instanceof Boolean) {
                    encodeBool(this.nativeHandle, key, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    encodeInt(this.nativeHandle, key, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    encodeLong(this.nativeHandle, key, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    encodeFloat(this.nativeHandle, key, ((Float) value).floatValue());
                } else if (value instanceof Double) {
                    encodeDouble(this.nativeHandle, key, ((Double) value).doubleValue());
                } else if (value instanceof String) {
                    encodeString(this.nativeHandle, key, (String) value);
                } else if (value instanceof Set) {
                    x(key, (Set) value);
                } else {
                    N(MMKVLogLevel.LevelError, "unknown type: " + value.getClass());
                }
            }
        }
        return all.size();
    }

    public SharedPreferences.Editor K(String str, @Nullable byte[] bArr) {
        z(str, bArr);
        return this;
    }

    public void M(String str) {
        removeValueForKey(this.nativeHandle, str);
    }

    @Nullable
    public String[] a() {
        return allKeys(this.nativeHandle, false);
    }

    @Override // android.content.SharedPreferences.Editor
    @Deprecated
    public void apply() {
        sync(false);
    }

    public native int ashmemFD();

    public native int ashmemMetaFD();

    public boolean c(String str) {
        return containsKey(this.nativeHandle, str);
    }

    public native void checkContentChangedByOuterProcess();

    public native void checkReSetCryptKey(@Nullable String str);

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor clear() {
        clearAll();
        return this;
    }

    public native void clearAll();

    public native void clearAllWithKeepingSpace();

    public native void clearMemoryCache();

    public native void close();

    @Override // android.content.SharedPreferences.Editor
    @Deprecated
    public boolean commit() {
        sync(true);
        return true;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return c(str);
    }

    @Nullable
    public native String cryptKey();

    public long d() {
        return count(this.nativeHandle, false);
    }

    public native boolean disableAutoKeyExpire();

    public native void disableCompareBeforeSet();

    public boolean e(String str, boolean z) {
        return decodeBool(this.nativeHandle, str, z);
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return this;
    }

    public native boolean enableAutoKeyExpire(int i2);

    @Nullable
    public byte[] f(String str, @Nullable byte[] bArr) {
        byte[] bArrDecodeBytes = decodeBytes(this.nativeHandle, str);
        return bArrDecodeBytes != null ? bArrDecodeBytes : bArr;
    }

    public double g(String str, double d2) {
        return decodeDouble(this.nativeHandle, str, d2);
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        throw new UnsupportedOperationException("Intentionally Not Supported. Use allKeys() instead, getAll() not implement because type-erasure inside mmkv");
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        return decodeBool(this.nativeHandle, str, z);
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f2) {
        return decodeFloat(this.nativeHandle, str, f2);
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i2) {
        return decodeInt(this.nativeHandle, str, i2);
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        return decodeLong(this.nativeHandle, str, j);
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public String getString(String str, @Nullable String str2) {
        return decodeString(this.nativeHandle, str, str2);
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public Set<String> getStringSet(String str, @Nullable Set<String> set) {
        return m(str, set);
    }

    public float h(String str, float f2) {
        return decodeFloat(this.nativeHandle, str, f2);
    }

    public int i(String str, int i2) {
        return decodeInt(this.nativeHandle, str, i2);
    }

    public long j(String str, long j) {
        return decodeLong(this.nativeHandle, str, j);
    }

    @Nullable
    public String k(String str, @Nullable String str2) {
        return decodeString(this.nativeHandle, str, str2);
    }

    @Nullable
    public Set<String> l(String str) {
        return m(str, null);
    }

    public native void lock();

    @Nullable
    public Set<String> m(String str, @Nullable Set<String> set) {
        return n(str, set, HashSet.class);
    }

    public native String mmapID();

    @Nullable
    public Set<String> n(String str, @Nullable Set<String> set, Class<? extends Set> cls) {
        String[] strArrDecodeStringSet = decodeStringSet(this.nativeHandle, str);
        if (strArrDecodeStringSet == null) {
            return set;
        }
        try {
            Set<String> setNewInstance = cls.newInstance();
            setNewInstance.addAll(Arrays.asList(strArrDecodeStringSet));
            return setNewInstance;
        } catch (IllegalAccessException | InstantiationException unused) {
            return set;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putBoolean(String str, boolean z) {
        encodeBool(this.nativeHandle, str, z);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putFloat(String str, float f2) {
        encodeFloat(this.nativeHandle, str, f2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putInt(String str, int i2) {
        encodeInt(this.nativeHandle, str, i2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putLong(String str, long j) {
        encodeLong(this.nativeHandle, str, j);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putString(String str, @Nullable String str2) {
        encodeString(this.nativeHandle, str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putStringSet(String str, @Nullable Set<String> set) {
        x(str, set);
        return this;
    }

    public native boolean reKey(@Nullable String str);

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor remove(String str) {
        M(str);
        return this;
    }

    public native void removeValuesForKeys(String[] strArr);

    public boolean s(String str, double d2) {
        return encodeDouble(this.nativeHandle, str, d2);
    }

    public boolean t(String str, float f2) {
        return encodeFloat(this.nativeHandle, str, f2);
    }

    public native void trim();

    public native boolean tryLock();

    public boolean u(String str, int i2) {
        return encodeInt(this.nativeHandle, str, i2);
    }

    public native void unlock();

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    public boolean v(String str, long j) {
        return encodeLong(this.nativeHandle, str, j);
    }

    public boolean w(String str, @Nullable String str2) {
        return encodeString(this.nativeHandle, str, str2);
    }

    public boolean x(String str, @Nullable Set<String> set) {
        return encodeSet(this.nativeHandle, str, set == null ? null : (String[]) set.toArray(new String[0]));
    }

    public boolean y(String str, boolean z) {
        return encodeBool(this.nativeHandle, str, z);
    }

    public boolean z(String str, @Nullable byte[] bArr) {
        return encodeBytes(this.nativeHandle, str, bArr);
    }
}
