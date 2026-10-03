package com.oplus.aiunit.vision;

import com.adobe.xmp.XMPException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class z5m implements Comparable {
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f19276j;
    public z5m k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f19277l;
    public List m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public bze f19278n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;

    public class a implements Iterator {
        public final /* synthetic */ Iterator i;

        public a(Iterator it) {
            this.i = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.i.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.i.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove() is not allowed due to the internal contraints");
        }
    }

    public z5m(String str, bze bzeVar) {
        this(str, null, bzeVar);
    }

    public int E() {
        List list = this.f19277l;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public boolean F() {
        return this.p;
    }

    public boolean G() {
        return this.r;
    }

    public String H() {
        return this.i;
    }

    public bze I() {
        if (this.f19278n == null) {
            this.f19278n = new bze();
        }
        return this.f19278n;
    }

    public z5m J() {
        return this.k;
    }

    public z5m K(int i) {
        return (z5m) L().get(i - 1);
    }

    public final List L() {
        if (this.m == null) {
            this.m = new ArrayList(0);
        }
        return this.m;
    }

    public int M() {
        List list = this.m;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public List N() {
        return Collections.unmodifiableList(new ArrayList(r()));
    }

    public String O() {
        return this.f19276j;
    }

    public boolean P() {
        List list = this.f19277l;
        return list != null && list.size() > 0;
    }

    public boolean Q() {
        List list = this.m;
        return list != null && list.size() > 0;
    }

    public boolean R() {
        return this.q;
    }

    public boolean S() {
        return this.o;
    }

    public final boolean T() {
        return "xml:lang".equals(this.i);
    }

    public final boolean U() {
        return "rdf:type".equals(this.i);
    }

    public Iterator V() {
        return this.f19277l != null ? r().iterator() : Collections.EMPTY_LIST.listIterator();
    }

    public Iterator W() {
        return this.m != null ? new a(L().iterator()) : Collections.EMPTY_LIST.iterator();
    }

    public void X(int i) {
        r().remove(i - 1);
        i();
    }

    public void Y(z5m z5mVar) {
        r().remove(z5mVar);
        i();
    }

    public void Z() {
        this.f19277l = null;
    }

    public void a0(z5m z5mVar) {
        bze bzeVarI = I();
        if (z5mVar.T()) {
            bzeVarI.w(false);
        } else if (z5mVar.U()) {
            bzeVarI.y(false);
        }
        L().remove(z5mVar);
        if (this.m.isEmpty()) {
            bzeVarI.x(false);
            this.m = null;
        }
    }

    public void b(int i, z5m z5mVar) throws XMPException {
        g(z5mVar.H());
        z5mVar.j0(this);
        r().add(i - 1, z5mVar);
    }

    public void b0() {
        bze bzeVarI = I();
        bzeVarI.x(false);
        bzeVarI.w(false);
        bzeVarI.y(false);
        this.m = null;
    }

    public void c0(int i, z5m z5mVar) {
        z5mVar.j0(this);
        r().set(i - 1, z5mVar);
    }

    public Object clone() {
        bze bzeVar;
        try {
            bzeVar = new bze(I().d());
        } catch (XMPException unused) {
            bzeVar = new bze();
        }
        z5m z5mVar = new z5m(this.i, this.f19276j, bzeVar);
        l(z5mVar);
        return z5mVar;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        String str;
        String strH;
        if (I().o()) {
            str = this.f19276j;
            strH = ((z5m) obj).O();
        } else {
            str = this.i;
            strH = ((z5m) obj).H();
        }
        return str.compareTo(strH);
    }

    public void d(z5m z5mVar) throws XMPException {
        g(z5mVar.H());
        z5mVar.j0(this);
        r().add(z5mVar);
    }

    public void d0(boolean z) {
        this.q = z;
    }

    public void e(z5m z5mVar) throws XMPException {
        h(z5mVar.H());
        z5mVar.j0(this);
        z5mVar.I().z(true);
        I().x(true);
        if (z5mVar.T()) {
            this.f19278n.w(true);
            L().add(0, z5mVar);
        } else if (!z5mVar.U()) {
            L().add(z5mVar);
        } else {
            this.f19278n.y(true);
            L().add(this.f19278n.h() ? 1 : 0, z5mVar);
        }
    }

    public void e0(boolean z) {
        this.p = z;
    }

    public void f0(boolean z) {
        this.r = z;
    }

    public final void g(String str) throws XMPException {
        if ("[]".equals(str) || n(str) == null) {
            return;
        }
        throw new XMPException("Duplicate property or field node '" + str + "'", 203);
    }

    public void g0(boolean z) {
        this.o = z;
    }

    public final void h(String str) throws XMPException {
        if ("[]".equals(str) || o(str) == null) {
            return;
        }
        throw new XMPException("Duplicate '" + str + "' qualifier", 203);
    }

    public void h0(String str) {
        this.i = str;
    }

    public void i() {
        if (this.f19277l.isEmpty()) {
            this.f19277l = null;
        }
    }

    public void i0(bze bzeVar) {
        this.f19278n = bzeVar;
    }

    public void j0(z5m z5mVar) {
        this.k = z5mVar;
    }

    public void k0(String str) {
        this.f19276j = str;
    }

    public void l(z5m z5mVar) {
        try {
            Iterator itV = V();
            while (itV.hasNext()) {
                z5mVar.d((z5m) ((z5m) itV.next()).clone());
            }
            Iterator itW = W();
            while (itW.hasNext()) {
                z5mVar.e((z5m) ((z5m) itW.next()).clone());
            }
        } catch (XMPException unused) {
        }
    }

    public final z5m m(List list, String str) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z5m z5mVar = (z5m) it.next();
            if (z5mVar.H().equals(str)) {
                return z5mVar;
            }
        }
        return null;
    }

    public z5m n(String str) {
        return m(r(), str);
    }

    public z5m o(String str) {
        return m(this.m, str);
    }

    public z5m p(int i) {
        return (z5m) r().get(i - 1);
    }

    public final List r() {
        if (this.f19277l == null) {
            this.f19277l = new ArrayList(0);
        }
        return this.f19277l;
    }

    public z5m(String str, String str2, bze bzeVar) {
        this.f19277l = null;
        this.m = null;
        this.i = str;
        this.f19276j = str2;
        this.f19278n = bzeVar;
    }
}
