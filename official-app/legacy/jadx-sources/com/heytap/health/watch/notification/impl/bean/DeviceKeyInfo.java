package com.heytap.health.watch.notification.impl.bean;

import androidx.annotation.Keep;
import com.heytap.health.settings.watch.sporthealthsettings2.ui.collaborationRelated.CloudDownloadWorker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/watch/notification/impl/bean/DeviceKeyInfo;", "", "guid", "", "key", CloudDownloadWorker.KEY_SECRET, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGuid", "()Ljava/lang/String;", "getKey", "getSecret", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DeviceKeyInfo {

    @NotNull
    private final String guid;

    @NotNull
    private final String key;

    @NotNull
    private final String secret;

    public DeviceKeyInfo(@NotNull String guid, @NotNull String key, @NotNull String secret) {
        Intrinsics.checkNotNullParameter(guid, "guid");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(secret, "secret");
        this.guid = guid;
        this.key = key;
        this.secret = secret;
    }

    public static /* synthetic */ DeviceKeyInfo copy$default(DeviceKeyInfo deviceKeyInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceKeyInfo.guid;
        }
        if ((i & 2) != 0) {
            str2 = deviceKeyInfo.key;
        }
        if ((i & 4) != 0) {
            str3 = deviceKeyInfo.secret;
        }
        return deviceKeyInfo.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGuid() {
        return this.guid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSecret() {
        return this.secret;
    }

    @NotNull
    public final DeviceKeyInfo copy(@NotNull String guid, @NotNull String key, @NotNull String secret) {
        Intrinsics.checkNotNullParameter(guid, "guid");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(secret, "secret");
        return new DeviceKeyInfo(guid, key, secret);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceKeyInfo)) {
            return false;
        }
        DeviceKeyInfo deviceKeyInfo = (DeviceKeyInfo) other;
        return Intrinsics.areEqual(this.guid, deviceKeyInfo.guid) && Intrinsics.areEqual(this.key, deviceKeyInfo.key) && Intrinsics.areEqual(this.secret, deviceKeyInfo.secret);
    }

    @NotNull
    public final String getGuid() {
        return this.guid;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getSecret() {
        return this.secret;
    }

    public int hashCode() {
        return (((this.guid.hashCode() * 31) + this.key.hashCode()) * 31) + this.secret.hashCode();
    }

    @NotNull
    public String toString() {
        return "DeviceKeyInfo(guid=" + this.guid + ", key=" + this.key + ", secret=" + this.secret + ")";
    }
}
