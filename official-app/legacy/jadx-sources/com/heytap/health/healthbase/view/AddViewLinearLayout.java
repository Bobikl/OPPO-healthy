package com.heytap.health.healthbase.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.github.mikephil.charting.utils.Utils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\u001d\b\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0018\u0010\u001cB%\b\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u001eJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002J\b\u0010\r\u001a\u00020\u000bH\u0002J0\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/heytap/health/healthbase/view/AddViewLinearLayout;", "Landroid/widget/LinearLayout;", "Landroid/view/View;", "child", "", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "", "addViewInLayout", "view", "", "a", "c", "", "marginTop", "marginStart", "marginEnd", "marginBottom", "b", "i", "I", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "health_base_release"}, k = 1, mv = {1, 8, 0})
public final class AddViewLinearLayout extends LinearLayout {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int index;

    public AddViewLinearLayout(@Nullable Context context) {
        super(context);
        c();
    }

    public final void a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        b(view, 0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(@NotNull View child, int index, @NotNull ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(params, "params");
        return super.addViewInLayout(child, index, params);
    }

    public final void b(View view, float marginTop, float marginStart, float marginEnd, float marginBottom) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = (int) Utils.convertDpToPixel(marginTop);
        layoutParams.setMarginStart((int) Utils.convertDpToPixel(marginStart));
        layoutParams.setMarginEnd((int) Utils.convertDpToPixel(marginEnd));
        layoutParams.bottomMargin = (int) Utils.convertDpToPixel(marginBottom);
        addViewInLayout(view, this.index, layoutParams);
        this.index++;
    }

    public final void c() {
        this.index = 0;
    }

    public AddViewLinearLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public AddViewLinearLayout(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
    }
}
