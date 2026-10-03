package com.oplus.aiunit.vision;

import com.oplus.aiunit.vision.p6;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class q6<T, Q extends p6<T>> {
    public final String a;
    public final a6<T, ?> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f15638c;
    public final Map<Long, WeakReference<Q>> d = new HashMap();

    public q6(a6<T, ?> a6Var, String str, String[] strArr) {
        this.b = a6Var;
        this.a = str;
        this.f15638c = strArr;
    }

    public abstract Q a();

    public Q b() {
        Q q;
        long id = Thread.currentThread().getId();
        synchronized (this.d) {
            WeakReference<Q> weakReference = this.d.get(Long.valueOf(id));
            q = weakReference != null ? weakReference.get() : null;
            if (q == null) {
                d();
                q = (Q) a();
                this.d.put(Long.valueOf(id), new WeakReference<>(q));
            } else {
                String[] strArr = this.f15638c;
                System.arraycopy(strArr, 0, q.d, 0, strArr.length);
            }
        }
        return q;
    }

    public Q c(Q q) {
        if (Thread.currentThread() != q.f15207e) {
            return (Q) b();
        }
        String[] strArr = this.f15638c;
        System.arraycopy(strArr, 0, q.d, 0, strArr.length);
        return q;
    }

    public void d() {
        synchronized (this.d) {
            Iterator<Map.Entry<Long, WeakReference<Q>>> it = this.d.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue().get() == null) {
                    it.remove();
                }
            }
        }
    }
}
