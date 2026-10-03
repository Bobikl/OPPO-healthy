package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ltc {
    public ltc a = null;
    public ltc b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ltc f13825c = null;
    public ltc d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ltc f13826e = null;

    public abstract void a(v1l v1lVar);

    public void b(ltc ltcVar) {
        ltcVar.l();
        ltcVar.j(this);
        ltc ltcVar2 = this.f13825c;
        if (ltcVar2 == null) {
            this.b = ltcVar;
            this.f13825c = ltcVar;
        } else {
            ltcVar2.f13826e = ltcVar;
            ltcVar.d = ltcVar2;
            this.f13825c = ltcVar;
        }
    }

    public ltc c() {
        return this.b;
    }

    public ltc d() {
        return this.f13825c;
    }

    public ltc e() {
        return this.f13826e;
    }

    public ltc f() {
        return this.a;
    }

    public ltc g() {
        return this.d;
    }

    public void h(ltc ltcVar) {
        ltcVar.l();
        ltc ltcVar2 = this.f13826e;
        ltcVar.f13826e = ltcVar2;
        if (ltcVar2 != null) {
            ltcVar2.d = ltcVar;
        }
        ltcVar.d = this;
        this.f13826e = ltcVar;
        ltc ltcVar3 = this.a;
        ltcVar.a = ltcVar3;
        if (ltcVar.f13826e == null) {
            ltcVar3.f13825c = ltcVar;
        }
    }

    public void i(ltc ltcVar) {
        ltcVar.l();
        ltc ltcVar2 = this.d;
        ltcVar.d = ltcVar2;
        if (ltcVar2 != null) {
            ltcVar2.f13826e = ltcVar;
        }
        ltcVar.f13826e = this;
        this.d = ltcVar;
        ltc ltcVar3 = this.a;
        ltcVar.a = ltcVar3;
        if (ltcVar.d == null) {
            ltcVar3.b = ltcVar;
        }
    }

    public void j(ltc ltcVar) {
        this.a = ltcVar;
    }

    public String k() {
        return "";
    }

    public void l() {
        ltc ltcVar = this.d;
        if (ltcVar != null) {
            ltcVar.f13826e = this.f13826e;
        } else {
            ltc ltcVar2 = this.a;
            if (ltcVar2 != null) {
                ltcVar2.b = this.f13826e;
            }
        }
        ltc ltcVar3 = this.f13826e;
        if (ltcVar3 != null) {
            ltcVar3.d = ltcVar;
        } else {
            ltc ltcVar4 = this.a;
            if (ltcVar4 != null) {
                ltcVar4.f13825c = ltcVar;
            }
        }
        this.a = null;
        this.f13826e = null;
        this.d = null;
    }

    public String toString() {
        return getClass().getSimpleName() + n04.OPEN_BRACE_REGEX + k() + "}";
    }
}
