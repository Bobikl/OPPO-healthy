package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface g1a {
    boolean a(@NonNull e1a e1aVar, @Nullable String str);

    void b(@NonNull e1a e1aVar, @NonNull int i, @NonNull String str, @NonNull String str2, boolean z);

    default void c(@NonNull e1a e1aVar, @Nullable Bitmap bitmap) {
        m7b.i("onReceivedIcon", "");
    }

    void d(@NonNull e1a e1aVar, @NonNull String str);

    void e(@NonNull e1a e1aVar, @NonNull String str, @NonNull Bitmap bitmap);

    void f(@NonNull e1a e1aVar, @NonNull String str);

    default void g(@NonNull e1a e1aVar, @Nullable String str) {
        m7b.i("onReceivedTitle", str + "");
    }

    default void h(@NonNull e1a e1aVar, int i) {
        m7b.i("onProgressChanged", i + "");
    }

    void i(@NonNull e1a e1aVar, @NonNull String str);
}
