package com.oplus.health.apiprovider;

import android.os.IBinder;
import android.os.RemoteException;
import com.oplus.aiunit.vision.a7b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public class a<K, V> {
    public final b<V> a;
    public final Map<K, a<K, V>.C0965a> b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.oplus.health.apiprovider.a$a, reason: collision with other inner class name */
    public class C0965a implements IBinder.DeathRecipient {
        public final K a;
        public final V b;

        public C0965a(K k, V v) {
            this.a = k;
            this.b = v;
            try {
                a.this.a.a(v).linkToDeath(this, 0);
            } catch (RemoteException e2) {
                a7b.m("BinderMap", "linkToDeath: exception " + e2);
            }
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            a.this.b.remove(this.a);
            a.this.a.a(this.b).unlinkToDeath(this, 0);
        }
    }

    public interface b<T> {
        IBinder a(T t);
    }

    public a(b<V> bVar) {
        this.a = bVar;
    }

    public boolean c(K k) {
        return this.b.containsKey(k);
    }

    public V d(K k) {
        a<K, V>.C0965a c0965a = this.b.get(k);
        if (c0965a != null) {
            return (V) c0965a.b;
        }
        return null;
    }

    public void e(Consumer<K> consumer) {
        this.b.keySet().forEach(consumer);
    }

    public void f(K k, V v) {
        this.b.put(k, new C0965a(k, v));
    }

    public void g(K k) {
        this.b.remove(k);
    }

    public int h() {
        return this.b.size();
    }
}
