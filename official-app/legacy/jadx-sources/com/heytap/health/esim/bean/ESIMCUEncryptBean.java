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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/esim/bean/ESIMCUEncryptBean;", "", "mCiphertext", "", "mCiphertextSign", "mOsVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMCiphertext", "()Ljava/lang/String;", "getMCiphertextSign", "getMOsVersion", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "esim_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ESIMCUEncryptBean {
    public static final int $stable = 0;

    @NotNull
    private final String mCiphertext;

    @NotNull
    private final String mCiphertextSign;

    @NotNull
    private final String mOsVersion;

    public ESIMCUEncryptBean(@NotNull String mCiphertext, @NotNull String mCiphertextSign, @NotNull String mOsVersion) {
        Intrinsics.checkNotNullParameter(mCiphertext, "mCiphertext");
        Intrinsics.checkNotNullParameter(mCiphertextSign, "mCiphertextSign");
        Intrinsics.checkNotNullParameter(mOsVersion, "mOsVersion");
        this.mCiphertext = mCiphertext;
        this.mCiphertextSign = mCiphertextSign;
        this.mOsVersion = mOsVersion;
    }

    public static /* synthetic */ ESIMCUEncryptBean copy$default(ESIMCUEncryptBean eSIMCUEncryptBean, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eSIMCUEncryptBean.mCiphertext;
        }
        if ((i & 2) != 0) {
            str2 = eSIMCUEncryptBean.mCiphertextSign;
        }
        if ((i & 4) != 0) {
            str3 = eSIMCUEncryptBean.mOsVersion;
        }
        return eSIMCUEncryptBean.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMCiphertext() {
        return this.mCiphertext;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMCiphertextSign() {
        return this.mCiphertextSign;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMOsVersion() {
        return this.mOsVersion;
    }

    @NotNull
    public final ESIMCUEncryptBean copy(@NotNull String mCiphertext, @NotNull String mCiphertextSign, @NotNull String mOsVersion) {
        Intrinsics.checkNotNullParameter(mCiphertext, "mCiphertext");
        Intrinsics.checkNotNullParameter(mCiphertextSign, "mCiphertextSign");
        Intrinsics.checkNotNullParameter(mOsVersion, "mOsVersion");
        return new ESIMCUEncryptBean(mCiphertext, mCiphertextSign, mOsVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ESIMCUEncryptBean)) {
            return false;
        }
        ESIMCUEncryptBean eSIMCUEncryptBean = (ESIMCUEncryptBean) other;
        return Intrinsics.areEqual(this.mCiphertext, eSIMCUEncryptBean.mCiphertext) && Intrinsics.areEqual(this.mCiphertextSign, eSIMCUEncryptBean.mCiphertextSign) && Intrinsics.areEqual(this.mOsVersion, eSIMCUEncryptBean.mOsVersion);
    }

    @NotNull
    public final String getMCiphertext() {
        return this.mCiphertext;
    }

    @NotNull
    public final String getMCiphertextSign() {
        return this.mCiphertextSign;
    }

    @NotNull
    public final String getMOsVersion() {
        return this.mOsVersion;
    }

    public int hashCode() {
        return (((this.mCiphertext.hashCode() * 31) + this.mCiphertextSign.hashCode()) * 31) + this.mOsVersion.hashCode();
    }

    @NotNull
    public String toString() {
        return "ESIMCUEncryptBean(mCiphertext=" + this.mCiphertext + ", mCiphertextSign=" + this.mCiphertextSign + ", mOsVersion=" + this.mOsVersion + ")";
    }
}
