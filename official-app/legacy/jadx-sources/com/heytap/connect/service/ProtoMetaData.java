package com.heytap.connect.service;

import com.heytap.connect.config.connectid.ConnectIdLogic;
import com.heytap.connect.service.proto.LcConnectionMetaData;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b(\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004\"\u0004\b\f\u0010\tR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004\"\u0004\b\u000f\u0010\tR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004\"\u0004\b\u0012\u0010\tR$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004\"\u0004\b\u0015\u0010\tR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004\"\u0004\b\u0018\u0010\tR$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004\"\u0004\b\u001b\u0010\tR$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\u0004\"\u0004\b\u001e\u0010\tR$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\u0004\"\u0004\b!\u0010\tR$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\u0004\"\u0004\b$\u0010\tR$\u0010%\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\u0004\"\u0004\b'\u0010\t¨\u0006*"}, d2 = {"Lcom/heytap/connect/service/ProtoMetaData;", "", "", "toPBString", "()Ljava/lang/String;", "wifi_ssid", "Ljava/lang/String;", "getWifi_ssid", "setWifi_ssid", "(Ljava/lang/String;)V", "serverName", "getServerName", "setServerName", ConnectIdLogic.PARAM_EXT, "getExt", "setExt", "locationX", "getLocationX", "setLocationX", "appPackage", "getAppPackage", "setAppPackage", "duid", "getDuid", "setDuid", "model", "getModel", "setModel", "networkType", "getNetworkType", "setNetworkType", "locationY", "getLocationY", "setLocationY", "messageId", "getMessageId", "setMessageId", "ouid", "getOuid", "setOuid", "<init>", "()V", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class ProtoMetaData {

    @Nullable
    private String appPackage;

    @Nullable
    private String duid;

    @Nullable
    private String ext;

    @Nullable
    private String locationX;

    @Nullable
    private String locationY;

    @Nullable
    private String messageId;

    @Nullable
    private String model;

    @Nullable
    private String networkType;

    @Nullable
    private String ouid;

    @Nullable
    private String serverName;

    @Nullable
    private String wifi_ssid;

    @Nullable
    public final String getAppPackage() {
        return this.appPackage;
    }

    @Nullable
    public final String getDuid() {
        return this.duid;
    }

    @Nullable
    public final String getExt() {
        return this.ext;
    }

    @Nullable
    public final String getLocationX() {
        return this.locationX;
    }

    @Nullable
    public final String getLocationY() {
        return this.locationY;
    }

    @Nullable
    public final String getMessageId() {
        return this.messageId;
    }

    @Nullable
    public final String getModel() {
        return this.model;
    }

    @Nullable
    public final String getNetworkType() {
        return this.networkType;
    }

    @Nullable
    public final String getOuid() {
        return this.ouid;
    }

    @Nullable
    public final String getServerName() {
        return this.serverName;
    }

    @Nullable
    public final String getWifi_ssid() {
        return this.wifi_ssid;
    }

    public final void setAppPackage(@Nullable String str) {
        this.appPackage = str;
    }

    public final void setDuid(@Nullable String str) {
        this.duid = str;
    }

    public final void setExt(@Nullable String str) {
        this.ext = str;
    }

    public final void setLocationX(@Nullable String str) {
        this.locationX = str;
    }

    public final void setLocationY(@Nullable String str) {
        this.locationY = str;
    }

    public final void setMessageId(@Nullable String str) {
        this.messageId = str;
    }

    public final void setModel(@Nullable String str) {
        this.model = str;
    }

    public final void setNetworkType(@Nullable String str) {
        this.networkType = str;
    }

    public final void setOuid(@Nullable String str) {
        this.ouid = str;
    }

    public final void setServerName(@Nullable String str) {
        this.serverName = str;
    }

    public final void setWifi_ssid(@Nullable String str) {
        this.wifi_ssid = str;
    }

    @NotNull
    public final String toPBString() {
        byte[] bArrEncode = new LcConnectionMetaData(this.messageId, this.appPackage, this.networkType, this.locationX, this.locationY, this.wifi_ssid, this.model, this.duid, this.ouid, this.ext, this.serverName, null, 2048, null).encode();
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        Intrinsics.checkNotNullExpressionValue(ISO_8859_1, "ISO_8859_1");
        return new String(bArrEncode, ISO_8859_1);
    }
}
