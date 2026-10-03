package com.oplus.aiunit.vision;

import android.os.SystemClock;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes4.dex */
public class qqf {
    public final int a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentMap<String, Queue<Long>> f15909c;

    public static class b {
        public final int a;
        public final long b;

        public b(@IntRange(from = 0) int i, @IntRange(from = 0) long j2) {
            this.a = Math.max(i, 0);
            this.b = Math.max(j2, 0L);
        }

        public qqf c() {
            return new qqf(this);
        }
    }

    public final long a(@NonNull Queue<Long> queue, long j2) {
        Long lPeek = queue.peek();
        while (lPeek != null && lPeek.longValue() < j2 - this.b) {
            queue.poll();
            lPeek = queue.peek();
        }
        return queue.size();
    }

    @NonNull
    public final Queue<Long> b(String str) {
        Queue<Long> queue = this.f15909c.get(str);
        if (queue != null) {
            return queue;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        this.f15909c.put(str, concurrentLinkedQueue);
        return concurrentLinkedQueue;
    }

    public boolean c(String str) {
        Queue<Long> queueB = b(str);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        queueB.add(Long.valueOf(jElapsedRealtime));
        long jA = a(queueB, jElapsedRealtime);
        boolean z = jA <= ((long) this.a);
        if (!z && jA % ((long) 20) == 1) {
            k6k.e().q("RequestFirewall", "Allow " + this.a + "/" + this.b + "ms, but " + str + " request " + jA + " in the recent period.", null, new Object[0]);
        }
        return z;
    }

    public qqf(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.f15909c = new ConcurrentHashMap(100);
    }
}
