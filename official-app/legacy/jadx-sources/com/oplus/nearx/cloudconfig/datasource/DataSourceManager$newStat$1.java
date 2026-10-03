package com.oplus.nearx.cloudconfig.datasource;

import com.oplus.aiunit.vision.rw4;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 16})
final class DataSourceManager$newStat$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ rw4 this$0;

    public DataSourceManager$newStat$1(rw4 rw4Var) {
        super(1);
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String it) {
        Intrinsics.checkParameterIsNotNull(it, "it");
        rw4.c(null, it, "TASK");
    }
}
