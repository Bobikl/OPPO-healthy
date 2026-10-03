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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/esim/bean/ESIMDecryptBeanV2;", "", "activationCode", "", "sign", "(Ljava/lang/String;Ljava/lang/String;)V", "getActivationCode", "()Ljava/lang/String;", "getSign", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "esim_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ESIMDecryptBeanV2 {
    public static final int $stable = 0;

    @NotNull
    private final String activationCode;

    @NotNull
    private final String sign;

    public ESIMDecryptBeanV2(@NotNull String activationCode, @NotNull String sign) {
        Intrinsics.checkNotNullParameter(activationCode, "activationCode");
        Intrinsics.checkNotNullParameter(sign, "sign");
        this.activationCode = activationCode;
        this.sign = sign;
    }

    public static /* synthetic */ ESIMDecryptBeanV2 copy$default(ESIMDecryptBeanV2 eSIMDecryptBeanV2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eSIMDecryptBeanV2.activationCode;
        }
        if ((i & 2) != 0) {
            str2 = eSIMDecryptBeanV2.sign;
        }
        return eSIMDecryptBeanV2.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActivationCode() {
        return this.activationCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSign() {
        return this.sign;
    }

    @NotNull
    public final ESIMDecryptBeanV2 copy(@NotNull String activationCode, @NotNull String sign) {
        Intrinsics.checkNotNullParameter(activationCode, "activationCode");
        Intrinsics.checkNotNullParameter(sign, "sign");
        return new ESIMDecryptBeanV2(activationCode, sign);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ESIMDecryptBeanV2)) {
            return false;
        }
        ESIMDecryptBeanV2 eSIMDecryptBeanV2 = (ESIMDecryptBeanV2) other;
        return Intrinsics.areEqual(this.activationCode, eSIMDecryptBeanV2.activationCode) && Intrinsics.areEqual(this.sign, eSIMDecryptBeanV2.sign);
    }

    @NotNull
    public final String getActivationCode() {
        return this.activationCode;
    }

    @NotNull
    public final String getSign() {
        return this.sign;
    }

    public int hashCode() {
        return (this.activationCode.hashCode() * 31) + this.sign.hashCode();
    }

    @NotNull
    public String toString() {
        return "ESIMDecryptBeanV2(activationCode=" + this.activationCode + ", sign=" + this.sign + ")";
    }
}
