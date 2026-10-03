package com.lifesense.android.bluetooth.core.protocol.frame;

import com.lifesense.android.bluetooth.core.bean.constant.PacketProfile;
import com.lifesense.android.bluetooth.core.tools.e;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class b {
    public UUID a;
    public UUID b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f8622c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PacketProfile f8623e;
    public c f;
    public int g;
    public byte[] h;

    public void a(int i) {
    }

    public synchronized String b() {
        return this.f8622c;
    }

    public c c() {
        return this.f;
    }

    public synchronized UUID d() {
        return this.b;
    }

    public int e() {
        return this.g;
    }

    public String toString() {
        return "ResponsePacket [serviceUUID=" + com.lifesense.android.bluetooth.core.tools.a.a(this.a) + ", writeCharacter=" + com.lifesense.android.bluetooth.core.tools.a.a(this.b) + ", responseData=" + this.f8622c + ", length=" + this.d + ", cmdCode=" + this.f8623e + ", responseType=" + this.f + ", writeMode=" + this.g + "]";
    }

    public void a(PacketProfile packetProfile) {
        this.f8623e = packetProfile;
    }

    public void b(int i) {
    }

    public void c(int i) {
        this.g = i;
    }

    public void a(c cVar) {
        this.f = cVar;
    }

    public synchronized void b(UUID uuid) {
        this.b = uuid;
    }

    public synchronized void a(String str) {
        this.f8622c = str;
        if (str != null) {
            this.d = str.length();
        }
        if (str != null && str.length() > 0) {
            this.h = e.a(str.toCharArray());
        }
    }

    public void a(UUID uuid) {
        this.a = uuid;
    }

    public byte[] a() {
        return this.h;
    }
}
