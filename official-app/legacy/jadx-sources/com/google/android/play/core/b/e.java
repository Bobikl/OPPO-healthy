package com.google.android.play.core.b;

import androidx.annotation.NonNull;
import com.google.android.play.core.tasks.OnCompleteListener;
import com.google.android.play.core.tasks.OnFailureListener;
import com.google.android.play.core.tasks.OnSuccessListener;
import com.google.android.play.core.tasks.Task;
import com.oplus.oms.split.full.core.tasks.OplusRuntimeExecutionException;
import com.oplus.oms.split.full.core.tasks.OplusTask;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes14.dex */
public class e<T> extends Task<T> {

    @NonNull
    public final OplusTask<T> a;

    public e(@NonNull OplusTask<T> oplusTask) {
        this.a = oplusTask;
    }

    @Override // com.google.android.play.core.tasks.Task
    @NonNull
    public Task<T> addOnCompleteListener(@NonNull OnCompleteListener<T> onCompleteListener) {
        this.a.addOnCompleteListener(new b(this, onCompleteListener));
        return this;
    }

    @Override // com.google.android.play.core.tasks.Task
    @NonNull
    public Task<T> addOnFailureListener(@NonNull Executor executor, @NonNull OnFailureListener onFailureListener) {
        this.a.addOnFailureListener(executor, new c(onFailureListener));
        return this;
    }

    @Override // com.google.android.play.core.tasks.Task
    @NonNull
    public Task<T> addOnSuccessListener(@NonNull Executor executor, @NonNull OnSuccessListener<? super T> onSuccessListener) {
        this.a.addOnSuccessListener(executor, new d(onSuccessListener));
        return this;
    }

    @Override // com.google.android.play.core.tasks.Task
    @NonNull
    public Exception getException() {
        return a.a(this.a.getException());
    }

    @Override // com.google.android.play.core.tasks.Task
    @NonNull
    public T getResult() {
        try {
            return this.a.getResult();
        } catch (OplusRuntimeExecutionException e2) {
            throw a.a((RuntimeException) e2);
        }
    }

    @Override // com.google.android.play.core.tasks.Task
    public boolean isComplete() {
        return this.a.isComplete();
    }

    @Override // com.google.android.play.core.tasks.Task
    public boolean isSuccessful() {
        return this.a.isSuccessful();
    }

    @Override // com.google.android.play.core.tasks.Task
    @NonNull
    public Task<T> addOnCompleteListener(@NonNull Executor executor, @NonNull OnCompleteListener<T> onCompleteListener) {
        this.a.addOnCompleteListener(executor, new b(this, onCompleteListener));
        return this;
    }

    @Override // com.google.android.play.core.tasks.Task
    @NonNull
    public Task<T> addOnFailureListener(@NonNull OnFailureListener onFailureListener) {
        this.a.addOnFailureListener(new c(onFailureListener));
        return this;
    }

    @Override // com.google.android.play.core.tasks.Task
    @NonNull
    public Task<T> addOnSuccessListener(@NonNull OnSuccessListener<? super T> onSuccessListener) {
        this.a.addOnSuccessListener(new d(onSuccessListener));
        return this;
    }

    @Override // com.google.android.play.core.tasks.Task
    @NonNull
    public <X extends Throwable> T getResult(Class<X> cls) throws Throwable {
        return this.a.getResult(cls);
    }
}
