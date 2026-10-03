package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.concurrent.futures.ResolvableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class ProfileVerifier {
    private static final String CUR_PROFILES_BASE_DIR = "/data/misc/profiles/cur/0/";
    private static final String PROFILE_FILE_NAME = "primary.prof";
    private static final String PROFILE_INSTALLED_CACHE_FILE_NAME = "profileInstalled";
    private static final String REF_PROFILES_BASE_DIR = "/data/misc/profiles/ref/";
    private static final String TAG = "ProfileVerifier";
    private static final ResolvableFuture<CompilationStatus> sFuture = ResolvableFuture.create();
    private static final Object SYNC_OBJ = new Object();

    @Nullable
    private static CompilationStatus sCompilationStatus = null;

    @RequiresApi(33)
    public static class Api33Impl {
        private Api33Impl() {
        }

        @DoNotInline
        public static PackageInfo getPackageInfo(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class Cache {
        private static final int SCHEMA = 1;
        final long mInstalledCurrentProfileSize;
        final long mPackageLastUpdateTime;
        final int mResultCode;
        final int mSchema;

        public Cache(int i, int i2, long j2, long j3) {
            this.mSchema = i;
            this.mResultCode = i2;
            this.mPackageLastUpdateTime = j2;
            this.mInstalledCurrentProfileSize = j3;
        }

        public static Cache readFromFile(@NonNull File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                Cache cache = new Cache(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return cache;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof Cache)) {
                return false;
            }
            Cache cache = (Cache) obj;
            return this.mResultCode == cache.mResultCode && this.mPackageLastUpdateTime == cache.mPackageLastUpdateTime && this.mSchema == cache.mSchema && this.mInstalledCurrentProfileSize == cache.mInstalledCurrentProfileSize;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.mResultCode), Long.valueOf(this.mPackageLastUpdateTime), Integer.valueOf(this.mSchema), Long.valueOf(this.mInstalledCurrentProfileSize));
        }

        public void writeOnFile(@NonNull File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.mSchema);
                dataOutputStream.writeInt(this.mResultCode);
                dataOutputStream.writeLong(this.mPackageLastUpdateTime);
                dataOutputStream.writeLong(this.mInstalledCurrentProfileSize);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static class CompilationStatus {
        public static final int RESULT_CODE_COMPILED_WITH_PROFILE = 1;
        public static final int RESULT_CODE_COMPILED_WITH_PROFILE_NON_MATCHING = 3;
        public static final int RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ = 131072;
        public static final int RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE = 196608;
        private static final int RESULT_CODE_ERROR_CODE_BIT_SHIFT = 16;
        public static final int RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST = 65536;
        public static final int RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION = 262144;
        public static final int RESULT_CODE_NO_PROFILE = 0;
        public static final int RESULT_CODE_PROFILE_ENQUEUED_FOR_COMPILATION = 2;
        private final boolean mHasCurrentProfile;
        private final boolean mHasReferenceProfile;
        final int mResultCode;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public @interface ResultCode {
        }

        public CompilationStatus(int i, boolean z, boolean z2) {
            this.mResultCode = i;
            this.mHasCurrentProfile = z2;
            this.mHasReferenceProfile = z;
        }

        public int getProfileInstallResultCode() {
            return this.mResultCode;
        }

        public boolean hasProfileEnqueuedForCompilation() {
            return this.mHasCurrentProfile;
        }

        public boolean isCompiledWithProfile() {
            return this.mHasReferenceProfile;
        }
    }

    private ProfileVerifier() {
    }

    @NonNull
    public static ListenableFuture<CompilationStatus> getCompilationStatusAsync() {
        return sFuture;
    }

    private static long getPackageLastUpdateTime(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? Api33Impl.getPackageInfo(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private static CompilationStatus setCompilationStatus(int i, boolean z, boolean z2) {
        CompilationStatus compilationStatus = new CompilationStatus(i, z, z2);
        sCompilationStatus = compilationStatus;
        sFuture.set(compilationStatus);
        return sCompilationStatus;
    }

    @NonNull
    @WorkerThread
    public static CompilationStatus writeProfileVerification(@NonNull Context context) {
        return writeProfileVerification(context, false);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0019 A[Catch: all -> 0x00de, TryCatch #3 {, blocks: (B:9:0x000c, B:11:0x0010, B:13:0x0012, B:15:0x0019, B:16:0x001f, B:18:0x0021, B:24:0x0047, B:30:0x006a, B:31:0x006e, B:33:0x007f, B:42:0x0090, B:44:0x0096, B:57:0x00ad, B:60:0x00b3, B:63:0x00ba, B:65:0x00c4, B:70:0x00d0, B:71:0x00d4, B:67:0x00ca, B:36:0x0086, B:37:0x008a, B:73:0x00d6, B:74:0x00dc), top: B:85:0x000c, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0021 A[Catch: all -> 0x00de, TryCatch #3 {, blocks: (B:9:0x000c, B:11:0x0010, B:13:0x0012, B:15:0x0019, B:16:0x001f, B:18:0x0021, B:24:0x0047, B:30:0x006a, B:31:0x006e, B:33:0x007f, B:42:0x0090, B:44:0x0096, B:57:0x00ad, B:60:0x00b3, B:63:0x00ba, B:65:0x00c4, B:70:0x00d0, B:71:0x00d4, B:67:0x00ca, B:36:0x0086, B:37:0x008a, B:73:0x00d6, B:74:0x00dc), top: B:85:0x000c, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x009f  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:81:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @WorkerThread
    public static CompilationStatus writeProfileVerification(@NonNull Context context, boolean z) {
        int i;
        File file;
        boolean z2;
        File file2;
        long length;
        boolean z3;
        File file3;
        Cache fromFile;
        Cache cache;
        int i2;
        CompilationStatus compilationStatus;
        if (!z && (compilationStatus = sCompilationStatus) != null) {
            return compilationStatus;
        }
        synchronized (SYNC_OBJ) {
            if (z) {
                i = 0;
                if (Build.VERSION.SDK_INT == 30) {
                    return setCompilationStatus(262144, false, false);
                }
                file = new File(new File(REF_PROFILES_BASE_DIR, context.getPackageName()), PROFILE_FILE_NAME);
                long length2 = file.length();
                if (file.exists()) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                file2 = new File(new File(CUR_PROFILES_BASE_DIR, context.getPackageName()), PROFILE_FILE_NAME);
                length = file2.length();
                if (file2.exists()) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                long packageLastUpdateTime = getPackageLastUpdateTime(context);
                file3 = new File(context.getFilesDir(), PROFILE_INSTALLED_CACHE_FILE_NAME);
                if (file3.exists()) {
                    fromFile = Cache.readFromFile(file3);
                } else {
                    fromFile = null;
                }
                if (fromFile == null) {
                    if (z2) {
                        i = 1;
                    } else if (z3) {
                        i = 2;
                    }
                } else if (z2) {
                    i = 1;
                } else if (z3) {
                    i = 2;
                }
                if (z) {
                    i = 2;
                }
                if (fromFile != null) {
                    i = 3;
                }
                cache = new Cache(1, i, packageLastUpdateTime, length);
                if (fromFile != null) {
                    cache.writeOnFile(file3);
                } else {
                    cache.writeOnFile(file3);
                }
                return setCompilationStatus(i, z2, z3);
            }
            CompilationStatus compilationStatus2 = sCompilationStatus;
            if (compilationStatus2 != null) {
                return compilationStatus2;
            }
            i = 0;
            if (Build.VERSION.SDK_INT == 30) {
                return setCompilationStatus(262144, false, false);
            }
            file = new File(new File(REF_PROFILES_BASE_DIR, context.getPackageName()), PROFILE_FILE_NAME);
            long length3 = file.length();
            if (file.exists() || length3 <= 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            file2 = new File(new File(CUR_PROFILES_BASE_DIR, context.getPackageName()), PROFILE_FILE_NAME);
            length = file2.length();
            if (file2.exists() || length <= 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            try {
                long packageLastUpdateTime2 = getPackageLastUpdateTime(context);
                file3 = new File(context.getFilesDir(), PROFILE_INSTALLED_CACHE_FILE_NAME);
                if (file3.exists()) {
                    try {
                        fromFile = Cache.readFromFile(file3);
                    } catch (IOException unused) {
                        return setCompilationStatus(131072, z2, z3);
                    }
                } else {
                    fromFile = null;
                }
                if (fromFile == null && fromFile.mPackageLastUpdateTime == packageLastUpdateTime2 && (i2 = fromFile.mResultCode) != 2) {
                    i = i2;
                } else if (z2) {
                    i = 1;
                } else if (z3) {
                    i = 2;
                }
                if (z && z3 && i != 1) {
                    i = 2;
                }
                if (fromFile != null && fromFile.mResultCode == 2 && i == 1 && length3 < fromFile.mInstalledCurrentProfileSize) {
                    i = 3;
                }
                cache = new Cache(1, i, packageLastUpdateTime2, length);
                if (fromFile != null || !fromFile.equals(cache)) {
                    try {
                        cache.writeOnFile(file3);
                    } catch (IOException unused2) {
                        i = CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    }
                }
                return setCompilationStatus(i, z2, z3);
            } catch (PackageManager.NameNotFoundException unused3) {
                return setCompilationStatus(65536, z2, z3);
            }
            throw th;
        }
    }
}
