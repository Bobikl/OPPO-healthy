package com.heytap.health.watch.notification.impl.bean;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.iim;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/watch/notification/impl/bean/DevicePushReq;", "", "guid", "", "businessType", "", "content", iim.a.f, "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getBusinessType", "()I", "getContent", "()Ljava/lang/String;", "getDescription", "getGuid", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DevicePushReq {
    private final int businessType;

    @NotNull
    private final String content;

    @NotNull
    private final String description;

    @NotNull
    private final String guid;

    public DevicePushReq(@NotNull String guid, int i, @NotNull String content, @NotNull String description) {
        Intrinsics.checkNotNullParameter(guid, "guid");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(description, "description");
        this.guid = guid;
        this.businessType = i;
        this.content = content;
        this.description = description;
    }

    public static /* synthetic */ DevicePushReq copy$default(DevicePushReq devicePushReq, String str, int i, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = devicePushReq.guid;
        }
        if ((i2 & 2) != 0) {
            i = devicePushReq.businessType;
        }
        if ((i2 & 4) != 0) {
            str2 = devicePushReq.content;
        }
        if ((i2 & 8) != 0) {
            str3 = devicePushReq.description;
        }
        return devicePushReq.copy(str, i, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGuid() {
        return this.guid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBusinessType() {
        return this.businessType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final DevicePushReq copy(@NotNull String guid, int businessType, @NotNull String content, @NotNull String description) {
        Intrinsics.checkNotNullParameter(guid, "guid");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(description, "description");
        return new DevicePushReq(guid, businessType, content, description);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DevicePushReq)) {
            return false;
        }
        DevicePushReq devicePushReq = (DevicePushReq) other;
        return Intrinsics.areEqual(this.guid, devicePushReq.guid) && this.businessType == devicePushReq.businessType && Intrinsics.areEqual(this.content, devicePushReq.content) && Intrinsics.areEqual(this.description, devicePushReq.description);
    }

    public final int getBusinessType() {
        return this.businessType;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getGuid() {
        return this.guid;
    }

    public int hashCode() {
        return (((((this.guid.hashCode() * 31) + Integer.hashCode(this.businessType)) * 31) + this.content.hashCode()) * 31) + this.description.hashCode();
    }

    @NotNull
    public String toString() {
        return "DevicePushReq(guid=" + this.guid + ", businessType=" + this.businessType + ", content=" + this.content + ", description=" + this.description + ")";
    }

    public /* synthetic */ DevicePushReq(String str, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 2 : i, str2, str3);
    }
}
