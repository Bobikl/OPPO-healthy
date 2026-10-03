package com.heytap.health.watch.notification;

import androidx.annotation.Keep;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.health.settings.watch.sporthealthsettings2.ui.collaborationRelated.CloudDownloadWorker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity(primaryKeys = {"devices"}, tableName = "cloud_status")
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\n\"\u0004\b\f\u0010\rR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/watch/notification/NotificationCloudStatusBean;", "", "devices", "", "status", "", "setPassword", CloudDownloadWorker.KEY_SECRET, "(Ljava/lang/String;ZZLjava/lang/String;)V", "getDevices", "()Ljava/lang/String;", "getSecret", "setSecret", "(Ljava/lang/String;)V", "getSetPassword", "()Z", "setSetPassword", "(Z)V", "getStatus", "setStatus", "device_notification2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NotificationCloudStatusBean {

    @ColumnInfo(name = "devices")
    @NotNull
    private final String devices;

    @ColumnInfo(name = CloudDownloadWorker.KEY_SECRET)
    @Nullable
    private String secret;

    @ColumnInfo(name = "setPassword")
    private boolean setPassword;

    @ColumnInfo(name = "status")
    private boolean status;

    public NotificationCloudStatusBean(@NotNull String devices, boolean z, boolean z2, @Nullable String str) {
        Intrinsics.checkNotNullParameter(devices, "devices");
        this.devices = devices;
        this.status = z;
        this.setPassword = z2;
        this.secret = str;
    }

    @NotNull
    public final String getDevices() {
        return this.devices;
    }

    @Nullable
    public final String getSecret() {
        return this.secret;
    }

    public final boolean getSetPassword() {
        return this.setPassword;
    }

    public final boolean getStatus() {
        return this.status;
    }

    public final void setSecret(@Nullable String str) {
        this.secret = str;
    }

    public final void setSetPassword(boolean z) {
        this.setPassword = z;
    }

    public final void setStatus(boolean z) {
        this.status = z;
    }

    public /* synthetic */ NotificationCloudStatusBean(String str, boolean z, boolean z2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? "" : str2);
    }
}
