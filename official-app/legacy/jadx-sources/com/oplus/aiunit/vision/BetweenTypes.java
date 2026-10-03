package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.id1, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001b\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/id1;", "Lcom/oplus/aiunit/vision/yne;", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "()Ljava/lang/Class;", "betweenTypes", "b", "I", "()I", "position", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class BetweenTypes implements yne {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final Class<?> betweenTypes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int position;

    @NotNull
    public final Class<?> a() {
        return this.betweenTypes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetweenTypes)) {
            return false;
        }
        BetweenTypes betweenTypes = (BetweenTypes) other;
        return Intrinsics.areEqual(this.betweenTypes, betweenTypes.betweenTypes) && this.position == betweenTypes.position;
    }

    public int hashCode() {
        return (this.betweenTypes.hashCode() * 31) + Integer.hashCode(this.position);
    }

    @NotNull
    public String toString() {
        return "BetweenTypes(betweenTypes=" + this.betweenTypes + ", position=" + this.position + ")";
    }
}
