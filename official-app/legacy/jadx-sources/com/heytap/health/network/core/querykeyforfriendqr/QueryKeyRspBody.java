package com.heytap.health.network.core.querykeyforfriendqr;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/network/core/querykeyforfriendqr/QueryKeyRspBody;", "", "()V", "encryptionAlgorithm", "", "getEncryptionAlgorithm", "()I", "setEncryptionAlgorithm", "(I)V", "key", "", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "keyLength", "getKeyLength", "setKeyLength", "version", "", "getVersion", "()J", "setVersion", "(J)V", "toString", "lib_base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class QueryKeyRspBody {
    private int encryptionAlgorithm;

    @Nullable
    private String key;
    private int keyLength;
    private long version;

    public final int getEncryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    public final int getKeyLength() {
        return this.keyLength;
    }

    public final long getVersion() {
        return this.version;
    }

    public final void setEncryptionAlgorithm(int i) {
        this.encryptionAlgorithm = i;
    }

    public final void setKey(@Nullable String str) {
        this.key = str;
    }

    public final void setKeyLength(int i) {
        this.keyLength = i;
    }

    public final void setVersion(long j2) {
        this.version = j2;
    }

    @NotNull
    public String toString() {
        return "QueryKeyRspBody(encryptionAlgorithm=" + this.encryptionAlgorithm + ", keyLength=" + this.keyLength + ", key=" + this.key + ", version=" + this.version + ")";
    }
}
