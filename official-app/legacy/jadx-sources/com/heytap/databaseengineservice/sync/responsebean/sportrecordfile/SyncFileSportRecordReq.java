package com.heytap.databaseengineservice.sync.responsebean.sportrecordfile;

import androidx.annotation.Keep;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import com.oplus.aiunit.vision.t04;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u00100\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001a\u0010'\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001aR\u001a\u0010*\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 R\u001a\u0010-\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0018\"\u0004\b/\u0010\u001a¨\u00061"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/sportrecordfile/SyncFileSportRecordReq;", "", "()V", "clientDataId", "", "getClientDataId", "()Ljava/lang/String;", "setClientDataId", "(Ljava/lang/String;)V", "clientFileId", "getClientFileId", "setClientFileId", "data", "getData", "setData", "deviceType", "getDeviceType", "setDeviceType", t04.DEVICE_UNIQUE_ID, "getDeviceUniqueId", "setDeviceUniqueId", "display", "", "getDisplay", "()I", "setDisplay", "(I)V", "endTimestamp", "", "getEndTimestamp", "()J", "setEndTimestamp", "(J)V", "metaData", "getMetaData", "setMetaData", "source", "getSource", "setSource", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "getSportMode", "setSportMode", "startTimestamp", "getStartTimestamp", "setStartTimestamp", "version", "getVersion", "setVersion", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SyncFileSportRecordReq {

    @Nullable
    private String clientDataId;

    @Nullable
    private String clientFileId;

    @Nullable
    private String data;

    @Nullable
    private String deviceType;

    @Nullable
    private String deviceUniqueId;
    private int display;

    @Nullable
    private String metaData;
    private int source;
    private int sportMode;
    private int version;
    private long startTimestamp = 1;
    private long endTimestamp = 1;

    @Nullable
    public final String getClientDataId() {
        return this.clientDataId;
    }

    @Nullable
    public final String getClientFileId() {
        return this.clientFileId;
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    @Nullable
    public final String getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    public final String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public final int getDisplay() {
        return this.display;
    }

    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    @Nullable
    public final String getMetaData() {
        return this.metaData;
    }

    public final int getSource() {
        return this.source;
    }

    public final int getSportMode() {
        return this.sportMode;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    public final int getVersion() {
        return this.version;
    }

    public final void setClientDataId(@Nullable String str) {
        this.clientDataId = str;
    }

    public final void setClientFileId(@Nullable String str) {
        this.clientFileId = str;
    }

    public final void setData(@Nullable String str) {
        this.data = str;
    }

    public final void setDeviceType(@Nullable String str) {
        this.deviceType = str;
    }

    public final void setDeviceUniqueId(@Nullable String str) {
        this.deviceUniqueId = str;
    }

    public final void setDisplay(int i) {
        this.display = i;
    }

    public final void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public final void setMetaData(@Nullable String str) {
        this.metaData = str;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    public final void setSportMode(int i) {
        this.sportMode = i;
    }

    public final void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    @NotNull
    public String toString() {
        return "SyncFileSportRecordReq(clientDataId=" + this.clientDataId + ", deviceUniqueId=" + this.deviceUniqueId + ", deviceType=" + this.deviceType + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", sportMode=" + this.sportMode + ", data=" + this.data + ", metaData=" + this.metaData + ", source=" + this.source + ", version=" + this.version + ", display=" + this.display + ", clientFileId=" + this.clientFileId + ")";
    }
}
