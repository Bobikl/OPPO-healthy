package com.autonavi.aps.amapapi.trans;

import android.content.Context;
import android.text.TextUtils;
import com.oplus.aiunit.vision.h3n;
import com.oplus.aiunit.vision.v0n;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends h3n {
    Map<String, String> h;
    String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f1156j;
    byte[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    byte[] f1157l;
    boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f1158n;
    Map<String, String> o;
    boolean p;
    private String q;

    public d(Context context, v0n v0nVar) {
        super(context, v0nVar);
        this.h = null;
        this.q = "";
        this.i = "";
        this.f1156j = "";
        this.k = null;
        this.f1157l = null;
        this.m = false;
        this.f1158n = null;
        this.o = null;
        this.p = false;
    }

    public final void a(Map<String, String> map) {
        this.o = map;
    }

    public final void b(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            if (bArr != null) {
                try {
                    byteArrayOutputStream2.write(h3n.a(bArr));
                    byteArrayOutputStream2.write(bArr);
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    try {
                        th.printStackTrace();
                        if (byteArrayOutputStream != null) {
                            try {
                                return;
                            } catch (IOException e2) {
                                return;
                            }
                        }
                        return;
                    } finally {
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                    }
                }
            }
            this.f1157l = byteArrayOutputStream2.toByteArray();
            try {
                byteArrayOutputStream2.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void c(byte[] bArr) {
        this.k = bArr;
    }

    @Override // com.oplus.aiunit.vision.h3n
    public final byte[] d() {
        return this.f1157l;
    }

    @Override // com.oplus.aiunit.vision.h3n
    public final boolean f() {
        return this.m;
    }

    @Override // com.oplus.aiunit.vision.h3n
    public final String g() {
        return this.f1158n;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getIPDNSName() {
        return this.q;
    }

    @Override // com.oplus.aiunit.vision.s0n, com.amap.api.col.p0003sl.la
    public final String getIPV6URL() {
        return this.f1156j;
    }

    @Override // com.oplus.aiunit.vision.h3n, com.amap.api.col.p0003sl.la
    public final Map<String, String> getParams() {
        return this.o;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final Map<String, String> getRequestHead() {
        return this.h;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getSDKName() {
        return "loc";
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return this.i;
    }

    @Override // com.oplus.aiunit.vision.h3n
    public final boolean h() {
        return this.p;
    }

    public final void a(String str) {
        this.f1158n = str;
    }

    public final void c(String str) {
        this.f1156j = str;
    }

    public final void d(String str) {
        if (TextUtils.isEmpty(str)) {
            this.q = "";
        } else {
            this.q = str;
        }
    }

    public final void a(boolean z) {
        this.m = z;
    }

    @Override // com.oplus.aiunit.vision.h3n
    public final byte[] c() {
        return this.k;
    }

    public final void b(String str) {
        this.i = str;
    }

    public final void b(Map<String, String> map) {
        this.h = map;
    }

    public final void b(boolean z) {
        this.p = z;
    }
}
