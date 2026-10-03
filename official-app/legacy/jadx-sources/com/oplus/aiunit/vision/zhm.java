package com.oplus.aiunit.vision;

import com.oplus.oms.split.full.core.tasks.OplusTask;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes8.dex */
public final class zhm<T> {
    public final Object a = new Object();
    public Queue<wbm<T>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19423c;

    public void a(wbm<T> wbmVar) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(wbmVar);
        }
    }

    public void b(OplusTask<T> oplusTask) {
        wbm<T> wbmVarPoll;
        synchronized (this.a) {
            if (this.b != null && !this.f19423c) {
                this.f19423c = true;
                while (true) {
                    synchronized (this.a) {
                        wbmVarPoll = this.b.poll();
                        if (wbmVarPoll == null) {
                            this.f19423c = false;
                            return;
                        }
                    }
                    wbmVarPoll.a(oplusTask);
                }
            }
        }
    }
}
