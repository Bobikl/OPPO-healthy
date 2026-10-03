package com.oplus.aiunit.vision;

import com.oplus.nearx.track.internal.common.content.GlobalConfigHelper;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¨\u0006\u0004"}, d2 = {"Lkotlin/Function0;", "", "block", "a", "core-statistics_release"}, k = 2, mv = {1, 7, 1})
public final class h78 {
    public static final void a(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        GlobalConfigHelper globalConfigHelper = GlobalConfigHelper.INSTANCE;
        if (globalConfigHelper.d() || globalConfigHelper.e()) {
            block.invoke();
        }
    }
}
