package com.heytap.sporthealth.blib.helper;

import androidx.constraintlayout.widget.ConstraintLayout;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class ViewDsl$constraintLayoutParam$1 extends Lambda implements Function1<ConstraintLayout.LayoutParams, Unit> {
    public static final ViewDsl$constraintLayoutParam$1 INSTANCE = new ViewDsl$constraintLayoutParam$1();

    public ViewDsl$constraintLayoutParam$1() {
        super(1);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ConstraintLayout.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(layoutParams, "$this$null");
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstraintLayout.LayoutParams layoutParams) {
        invoke2(layoutParams);
        return Unit.INSTANCE;
    }
}
