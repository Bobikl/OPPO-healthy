package com.amap.api.col.p0003sl;

/* JADX INFO: loaded from: classes12.dex */
public final class nj extends ni {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f796j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f797l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f798n;

    public nj() {
        this.f796j = 0;
        this.k = 0;
        this.f797l = 0;
    }

    @Override // com.amap.api.col.p0003sl.ni
    /* JADX INFO: renamed from: a */
    public final ni clone() {
        nj njVar = new nj(this.h, this.i);
        njVar.a(this);
        njVar.f796j = this.f796j;
        njVar.k = this.k;
        njVar.f797l = this.f797l;
        njVar.m = this.m;
        njVar.f798n = this.f798n;
        return njVar;
    }

    @Override // com.amap.api.col.p0003sl.ni
    public final String toString() {
        return "AmapCellCdma{sid=" + this.f796j + ", nid=" + this.k + ", bid=" + this.f797l + ", latitude=" + this.m + ", longitude=" + this.f798n + ", mcc='" + this.a + "', mnc='" + this.b + "', signalStrength=" + this.f794c + ", asuLevel=" + this.d + ", lastUpdateSystemMills=" + this.f795e + ", lastUpdateUtcMills=" + this.f + ", age=" + this.g + ", main=" + this.h + ", newApi=" + this.i + '}';
    }

    public nj(boolean z, boolean z2) {
        super(z, z2);
        this.f796j = 0;
        this.k = 0;
        this.f797l = 0;
    }
}
