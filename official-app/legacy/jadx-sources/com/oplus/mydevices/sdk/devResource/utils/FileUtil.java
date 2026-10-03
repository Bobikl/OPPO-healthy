package com.oplus.mydevices.sdk.devResource.utils;

import android.annotation.SuppressLint;
import com.heytap.webview.extension.protocol.Const;
import com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey;
import com.oplus.aiunit.vision.ld7;
import com.oplus.mydevices.sdk.utils.LogUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.io.CloseableKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J(\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/oplus/mydevices/sdk/devResource/utils/FileUtil;", "", "()V", "ALGORITHM", "", "INT_1", "", "INT_15", "INT_2048", "INT_240", "INT_4", "SIZE", "TAG", "encodeHex", "data", "", "getMd5", Const.Scheme.SCHEME_FILE, "Ljava/io/File;", "str", "saveFile", "", "input", "Ljava/io/InputStream;", "filepath", BreakpointSQLiteKey.FILENAME, "md5", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final class FileUtil {
    public static final FileUtil INSTANCE = new FileUtil();
    private static final String TAG = ld7.TAG;
    private static final int SIZE = 262144;
    private static String ALGORITHM = "MD5";
    private static int INT_1 = 1;
    private static int INT_4 = 4;
    private static int INT_15 = 15;
    private static int INT_240 = 240;
    private static int INT_2048 = 2048;

    private FileUtil() {
    }

    private final String encodeHex(byte[] data) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[data.length << INT_1];
        int i = 0;
        for (byte b : data) {
            int i2 = i + 1;
            cArr2[i] = cArr[(INT_240 & b) >>> INT_4];
            i = i2 + 1;
            cArr2[i2] = cArr[INT_15 & b];
        }
        return new String(cArr2);
    }

    private final String getMd5(File file) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(ALGORITHM);
        Intrinsics.checkNotNullExpressionValue(messageDigest, "MessageDigest.getInstance(ALGORITHM)");
        DigestInputStream digestInputStream = new DigestInputStream(new FileInputStream(file), messageDigest);
        try {
            byte[] bArr = new byte[SIZE];
            while (digestInputStream.read(bArr) > 0) {
                messageDigest = digestInputStream.getMessageDigest();
                Intrinsics.checkNotNullExpressionValue(messageDigest, "digestInputStream.messageDigest");
            }
            byte[] bArrDigest = messageDigest.digest();
            Intrinsics.checkNotNullExpressionValue(bArrDigest, "messageDigest.digest()");
            String strEncodeHex = INSTANCE.encodeHex(bArrDigest);
            CloseableKt.closeFinally(digestInputStream, null);
            return strEncodeHex;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(digestInputStream, th);
                throw th2;
            }
        }
    }

    public final boolean saveFile(@NotNull InputStream input, @NotNull String filepath, @NotNull String filename, @Nullable String md5) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(filepath, "filepath");
        Intrinsics.checkNotNullParameter(filename, "filename");
        byte[] bArr = new byte[INT_2048];
        File file = new File(filepath, filename);
        if (file.exists()) {
            file.delete();
        }
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            while (true) {
                try {
                    int i = input.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, i);
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    LogUtils.INSTANCE.e(TAG, "saveFile " + e);
                    try {
                        input.close();
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e3) {
                                LogUtils.INSTANCE.e(TAG, "saveFile " + e3);
                                return false;
                            }
                        }
                        if (Intrinsics.areEqual(getMd5(file), md5)) {
                            return true;
                        }
                        file.delete();
                        return false;
                    } catch (IOException e4) {
                        LogUtils.INSTANCE.e(TAG, "saveFile " + e4);
                        return false;
                    }
                } catch (Throwable unused) {
                    fileOutputStream = fileOutputStream2;
                    try {
                        input.close();
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e5) {
                                LogUtils.INSTANCE.e(TAG, "saveFile " + e5);
                                return false;
                            }
                        }
                        if (Intrinsics.areEqual(getMd5(file), md5)) {
                            return true;
                        }
                        file.delete();
                        return false;
                    } catch (IOException e6) {
                        LogUtils.INSTANCE.e(TAG, "saveFile " + e6);
                        return false;
                    }
                }
            }
            fileOutputStream2.flush();
            try {
                input.close();
                try {
                    fileOutputStream2.close();
                    if (Intrinsics.areEqual(getMd5(file), md5)) {
                        return true;
                    }
                    file.delete();
                    return false;
                } catch (IOException e7) {
                    LogUtils.INSTANCE.e(TAG, "saveFile " + e7);
                    return false;
                }
            } catch (IOException e8) {
                LogUtils.INSTANCE.e(TAG, "saveFile " + e8);
                return false;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    @SuppressLint({"UnsafeHashAlgorithmDetector"})
    @Nullable
    public final String getMd5(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("md5");
            if (messageDigest == null) {
                return null;
            }
            FileUtil fileUtil = INSTANCE;
            Charset charsetForName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "Charset.forName(\"UTF-8\")");
            byte[] bytes = str.getBytes(charsetForName);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            byte[] bArrDigest = messageDigest.digest(bytes);
            Intrinsics.checkNotNullExpressionValue(bArrDigest, "md5.digest(str.toByteArr…harset.forName(\"UTF-8\")))");
            return fileUtil.encodeHex(bArrDigest);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
