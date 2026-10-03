package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class hg8 {
    public static final hg8 b = new hg8();
    public List<ig8> a = new ArrayList();

    public interface a {
        void a(ig8 ig8Var);
    }

    public static hg8 a() {
        return b;
    }

    public void b(ig8 ig8Var) {
        this.a.add(ig8Var);
    }

    public void c(ig8 ig8Var) {
        if (this.a.contains(ig8Var)) {
            this.a.remove(ig8Var);
        }
    }

    public void notifyObserver(a aVar) {
        Iterator<ig8> it = this.a.iterator();
        while (it.hasNext()) {
            aVar.a(it.next());
        }
    }
}
