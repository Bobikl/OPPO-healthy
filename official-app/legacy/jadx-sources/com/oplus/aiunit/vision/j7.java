package com.oplus.aiunit.vision;

import com.oplus.accountsdk.base.account.beans.AcApiResponse;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes6.dex */
public class j7 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final ConcurrentLinkedQueue<la> b = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantReadWriteLock f12777c;
    public final ReentrantReadWriteLock.ReadLock d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ReentrantReadWriteLock.WriteLock f12778e;

    public interface a<T> {
        void a(c8<AcApiResponse<T>> c8Var);
    }

    public j7() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f12777c = reentrantReadWriteLock;
        this.d = reentrantReadWriteLock.readLock();
        this.f12778e = reentrantReadWriteLock.writeLock();
    }

    public static /* synthetic */ void d(c8 c8Var, Object obj) {
        c8Var.call((AcApiResponse) obj);
    }

    public static /* synthetic */ void e(String str, la laVar, AcApiResponse acApiResponse) {
        AcLogUtil.i("AcApiSchedulerHelper", "broadcast result ", str);
        laVar.a().call(acApiResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(final AcApiResponse acApiResponse) {
        this.f12778e.lock();
        while (true) {
            try {
                final la laVarPoll = this.b.poll();
                if (laVarPoll == null) {
                    this.a.set(false);
                    this.f12778e.unlock();
                    return;
                } else {
                    final String strB = laVarPoll.b();
                    zj.a().g(new Runnable() { // from class: com.oplus.aiunit.vision.i7
                        @Override // java.lang.Runnable
                        public final void run() {
                            j7.e(strB, laVarPoll, acApiResponse);
                        }
                    });
                }
            } catch (Throwable th) {
                this.a.set(false);
                this.f12778e.unlock();
                throw th;
            }
        }
    }

    public <T> void g(String str, final c8<AcApiResponse<T>> c8Var, a<T> aVar) {
        la laVar = new la(str, new c8() { // from class: com.oplus.aiunit.vision.g7
            @Override // com.oplus.aiunit.vision.c8
            public final void call(Object obj) {
                j7.d(c8Var, obj);
            }
        });
        this.d.lock();
        try {
            this.b.add(laVar);
            if (!this.a.compareAndSet(false, true)) {
                AcLogUtil.i("AcApiSchedulerHelper", " api call in-flight, queued. size: " + this.b.size(), str);
                this.d.unlock();
                return;
            }
            this.d.unlock();
            AcLogUtil.i("AcApiSchedulerHelper", " executing api task " + this, str);
            aVar.a(new c8() { // from class: com.oplus.aiunit.vision.h7
                @Override // com.oplus.aiunit.vision.c8
                public final void call(Object obj) {
                    this.a.f((AcApiResponse) obj);
                }
            });
        } catch (Throwable th) {
            this.d.unlock();
            throw th;
        }
    }
}
