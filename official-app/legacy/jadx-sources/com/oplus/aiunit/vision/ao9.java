package com.oplus.aiunit.vision;

import android.util.Pair;
import com.oplus.aiunit.vision.yr9;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public abstract class ao9<Remote, Local extends yr9> implements Iterator<Pair<Remote, Local>> {
    public final a<Remote, Local> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Iterator<Remote> f9443j;
    public final Iterator<Local> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f9444l;
    public Remote m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Local f9445n;

    public interface a<Remote, Local extends yr9> {
        int a(Remote remote, Local local);
    }

    public ao9(String str, List<Remote> list, List<Local> list2, a<Remote, Local> aVar) {
        this.f9444l = str;
        this.i = aVar;
        Iterator<Remote> it = list.iterator();
        this.f9443j = it;
        Iterator<Local> it2 = list2.iterator();
        this.k = it2;
        this.m = it.hasNext() ? it.next() : null;
        this.f9445n = it2.hasNext() ? it2.next() : null;
        l();
    }

    public abstract Local a(Remote remote);

    public abstract Remote b(Local local);

    public final Pair<Remote, Local> c(Local local) {
        Remote remoteB = b(local);
        i(local);
        return new Pair<>(remoteB, local);
    }

    public final Pair<Remote, Local> d(Remote remote) {
        yr9 yr9VarA = a(remote);
        j(yr9VarA);
        return new Pair<>(remote, yr9VarA);
    }

    public final Pair<Remote, Local> e(Remote remote, Local local) {
        k(local);
        return new Pair<>(remote, local);
    }

    public String f() {
        return this.f9444l;
    }

    public abstract boolean g(Remote remote, Local local);

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Pair<Remote, Local> next() {
        Pair<Remote, Local> pairC;
        Local local;
        Remote remote = this.m;
        Local next = null;
        if (remote != null && (local = this.f9445n) != null) {
            int iA = this.i.a(remote, local);
            if (iA == -1) {
                pairC = d(this.m);
                if (this.f9443j.hasNext()) {
                    next = this.f9443j.next();
                }
                this.m = (Remote) next;
            } else if (iA == 0) {
                pairC = e(this.m, this.f9445n);
                this.m = this.f9443j.hasNext() ? this.f9443j.next() : null;
                if (this.k.hasNext()) {
                    next = this.k.next();
                }
                this.f9445n = next;
            } else {
                if (iA != 1) {
                    throw new RuntimeException("not support comparator result except -1,0,1");
                }
                pairC = c(this.f9445n);
                if (this.k.hasNext()) {
                    next = this.k.next();
                }
                this.f9445n = next;
            }
            l();
        } else if (remote != null) {
            pairC = d(remote);
            if (this.f9443j.hasNext()) {
                next = this.f9443j.next();
            }
            this.m = (Remote) next;
        } else {
            Local local2 = this.f9445n;
            if (local2 == null) {
                throw new RuntimeException("ICompareStrategy has not next");
            }
            pairC = c(local2);
            if (this.k.hasNext()) {
                next = this.k.next();
            }
            this.f9445n = next;
        }
        return pairC;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return (this.m == null && this.f9445n == null) ? false : true;
    }

    public void i(Local local) {
        local.a(3);
    }

    public void j(Local local) {
        local.a(2);
    }

    public void k(Local local) {
        local.a(2);
    }

    public final void l() {
        Local local;
        while (true) {
            Remote remote = this.m;
            if (remote == null || (local = this.f9445n) == null || this.i.a(remote, local) != 0 || !g(this.m, this.f9445n) || this.f9445n.getStatus() != 0) {
                return;
            }
            Local next = null;
            this.m = this.f9443j.hasNext() ? this.f9443j.next() : null;
            if (this.k.hasNext()) {
                next = this.k.next();
            }
            this.f9445n = next;
        }
    }
}
