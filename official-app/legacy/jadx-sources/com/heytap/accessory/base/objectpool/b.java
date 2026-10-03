package com.heytap.accessory.base.objectpool;

import android.util.Log;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes14.dex */
public abstract class b<T> {
    public String a = "ObjectPool";
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c<T> f2461c;
    public Queue<T> d;

    public b(int i, c<T> cVar) {
        if (i <= 0) {
            throw new IllegalArgumentException("Invalid max pool size:" + i);
        }
        if (cVar == null) {
            throw new IllegalArgumentException("Invalid Object factory");
        }
        this.b = i;
        this.f2461c = cVar;
        this.d = new ConcurrentLinkedQueue();
    }

    public synchronized T a() {
        Queue<T> queue;
        queue = this.d;
        if (queue == null) {
            throw new IllegalArgumentException("Object pool Not initialized");
        }
        return queue.isEmpty() ? this.f2461c.a() : this.d.remove();
    }

    public synchronized void a(T t) {
        Queue<T> queue = this.d;
        if (queue != null) {
            if (queue.size() == this.b) {
                Log.w(this.a, "Pool is full discarding object for garbage collection!");
            } else {
                this.d.add(t);
            }
        } else {
            throw new IllegalArgumentException("Object pool Not initialized");
        }
    }
}
