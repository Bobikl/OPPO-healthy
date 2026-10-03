package com.oplus.aiunit.vision;

import com.heytap.health.bandface.api.SyncBandFaceCallback;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public class bfl {
    public String a = "";
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f9735c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n4h f9736e;
    public SyncBandFaceCallback.SimpleBandFaceBean f;

    public SyncBandFaceCallback.SimpleBandFaceBean a() {
        return this.f;
    }

    public String b() {
        return this.a;
    }

    public float c() {
        return this.f9735c;
    }

    public n4h d() {
        return this.f9736e;
    }

    public String e() {
        n4h n4hVar = this.f9736e;
        if (n4hVar != null) {
            return n4hVar.e();
        }
        SyncBandFaceCallback.SimpleBandFaceBean simpleBandFaceBean = this.f;
        return simpleBandFaceBean != null ? simpleBandFaceBean.getWfName() : "";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bfl bflVar = (bfl) obj;
        return this.b == bflVar.b && Objects.equals(this.a, bflVar.a) && Objects.equals(this.d, bflVar.d) && Objects.equals(this.f9736e, bflVar.f9736e) && Objects.equals(this.f, bflVar.f);
    }

    public void f(SyncBandFaceCallback.SimpleBandFaceBean simpleBandFaceBean) {
        this.f = simpleBandFaceBean;
    }

    public void g(int i) {
        this.b = i;
    }

    public void h(float f) {
        this.f9735c = f;
    }

    public int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.d, this.f9736e, this.f);
    }

    public void i(n4h n4hVar) {
        this.f9736e = n4hVar;
    }

    public String toString() {
        return "WatchFaceWarrper{ortherUrl='" + this.a + "', radius=" + this.b + ", deviceModel='" + this.d + "', mSimpleWatchFaceBean=" + this.f9736e + ", mBandSimpleWatchFaceBeans=" + this.f + '}';
    }
}
