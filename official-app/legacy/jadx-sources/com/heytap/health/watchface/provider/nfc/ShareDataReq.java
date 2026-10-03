package com.heytap.health.watchface.provider.nfc;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/watchface/provider/nfc/ShareDataReq;", "", "deviceId", "", "uris", "", "(Ljava/lang/String;Ljava/util/List;)V", "getDeviceId", "()Ljava/lang/String;", "getUris", "()Ljava/util/List;", "setUris", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ShareDataReq {

    @NotNull
    private final String deviceId;

    @NotNull
    private List<String> uris;

    public ShareDataReq(@NotNull String deviceId, @NotNull List<String> uris) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(uris, "uris");
        this.deviceId = deviceId;
        this.uris = uris;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShareDataReq copy$default(ShareDataReq shareDataReq, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareDataReq.deviceId;
        }
        if ((i & 2) != 0) {
            list = shareDataReq.uris;
        }
        return shareDataReq.copy(str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final List<String> component2() {
        return this.uris;
    }

    @NotNull
    public final ShareDataReq copy(@NotNull String deviceId, @NotNull List<String> uris) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(uris, "uris");
        return new ShareDataReq(deviceId, uris);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareDataReq)) {
            return false;
        }
        ShareDataReq shareDataReq = (ShareDataReq) other;
        return Intrinsics.areEqual(this.deviceId, shareDataReq.deviceId) && Intrinsics.areEqual(this.uris, shareDataReq.uris);
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final List<String> getUris() {
        return this.uris;
    }

    public int hashCode() {
        return (this.deviceId.hashCode() * 31) + this.uris.hashCode();
    }

    public final void setUris(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.uris = list;
    }

    @NotNull
    public String toString() {
        return "ShareDataReq(deviceId=" + this.deviceId + ", uris=" + this.uris + ")";
    }
}
