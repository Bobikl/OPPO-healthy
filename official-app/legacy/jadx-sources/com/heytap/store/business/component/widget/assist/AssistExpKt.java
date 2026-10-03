package com.heytap.store.business.component.widget.assist;

import android.content.Context;
import com.heytap.store.base.core.util.DisplayUtil;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"getAssistCardWidthChangeValue", "", "value", "", "context", "Landroid/content/Context;", "widget_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class AssistExpKt {
    public static final int getAssistCardWidthChangeValue(float f, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) (((DisplayUtil.getScreenWidth(context) - DisplayUtil.dip2px(56.0f)) * f) / 304);
    }
}
