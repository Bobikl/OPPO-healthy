package com.xingin.xhssharesdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.core.content.FileProvider;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.cdm;
import com.oplus.aiunit.vision.dqm;
import com.oplus.aiunit.vision.rmm;
import com.oplus.aiunit.vision.vim;
import com.oplus.aiunit.vision.wim;
import com.xingin.xhssharesdk.core.XhsShareSdk;
import com.xingin.xhssharesdk.l.a;
import com.xingin.xhssharesdk.model.other.VersionCheckResult;
import com.xingin.xhssharesdk.model.sharedata.XhsNote;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
@Keep
public class XhsShareSdkTools {
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final String TAG = "XhsShare_XhsShareSdkTools";
    private static String guid;

    public static String byteToString(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        int length = bArr.length;
        char[] cArr = new char[length * 2];
        for (int i = 0; i < length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = HEX_DIGITS;
            cArr[i2] = cArr2[(b >>> 4) & 15];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static int compare(String str, String str2) {
        int i;
        int i2;
        String strTrim = str.trim();
        String[] strArrSplit = strTrim.contains(".") ? strTrim.split("\\.") : new String[]{strTrim};
        String strTrim2 = str2.trim();
        String[] strArrSplit2 = strTrim2.contains(".") ? strTrim2.split("\\.") : new String[]{strTrim2};
        int i3 = 0;
        while (true) {
            if (strArrSplit.length <= i3 && strArrSplit2.length <= i3) {
                return 0;
            }
            if (strArrSplit.length > i3) {
                try {
                    i = Integer.parseInt(strArrSplit[i3]);
                } catch (Exception e2) {
                    XhsShareSdk.d(TAG, "Compare version error! version1 is " + str + "version2 is " + str2, e2);
                    i = 0;
                }
            } else {
                i = 0;
            }
            if (strArrSplit2.length > i3) {
                try {
                    i2 = Integer.parseInt(strArrSplit2[i3]);
                } catch (Exception e3) {
                    XhsShareSdk.d(TAG, "Compare version error! version1 is " + str + "version2 is " + str2, e3);
                    i2 = 0;
                }
            } else {
                i2 = 0;
            }
            if (i != i2) {
                return i > i2 ? 1 : -1;
            }
            i3++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[PHI: r0
  0x0048: PHI (r0v3 ??) = (r0v2 ??), (r0v4 ??) binds: [B:9:0x0018, B:16:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.oplus.aiunit.vision.vim] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.oplus.aiunit.vision.dqm] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.oplus.aiunit.vision.cdm] */
    @Nullable
    public static Uri convertAvailableUri(@NonNull Context context, @NonNull String str, @NonNull File file) {
        boolean z;
        if (rmm.a == null) {
            ?? vimVar = new vim();
            boolean z2 = true;
            try {
                int i = FileProvider.i;
                z = true;
            } catch (ClassNotFoundException e2) {
                XhsShareSdk.d("XhsShare_AndroidXFileProvider", "androidx.core.content.FileProvider find error.", e2);
                z = false;
            }
            if (z) {
                rmm.a = vimVar;
            } else {
                vimVar = new cdm();
                try {
                    int i2 = android.support.v4.content.FileProvider.f170j;
                    vimVar.a = android.support.v4.content.FileProvider.class.getMethod("getUriForFile", Context.class, String.class, File.class);
                } catch (ClassNotFoundException | NoSuchMethodException e3) {
                    XhsShareSdk.d("XhsShare_AndroidSupportFileProvider", "android.support.v4.content.FileProvider find error.", e3);
                    z2 = false;
                }
                if (z2) {
                    rmm.a = vimVar;
                }
            }
        }
        dqm dqmVar = rmm.a;
        Uri uriA = dqmVar == null ? null : dqmVar.a(context, str, file);
        grantUriPermission(context, uriA);
        return uriA;
    }

    @WorkerThread
    public static void copyFile(Context context, Uri uri, File file) throws IOException, a {
        if (!isUriExist(context, uri)) {
            throw new a(1, "Src uri not exist! uri is " + uri);
        }
        try {
            ensureFileAvailable(file);
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    if (inputStreamOpenInputStream == null) {
                        throw new a(3, "The inputStream from src is null!!!");
                    }
                    byte[] bArr = new byte[1000];
                    while (inputStreamOpenInputStream.read(bArr, 0, 1000) >= 0) {
                        fileOutputStream.write(bArr, 0, 1000);
                        if (Thread.currentThread().isInterrupted()) {
                            throw new InterruptedException("[copyFile] The thread be Interrupted!!");
                        }
                    }
                    fileOutputStream.close();
                    inputStreamOpenInputStream.close();
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (a e2) {
            throw new a(e2.a, "In function [createNewFile]: " + e2.getMessage());
        }
    }

    public static File createTempFile(String str) {
        return new File(str, "temp_" + System.currentTimeMillis());
    }

    public static void deleteFile(File file, boolean z) {
        if (file == null || Thread.currentThread().isInterrupted()) {
            return;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                deleteFile(file2, true);
            }
            if (!z) {
                return;
            }
        } else if (!file.exists()) {
            return;
        }
        file.delete();
    }

    public static boolean ensureFileAvailable(File file) throws a {
        if (file == null) {
            throw new a(2, "The file can not be null!");
        }
        if (file.exists()) {
            return true;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            throw new a(2, "The file's parent dir can not be null!");
        }
        if (parentFile.exists() || parentFile.mkdirs()) {
            return file.createNewFile();
        }
        throw new a(2, "The file's parent dir mkdirs failed!");
    }

    public static String generateSessionId(@NonNull XhsNote xhsNote) {
        return Base64.encodeToString((xhsNote.hashCode() + "_" + System.currentTimeMillis()).getBytes(StandardCharsets.UTF_8), 2);
    }

    @NonNull
    public static String getAppVersionName(@Nullable Context context, String str) {
        PackageInfo packageInfo = getPackageInfo(context, str);
        return packageInfo == null ? "" : packageInfo.versionName;
    }

    @NonNull
    public static String getCurrentAppPackageName(@Nullable Context context) {
        return context == null ? "" : context.getPackageName();
    }

    public static int getCurrentAppVersionCode(@Nullable Context context) {
        PackageInfo packageInfo = getPackageInfo(context, getCurrentAppPackageName(context));
        if (packageInfo == null) {
            return -1;
        }
        return packageInfo.versionCode;
    }

    public static String getCurrentAppVersionName(@Nullable Context context) {
        return getAppVersionName(context, getCurrentAppPackageName(context));
    }

    public static String getDefaultCacheDirPath(@NonNull Context context) {
        return new File(context.getExternalCacheDir(), "xhs_share_cache_dir").getAbsolutePath();
    }

    public static String getDid(@Nullable Context context) {
        if (context == null) {
            return "";
        }
        if (!TextUtils.isEmpty(guid)) {
            return guid;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("XHS_SHARE_SDK_SP", 0);
        String string = sharedPreferences.getString("XHS_SHARE_SDK_SP_KEY_GUID", "");
        guid = string;
        if (TextUtils.isEmpty(string)) {
            guid = UUID.randomUUID().toString();
            sharedPreferences.edit().putString("XHS_SHARE_SDK_SP_KEY_GUID", guid).apply();
        }
        return guid;
    }

    public static Pair<Integer, Integer> getErrorCodeFromXhsShareResult(wim wimVar) {
        int i;
        int i2;
        int i3 = wimVar.b;
        if (i3 == 2) {
            i = XhsShareConstants$XhsShareNoteErrorCode.INTERRUPTED_BY_NEW_SHARE;
            i2 = XhsShareConstants$XhsShareNoteNewErrorCode.INTERRUPTED_BY_NEW_SHARE_IN_XHS;
        } else if (i3 == 3) {
            i = XhsShareConstants$XhsShareNoteErrorCode.SHARE_TYPE_ERROR;
            i2 = XhsShareConstants$XhsShareNoteNewErrorCode.SHARE_TYPE_ERROR_IN_XHS;
        } else if (i3 == 4) {
            i = XhsShareConstants$XhsShareNoteErrorCode.CAN_NOT_POST;
            i2 = XhsShareConstants$XhsShareNoteNewErrorCode.CAN_NOT_POST_IN_XHS;
        } else if (i3 != 5) {
            i = XhsShareConstants$XhsShareNoteErrorCode.UNKNOWN;
            i2 = i3 != 6 ? XhsShareConstants$XhsShareNoteNewErrorCode.UNKNOWN : XhsShareConstants$XhsShareNoteNewErrorCode.DATA_PARSE_ERROR;
        } else {
            i = XhsShareConstants$XhsShareNoteErrorCode.POST_CANCEL;
            i2 = XhsShareConstants$XhsShareNoteNewErrorCode.POST_CANCEL_IN_XHS;
        }
        return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i));
    }

    public static long getFileLength(@NonNull Context context, @NonNull Uri uri) {
        if (TextUtils.equals(uri.getScheme(), Const.Scheme.SCHEME_FILE)) {
            return new File(uri.getPath()).length();
        }
        long j2 = -1;
        if (TextUtils.equals(uri.getScheme(), "content")) {
            Cursor cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        j2 = cursorQuery.getLong(cursorQuery.getColumnIndex("_size"));
                    }
                } catch (Throwable th) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return j2;
    }

    @Nullable
    private static PackageInfo getPackageInfo(@Nullable Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return context.getApplicationContext().getPackageManager().getPackageInfo(str, 0);
    }

    public static String getSdkVersion() {
        return "1.1.6";
    }

    public static String getXhsPackageName() {
        return "com.xingin.xhs";
    }

    public static void grantUriPermission(@NonNull Context context, @Nullable Uri uri) {
        if (uri == null) {
            return;
        }
        context.grantUriPermission(getXhsPackageName(), uri, 1);
    }

    public static boolean isNetworkUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }

