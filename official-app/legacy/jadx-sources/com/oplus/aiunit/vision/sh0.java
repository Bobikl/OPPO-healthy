package com.oplus.aiunit.vision;

import com.afollestad.assent.AssentResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0000*\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0080\u0002¨\u0006\u0003"}, d2 = {"Lcom/afollestad/assent/AssentResult;", "other", "a", "core"}, k = 2, mv = {1, 4, 0})
public final class sh0 {
    @NotNull
    public static final AssentResult a(@Nullable AssentResult assentResult, @NotNull AssentResult other) {
        Intrinsics.checkParameterIsNotNull(other, "other");
        return assentResult == null ? other : new AssentResult(MapsKt__MapsKt.plus(assentResult.b(), other.b()));
    }
}
