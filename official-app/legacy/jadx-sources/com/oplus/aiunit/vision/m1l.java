package com.oplus.aiunit.vision;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$integer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@RequiresApi(21)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J(\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u0016\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/m1l;", "", "Landroid/view/View;", "view", "", "a", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "c", "", "elevation", "b", "", "[I", "STATE_LIST_ANIM_ATTRS", "<init>", "()V", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class m1l {

    @NotNull
    public static final m1l INSTANCE = new m1l();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final int[] STATE_LIST_ANIM_ATTRS = {R.attr.stateListAnimator};

    public final void a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    public final void b(@NotNull View view, float elevation) {
        Intrinsics.checkNotNullParameter(view, "view");
        int integer = view.getResources().getInteger(R$integer.NXcolorAppBarElevationAnimDuration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j2 = integer;
        stateListAnimator.addState(new int[]{R.attr.enabled, R$attr.NXcolorStateCollapsible, -R$attr.NXcolorStateCollapsed}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j2));
        stateListAnimator.addState(new int[]{R.attr.enabled}, ObjectAnimator.ofFloat(view, "elevation", elevation).setDuration(j2));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    public final void c(@NotNull View view, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, STATE_LIST_ANIM_ATTRS, defStyleAttr, defStyleRes);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…efStyleAttr, defStyleRes)");
        try {
            if (typedArrayObtainStyledAttributes.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, typedArrayObtainStyledAttributes.getResourceId(0, 0)));
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
