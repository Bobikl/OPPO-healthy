package com.heytap.health.devicemanager.processor.cloudaccess.response;

import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
import com.oplus.aiunit.vision.t04;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0002\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003Jc\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010'\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\tHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019¨\u0006+"}, d2 = {"Lcom/heytap/health/devicemanager/processor/cloudaccess/response/RecyclePriceRsp;", "", t04.DEVICE_UNIQUE_ID, "", "link", "model", "positionCode", "productLogo", "recyclePrice", "", "showInterval", "showClose", "", "isCommonUi", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZ)V", "getDeviceUniqueId", "()Ljava/lang/String;", "()Z", "setCommonUi", "(Z)V", "getLink", "getModel", "getPositionCode", "getProductLogo", "getRecyclePrice", "()I", "getShowClose", "setShowClose", "getShowInterval", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "device_manager_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RecyclePriceRsp {

    @NotNull
    private final String deviceUniqueId;
    private boolean isCommonUi;

    @NotNull
    private final String link;

    @NotNull
    private final String model;

    @NotNull
    private final String positionCode;

    @NotNull
    private final String productLogo;
    private final int recyclePrice;
    private boolean showClose;
    private final int showInterval;

    public RecyclePriceRsp() {
        this(null, null, null, null, null, 0, 0, false, false, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPositionCode() {
        return this.positionCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getProductLogo() {
        return this.productLogo;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getRecyclePrice() {
        return this.recyclePrice;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getShowInterval() {
        return this.showInterval;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getShowClose() {
        return this.showClose;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsCommonUi() {
        return this.isCommonUi;
    }

    @NotNull
    public final RecyclePriceRsp copy(@NotNull String deviceUniqueId, @NotNull String link, @NotNull String model, @NotNull String positionCode, @NotNull String productLogo, int recyclePrice, int showInterval, boolean showClose, boolean isCommonUi) {
        Intrinsics.checkNotNullParameter(deviceUniqueId, "deviceUniqueId");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(positionCode, "positionCode");
        Intrinsics.checkNotNullParameter(productLogo, "productLogo");
        return new RecyclePriceRsp(deviceUniqueId, link, model, positionCode, productLogo, recyclePrice, showInterval, showClose, isCommonUi);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecyclePriceRsp)) {
            return false;
        }
        RecyclePriceRsp recyclePriceRsp = (RecyclePriceRsp) other;
        return Intrinsics.areEqual(this.deviceUniqueId, recyclePriceRsp.deviceUniqueId) && Intrinsics.areEqual(this.link, recyclePriceRsp.link) && Intrinsics.areEqual(this.model, recyclePriceRsp.model) && Intrinsics.areEqual(this.positionCode, recyclePriceRsp.positionCode) && Intrinsics.areEqual(this.productLogo, recyclePriceRsp.productLogo) && this.recyclePrice == recyclePriceRsp.recyclePrice && this.showInterval == recyclePriceRsp.showInterval && this.showClose == recyclePriceRsp.showClose && this.isCommonUi == recyclePriceRsp.isCommonUi;
    }

    @NotNull
    public final String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getPositionCode() {
        return this.positionCode;
    }

    @NotNull
    public final String getProductLogo() {
        return this.productLogo;
    }

    public final int getRecyclePrice() {
        return this.recyclePrice;
    }

    public final boolean getShowClose() {
        return this.showClose;
    }

    public final int getShowInterval() {
        return this.showInterval;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((((((this.deviceUniqueId.hashCode() * 31) + this.link.hashCode()) * 31) + this.model.hashCode()) * 31) + this.positionCode.hashCode()) * 31) + this.productLogo.hashCode()) * 31) + Integer.hashCode(this.recyclePrice)) * 31) + Integer.hashCode(this.showInterval)) * 31;
        boolean z = this.showClose;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.isCommonUi;
        return i + (z2 ? 1 : z2);
    }

    public final boolean isCommonUi() {
        return this.isCommonUi;
    }

    public final void setCommonUi(boolean z) {
        this.isCommonUi = z;
    }

    public final void setShowClose(boolean z) {
        this.showClose = z;
    }

    @NotNull
    public String toString() {
        return "RecyclePriceRsp(deviceUniqueId=" + this.deviceUniqueId + ", link=" + this.link + ", model=" + this.model + ", positionCode=" + this.positionCode + ", productLogo=" + this.productLogo + ", recyclePrice=" + this.recyclePrice + ", showInterval=" + this.showInterval + ", showClose=" + this.showClose + ", isCommonUi=" + this.isCommonUi + ")";
    }

    public RecyclePriceRsp(@NotNull String deviceUniqueId, @NotNull String link, @NotNull String model, @NotNull String positionCode, @NotNull String productLogo, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(deviceUniqueId, "deviceUniqueId");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(positionCode, "positionCode");
        Intrinsics.checkNotNullParameter(productLogo, "productLogo");
        this.deviceUniqueId = deviceUniqueId;
        this.link = link;
        this.model = model;
        this.positionCode = positionCode;
        this.productLogo = productLogo;
        this.recyclePrice = i;
        this.showInterval = i2;
        this.showClose = z;
        this.isCommonUi = z2;
    }

    public /* synthetic */ RecyclePriceRsp(String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? false : z, (i3 & 256) != 0 ? false : z2);
    }
}
