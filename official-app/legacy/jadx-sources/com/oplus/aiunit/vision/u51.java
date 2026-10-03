package com.oplus.aiunit.vision;

import com.oplus.aiunit.vision.nne;
import java.util.Queue;

/* JADX INFO: loaded from: classes13.dex */
public abstract class u51<T extends nne> {
    public final Queue<T> a = uqk.g(20);

    public abstract T a();

    public T b() {
        T tPoll = this.a.poll();
        return tPoll == null ? (T) a() : tPoll;
    }

    public void c(T t) {
        if (this.a.size() < 20) {
            this.a.offer(t);
        }
    }
}
