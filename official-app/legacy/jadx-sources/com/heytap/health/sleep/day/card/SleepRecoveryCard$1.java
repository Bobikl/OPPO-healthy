package com.heytap.health.sleep.day.card;

import com.oplus.aiunit.vision.pmh;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Float;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class SleepRecoveryCard$1 extends Lambda implements Function1<Float, Unit> {
    final /* synthetic */ pmh this$0;

    public SleepRecoveryCard$1(pmh pmhVar) {
        super(1);
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
        invoke2(f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Float it) {
        Intrinsics.checkNotNullExpressionValue(it, "it");
        pmh.K(null, it.floatValue());
    }
}
