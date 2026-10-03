package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.TypedArray;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/plc;", "", "Landroid/content/Context;", "context", "", "attrRes", "a", "attr", "defaultColor", "b", "<init>", "()V", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class plc {

    @NotNull
    public static final plc INSTANCE = new plc();

    @JvmStatic
    public static final int a(@NotNull Context context, int attrRes) {
        Intrinsics.checkNotNullParameter(context, "context");
        return b(context, attrRes, 0);
    }

    @JvmStatic
    public static final int b(@NotNull Context context, int attr, int defaultColor) {
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{attr});
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.theme.obtainStyledAttributes(colorAttr)");
        int color = typedArrayObtainStyledAttributes.getColor(0, defaultColor);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }
}
