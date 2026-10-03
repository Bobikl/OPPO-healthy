package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public class y11 implements t46 {
    public String a;
    public float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f18828c;
    public float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f18829e;
    public float f;
    public float g;

    public y11() {
    }

    @Override // com.oplus.aiunit.vision.t46
    public void a(float f) {
        this.b = f;
    }

    @Override // com.oplus.aiunit.vision.t46
    public void b(float f) {
        this.f18828c = f;
    }

    @Override // com.oplus.aiunit.vision.t46
    public void c(float f) {
        this.f18829e = f;
    }

    @Override // com.oplus.aiunit.vision.t46
    public float d() {
        return this.f18829e;
    }

    @Override // com.oplus.aiunit.vision.t46
    public void e(float f) {
        this.d = f;
    }

    @Override // com.oplus.aiunit.vision.t46
    public float f() {
        return this.f18828c;
    }

    @Override // com.oplus.aiunit.vision.t46
    public void g(float f) {
        this.g = f;
    }

    @Override // com.oplus.aiunit.vision.t46
    public float getMinHeight() {
        return this.g;
    }

    @Override // com.oplus.aiunit.vision.t46
    public float getMinWidth() {
        return this.f;
    }

    @Override // com.oplus.aiunit.vision.t46
    public float h() {
        return this.d;
    }

    @Override // com.oplus.aiunit.vision.t46
    public void i(float f) {
        this.f = f;
    }

    @Override // com.oplus.aiunit.vision.t46
    public float j() {
        return this.b;
    }

    public String k() {
        return this.a;
    }

    public void l(String str) {
        this.a = str;
    }

    public String toString() {
        String str = this.a;
        return str == null ? kc3.e(getClass()) : str;
    }

    public y11(t46 t46Var) {
        if (t46Var instanceof y11) {
            this.a = ((y11) t46Var).k();
        }
        this.b = t46Var.j();
        this.f18828c = t46Var.f();
        this.d = t46Var.h();
        this.f18829e = t46Var.d();
        this.f = t46Var.getMinWidth();
        this.g = t46Var.getMinHeight();
    }
}
