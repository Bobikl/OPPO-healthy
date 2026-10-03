package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Objects;
import okhttp3.Request;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class t36 {
    public static ks2 a;
    public static Long b = 0L;
    public static Long c = 0L;

    public class a implements nt2 {
        public final /* synthetic */ vid i;
        public final /* synthetic */ Activity j;
        public final /* synthetic */ String k;

        public a(vid vidVar, Activity activity, String str) {
            this.i = vidVar;
            this.j = activity;
            this.k = str;
        }

        public void onFailure(@NonNull ks2 ks2Var, @NonNull IOException iOException) {
            this.i.a(iOException);
        }

        public void onResponse(@NonNull ks2 ks2Var, @NonNull axf axfVar) throws IOException {
            t36.g(this.k, axfVar, this.i);
        }
    }

    public static void b(Activity activity) {
        ks2 ks2Var = a;
        if (ks2Var != null) {
            ks2Var.cancel();
            a = null;
        }
        c(activity);
    }

    public static void c(Context context) {
        new File(f36.a(context)).delete();
        c = 0L;
        b = 0L;
    }

    public static void d(Activity activity, String str, String str2, vid vidVar) {
        Request requestBuild = new Request.Builder().url(str).header("RANGE", "bytes=" + c + "-").build();
        e();
        ks2 ks2VarA = new yqc().b(activity, true).a(requestBuild);
        a = ks2VarA;
        ks2VarA.g(new a(vidVar, activity, str2));
    }

    public static void e() {
        if (b.longValue() == 0) {
            c = 0L;
        }
    }

    public static void f() {
        ks2 ks2Var = a;
        if (ks2Var != null) {
            ks2Var.cancel();
            a = null;
        }
    }

    public static void g(String str, axf axfVar, vid vidVar) throws IOException {
        byte[] bArr = new byte[2048];
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rw");
            try {
                exf exfVarG = axfVar.g();
                Objects.requireNonNull(exfVarG);
                InputStream inputStreamA = exfVarG.a();
                try {
                    if (b.longValue() == 0) {
                        exf exfVarG2 = axfVar.g();
                        Objects.requireNonNull(exfVarG2);
                        Long lValueOf = Long.valueOf(exfVarG2.l());
                        b = lValueOf;
                        randomAccessFile.setLength(lValueOf.longValue());
                    }
                    if (c.longValue() != 0) {
                        randomAccessFile.seek(c.longValue());
                    }
                    while (true) {
                        int i = inputStreamA.read(bArr);
                        if (i == -1) {
                            vidVar.g(new File(str));
                            inputStreamA.close();
                            randomAccessFile.close();
                            return;
                        } else {
                            randomAccessFile.write(bArr, 0, i);
                            Long lValueOf2 = Long.valueOf(c.longValue() + ((long) i));
                            c = lValueOf2;
                            vidVar.b(lValueOf2.longValue(), b);
                        }
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (inputStreamA != null) {
                        try {
                            inputStreamA.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                randomAccessFile.close();
                throw th4;
            }
        } catch (Exception e) {
            vidVar.a(e);
        }
    }
}
