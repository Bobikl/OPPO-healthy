package com.heytap.retry;

import com.oplus.aiunit.vision.vvf;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/heytap/retry/RetryEntity;", "invoke"}, k = 3, mv = {1, 4, 0})
final class RetryLogic$setCloudConfigCtrl$2 extends Lambda implements Function1<List<? extends RetryEntity>, Unit> {
    final /* synthetic */ vvf this$0;

    public RetryLogic$setCloudConfigCtrl$2(vvf vvfVar) {
        super(1);
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends RetryEntity> list) {
        invoke2((List<RetryEntity>) list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull List<RetryEntity> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        vvf.a(null, it);
    }
}
