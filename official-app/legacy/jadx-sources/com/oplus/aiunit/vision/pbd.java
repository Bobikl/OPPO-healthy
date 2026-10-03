package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.observers.BlockingObserver;
import io.reactivex.rxjava3.internal.observers.LambdaObserver;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes10.dex */
public final class pbd {
    public static <T> void a(jdd<? extends T> jddVar) {
        qi1 qi1Var = new qi1();
        LambdaObserver lambdaObserver = new LambdaObserver(Functions.e(), qi1Var, qi1Var, Functions.e());
        jddVar.subscribe(lambdaObserver);
        oi1.a(qi1Var, lambdaObserver);
        Throwable th = qi1Var.i;
        if (th != null) {
            throw ExceptionHelper.h(th);
        }
    }

    public static <T> void b(jdd<? extends T> jddVar, aed<? super T> aedVar) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        BlockingObserver blockingObserver = new BlockingObserver(linkedBlockingQueue);
        aedVar.onSubscribe(blockingObserver);
        jddVar.subscribe(blockingObserver);
        while (!blockingObserver.isDisposed()) {
            Object objPoll = linkedBlockingQueue.poll();
            if (objPoll == null) {
                try {
                    objPoll = linkedBlockingQueue.take();
                } catch (InterruptedException e2) {
                    blockingObserver.dispose();
                    aedVar.onError(e2);
                    return;
                }
            }
            if (blockingObserver.isDisposed() || objPoll == BlockingObserver.TERMINATED || NotificationLite.acceptFull(objPoll, aedVar)) {
                return;
            }
        }
    }
}
