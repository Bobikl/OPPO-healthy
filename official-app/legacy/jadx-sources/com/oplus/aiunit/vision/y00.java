package com.oplus.aiunit.vision;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.heytap.databaseengine.model.UserInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\u0006B\u0013\b\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/y00;", "Lcom/oplus/aiunit/vision/kz0;", "Landroid/view/View;", "view", "", "Landroid/animation/Animator;", "a", "(Landroid/view/View;)[Landroid/animation/Animator;", "", UserInfo.SEX_FEMALE, "mFrom", "<init>", "(F)V", "Companion", "com.github.CymChad.brvah"}, k = 1, mv = {1, 6, 0})
public final class y00 implements kz0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final float mFrom;

    @JvmOverloads
    public y00(float f) {
        this.mFrom = f;
    }

    @Override // com.oplus.aiunit.vision.kz0
    @NotNull
    public Animator[] a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, "alpha", this.mFrom, 1.0f);
        animator.setDuration(300L);
        animator.setInterpolator(new LinearInterpolator());
        Intrinsics.checkNotNullExpressionValue(animator, "animator");
        return new Animator[]{animator};
    }

    public /* synthetic */ y00(float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f);
    }
}
