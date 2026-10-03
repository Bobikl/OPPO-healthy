package com.oplus.aiunit.vision;

import android.content.Context;
import android.widget.Toast;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class hxm {

    @Nullable
    public static Toast feedbacka;

    @JvmStatic
    public static final void a(@NotNull Context context, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Toast toast = feedbacka;
        if (toast != null) {
            toast.cancel();
        }
        Toast toastMakeText = Toast.makeText(context.getApplicationContext(), str, 0);
        feedbacka = toastMakeText;
        if (toastMakeText != null) {
            toastMakeText.show();
        }
    }
}
