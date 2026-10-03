package com.heytap.health.cardiovascular.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/cardiovascular/model/ResearchProjectDataBean;", "", "joinTime", "", "state", "", "(JI)V", "getJoinTime", "()J", "getState", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ResearchProjectDataBean {
    public static final int $stable = 0;
    private final long joinTime;
    private final int state;

    public ResearchProjectDataBean(long j2, int i) {
        this.joinTime = j2;
        this.state = i;
    }

    public static /* synthetic */ ResearchProjectDataBean copy$default(ResearchProjectDataBean researchProjectDataBean, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = researchProjectDataBean.joinTime;
        }
        if ((i2 & 2) != 0) {
            i = researchProjectDataBean.state;
        }
        return researchProjectDataBean.copy(j2, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getJoinTime() {
        return this.joinTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getState() {
        return this.state;
    }

    @NotNull
    public final ResearchProjectDataBean copy(long joinTime, int state) {
        return new ResearchProjectDataBean(joinTime, state);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResearchProjectDataBean)) {
            return false;
        }
        ResearchProjectDataBean researchProjectDataBean = (ResearchProjectDataBean) other;
        return this.joinTime == researchProjectDataBean.joinTime && this.state == researchProjectDataBean.state;
    }

    public final long getJoinTime() {
        return this.joinTime;
    }

    public final int getState() {
        return this.state;
    }

    public int hashCode() {
        return (Long.hashCode(this.joinTime) * 31) + Integer.hashCode(this.state);
    }

    @NotNull
    public String toString() {
        return "ResearchProjectDataBean(joinTime=" + this.joinTime + ", state=" + this.state + ")";
    }
}
