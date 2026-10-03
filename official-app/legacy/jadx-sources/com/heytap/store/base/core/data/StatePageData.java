package com.heytap.store.base.core.data;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/heytap/store/base/core/data/StatePageData;", "", "textStr", "", "drawableResourceId", "", "subTextResourceId", "(Ljava/lang/String;II)V", "getDrawableResourceId", "()I", "getSubTextResourceId", "getTextStr", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class StatePageData {
    private final int drawableResourceId;
    private final int subTextResourceId;

    @NotNull
    private final String textStr;

    public StatePageData() {
        this(null, 0, 0, 7, null);
    }

    public static /* synthetic */ StatePageData copy$default(StatePageData statePageData, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = statePageData.textStr;
        }
        if ((i3 & 2) != 0) {
            i = statePageData.drawableResourceId;
        }
        if ((i3 & 4) != 0) {
            i2 = statePageData.subTextResourceId;
        }
        return statePageData.copy(str, i, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTextStr() {
        return this.textStr;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDrawableResourceId() {
        return this.drawableResourceId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSubTextResourceId() {
        return this.subTextResourceId;
    }

    @NotNull
    public final StatePageData copy(@NotNull String textStr, int drawableResourceId, int subTextResourceId) {
        Intrinsics.checkNotNullParameter(textStr, "textStr");
        return new StatePageData(textStr, drawableResourceId, subTextResourceId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatePageData)) {
            return false;
        }
        StatePageData statePageData = (StatePageData) other;
        return Intrinsics.areEqual(this.textStr, statePageData.textStr) && this.drawableResourceId == statePageData.drawableResourceId && this.subTextResourceId == statePageData.subTextResourceId;
    }

    public final int getDrawableResourceId() {
        return this.drawableResourceId;
    }

    public final int getSubTextResourceId() {
        return this.subTextResourceId;
    }

    @NotNull
    public final String getTextStr() {
        return this.textStr;
    }

    public int hashCode() {
        return (((this.textStr.hashCode() * 31) + Integer.hashCode(this.drawableResourceId)) * 31) + Integer.hashCode(this.subTextResourceId);
    }

    @NotNull
    public String toString() {
        return "StatePageData(textStr=" + this.textStr + ", drawableResourceId=" + this.drawableResourceId + ", subTextResourceId=" + this.subTextResourceId + ')';
    }

    public StatePageData(@NotNull String textStr, int i, int i2) {
        Intrinsics.checkNotNullParameter(textStr, "textStr");
        this.textStr = textStr;
        this.drawableResourceId = i;
        this.subTextResourceId = i2;
    }

    public /* synthetic */ StatePageData(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }
}
