package com.heytap.store.base.core.data;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/heytap/store/base/core/data/LoadingPageData;", "", "loadingText", "", "loadingTextColor", "", "loadingBackgroundColor", "loadingProgressColor", "skeletonResourceId", "(Ljava/lang/String;IIII)V", "getLoadingBackgroundColor", "()I", "getLoadingProgressColor", "getLoadingText", "()Ljava/lang/String;", "getLoadingTextColor", "getSkeletonResourceId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class LoadingPageData {
    private final int loadingBackgroundColor;
    private final int loadingProgressColor;

    @NotNull
    private final String loadingText;
    private final int loadingTextColor;
    private final int skeletonResourceId;

    public LoadingPageData() {
        this(null, 0, 0, 0, 0, 31, null);
    }

    public static /* synthetic */ LoadingPageData copy$default(LoadingPageData loadingPageData, String str, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = loadingPageData.loadingText;
        }
        if ((i5 & 2) != 0) {
            i = loadingPageData.loadingTextColor;
        }
        int i6 = i;
        if ((i5 & 4) != 0) {
            i2 = loadingPageData.loadingBackgroundColor;
        }
        int i7 = i2;
        if ((i5 & 8) != 0) {
            i3 = loadingPageData.loadingProgressColor;
        }
        int i8 = i3;
        if ((i5 & 16) != 0) {
            i4 = loadingPageData.skeletonResourceId;
        }
        return loadingPageData.copy(str, i6, i7, i8, i4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLoadingText() {
        return this.loadingText;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLoadingTextColor() {
        return this.loadingTextColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLoadingBackgroundColor() {
        return this.loadingBackgroundColor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getLoadingProgressColor() {
        return this.loadingProgressColor;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSkeletonResourceId() {
        return this.skeletonResourceId;
    }

    @NotNull
    public final LoadingPageData copy(@NotNull String loadingText, int loadingTextColor, int loadingBackgroundColor, int loadingProgressColor, int skeletonResourceId) {
        Intrinsics.checkNotNullParameter(loadingText, "loadingText");
        return new LoadingPageData(loadingText, loadingTextColor, loadingBackgroundColor, loadingProgressColor, skeletonResourceId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadingPageData)) {
            return false;
        }
        LoadingPageData loadingPageData = (LoadingPageData) other;
        return Intrinsics.areEqual(this.loadingText, loadingPageData.loadingText) && this.loadingTextColor == loadingPageData.loadingTextColor && this.loadingBackgroundColor == loadingPageData.loadingBackgroundColor && this.loadingProgressColor == loadingPageData.loadingProgressColor && this.skeletonResourceId == loadingPageData.skeletonResourceId;
    }

    public final int getLoadingBackgroundColor() {
        return this.loadingBackgroundColor;
    }

    public final int getLoadingProgressColor() {
        return this.loadingProgressColor;
    }

    @NotNull
    public final String getLoadingText() {
        return this.loadingText;
    }

    public final int getLoadingTextColor() {
        return this.loadingTextColor;
    }

    public final int getSkeletonResourceId() {
        return this.skeletonResourceId;
    }

    public int hashCode() {
        return (((((((this.loadingText.hashCode() * 31) + Integer.hashCode(this.loadingTextColor)) * 31) + Integer.hashCode(this.loadingBackgroundColor)) * 31) + Integer.hashCode(this.loadingProgressColor)) * 31) + Integer.hashCode(this.skeletonResourceId);
    }

    @NotNull
    public String toString() {
        return "LoadingPageData(loadingText=" + this.loadingText + ", loadingTextColor=" + this.loadingTextColor + ", loadingBackgroundColor=" + this.loadingBackgroundColor + ", loadingProgressColor=" + this.loadingProgressColor + ", skeletonResourceId=" + this.skeletonResourceId + ')';
    }

    public LoadingPageData(@NotNull String loadingText, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(loadingText, "loadingText");
        this.loadingText = loadingText;
        this.loadingTextColor = i;
        this.loadingBackgroundColor = i2;
        this.loadingProgressColor = i3;
        this.skeletonResourceId = i4;
    }

    public /* synthetic */ LoadingPageData(String str, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? -1 : i, (i5 & 4) != 0 ? -1 : i2, (i5 & 8) != 0 ? -1 : i3, (i5 & 16) == 0 ? i4 : -1);
    }
}
