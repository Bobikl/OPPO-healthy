package com.oplus.nearx.track.internal.common;

import com.oplus.nearx.track.internal.storage.db.common.entity.AppConfig;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/oplus/nearx/track/internal/storage/db/common/entity/AppConfig;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
final class TestOnlyUtil$getTrackContextConfig$1 extends Lambda implements Function1<AppConfig, Unit> {
    final /* synthetic */ Function1<String, Unit> $callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TestOnlyUtil$getTrackContextConfig$1(Function1<? super String, Unit> function1) {
        super(1);
        this.$callback = function1;
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AppConfig appConfig) {
        invoke2(appConfig);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable AppConfig appConfig) {
        this.$callback.invoke(String.valueOf(appConfig));
    }
}
