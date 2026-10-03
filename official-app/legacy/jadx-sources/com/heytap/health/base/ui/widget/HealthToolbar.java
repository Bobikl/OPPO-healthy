package com.heytap.health.base.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.coui.appcompat.toolbar.COUIToolbar;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/heytap/health/base/ui/widget/HealthToolbar;", "Lcom/coui/appcompat/toolbar/COUIToolbar;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "init", "", "lib_base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HealthToolbar extends COUIToolbar {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthToolbar(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        init();
    }

    public final void init() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthToolbar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        init();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthToolbar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        init();
    }
}
