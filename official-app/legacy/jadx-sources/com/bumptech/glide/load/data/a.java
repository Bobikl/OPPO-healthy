package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public interface a<T> {

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.a$a, reason: collision with other inner class name */
    public interface InterfaceC0176a<T> {
        @NonNull
        Class<T> a();

        @NonNull
        a<T> b(@NonNull T t);
    }

    void b();

    @NonNull
    T c() throws IOException;
}
