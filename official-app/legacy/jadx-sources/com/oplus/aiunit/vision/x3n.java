package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes12.dex */
public final class x3n {
    public Context a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f18492c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f18493e;

    public x3n(Context context, String str, String str2, String str3) throws com.amap.api.col.p0003sl.ik {
        if (TextUtils.isEmpty(str3) || str3.length() > 256) {
            throw new com.amap.api.col.p0003sl.ik("无效的参数 - IllegalArgumentException");
        }
        this.a = context.getApplicationContext();
        this.f18492c = str;
        this.d = str2;
        this.b = str3;
    }

    public static byte[] c(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public final void a(String str) throws com.amap.api.col.p0003sl.ik {
        if (TextUtils.isEmpty(str) || str.length() > 65536) {
            throw new com.amap.api.col.p0003sl.ik("无效的参数 - IllegalArgumentException");
        }
        this.f18493e = str;
    }

    public final byte[] b() {
        int iCurrentTimeMillis = 0;
        byte[] byteArray = new byte[0];
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    w0n.k(byteArrayOutputStream2, this.f18492c);
                    w0n.k(byteArrayOutputStream2, this.d);
                    w0n.k(byteArrayOutputStream2, this.b);
                    w0n.k(byteArrayOutputStream2, String.valueOf(p0n.K(this.a)));
                    try {
                        iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                    } catch (Throwable unused) {
                    }
                    byteArrayOutputStream2.write(c(iCurrentTimeMillis));
                    byteArrayOutputStream2.write(d(this.f18493e));
                    byteArrayOutputStream2.write(w0n.n(this.f18493e));
                    byteArray = byteArrayOutputStream2.toByteArray();
                    byteArrayOutputStream2.close();
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    try {
                        c2n.r(th, "se", "tds");
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        return byteArray;
                    } catch (Throwable th2) {
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable th3) {
                                th3.printStackTrace();
                            }
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th5.printStackTrace();
        }
        return byteArray;
    }

    public final byte[] d(String str) {
        byte[] bArrN;
        if (!TextUtils.isEmpty(str) && (bArrN = w0n.n(this.f18493e)) != null) {
            return w0n.m(bArrN.length);
        }
        return new byte[]{0, 0};
    }
}
