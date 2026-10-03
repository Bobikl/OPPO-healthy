package com.badlogic.gdx;

/* JADX INFO: loaded from: classes13.dex */
public interface Graphics {

    public enum GraphicsType {
        AndroidGL,
        LWJGL,
        WebGL,
        iOSGL,
        JGLFW,
        Mock,
        LWJGL3
    }

    public static class a {
        public final int a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f1180c;
        public final int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f1181e;
        public final int f;
        public final int g;
        public final boolean h;

        public a(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
            this.a = i;
            this.b = i2;
            this.f1180c = i3;
            this.d = i4;
            this.f1181e = i5;
            this.f = i6;
            this.g = i7;
            this.h = z;
        }

        public String toString() {
            return "r: " + this.a + ", g: " + this.b + ", b: " + this.f1180c + ", a: " + this.d + ", depth: " + this.f1181e + ", stencil: " + this.f + ", num samples: " + this.g + ", coverage sampling: " + this.h;
        }
    }

    public static class b {
        public final int a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f1182c;
        public final int d;

        public b(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.f1182c = i3;
            this.d = i4;
        }

        public String toString() {
            return this.a + "x" + this.b + ", bpp: " + this.d + ", hz: " + this.f1182c;
        }
    }

    boolean a(String str);

    void b();

    boolean c();

    int d();

    a e();

    int f();

    float g();

    int getHeight();

    int getWidth();

    int h();

    b i();
}
