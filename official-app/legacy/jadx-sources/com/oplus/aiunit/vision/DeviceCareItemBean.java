package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.sb5, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\n\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/sb5;", "", "", "c", "", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "tips", "I", "getStatus", "()I", "status", "jumpUrl", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class DeviceCareItemBean {
    public static final int STATUS_EXPIRED = 1;
    public static final int STATUS_INVALID_SOON = 2;
    public static final int STATUS_NORMAL = 0;
    public static final int STATUS_NOT_PURCHASED = 3;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String tips;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int status;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String jumpUrl;

    public DeviceCareItemBean(@NotNull String tips, int i, @NotNull String jumpUrl) {
        Intrinsics.checkNotNullParameter(tips, "tips");
        Intrinsics.checkNotNullParameter(jumpUrl, "jumpUrl");
        this.tips = tips;
        this.status = i;
        this.jumpUrl = jumpUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTips() {
        return this.tips;
    }

    public final boolean c() {
        return this.status == 2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceCareItemBean)) {
            return false;
        }
        DeviceCareItemBean deviceCareItemBean = (DeviceCareItemBean) other;
        return Intrinsics.areEqual(this.tips, deviceCareItemBean.tips) && this.status == deviceCareItemBean.status && Intrinsics.areEqual(this.jumpUrl, deviceCareItemBean.jumpUrl);
    }

    public int hashCode() {
        return (((this.tips.hashCode() * 31) + Integer.hashCode(this.status)) * 31) + this.jumpUrl.hashCode();
    }

    @NotNull
    public String toString() {
        return "DeviceCareItemBean(tips=" + this.tips + ", status=" + this.status + ", jumpUrl=" + this.jumpUrl + ")";
    }
}
