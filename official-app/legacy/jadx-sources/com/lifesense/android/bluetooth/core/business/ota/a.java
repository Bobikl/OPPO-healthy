package com.lifesense.android.bluetooth.core.business.ota;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    public b a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8594c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8595e;
    public String f;
    public List<byte[]> g;
    public int h;

    public int a() {
        return this.d;
    }

    public int b() {
        return this.h;
    }

    public int c() {
        return this.f8595e;
    }

    public List<byte[]> d() {
        return this.g;
    }

    public int e() {
        return this.f8594c;
    }

    public b f() {
        return this.a;
    }

    public String g() {
        return this.b;
    }

    public String toString() {
        return "BinInfo{type=" + this.a + ", version='" + this.b + "', size=" + this.f8594c + ", address=" + this.d + ", crc16=" + this.f8595e + ", md5='" + this.f + "', packetList=" + this.g + ", binWithCrc16Size=" + this.h + '}';
    }

    public void a(int i) {
        this.d = i;
    }

    public void b(int i) {
        this.h = i;
    }

    public void c(int i) {
        this.f8595e = i;
    }

    public void d(int i) {
        this.f8594c = i;
    }

    public void a(b bVar) {
        this.a = bVar;
    }

    public void b(String str) {
        this.b = str;
    }

    public void a(String str) {
        this.f = str;
    }

    public void a(List<byte[]> list) {
        this.g = list;
    }
}
