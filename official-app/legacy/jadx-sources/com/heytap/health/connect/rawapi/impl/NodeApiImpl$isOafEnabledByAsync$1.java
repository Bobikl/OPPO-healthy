package com.heytap.health.connect.rawapi.impl;

import com.heytap.health.base.task.ThreadUtils;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Function1;", "Lkotlin/Result;", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class NodeApiImpl$isOafEnabledByAsync$1 extends Lambda implements Function1<Function1<? super Result<? extends Boolean>, ? extends Unit>, Unit> {
    final /* synthetic */ NodeApiImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeApiImpl$isOafEnabledByAsync$1(NodeApiImpl nodeApiImpl) {
        super(1);
        this.this$0 = nodeApiImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(Function1 it, NodeApiImpl this$0) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Result.Companion companion = Result.INSTANCE;
        it.invoke(Result.m5286boximpl(Result.m5287constructorimpl(Boolean.valueOf(this$0.isOafEnabled()))));
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Function1<? super Result<? extends Boolean>, ? extends Unit> function1) {
        invoke2((Function1<? super Result<Boolean>, Unit>) function1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull final Function1<? super Result<Boolean>, Unit> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final NodeApiImpl nodeApiImpl = this.this$0;
        ThreadUtils.doInBackground(new Runnable() { // from class: com.heytap.health.connect.rawapi.impl.c
            @Override // java.lang.Runnable
            public final void run() {
                NodeApiImpl$isOafEnabledByAsync$1.invoke$lambda$0(it, nodeApiImpl);
            }
        });
    }
}
