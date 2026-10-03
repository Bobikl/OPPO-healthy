package com.heytap.health.cardiovascular.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/cardiovascular/model/HrvFocusBehaviorItem;", "", "behaviorType", "", "focusDayData", "(II)V", "getBehaviorType", "()I", "getFocusDayData", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HrvFocusBehaviorItem {
    public static final int $stable = 0;
    private final int behaviorType;
    private final int focusDayData;

    /* JADX WARN: Illegal instructions before constructor call */
    public HrvFocusBehaviorItem() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ HrvFocusBehaviorItem copy$default(HrvFocusBehaviorItem hrvFocusBehaviorItem, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = hrvFocusBehaviorItem.behaviorType;
        }
        if ((i3 & 2) != 0) {
            i2 = hrvFocusBehaviorItem.focusDayData;
        }
        return hrvFocusBehaviorItem.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBehaviorType() {
        return this.behaviorType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getFocusDayData() {
        return this.focusDayData;
    }

    @NotNull
    public final HrvFocusBehaviorItem copy(int behaviorType, int focusDayData) {
        return new HrvFocusBehaviorItem(behaviorType, focusDayData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HrvFocusBehaviorItem)) {
            return false;
        }
        HrvFocusBehaviorItem hrvFocusBehaviorItem = (HrvFocusBehaviorItem) other;
        return this.behaviorType == hrvFocusBehaviorItem.behaviorType && this.focusDayData == hrvFocusBehaviorItem.focusDayData;
    }

    public final int getBehaviorType() {
        return this.behaviorType;
    }

    public final int getFocusDayData() {
        return this.focusDayData;
    }

    public int hashCode() {
        return (Integer.hashCode(this.behaviorType) * 31) + Integer.hashCode(this.focusDayData);
    }

    @NotNull
    public String toString() {
        return "HrvFocusBehaviorItem(behaviorType=" + this.behaviorType + ", focusDayData=" + this.focusDayData + ")";
    }

    public HrvFocusBehaviorItem(int i, int i2) {
        this.behaviorType = i;
        this.focusDayData = i2;
    }

    public /* synthetic */ HrvFocusBehaviorItem(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
