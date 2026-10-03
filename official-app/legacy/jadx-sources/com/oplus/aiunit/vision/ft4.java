package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* JADX INFO: loaded from: classes13.dex */
public interface ft4<T> {

    public interface a<T> {
        void d(@Nullable T t);

        void e(@NonNull Exception exc);
    }

    @NonNull
    Class<T> a();

    void b();

    @NonNull
    DataSource c();

    void cancel();

    void f(@NonNull Priority priority, @NonNull a<? super T> aVar);
}
