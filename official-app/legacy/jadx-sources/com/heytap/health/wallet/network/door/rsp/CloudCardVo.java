package com.heytap.health.wallet.network.door.rsp;

import androidx.annotation.Keep;
import com.heytap.health.wallet.model.otherdevice.OtherDeviceCard;
import com.oplus.aiunit.vision.j7l;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003Jc\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\u0006\u0010'\u001a\u00020(J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006*"}, d2 = {"Lcom/heytap/health/wallet/network/door/rsp/CloudCardVo;", "", "abf", "", "cardImg", "cardName", j7l.KEY_CPLC, ServiceNodeBundleKeys.DEVICE_NAME, "orderNo", "removable", "", "removeRemark", "appCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getAbf", "()Ljava/lang/String;", "getAppCode", "getCardImg", "getCardName", "getCplc", "getDeviceName", "getOrderNo", "getRemovable", "()Z", "getRemoveRemark", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toODeviceCardRspVO", "Lcom/heytap/health/wallet/network/door/rsp/ODeviceCardRspVO;", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CloudCardVo {

    @NotNull
    private final String abf;

    @NotNull
    private final String appCode;

    @NotNull
    private final String cardImg;

    @NotNull
    private final String cardName;

    @NotNull
    private final String cplc;

    @NotNull
    private final String deviceName;

    @NotNull
    private final String orderNo;
    private final boolean removable;

    @NotNull
    private final String removeRemark;

    public CloudCardVo(@NotNull String abf, @NotNull String cardImg, @NotNull String cardName, @NotNull String cplc, @NotNull String deviceName, @NotNull String orderNo, boolean z, @NotNull String removeRemark, @NotNull String appCode) {
        Intrinsics.checkNotNullParameter(abf, "abf");
        Intrinsics.checkNotNullParameter(cardImg, "cardImg");
        Intrinsics.checkNotNullParameter(cardName, "cardName");
        Intrinsics.checkNotNullParameter(cplc, "cplc");
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        Intrinsics.checkNotNullParameter(removeRemark, "removeRemark");
        Intrinsics.checkNotNullParameter(appCode, "appCode");
        this.abf = abf;
        this.cardImg = cardImg;
        this.cardName = cardName;
        this.cplc = cplc;
        this.deviceName = deviceName;
        this.orderNo = orderNo;
        this.removable = z;
        this.removeRemark = removeRemark;
        this.appCode = appCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAbf() {
        return this.abf;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCardImg() {
        return this.cardImg;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCardName() {
        return this.cardName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCplc() {
        return this.cplc;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOrderNo() {
        return this.orderNo;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getRemovable() {
        return this.removable;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRemoveRemark() {
        return this.removeRemark;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAppCode() {
        return this.appCode;
    }

    @NotNull
    public final CloudCardVo copy(@NotNull String abf, @NotNull String cardImg, @NotNull String cardName, @NotNull String cplc, @NotNull String deviceName, @NotNull String orderNo, boolean removable, @NotNull String removeRemark, @NotNull String appCode) {
        Intrinsics.checkNotNullParameter(abf, "abf");
        Intrinsics.checkNotNullParameter(cardImg, "cardImg");
        Intrinsics.checkNotNullParameter(cardName, "cardName");
        Intrinsics.checkNotNullParameter(cplc, "cplc");
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        Intrinsics.checkNotNullParameter(removeRemark, "removeRemark");
        Intrinsics.checkNotNullParameter(appCode, "appCode");
        return new CloudCardVo(abf, cardImg, cardName, cplc, deviceName, orderNo, removable, removeRemark, appCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudCardVo)) {
            return false;
        }
        CloudCardVo cloudCardVo = (CloudCardVo) other;
        return Intrinsics.areEqual(this.abf, cloudCardVo.abf) && Intrinsics.areEqual(this.cardImg, cloudCardVo.cardImg) && Intrinsics.areEqual(this.cardName, cloudCardVo.cardName) && Intrinsics.areEqual(this.cplc, cloudCardVo.cplc) && Intrinsics.areEqual(this.deviceName, cloudCardVo.deviceName) && Intrinsics.areEqual(this.orderNo, cloudCardVo.orderNo) && this.removable == cloudCardVo.removable && Intrinsics.areEqual(this.removeRemark, cloudCardVo.removeRemark) && Intrinsics.areEqual(this.appCode, cloudCardVo.appCode);
    }

    @NotNull
    public final String getAbf() {
        return this.abf;
    }

    @NotNull
    public final String getAppCode() {
        return this.appCode;
    }

    @NotNull
    public final String getCardImg() {
        return this.cardImg;
    }

    @NotNull
    public final String getCardName() {
        return this.cardName;
    }

    @NotNull
    public final String getCplc() {
        return this.cplc;
    }

    @NotNull
    public final String getDeviceName() {
        return this.deviceName;
    }

    @NotNull
    public final String getOrderNo() {
        return this.orderNo;
    }

    public final boolean getRemovable() {
        return this.removable;
    }

    @NotNull
    public final String getRemoveRemark() {
        return this.removeRemark;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    public int hashCode() {
        int iHashCode = ((((((((((this.abf.hashCode() * 31) + this.cardImg.hashCode()) * 31) + this.cardName.hashCode()) * 31) + this.cplc.hashCode()) * 31) + this.deviceName.hashCode()) * 31) + this.orderNo.hashCode()) * 31;
        boolean z = this.removable;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((iHashCode + r1) * 31) + this.removeRemark.hashCode()) * 31) + this.appCode.hashCode();
    }

    @NotNull
    public final ODeviceCardRspVO toODeviceCardRspVO() {
        ODeviceCardRspVO oDeviceCardRspVO = new ODeviceCardRspVO();
        oDeviceCardRspVO.setDisplayName(this.cardName);
        oDeviceCardRspVO.setIconUrl(this.cardImg);
        oDeviceCardRspVO.setCardType("6");
        oDeviceCardRspVO.setCardStatus(OtherDeviceCard.SHIFT_ABLE);
        oDeviceCardRspVO.setFlowNo(this.orderNo);
        oDeviceCardRspVO.setAbf(this.abf);
        oDeviceCardRspVO.setOtherDeviceCplc(this.cplc);
        oDeviceCardRspVO.setDeviceName(this.deviceName);
        oDeviceCardRspVO.setAppCode(this.appCode);
        oDeviceCardRspVO.setRemovable(Boolean.valueOf(this.removable));
        oDeviceCardRspVO.setRemoveRemark(this.removeRemark);
        return oDeviceCardRspVO;
    }

    @NotNull
    public String toString() {
        return "CloudCardVo(abf=" + this.abf + ", cardImg=" + this.cardImg + ", cardName=" + this.cardName + ", cplc=" + this.cplc + ", deviceName=" + this.deviceName + ", orderNo=" + this.orderNo + ", removable=" + this.removable + ", removeRemark=" + this.removeRemark + ", appCode=" + this.appCode + ")";
    }
}
