package com.heytap.databaseengineservice.sync.responsebean.sportrecordfile;

import androidx.annotation.Keep;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import com.oplus.aiunit.vision.t04;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001:\u0001@B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010?\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u001c\u0010'\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001a\u0010*\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R\u001c\u0010-\u001a\u0004\u0018\u00010.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0012\"\u0004\b5\u0010\u0014R\u001a\u00106\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0012\"\u0004\b8\u0010\u0014R\u001a\u00109\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010!\"\u0004\b;\u0010#R\u001a\u0010<\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0012\"\u0004\b>\u0010\u0014¨\u0006A"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/sportrecordfile/QueryFileSportRecordRsp;", "", "()V", "clientDataId", "", "getClientDataId", "()Ljava/lang/String;", "setClientDataId", "(Ljava/lang/String;)V", "clientFileId", "getClientFileId", "setClientFileId", "data", "getData", "setData", "del", "", "getDel", "()I", "setDel", "(I)V", "deviceType", "getDeviceType", "setDeviceType", t04.DEVICE_UNIQUE_ID, "getDeviceUniqueId", "setDeviceUniqueId", "display", "getDisplay", "setDisplay", "endTimestamp", "", "getEndTimestamp", "()J", "setEndTimestamp", "(J)V", "id", "getId", "setId", "metaData", "getMetaData", "setMetaData", "modifiedTime", "getModifiedTime", "setModifiedTime", "preSign", "Lcom/heytap/databaseengineservice/sync/responsebean/sportrecordfile/QueryFileSportRecordRsp$PreSignDownloadVO;", "getPreSign", "()Lcom/heytap/databaseengineservice/sync/responsebean/sportrecordfile/QueryFileSportRecordRsp$PreSignDownloadVO;", "setPreSign", "(Lcom/heytap/databaseengineservice/sync/responsebean/sportrecordfile/QueryFileSportRecordRsp$PreSignDownloadVO;)V", "source", "getSource", "setSource", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "getSportMode", "setSportMode", "startTimestamp", "getStartTimestamp", "setStartTimestamp", "version", "getVersion", "setVersion", "toString", "PreSignDownloadVO", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class QueryFileSportRecordRsp {

    @Nullable
    private String clientDataId;

    @Nullable
    private String clientFileId;

    @Nullable
    private String data;
    private int del;

    @Nullable
    private String deviceType;

    @Nullable
    private String deviceUniqueId;
    private int display;
    private long id;

    @Nullable
    private String metaData;
    private long modifiedTime;

    @Nullable
    private PreSignDownloadVO preSign;
    private int source;
    private int sportMode;
    private int version;
    private long startTimestamp = 1;
    private long endTimestamp = 1;

    @Keep
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u00100\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\u001c\u0010$\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR\u001c\u0010'\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u000eR\u001c\u0010*\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010\u000eR\u001a\u0010-\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001e\"\u0004\b/\u0010 ¨\u00061"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/sportrecordfile/QueryFileSportRecordRsp$PreSignDownloadVO;", "", "()V", "bizType", "", "getBizType", "()I", "setBizType", "(I)V", "clientFileId", "", "getClientFileId", "()Ljava/lang/String;", "setClientFileId", "(Ljava/lang/String;)V", "deviceId", "getDeviceId", "setDeviceId", "encryptKeyEnc", "getEncryptKeyEnc", "setEncryptKeyEnc", "encrypted", "", "getEncrypted", "()Z", "setEncrypted", "(Z)V", "endTimestamp", "", "getEndTimestamp", "()J", "setEndTimestamp", "(J)V", "expireIn", "getExpireIn", "setExpireIn", "fileMd5", "getFileMd5", "setFileMd5", "fileSuffix", "getFileSuffix", "setFileSuffix", "ocsUrl", "getOcsUrl", "setOcsUrl", "startTimestamp", "getStartTimestamp", "setStartTimestamp", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PreSignDownloadVO {
        private int bizType;

        @Nullable
        private String clientFileId;

        @Nullable
        private String deviceId;

        @Nullable
        private String encryptKeyEnc;
        private boolean encrypted = true;
        private long endTimestamp;
        private long expireIn;

        @Nullable
        private String fileMd5;

        @Nullable
        private String fileSuffix;

        @Nullable
        private String ocsUrl;
        private long startTimestamp;

        public final int getBizType() {
            return this.bizType;
        }

        @Nullable
        public final String getClientFileId() {
            return this.clientFileId;
        }

        @Nullable
        public final String getDeviceId() {
            return this.deviceId;
        }

        @Nullable
        public final String getEncryptKeyEnc() {
            return this.encryptKeyEnc;
        }

        public final boolean getEncrypted() {
            return this.encrypted;
        }

        public final long getEndTimestamp() {
            return this.endTimestamp;
        }

        public final long getExpireIn() {
            return this.expireIn;
        }

        @Nullable
        public final String getFileMd5() {
            return this.fileMd5;
        }

        @Nullable
        public final String getFileSuffix() {
            return this.fileSuffix;
        }

        @Nullable
        public final String getOcsUrl() {
            return this.ocsUrl;
        }

        public final long getStartTimestamp() {
            return this.startTimestamp;
        }

        public final void setBizType(int i) {
            this.bizType = i;
        }

        public final void setClientFileId(@Nullable String str) {
            this.clientFileId = str;
        }

        public final void setDeviceId(@Nullable String str) {
            this.deviceId = str;
        }

        public final void setEncryptKeyEnc(@Nullable String str) {
            this.encryptKeyEnc = str;
        }

        public final void setEncrypted(boolean z) {
            this.encrypted = z;
        }

        public final void setEndTimestamp(long j2) {
            this.endTimestamp = j2;
        }

        public final void setExpireIn(long j2) {
            this.expireIn = j2;
        }

        public final void setFileMd5(@Nullable String str) {
            this.fileMd5 = str;
        }

        public final void setFileSuffix(@Nullable String str) {
            this.fileSuffix = str;
        }

        public final void setOcsUrl(@Nullable String str) {
            this.ocsUrl = str;
        }

        public final void setStartTimestamp(long j2) {
            this.startTimestamp = j2;
        }

        @NotNull
        public String toString() {
            return "PreSignDownloadVO(bizType=" + this.bizType + ", deviceId=" + this.deviceId + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", clientFileId=" + this.clientFileId + ", fileSuffix=" + this.fileSuffix + ", fileMd5=" + this.fileMd5 + ", encrypted=" + this.encrypted + ", encryptKeyEnc=" + this.encryptKeyEnc + ", ocsUrl=" + this.ocsUrl + ", expireIn=" + this.expireIn + ")";
        }
    }

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

    public final int getDel() {
        return this.del;
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

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final String getMetaData() {
        return this.metaData;
    }

    public final long getModifiedTime() {
        return this.modifiedTime;
    }

    @Nullable
    public final PreSignDownloadVO getPreSign() {
        return this.preSign;
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

    public final void setDel(int i) {
        this.del = i;
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

    public final void setId(long j2) {
        this.id = j2;
    }

    public final void setMetaData(@Nullable String str) {
        this.metaData = str;
    }

    public final void setModifiedTime(long j2) {
        this.modifiedTime = j2;
    }

    public final void setPreSign(@Nullable PreSignDownloadVO preSignDownloadVO) {
        this.preSign = preSignDownloadVO;
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
        return "QueryFileSportRecordRsp(id=" + this.id + ", clientDataId=" + this.clientDataId + ", deviceUniqueId=" + this.deviceUniqueId + ", deviceType=" + this.deviceType + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", sportMode=" + this.sportMode + ", preSign=" + this.preSign + ", metaData=" + this.metaData + ", version=" + this.version + ", display=" + this.display + ", modifiedTime=" + this.modifiedTime + ", del=" + this.del + ", source=" + this.source + ", data=" + this.data + ")";
    }
}