    @NonNull
    public static VersionCheckResult isSupportShareNote(Context context) {
        try {
            String appVersionName = getAppVersionName(context, getXhsPackageName());
            if (!TextUtils.isEmpty(XhsSdkInject.getShareNoteMinXhsVersionName()) && compare(appVersionName, XhsSdkInject.getShareNoteMinXhsVersionName()) < 0) {
                return new VersionCheckResult(-2, "Xhs version is " + appVersionName + ", low than " + XhsSdkInject.getShareNoteMinXhsVersionName() + "!", null);
            }
            if (TextUtils.isEmpty(XhsSdkInject.getShareNoteMaxXhsVersionName()) || compare(appVersionName, XhsSdkInject.getShareNoteMaxXhsVersionName()) <= 0) {
                return new VersionCheckResult(0, "", null);
            }
            return new VersionCheckResult(-2, "Xhs version is " + appVersionName + ", large than " + XhsSdkInject.getShareNoteMaxXhsVersionName() + "!", null);
        } catch (PackageManager.NameNotFoundException e2) {
            XhsShareSdk.d(TAG, "Get Xhs PackageInfo error!", e2);
            return new VersionCheckResult(-1, "Xhs not install!", e2);
        }
    }

    public static boolean isUriExist(Context context, @Nullable Uri uri) {
        boolean z = false;
        if (uri == null) {
            return false;
        }
        if (TextUtils.equals(uri.getScheme(), Const.Scheme.SCHEME_FILE)) {
            return new File(uri.getPath()).exists();
        }
        Cursor cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst()) {
                    z = true;
                }
            } catch (Throwable th) {
                try {
                    cursorQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return z;
    }

    public static boolean isXhsInstalled(Context context) {
        try {
            getAppVersionName(context, getXhsPackageName());
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            XhsShareSdk.d(TAG, "Get Xhs PackageInfo error!", e2);
            return false;
        }
    }

    public static String md5(String str) {
        return md5(str.getBytes(StandardCharsets.UTF_8));
    }

    @WorkerThread
    public static boolean saveBitmapToFile(Bitmap bitmap, File file) throws IOException, a {
        if (bitmap == null || bitmap.isRecycled()) {
            throw new a(-1, "Bitmap is null or has be recycled!");
        }
        if (file == null || !file.exists() || !file.isFile() || !file.canWrite()) {
            throw new a(-1, "The dstFile is unavailable!");
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        try {
            boolean zCompress = bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bufferedOutputStream);
            bufferedOutputStream.close();
            return zCompress;
        } catch (Throwable th) {
            try {
                bufferedOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String md5(byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(bArr);
        return byteToString(messageDigest.digest()).toLowerCase();
    }
}
