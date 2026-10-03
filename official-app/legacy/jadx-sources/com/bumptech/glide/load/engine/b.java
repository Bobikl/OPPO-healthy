package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import com.oplus.aiunit.vision.ft4;
import com.oplus.aiunit.vision.ks4;
import com.oplus.aiunit.vision.n2c;
import com.oplus.aiunit.vision.ona;
import com.oplus.aiunit.vision.x68;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class b implements c, ft4.a<Object> {
    public final List<ona> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d<?> f1369j;
    public final c.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1370l;
    public ona m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<n2c<File, ?>> f1371n;
    public int o;
    public volatile n2c.a<?> p;
    public File q;

    public b(d<?> dVar, c.a aVar) {
        this(dVar.c(), dVar, aVar);
    }

    @Override // com.bumptech.glide.load.engine.c
    public boolean a() {
        x68.a("DataCacheGenerator.startNext");
        while (true) {
            try {
                boolean z = false;
                if (this.f1371n != null && b()) {
                    this.p = null;
                    while (!z && b()) {
                        List<n2c<File, ?>> list = this.f1371n;
                        int i = this.o;
                        this.o = i + 1;
                        this.p = list.get(i).a(this.q, this.f1369j.t(), this.f1369j.f(), this.f1369j.k());
                        if (this.p != null && this.f1369j.u(this.p.f14315c.a())) {
                            this.p.f14315c.f(this.f1369j.l(), this);
                            z = true;
                        }
                    }
                    x68.e();
                    return z;
                }
                int i2 = this.f1370l + 1;
                this.f1370l = i2;
                if (i2 >= this.i.size()) {
                    x68.e();
                    return false;
                }
                ona onaVar = this.i.get(this.f1370l);
                File fileA = this.f1369j.d().a(new ks4(onaVar, this.f1369j.p()));
                this.q = fileA;
                if (fileA != null) {
                    this.m = onaVar;
                    this.f1371n = this.f1369j.j(fileA);
                    this.o = 0;
                }
            } catch (Throwable th) {
                x68.e();
                throw th;
            }
        }
    }

    public final boolean b() {
        return this.o < this.f1371n.size();
    }

    @Override // com.bumptech.glide.load.engine.c
    public void cancel() {
        n2c.a<?> aVar = this.p;
        if (aVar != null) {
            aVar.f14315c.cancel();
        }
    }

    @Override // com.oplus.aiunit.vision.ft4.a
    public void d(Object obj) {
        this.k.d(this.m, obj, this.p.f14315c, DataSource.DATA_DISK_CACHE, this.m);
    }

    @Override // com.oplus.aiunit.vision.ft4.a
    public void e(@NonNull Exception exc) {
        this.k.b(this.m, exc, this.p.f14315c, DataSource.DATA_DISK_CACHE);
    }

    public b(List<ona> list, d<?> dVar, c.a aVar) {
        this.f1370l = -1;
        this.i = list;
        this.f1369j = dVar;
        this.k = aVar;
    }
}
