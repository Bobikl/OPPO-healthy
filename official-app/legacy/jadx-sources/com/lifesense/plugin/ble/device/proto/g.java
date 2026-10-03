package com.lifesense.plugin.ble.device.proto;

/* JADX INFO: loaded from: classes5.dex */
public class g {
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8762c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8763e;
    private String f;
    private String g;
    private String h;
    private boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f8764j;
    private int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte[] f8765l;

    public String a() {
        return this.h;
    }

    public String b() {
        return this.b;
    }

    public int c() {
        return this.f8762c;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.f8763e;
    }

    public String f() {
        return this.f;
    }

    public String g() {
        return this.g;
    }

    public boolean h() {
        return this.i;
    }

    public int i() {
        return this.f8764j;
    }

    public String j() {
        return this.a;
    }

    public byte[] k() {
        return this.f8765l;
    }

    public String toString() {
        return "IProtoPacket{commandVersion='" + this.a + "', packetSerialNumber='" + this.b + "', totalPacketLength=" + this.f8762c + ", frameSerialNumber=" + this.d + ", frameLength=" + this.f8763e + ", data='" + this.f + "', crc32Value='" + this.g + "', packetCommand='" + this.h + "', isVerified=" + this.i + ", frameCount=" + this.f8764j + ", dataType=" + this.k + ", contentData=" + com.lifesense.plugin.ble.c.a.d(this.f8765l) + '}';
    }

    public void a(int i) {
        this.f8762c = i;
    }

    public void b(int i) {
        this.d = i;
    }

    public void c(int i) {
        this.f8763e = i;
    }

    public void d(int i) {
        this.f8764j = i;
    }

    public void e(String str) {
        this.a = str;
    }

    public void a(String str) {
        this.h = str;
    }

    public void b(String str) {
        this.b = str;
    }

    public void c(String str) {
        this.f = str;
    }

    public void d(String str) {
        this.g = str;
    }

    public void a(boolean z) {
        this.i = z;
    }

    public void a(byte[] bArr) {
        this.f8765l = bArr;
    }
}
