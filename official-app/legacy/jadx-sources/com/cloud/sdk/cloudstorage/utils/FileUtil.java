package com.cloud.sdk.cloudstorage.utils;

import com.heytap.log.consts.LogSenderConst;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.io.CloseableKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u001b\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u001e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0010¨\u0006\u0013"}, d2 = {"Lcom/cloud/sdk/cloudstorage/utils/FileUtil;", "", "()V", "delete", "", "parentDir", "", LogSenderConst.FILENAME, "ensureDirExist", "dir", "listRecord", "", "Ljava/io/File;", "(Ljava/lang/String;)[Ljava/io/File;", "mosaicEAPLogFileName", "read", "", "write", "data", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public final class FileUtil {

    @NotNull
    public static final FileUtil INSTANCE = new FileUtil();

    private FileUtil() {
    }

    public final void delete(@NotNull String parentDir, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(parentDir, "parentDir");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        new File(parentDir, fileName).delete();
    }

    public final void ensureDirExist(@NotNull String dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        File file = new File(dir);
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    @Nullable
    public final File[] listRecord(@NotNull String dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        File file = new File(dir);
        if (file.isDirectory()) {
            return file.listFiles();
        }
        return null;
    }

    @NotNull
    public final String mosaicEAPLogFileName(@NotNull String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (StringsKt__StringsKt.split$default((CharSequence) fileName, new String[]{"@"}, false, 0, 6, (Object) null).size() < 3) {
            return fileName;
        }
        return StringsKt__StringsKt.substringBefore$default(fileName, "@", (String) null, 2, (Object) null) + "****" + StringsKt__StringsKt.substringAfterLast$default(fileName, "@", (String) null, 2, (Object) null);
    }

    @Nullable
    public final byte[] read(@NotNull String parentDir, @NotNull String fileName) {
        byte[] bArr;
        Intrinsics.checkNotNullParameter(parentDir, "parentDir");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        File file = new File(parentDir, fileName);
        if (file.isDirectory() || !file.exists()) {
            return null;
        }
        int i = 0;
        try {
            bArr = new byte[(int) file.length()];
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    i = fileInputStream.read(bArr);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileInputStream, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(fileInputStream, th);
                        throw th2;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                e.printStackTrace();
            }
        } catch (IOException e3) {
            e = e3;
            bArr = null;
        }
        if (i == 0) {
            return null;
        }
        return bArr;
    }

    public final void write(@NotNull String parentDir, @NotNull String fileName, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(parentDir, "parentDir");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(parentDir, fileName));
            try {
                fileOutputStream.write(data);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStream, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
