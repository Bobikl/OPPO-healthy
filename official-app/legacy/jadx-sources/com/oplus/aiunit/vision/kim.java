package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* JADX INFO: loaded from: classes10.dex */
public class kim {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static SimpleDateFormat f13305j = tpm.d.a("yy.MM.dd.HH");
    public File f;
    public String a = "Tracer.File";
    public int b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13306c = Integer.MAX_VALUE;
    public int d = 4096;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13307e = 10000;
    public int g = 10;
    public String h = ".log";
    public long i = Long.MAX_VALUE;

    public kim(File file, int i, int i2, int i3, String str, long j2, int i4, String str2, long j3) {
        c(file);
        g(i);
        a(i2);
        l(i3);
        d(str);
        b(j2);
        p(i4);
        i(str2);
        h(j3);
    }

    public void a(int i) {
        this.b = i;
    }

    public void b(long j2) {
        this.f13307e = j2;
    }

    public void c(File file) {
        this.f = file;
    }

    public void d(String str) {
        this.a = str;
    }

    public File[] e() {
        return m(System.currentTimeMillis());
    }

    public File f() {
        File fileQ = q();
        if (fileQ != null) {
            fileQ.mkdirs();
        }
        return fileQ;
    }

    public void g(int i) {
        this.f13306c = i;
    }

    public void h(long j2) {
        this.i = j2;
    }

    public void i(String str) {
        this.h = str;
    }

    public String j() {
        return this.a;
    }

    public final String k(String str) {
        return "com.tencent.mobileqq_connectSdk." + str + ".log";
    }

    public void l(int i) {
        this.d = i;
    }

    public final File[] m(long j2) {
        File file;
        File fileF = f();
        String strK = k(o(j2));
        try {
            fileF = new File(fileF, strK);
        } catch (Throwable th) {
            q8g.g(q8g.TAG, "getWorkFile,get old sdcard file exception:", th);
        }
        String strU = com.tencent.open.utils.b.u();
        if (TextUtils.isEmpty(strU) && strU == null) {
            file = null;
        } else {
            try {
                File file2 = new File(strU, gmm.o);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file = new File(file2, strK);
            } catch (Exception e2) {
                q8g.g(q8g.TAG, "getWorkFile,get app specific file exception:", e2);
                file = null;
            }
        }
        return new File[]{fileF, file};
    }

    public int n() {
        return this.d;
    }

    public final String o(long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        return new SimpleDateFormat("yy.MM.dd.HH").format(calendar.getTime());
    }

    public void p(int i) {
        this.g = i;
    }

    public File q() {
        return this.f;
    }

    public int r() {
        return this.g;
    }
}
