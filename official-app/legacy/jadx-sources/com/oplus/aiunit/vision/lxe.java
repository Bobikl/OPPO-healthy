package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;

/* JADX INFO: loaded from: classes5.dex */
public class lxe {
    public final ModuleInfo a;
    public vz4 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public vz4 f13876c;
    public zo9 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p9k.a f13877e = new a();
    public ro9 f = new b();
    public xo9 g = new c();

    public class a implements p9k.a {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.p9k.a
        public void a(@NonNull ModuleInfo moduleInfo, o9k o9kVar) {
            if (lxe.this.a.equals(moduleInfo)) {
                lxe.this.j(o9kVar);
            }
        }
    }

    public class b implements ro9 {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.ro9
        public void a(int i, br0 br0Var) {
            if (lxe.this.d == null) {
                wil.b("Processor", "onDataPacked: mDataWrapperCallback is null");
            } else if (i == 1) {
                lxe.this.d.b(lxe.this.a, br0Var);
            } else if (i == 2) {
                lxe.this.d.d(lxe.this.a, br0Var);
            }
        }
    }

    public class c implements xo9 {
        public c() {
        }

        @Override // com.oplus.aiunit.vision.xo9
        public void a(int i, byte[] bArr, xs2<Void> xs2Var) {
            if (lxe.this.d == null) {
                wil.b("Processor", "onDataUnPacked: mDataWrapperCallback is null");
            } else if (i == 1) {
                lxe.this.d.a(lxe.this.a, bArr, xs2Var);
            } else if (i == 2) {
                lxe.this.d.c(lxe.this.a, bArr, xs2Var);
            }
        }
    }

    public lxe(@NonNull ModuleInfo moduleInfo) {
        this.a = moduleInfo;
        d();
        e();
        j(p9k.e().b(moduleInfo));
        p9k.e().g(moduleInfo, this.f13877e);
    }

    public final void d() {
        vz4 vz4Var = new vz4(1);
        this.f13876c = vz4Var;
        vz4Var.t(this.g);
        this.f13876c.s(this.f);
    }

    public final void e() {
        vz4 vz4Var = new vz4(2);
        this.b = vz4Var;
        vz4Var.t(this.g);
        this.b.s(this.f);
    }

    public void f(int i, byte[] bArr) {
        if (i == 1) {
            this.f13876c.o(bArr);
        } else {
            if (i != 2) {
                return;
            }
            this.b.o(bArr);
        }
    }

    public void g() {
        wil.a("Processor", "release");
        this.b.p();
        this.f13876c.p();
        p9k.e().j(this.a);
    }

    public void h(zo9 zo9Var) {
        this.d = zo9Var;
    }

    public boolean i(int i, br0 br0Var) {
        if (i == 1) {
            this.f13876c.v(br0Var);
            return true;
        }
        if (i != 2) {
            return false;
        }
        this.b.v(br0Var);
        return true;
    }

    public final void j(o9k o9kVar) {
        vz4 vz4Var = this.b;
        if (vz4Var != null) {
            vz4Var.w(o9kVar);
        }
        vz4 vz4Var2 = this.f13876c;
        if (vz4Var2 != null) {
            vz4Var2.w(o9kVar);
        }
    }
}
