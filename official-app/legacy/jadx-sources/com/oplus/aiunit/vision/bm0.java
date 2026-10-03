package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes2.dex */
public class bm0 {
    public static String g;
    public static String h;
    public final String a;
    public Handler b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f9788c;
    public volatile boolean d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f9789e;
    public Context f;

    static {
        StringBuilder sb = new StringBuilder();
        String str = File.separator;
        sb.append(str);
        sb.append("vad");
        sb.append(str);
        g = sb.toString();
    }

    public bm0(String str, Context context) {
        this.a = str;
        this.f = context;
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(byte[] bArr) {
        qb7.f(this.f9788c, bArr, true, true);
    }

    public final void b() {
        String str = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(Long.valueOf(System.currentTimeMillis()));
        Log.d("RecorderWriter", "currentTime" + str);
        String str2 = h;
        if (!new File(str2 + g).exists()) {
            new File(str2 + g).mkdir();
        }
        if (TextUtils.isEmpty(this.f9789e)) {
            this.f9788c = str2 + g + this.a + File.separator + str + ".pcm";
            return;
        }
        this.f9788c = str2 + g + this.f9789e + "_" + str + ".pcm";
    }

    public final void c() {
        File externalFilesDir = this.f.getExternalFilesDir("");
        if (externalFilesDir != null) {
            h = externalFilesDir.getAbsolutePath();
        } else {
            h = this.f.getFilesDir().getAbsolutePath();
        }
        HandlerThread handlerThread = new HandlerThread(this.a, 10);
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper());
    }

    public final void d(byte[] bArr) {
        Log.d("RecorderWriter", "innerRecord");
        if (this.d) {
            l(bArr);
        }
    }

    public final synchronized void e() {
        Log.d("RecorderWriter", "innerStartRecord");
        this.d = true;
        b();
    }

    public final synchronized void f() {
        Log.d("RecorderWriter", "innerStopRecord");
        if (this.d) {
            this.d = false;
        }
    }

    public void h(byte[] bArr) {
        d(bArr);
    }

    public void i() {
        e();
    }

    public void j(String str) {
        this.f9789e = str;
        i();
    }

    public void k() {
        f();
    }

    public final void l(byte[] bArr) {
        try {
            final byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.b.post(new Runnable() { // from class: com.oplus.aiunit.vision.am0
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.g(bArr2);
                }
            });
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
