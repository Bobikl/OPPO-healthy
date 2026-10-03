package com.heytap.omas.omkms.data;

/* JADX INFO: loaded from: classes19.dex */
public final class j {
    private h a;
    private int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Exception f7623c;

    public static class b {
        private h a;
        private int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Exception f7624c;

        private b() {
        }

        public b a(int i) {
            this.b = i;
            return this;
        }

        public b a(h hVar) {
            this.a = hVar;
            return this;
        }

        public b a(Exception exc) {
            this.f7624c = exc;
            return this;
        }

        public j a() {
            return new j(this);
        }
    }

    private j(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.f7623c = bVar.f7624c;
    }

    public static b d() {
        return new b();
    }

    public int a() {
        return this.b;
    }

    public Exception b() {
        return this.f7623c;
    }

    public h c() {
        return this.a;
    }

    public String toString() {
        return "InitInformation{paramSpec=" + this.a + ", statusCode=" + this.b + ", exception=" + this.f7623c + '}';
    }
}
