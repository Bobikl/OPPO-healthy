package com.google.android.gms.dynamite;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.oplus.aiunit.vision.oea;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes13.dex */
@KeepForSdk
public final class DynamiteModule {

    @KeepForSdk
    public static final int LOCAL = -1;

    @KeepForSdk
    public static final int NONE = 0;

    @KeepForSdk
    public static final int NO_SELECTION = 0;

    @KeepForSdk
    public static final int REMOTE = 1;
    private static Boolean zzb = null;
    private static String zzc = null;
    private static boolean zzd = false;
    private static int zze = -1;
    private static Boolean zzf;
    private static zzp zzk;
    private static zzq zzl;
    private final Context zzj;
    private static final ThreadLocal zzg = new ThreadLocal();
    private static final ThreadLocal zzh = new zzd();
    private static final VersionPolicy.IVersions zzi = new zze();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new zzf();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = new zzg();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();

    @NonNull
    public static final VersionPolicy zza = new zzl();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @NonNull
        public static ClassLoader sClassLoader;
    }

    @KeepForSdk
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, zzo zzoVar) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th, zzo zzoVar) {
            super(str, th);
        }
    }

    public interface VersionPolicy {

        @KeepForSdk
        public interface IVersions {
            int zza(@NonNull Context context, @NonNull String str);

            int zzb(@NonNull Context context, @NonNull String str, boolean z) throws LoadingException;
        }

        @KeepForSdk
        public static class SelectionResult {

            @KeepForSdk
            public int localVersion = 0;

            @KeepForSdk
            public int remoteVersion = 0;

            @KeepForSdk
            public int selection = 0;
        }

        @NonNull
        @KeepForSdk
        SelectionResult selectModule(@NonNull Context context, @NonNull String str, @NonNull IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzj = context;
    }

    @KeepForSdk
    public static int getLocalVersion(@NonNull Context context, @NonNull String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    @KeepForSdk
    public static int getRemoteVersion(@NonNull Context context, @NonNull String str) {
        return zza(context, str, false);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x023d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0243  */
    /* JADX WARN: Code duplicated, block: B:114:0x0250  */
    /* JADX WARN: Code duplicated, block: B:119:0x0262 A[Catch: all -> 0x02ab, TryCatch #5 {all -> 0x02ab, blocks: (B:5:0x0029, B:9:0x0073, B:14:0x007b, B:17:0x0081, B:20:0x008b, B:94:0x01ed, B:95:0x01f8, B:97:0x01fa, B:99:0x01fc, B:100:0x0204, B:119:0x0262, B:120:0x0279, B:102:0x0206, B:104:0x0224, B:106:0x0233, B:117:0x0259, B:118:0x0261, B:121:0x027a, B:122:0x02aa), top: B:141:0x0029, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0081 A[Catch: all -> 0x02ab, TRY_LEAVE, TryCatch #5 {all -> 0x02ab, blocks: (B:5:0x0029, B:9:0x0073, B:14:0x007b, B:17:0x0081, B:20:0x008b, B:94:0x01ed, B:95:0x01f8, B:97:0x01fa, B:99:0x01fc, B:100:0x0204, B:119:0x0262, B:120:0x0279, B:102:0x0206, B:104:0x0224, B:106:0x0233, B:117:0x0259, B:118:0x0261, B:121:0x027a, B:122:0x02aa), top: B:141:0x0029, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0096 A[Catch: all -> 0x01e9, TryCatch #3 {, blocks: (B:23:0x0090, B:25:0x0096, B:26:0x0098, B:88:0x01e0, B:89:0x01e8), top: B:140:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x009b A[Catch: all -> 0x01ec, LoadingException -> 0x01f9, RemoteException -> 0x01fb, TRY_ENTER, TryCatch #7 {RemoteException -> 0x01fb, LoadingException -> 0x01f9, all -> 0x01ec, blocks: (B:22:0x008f, B:28:0x009b, B:30:0x00a2, B:31:0x00c2, B:35:0x00c8, B:37:0x00d0, B:39:0x00d4, B:40:0x00df, B:47:0x00ec, B:49:0x00f2, B:51:0x0119, B:53:0x0121, B:54:0x0128, B:55:0x0130, B:50:0x0106, B:58:0x0133, B:59:0x0134, B:60:0x013c, B:61:0x013d, B:62:0x0145, B:65:0x0148, B:66:0x0149, B:68:0x016d, B:70:0x0174, B:72:0x017c, B:78:0x01b5, B:80:0x01bb, B:82:0x01c5, B:83:0x01cd, B:73:0x018b, B:74:0x0193, B:76:0x0196, B:77:0x01a6, B:84:0x01ce, B:85:0x01d6, B:86:0x01d7, B:87:0x01df, B:92:0x01eb), top: B:142:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a2 A[Catch: all -> 0x01ec, LoadingException -> 0x01f9, RemoteException -> 0x01fb, TryCatch #7 {RemoteException -> 0x01fb, LoadingException -> 0x01f9, all -> 0x01ec, blocks: (B:22:0x008f, B:28:0x009b, B:30:0x00a2, B:31:0x00c2, B:35:0x00c8, B:37:0x00d0, B:39:0x00d4, B:40:0x00df, B:47:0x00ec, B:49:0x00f2, B:51:0x0119, B:53:0x0121, B:54:0x0128, B:55:0x0130, B:50:0x0106, B:58:0x0133, B:59:0x0134, B:60:0x013c, B:61:0x013d, B:62:0x0145, B:65:0x0148, B:66:0x0149, B:68:0x016d, B:70:0x0174, B:72:0x017c, B:78:0x01b5, B:80:0x01bb, B:82:0x01c5, B:83:0x01cd, B:73:0x018b, B:74:0x0193, B:76:0x0196, B:77:0x01a6, B:84:0x01ce, B:85:0x01d6, B:86:0x01d7, B:87:0x01df, B:92:0x01eb), top: B:142:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c8 A[Catch: all -> 0x01ec, LoadingException -> 0x01f9, RemoteException -> 0x01fb, TRY_ENTER, TryCatch #7 {RemoteException -> 0x01fb, LoadingException -> 0x01f9, all -> 0x01ec, blocks: (B:22:0x008f, B:28:0x009b, B:30:0x00a2, B:31:0x00c2, B:35:0x00c8, B:37:0x00d0, B:39:0x00d4, B:40:0x00df, B:47:0x00ec, B:49:0x00f2, B:51:0x0119, B:53:0x0121, B:54:0x0128, B:55:0x0130, B:50:0x0106, B:58:0x0133, B:59:0x0134, B:60:0x013c, B:61:0x013d, B:62:0x0145, B:65:0x0148, B:66:0x0149, B:68:0x016d, B:70:0x0174, B:72:0x017c, B:78:0x01b5, B:80:0x01bb, B:82:0x01c5, B:83:0x01cd, B:73:0x018b, B:74:0x0193, B:76:0x0196, B:77:0x01a6, B:84:0x01ce, B:85:0x01d6, B:86:0x01d7, B:87:0x01df, B:92:0x01eb), top: B:142:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:61:0x013d A[Catch: all -> 0x01ec, LoadingException -> 0x01f9, RemoteException -> 0x01fb, TryCatch #7 {RemoteException -> 0x01fb, LoadingException -> 0x01f9, all -> 0x01ec, blocks: (B:22:0x008f, B:28:0x009b, B:30:0x00a2, B:31:0x00c2, B:35:0x00c8, B:37:0x00d0, B:39:0x00d4, B:40:0x00df, B:47:0x00ec, B:49:0x00f2, B:51:0x0119, B:53:0x0121, B:54:0x0128, B:55:0x0130, B:50:0x0106, B:58:0x0133, B:59:0x0134, B:60:0x013c, B:61:0x013d, B:62:0x0145, B:65:0x0148, B:66:0x0149, B:68:0x016d, B:70:0x0174, B:72:0x017c, B:78:0x01b5, B:80:0x01bb, B:82:0x01c5, B:83:0x01cd, B:73:0x018b, B:74:0x0193, B:76:0x0196, B:77:0x01a6, B:84:0x01ce, B:85:0x01d6, B:86:0x01d7, B:87:0x01df, B:92:0x01eb), top: B:142:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0149 A[Catch: all -> 0x01ec, LoadingException -> 0x01f9, RemoteException -> 0x01fb, TryCatch #7 {RemoteException -> 0x01fb, LoadingException -> 0x01f9, all -> 0x01ec, blocks: (B:22:0x008f, B:28:0x009b, B:30:0x00a2, B:31:0x00c2, B:35:0x00c8, B:37:0x00d0, B:39:0x00d4, B:40:0x00df, B:47:0x00ec, B:49:0x00f2, B:51:0x0119, B:53:0x0121, B:54:0x0128, B:55:0x0130, B:50:0x0106, B:58:0x0133, B:59:0x0134, B:60:0x013c, B:61:0x013d, B:62:0x0145, B:65:0x0148, B:66:0x0149, B:68:0x016d, B:70:0x0174, B:72:0x017c, B:78:0x01b5, B:80:0x01bb, B:82:0x01c5, B:83:0x01cd, B:73:0x018b, B:74:0x0193, B:76:0x0196, B:77:0x01a6, B:84:0x01ce, B:85:0x01d6, B:86:0x01d7, B:87:0x01df, B:92:0x01eb), top: B:142:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:68:0x016d A[Catch: all -> 0x01ec, LoadingException -> 0x01f9, RemoteException -> 0x01fb, TryCatch #7 {RemoteException -> 0x01fb, LoadingException -> 0x01f9, all -> 0x01ec, blocks: (B:22:0x008f, B:28:0x009b, B:30:0x00a2, B:31:0x00c2, B:35:0x00c8, B:37:0x00d0, B:39:0x00d4, B:40:0x00df, B:47:0x00ec, B:49:0x00f2, B:51:0x0119, B:53:0x0121, B:54:0x0128, B:55:0x0130, B:50:0x0106, B:58:0x0133, B:59:0x0134, B:60:0x013c, B:61:0x013d, B:62:0x0145, B:65:0x0148, B:66:0x0149, B:68:0x016d, B:70:0x0174, B:72:0x017c, B:78:0x01b5, B:80:0x01bb, B:82:0x01c5, B:83:0x01cd, B:73:0x018b, B:74:0x0193, B:76:0x0196, B:77:0x01a6, B:84:0x01ce, B:85:0x01d6, B:86:0x01d7, B:87:0x01df, B:92:0x01eb), top: B:142:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0174 A[Catch: all -> 0x01ec, LoadingException -> 0x01f9, RemoteException -> 0x01fb, TryCatch #7 {RemoteException -> 0x01fb, LoadingException -> 0x01f9, all -> 0x01ec, blocks: (B:22:0x008f, B:28:0x009b, B:30:0x00a2, B:31:0x00c2, B:35:0x00c8, B:37:0x00d0, B:39:0x00d4, B:40:0x00df, B:47:0x00ec, B:49:0x00f2, B:51:0x0119, B:53:0x0121, B:54:0x0128, B:55:0x0130, B:50:0x0106, B:58:0x0133, B:59:0x0134, B:60:0x013c, B:61:0x013d, B:62:0x0145, B:65:0x0148, B:66:0x0149, B:68:0x016d, B:70:0x0174, B:72:0x017c, B:78:0x01b5, B:80:0x01bb, B:82:0x01c5, B:83:0x01cd, B:73:0x018b, B:74:0x0193, B:76:0x0196, B:77:0x01a6, B:84:0x01ce, B:85:0x01d6, B:86:0x01d7, B:87:0x01df, B:92:0x01eb), top: B:142:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:72:0x017c A[Catch: all -> 0x01ec, LoadingException -> 0x01f9, RemoteException -> 0x01fb, TryCatch #7 {RemoteException -> 0x01fb, LoadingException -> 0x01f9, all -> 0x01ec, blocks: (B:22:0x008f, B:28:0x009b, B:30:0x00a2, B:31:0x00c2, B:35:0x00c8, B:37:0x00d0, B:39:0x00d4, B:40:0x00df, B:47:0x00ec, B:49:0x00f2, B:51:0x0119, B:53:0x0121, B:54:0x0128, B:55:0x0130, B:50:0x0106, B:58:0x0133, B:59:0x0134, B:60:0x013c, B:61:0x013d, B:62:0x0145, B:65:0x0148, B:66:0x0149, B:68:0x016d, B:70:0x0174, B:72:0x017c, B:78:0x01b5, B:80:0x01bb, B:82:0x01c5, B:83:0x01cd, B:73:0x018b, B:74:0x0193, B:76:0x0196, B:77:0x01a6, B:84:0x01ce, B:85:0x01d6, B:86:0x01d7, B:87:0x01df, B:92:0x01eb), top: B:142:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:73:0x018b A[Catch: all -> 0x01ec, LoadingException -> 0x01f9, RemoteException -> 0x01fb, TryCatch #7 {RemoteException -> 0x01fb, LoadingException -> 0x01f9, all -> 0x01ec, blocks: (B:22:0x008f, B:28:0x009b, B:30:0x00a2, B:31:0x00c2, B:35:0x00c8, B:37:0x00d0, B:39:0x00d4, B:40:0x00df, B:47:0x00ec, B:49:0x00f2, B:51:0x0119, B:53:0x0121, B:54:0x0128, B:55:0x0130, B:50:0x0106, B:58:0x0133, B:59:0x0134, B:60:0x013c, B:61:0x013d, B:62:0x0145, B:65:0x0148, B:66:0x0149, B:68:0x016d, B:70:0x0174, B:72:0x017c, B:78:0x01b5, B:80:0x01bb, B:82:0x01c5, B:83:0x01cd, B:73:0x018b, B:74:0x0193, B:76:0x0196, B:77:0x01a6, B:84:0x01ce, B:85:0x01d6, B:86:0x01d7, B:87:0x01df, B:92:0x01eb), top: B:142:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0194 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0196 A[Catch: all -> 0x01ec, LoadingException -> 0x01f9, RemoteException -> 0x01fb, TryCatch #7 {RemoteException -> 0x01fb, LoadingException -> 0x01f9, all -> 0x01ec, blocks: (B:22:0x008f, B:28:0x009b, B:30:0x00a2, B:31:0x00c2, B:35:0x00c8, B:37:0x00d0, B:39:0x00d4, B:40:0x00df, B:47:0x00ec, B:49:0x00f2, B:51:0x0119, B:53:0x0121, B:54:0x0128, B:55:0x0130, B:50:0x0106, B:58:0x0133, B:59:0x0134, B:60:0x013c, B:61:0x013d, B:62:0x0145, B:65:0x0148, B:66:0x0149, B:68:0x016d, B:70:0x0174, B:72:0x017c, B:78:0x01b5, B:80:0x01bb, B:82:0x01c5, B:83:0x01cd, B:73:0x018b, B:74:0x0193, B:76:0x0196, B:77:0x01a6, B:84:0x01ce, B:85:0x01d6, B:86:0x01d7, B:87:0x01df, B:92:0x01eb), top: B:142:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01a6 A[Catch: all -> 0x01ec, LoadingException -> 0x01f9, RemoteException -> 0x01fb, TryCatch #7 {RemoteException -> 0x01fb, LoadingException -> 0x01f9, all -> 0x01ec, blocks: (B:22:0x008f, B:28:0x009b, B:30:0x00a2, B:31:0x00c2, B:35:0x00c8, B:37:0x00d0, B:39:0x00d4, B:40:0x00df, B:47:0x00ec, B:49:0x00f2, B:51:0x0119, B:53:0x0121, B:54:0x0128, B:55:0x0130, B:50:0x0106, B:58:0x0133, B:59:0x0134, B:60:0x013c, B:61:0x013d, B:62:0x0145, B:65:0x0148, B:66:0x0149, B:68:0x016d, B:70:0x0174, B:72:0x017c, B:78:0x01b5, B:80:0x01bb, B:82:0x01c5, B:83:0x01cd, B:73:0x018b, B:74:0x0193, B:76:0x0196, B:77:0x01a6, B:84:0x01ce, B:85:0x01d6, B:86:0x01d7, B:87:0x01df, B:92:0x01eb), top: B:142:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01bb A[Catch: all -> 0x01ec, LoadingException -> 0x01f9, RemoteException -> 0x01fb, TryCatch #7 {RemoteException -> 0x01fb, LoadingException -> 0x01f9, all -> 0x01ec, blocks: (B:22:0x008f, B:28:0x009b, B:30:0x00a2, B:31:0x00c2, B:35:0x00c8, B:37:0x00d0, B:39:0x00d4, B:40:0x00df, B:47:0x00ec, B:49:0x00f2, B:51:0x0119, B:53:0x0121, B:54:0x0128, B:55:0x0130, B:50:0x0106, B:58:0x0133, B:59:0x0134, B:60:0x013c, B:61:0x013d, B:62:0x0145, B:65:0x0148, B:66:0x0149, B:68:0x016d, B:70:0x0174, B:72:0x017c, B:78:0x01b5, B:80:0x01bb, B:82:0x01c5, B:83:0x01cd, B:73:0x018b, B:74:0x0193, B:76:0x0196, B:77:0x01a6, B:84:0x01ce, B:85:0x01d6, B:86:0x01d7, B:87:0x01df, B:92:0x01eb), top: B:142:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01c5 A[Catch: all -> 0x01ec, LoadingException -> 0x01f9, RemoteException -> 0x01fb, TryCatch #7 {RemoteException -> 0x01fb, LoadingException -> 0x01f9, all -> 0x01ec, blocks: (B:22:0x008f, B:28:0x009b, B:30:0x00a2, B:31:0x00c2, B:35:0x00c8, B:37:0x00d0, B:39:0x00d4, B:40:0x00df, B:47:0x00ec, B:49:0x00f2, B:51:0x0119, B:53:0x0121, B:54:0x0128, B:55:0x0130, B:50:0x0106, B:58:0x0133, B:59:0x0134, B:60:0x013c, B:61:0x013d, B:62:0x0145, B:65:0x0148, B:66:0x0149, B:68:0x016d, B:70:0x0174, B:72:0x017c, B:78:0x01b5, B:80:0x01bb, B:82:0x01c5, B:83:0x01cd, B:73:0x018b, B:74:0x0193, B:76:0x0196, B:77:0x01a6, B:84:0x01ce, B:85:0x01d6, B:86:0x01d7, B:87:0x01df, B:92:0x01eb), top: B:142:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01ce A[Catch: all -> 0x01ec, LoadingException -> 0x01f9, RemoteException -> 0x01fb, TryCatch #7 {RemoteException -> 0x01fb, LoadingException -> 0x01f9, all -> 0x01ec, blocks: (B:22:0x008f, B:28:0x009b, B:30:0x00a2, B:31:0x00c2, B:35:0x00c8, B:37:0x00d0, B:39:0x00d4, B:40:0x00df, B:47:0x00ec, B:49:0x00f2, B:51:0x0119, B:53:0x0121, B:54:0x0128, B:55:0x0130, B:50:0x0106, B:58:0x0133, B:59:0x0134, B:60:0x013c, B:61:0x013d, B:62:0x0145, B:65:0x0148, B:66:0x0149, B:68:0x016d, B:70:0x0174, B:72:0x017c, B:78:0x01b5, B:80:0x01bb, B:82:0x01c5, B:83:0x01cd, B:73:0x018b, B:74:0x0193, B:76:0x0196, B:77:0x01a6, B:84:0x01ce, B:85:0x01d6, B:86:0x01d7, B:87:0x01df, B:92:0x01eb), top: B:142:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01d7 A[Catch: all -> 0x01ec, LoadingException -> 0x01f9, RemoteException -> 0x01fb, TryCatch #7 {RemoteException -> 0x01fb, LoadingException -> 0x01f9, all -> 0x01ec, blocks: (B:22:0x008f, B:28:0x009b, B:30:0x00a2, B:31:0x00c2, B:35:0x00c8, B:37:0x00d0, B:39:0x00d4, B:40:0x00df, B:47:0x00ec, B:49:0x00f2, B:51:0x0119, B:53:0x0121, B:54:0x0128, B:55:0x0130, B:50:0x0106, B:58:0x0133, B:59:0x0134, B:60:0x013c, B:61:0x013d, B:62:0x0145, B:65:0x0148, B:66:0x0149, B:68:0x016d, B:70:0x0174, B:72:0x017c, B:78:0x01b5, B:80:0x01bb, B:82:0x01c5, B:83:0x01cd, B:73:0x018b, B:74:0x0193, B:76:0x0196, B:77:0x01a6, B:84:0x01ce, B:85:0x01d6, B:86:0x01d7, B:87:0x01df, B:92:0x01eb), top: B:142:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01e0 A[Catch: all -> 0x01e9, TRY_ENTER, TryCatch #3 {, blocks: (B:23:0x0090, B:25:0x0096, B:26:0x0098, B:88:0x01e0, B:89:0x01e8), top: B:140:0x0090 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:119:0x0262, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x00a2, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x0149, please report this as an issue */
    @NonNull
    @KeepForSdk
    public static DynamiteModule load(@NonNull Context context, @NonNull VersionPolicy versionPolicy, @NonNull String str) throws LoadingException {
        DynamiteModule dynamiteModuleZzc;
        int i;
        Boolean bool;
        zzp zzpVarZzg;
        int iZze;
        IObjectWrapper iObjectWrapperZzh;
        Object objUnwrap;
        DynamiteModule dynamiteModule;
        zzm zzmVar;
        zzq zzqVar;
        zzm zzmVar2;
        Boolean boolValueOf;
        IObjectWrapper iObjectWrapperZze;
        Cursor cursor;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new LoadingException("null application Context", null);
        }
        ThreadLocal threadLocal = zzg;
        zzm zzmVar3 = (zzm) threadLocal.get();
        zzm zzmVar4 = new zzm(null);
        threadLocal.set(zzmVar4);
        ThreadLocal threadLocal2 = zzh;
        long jLongValue = ((Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.uptimeMillis()));
            VersionPolicy.SelectionResult selectionResultSelectModule = versionPolicy.selectModule(context, str, zzi);
            Log.i("DynamiteModule", "Considering local module " + str + ":" + selectionResultSelectModule.localVersion + " and remote module " + str + ":" + selectionResultSelectModule.remoteVersion);
            int i2 = selectionResultSelectModule.selection;
            if (i2 != 0) {
                if (i2 != -1) {
                    if (i2 == 1 || selectionResultSelectModule.remoteVersion != 0) {
                        if (i2 == -1) {
                            dynamiteModuleZzc = zzc(applicationContext, str);
                        } else {
                            if (i2 == 1) {
                                throw new LoadingException("VersionPolicy returned invalid code:" + i2, null);
                            }
                            try {
                                i = selectionResultSelectModule.remoteVersion;
                                try {
                                    synchronized (DynamiteModule.class) {
                                        if (zzf(context)) {
                                            throw new LoadingException("Remote loading disabled", null);
                                        }
                                        bool = zzb;
                                    }
                                    if (bool != null) {
                                        throw new LoadingException("Failed to determine which loading route to use.", null);
                                    }
                                    if (bool.booleanValue()) {
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i);
                                        synchronized (DynamiteModule.class) {
                                            zzqVar = zzl;
                                        }
                                        if (zzqVar != null) {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                        }
                                        zzmVar2 = (zzm) threadLocal.get();
                                        if (zzmVar2 != null || zzmVar2.zza == null) {
                                            throw new LoadingException("No result cursor", null);
                                        }
                                        Context applicationContext2 = context.getApplicationContext();
                                        Cursor cursor2 = zzmVar2.zza;
                                        ObjectWrapper.wrap(null);
                                        synchronized (DynamiteModule.class) {
                                            boolValueOf = Boolean.valueOf(zze >= 2);
                                        }
                                        if (boolValueOf.booleanValue()) {
                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                            iObjectWrapperZze = zzqVar.zzf(ObjectWrapper.wrap(applicationContext2), str, i, ObjectWrapper.wrap(cursor2));
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                            iObjectWrapperZze = zzqVar.zze(ObjectWrapper.wrap(applicationContext2), str, i, ObjectWrapper.wrap(cursor2));
                                        }
                                        Context context2 = (Context) ObjectWrapper.unwrap(iObjectWrapperZze);
                                        if (context2 == null) {
                                            throw new LoadingException("Failed to get module context", null);
                                        }
                                        dynamiteModule = new DynamiteModule(context2);
                                    } else {
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i);
                                        zzpVarZzg = zzg(context);
                                        if (zzpVarZzg != null) {
                                            throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                        }
                                        iZze = zzpVarZzg.zze();
                                        if (iZze >= 3) {
                                            zzmVar = (zzm) threadLocal.get();
                                            if (zzmVar != null) {
                                                throw new LoadingException("No cached result cursor holder", null);
                                            }
                                            iObjectWrapperZzh = zzpVarZzg.zzi(ObjectWrapper.wrap(context), str, i, ObjectWrapper.wrap(zzmVar.zza));
                                        } else if (iZze == 2) {
                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                            iObjectWrapperZzh = zzpVarZzg.zzj(ObjectWrapper.wrap(context), str, i);
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                            iObjectWrapperZzh = zzpVarZzg.zzh(ObjectWrapper.wrap(context), str, i);
                                        }
                                        objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzh);
                                        if (objUnwrap != null) {
                                            throw new LoadingException("Failed to load remote module.", null);
                                        }
                                        dynamiteModule = new DynamiteModule((Context) objUnwrap);
                                    }
                                    dynamiteModuleZzc = dynamiteModule;
                                } catch (RemoteException e2) {
                                    throw new LoadingException("Failed to load remote module.", e2, null);
                                } catch (LoadingException e3) {
                                    throw e3;
                                } catch (Throwable th) {
                                    CrashUtils.addDynamiteErrorToDropBox(context, th);
                                    throw new LoadingException("Failed to load remote module.", th, null);
                                }
                            } catch (LoadingException e4) {
                                Log.w("DynamiteModule", "Failed to load remote module: " + e4.getMessage());
                                int i3 = selectionResultSelectModule.localVersion;
                                if (i3 == 0 || versionPolicy.selectModule(context, str, new zzn(i3, 0)).selection != -1) {
                                    throw new LoadingException("Remote load failed. No local fallback found.", e4, null);
                                }
                                dynamiteModuleZzc = zzc(applicationContext, str);
                            }
                        }
                        if (jLongValue == 0) {
                            zzh.remove();
                        } else {
                            zzh.set(Long.valueOf(jLongValue));
                        }
                        cursor = zzmVar4.zza;
                        if (cursor != null) {
                            cursor.close();
                        }
                        zzg.set(zzmVar3);
                        return dynamiteModuleZzc;
                    }
                } else if (selectionResultSelectModule.localVersion != 0) {
                    i2 = -1;
                    if (i2 == 1) {
                    }
                    if (i2 == -1) {
                        dynamiteModuleZzc = zzc(applicationContext, str);
                    } else {
                        if (i2 == 1) {
                            throw new LoadingException("VersionPolicy returned invalid code:" + i2, null);
                        }
                        i = selectionResultSelectModule.remoteVersion;
                        synchronized (DynamiteModule.class) {
                            if (zzf(context)) {
                                throw new LoadingException("Remote loading disabled", null);
                            }
                            bool = zzb;
                            if (bool != null) {
                                throw new LoadingException("Failed to determine which loading route to use.", null);
                            }
                            if (bool.booleanValue()) {
                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i);
                                synchronized (DynamiteModule.class) {
                                    zzqVar = zzl;
                                    if (zzqVar != null) {
                                        throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                    }
                                    zzmVar2 = (zzm) threadLocal.get();
                                    if (zzmVar2 != null) {
                                    }
                                    throw new LoadingException("No result cursor", null);
                                }
                            }
                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i);
                            zzpVarZzg = zzg(context);
                            if (zzpVarZzg != null) {
                                throw new LoadingException("Failed to create IDynamiteLoader.", null);
                            }
                            iZze = zzpVarZzg.zze();
                            if (iZze >= 3) {
                                zzmVar = (zzm) threadLocal.get();
                                if (zzmVar != null) {
                                    throw new LoadingException("No cached result cursor holder", null);
                                }
                                iObjectWrapperZzh = zzpVarZzg.zzi(ObjectWrapper.wrap(context), str, i, ObjectWrapper.wrap(zzmVar.zza));
                            } else if (iZze == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                iObjectWrapperZzh = zzpVarZzg.zzj(ObjectWrapper.wrap(context), str, i);
                            } else {
                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                iObjectWrapperZzh = zzpVarZzg.zzh(ObjectWrapper.wrap(context), str, i);
                            }
                            objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzh);
                            if (objUnwrap != null) {
                                throw new LoadingException("Failed to load remote module.", null);
                            }
                            dynamiteModule = new DynamiteModule((Context) objUnwrap);
                            dynamiteModuleZzc = dynamiteModule;
                        }
                    }
                    if (jLongValue == 0) {
                        zzh.remove();
                    } else {
                        zzh.set(Long.valueOf(jLongValue));
                    }
                    cursor = zzmVar4.zza;
                    if (cursor != null) {
                        cursor.close();
                    }
                    zzg.set(zzmVar3);
                    return dynamiteModuleZzc;
                }
            }
            throw new LoadingException("No acceptable module " + str + " found. Local version is " + selectionResultSelectModule.localVersion + " and remote version is " + selectionResultSelectModule.remoteVersion + ".", null);
        } catch (Throwable th2) {
            if (jLongValue == 0) {
                zzh.remove();
            } else {
                zzh.set(Long.valueOf(jLongValue));
            }
            Cursor cursor3 = zzmVar4.zza;
            if (cursor3 != null) {
                cursor3.close();
            }
            zzg.set(zzmVar3);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0090 A[Catch: all -> 0x009b, TryCatch #6 {, blocks: (B:9:0x0026, B:11:0x0032, B:45:0x0099, B:14:0x0037, B:16:0x003d, B:18:0x0043, B:21:0x0046, B:23:0x004a, B:27:0x0054, B:29:0x005c, B:32:0x0063, B:36:0x0078, B:37:0x0080, B:35:0x006a, B:40:0x0083, B:43:0x0086, B:44:0x0090, B:15:0x003a), top: B:126:0x0026, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x014b A[Catch: all -> 0x01a7, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x01a7, blocks: (B:3:0x0002, B:54:0x00be, B:56:0x00c4, B:61:0x00e5, B:83:0x013d, B:87:0x014b, B:108:0x01a0, B:109:0x01a3, B:103:0x0198, B:59:0x00ca, B:112:0x01a6, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:52:0x00bb, B:19:0x0044, B:38:0x0081, B:41:0x0084, B:49:0x009d, B:53:0x00bd, B:51:0x009f), top: B:120:0x0002, inners: #2, #8 }] */
    public static int zza(@NonNull Context context, @NonNull String str, boolean z) {
        Throwable th;
        RemoteException e2;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = zzb;
                Cursor cursor2 = null;
                int iZzf = 0;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                            if (classLoader == ClassLoader.getSystemClassLoader()) {
                                bool = Boolean.FALSE;
                            } else if (classLoader != null) {
                                try {
                                    zzd(classLoader);
                                } catch (LoadingException unused) {
                                }
                                bool = Boolean.TRUE;
                            } else {
                                if (!zzf(context)) {
                                    return 0;
                                }
                                if (zzd) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                } else {
                                    Boolean bool2 = Boolean.TRUE;
                                    if (bool2.equals(null)) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        try {
                                            int iZzb = zzb(context, str, z, true);
                                            String str2 = zzc;
                                            if (str2 != null && !str2.isEmpty()) {
                                                ClassLoader classLoaderZza = zzb.zza();
                                                if (classLoaderZza == null) {
                                                    String str3 = zzc;
                                                    Preconditions.checkNotNull(str3);
                                                    classLoaderZza = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                }
                                                zzd(classLoaderZza);
                                                declaredField.set(null, classLoaderZza);
                                                zzb = bool2;
                                                return iZzb;
                                            }
                                            return iZzb;
                                        } catch (LoadingException unused2) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        }
                                    }
                                }
                            }
                            zzb = bool;
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e3) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e3.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return zzb(context, str, z, false);
                    } catch (LoadingException e4) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e4.getMessage());
                        return 0;
                    }
                }
                zzp zzpVarZzg = zzg(context);
                if (zzpVarZzg != null) {
                    try {
                        try {
                            int iZze = zzpVarZzg.zze();
                            if (iZze >= 3) {
                                zzm zzmVar = (zzm) zzg.get();
                                if (zzmVar == null || (cursor = zzmVar.zza) == null) {
                                    Cursor cursor3 = (Cursor) ObjectWrapper.unwrap(zzpVarZzg.zzk(ObjectWrapper.wrap(context), str, z, ((Long) zzh.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i = cursor3.getInt(0);
                                                cursor2 = (i <= 0 || !zze(cursor3)) ? cursor3 : null;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                iZzf = i;
                                            } else {
                                                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                            }
                                        } catch (RemoteException e5) {
                                            e2 = e5;
                                            cursor2 = cursor3;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e2.getMessage());
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                    }
                                } else {
                                    iZzf = cursor.getInt(0);
                                }
                            } else if (iZze == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                iZzf = zzpVarZzg.zzg(ObjectWrapper.wrap(context), str, z);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                iZzf = zzpVarZzg.zzf(ObjectWrapper.wrap(context), str, z);
                            }
                        } catch (RemoteException e6) {
                            e2 = e6;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                return iZzf;
            }
        } catch (Throwable th4) {
            CrashUtils.addDynamiteErrorToDropBox(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x016e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x016b: MOVE (r0 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:98:0x016b */
    private static int zzb(Context context, String str, boolean z, boolean z2) throws Throwable {
        Cursor cursor;
        MatrixCursor matrixCursor;
        Cursor cursor2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        try {
            try {
                boolean z3 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? oea.FEATURE_API_REQUEST : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) zzh.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z4 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i = 0; i < count; i++) {
                                    if (!cursorQuery.moveToPosition(i)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr4 = new Object[columnCount];
                                    for (int i2 = 0; i2 < columnCount; i2++) {
                                        int type = cursorQuery.getType(i2);
                                        if (type == 0) {
                                            objArr4[i2] = null;
                                        } else if (type == 1) {
                                            objArr4[i2] = Long.valueOf(cursorQuery.getLong(i2));
                                        } else if (type == 2) {
                                            objArr4[i2] = Double.valueOf(cursorQuery.getDouble(i2));
                                        } else if (type == 3) {
                                            objArr4[i2] = cursorQuery.getString(i2);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr4[i2] = cursorQuery.getBlob(i2);
                                        }
                                    }
                                    matrixCursor.addRow(objArr4);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th) {
                                try {
                                    cursorQuery.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th3) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th3;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i3 = matrixCursor.getInt(0);
                            if (i3 > 0) {
                                synchronized (DynamiteModule.class) {
                                    zzc = matrixCursor.getString(2);
                                    int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                    if (columnIndex >= 0) {
                                        zze = matrixCursor.getInt(columnIndex);
                                    }
                                    int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                    if (columnIndex2 >= 0) {
                                        if (matrixCursor.getInt(columnIndex2) == 0) {
                                            z3 = false;
                                        }
                                        zzd = z3;
                                        z4 = z3;
                                    }
                                }
                                if (zze(matrixCursor)) {
                                    matrixCursor = null;
                                }
                            }
                            if (z2 && z4) {
                                throw new LoadingException("forcing fallback to container DynamiteLoader impl", objArr2 == true ? 1 : 0);
                            }
                            if (matrixCursor != null) {
                                matrixCursor.close();
                            }
                            return i3;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        if (e instanceof LoadingException) {
                            throw e;
                        }
                        throw new LoadingException("V2 version check failed: " + e.getMessage(), e, objArr == true ? 1 : 0);
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new LoadingException("Failed to connect to dynamite module ContentResolver.", objArr3 == true ? 1 : 0);
            } catch (Throwable th4) {
                th = th4;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
        } catch (Throwable th5) {
            th = th5;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    private static DynamiteModule zzc(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    private static void zzd(ClassLoader classLoader) throws LoadingException {
        zzq zzqVar;
        zzo zzoVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzqVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzqVar = iInterfaceQueryLocalInterface instanceof zzq ? (zzq) iInterfaceQueryLocalInterface : new zzq(iBinder);
            }
            zzl = zzqVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new LoadingException("Failed to instantiate dynamite loader", e2, zzoVar);
        }
    }

    private static boolean zze(Cursor cursor) {
        zzm zzmVar = (zzm) zzg.get();
        if (zzmVar == null || zzmVar.zza != null) {
            return false;
        }
        zzmVar.zza = cursor;
        return true;
    }

    private static boolean zzf(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(zzf)) {
            return true;
        }
        boolean zBooleanValue = false;
        if (zzf == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != PlatformVersion.isAtLeastQ() ? 0 : 268435456);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                zBooleanValue = true;
            }
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            zzf = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
            if (zBooleanValue && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                zzd = true;
            }
        }
        if (!zBooleanValue) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return zBooleanValue;
    }

    private static zzp zzg(Context context) {
        zzp zzpVar;
        synchronized (DynamiteModule.class) {
            zzp zzpVar2 = zzk;
            if (zzpVar2 != null) {
                return zzpVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzpVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzpVar = iInterfaceQueryLocalInterface instanceof zzp ? (zzp) iInterfaceQueryLocalInterface : new zzp(iBinder);
                }
                if (zzpVar != null) {
                    zzk = zzpVar;
                    return zzpVar;
                }
            } catch (Exception e2) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
            return null;
        }
    }

    @NonNull
    @KeepForSdk
    public Context getModuleContext() {
        return this.zzj;
    }

    @NonNull
    @KeepForSdk
    public IBinder instantiate(@NonNull String str) throws LoadingException {
        try {
            return (IBinder) this.zzj.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e2, null);
        }
    }
}
