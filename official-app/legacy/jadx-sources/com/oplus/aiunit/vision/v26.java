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

/* JADX INFO: loaded from: classes8.dex */
public class v26 {
    public static wr2 a;
    public static Long b = 0L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Long f17677c = 0L;

    public class a implements zs2 {
        public final /* synthetic */ dhd i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Activity f17678j;
        public final /* synthetic */ String k;

        public a(dhd dhdVar, Activity activity, String str) {
            this.i = dhdVar;
            this.f17678j = activity;
            this.k = str;
        }

        @Override // com.oplus.aiunit.vision.zs2
        public void onFailure(@NonNull wr2 wr2Var, @NonNull IOException iOException) {
            this.i.a(iOException);
        }

        @Override // com.oplus.aiunit.vision.zs2
        public void onResponse(@NonNull wr2 wr2Var, @NonNull ytf ytfVar) throws IOException {
            v26.g(this.k, ytfVar, this.i);
        }
    }

    public static void b(Activity activity) {
        wr2 wr2Var = a;
        if (wr2Var != null) {
            wr2Var.cancel();
            a = null;
        }
        c(activity);
    }

    public static void c(Context context) {
        new File(h26.a(context)).delete();
        f17677c = 0L;
        b = 0L;
    }

    public static void d(Activity activity, String str, String str2, dhd dhdVar) {
        Request requestBuild = new Request.Builder().url(str).header("RANGE", "bytes=" + f17677c + "-").build();
        e();
        wr2 wr2VarA = new gpc().b(activity, true).a(requestBuild);
        a = wr2VarA;
        wr2VarA.g(new a(dhdVar, activity, str2));
    }

    public static void e() {
        if (b.longValue() == 0) {
            f17677c = 0L;
        }
    }

    public static void f() {
        wr2 wr2Var = a;
        if (wr2Var != null) {
            wr2Var.cancel();
            a = null;
        }
    }

    public static void g(String str, ytf ytfVar, dhd dhdVar) throws IOException {
        byte[] bArr = new byte[2048];
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rw");
            try {
                cuf body = ytfVar.getBody();
                Objects.requireNonNull(body);
                InputStream inputStreamA = body.a();
                try {
                    if (b.longValue() == 0) {
                        cuf body2 = ytfVar.getBody();
                        Objects.requireNonNull(body2);
                        Long lValueOf = Long.valueOf(body2.getContentLength());
                        b = lValueOf;
                        randomAccessFile.setLength(lValueOf.longValue());
                    }
                    if (f17677c.longValue() != 0) {
                        randomAccessFile.seek(f17677c.longValue());
                    }
                    while (true) {
                        int i = inputStreamA.read(bArr);
                        if (i == -1) {
                            dhdVar.g(new File(str));
                            inputStreamA.close();
                            randomAccessFile.close();
                            return;
                        } else {
                            randomAccessFile.write(bArr, 0, i);
                            Long lValueOf2 = Long.valueOf(f17677c.longValue() + ((long) i));
                            f17677c = lValueOf2;
                            dhdVar.b(lValueOf2.longValue(), b);
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
        } catch (Exception e2) {
            dhdVar.a(e2);
        }
    }
}
