package com.heytap.databaseengineservice.sync.responsebean.sportrecordfile;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000e¨\u0006\""}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/sportrecordfile/PreSignUploadRsp;", "", "()V", "bizType", "", "getBizType", "()I", "setBizType", "(I)V", "clientFileId", "", "getClientFileId", "()Ljava/lang/String;", "setClientFileId", "(Ljava/lang/String;)V", "cloudFileName", "getCloudFileName", "setCloudFileName", "downFileUrl", "getDownFileUrl", "setDownFileUrl", "expireIn", "", "getExpireIn", "()J", "setExpireIn", "(J)V", "modifiedTimestamp", "getModifiedTimestamp", "setModifiedTimestamp", "ocsUrl", "getOcsUrl", "setOcsUrl", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PreSignUploadRsp {
    private int bizType = 5;

    @Nullable
    private String clientFileId;

    @Nullable
    private String cloudFileName;

    @Nullable
    private String downFileUrl;
    private long expireIn;
    private long modifiedTimestamp;

    @Nullable
    private String ocsUrl;

    public final int getBizType() {
        return this.bizType;
    }

    @Nullable
    public final String getClientFileId() {
        return this.clientFileId;
    }

    @Nullable
    public final String getCloudFileName() {
        return this.cloudFileName;
    }

    @Nullable
    public final String getDownFileUrl() {
        return this.downFileUrl;
    }

    public final long getExpireIn() {
        return this.expireIn;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @Nullable
    public final String getOcsUrl() {
        return this.ocsUrl;
    }

    public final void setBizType(int i) {
        this.bizType = i;
    }

    public final void setClientFileId(@Nullable String str) {
        this.clientFileId = str;
    }

    public final void setCloudFileName(@Nullable String str) {
        this.cloudFileName = str;
    }

    public final void setDownFileUrl(@Nullable String str) {
        this.downFileUrl = str;
    }

    public final void setExpireIn(long j2) {
        this.expireIn = j2;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setOcsUrl(@Nullable String str) {
        this.ocsUrl = str;
    }

    @NotNull
    public String toString() {
        return "PreSignUploadRsp(bizType=" + this.bizType + ", clientFileId=" + this.clientFileId + ", ocsUrl=" + this.ocsUrl + ", expireIn=" + this.expireIn + ", modifiedTimestamp=" + this.modifiedTimestamp + ", cloudFileName=" + this.cloudFileName + ", downFileUrl=" + this.downFileUrl + ")";
    }
}
