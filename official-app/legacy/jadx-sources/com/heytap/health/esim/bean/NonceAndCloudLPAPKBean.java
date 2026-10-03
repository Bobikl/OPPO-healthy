package com.heytap.health.esim.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/esim/bean/NonceAndCloudLPAPKBean;", "", "nonce", "", "lpaPubKey", "(Ljava/lang/String;Ljava/lang/String;)V", "getLpaPubKey", "()Ljava/lang/String;", "getNonce", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "esim_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class NonceAndCloudLPAPKBean {
    public static final int $stable = 0;

    @NotNull
    private final String lpaPubKey;

    @NotNull
    private final String nonce;

    public NonceAndCloudLPAPKBean(@NotNull String nonce, @NotNull String lpaPubKey) {
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(lpaPubKey, "lpaPubKey");
        this.nonce = nonce;
        this.lpaPubKey = lpaPubKey;
    }

    public static /* synthetic */ NonceAndCloudLPAPKBean copy$default(NonceAndCloudLPAPKBean nonceAndCloudLPAPKBean, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nonceAndCloudLPAPKBean.nonce;
        }
        if ((i & 2) != 0) {
            str2 = nonceAndCloudLPAPKBean.lpaPubKey;
        }
        return nonceAndCloudLPAPKBean.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNonce() {
        return this.nonce;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLpaPubKey() {
        return this.lpaPubKey;
    }

    @NotNull
    public final NonceAndCloudLPAPKBean copy(@NotNull String nonce, @NotNull String lpaPubKey) {
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(lpaPubKey, "lpaPubKey");
        return new NonceAndCloudLPAPKBean(nonce, lpaPubKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NonceAndCloudLPAPKBean)) {
            return false;
        }
        NonceAndCloudLPAPKBean nonceAndCloudLPAPKBean = (NonceAndCloudLPAPKBean) other;
        return Intrinsics.areEqual(this.nonce, nonceAndCloudLPAPKBean.nonce) && Intrinsics.areEqual(this.lpaPubKey, nonceAndCloudLPAPKBean.lpaPubKey);
    }

    @NotNull
    public final String getLpaPubKey() {
        return this.lpaPubKey;
    }

    @NotNull
    public final String getNonce() {
        return this.nonce;
    }

    public int hashCode() {
        return (this.nonce.hashCode() * 31) + this.lpaPubKey.hashCode();
    }

    @NotNull
    public String toString() {
        return "NonceAndCloudLPAPKBean(nonce=" + this.nonce + ", lpaPubKey=" + this.lpaPubKey + ")";
    }
}
