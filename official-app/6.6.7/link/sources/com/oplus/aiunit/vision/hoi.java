package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class hoi {
    public pv1 a;
    public pv1 b;
    public final lyk c;
    public float d;
    public float e;
    public float f;

    public hoi() {
        lyk lykVar = new lyk();
        this.c = lykVar;
        lykVar.d(vr3.UNSET, vr3.UNSET);
        this.d = Float.MAX_VALUE;
        this.e = 6.0f;
        this.f = 0.8f;
    }

    public String toString() {
        return "SpringDef{target=" + this.c + ", frequencyHz=" + this.e + ", dampingRatio=" + this.f + "}@" + hashCode();
    }
}
