package com.heytap.health.device.tab.itemview;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.device.tab.itemview.CouponItem", f = "CouponItem.kt", i = {1}, l = {97, 117, 123, 125}, m = "updateCouponData", n = {"this"}, s = {"L$0"})
public final class CouponItem$updateCouponData$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CouponItem this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CouponItem$updateCouponData$1(CouponItem couponItem, Continuation<? super CouponItem$updateCouponData$1> continuation) {
        super(continuation);
        this.this$0 = couponItem;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.T0(this);
    }
}
