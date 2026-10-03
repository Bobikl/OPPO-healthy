package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public interface n2a {
    boolean a(@NonNull l2a l2aVar, @Nullable String str);

    void b(@NonNull l2a l2aVar, @NonNull int i, @NonNull String str, @NonNull String str2, boolean z);

    default void c(@NonNull l2a l2aVar, @Nullable Bitmap bitmap) {
        y8b.i("onReceivedIcon", "");
    }

    void d(@NonNull l2a l2aVar, @NonNull String str);

    void e(@NonNull l2a l2aVar, @NonNull String str, @NonNull Bitmap bitmap);

    void f(@NonNull l2a l2aVar, @NonNull String str);

    default void g(@NonNull l2a l2aVar, @Nullable String str) {
        y8b.i("onReceivedTitle", str + "");
    }

    default void h(@NonNull l2a l2aVar, int i) {
        y8b.i("onProgressChanged", i + "");
    }

    void i(@NonNull l2a l2aVar, @NonNull String str);
}
