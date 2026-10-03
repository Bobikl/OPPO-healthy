package com.amap.api.col.p0003sl;

/* JADX INFO: loaded from: classes12.dex */
public final class nl extends ni {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f802j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f803l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f804n;

    public nl() {
        this.f802j = 0;
        this.k = 0;
        this.f803l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
        this.f804n = Integer.MAX_VALUE;
    }

    @Override // com.amap.api.col.p0003sl.ni
    /* JADX INFO: renamed from: a */
    public final ni clone() {
        nl nlVar = new nl(this.h);
        nlVar.a(this);
        nlVar.f802j = this.f802j;
        nlVar.k = this.k;
        nlVar.f803l = this.f803l;
        nlVar.m = this.m;
        nlVar.f804n = this.f804n;
        return nlVar;
    }

    @Override // com.amap.api.col.p0003sl.ni
    public final String toString() {
        return "AmapCellLte{tac=" + this.f802j + ", ci=" + this.k + ", pci=" + this.f803l + ", earfcn=" + this.m + ", timingAdvance=" + this.f804n + ", mcc='" + this.a + "', mnc='" + this.b + "', signalStrength=" + this.f794c + ", asuLevel=" + this.d + ", lastUpdateSystemMills=" + this.f795e + ", lastUpdateUtcMills=" + this.f + ", age=" + this.g + ", main=" + this.h + ", newApi=" + this.i + '}';
    }

    public nl(boolean z) {
        super(z, true);
        this.f802j = 0;
        this.k = 0;
        this.f803l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
        this.f804n = Integer.MAX_VALUE;
    }
}
