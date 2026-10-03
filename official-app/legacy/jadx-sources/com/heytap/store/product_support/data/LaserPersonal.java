package com.heytap.store.product_support.data;

import androidx.annotation.Keep;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b;\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0011J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jª\u0001\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010?J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020DHÖ\u0001J\t\u0010E\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010\u0015R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010\u0015R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0013\"\u0004\b(\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0013\"\u0004\b*\u0010\u0015R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b+\u0010\u0017\"\u0004\b,\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0013\"\u0004\b.\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0013\"\u0004\b0\u0010\u0015¨\u0006F"}, d2 = {"Lcom/heytap/store/product_support/data/LaserPersonal;", "", DeepLinkInterpreter.KEY_ACTIVITY_ID, "", "activityTitle", "", "activityDesc", "icon", "detailBtnName", "returnInfo", "alertDesc", "alertBtnName", "stockBizCode", "stockBizType", "stock", "eventType", "redirectUrl", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getActivityDesc", "()Ljava/lang/String;", "setActivityDesc", "(Ljava/lang/String;)V", "getActivityId", "()Ljava/lang/Long;", "setActivityId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getActivityTitle", "setActivityTitle", "getAlertBtnName", "setAlertBtnName", "getAlertDesc", "setAlertDesc", "getDetailBtnName", "setDetailBtnName", "getEventType", "setEventType", "getIcon", "setIcon", "getRedirectUrl", "setRedirectUrl", "getReturnInfo", "setReturnInfo", "getStock", "setStock", "getStockBizCode", "setStockBizCode", "getStockBizType", "setStockBizType", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/heytap/store/product_support/data/LaserPersonal;", "equals", "", "other", "hashCode", "", "toString", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class LaserPersonal {

    @Nullable
    private String activityDesc;

    @Nullable
    private Long activityId;

    @Nullable
    private String activityTitle;

    @Nullable
    private String alertBtnName;

    @Nullable
    private String alertDesc;

    @Nullable
    private String detailBtnName;

    @Nullable
    private String eventType;

    @Nullable
    private String icon;

    @Nullable
    private String redirectUrl;

    @Nullable
    private String returnInfo;

    @Nullable
    private Long stock;

    @Nullable
    private String stockBizCode;

    @Nullable
    private String stockBizType;

    public LaserPersonal(@Nullable Long l2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Long l3, @Nullable String str10, @Nullable String str11) {
        this.activityId = l2;
        this.activityTitle = str;
        this.activityDesc = str2;
        this.icon = str3;
        this.detailBtnName = str4;
        this.returnInfo = str5;
        this.alertDesc = str6;
        this.alertBtnName = str7;
        this.stockBizCode = str8;
        this.stockBizType = str9;
        this.stock = l3;
        this.eventType = str10;
        this.redirectUrl = str11;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getActivityId() {
        return this.activityId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getStockBizType() {
        return this.stockBizType;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getStock() {
        return this.stock;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getActivityTitle() {
        return this.activityTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getActivityDesc() {
        return this.activityDesc;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDetailBtnName() {
        return this.detailBtnName;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getReturnInfo() {
        return this.returnInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAlertDesc() {
        return this.alertDesc;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAlertBtnName() {
        return this.alertBtnName;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getStockBizCode() {
        return this.stockBizCode;
    }

    @NotNull
    public final LaserPersonal copy(@Nullable Long activityId, @Nullable String activityTitle, @Nullable String activityDesc, @Nullable String icon, @Nullable String detailBtnName, @Nullable String returnInfo, @Nullable String alertDesc, @Nullable String alertBtnName, @Nullable String stockBizCode, @Nullable String stockBizType, @Nullable Long stock, @Nullable String eventType, @Nullable String redirectUrl) {
        return new LaserPersonal(activityId, activityTitle, activityDesc, icon, detailBtnName, returnInfo, alertDesc, alertBtnName, stockBizCode, stockBizType, stock, eventType, redirectUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LaserPersonal)) {
            return false;
        }
        LaserPersonal laserPersonal = (LaserPersonal) other;
        return Intrinsics.areEqual(this.activityId, laserPersonal.activityId) && Intrinsics.areEqual(this.activityTitle, laserPersonal.activityTitle) && Intrinsics.areEqual(this.activityDesc, laserPersonal.activityDesc) && Intrinsics.areEqual(this.icon, laserPersonal.icon) && Intrinsics.areEqual(this.detailBtnName, laserPersonal.detailBtnName) && Intrinsics.areEqual(this.returnInfo, laserPersonal.returnInfo) && Intrinsics.areEqual(this.alertDesc, laserPersonal.alertDesc) && Intrinsics.areEqual(this.alertBtnName, laserPersonal.alertBtnName) && Intrinsics.areEqual(this.stockBizCode, laserPersonal.stockBizCode) && Intrinsics.areEqual(this.stockBizType, laserPersonal.stockBizType) && Intrinsics.areEqual(this.stock, laserPersonal.stock) && Intrinsics.areEqual(this.eventType, laserPersonal.eventType) && Intrinsics.areEqual(this.redirectUrl, laserPersonal.redirectUrl);
    }

    @Nullable
    public final String getActivityDesc() {
        return this.activityDesc;
    }

    @Nullable
    public final Long getActivityId() {
        return this.activityId;
    }

    @Nullable
    public final String getActivityTitle() {
        return this.activityTitle;
    }

    @Nullable
    public final String getAlertBtnName() {
        return this.alertBtnName;
    }

    @Nullable
    public final String getAlertDesc() {
        return this.alertDesc;
    }

    @Nullable
    public final String getDetailBtnName() {
        return this.detailBtnName;
    }

    @Nullable
    public final String getEventType() {
        return this.eventType;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    @Nullable
    public final String getReturnInfo() {
        return this.returnInfo;
    }

    @Nullable
    public final Long getStock() {
        return this.stock;
    }

    @Nullable
    public final String getStockBizCode() {
        return this.stockBizCode;
    }

    @Nullable
    public final String getStockBizType() {
        return this.stockBizType;
    }

    public int hashCode() {
        Long l2 = this.activityId;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        String str = this.activityTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.activityDesc;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.icon;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.detailBtnName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.returnInfo;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.alertDesc;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.alertBtnName;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.stockBizCode;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.stockBizType;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l3 = this.stock;
        int iHashCode11 = (iHashCode10 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str10 = this.eventType;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.redirectUrl;
        return iHashCode12 + (str11 != null ? str11.hashCode() : 0);
    }

    public final void setActivityDesc(@Nullable String str) {
        this.activityDesc = str;
    }

    public final void setActivityId(@Nullable Long l2) {
        this.activityId = l2;
    }

    public final void setActivityTitle(@Nullable String str) {
        this.activityTitle = str;
    }

    public final void setAlertBtnName(@Nullable String str) {
        this.alertBtnName = str;
    }

    public final void setAlertDesc(@Nullable String str) {
        this.alertDesc = str;
    }

    public final void setDetailBtnName(@Nullable String str) {
        this.detailBtnName = str;
    }

    public final void setEventType(@Nullable String str) {
        this.eventType = str;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setRedirectUrl(@Nullable String str) {
        this.redirectUrl = str;
    }

    public final void setReturnInfo(@Nullable String str) {
        this.returnInfo = str;
    }

    public final void setStock(@Nullable Long l2) {
        this.stock = l2;
    }

    public final void setStockBizCode(@Nullable String str) {
        this.stockBizCode = str;
    }

    public final void setStockBizType(@Nullable String str) {
        this.stockBizType = str;
    }

    @NotNull
    public String toString() {
        return "LaserPersonal(activityId=" + this.activityId + ", activityTitle=" + ((Object) this.activityTitle) + ", activityDesc=" + ((Object) this.activityDesc) + ", icon=" + ((Object) this.icon) + ", detailBtnName=" + ((Object) this.detailBtnName) + ", returnInfo=" + ((Object) this.returnInfo) + ", alertDesc=" + ((Object) this.alertDesc) + ", alertBtnName=" + ((Object) this.alertBtnName) + ", stockBizCode=" + ((Object) this.stockBizCode) + ", stockBizType=" + ((Object) this.stockBizType) + ", stock=" + this.stock + ", eventType=" + ((Object) this.eventType) + ", redirectUrl=" + ((Object) this.redirectUrl) + ')';
    }
}
