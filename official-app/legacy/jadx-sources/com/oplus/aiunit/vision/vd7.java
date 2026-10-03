package com.oplus.aiunit.vision;

import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/vd7;", "", "Ljava/io/File;", "dir", "", "b", "", "path", "c", "", "a", "<init>", "()V", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public final class vd7 {

    @NotNull
    public static final vd7 INSTANCE = new vd7();

    @JvmStatic
    public static final long a(@NotNull File dir) {
        long length;
        Intrinsics.checkNotNullParameter(dir, "dir");
        File[] fileArrListFiles = dir.listFiles();
        long j2 = 0;
        if (fileArrListFiles != null) {
            int length2 = fileArrListFiles.length;
            int i = 0;
            while (i < length2) {
                File file = fileArrListFiles[i];
                i++;
                if (file.isDirectory()) {
                    Intrinsics.checkNotNullExpressionValue(file, "file");
                    length = a(file);
                } else {
                    length = file.length();
                }
                j2 += length;
            }
        }
        return j2;
    }

    @JvmStatic
    public static final void b(@Nullable File dir) {
        File[] fileArrListFiles;
        f7b.e("FileUtils", Intrinsics.stringPlus("delete file, path:", dir == null ? null : dir.getPath()));
        if (dir != null && dir.exists() && dir.isDirectory() && (fileArrListFiles = dir.listFiles()) != null) {
            int length = fileArrListFiles.length;
            int i = 0;
            while (i < length) {
                File file = fileArrListFiles[i];
                i++;
                if (file.isFile()) {
                    file.delete();
                } else if (file.isDirectory()) {
                    b(file);
                }
            }
        }
        if (dir == null) {
            return;
        }
        dir.delete();
    }

    @JvmStatic
    public static final void c(@Nullable String path) {
        f7b.e("FileUtils", Intrinsics.stringPlus("delete file:", path));
        if (path == null || path.length() == 0) {
            return;
        }
        b(new File(path));
    }
}
