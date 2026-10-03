package com.oplus.nearx.cloudconfig;

import com.oplus.aiunit.vision.ot3;
import com.oplus.aiunit.vision.yh3;
import com.oplus.smartenginehelper.entity.VideoEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/oplus/aiunit/vision/ot3;", "<anonymous parameter 0>", "Lkotlin/Function0;", "", VideoEntity.STATE_LISTENER, "invoke", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
final class CloudConfigCtrl$init$1$1 extends Lambda implements Function2<List<? extends ot3>, Function0<? extends Unit>, Unit> {
    final /* synthetic */ yh3 this$0;

    public CloudConfigCtrl$init$1$1(yh3 yh3Var) {
        super(2);
    }

    @Override // p010kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends ot3> list, Function0<? extends Unit> function0) {
        invoke2((List<ot3>) list, (Function0<Unit>) function0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull List<ot3> list, @NotNull Function0<Unit> stateListener) {
        Intrinsics.checkParameterIsNotNull(list, "<anonymous parameter 0>");
        Intrinsics.checkParameterIsNotNull(stateListener, "stateListener");
        throw null;
    }
}
