package com.oplus.aiunit.vision;

import android.widget.FrameLayout;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\nH\u0016J4\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/xdg;", "Lcom/oplus/aiunit/vision/bx9;", "", "layoutWidth", "layoutHeight", "videoWidth", "videoHeight", "Landroid/widget/FrameLayout$LayoutParams;", "layoutParams", "b", "Lkotlin/Pair;", "a", "c", "I", "realWidth", "realHeight", "<init>", "()V", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public final class xdg implements bx9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int realWidth;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int realHeight;

    @Override // com.oplus.aiunit.vision.bx9
    @NotNull
    public Pair<Integer, Integer> a() {
        return new Pair<>(Integer.valueOf(this.realWidth), Integer.valueOf(this.realHeight));
    }

    @Override // com.oplus.aiunit.vision.bx9
    @NotNull
    public FrameLayout.LayoutParams b(int layoutWidth, int layoutHeight, int videoWidth, int videoHeight, @NotNull FrameLayout.LayoutParams layoutParams) {
        Intrinsics.checkParameterIsNotNull(layoutParams, "layoutParams");
        Pair<Integer, Integer> pairC = c(layoutWidth, layoutHeight, videoWidth, videoHeight);
        int iIntValue = pairC.component1().intValue();
        int iIntValue2 = pairC.component2().intValue();
        if (iIntValue <= 0 && iIntValue2 <= 0) {
            return layoutParams;
        }
        this.realWidth = iIntValue;
        this.realHeight = iIntValue2;
        layoutParams.width = iIntValue;
        layoutParams.height = iIntValue2;
        layoutParams.gravity = 17;
        return layoutParams;
    }

    public final Pair<Integer, Integer> c(int layoutWidth, int layoutHeight, int videoWidth, int videoHeight) {
        float f = layoutWidth;
        float f2 = layoutHeight;
        float f3 = videoWidth / videoHeight;
        if (f / f2 > f3) {
            layoutHeight = (int) (f / f3);
        } else {
            layoutWidth = (int) (f3 * f2);
        }
        return new Pair<>(Integer.valueOf(layoutWidth), Integer.valueOf(layoutHeight));
    }
}
