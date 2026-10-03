package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.oms.split.full.splitrequest.OMSRunTimeException;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class a8i {
    public static final String DEFAULT = "default";
    public static final String DOWNLOAD = "download";
    public static final String UPDATE = "update";
    public static final AtomicReference<a8i> b = new AtomicReference<>();
    public final File a;

    public a8i(File file, String str) {
        this.a = new File(file, str);
    }

    public static a8i a(Context context) {
        return new a8i(context.getDir("oms", 0), b7i.d());
    }

    public static void n(Context context) {
        fue.a(b, null, a(context));
    }

    public static a8i o() {
        AtomicReference<a8i> atomicReference = b;
        if (atomicReference.get() != null) {
            return atomicReference.get();
        }
        throw new OMSRunTimeException("SplitPathManager must be initialized firstly!");
    }

    public File b(String str, String str2, boolean z) {
        return new File(h(str, str2, z), e(str));
    }

    public File c(String str, int i, boolean z) {
        File file = new File(g(str, z), String.valueOf(i));
        if (z && !file.exists() && !file.mkdirs()) {
            w7i.i("SplitPathManager", "getSplitAPkDir error", new Object[0]);
        }
        return file;
    }

    public File d(String str, int i, boolean z) {
        return new File(c(str, i, z), e(str));
    }

    public String e(String str) {
        return str + "-master.apk";
    }

    public File f(String str) {
        return g(str, false);
    }

    public File g(String str, boolean z) {
        File file = new File(this.a, str);
        if (z && !file.exists() && !file.mkdirs()) {
            w7i.i("SplitPathManager", "getSplitDir error", new Object[0]);
        }
        return file;
    }

    public File h(String str, String str2, boolean z) {
        File file = new File(l(str, z), str2);
        if (z && !file.exists() && !file.mkdirs()) {
            w7i.i("SplitPathManager", "getSplitDirDownload error", new Object[0]);
        }
        return file;
    }

    public File i(String str, String str2, int i) {
        return j(str, str2, i, false);
    }

    public File j(String str, String str2, int i, boolean z) {
        File file = new File(c(str, i, z), "nativeLib" + File.separator + str2);
        if (z && !file.exists() && !file.mkdirs()) {
            w7i.i("SplitPathManager", "getSplitLibDir error", new Object[0]);
        }
        return file;
    }

    public File k(boolean z) {
        File file = new File(this.a, "");
        w7i.i("SplitPathManager", "getSplitRootDir rootDir = " + file.getAbsolutePath(), new Object[0]);
        if (z && !file.exists() && !file.mkdirs()) {
            w7i.i("SplitPathManager", "getSplitRootDir error", new Object[0]);
        }
        return file;
    }

    public File l(String str, boolean z) {
        File file = new File(f(str), DOWNLOAD);
        if (z && !file.exists() && !file.mkdirs()) {
            w7i.i("SplitPathManager", "getSplitRootDirDownload error", new Object[0]);
        }
        return file;
    }

    public File m(String str, boolean z) {
        File file = new File(this.a, "tmp_" + str);
        if (!z) {
            return file;
        }
        if (file.exists()) {
            pd7.d(file, false);
        } else {
            file.mkdirs();
        }
        return file;
    }
}
