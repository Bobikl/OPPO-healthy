package com.oplus.aiunit.vision;

import com.oplus.wearable.linkservice.sdk.common.Priority;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class zwe {
    public final Object a = new Object();
    public final List<sr0> b = new ArrayList();
    public final List<sr0> c = new ArrayList();
    public final List<sr0> d = new ArrayList();

    public void a(sr0 sr0Var) {
        if (sr0Var == null) {
            return;
        }
        synchronized (this.a) {
            if (sr0Var.d() == Priority.PRIORITY_MIDDLE.getPriority()) {
                this.c.add(sr0Var);
            } else if (sr0Var.d() == Priority.PRIORITY_HIGH.getPriority()) {
                this.b.add(sr0Var);
            } else if (sr0Var.d() == Priority.PRIORITY_LOW.getPriority()) {
                this.d.add(sr0Var);
            } else {
                uml.b("PriorityBTCommandQueue", "add: unknown priority " + sr0Var.d());
                this.c.add(sr0Var);
            }
        }
    }

    public void b() {
        synchronized (this.a) {
            this.b.clear();
            this.c.clear();
            this.d.clear();
        }
    }

    public List<sr0> c() {
        ArrayList arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList();
            arrayList.addAll(this.b);
            arrayList.addAll(this.c);
            arrayList.addAll(this.d);
        }
        return arrayList;
    }

    public sr0 d() {
        synchronized (this.a) {
            if (this.b.size() > 0) {
                return this.b.get(0);
            }
            if (this.c.size() > 0) {
                return this.c.get(0);
            }
            if (this.d.size() <= 0) {
                return null;
            }
            return this.d.get(0);
        }
    }

    public boolean e() {
        return g() == 0;
    }

    public void f(sr0 sr0Var) {
        synchronized (this.a) {
            this.b.remove(sr0Var);
            this.c.remove(sr0Var);
            this.d.remove(sr0Var);
        }
    }

    public int g() {
        int size;
        synchronized (this.a) {
            size = this.b.size() + this.c.size() + this.d.size();
        }
        return size;
    }
}
