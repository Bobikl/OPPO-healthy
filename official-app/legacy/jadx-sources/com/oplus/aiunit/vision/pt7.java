package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes8.dex */
public class pt7 extends ot7<cfk> {
    public float f;

    public pt7(float f) {
        this("floatValue", f);
    }

    @Override // com.oplus.aiunit.vision.ot7
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public float a(cfk cfkVar) {
        return this.f;
    }

    @Override // com.oplus.aiunit.vision.ot7
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void b(cfk cfkVar, float f) {
        this.f = f;
    }

    @Override // com.oplus.aiunit.vision.ot7
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void e(cfk cfkVar) {
        d(cfkVar, cfkVar.h.a);
    }

    @Override // com.oplus.aiunit.vision.ot7
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void f(cfk cfkVar) {
        super.f(cfkVar);
        cfkVar.f10068e.a = this.d;
    }

    public String toString() {
        return "FloatValueHolder{mValue=" + this.f + ", mPropertyType=" + this.a + ", mPropertyName=" + this.b + ", mValueThreshold=" + this.f15044c + ", mIsStartValueSet=" + this.f15045e + "}@" + hashCode();
    }

    public pt7(String str, float f) {
        this(str, f, 1.0f);
    }

    public pt7(String str, float f, float f2) {
        super(str, f2);
        this.f = f;
    }
}
