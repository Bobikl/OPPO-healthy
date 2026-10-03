package com.heytap.health.esim.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.euicc.server.model.EUICCDeviceInfo;
import com.heytap.store.base.core.http.HttpConst;
import com.oplus.aiunit.vision.t04;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/esim/bean/ESIMCUEncryptReq;", "", "model", "", HttpConst.OTA_VERSION, t04.DEVICE_UNIQUE_ID, "unicomESimVO", "Lcom/euicc/server/model/EUICCDeviceInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/euicc/server/model/EUICCDeviceInfo;)V", "getDeviceUniqueId", "()Ljava/lang/String;", "getModel", "getOtaVersion", "getUnicomESimVO", "()Lcom/euicc/server/model/EUICCDeviceInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "esim_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ESIMCUEncryptReq {
    public static final int $stable = 8;

    @NotNull
    private final String deviceUniqueId;

    @NotNull
    private final String model;

    @NotNull
    private final String otaVersion;

    @NotNull
    private final EUICCDeviceInfo unicomESimVO;

    public ESIMCUEncryptReq(@NotNull String model, @NotNull String otaVersion, @NotNull String deviceUniqueId, @NotNull EUICCDeviceInfo unicomESimVO) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(otaVersion, "otaVersion");
        Intrinsics.checkNotNullParameter(deviceUniqueId, "deviceUniqueId");
        Intrinsics.checkNotNullParameter(unicomESimVO, "unicomESimVO");
        this.model = model;
        this.otaVersion = otaVersion;
        this.deviceUniqueId = deviceUniqueId;
        this.unicomESimVO = unicomESimVO;
    }

    public static /* synthetic */ ESIMCUEncryptReq copy$default(ESIMCUEncryptReq eSIMCUEncryptReq, String str, String str2, String str3, EUICCDeviceInfo eUICCDeviceInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eSIMCUEncryptReq.model;
        }
        if ((i & 2) != 0) {
            str2 = eSIMCUEncryptReq.otaVersion;
        }
        if ((i & 4) != 0) {
            str3 = eSIMCUEncryptReq.deviceUniqueId;
        }
        if ((i & 8) != 0) {
            eUICCDeviceInfo = eSIMCUEncryptReq.unicomESimVO;
        }
        return eSIMCUEncryptReq.copy(str, str2, str3, eUICCDeviceInfo);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOtaVersion() {
        return this.otaVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EUICCDeviceInfo getUnicomESimVO() {
        return this.unicomESimVO;
    }

    @NotNull
    public final ESIMCUEncryptReq copy(@NotNull String model, @NotNull String otaVersion, @NotNull String deviceUniqueId, @NotNull EUICCDeviceInfo unicomESimVO) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(otaVersion, "otaVersion");
        Intrinsics.checkNotNullParameter(deviceUniqueId, "deviceUniqueId");
        Intrinsics.checkNotNullParameter(unicomESimVO, "unicomESimVO");
        return new ESIMCUEncryptReq(model, otaVersion, deviceUniqueId, unicomESimVO);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ESIMCUEncryptReq)) {
            return false;
        }
        ESIMCUEncryptReq eSIMCUEncryptReq = (ESIMCUEncryptReq) other;
        return Intrinsics.areEqual(this.model, eSIMCUEncryptReq.model) && Intrinsics.areEqual(this.otaVersion, eSIMCUEncryptReq.otaVersion) && Intrinsics.areEqual(this.deviceUniqueId, eSIMCUEncryptReq.deviceUniqueId) && Intrinsics.areEqual(this.unicomESimVO, eSIMCUEncryptReq.unicomESimVO);
    }

    @NotNull
    public final String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getOtaVersion() {
        return this.otaVersion;
    }

    @NotNull
    public final EUICCDeviceInfo getUnicomESimVO() {
        return this.unicomESimVO;
    }

    public int hashCode() {
        return (((((this.model.hashCode() * 31) + this.otaVersion.hashCode()) * 31) + this.deviceUniqueId.hashCode()) * 31) + this.unicomESimVO.hashCode();
    }

    @NotNull
    public String toString() {
        return "ESIMCUEncryptReq(model=" + this.model + ", otaVersion=" + this.otaVersion + ", deviceUniqueId=" + this.deviceUniqueId + ", unicomESimVO=" + this.unicomESimVO + ")";
    }
}
