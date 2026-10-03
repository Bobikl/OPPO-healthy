package com.lifesense.android.bluetooth.core.business.ota;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class h {
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8601c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f8602e;
    public List<a> f;
    public int g;

    public h(byte[] bArr) {
        this.a = new String(com.lifesense.android.bluetooth.core.tools.b.a(bArr, 0, 4));
        this.b = new String(com.lifesense.android.bluetooth.core.tools.b.a(bArr, 4, 4));
        this.f8601c = com.lifesense.android.bluetooth.core.tools.b.a(com.lifesense.android.bluetooth.core.tools.b.a(bArr, 8, 4));
        this.d = com.lifesense.android.bluetooth.core.tools.b.a(com.lifesense.android.bluetooth.core.tools.b.a(bArr, 12, 4));
        this.f8602e = new String(com.lifesense.android.bluetooth.core.tools.b.a(bArr, 16, 16));
        List<a> listB = b.b(bArr);
        this.f = listB;
        Iterator<a> it = listB.iterator();
        while (it.hasNext()) {
            this.g += it.next().b();
        }
    }

    public List<a> a() {
        return this.f;
    }

    public int b() {
        return this.g;
    }

    public String toString() {
        return "OtaHeader{magic='" + this.a + "', version='" + this.b + "', size=" + this.f8601c + ", createUtc=" + this.d + ", md5='" + this.f8602e + "', binInfoList=" + this.f + ", binWithCrc12Size=" + this.g + '}';
    }
}
