package com.oplus.oms.split.full.splitinstall;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.alipay.sdk.m.u.h;
import com.oplus.aiunit.vision.a8i;
import com.oplus.aiunit.vision.e3h;
import com.oplus.aiunit.vision.h7i;
import com.oplus.aiunit.vision.o4n;
import com.oplus.aiunit.vision.o7i;
import com.oplus.aiunit.vision.p1h;
import com.oplus.aiunit.vision.pd7;
import com.oplus.aiunit.vision.v5n;
import com.oplus.aiunit.vision.w7i;
import com.oplus.aiunit.vision.z6i;
import com.oplus.oms.split.full.splitdownload.IProvider;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements Closeable {
    public static final String f = "SplitDownloadPreprocessor";
    public static final int g = 3;
    public static final String h = "SplitCopier.lock";
    public final RandomAccessFile i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final FileChannel f20022j;
    public final FileLock k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final File f20023l;
    public boolean m = false;

    /* JADX INFO: renamed from: com.oplus.oms.split.full.splitinstall.a$a, reason: collision with other inner class name */
    public static final class C0974a extends File {
        public long a;

        public C0974a(File file, String str, long j2) {
            super(file, str);
            this.a = j2;
        }
    }

    public a(File file) throws IllegalStateException, IOException {
        this.f20023l = file;
        File file2 = new File(file, h);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
        this.i = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f20022j = channel;
            try {
                w7i.a(f, "Blocking on lock " + file2.getPath(), new Object[0]);
                this.k = channel.lock();
                w7i.a(f, file2.getPath() + " locked", new Object[0]);
            } catch (IOException | IllegalStateException e2) {
                pd7.a(this.f20022j);
                throw e2;
            }
        } catch (IOException | IllegalStateException e3) {
            pd7.a(this.i);
            throw e3;
        }
    }

    public static File a(Context context, String str) throws InstallException {
        ApplicationInfo applicationInfo;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        if (applicationInfo != null) {
            return new File(applicationInfo.sourceDir);
        }
        throw new InstallException(-13, new Throwable(str + " no apk"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        FileChannel fileChannel = this.f20022j;
        if (fileChannel == null || !fileChannel.isOpen()) {
            w7i.a(f, "lockChannel may has closed" + this.f20022j, new Object[0]);
        } else {
            try {
                this.f20022j.close();
            } catch (IOException unused) {
                throw new IOException("lockChannel.close error");
            }
        }
        RandomAccessFile randomAccessFile = this.i;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
                throw new IOException("lockRaf.close error");
            }
        } else {
            w7i.a(f, "lockRaf may has closed ", new Object[0]);
        }
        FileLock fileLock = this.k;
        if (fileLock != null && fileLock.isValid()) {
            try {
                this.k.release();
            } catch (IOException unused3) {
                throw new IOException("cacheLock.close error");
            }
        } else {
            w7i.a(f, "cacheLock may has closed " + this.k, new Object[0]);
        }
    }

    public final InputStream g(Context context, v5n v5nVar) throws InstallException, IOException {
        if (context == null || v5nVar == null) {
            return null;
        }
        int iE = v5nVar.e();
        String strQ = v5nVar.j().q();
        int iG = v5nVar.g();
        if (iE == 1) {
            return context.getAssets().open("oms" + File.separator + strQ + "-master.zip");
        }
        if (iE == 2) {
            return new FileInputStream(a8i.o().b(strQ, String.valueOf(iG), false));
        }
        if (iE == 3) {
            String strH = h(context, v5nVar.j());
            if (TextUtils.isEmpty(strH)) {
                throw new InstallException(-13, new IOException("get " + strQ + " component apk failed"));
            }
            File file = new File(strH);
            if (!p(context, file, false)) {
                throw new InstallException(-11, new IOException("verify signature error"));
            }
            this.m = true;
            return new FileInputStream(file);
        }
        if (iE != 4) {
            if (iE != 5) {
                return null;
            }
            return Files.newInputStream(a(context, v5nVar.j().k()).toPath(), new OpenOption[0]);
        }
        IProvider iProviderA = z6i.b().a();
        if (iProviderA == null) {
            throw new InstallException(-13, new Throwable(strQ + "get version error"));
        }
        try {
            return iProviderA.getSplitFileStream(context, strQ);
        } catch (FileNotFoundException unused) {
            throw new InstallException(-13, new Throwable(strQ + "custom file no found"));
        }
    }

    public final String h(Context context, h7i h7iVar) {
        HashMap<String, String> mapC = h7iVar.c();
        if (mapC == null) {
            return null;
        }
        String str = mapC.get("componentAction");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (String) p1h.b(context).a(str + "_COMPONENT_PATH", "");
    }

    public List<C0974a> i(Context context, v5n v5nVar, boolean z) throws IOException {
        if (!this.k.isValid()) {
            throw new IllegalStateException("FileCheckerAndCopier was closed");
        }
        ArrayList arrayList = new ArrayList();
        if (v5nVar.e() == 2) {
            C0974a c0974a = new C0974a(a8i.o().b(v5nVar.j().q(), String.valueOf(v5nVar.g()), false), a8i.o().e(v5nVar.j().q()), v5nVar.i().getSize());
            arrayList.add(c0974a);
            if (c0974a.exists() && z) {
                p(context, c0974a, true);
            }
        }
        return arrayList;
    }

    public final void l(Context context, h7i h7iVar, File file, int i) throws InstallException {
        try {
            h7i.b bVarM = h7iVar.m(context);
            if (bVarM == null) {
                w7i.e(f, "load libData is null " + h7iVar.q(), new Object[0]);
            } else {
                String strQ = h7iVar.q();
                try {
                    n(strQ, file, a8i.o().j(strQ, bVarM.b(), i, true), bVarM);
                } catch (InstallException unused) {
                    pd7.e(file);
                    throw new InstallException(-13, new IOException("Failed to extractLib " + file.getAbsolutePath()));
                }
            }
        } catch (IOException unused2) {
            w7i.i(f, "load getPrimaryLibData error", new Object[0]);
            pd7.e(file);
            throw new InstallException(-13, new IOException("Failed to getPrimaryLibData " + file.getAbsolutePath()));
        }
    }

    public final void m(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        pd7.c(file);
        if (file.exists()) {
            w7i.i(f, "Failed to delete corrupted split files", new Object[0]);
        } else {
            w7i.a(f, "delete success", new Object[0]);
        }
    }

    public final void n(String str, File file, File file2, h7i.b bVar) throws InstallException {
        try {
            o4n o4nVar = new o4n(str, file, file2);
            try {
                w7i.a(f, "Succeed to extract libs:  " + o4nVar.g(bVar, false), new Object[0]);
                o4nVar.close();
            } catch (Throwable th) {
                try {
                    o4nVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e2) {
            w7i.h(f, "Failed to load or extract lib files", e2);
            throw new InstallException(-13, e2);
        }
    }

    public final boolean o(Context context, v5n v5nVar, File file) throws InstallException {
        w7i.a(f, "copySplitFile, versionInfo = " + v5nVar.toString(), new Object[0]);
        String strQ = v5nVar.j().q();
        try {
            File fileCreateTempFile = File.createTempFile("tmp-" + strQ, ".apk", a8i.o().m(strQ, true));
            boolean z = false;
            int i = 0;
            while (!z && i < 3) {
                i++;
                try {
                    InputStream inputStreamG = g(context, v5nVar);
                    if (inputStreamG == null) {
                        throw new InstallException(-13, new IOException("get split file error"));
                    }
                    pd7.b(inputStreamG, new FileOutputStream(fileCreateTempFile));
                    if (fileCreateTempFile.renameTo(file)) {
                        z = true;
                    } else {
                        w7i.e(f, "Failed to rename " + fileCreateTempFile.getName() + " to " + file.getName(), new Object[0]);
                    }
                    StringBuilder sb = new StringBuilder("Copy built-in split ");
                    sb.append(z ? "succeeded" : h.i);
                    sb.append(" '");
                    sb.append(file.getAbsolutePath());
                    sb.append("': length ");
                    sb.append(file.length());
                    w7i.a(f, sb.toString(), new Object[0]);
                    if (!z) {
                        pd7.e(file);
                    }
                } catch (IOException unused) {
                    w7i.i(f, "split apk is not existing, attempts times : " + i, new Object[0]);
                }
            }
            pd7.e(fileCreateTempFile);
            if (!z) {
                throw new InstallException(-13, new IOException("Failed to copy built-in file"));
            }
            if (!t(context, v5nVar, file)) {
                if (this.m || p(context, file, true)) {
                    return true;
                }
                throw new InstallException(-11, new IOException("verify signature error"));
            }
            m(file.getParentFile());
            throw new InstallException(-14, new Throwable(strQ + " load fail"));
        } catch (IOException unused2) {
            throw new InstallException(-13, new IOException("Failed to create temp file " + file.getPath()));
        }
    }

    public final boolean p(Context context, File file, boolean z) {
        if (context == null || file == null || !file.exists() || !pd7.j(file)) {
            return false;
        }
        boolean zE = e3h.e(context, file);
        if (!zE) {
            w7i.i(f, "Oops! Failed to check file " + file.getName() + " signature", new Object[0]);
            if (z) {
                m(file.getParentFile());
            }
        }
        return zE;
    }

    public int s(Context context, v5n v5nVar) throws InstallException {
        if (!this.k.isValid()) {
            w7i.c(f, "cacheLock was closed, split: %s", v5nVar.j().q());
            throw new InstallException(-100, new IOException("cacheLock was closed"));
        }
        if (v5nVar == null) {
            w7i.c(f, "split version info is null", new Object[0]);
            throw new InstallException(-100, new Throwable("split version info is null"));
        }
        int iE = v5nVar.e();
        String strQ = v5nVar.j().q();
        switch (iE) {
            case -1:
                String str = strQ + "get version error";
                w7i.c(f, str, new Object[0]);
                throw new InstallException(-100, new Throwable(str));
            case 0:
                return 5;
            case 1:
            case 3:
            case 4:
            case 5:
                return v(context, v5nVar);
            case 2:
                return u(context, v5nVar);
            default:
                w7i.c(f, "unknow from", new Object[0]);
                throw new InstallException(-100, new Throwable("unknow from"));
        }
    }

    public final boolean t(Context context, v5n v5nVar, File file) {
        String strF = o7i.f(context, v5nVar.j().q(), v5nVar.g());
        return !TextUtils.isEmpty(strF) && strF.equals(pd7.h(file));
    }

    public final int u(Context context, v5n v5nVar) throws InstallException {
        File fileB = a8i.o().b(v5nVar.j().q(), String.valueOf(v5nVar.g()), false);
        if (p(context, fileB, false)) {
            return v(context, v5nVar);
        }
        m(fileB.getParentFile().getParentFile());
        throw new InstallException(-11, new Throwable("download split signature exception"));
    }

    public final int v(Context context, v5n v5nVar) throws InstallException {
        String strQ = v5nVar.j().q();
        int iG = v5nVar.g();
        int iE = v5nVar.e();
        File fileD = a8i.o().d(strQ, iG, true);
        if (!o(context, v5nVar, fileD)) {
            return 5;
        }
        l(context, v5nVar.j(), fileD, iG);
        if (iE == 2) {
            m(a8i.o().h(strQ, String.valueOf(iG), false).getParentFile());
        }
        o7i.h(context, strQ, iG);
        return 5;
    }
}
