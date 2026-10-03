package com.heytap.health.watch.notification.impl.transceiver;

import androidx.annotation.Keep;
import com.coloros.sceneservice.dataprovider.bean.SceneStatusInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/watch/notification/impl/transceiver/WeChatConfig;", "", "category", "", "canSlideOut", "", "vibrateDuration", "", "(Ljava/lang/String;ZI)V", "getCanSlideOut", "()Z", "getCategory", "()Ljava/lang/String;", "getVibrateDuration", "()I", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class WeChatConfig {
    private final boolean canSlideOut;

    @NotNull
    private final String category;
    private final int vibrateDuration;

    public WeChatConfig() {
        this(null, false, 0, 7, null);
    }

    public static /* synthetic */ WeChatConfig copy$default(WeChatConfig weChatConfig, String str, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = weChatConfig.category;
        }
        if ((i2 & 2) != 0) {
            z = weChatConfig.canSlideOut;
        }
        if ((i2 & 4) != 0) {
            i = weChatConfig.vibrateDuration;
        }
        return weChatConfig.copy(str, z, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getCanSlideOut() {
        return this.canSlideOut;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getVibrateDuration() {
        return this.vibrateDuration;
    }

    @NotNull
    public final WeChatConfig copy(@NotNull String category, boolean canSlideOut, int vibrateDuration) {
        Intrinsics.checkNotNullParameter(category, "category");
        return new WeChatConfig(category, canSlideOut, vibrateDuration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeChatConfig)) {
            return false;
        }
        WeChatConfig weChatConfig = (WeChatConfig) other;
        return Intrinsics.areEqual(this.category, weChatConfig.category) && this.canSlideOut == weChatConfig.canSlideOut && this.vibrateDuration == weChatConfig.vibrateDuration;
    }

    public final boolean getCanSlideOut() {
        return this.canSlideOut;
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    public final int getVibrateDuration() {
        return this.vibrateDuration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.category.hashCode() * 31;
        boolean z = this.canSlideOut;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode + r1) * 31) + Integer.hashCode(this.vibrateDuration);
    }

    @NotNull
    public String toString() {
        return "WeChatConfig(category=" + this.category + ", canSlideOut=" + this.canSlideOut + ", vibrateDuration=" + this.vibrateDuration + ")";
    }

    public WeChatConfig(@NotNull String category, boolean z, int i) {
        Intrinsics.checkNotNullParameter(category, "category");
        this.category = category;
        this.canSlideOut = z;
        this.vibrateDuration = i;
    }

    public /* synthetic */ WeChatConfig(String str, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "call" : str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? SceneStatusInfo.SceneConstant.TRIP_IN_JOURNEY : i);
    }
}
