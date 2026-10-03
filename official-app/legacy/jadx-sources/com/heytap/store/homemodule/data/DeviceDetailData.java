package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.sbe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0010HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00104\u001a\u00020\nHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00106\u001a\u00020\nHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jw\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010:\u001a\u00020\u00102\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\u0007HÖ\u0001J\t\u0010=\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0013\"\u0004\b(\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001e\"\u0004\b.\u0010 ¨\u0006>"}, d2 = {"Lcom/heytap/store/homemodule/data/DeviceDetailData;", "", Fields.PRODUCT_ID, "", "title", "", "showName", "", sbe.PAY_SDK_PRODUCTNAME, "recyclePrice", "", "productLogo", "discountMoney", "productLink", "recycleLink", "isShow", "", "(JLjava/lang/String;ILjava/lang/String;DLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Z)V", "getDiscountMoney", "()D", "setDiscountMoney", "(D)V", "()Z", "setShow", "(Z)V", "getProductId", "()J", "setProductId", "(J)V", "getProductLink", "()Ljava/lang/String;", "setProductLink", "(Ljava/lang/String;)V", "getProductLogo", "setProductLogo", "getProductName", "setProductName", "getRecycleLink", "setRecycleLink", "getRecyclePrice", "setRecyclePrice", "getShowName", "()I", "setShowName", "(I)V", "getTitle", "setTitle", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class DeviceDetailData {
    private double discountMoney;
    private boolean isShow;
    private long productId;

    @Nullable
    private String productLink;

    @Nullable
    private String productLogo;

    @Nullable
    private String productName;

    @Nullable
    private String recycleLink;
    private double recyclePrice;
    private int showName;

    @Nullable
    private String title;

    public DeviceDetailData() {
        this(0L, null, 0, null, 0.0d, null, 0.0d, null, null, false, 1023, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsShow() {
        return this.isShow;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getShowName() {
        return this.showName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getRecyclePrice() {
        return this.recyclePrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getProductLogo() {
        return this.productLogo;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getDiscountMoney() {
        return this.discountMoney;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getProductLink() {
        return this.productLink;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRecycleLink() {
        return this.recycleLink;
    }

    @NotNull
    public final DeviceDetailData copy(long productId, @Nullable String title, int showName, @Nullable String productName, double recyclePrice, @Nullable String productLogo, double discountMoney, @Nullable String productLink, @Nullable String recycleLink, boolean isShow) {
        return new DeviceDetailData(productId, title, showName, productName, recyclePrice, productLogo, discountMoney, productLink, recycleLink, isShow);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceDetailData)) {
            return false;
        }
        DeviceDetailData deviceDetailData = (DeviceDetailData) other;
        return this.productId == deviceDetailData.productId && Intrinsics.areEqual(this.title, deviceDetailData.title) && this.showName == deviceDetailData.showName && Intrinsics.areEqual(this.productName, deviceDetailData.productName) && Intrinsics.areEqual((Object) Double.valueOf(this.recyclePrice), (Object) Double.valueOf(deviceDetailData.recyclePrice)) && Intrinsics.areEqual(this.productLogo, deviceDetailData.productLogo) && Intrinsics.areEqual((Object) Double.valueOf(this.discountMoney), (Object) Double.valueOf(deviceDetailData.discountMoney)) && Intrinsics.areEqual(this.productLink, deviceDetailData.productLink) && Intrinsics.areEqual(this.recycleLink, deviceDetailData.recycleLink) && this.isShow == deviceDetailData.isShow;
    }

    public final double getDiscountMoney() {
        return this.discountMoney;
    }

    public final long getProductId() {
        return this.productId;
    }

    @Nullable
    public final String getProductLink() {
        return this.productLink;
    }

    @Nullable
    public final String getProductLogo() {
        return this.productLogo;
    }

    @Nullable
    public final String getProductName() {
        return this.productName;
    }

    @Nullable
    public final String getRecycleLink() {
        return this.recycleLink;
    }

    public final double getRecyclePrice() {
        return this.recyclePrice;
    }

    public final int getShowName() {
        return this.showName;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.productId) * 31;
        String str = this.title;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.showName)) * 31;
        String str2 = this.productName;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Double.hashCode(this.recyclePrice)) * 31;
        String str3 = this.productLogo;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Double.hashCode(this.discountMoney)) * 31;
        String str4 = this.productLink;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.recycleLink;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z = this.isShow;
        ?? r5 = z;
        if (z) {
            r5 = 1;
        }
        return iHashCode6 + r5;
    }

    public final boolean isShow() {
        return this.isShow;
    }

    public final void setDiscountMoney(double d) {
        this.discountMoney = d;
    }

    public final void setProductId(long j2) {
        this.productId = j2;
    }

    public final void setProductLink(@Nullable String str) {
        this.productLink = str;
    }

    public final void setProductLogo(@Nullable String str) {
        this.productLogo = str;
    }

    public final void setProductName(@Nullable String str) {
        this.productName = str;
    }

    public final void setRecycleLink(@Nullable String str) {
        this.recycleLink = str;
    }

    public final void setRecyclePrice(double d) {
        this.recyclePrice = d;
    }

    public final void setShow(boolean z) {
        this.isShow = z;
    }

    public final void setShowName(int i) {
        this.showName = i;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "DeviceDetailData(productId=" + this.productId + ", title=" + ((Object) this.title) + ", showName=" + this.showName + ", productName=" + ((Object) this.productName) + ", recyclePrice=" + this.recyclePrice + ", productLogo=" + ((Object) this.productLogo) + ", discountMoney=" + this.discountMoney + ", productLink=" + ((Object) this.productLink) + ", recycleLink=" + ((Object) this.recycleLink) + ", isShow=" + this.isShow + ')';
    }

    public DeviceDetailData(long j2, @Nullable String str, int i, @Nullable String str2, double d, @Nullable String str3, double d2, @Nullable String str4, @Nullable String str5, boolean z) {
        this.productId = j2;
        this.title = str;
        this.showName = i;
        this.productName = str2;
        this.recyclePrice = d;
        this.productLogo = str3;
        this.discountMoney = d2;
        this.productLink = str4;
        this.recycleLink = str5;
        this.isShow = z;
    }

    public /* synthetic */ DeviceDetailData(long j2, String str, int i, String str2, double d, String str3, double d2, String str4, String str5, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j2, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? 0.0d : d, (i2 & 32) != 0 ? null : str3, (i2 & 64) == 0 ? d2 : 0.0d, (i2 & 128) != 0 ? null : str4, (i2 & 256) == 0 ? str5 : null, (i2 & 512) == 0 ? z : false);
    }
}
