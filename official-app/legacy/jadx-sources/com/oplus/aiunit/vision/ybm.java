package com.oplus.aiunit.vision;

import com.oplus.oms.split.full.core.tasks.OplusOnCompleteListener;
import com.oplus.oms.split.full.core.tasks.OplusOnFailureListener;
import com.oplus.oms.split.full.core.tasks.OplusOnSuccessListener;
import com.oplus.oms.split.full.core.tasks.OplusRuntimeExecutionException;
import com.oplus.oms.split.full.core.tasks.OplusTask;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public class ybm<T> extends OplusTask<T> {
    public final Object a = new Object();
    public final zhm<T> b = new zhm<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Exception f18967c;
    public T d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18968e;

    public final void a() {
        if (!this.f18968e) {
            throw new IllegalStateException("Task is not yet complete");
        }
    }

    @Override // com.oplus.oms.split.full.core.tasks.OplusTask
    public OplusTask<T> addOnCompleteListener(OplusOnCompleteListener<T> oplusOnCompleteListener) {
        return addOnCompleteListener(ct2.b(), oplusOnCompleteListener);
    }

    @Override // com.oplus.oms.split.full.core.tasks.OplusTask
    public OplusTask<T> addOnFailureListener(Executor executor, OplusOnFailureListener oplusOnFailureListener) {
        this.b.a(new lpm(executor, oplusOnFailureListener));
        d();
        return this;
    }

    @Override // com.oplus.oms.split.full.core.tasks.OplusTask
    public OplusTask<T> addOnSuccessListener(Executor executor, OplusOnSuccessListener<? super T> oplusOnSuccessListener) {
        this.b.a(new yrm(executor, oplusOnSuccessListener));
        d();
        return this;
    }

    public boolean b(Exception exc) {
        synchronized (this.a) {
            if (this.f18968e) {
                return false;
            }
            this.f18968e = true;
            this.f18967c = exc;
            this.b.b(this);
            return true;
        }
    }

    public boolean c(T t) {
        synchronized (this.a) {
            if (this.f18968e) {
                return false;
            }
            this.f18968e = true;
            this.d = t;
            this.b.b(this);
            return true;
        }
    }

    public final void d() {
        boolean z;
        synchronized (this.a) {
            z = this.f18968e;
        }
        if (z) {
            this.b.b(this);
        }
    }

    @Override // com.oplus.oms.split.full.core.tasks.OplusTask
    public Exception getException() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f18967c;
        }
        return exc;
    }

    @Override // com.oplus.oms.split.full.core.tasks.OplusTask
    public <X extends Throwable> T getResult(Class<X> cls) throws Throwable {
        return null;
    }

    @Override // com.oplus.oms.split.full.core.tasks.OplusTask
    public boolean isComplete() {
        boolean z;
        synchronized (this.a) {
            z = this.f18968e;
        }
        return z;
    }

    @Override // com.oplus.oms.split.full.core.tasks.OplusTask
    public boolean isSuccessful() {
        boolean z;
        synchronized (this.a) {
            z = this.f18968e && this.f18967c == null;
        }
        return z;
    }

    @Override // com.oplus.oms.split.full.core.tasks.OplusTask
    public OplusTask<T> addOnCompleteListener(Executor executor, OplusOnCompleteListener<T> oplusOnCompleteListener) {
        this.b.a(new slm(executor, oplusOnCompleteListener));
        d();
        return this;
    }

    @Override // com.oplus.oms.split.full.core.tasks.OplusTask
    public T getResult() throws IllegalStateException, OplusRuntimeExecutionException {
        T t;
        synchronized (this.a) {
            a();
            if (this.f18967c != null) {
                throw new OplusRuntimeExecutionException(this.f18967c);
            }
            t = this.d;
        }
        return t;
    }

    @Override // com.oplus.oms.split.full.core.tasks.OplusTask
    public OplusTask<T> addOnFailureListener(OplusOnFailureListener oplusOnFailureListener) {
        return addOnFailureListener(ct2.b(), oplusOnFailureListener);
    }

    @Override // com.oplus.oms.split.full.core.tasks.OplusTask
    public OplusTask<T> addOnSuccessListener(OplusOnSuccessListener<? super T> oplusOnSuccessListener) {
        return addOnSuccessListener(ct2.b(), oplusOnSuccessListener);
    }
}
