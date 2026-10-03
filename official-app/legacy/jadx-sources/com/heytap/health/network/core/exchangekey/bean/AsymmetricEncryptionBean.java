package com.heytap.health.network.core.exchangekey.bean;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.d9f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.heytap.health.network.core.exchangekey.bean.ExchangeSymmetricKeyRsp, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/network/core/exchangekey/bean/ExchangeSymmetricKeyRsp;", "", "()V", "encryptionAlgorithm", "", "keyLength", d9f.PUBLIC_KEY, "", "getPublicKey", "()Ljava/lang/String;", "setPublicKey", "(Ljava/lang/String;)V", "publicKeyVersion", "", "getPublicKeyVersion", "()J", "setPublicKeyVersion", "(J)V", "symmetricKey", "getSymmetricKey", "setSymmetricKey", "toString", "lib_base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AsymmetricEncryptionBean {
    private int keyLength;

    @Nullable
    private String publicKey;
    private long publicKeyVersion;
    private int encryptionAlgorithm = 1;

    @NotNull
    private String symmetricKey = "";

    @Nullable
    public final String getPublicKey() {
        return this.publicKey;
    }

    public final long getPublicKeyVersion() {
        return this.publicKeyVersion;
    }

    @NotNull
    public final String getSymmetricKey() {
        return this.symmetricKey;
    }

    public final void setPublicKey(@Nullable String str) {
        this.publicKey = str;
    }

    public final void setPublicKeyVersion(long j2) {
        this.publicKeyVersion = j2;
    }

    public final void setSymmetricKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.symmetricKey = str;
    }

    @NotNull
    public String toString() {
        return "AsymmetricEncryptionBean(encryptionAlgorithm=" + this.encryptionAlgorithm + ", symmetricKey=" + this.symmetricKey + ", keyLength=" + this.keyLength + ", publicKey=" + this.publicKey + ", publicKeyVersion=" + this.publicKeyVersion + ")";
    }
}
