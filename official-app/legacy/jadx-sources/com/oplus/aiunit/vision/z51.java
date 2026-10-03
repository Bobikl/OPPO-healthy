package com.oplus.aiunit.vision;

import androidx.constraintlayout.widget.ConstraintLayout;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u001d\b\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\t\u0010\nR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/z51;", "", "Lkotlin/Function1;", "Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;", "", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "block", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/oplus/aiunit/vision/uua;", "Lcom/oplus/aiunit/vision/vzk;", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class z51 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function1<ConstraintLayout.LayoutParams, Unit> block;

    public /* synthetic */ z51(Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1);
    }

    @NotNull
    public final Function1<ConstraintLayout.LayoutParams, Unit> a() {
        return this.block;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z51(Function1<? super ConstraintLayout.LayoutParams, Unit> function1) {
        this.block = function1;
    }
}
