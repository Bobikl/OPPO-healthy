package com.amap.api.col.p0003sl;

/* JADX INFO: loaded from: classes12.dex */
public final class nm extends ni {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f805j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f806l;
    public int m;

    public nm() {
        this.f805j = 0;
        this.k = 0;
        this.f806l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
    }

    @Override // com.amap.api.col.p0003sl.ni
    /* JADX INFO: renamed from: a */
    public final ni clone() {
        nm nmVar = new nm(this.h, this.i);
        nmVar.a(this);
        nmVar.f805j = this.f805j;
        nmVar.k = this.k;
        nmVar.f806l = this.f806l;
        nmVar.m = this.m;
        return nmVar;
    }

    @Override // com.amap.api.col.p0003sl.ni
    public final String toString() {
        return "AmapCellWcdma{lac=" + this.f805j + ", cid=" + this.k + ", psc=" + this.f806l + ", uarfcn=" + this.m + ", mcc='" + this.a + "', mnc='" + this.b + "', signalStrength=" + this.f794c + ", asuLevel=" + this.d + ", lastUpdateSystemMills=" + this.f795e + ", lastUpdateUtcMills=" + this.f + ", age=" + this.g + ", main=" + this.h + ", newApi=" + this.i + '}';
    }

    public nm(boolean z, boolean z2) {
        super(z, z2);
        this.f805j = 0;
        this.k = 0;
        this.f806l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
    }
}
