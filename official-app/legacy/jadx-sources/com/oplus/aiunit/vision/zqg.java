package com.oplus.aiunit.vision;

import com.oplus.seedling.sdk.entity.EngineType;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.app.seedling.SeedingEngineType;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lpantanal/app/seedling/SeedingEngineType;", "Lcom/oplus/seedling/sdk/entity/EngineType;", "a", "card-seedling_release"}, k = 2, mv = {1, 8, 0})
public final class zqg {
    @NotNull
    public static final EngineType a(@NotNull SeedingEngineType seedingEngineType) {
        Intrinsics.checkNotNullParameter(seedingEngineType, "<this>");
        return seedingEngineType == SeedingEngineType.Standard ? EngineType.STANDARD : EngineType.LITE;
    }
}
