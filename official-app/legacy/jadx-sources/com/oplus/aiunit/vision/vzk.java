package com.oplus.aiunit.vision;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/vzk;", "Lcom/oplus/aiunit/vision/z51;", "Landroid/view/View;", "b", "Landroid/view/View;", "()Landroid/view/View;", "view", "Lkotlin/Function1;", "Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;", "", "block", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class vzk extends z51 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vzk(@NotNull View view, @NotNull Function1<? super ConstraintLayout.LayoutParams, Unit> block) {
        super(block, null);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(block, "block");
        this.view = view;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final View getView() {
        return this.view;
    }
}
