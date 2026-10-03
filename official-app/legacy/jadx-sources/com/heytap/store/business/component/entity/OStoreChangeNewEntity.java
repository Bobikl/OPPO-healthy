package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.sbe;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR\u001c\u0010\"\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000fR\u001c\u0010%\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\r\"\u0004\b'\u0010\u000fR\u001c\u0010(\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\r\"\u0004\b*\u0010\u000fR\u001e\u0010+\u001a\u0004\u0018\u00010,X\u0086\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00102\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\r\"\u0004\b4\u0010\u000f¨\u00065"}, d2 = {"Lcom/heytap/store/business/component/entity/OStoreChangeNewEntity;", "", "()V", "currentDevice", "", "getCurrentDevice", "()Ljava/lang/Boolean;", "setCurrentDevice", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "deviceBrand", "", "getDeviceBrand", "()Ljava/lang/String;", "setDeviceBrand", "(Ljava/lang/String;)V", "deviceModel", "getDeviceModel", "setDeviceModel", ServiceNodeBundleKeys.DEVICE_NAME, "getDeviceName", "setDeviceName", "deviceType", "getDeviceType", "setDeviceType", "headerInfo", "Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;", "getHeaderInfo", "()Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;", "setHeaderInfo", "(Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;)V", "maxSellPrice", "getMaxSellPrice", "setMaxSellPrice", "picUrl", "getPicUrl", "setPicUrl", sbe.PAY_SDK_PRODUCTNAME, "getProductName", "setProductName", "recycleLink", "getRecycleLink", "setRecycleLink", "recycleUseScene", "", "getRecycleUseScene", "()Ljava/lang/Integer;", "setRecycleUseScene", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "subsidyPrice", "getSubsidyPrice", "setSubsidyPrice", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OStoreChangeNewEntity {

    @Nullable
    private OStoreHeaderInfo headerInfo;

    @Nullable
    private String picUrl = "";

    @Nullable
    private String productName = "";

    @Nullable
    private Boolean currentDevice = Boolean.FALSE;

    @Nullable
    private String recycleLink = "";

    @Nullable
    private String maxSellPrice = "";

    @Nullable
    private String subsidyPrice = "";

    @Nullable
    private Integer recycleUseScene = 1;

    @Nullable
    private String deviceName = "";

    @Nullable
    private String deviceType = "";

    @Nullable
    private String deviceBrand = "";

    @Nullable
    private String deviceModel = "";

    @Nullable
    public final Boolean getCurrentDevice() {
        return this.currentDevice;
    }

    @Nullable
    public final String getDeviceBrand() {
        return this.deviceBrand;
    }

    @Nullable
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @Nullable
    public final String getDeviceName() {
        return this.deviceName;
    }

    @Nullable
    public final String getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    public final OStoreHeaderInfo getHeaderInfo() {
        return this.headerInfo;
    }

    @Nullable
    public final String getMaxSellPrice() {
        return this.maxSellPrice;
    }

    @Nullable
    public final String getPicUrl() {
        return this.picUrl;
    }

    @Nullable
    public final String getProductName() {
        return this.productName;
    }

    @Nullable
    public final String getRecycleLink() {
        return this.recycleLink;
    }

    @Nullable
    public final Integer getRecycleUseScene() {
        return this.recycleUseScene;
    }

    @Nullable
    public final String getSubsidyPrice() {
        return this.subsidyPrice;
    }

    public final void setCurrentDevice(@Nullable Boolean bool) {
        this.currentDevice = bool;
    }

    public final void setDeviceBrand(@Nullable String str) {
        this.deviceBrand = str;
    }

    public final void setDeviceModel(@Nullable String str) {
        this.deviceModel = str;
    }

    public final void setDeviceName(@Nullable String str) {
        this.deviceName = str;
    }

    public final void setDeviceType(@Nullable String str) {
        this.deviceType = str;
    }

    public final void setHeaderInfo(@Nullable OStoreHeaderInfo oStoreHeaderInfo) {
        this.headerInfo = oStoreHeaderInfo;
    }

    public final void setMaxSellPrice(@Nullable String str) {
        this.maxSellPrice = str;
    }

    public final void setPicUrl(@Nullable String str) {
        this.picUrl = str;
    }

    public final void setProductName(@Nullable String str) {
        this.productName = str;
    }

    public final void setRecycleLink(@Nullable String str) {
        this.recycleLink = str;
    }

    public final void setRecycleUseScene(@Nullable Integer num) {
        this.recycleUseScene = num;
    }

    public final void setSubsidyPrice(@Nullable String str) {
        this.subsidyPrice = str;
    }
}
