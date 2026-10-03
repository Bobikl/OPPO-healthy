package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes12.dex */
public final class t1n {
    public static final String a = w0n.t("SYmFja3Vwcw");
    public static final String b = w0n.t("SLmFkaXU");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f16850c = w0n.t("JIw");

    public static String a(Context context) {
        try {
            File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir == null) {
                externalCacheDir = context.getCacheDir();
            }
            if (externalCacheDir != null) {
                return externalCacheDir.getAbsolutePath();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static synchronized void b(Context context, String str, String str2) {
        FileChannel channel;
        RandomAccessFile randomAccessFile;
        String strA = a(context);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        String str3 = str + f16850c + str2;
        File file = new File(strA + File.separator + a);
        File file2 = new File(file, b);
        FileLock fileLockTryLock = null;
        try {
            if (!file.exists() || file.isDirectory()) {
                file.mkdirs();
            }
            file2.createNewFile();
            randomAccessFile = new RandomAccessFile(file2, "rws");
            try {
                channel = randomAccessFile.getChannel();
                try {
                    fileLockTryLock = channel.tryLock();
                    if (fileLockTryLock != null) {
                        channel.write(ByteBuffer.wrap(str3.getBytes("UTF-8")));
                    }
                    if (fileLockTryLock != null) {
                        try {
                            fileLockTryLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    try {
                        channel.close();
                    } catch (IOException unused2) {
                    }
                    c(randomAccessFile);
                } catch (Throwable unused3) {
                    if (fileLockTryLock != null) {
                        try {
                            fileLockTryLock.release();
                        } catch (IOException unused4) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused5) {
                        }
                    }
                    c(randomAccessFile);
                }
            } catch (Throwable unused6) {
                channel = null;
            }
        } catch (Throwable unused7) {
            channel = null;
            randomAccessFile = null;
        }
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }
}
