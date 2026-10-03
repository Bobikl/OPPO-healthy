package com.heytap.health.wallet.network.common.rsp;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/wallet/network/common/rsp/AppletRuleVO;", "", "rule", "", "ruleVer", "", "(Ljava/lang/String;I)V", "getRule", "()Ljava/lang/String;", "setRule", "(Ljava/lang/String;)V", "getRuleVer", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AppletRuleVO {

    @Nullable
    private String rule;
    private final int ruleVer;

    public AppletRuleVO(@Nullable String str, int i) {
        this.rule = str;
        this.ruleVer = i;
    }

    public static /* synthetic */ AppletRuleVO copy$default(AppletRuleVO appletRuleVO, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = appletRuleVO.rule;
        }
        if ((i2 & 2) != 0) {
            i = appletRuleVO.ruleVer;
        }
        return appletRuleVO.copy(str, i);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRule() {
        return this.rule;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRuleVer() {
        return this.ruleVer;
    }

    @NotNull
    public final AppletRuleVO copy(@Nullable String rule, int ruleVer) {
        return new AppletRuleVO(rule, ruleVer);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppletRuleVO)) {
            return false;
        }
        AppletRuleVO appletRuleVO = (AppletRuleVO) other;
        return Intrinsics.areEqual(this.rule, appletRuleVO.rule) && this.ruleVer == appletRuleVO.ruleVer;
    }

    @Nullable
    public final String getRule() {
        return this.rule;
    }

    public final int getRuleVer() {
        return this.ruleVer;
    }

    public int hashCode() {
        String str = this.rule;
        return ((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.ruleVer);
    }

    public final void setRule(@Nullable String str) {
        this.rule = str;
    }

    @NotNull
    public String toString() {
        return "AppletRuleVO(rule=" + this.rule + ", ruleVer=" + this.ruleVer + ")";
    }
}
