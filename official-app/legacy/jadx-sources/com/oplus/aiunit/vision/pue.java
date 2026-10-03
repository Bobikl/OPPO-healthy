package com.oplus.aiunit.vision;

import com.oplus.wearable.linkservice.sdk.common.Priority;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class pue {
    public final Object a = new Object();
    public final List<br0> b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<br0> f15504c = new ArrayList();
    public final List<br0> d = new ArrayList();

    public void a(br0 br0Var) {
        if (br0Var == null) {
            return;
        }
        synchronized (this.a) {
            if (br0Var.d() == Priority.PRIORITY_MIDDLE.getPriority()) {
                this.f15504c.add(br0Var);
            } else if (br0Var.d() == Priority.PRIORITY_HIGH.getPriority()) {
                this.b.add(br0Var);
            } else if (br0Var.d() == Priority.PRIORITY_LOW.getPriority()) {
                this.d.add(br0Var);
            } else {
                wil.b("PriorityBTCommandQueue", "add: unknown priority " + br0Var.d());
                this.f15504c.add(br0Var);
            }
        }
    }

    public void b() {
        synchronized (this.a) {
            this.b.clear();
            this.f15504c.clear();
            this.d.clear();
        }
    }

    public List<br0> c() {
        ArrayList arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList();
            arrayList.addAll(this.b);
            arrayList.addAll(this.f15504c);
            arrayList.addAll(this.d);
        }
        return arrayList;
    }

    public br0 d() {
        synchronized (this.a) {
            if (this.b.size() > 0) {
                return this.b.get(0);
            }
            if (this.f15504c.size() > 0) {
                return this.f15504c.get(0);
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

    public void f(br0 br0Var) {
        synchronized (this.a) {
            this.b.remove(br0Var);
            this.f15504c.remove(br0Var);
            this.d.remove(br0Var);
        }
    }

    public int g() {
        int size;
        synchronized (this.a) {
            size = this.b.size() + this.f15504c.size() + this.d.size();
        }
        return size;
    }
}
