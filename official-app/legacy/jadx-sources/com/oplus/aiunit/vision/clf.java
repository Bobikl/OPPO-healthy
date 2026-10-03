package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class clf implements mgb.a {
    public final List<mgb> a;
    public final List<mgb> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<mgb> f10146c = new HashSet(3);

    public clf(@NonNull List<mgb> list) {
        this.a = list;
        this.b = new ArrayList(list.size());
    }

    @Nullable
    public static <P extends mgb> P c(@NonNull List<mgb> list, @NonNull Class<P> cls) {
        Iterator<mgb> it = list.iterator();
        while (it.hasNext()) {
            P p = (P) it.next();
            if (cls.isAssignableFrom(p.getClass())) {
                return p;
            }
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.mgb.a
    @NonNull
    public <P extends mgb> P a(@NonNull Class<P> cls) {
        return (P) d(cls);
    }

    public final void b(@NonNull mgb mgbVar) {
        if (this.b.contains(mgbVar)) {
            return;
        }
        if (this.f10146c.contains(mgbVar)) {
            throw new IllegalStateException("Cyclic dependency chain found: " + this.f10146c);
        }
        this.f10146c.add(mgbVar);
        mgbVar.g(this);
        this.f10146c.remove(mgbVar);
        if (this.b.contains(mgbVar)) {
            return;
        }
        if (io.noties.markwon.core.a.class.isAssignableFrom(mgbVar.getClass())) {
            this.b.add(0, mgbVar);
        } else {
            this.b.add(mgbVar);
        }
    }

    @NonNull
    public final <P extends mgb> P d(@NonNull Class<P> cls) {
        P p = (P) c(this.b, cls);
        if (p == null) {
            p = (P) c(this.a, cls);
            if (p == null) {
                throw new IllegalStateException("Requested plugin is not added: " + cls.getName() + ", plugins: " + this.a);
            }
            b(p);
        }
        return p;
    }

    @NonNull
    public List<mgb> e() {
        Iterator<mgb> it = this.a.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
        return this.b;
    }
}
