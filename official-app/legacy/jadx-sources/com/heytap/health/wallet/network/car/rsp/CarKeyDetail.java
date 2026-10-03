package com.heytap.health.wallet.network.car.rsp;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0095\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u00066"}, d2 = {"Lcom/heytap/health/wallet/network/car/rsp/CarKeyDetail;", "", "aid", "", "appId", "carInfo", "", "Lcom/heytap/health/wallet/network/car/rsp/CardInfoDTO;", "cardName", "cardUrl", "deleteDialog", "installDeleteDialog", Feedback.WIDGET_LINKURL, "message", "pkg", "status", "userTipsUrl", "appGuideUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAid", "()Ljava/lang/String;", "getAppGuideUrl", "getAppId", "getCarInfo", "()Ljava/util/List;", "getCardName", "getCardUrl", "getDeleteDialog", "getInstallDeleteDialog", "getLinkUrl", "getMessage", "getPkg", "getStatus", "getUserTipsUrl", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CarKeyDetail {

    @NotNull
    private final String aid;

    @NotNull
    private final String appGuideUrl;

    @NotNull
    private final String appId;

    @NotNull
    private final List<CardInfoDTO> carInfo;

    @NotNull
    private final String cardName;

    @NotNull
    private final String cardUrl;

    @NotNull
    private final String deleteDialog;

    @NotNull
    private final String installDeleteDialog;

    @Nullable
    private final String linkUrl;

    @Nullable
    private final String message;

    @NotNull
    private final String pkg;

    @NotNull
    private final String status;

    @NotNull
    private final String userTipsUrl;

    public CarKeyDetail(@NotNull String aid, @NotNull String appId, @NotNull List<CardInfoDTO> carInfo, @NotNull String cardName, @NotNull String cardUrl, @NotNull String deleteDialog, @NotNull String installDeleteDialog, @Nullable String str, @Nullable String str2, @NotNull String pkg, @NotNull String status, @NotNull String userTipsUrl, @NotNull String appGuideUrl) {
        Intrinsics.checkNotNullParameter(aid, "aid");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(carInfo, "carInfo");
        Intrinsics.checkNotNullParameter(cardName, "cardName");
        Intrinsics.checkNotNullParameter(cardUrl, "cardUrl");
        Intrinsics.checkNotNullParameter(deleteDialog, "deleteDialog");
        Intrinsics.checkNotNullParameter(installDeleteDialog, "installDeleteDialog");
        Intrinsics.checkNotNullParameter(pkg, "pkg");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(userTipsUrl, "userTipsUrl");
        Intrinsics.checkNotNullParameter(appGuideUrl, "appGuideUrl");
        this.aid = aid;
        this.appId = appId;
        this.carInfo = carInfo;
        this.cardName = cardName;
        this.cardUrl = cardUrl;
        this.deleteDialog = deleteDialog;
        this.installDeleteDialog = installDeleteDialog;
        this.linkUrl = str;
        this.message = str2;
        this.pkg = pkg;
        this.status = status;
        this.userTipsUrl = userTipsUrl;
        this.appGuideUrl = appGuideUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAid() {
        return this.aid;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPkg() {
        return this.pkg;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getUserTipsUrl() {
        return this.userTipsUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getAppGuideUrl() {
        return this.appGuideUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    public final List<CardInfoDTO> component3() {
        return this.carInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCardName() {
        return this.cardName;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCardUrl() {
        return this.cardUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDeleteDialog() {
        return this.deleteDialog;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getInstallDeleteDialog() {
        return this.installDeleteDialog;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final CarKeyDetail copy(@NotNull String aid, @NotNull String appId, @NotNull List<CardInfoDTO> carInfo, @NotNull String cardName, @NotNull String cardUrl, @NotNull String deleteDialog, @NotNull String installDeleteDialog, @Nullable String linkUrl, @Nullable String message, @NotNull String pkg, @NotNull String status, @NotNull String userTipsUrl, @NotNull String appGuideUrl) {
        Intrinsics.checkNotNullParameter(aid, "aid");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(carInfo, "carInfo");
        Intrinsics.checkNotNullParameter(cardName, "cardName");
        Intrinsics.checkNotNullParameter(cardUrl, "cardUrl");
        Intrinsics.checkNotNullParameter(deleteDialog, "deleteDialog");
        Intrinsics.checkNotNullParameter(installDeleteDialog, "installDeleteDialog");
        Intrinsics.checkNotNullParameter(pkg, "pkg");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(userTipsUrl, "userTipsUrl");
        Intrinsics.checkNotNullParameter(appGuideUrl, "appGuideUrl");
        return new CarKeyDetail(aid, appId, carInfo, cardName, cardUrl, deleteDialog, installDeleteDialog, linkUrl, message, pkg, status, userTipsUrl, appGuideUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarKeyDetail)) {
            return false;
        }
        CarKeyDetail carKeyDetail = (CarKeyDetail) other;
        return Intrinsics.areEqual(this.aid, carKeyDetail.aid) && Intrinsics.areEqual(this.appId, carKeyDetail.appId) && Intrinsics.areEqual(this.carInfo, carKeyDetail.carInfo) && Intrinsics.areEqual(this.cardName, carKeyDetail.cardName) && Intrinsics.areEqual(this.cardUrl, carKeyDetail.cardUrl) && Intrinsics.areEqual(this.deleteDialog, carKeyDetail.deleteDialog) && Intrinsics.areEqual(this.installDeleteDialog, carKeyDetail.installDeleteDialog) && Intrinsics.areEqual(this.linkUrl, carKeyDetail.linkUrl) && Intrinsics.areEqual(this.message, carKeyDetail.message) && Intrinsics.areEqual(this.pkg, carKeyDetail.pkg) && Intrinsics.areEqual(this.status, carKeyDetail.status) && Intrinsics.areEqual(this.userTipsUrl, carKeyDetail.userTipsUrl) && Intrinsics.areEqual(this.appGuideUrl, carKeyDetail.appGuideUrl);
    }

    @NotNull
    public final String getAid() {
        return this.aid;
    }

    @NotNull
    public final String getAppGuideUrl() {
        return this.appGuideUrl;
    }

    @NotNull
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    public final List<CardInfoDTO> getCarInfo() {
        return this.carInfo;
    }

    @NotNull
    public final String getCardName() {
        return this.cardName;
    }

    @NotNull
    public final String getCardUrl() {
        return this.cardUrl;
    }

    @NotNull
    public final String getDeleteDialog() {
        return this.deleteDialog;
    }

    @NotNull
    public final String getInstallDeleteDialog() {
        return this.installDeleteDialog;
    }

    @Nullable
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getPkg() {
        return this.pkg;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getUserTipsUrl() {
        return this.userTipsUrl;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.aid.hashCode() * 31) + this.appId.hashCode()) * 31) + this.carInfo.hashCode()) * 31) + this.cardName.hashCode()) * 31) + this.cardUrl.hashCode()) * 31) + this.deleteDialog.hashCode()) * 31) + this.installDeleteDialog.hashCode()) * 31;
        String str = this.linkUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        return ((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.pkg.hashCode()) * 31) + this.status.hashCode()) * 31) + this.userTipsUrl.hashCode()) * 31) + this.appGuideUrl.hashCode();
    }

    @NotNull
    public String toString() {
        return "CarKeyDetail(aid=" + this.aid + ", appId=" + this.appId + ", carInfo=" + this.carInfo + ", cardName=" + this.cardName + ", cardUrl=" + this.cardUrl + ", deleteDialog=" + this.deleteDialog + ", installDeleteDialog=" + this.installDeleteDialog + ", linkUrl=" + this.linkUrl + ", message=" + this.message + ", pkg=" + this.pkg + ", status=" + this.status + ", userTipsUrl=" + this.userTipsUrl + ", appGuideUrl=" + this.appGuideUrl + ")";
    }
}
