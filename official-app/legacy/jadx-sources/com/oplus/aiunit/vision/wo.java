package com.oplus.aiunit.vision;

import android.app.Activity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0000¨\u0006\u0005"}, d2 = {"Landroid/app/Activity;", "Lcom/oplus/aiunit/vision/l7k;", "b", "", "a", "obus-sdk_release"}, k = 2, mv = {1, 7, 1})
public final class wo {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final String a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        if (activity instanceof k7k) {
            String strB = ((k7k) activity).b();
            Intrinsics.checkNotNullExpressionValue(strB, "{\n        this.screenName\n    }");
            return strB;
        }
        String name = activity.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "{\n        this.javaClass.name\n    }");
        return name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final l7k b(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        if (activity instanceof k7k) {
            return ((k7k) activity).a();
        }
        return null;
    }
}
