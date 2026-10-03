package com.oplus.statistics.strategy;

import android.os.SystemClock;
import android.util.LruCache;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.oplus.statistics.util.LogUtil;
import com.oplus.statistics.util.Supplier;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class RequestFireWall {
    public final int a;
    public final long b;
    public final LruCache<String, Queue<Long>> c;

    public static class Builder {
        public final int a;
        public final long b;

        public Builder(@IntRange(from = 0) int i, @IntRange(from = 0) long j) {
            this.a = Math.max(i, 0);
            this.b = Math.max(j, 0L);
        }

        public RequestFireWall build() {
            return new RequestFireWall(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String d(String str, long j) {
        return "Chatty!!! Allow " + this.a + "/" + this.b + "ms, but " + str + " request " + j + " in the recent period.";
    }

    public final long b(@NonNull Queue<Long> queue, long j) {
        Long lPeek = queue.peek();
        while (lPeek != null && lPeek.longValue() < j - this.b) {
            queue.poll();
            lPeek = queue.peek();
        }
        return queue.size();
    }

    @NonNull
    public final Queue<Long> c(String str) {
        Queue<Long> queue = this.c.get(str);
        if (queue != null) {
            return queue;
        }
        LinkedList linkedList = new LinkedList();
        this.c.put(str, linkedList);
        return linkedList;
    }

    public boolean handleRequest(final String str) {
        Queue<Long> queueC = c(str);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        queueC.add(Long.valueOf(jElapsedRealtime));
        final long jB = b(queueC, jElapsedRealtime);
        boolean z = jB <= ((long) this.a);
        if (!z && jB % ((long) 10) == 1) {
            LogUtil.w("FireWall", new Supplier() { // from class: com.oplus.aiunit.vision.rtf
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
        this.c = new LruCache<>(100);
    }
}
