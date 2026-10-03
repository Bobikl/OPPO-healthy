package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public abstract class cjf {

    public static class a extends cjf {
        public float a;
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f10128c;
        public float d;

        public a(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.f10128c = f3;
            this.d = f4;
        }

        @Override // com.oplus.aiunit.vision.cjf
        public float a() {
            return this.d;
        }

        @Override // com.oplus.aiunit.vision.cjf
        public float b() {
            return this.f10128c;
        }

        @Override // com.oplus.aiunit.vision.cjf
        public float c() {
            return this.a;
        }

        @Override // com.oplus.aiunit.vision.cjf
        public float d() {
            return this.b;
        }

        public String toString() {
            return "Float{x=" + this.a + ", y=" + this.b + ", w=" + this.f10128c + ", h=" + this.d + '}';
        }
    }

    public abstract float a();

    public abstract float b();

    public abstract float c();

    public abstract float d();
}
