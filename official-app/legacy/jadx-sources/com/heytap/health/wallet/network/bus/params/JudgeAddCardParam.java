package com.heytap.health.wallet.network.bus.params;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.j7l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/wallet/network/bus/params/JudgeAddCardParam;", "", "appCode", "", j7l.KEY_CPLC, "(Ljava/lang/String;Ljava/lang/String;)V", "getAppCode", "()Ljava/lang/String;", "getCplc", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class JudgeAddCardParam {

    @NotNull
    private final String appCode;

    @NotNull
    private final String cplc;

    public JudgeAddCardParam(@NotNull String appCode, @NotNull String cplc) {
        Intrinsics.checkNotNullParameter(appCode, "appCode");
        Intrinsics.checkNotNullParameter(cplc, "cplc");
        this.appCode = appCode;
        this.cplc = cplc;
    }

    public static /* synthetic */ JudgeAddCardParam copy$default(JudgeAddCardParam judgeAddCardParam, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = judgeAddCardParam.appCode;
        }
        if ((i & 2) != 0) {
            str2 = judgeAddCardParam.cplc;
        }
        return judgeAddCardParam.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppCode() {
        return this.appCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCplc() {
        return this.cplc;
    }

    @NotNull
    public final JudgeAddCardParam copy(@NotNull String appCode, @NotNull String cplc) {
        Intrinsics.checkNotNullParameter(appCode, "appCode");
        Intrinsics.checkNotNullParameter(cplc, "cplc");
        return new JudgeAddCardParam(appCode, cplc);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JudgeAddCardParam)) {
            return false;
        }
        JudgeAddCardParam judgeAddCardParam = (JudgeAddCardParam) other;
        return Intrinsics.areEqual(this.appCode, judgeAddCardParam.appCode) && Intrinsics.areEqual(this.cplc, judgeAddCardParam.cplc);
    }

    @NotNull
    public final String getAppCode() {
        return this.appCode;
    }

    @NotNull
    public final String getCplc() {
        return this.cplc;
    }

    public int hashCode() {
        return (this.appCode.hashCode() * 31) + this.cplc.hashCode();
    }

    @NotNull
    public String toString() {
        return "JudgeAddCardParam(appCode=" + this.appCode + ", cplc=" + this.cplc + ")";
    }
}
