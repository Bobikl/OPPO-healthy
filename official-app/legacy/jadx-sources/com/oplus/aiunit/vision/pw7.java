package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.Resources;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/pw7;", "", "Landroid/content/Context;", "context", "", "c", "a", ParserTag.TAG_TEXT_SIZE, "b", "<init>", "()V", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public final class pw7 {

    @NotNull
    public static final pw7 INSTANCE = new pw7();

    public final float a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return b(context, 12.0f);
    }

    public final float b(@Nullable Context context, float textSize) {
        if (context == null) {
            return textSize;
        }
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        return fg2.a(textSize, resources.getConfiguration().fontScale, 4);
    }

    public final float c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return b(context, 14.0f);
    }
}
