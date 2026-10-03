package com.lifesense.plugin.ble.a.a;

import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public class t {
    private UUID a;
    private UUID b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f8677c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8678e;
    private u f;
    private int g;
    private byte[] h;

    public u a() {
        return this.f;
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.f8678e;
    }

    public synchronized UUID d() {
        return this.b;
    }

    public synchronized String e() {
        return this.f8677c;
    }

    public byte[] f() {
        return this.h;
    }

    public String toString() {
        return "IBRespPacket [serviceUUID=" + com.lifesense.plugin.ble.c.b.a(this.a) + ", writeCharacter=" + com.lifesense.plugin.ble.c.b.a(this.b) + ", responseData=" + this.f8677c + ", length=" + this.d + ", cmdCode=" + this.f8678e + ", responseType=" + this.f + ", writeMode=" + this.g + "]";
    }

    public void a(int i) {
        this.g = i;
    }

    public void b(int i) {
        this.f8678e = i;
    }

    public void a(u uVar) {
        this.f = uVar;
    }

    public synchronized void b(UUID uuid) {
        this.b = uuid;
    }

    public synchronized void a(String str) {
        this.f8677c = str;
        if (str != null) {
            this.d = str.length();
        }
        if (str != null && str.length() > 0) {
            this.h = com.lifesense.plugin.ble.c.a.a(str.toCharArray());
        }
    }

    public void a(UUID uuid) {
        this.a = uuid;
    }
}
