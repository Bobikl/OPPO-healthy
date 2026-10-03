package com.heytap.databaseengineservice.sync.responsebean.sportrecordfile;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/sportrecordfile/FileKeyRsp;", "", "()V", "encryptKeyEnc", "", "getEncryptKeyEnc", "()Ljava/lang/String;", "setEncryptKeyEnc", "(Ljava/lang/String;)V", "encryptKeyId", "getEncryptKeyId", "setEncryptKeyId", "expireIn", "", "getExpireIn", "()J", "setExpireIn", "(J)V", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FileKeyRsp {

    @Nullable
    private String encryptKeyEnc;

    @Nullable
    private String encryptKeyId;
    private long expireIn;

    @Nullable
    public final String getEncryptKeyEnc() {
        return this.encryptKeyEnc;
    }

    @Nullable
    public final String getEncryptKeyId() {
        return this.encryptKeyId;
    }

    public final long getExpireIn() {
        return this.expireIn;
    }

    public final void setEncryptKeyEnc(@Nullable String str) {
        this.encryptKeyEnc = str;
    }

    public final void setEncryptKeyId(@Nullable String str) {
        this.encryptKeyId = str;
    }

    public final void setExpireIn(long j2) {
        this.expireIn = j2;
    }

    @NotNull
    public String toString() {
        return "FileKeyRsp(encryptKeyEnc=" + this.encryptKeyEnc + ", encryptKeyId=" + this.encryptKeyId + ", expireIn=" + this.expireIn + ")";
    }
}
