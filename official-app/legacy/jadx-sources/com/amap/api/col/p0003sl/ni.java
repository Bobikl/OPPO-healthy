package com.amap.api.col.p0003sl;

import com.oplus.aiunit.vision.n6n;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ni implements Serializable {
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f794c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f795e;
    public long f;
    public int g;
    public boolean h;
    public boolean i;

    public ni() {
        this.a = "";
        this.b = "";
        this.f794c = 99;
        this.d = Integer.MAX_VALUE;
        this.f795e = 0L;
        this.f = 0L;
        this.g = 0;
        this.i = true;
    }

    private static int a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e2) {
            n6n.a(e2);
            return 0;
        }
    }

    @Override // 
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract ni clone();

    public final int b() {
        return a(this.a);
    }

    public final int c() {
        return a(this.b);
    }

    public String toString() {
        return "AmapCell{mcc=" + this.a + ", mnc=" + this.b + ", signalStrength=" + this.f794c + ", asulevel=" + this.d + ", lastUpdateSystemMills=" + this.f795e + ", lastUpdateUtcMills=" + this.f + ", age=" + this.g + ", main=" + this.h + ", newapi=" + this.i + '}';
    }

    public final void a(ni niVar) {
        this.a = niVar.a;
        this.b = niVar.b;
        this.f794c = niVar.f794c;
        this.d = niVar.d;
        this.f795e = niVar.f795e;
        this.f = niVar.f;
        this.g = niVar.g;
        this.h = niVar.h;
        this.i = niVar.i;
    }

    public ni(boolean z, boolean z2) {
        this.a = "";
        this.b = "";
        this.f794c = 99;
        this.d = Integer.MAX_VALUE;
        this.f795e = 0L;
        this.f = 0L;
        this.g = 0;
        this.h = z;
        this.i = z2;
    }
}
