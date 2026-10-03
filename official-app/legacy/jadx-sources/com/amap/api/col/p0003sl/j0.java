package com.amap.api.col.p0003sl;

/* JADX INFO: loaded from: classes12.dex */
public class j0 {
    public k0 a;
    public la b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f758c;
    public long d;

    public interface a {
        void onDownload(byte[] bArr, long j2);

        void onException(Throwable th);

        void onFinish();

        void onStop();
    }

    public j0(la laVar) {
        this(laVar, (byte) 0);
    }

    public final void a() {
        k0 k0Var = this.a;
        if (k0Var != null) {
            k0Var.k();
        }
    }

    public final void b(a aVar) {
        try {
            k0 k0Var = new k0();
            this.a = k0Var;
            k0Var.t(this.d);
            this.a.l(this.f758c);
            i0.b();
            if (i0.g(this.b)) {
                this.b.setDegradeType(la.b.NEVER_GRADE);
                this.a.m(this.b, aVar);
            } else {
                this.b.setDegradeType(la.b.DEGRADE_ONLY);
                this.a.m(this.b, aVar);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public j0(la laVar, byte b) {
        this(laVar, 0L, -1L, false);
    }

    public j0(la laVar, long j2, long j3, boolean z) {
        this.b = laVar;
        this.f758c = j2;
        this.d = j3;
        laVar.setHttpProtocol(z ? la.c.HTTPS : la.c.HTTP);
        this.b.setDegradeAbility(la.a.SINGLE);
    }
}
