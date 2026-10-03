package com.heytap.health.home.rankpage;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.aiunit.vision.fkj;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0016\u001a\u00020\u0005H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/home/rankpage/RankStatusBean;", "", fkj.PARAM_SWITCH_STATUS, "", "customConfig", "", "(ILjava/lang/String;)V", "getCustomConfig", "()Ljava/lang/String;", "setCustomConfig", "(Ljava/lang/String;)V", "getSwitchStatus", "()I", "setSwitchStatus", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "home_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RankStatusBean {
    public static final int $stable = 8;

    @Nullable
    private String customConfig;
    private int switchStatus;

    /* JADX WARN: Multi-variable type inference failed */
    public RankStatusBean() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RankStatusBean copy$default(RankStatusBean rankStatusBean, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = rankStatusBean.switchStatus;
        }
        if ((i2 & 2) != 0) {
            str = rankStatusBean.customConfig;
        }
        return rankStatusBean.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSwitchStatus() {
        return this.switchStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCustomConfig() {
        return this.customConfig;
    }

    @NotNull
    public final RankStatusBean copy(int switchStatus, @Nullable String customConfig) {
        return new RankStatusBean(switchStatus, customConfig);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RankStatusBean)) {
            return false;
        }
        RankStatusBean rankStatusBean = (RankStatusBean) other;
        return this.switchStatus == rankStatusBean.switchStatus && Intrinsics.areEqual(this.customConfig, rankStatusBean.customConfig);
    }

    @Nullable
    public final String getCustomConfig() {
        return this.customConfig;
    }

    public final int getSwitchStatus() {
        return this.switchStatus;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.switchStatus) * 31;
        String str = this.customConfig;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setCustomConfig(@Nullable String str) {
        this.customConfig = str;
    }

    public final void setSwitchStatus(int i) {
        this.switchStatus = i;
    }

    @NotNull
    public String toString() {
        return "{switchStatus = " + this.switchStatus + "; customConfig = " + this.customConfig + " }";
    }

    public RankStatusBean(int i, @Nullable String str) {
        this.switchStatus = i;
        this.customConfig = str;
    }

    public /* synthetic */ RankStatusBean(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str);
    }
}
