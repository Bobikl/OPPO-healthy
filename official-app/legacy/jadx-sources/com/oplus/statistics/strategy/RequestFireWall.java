package com.oplus.statistics.strategy;

import android.os.SystemClock;
import android.util.LruCache;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.oplus.statistics.util.LogUtil;
import com.oplus.statistics.util.Supplier;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes8.dex */
public class RequestFireWall {
    public final int a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LruCache<String, Queue<Long>> f20123c;

    public static class Builder {
        public final int a;
        public final long b;

        public Builder(@IntRange(from = 0) int i, @IntRange(from = 0) long j2) {
            this.a = Math.max(i, 0);
            this.b = Math.max(j2, 0L);
        }

        public RequestFireWall build() {
            return new RequestFireWall(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String d(String str, long j2) {
        return "Chatty!!! Allow " + this.a + "/" + this.b + "ms, but " + str + " request " + j2 + " in the recent period.";
    }

    public final long b(@NonNull Queue<Long> queue, long j2) {
        Long lPeek = queue.peek();
        while (lPeek != null && lPeek.longValue() < j2 - this.b) {
            queue.poll();
            lPeek = queue.peek();
        }
        return queue.size();
    }

    @NonNull
    public final Queue<Long> c(String str) {
        Queue<Long> queue = this.f20123c.get(str);
        if (queue != null) {
            return queue;
        }
        LinkedList linkedList = new LinkedList();
        this.f20123c.put(str, linkedList);
        return linkedList;
    }

    public boolean handleRequest(final String str) {
        Queue<Long> queueC = c(str);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        queueC.add(Long.valueOf(jElapsedRealtime));
        final long jB = b(queueC, jElapsedRealtime);
        boolean z = jB <= ((long) this.a);
        if (!z && jB % ((long) 10) == 1) {
            LogUtil.w("FireWall", new Supplier() { // from class: com.oplus.aiunit.vision.pqf
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return this.a.d(str, jB);
                }
            });
        }
        return z;
    }

    public RequestFireWall(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.f20123c = new LruCache<>(100);
    }
}
