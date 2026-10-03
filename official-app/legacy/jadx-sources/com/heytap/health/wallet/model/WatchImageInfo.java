package com.heytap.health.wallet.model;

import androidx.annotation.Keep;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/wallet/model/WatchImageInfo;", "", Fields.WIDTH_FIELD, "", Fields.HEIGHT_FIELD, "(II)V", "getHeight", "()I", "getWidth", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class WatchImageInfo {
    private final int height;
    private final int width;

    /* JADX WARN: Illegal instructions before constructor call */
    public WatchImageInfo() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ WatchImageInfo copy$default(WatchImageInfo watchImageInfo, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = watchImageInfo.width;
        }
        if ((i3 & 2) != 0) {
            i2 = watchImageInfo.height;
        }
        return watchImageInfo.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final WatchImageInfo copy(int width, int height) {
        return new WatchImageInfo(width, height);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WatchImageInfo)) {
            return false;
        }
        WatchImageInfo watchImageInfo = (WatchImageInfo) other;
        return this.width == watchImageInfo.width && this.height == watchImageInfo.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height);
    }

    @NotNull
    public String toString() {
        return "WatchImageInfo(width=" + this.width + ", height=" + this.height + ")";
    }

    public WatchImageInfo(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public /* synthetic */ WatchImageInfo(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
