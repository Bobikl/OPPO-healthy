package com.heytap.health.watchface.business.creation.category.flexible.service;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/heytap/health/watchface/business/creation/category/flexible/service/FlexibleBgTaskService;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class FlexibleBgTaskManager$removeTask$1 extends Lambda implements Function1<FlexibleBgTaskService, Unit> {
    final /* synthetic */ Task $task;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexibleBgTaskManager$removeTask$1(Task task) {
        super(1);
        this.$task = task;
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FlexibleBgTaskService flexibleBgTaskService) {
        invoke2(flexibleBgTaskService);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull FlexibleBgTaskService it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.o(this.$task);
    }
}
