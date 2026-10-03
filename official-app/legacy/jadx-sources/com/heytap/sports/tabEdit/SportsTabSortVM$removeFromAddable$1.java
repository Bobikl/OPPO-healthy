package com.heytap.sports.tabEdit;

import com.oplus.aiunit.vision.SportTabConfig;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/xii;", "it", "", "invoke", "(Lcom/oplus/aiunit/vision/xii;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class SportsTabSortVM$removeFromAddable$1 extends Lambda implements Function1<SportTabConfig, Boolean> {
    final /* synthetic */ int $sportMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportsTabSortVM$removeFromAddable$1(int i) {
        super(1);
        this.$sportMode = i;
    }

    @Override // p010kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull SportTabConfig it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.getSportMode() == this.$sportMode);
    }
}
