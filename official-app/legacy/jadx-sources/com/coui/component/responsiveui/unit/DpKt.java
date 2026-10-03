package com.coui.component.responsiveui.unit;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"dp", "Lcom/coui/component/responsiveui/unit/Dp;", "", "getDp", "(I)Lcom/coui/component/responsiveui/unit/Dp;", "pixel2Dp", "context", "Landroid/content/Context;", "coui-support-responsiveui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DpKt {
    @NotNull
    public static final Dp getDp(int i) {
        return new Dp(i);
    }

    @NotNull
    public static final Dp pixel2Dp(int i, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new Dp(i / context.getResources().getDisplayMetrics().density);
    }
}
