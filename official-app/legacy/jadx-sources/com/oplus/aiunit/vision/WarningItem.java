package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.family.detail.ui.WarningType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.b8l, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\n\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/b8l;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/heytap/health/family/detail/ui/WarningType;", "a", "Lcom/heytap/health/family/detail/ui/WarningType;", "b", "()Lcom/heytap/health/family/detail/ui/WarningType;", "warningType", "I", "()I", "count", "<init>", "(Lcom/heytap/health/family/detail/ui/WarningType;I)V", "family_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class WarningItem {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final WarningType warningType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int count;

    public WarningItem(@NotNull WarningType warningType, int i) {
        Intrinsics.checkNotNullParameter(warningType, "warningType");
        this.warningType = warningType;
        this.count = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final WarningType getWarningType() {
        return this.warningType;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WarningItem)) {
            return false;
        }
        WarningItem warningItem = (WarningItem) other;
        return this.warningType == warningItem.warningType && this.count == warningItem.count;
    }

    public int hashCode() {
        return (this.warningType.hashCode() * 31) + Integer.hashCode(this.count);
    }

    @NotNull
    public String toString() {
        return "WarningItem(warningType=" + this.warningType + ", count=" + this.count + ")";
    }
}
