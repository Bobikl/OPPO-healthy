package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public final class n5c {
    public final String a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14351c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14352e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f14353j;

    public n5c(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i2) {
        this.a = str;
        this.b = i;
        this.f14351c = z;
        this.d = z2;
        this.f14352e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.f14353j = i2;
    }

    public boolean a() {
        return this.f14352e;
    }

    public boolean b() {
        return this.f;
    }

    public boolean c() {
        return this.g;
    }

    public boolean d() {
        return this.i;
    }

    public boolean e() {
        return this.h;
    }

    public boolean f() {
        return this.d;
    }

    public boolean g() {
        return this.f14351c;
    }

    public int h() {
        return this.f14353j;
    }

    public String i() {
        return this.a;
    }

    public int j() {
        return this.b;
    }

    public String toString() {
        return "MqttConnectVariableHeader{protocolName='" + this.a + "', protocolVersion=" + this.b + ", hasUserName=" + this.f14351c + ", hasPassword=" + this.d + ", hasApiKey=" + this.f14352e + ", hasApiSecret=" + this.f + ", hasDigitalEnvelope=" + this.g + ", hasMetaData=" + this.h + ", hasMaxMessageId=" + this.i + ", keepAliveTimeSeconds=" + this.f14353j + '}';
    }
}
