package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.ux0, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/ux0;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "imageUrl", "b", "jumpUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class BannerItem {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String imageUrl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final String jumpUrl;

    public BannerItem(@NotNull String imageUrl, @Nullable String str) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.imageUrl = imageUrl;
        this.jumpUrl = str;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerItem)) {
            return false;
        }
        BannerItem bannerItem = (BannerItem) other;
        return Intrinsics.areEqual(this.imageUrl, bannerItem.imageUrl) && Intrinsics.areEqual(this.jumpUrl, bannerItem.jumpUrl);
    }

    public int hashCode() {
        int iHashCode = this.imageUrl.hashCode() * 31;
        String str = this.jumpUrl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "BannerItem(imageUrl=" + this.imageUrl + ", jumpUrl=" + this.jumpUrl + ")";
    }
}
