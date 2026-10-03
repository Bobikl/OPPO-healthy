package com.heytap.health.devicemanager.processor.bean;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.t04;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/devicemanager/processor/bean/UpdateVaidBean;", "", t04.DEVICE_UNIQUE_ID, "", "mobileVaid", "ssoid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeviceUniqueId", "()Ljava/lang/String;", "getMobileVaid", "getSsoid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "device_manager_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UpdateVaidBean {

    @NotNull
    private final String deviceUniqueId;

    @NotNull
    private final String mobileVaid;

    @NotNull
    private final String ssoid;

    public UpdateVaidBean(@NotNull String deviceUniqueId, @NotNull String mobileVaid, @NotNull String ssoid) {
        Intrinsics.checkNotNullParameter(deviceUniqueId, "deviceUniqueId");
        Intrinsics.checkNotNullParameter(mobileVaid, "mobileVaid");
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        this.deviceUniqueId = deviceUniqueId;
        this.mobileVaid = mobileVaid;
        this.ssoid = ssoid;
    }

    public static /* synthetic */ UpdateVaidBean copy$default(UpdateVaidBean updateVaidBean, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateVaidBean.deviceUniqueId;
        }
        if ((i & 2) != 0) {
            str2 = updateVaidBean.mobileVaid;
        }
        if ((i & 4) != 0) {
            str3 = updateVaidBean.ssoid;
        }
        return updateVaidBean.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMobileVaid() {
        return this.mobileVaid;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSsoid() {
        return this.ssoid;
    }

    @NotNull
    public final UpdateVaidBean copy(@NotNull String deviceUniqueId, @NotNull String mobileVaid, @NotNull String ssoid) {
        Intrinsics.checkNotNullParameter(deviceUniqueId, "deviceUniqueId");
        Intrinsics.checkNotNullParameter(mobileVaid, "mobileVaid");
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        return new UpdateVaidBean(deviceUniqueId, mobileVaid, ssoid);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateVaidBean)) {
            return false;
        }
        UpdateVaidBean updateVaidBean = (UpdateVaidBean) other;
        return Intrinsics.areEqual(this.deviceUniqueId, updateVaidBean.deviceUniqueId) && Intrinsics.areEqual(this.mobileVaid, updateVaidBean.mobileVaid) && Intrinsics.areEqual(this.ssoid, updateVaidBean.ssoid);
    }

    @NotNull
    public final String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    @NotNull
    public final String getMobileVaid() {
        return this.mobileVaid;
    }

    @NotNull
    public final String getSsoid() {
        return this.ssoid;
    }

    public int hashCode() {
        return (((this.deviceUniqueId.hashCode() * 31) + this.mobileVaid.hashCode()) * 31) + this.ssoid.hashCode();
    }

    @NotNull
    public String toString() {
        return "UpdateVaidBean(deviceUniqueId=" + this.deviceUniqueId + ", mobileVaid=" + this.mobileVaid + ", ssoid=" + this.ssoid + ")";
    }
}
