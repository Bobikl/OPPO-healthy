package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class wze {
    public final ModuleInfo a;
    public o05 b;
    public o05 c;
    public fq9 d;
    public rdk.a e = new a();
    public xp9 f = new b();
    public dq9 g = new c();

    public class a implements rdk.a {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.rdk.a
        public void a(@NonNull ModuleInfo moduleInfo, qdk qdkVar) {
            if (wze.this.a.equals(moduleInfo)) {
                wze.this.j(qdkVar);
            }
        }
    }

    public class b implements xp9 {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.xp9
        public void a(int i, sr0 sr0Var) {
            if (wze.this.d == null) {
                uml.b("Processor", "onDataPacked: mDataWrapperCallback is null");
            } else if (i == 1) {
                wze.this.d.b(wze.this.a, sr0Var);
            } else if (i == 2) {
                wze.this.d.d(wze.this.a, sr0Var);
            }
        }
    }

    public class c implements dq9 {
        public c() {
        }

        @Override // com.oplus.aiunit.vision.dq9
        public void a(int i, byte[] bArr, lt2<Void> lt2Var) {
            if (wze.this.d == null) {
                uml.b("Processor", "onDataUnPacked: mDataWrapperCallback is null");
            } else if (i == 1) {
                wze.this.d.a(wze.this.a, bArr, lt2Var);
            } else if (i == 2) {
                wze.this.d.c(wze.this.a, bArr, lt2Var);
            }
        }
    }

    public wze(@NonNull ModuleInfo moduleInfo) {
        this.a = moduleInfo;
        d();
        e();
        j(rdk.e().b(moduleInfo));
        rdk.e().g(moduleInfo, this.e);
    }

    public final void d() {
        o05 o05Var = new o05(1);
        this.c = o05Var;
        o05Var.t(this.g);
        this.c.s(this.f);
    }

    public final void e() {
        o05 o05Var = new o05(2);
        this.b = o05Var;
        o05Var.t(this.g);
        this.b.s(this.f);
    }

    public void f(int i, byte[] bArr) {
        if (i == 1) {
            this.c.o(bArr);
        } else {
            if (i != 2) {
                return;
            }
            this.b.o(bArr);
        }
    }

    public void g() {
        uml.a("Processor", "release");
        this.b.p();
        this.c.p();
        rdk.e().j(this.a);
    }

    public void h(fq9 fq9Var) {
        this.d = fq9Var;
    }

    public boolean i(int i, sr0 sr0Var) {
        if (i == 1) {
            this.c.v(sr0Var);
            return true;
        }
        if (i != 2) {
            return false;
        }
        this.b.v(sr0Var);
        return true;
    }

    public final void j(qdk qdkVar) {
        o05 o05Var = this.b;
        if (o05Var != null) {
            o05Var.w(qdkVar);
        }
        o05 o05Var2 = this.c;
        if (o05Var2 != null) {
            o05Var2.w(qdkVar);
        }
    }
}
