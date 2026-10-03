package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import com.oplus.aiunit.vision.ft4;
import com.oplus.aiunit.vision.n2c;
import com.oplus.aiunit.vision.ona;
import com.oplus.aiunit.vision.x68;
import com.oplus.aiunit.vision.ysf;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class j implements c, ft4.a<Object> {
    public final c.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d<?> f1394j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1395l = -1;
    public ona m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<n2c<File, ?>> f1396n;
    public int o;
    public volatile n2c.a<?> p;
    public File q;
    public ysf r;

    public j(d<?> dVar, c.a aVar) {
        this.f1394j = dVar;
        this.i = aVar;
    }

    @Override // com.bumptech.glide.load.engine.c
    public boolean a() {
        x68.a("ResourceCacheGenerator.startNext");
        try {
            List<ona> listC = this.f1394j.c();
            boolean z = false;
            if (listC.isEmpty()) {
                x68.e();
                return false;
            }
            List<Class<?>> listM = this.f1394j.m();
            if (listM.isEmpty()) {
                if (File.class.equals(this.f1394j.r())) {
                    x68.e();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f1394j.i() + " to " + this.f1394j.r());
            }
            while (true) {
                if (this.f1396n != null && b()) {
                    this.p = null;
                    while (!z && b()) {
                        List<n2c<File, ?>> list = this.f1396n;
                        int i = this.o;
                        this.o = i + 1;
                        this.p = list.get(i).a(this.q, this.f1394j.t(), this.f1394j.f(), this.f1394j.k());
                        if (this.p != null && this.f1394j.u(this.p.f14315c.a())) {
                            this.p.f14315c.f(this.f1394j.l(), this);
                            z = true;
                        }
                    }
                    x68.e();
                    return z;
                }
                int i2 = this.f1395l + 1;
                this.f1395l = i2;
                if (i2 >= listM.size()) {
                    int i3 = this.k + 1;
                    this.k = i3;
                    if (i3 >= listC.size()) {
                        x68.e();
                        return false;
                    }
                    this.f1395l = 0;
                }
                ona onaVar = listC.get(this.k);
                Class<?> cls = listM.get(this.f1395l);
                this.r = new ysf(this.f1394j.b(), onaVar, this.f1394j.p(), this.f1394j.t(), this.f1394j.f(), this.f1394j.s(cls), cls, this.f1394j.k());
                File fileA = this.f1394j.d().a(this.r);
                this.q = fileA;
                if (fileA != null) {
                    this.m = onaVar;
                    this.f1396n = this.f1394j.j(fileA);
                    this.o = 0;
                }
            }
        } catch (Throwable th) {
            x68.e();
            throw th;
        }
    }

    public final boolean b() {
        return this.o < this.f1396n.size();
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
        this.i.d(this.m, obj, this.p.f14315c, DataSource.RESOURCE_DISK_CACHE, this.r);
    }

    @Override // com.oplus.aiunit.vision.ft4.a
    public void e(@NonNull Exception exc) {
        this.i.b(this.r, exc, this.p.f14315c, DataSource.RESOURCE_DISK_CACHE);
    }
}
