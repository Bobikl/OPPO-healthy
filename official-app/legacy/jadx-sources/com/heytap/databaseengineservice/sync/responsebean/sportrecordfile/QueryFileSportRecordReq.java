package com.heytap.databaseengineservice.sync.responsebean.sportrecordfile;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/sportrecordfile/QueryFileSportRecordReq;", "", "()V", "encryptKeyEnc", "", "getEncryptKeyEnc", "()Ljava/lang/String;", "setEncryptKeyEnc", "(Ljava/lang/String;)V", "modifiedTime", "", "getModifiedTime", "()J", "setModifiedTime", "(J)V", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class QueryFileSportRecordReq {

    @Nullable
    private String encryptKeyEnc;
    private long modifiedTime;

    @Nullable
    public final String getEncryptKeyEnc() {
        return this.encryptKeyEnc;
    }

    public final long getModifiedTime() {
        return this.modifiedTime;
    }

    public final void setEncryptKeyEnc(@Nullable String str) {
        this.encryptKeyEnc = str;
    }

    public final void setModifiedTime(long j2) {
        this.modifiedTime = j2;
    }

    @NotNull
    public String toString() {
        return "QueryFileSportRecordReq(encryptKeyEnc=" + this.encryptKeyEnc + ", modifiedTime=" + this.modifiedTime + ")";
    }
}
