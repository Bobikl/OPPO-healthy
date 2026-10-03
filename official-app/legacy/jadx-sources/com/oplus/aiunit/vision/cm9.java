package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.IInterface;
import androidx.annotation.NonNull;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes2.dex */
public interface cm9<T extends IInterface> {
    default void a(@NonNull PrintWriter printWriter, String[] strArr) {
    }

    void b(@NonNull Context context);

    void c(@NonNull Context context);

    @NonNull
    T d();
}
