package com.coui.appcompat.scanview;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class ScanViewRotateHelper$updateTorchTipGroupLp$1$torchTipMaxWidth$1 extends FunctionReferenceImpl implements Function1<Integer, Integer> {
    public ScanViewRotateHelper$updateTorchTipGroupLp$1$torchTipMaxWidth$1(Object obj) {
        super(1, obj, ScanViewRotateHelper.class, "getTorchTipGridNumber", "getTorchTipGridNumber(I)I", 0);
    }

    @NotNull
    public final Integer invoke(int i) {
        return Integer.valueOf(((ScanViewRotateHelper) this.receiver).u(i));
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
        return invoke(num.intValue());
    }
}
