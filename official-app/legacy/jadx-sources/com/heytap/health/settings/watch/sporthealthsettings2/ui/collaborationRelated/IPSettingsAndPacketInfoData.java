package com.heytap.health.settings.watch.sporthealthsettings2.ui.collaborationRelated;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.protocol.dm.DMProto$SettingItem;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006¢\u0006\u0002\u0010\u0010J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\t\u00103\u001a\u00020\u0006HÆ\u0003J\u007f\u00104\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0006HÆ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\u0006HÖ\u0001J\t\u00109\u001a\u00020:HÖ\u0001R\u001a\u0010\n\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\f\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001a\u0010\u000f\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R\u001a\u0010\r\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010\u0014¨\u0006;"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/collaborationRelated/IPSettingsAndPacketInfoData;", "", "switches", "", "Lcom/heytap/health/protocol/dm/DMProto$SettingItem;", "downloadStatus", "", "sendStatus", "cloudStatus", "watchStatus", "cloudPacketVersion", "watchPacketVersion", "cloudProgress", "watchProgress", "transmissionStatus", "downloadAndSendResult", "(Ljava/util/List;IIIIIIIIII)V", "getCloudPacketVersion", "()I", "setCloudPacketVersion", "(I)V", "getCloudProgress", "setCloudProgress", "getCloudStatus", "setCloudStatus", "getDownloadAndSendResult", "setDownloadAndSendResult", "getDownloadStatus", "setDownloadStatus", "getSendStatus", "setSendStatus", "getSwitches", "()Ljava/util/List;", "getTransmissionStatus", "setTransmissionStatus", "getWatchPacketVersion", "setWatchPacketVersion", "getWatchProgress", "setWatchProgress", "getWatchStatus", "setWatchStatus", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class IPSettingsAndPacketInfoData {
    public static final int $stable = 8;
    private int cloudPacketVersion;
    private int cloudProgress;
    private int cloudStatus;
    private int downloadAndSendResult;
    private int downloadStatus;
    private int sendStatus;

    @Nullable
    private final List<DMProto$SettingItem> switches;
    private int transmissionStatus;
    private int watchPacketVersion;
    private int watchProgress;
    private int watchStatus;

    public IPSettingsAndPacketInfoData() {
        this(null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2047, null);
    }

    @Nullable
    public final List<DMProto$SettingItem> component1() {
        return this.switches;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getTransmissionStatus() {
        return this.transmissionStatus;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getDownloadAndSendResult() {
        return this.downloadAndSendResult;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDownloadStatus() {
        return this.downloadStatus;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSendStatus() {
        return this.sendStatus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCloudStatus() {
        return this.cloudStatus;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getWatchStatus() {
        return this.watchStatus;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getCloudPacketVersion() {
        return this.cloudPacketVersion;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getWatchPacketVersion() {
        return this.watchPacketVersion;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getCloudProgress() {
        return this.cloudProgress;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getWatchProgress() {
        return this.watchProgress;
    }

    @NotNull
    public final IPSettingsAndPacketInfoData copy(@Nullable List<DMProto$SettingItem> switches, int downloadStatus, int sendStatus, int cloudStatus, int watchStatus, int cloudPacketVersion, int watchPacketVersion, int cloudProgress, int watchProgress, int transmissionStatus, int downloadAndSendResult) {
        return new IPSettingsAndPacketInfoData(switches, downloadStatus, sendStatus, cloudStatus, watchStatus, cloudPacketVersion, watchPacketVersion, cloudProgress, watchProgress, transmissionStatus, downloadAndSendResult);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IPSettingsAndPacketInfoData)) {
            return false;
        }
        IPSettingsAndPacketInfoData iPSettingsAndPacketInfoData = (IPSettingsAndPacketInfoData) other;
        return Intrinsics.areEqual(this.switches, iPSettingsAndPacketInfoData.switches) && this.downloadStatus == iPSettingsAndPacketInfoData.downloadStatus && this.sendStatus == iPSettingsAndPacketInfoData.sendStatus && this.cloudStatus == iPSettingsAndPacketInfoData.cloudStatus && this.watchStatus == iPSettingsAndPacketInfoData.watchStatus && this.cloudPacketVersion == iPSettingsAndPacketInfoData.cloudPacketVersion && this.watchPacketVersion == iPSettingsAndPacketInfoData.watchPacketVersion && this.cloudProgress == iPSettingsAndPacketInfoData.cloudProgress && this.watchProgress == iPSettingsAndPacketInfoData.watchProgress && this.transmissionStatus == iPSettingsAndPacketInfoData.transmissionStatus && this.downloadAndSendResult == iPSettingsAndPacketInfoData.downloadAndSendResult;
    }

    public final int getCloudPacketVersion() {
        return this.cloudPacketVersion;
    }

    public final int getCloudProgress() {
        return this.cloudProgress;
    }

    public final int getCloudStatus() {
        return this.cloudStatus;
    }

    public final int getDownloadAndSendResult() {
        return this.downloadAndSendResult;
    }

    public final int getDownloadStatus() {
        return this.downloadStatus;
    }

    public final int getSendStatus() {
        return this.sendStatus;
    }

    @Nullable
    public final List<DMProto$SettingItem> getSwitches() {
        return this.switches;
    }

    public final int getTransmissionStatus() {
        return this.transmissionStatus;
    }

    public final int getWatchPacketVersion() {
        return this.watchPacketVersion;
    }

    public final int getWatchProgress() {
        return this.watchProgress;
    }

    public final int getWatchStatus() {
        return this.watchStatus;
    }

    public int hashCode() {
        List<DMProto$SettingItem> list = this.switches;
        return ((((((((((((((((((((list == null ? 0 : list.hashCode()) * 31) + Integer.hashCode(this.downloadStatus)) * 31) + Integer.hashCode(this.sendStatus)) * 31) + Integer.hashCode(this.cloudStatus)) * 31) + Integer.hashCode(this.watchStatus)) * 31) + Integer.hashCode(this.cloudPacketVersion)) * 31) + Integer.hashCode(this.watchPacketVersion)) * 31) + Integer.hashCode(this.cloudProgress)) * 31) + Integer.hashCode(this.watchProgress)) * 31) + Integer.hashCode(this.transmissionStatus)) * 31) + Integer.hashCode(this.downloadAndSendResult);
    }

    public final void setCloudPacketVersion(int i) {
        this.cloudPacketVersion = i;
    }

    public final void setCloudProgress(int i) {
        this.cloudProgress = i;
    }

    public final void setCloudStatus(int i) {
        this.cloudStatus = i;
    }

    public final void setDownloadAndSendResult(int i) {
        this.downloadAndSendResult = i;
    }

    public final void setDownloadStatus(int i) {
        this.downloadStatus = i;
    }

    public final void setSendStatus(int i) {
        this.sendStatus = i;
    }

    public final void setTransmissionStatus(int i) {
        this.transmissionStatus = i;
    }

    public final void setWatchPacketVersion(int i) {
        this.watchPacketVersion = i;
    }

    public final void setWatchProgress(int i) {
        this.watchProgress = i;
    }

    public final void setWatchStatus(int i) {
        this.watchStatus = i;
    }

    @NotNull
    public String toString() {
        return "IPSettingsAndPacketInfoData(switches=" + this.switches + ", downloadStatus=" + this.downloadStatus + ", sendStatus=" + this.sendStatus + ", cloudStatus=" + this.cloudStatus + ", watchStatus=" + this.watchStatus + ", cloudPacketVersion=" + this.cloudPacketVersion + ", watchPacketVersion=" + this.watchPacketVersion + ", cloudProgress=" + this.cloudProgress + ", watchProgress=" + this.watchProgress + ", transmissionStatus=" + this.transmissionStatus + ", downloadAndSendResult=" + this.downloadAndSendResult + ")";
    }

    public IPSettingsAndPacketInfoData(@Nullable List<DMProto$SettingItem> list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.switches = list;
        this.downloadStatus = i;
        this.sendStatus = i2;
        this.cloudStatus = i3;
        this.watchStatus = i4;
        this.cloudPacketVersion = i5;
        this.watchPacketVersion = i6;
        this.cloudProgress = i7;
        this.watchProgress = i8;
        this.transmissionStatus = i9;
        this.downloadAndSendResult = i10;
    }

    public /* synthetic */ IPSettingsAndPacketInfoData(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? 0 : i, (i11 & 4) != 0 ? 0 : i2, (i11 & 8) != 0 ? 0 : i3, (i11 & 16) != 0 ? 0 : i4, (i11 & 32) != 0 ? 0 : i5, (i11 & 64) != 0 ? 0 : i6, (i11 & 128) != 0 ? 0 : i7, (i11 & 256) != 0 ? 0 : i8, (i11 & 512) != 0 ? 0 : i9, (i11 & 1024) == 0 ? i10 : 0);
    }
}
