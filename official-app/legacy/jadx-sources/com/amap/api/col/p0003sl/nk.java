package com.amap.api.col.p0003sl;

/* JADX INFO: loaded from: classes12.dex */
public final class nk extends ni {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f799j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f800l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f801n;
    public int o;

    public nk() {
        this.f799j = 0;
        this.k = 0;
        this.f800l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
        this.f801n = Integer.MAX_VALUE;
        this.o = Integer.MAX_VALUE;
    }

    @Override // com.amap.api.col.p0003sl.ni
    /* JADX INFO: renamed from: a */
    public final ni clone() {
        nk nkVar = new nk(this.h, this.i);
        nkVar.a(this);
        nkVar.f799j = this.f799j;
        nkVar.k = this.k;
        nkVar.f800l = this.f800l;
        nkVar.m = this.m;
        nkVar.f801n = this.f801n;
        nkVar.o = this.o;
        return nkVar;
    }

    @Override // com.amap.api.col.p0003sl.ni
    public final String toString() {
        return "AmapCellGsm{lac=" + this.f799j + ", cid=" + this.k + ", psc=" + this.f800l + ", arfcn=" + this.m + ", bsic=" + this.f801n + ", timingAdvance=" + this.o + ", mcc='" + this.a + "', mnc='" + this.b + "', signalStrength=" + this.f794c + ", asuLevel=" + this.d + ", lastUpdateSystemMills=" + this.f795e + ", lastUpdateUtcMills=" + this.f + ", age=" + this.g + ", main=" + this.h + ", newApi=" + this.i + '}';
    }

    public nk(boolean z, boolean z2) {
        super(z, z2);
        this.f799j = 0;
        this.k = 0;
        this.f800l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
        this.f801n = Integer.MAX_VALUE;
        this.o = Integer.MAX_VALUE;
    }
}
