package com.google.android.play.core.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes14.dex */
public abstract class Task<T> {
    @NonNull
    public abstract Task<T> addOnCompleteListener(@NonNull OnCompleteListener<T> onCompleteListener);

    @NonNull
    public abstract Task<T> addOnCompleteListener(@NonNull Executor executor, @NonNull OnCompleteListener<T> onCompleteListener);

    @NonNull
    public abstract Task<T> addOnFailureListener(@NonNull OnFailureListener onFailureListener);

    @NonNull
    public abstract Task<T> addOnFailureListener(@NonNull Executor executor, @NonNull OnFailureListener onFailureListener);

    @NonNull
    public abstract Task<T> addOnSuccessListener(@NonNull OnSuccessListener<? super T> onSuccessListener);

    @NonNull
    public abstract Task<T> addOnSuccessListener(@NonNull Executor executor, @NonNull OnSuccessListener<? super T> onSuccessListener);

    @NonNull
    public abstract Exception getException();

    @NonNull
    public abstract T getResult();

    @NonNull
    public abstract <X extends Throwable> T getResult(Class<X> cls) throws Throwable;

    public abstract boolean isComplete();

    public abstract boolean isSuccessful();
}
