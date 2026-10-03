package com.oplus.aiunit.vision;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class dt4 implements t97.a {
    public final LinkedList<iz4> a;
    public final t97 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10684c;

    public static class a {
        public static dt4 INSTANCE = new dt4();
    }

    public interface b {
        void a(egj egjVar);
    }

    public static dt4 c() {
        return a.INSTANCE;
    }

    public static ya7 g(String str, String str2) {
        return h(str, str2, 0, true);
    }

    public static ya7 h(String str, String str2, int i, boolean z) {
        File[] fileArrListFiles;
        if (z && (fileArrListFiles = new File(str).listFiles()) != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile()) {
                    file.delete();
                }
            }
        }
        ya7 ya7Var = new ya7(i, str2, str);
        ya7Var.y();
        return ya7Var;
    }

    @Override // com.oplus.aiunit.vision.t97.a
    public void a(o97 o97Var) {
        az4.r(o97Var);
        synchronized (this.a) {
            Iterator<iz4> it = this.a.iterator();
            while (it.hasNext()) {
                iz4 next = it.next();
                next.c(o97Var);
                if (next.b()) {
                    it.remove();
                }
            }
        }
    }

    public void b() {
        this.b.c();
        synchronized (this.a) {
            Iterator<iz4> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().a();
                it.remove();
            }
        }
    }

    public String d() {
        return this.f10684c;
    }

    public List<Integer> e() {
        return this.b.g();
    }

    public void f(String str, List<n97> list, b bVar) {
        if (bVar != null) {
            synchronized (this.a) {
                this.a.add(new iz4(list, bVar));
                this.f10684c = str;
            }
        }
        this.b.e(list);
    }

    public dt4() {
        this.a = new LinkedList<>();
        this.b = new t97(this, 1);
    }
}
