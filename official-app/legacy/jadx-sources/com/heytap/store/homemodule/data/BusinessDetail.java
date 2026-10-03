package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import com.oplus.aiunit.vision.sbe;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000b8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u000b8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u000b8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001c\u0010\u0019\u001a\u00020\u000b8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001c\u0010\u001c\u001a\u00020\u000b8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\u001c\u0010\u001f\u001a\u00020\u000b8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR\u001c\u0010\"\u001a\u00020\u000b8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000fR\u001c\u0010%\u001a\u00020\u000b8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\r\"\u0004\b'\u0010\u000fR\u001c\u0010(\u001a\u00020\u000b8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\r\"\u0004\b*\u0010\u000fR\u001c\u0010+\u001a\u00020\u000b8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\r\"\u0004\b-\u0010\u000fR\u001c\u0010.\u001a\u00020/8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u00104\u001a\u00020/8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00101\"\u0004\b6\u00103R\u001c\u00107\u001a\u00020/8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00101\"\u0004\b9\u00103R\u001c\u0010:\u001a\u00020\u000b8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\r\"\u0004\b<\u0010\u000fR\u001c\u0010=\u001a\u00020\u000b8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\r\"\u0004\b?\u0010\u000fR\u001c\u0010@\u001a\u00020\u000b8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\r\"\u0004\bB\u0010\u000f¨\u0006C"}, d2 = {"Lcom/heytap/store/homemodule/data/BusinessDetail;", "", "()V", "currentDevice", "", "getCurrentDevice", "()Ljava/lang/Boolean;", "setCurrentDevice", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "deviceBrand", "", "getDeviceBrand", "()Ljava/lang/String;", "setDeviceBrand", "(Ljava/lang/String;)V", "deviceModel", "getDeviceModel", "setDeviceModel", ServiceNodeBundleKeys.DEVICE_NAME, "getDeviceName", "setDeviceName", "deviceType", "getDeviceType", "setDeviceType", "link", "getLink", "setLink", "maxSellPrice", "getMaxSellPrice", "setMaxSellPrice", "originalPrice", "getOriginalPrice", "setOriginalPrice", SensorsBean.PRICE, "getPrice", "setPrice", "productLink", "getProductLink", "setProductLink", sbe.PAY_SDK_PRODUCTNAME, "getProductName", "setProductName", "recycleLink", "getRecycleLink", "setRecycleLink", "roomId", "", "getRoomId", "()I", "setRoomId", "(I)V", "skuId", "getSkuId", "setSkuId", "steamId", "getSteamId", "setSteamId", "subsidyPrice", "getSubsidyPrice", "setSubsidyPrice", "text", "getText", ClickApiEntity.SET_TEXT, "url", "getUrl", "setUrl", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class BusinessDetail {

    @NotNull
    private String link = "";

    @NotNull
    private String originalPrice = "";

    @NotNull
    private String price = "";

    @NotNull
    private String text = "";
    private int roomId = -1;
    private int steamId = -1;
    private int skuId = -1;

    @NotNull
    private String url = "";

    @NotNull
    private String maxSellPrice = "";

    @NotNull
    private String subsidyPrice = "";

    @NotNull
    private String productName = "";

    @NotNull
    private String productLink = "";

    @NotNull
    private String recycleLink = "";

    @Nullable
    private String deviceName = "";

    @Nullable
    private String deviceType = "";

    @Nullable
    private String deviceBrand = "";

    @Nullable
    private String deviceModel = "";

    @Nullable
    private Boolean currentDevice = Boolean.FALSE;

    @Nullable
    public final Boolean getCurrentDevice() {
        Boolean bool = this.currentDevice;
        return bool == null ? Boolean.FALSE : bool;
    }

    @Nullable
    public final String getDeviceBrand() {
        String str = this.deviceBrand;
        return str == null ? "" : str;
    }

    @Nullable
    public final String getDeviceModel() {
        String str = this.deviceModel;
        return str == null ? "" : str;
    }

    @Nullable
    public final String getDeviceName() {
        String str = this.deviceName;
        return str == null ? "" : str;
    }

    @Nullable
    public final String getDeviceType() {
        String str = this.deviceType;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getLink() {
        String str = this.link;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getMaxSellPrice() {
        String str = this.maxSellPrice;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getOriginalPrice() {
        String str = this.originalPrice;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getPrice() {
        String str = this.price;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getProductLink() {
        String str = this.productLink;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getProductName() {
        String str = this.productName;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getRecycleLink() {
        String str = this.recycleLink;
        return str == null ? "" : str;
    }

    public final int getRoomId() {
        return this.roomId;
    }

    public final int getSkuId() {
        return this.skuId;
    }

    public final int getSteamId() {
        return this.steamId;
    }

    @NotNull
    public final String getSubsidyPrice() {
        String str = this.subsidyPrice;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getText() {
        String str = this.text;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getUrl() {
        String str = this.url;
        return str == null ? "" : str;
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

    public final void setLink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.link = str;
    }

    public final void setMaxSellPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.maxSellPrice = str;
    }

    public final void setOriginalPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.originalPrice = str;
    }

    public final void setPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.price = str;
    }

    public final void setProductLink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.productLink = str;
    }

    public final void setProductName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.productName = str;
    }

    public final void setRecycleLink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.recycleLink = str;
    }

    public final void setRoomId(int i) {
        this.roomId = i;
    }

    public final void setSkuId(int i) {
        this.skuId = i;
    }

    public final void setSteamId(int i) {
        this.steamId = i;
    }

    public final void setSubsidyPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subsidyPrice = str;
    }

    public final void setText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text = str;
    }

    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }
}
