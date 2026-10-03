package com.oplus.deepthinker.sdk.app.api;

import com.oplus.aiunit.vision.loj;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventCallback;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0004R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/api/ApiCallBack;", "TResult", "Lcom/oplus/deepthinker/sdk/app/aidl/eventfountain/EventCallback;", "Lcom/oplus/aiunit/vision/loj;", "task", "", "setTask$com_oplus_deepthinker_sdk_release", "(Lcom/oplus/aiunit/vision/loj;)V", "setTask", "result", "onSuccess", "(Ljava/lang/Object;)V", "", "code", "", "msg", "onFailure", "Ljava/util/concurrent/locks/ReentrantLock;", "lock$delegate", "Lkotlin/Lazy;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Lcom/oplus/aiunit/vision/loj;", "<init>", "()V", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
public abstract class ApiCallBack<TResult> extends EventCallback {

    /* JADX INFO: renamed from: lock$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy lock = LazyKt__LazyJVMKt.lazy(new Function0<ReentrantLock>() { // from class: com.oplus.deepthinker.sdk.app.api.ApiCallBack$lock$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final ReentrantLock invoke() {
            return new ReentrantLock();
        }
    });

    @Nullable
    private volatile loj<TResult> task;

    private final ReentrantLock getLock() {
        return (ReentrantLock) this.lock.getValue();
    }

    public final void onFailure(int code, @Nullable String msg) {
        getLock().lock();
        try {
            loj<TResult> lojVar = this.task;
            if (lojVar != null) {
                lojVar.a(code, msg);
            }
            this.task = null;
        } finally {
            getLock().unlock();
        }
    }

    public final void onSuccess(TResult result) {
        getLock().lock();
        try {
            loj<TResult> lojVar = this.task;
            if (lojVar != null) {
                lojVar.b(result);
            }
            this.task = null;
        } finally {
            getLock().unlock();
        }
    }

    public final void setTask$com_oplus_deepthinker_sdk_release(@NotNull loj<TResult> task) {
        Intrinsics.checkNotNullParameter(task, "task");
        getLock().lock();
        try {
            this.task = task;
        } finally {
            getLock().unlock();
        }
    }
}
