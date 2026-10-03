package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u0016\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0007"}, d2 = {"Landroid/content/Context;", "context", "", "b", "", "dpValue", "a", "sfxplayer_debug"}, k = 2, mv = {1, 7, 1})
public final class wrk {
    public static final int a(@NotNull Context context, float f) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static final int b(@Nullable Context context) {
        Resources resources;
        DisplayMetrics displayMetrics;
        if (context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return 0;
        }
        return displayMetrics.widthPixels;
    }
}
