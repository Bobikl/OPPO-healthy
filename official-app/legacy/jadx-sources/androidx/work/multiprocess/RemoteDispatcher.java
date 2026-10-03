package androidx.work.multiprocess;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes12.dex */
@SuppressLint({"LambdaLast"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface RemoteDispatcher<T> {
    void execute(@NonNull T t, @NonNull IWorkManagerImplCallback iWorkManagerImplCallback) throws Throwable;
}
