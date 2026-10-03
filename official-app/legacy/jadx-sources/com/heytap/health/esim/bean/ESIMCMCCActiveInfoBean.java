package com.heytap.health.esim.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/esim/bean/ESIMCMCCActiveInfoBean;", "", "url", "", ClickApiEntity.TIME, "", "activeResult", "", "(Ljava/lang/String;JI)V", "getActiveResult", "()I", "setActiveResult", "(I)V", "getTime", "()J", "getUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "esim_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ESIMCMCCActiveInfoBean {
    public static final int $stable = 8;
    private int activeResult;
    private final long time;

    @NotNull
    private final String url;

    public ESIMCMCCActiveInfoBean(@NotNull String url, long j2, int i) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.time = j2;
        this.activeResult = i;
    }

    public static /* synthetic */ ESIMCMCCActiveInfoBean copy$default(ESIMCMCCActiveInfoBean eSIMCMCCActiveInfoBean, String str, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = eSIMCMCCActiveInfoBean.url;
        }
        if ((i2 & 2) != 0) {
            j2 = eSIMCMCCActiveInfoBean.time;
        }
        if ((i2 & 4) != 0) {
            i = eSIMCMCCActiveInfoBean.activeResult;
        }
        return eSIMCMCCActiveInfoBean.copy(str, j2, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getActiveResult() {
        return this.activeResult;
    }

    @NotNull
    public final ESIMCMCCActiveInfoBean copy(@NotNull String url, long time, int activeResult) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new ESIMCMCCActiveInfoBean(url, time, activeResult);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ESIMCMCCActiveInfoBean)) {
            return false;
        }
        ESIMCMCCActiveInfoBean eSIMCMCCActiveInfoBean = (ESIMCMCCActiveInfoBean) other;
        return Intrinsics.areEqual(this.url, eSIMCMCCActiveInfoBean.url) && this.time == eSIMCMCCActiveInfoBean.time && this.activeResult == eSIMCMCCActiveInfoBean.activeResult;
    }

    public final int getActiveResult() {
        return this.activeResult;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((this.url.hashCode() * 31) + Long.hashCode(this.time)) * 31) + Integer.hashCode(this.activeResult);
    }

    public final void setActiveResult(int i) {
        this.activeResult = i;
    }

    @NotNull
    public String toString() {
        return "ESIMCMCCActiveInfoBean(url=" + this.url + ", time=" + this.time + ", activeResult=" + this.activeResult + ")";
    }
}
