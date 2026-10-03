package com.heytap.health.health_archives.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/health_archives/bean/RiskWarningReferBean;", "", "name", "", "gotoUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getGotoUrl", "()Ljava/lang/String;", "setGotoUrl", "(Ljava/lang/String;)V", "getName", "setName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RiskWarningReferBean {

    @Nullable
    private String gotoUrl;

    @NotNull
    private String name;

    /* JADX WARN: Multi-variable type inference failed */
    public RiskWarningReferBean() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RiskWarningReferBean copy$default(RiskWarningReferBean riskWarningReferBean, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = riskWarningReferBean.name;
        }
        if ((i & 2) != 0) {
            str2 = riskWarningReferBean.gotoUrl;
        }
        return riskWarningReferBean.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGotoUrl() {
        return this.gotoUrl;
    }

    @NotNull
    public final RiskWarningReferBean copy(@NotNull String name, @Nullable String gotoUrl) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new RiskWarningReferBean(name, gotoUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RiskWarningReferBean)) {
            return false;
        }
        RiskWarningReferBean riskWarningReferBean = (RiskWarningReferBean) other;
        return Intrinsics.areEqual(this.name, riskWarningReferBean.name) && Intrinsics.areEqual(this.gotoUrl, riskWarningReferBean.gotoUrl);
    }

    @Nullable
    public final String getGotoUrl() {
        return this.gotoUrl;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.gotoUrl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setGotoUrl(@Nullable String str) {
        this.gotoUrl = str;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    @NotNull
    public String toString() {
        return "RiskWarningReferBean(name=" + this.name + ", gotoUrl=" + this.gotoUrl + ")";
    }

    public RiskWarningReferBean(@NotNull String name, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.gotoUrl = str;
    }

    public /* synthetic */ RiskWarningReferBean(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2);
    }
}
