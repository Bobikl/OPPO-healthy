package com.lifesense.android.bluetooth.scale.frame;

import com.lifesense.android.bluetooth.core.bean.constant.PacketProfile;
import com.lifesense.android.bluetooth.core.protocol.frame.c;
import com.lifesense.android.bluetooth.core.tools.e;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    public int a = 20;
    public List<String> b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<String> f8645c = new ArrayList();
    public byte[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public UUID f8646e;
    public UUID f;
    public int g;
    public PacketProfile h;
    public c i;

    public a(byte[] bArr, UUID uuid, UUID uuid2, int i, PacketProfile packetProfile, c cVar) {
        this.d = bArr;
        this.f8646e = uuid;
        this.f = uuid2;
        this.g = i;
        this.h = packetProfile;
        this.i = cVar;
        String strC = e.c(bArr);
        int i2 = 0;
        while (i2 < bArr.length) {
            int iMin = (Math.min(this.a, bArr.length - i2) * 2) + i2;
            this.b.add(strC.substring(i2, iMin));
            i2 = iMin;
        }
    }

    public UUID a() {
        return this.f;
    }

    public PacketProfile b() {
        return this.h;
    }

    public byte[] c() {
        return this.d;
    }

    public c d() {
        return this.i;
    }

    public UUID e() {
        return this.f8646e;
    }

    public int f() {
        return this.g;
    }

    public String toString() {
        return "DataPackageA6 [content=" + this.d + ", service=" + this.f8646e + ", characteristic=" + this.f + ", writeMode=" + this.g + ", cmdCode=" + this.h + ", responseType=" + this.i + "]";
    }

    public boolean a(byte[] bArr) {
        this.f8645c.add(e.c(bArr));
        boolean z = false;
        if (this.f8645c.size() == this.b.size()) {
            ArrayList<String> arrayList = new ArrayList(this.f8645c);
            for (String str : this.b) {
                for (String str2 : arrayList) {
                    if (str.equals(str2)) {
                        arrayList.remove(str2);
                        break;
                    }
                }
            }
            if (arrayList.size() == 0) {
                z = true;
            }
        }
        if (z) {
            this.f8645c.clear();
        }
        return z;
    }
}
