package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public final class d3j {
    public final Object a;
    public final a3j b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f10367c = true;

    public d3j(Object obj, a3j a3jVar) {
        this.a = obj;
        this.b = a3jVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d3j)) {
            return false;
        }
        d3j d3jVar = (d3j) obj;
        return this.a == d3jVar.a && this.b.equals(d3jVar.b);
    }

    public int hashCode() {
        return this.a.hashCode() + this.b.f.hashCode();
    }
}
