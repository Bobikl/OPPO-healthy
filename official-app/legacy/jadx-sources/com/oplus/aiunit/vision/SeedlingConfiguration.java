package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.app.seedling.SeedingEngineType;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.wqg, reason: from toString */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/wqg;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lpantanal/app/seedling/SeedingEngineType;", "a", "Lpantanal/app/seedling/SeedingEngineType;", "()Lpantanal/app/seedling/SeedingEngineType;", "engineType", "<init>", "(Lpantanal/app/seedling/SeedingEngineType;)V", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SeedlingConfiguration {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final SeedingEngineType engineType;

    public SeedlingConfiguration(@NotNull SeedingEngineType engineType) {
        Intrinsics.checkNotNullParameter(engineType, "engineType");
        this.engineType = engineType;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final SeedingEngineType getEngineType() {
        return this.engineType;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SeedlingConfiguration) && this.engineType == ((SeedlingConfiguration) other).engineType;
    }

    public int hashCode() {
        return this.engineType.hashCode();
    }

    @NotNull
    public String toString() {
        return "SeedlingConfiguration(engineType=" + this.engineType + ")";
    }
}
