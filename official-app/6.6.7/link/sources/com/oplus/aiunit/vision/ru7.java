package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class ru7 extends qu7<ejk> {
    public float f;

    public ru7(float f) {
        this("floatValue", f);
    }

    @Override // com.oplus.aiunit.vision.qu7
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public float a(ejk ejkVar) {
        return this.f;
    }

    @Override // com.oplus.aiunit.vision.qu7
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void b(ejk ejkVar, float f) {
        this.f = f;
    }

    @Override // com.oplus.aiunit.vision.qu7
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void e(ejk ejkVar) {
        d(ejkVar, ejkVar.h.a);
    }

    @Override // com.oplus.aiunit.vision.qu7
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void f(ejk ejkVar) {
        super.f(ejkVar);
        ejkVar.e.a = this.d;
    }

    public String toString() {
        return "FloatValueHolder{mValue=" + this.f + ", mPropertyType=" + this.a + ", mPropertyName=" + this.b + ", mValueThreshold=" + this.c + ", mIsStartValueSet=" + this.e + "}@" + hashCode();
    }

    public ru7(String str, float f) {
        this(str, f, 1.0f);
    }

    public ru7(String str, float f, float f2) {
        super(str, f2);
        this.f = f;
    }
}
