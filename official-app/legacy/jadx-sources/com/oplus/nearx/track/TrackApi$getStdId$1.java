package com.oplus.nearx.track;

import com.oplus.aiunit.vision.StdId;
import com.oplus.nearx.track.internal.common.content.GlobalConfigHelper;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
final class TrackApi$getStdId$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function1<StdId, Unit> $callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TrackApi$getStdId$1(Function1<? super StdId, Unit> function1) {
        super(0);
        this.$callback = function1;
    }

    @Override // p010kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$callback.invoke(GlobalConfigHelper.INSTANCE.a().c());
    }
}
