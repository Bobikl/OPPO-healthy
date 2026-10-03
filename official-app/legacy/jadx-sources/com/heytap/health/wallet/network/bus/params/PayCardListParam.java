package com.heytap.health.wallet.network.bus.params;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.j7l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/wallet/network/bus/params/PayCardListParam;", "", j7l.KEY_CPLC, "", "nfcSupport", "", "stage", "(Ljava/lang/String;ZLjava/lang/String;)V", "getCplc", "()Ljava/lang/String;", "getNfcSupport", "()Z", "getStage", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PayCardListParam {

    @NotNull
    private final String cplc;
    private final boolean nfcSupport;

    @NotNull
    private final String stage;

    public PayCardListParam(@NotNull String cplc, boolean z, @NotNull String stage) {
        Intrinsics.checkNotNullParameter(cplc, "cplc");
        Intrinsics.checkNotNullParameter(stage, "stage");
        this.cplc = cplc;
        this.nfcSupport = z;
        this.stage = stage;
    }

    public static /* synthetic */ PayCardListParam copy$default(PayCardListParam payCardListParam, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = payCardListParam.cplc;
        }
        if ((i & 2) != 0) {
            z = payCardListParam.nfcSupport;
        }
        if ((i & 4) != 0) {
            str2 = payCardListParam.stage;
        }
        return payCardListParam.copy(str, z, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCplc() {
        return this.cplc;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getNfcSupport() {
        return this.nfcSupport;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStage() {
        return this.stage;
    }

    @NotNull
    public final PayCardListParam copy(@NotNull String cplc, boolean nfcSupport, @NotNull String stage) {
        Intrinsics.checkNotNullParameter(cplc, "cplc");
        Intrinsics.checkNotNullParameter(stage, "stage");
        return new PayCardListParam(cplc, nfcSupport, stage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayCardListParam)) {
            return false;
        }
        PayCardListParam payCardListParam = (PayCardListParam) other;
        return Intrinsics.areEqual(this.cplc, payCardListParam.cplc) && this.nfcSupport == payCardListParam.nfcSupport && Intrinsics.areEqual(this.stage, payCardListParam.stage);
    }

    @NotNull
    public final String getCplc() {
        return this.cplc;
    }

    public final boolean getNfcSupport() {
        return this.nfcSupport;
    }

    @NotNull
    public final String getStage() {
        return this.stage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.cplc.hashCode() * 31;
        boolean z = this.nfcSupport;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode + r1) * 31) + this.stage.hashCode();
    }

    @NotNull
    public String toString() {
        return "PayCardListParam(cplc=" + this.cplc + ", nfcSupport=" + this.nfcSupport + ", stage=" + this.stage + ")";
    }
}
