package com.oplus.pantaconnect.sdk.connectionservice.connection;

import com.oplus.pantaconnect.sdk.DeviceType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/connection/QrCodeRequestOption;", "Lcom/oplus/pantaconnect/sdk/connectionservice/connection/DeviceBaseOption;", "qrCodeType", "Lcom/oplus/pantaconnect/sdk/connectionservice/connection/QrCodeType;", "deviceType", "Lcom/oplus/pantaconnect/sdk/DeviceType;", "modelId", "", "(Lcom/oplus/pantaconnect/sdk/connectionservice/connection/QrCodeType;Lcom/oplus/pantaconnect/sdk/DeviceType;Ljava/lang/String;)V", "getDeviceType", "()Lcom/oplus/pantaconnect/sdk/DeviceType;", "getModelId", "()Ljava/lang/String;", "getQrCodeType", "()Lcom/oplus/pantaconnect/sdk/connectionservice/connection/QrCodeType;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class QrCodeRequestOption implements DeviceBaseOption {

    @NotNull
    private final DeviceType deviceType;

    @NotNull
    private final String modelId;

    @NotNull
    private final QrCodeType qrCodeType;

    public QrCodeRequestOption(@NotNull QrCodeType qrCodeType, @NotNull DeviceType deviceType, @NotNull String str) {
        this.qrCodeType = qrCodeType;
        this.deviceType = deviceType;
        this.modelId = str;
    }

    public static /* synthetic */ QrCodeRequestOption copy$default(QrCodeRequestOption qrCodeRequestOption, QrCodeType qrCodeType, DeviceType deviceType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            qrCodeType = qrCodeRequestOption.qrCodeType;
        }
        if ((i & 2) != 0) {
            deviceType = qrCodeRequestOption.deviceType;
        }
        if ((i & 4) != 0) {
            str = qrCodeRequestOption.modelId;
        }
        return qrCodeRequestOption.copy(qrCodeType, deviceType, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final QrCodeType getQrCodeType() {
        return this.qrCodeType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getModelId() {
        return this.modelId;
    }

    @NotNull
    public final QrCodeRequestOption copy(@NotNull QrCodeType qrCodeType, @NotNull DeviceType deviceType, @NotNull String modelId) {
        return new QrCodeRequestOption(qrCodeType, deviceType, modelId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrCodeRequestOption)) {
            return false;
        }
        QrCodeRequestOption qrCodeRequestOption = (QrCodeRequestOption) other;
        return this.qrCodeType == qrCodeRequestOption.qrCodeType && this.deviceType == qrCodeRequestOption.deviceType && Intrinsics.areEqual(this.modelId, qrCodeRequestOption.modelId);
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.connection.DeviceBaseOption
    @NotNull
    public DeviceType getDeviceType() {
        return this.deviceType;
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.connection.DeviceBaseOption
    @NotNull
    public String getModelId() {
        return this.modelId;
    }

    @NotNull
    public final QrCodeType getQrCodeType() {
        return this.qrCodeType;
    }

    public int hashCode() {
        return this.modelId.hashCode() + ((this.deviceType.hashCode() + (this.qrCodeType.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "QrCodeRequestOption(qrCodeType=" + this.qrCodeType + ", deviceType=" + this.deviceType + ", modelId=" + this.modelId + ')';
    }
}
