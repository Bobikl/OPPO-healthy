package com.heytap.health.wallet.network.bus.params;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.j7l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\nHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/wallet/network/bus/params/JumpGuideParam;", "", j7l.KEY_CPLC, "", "appCode", "(Ljava/lang/String;Ljava/lang/String;)V", "getAppCode", "()Ljava/lang/String;", "getCplc", "scene", "", "getScene", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class JumpGuideParam {

    @Nullable
    private final String appCode;

    @Nullable
    private final String cplc;
    private final int scene = 1;

    public JumpGuideParam(@Nullable String str, @Nullable String str2) {
        this.cplc = str;
        this.appCode = str2;
    }

    public static /* synthetic */ JumpGuideParam copy$default(JumpGuideParam jumpGuideParam, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jumpGuideParam.cplc;
        }
        if ((i & 2) != 0) {
            str2 = jumpGuideParam.appCode;
        }
        return jumpGuideParam.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCplc() {
        return this.cplc;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppCode() {
        return this.appCode;
    }

    @NotNull
    public final JumpGuideParam copy(@Nullable String cplc, @Nullable String appCode) {
        return new JumpGuideParam(cplc, appCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JumpGuideParam)) {
            return false;
        }
        JumpGuideParam jumpGuideParam = (JumpGuideParam) other;
        return Intrinsics.areEqual(this.cplc, jumpGuideParam.cplc) && Intrinsics.areEqual(this.appCode, jumpGuideParam.appCode);
    }

    @Nullable
    public final String getAppCode() {
        return this.appCode;
    }

    @Nullable
    public final String getCplc() {
        return this.cplc;
    }

    public final int getScene() {
        return this.scene;
    }

    public int hashCode() {
        String str = this.cplc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.appCode;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "JumpGuideParam(cplc=" + this.cplc + ", appCode=" + this.appCode + ")";
    }
}
