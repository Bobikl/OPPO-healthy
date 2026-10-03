package com.heytap.health.devicemanager.event;

import androidx.annotation.Keep;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\f\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u0011\u001a\u00020\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/devicemanager/event/DMReasonBean;", "", "msg", "", "(Ljava/lang/String;)V", ServiceNodeBundleKeys.DEVICE_NAME, "getDeviceName", "()Ljava/lang/String;", "setDeviceName", "mac", "getMac", "setMac", "component1", "copy", "equals", "", "other", "getStageReason", "hashCode", "", "toString", "device_manager_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DMReasonBean {

    @NotNull
    private String deviceName;

    @NotNull
    private String mac;

    @NotNull
    private final String msg;

    public DMReasonBean(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.msg = msg;
        this.mac = "";
        this.deviceName = "";
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getMsg() {
        return this.msg;
    }

    public static /* synthetic */ DMReasonBean copy$default(DMReasonBean dMReasonBean, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dMReasonBean.msg;
        }
        return dMReasonBean.copy(str);
    }

    @NotNull
    public final DMReasonBean copy(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return new DMReasonBean(msg);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DMReasonBean) && Intrinsics.areEqual(this.msg, ((DMReasonBean) other).msg);
    }

    @NotNull
    public final String getDeviceName() {
        return this.deviceName;
    }

    @NotNull
    public final String getMac() {
        return this.mac;
    }

    @NotNull
    public final String getStageReason() {
        return "msg=" + this.msg + "&name=" + this.deviceName;
    }

    public int hashCode() {
        return this.msg.hashCode();
    }

    public final void setDeviceName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceName = str;
    }

    public final void setMac(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mac = str;
    }

    @NotNull
    public String toString() {
        return "DMReasonBean(msg=" + this.msg + ")";
    }
}
