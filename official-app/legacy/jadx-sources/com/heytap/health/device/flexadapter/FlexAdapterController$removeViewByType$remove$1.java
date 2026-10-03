package com.heytap.health.device.flexadapter;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0010\b\u0000\u0010\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0000\"\f\b\u0001\u0010\u0003*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/heytap/health/device/flexadapter/a;", "D", "Lcom/heytap/health/device/flexadapter/FlexAdapter;", "A", "it", "", "invoke", "(Lcom/heytap/health/device/flexadapter/a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class FlexAdapterController$removeViewByType$remove$1 extends Lambda implements Function1<a<?, ?>, Boolean> {
    final /* synthetic */ int $type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexAdapterController$removeViewByType$remove$1(int i) {
        super(1);
        this.$type = i;
    }

    @Override // p010kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull a<?, ?> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.G() == this.$type);
    }
}
