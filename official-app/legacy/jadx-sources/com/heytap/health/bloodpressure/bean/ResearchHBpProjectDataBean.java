package com.heytap.health.bloodpressure.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/bloodpressure/bean/ResearchHBpProjectDataBean;", "", "projectCode", "", "joinedTimeStamp", "", "updateTimeStamp", "dataState", "", "needDays", "(Ljava/lang/String;JJII)V", "getDataState", "()I", "getJoinedTimeStamp", "()J", "getNeedDays", "getProjectCode", "()Ljava/lang/String;", "getUpdateTimeStamp", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "blood_pressure_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ResearchHBpProjectDataBean {
    public static final int $stable = 0;
    private final int dataState;
    private final long joinedTimeStamp;
    private final int needDays;

    @NotNull
    private final String projectCode;
    private final long updateTimeStamp;

    public ResearchHBpProjectDataBean() {
        this(null, 0L, 0L, 0, 0, 31, null);
    }

    public static /* synthetic */ ResearchHBpProjectDataBean copy$default(ResearchHBpProjectDataBean researchHBpProjectDataBean, String str, long j2, long j3, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = researchHBpProjectDataBean.projectCode;
        }
        if ((i3 & 2) != 0) {
            j2 = researchHBpProjectDataBean.joinedTimeStamp;
        }
        long j4 = j2;
        if ((i3 & 4) != 0) {
            j3 = researchHBpProjectDataBean.updateTimeStamp;
        }
        long j5 = j3;
        if ((i3 & 8) != 0) {
            i = researchHBpProjectDataBean.dataState;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = researchHBpProjectDataBean.needDays;
        }
        return researchHBpProjectDataBean.copy(str, j4, j5, i4, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProjectCode() {
        return this.projectCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getJoinedTimeStamp() {
        return this.joinedTimeStamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getUpdateTimeStamp() {
        return this.updateTimeStamp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDataState() {
        return this.dataState;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getNeedDays() {
        return this.needDays;
    }

    @NotNull
    public final ResearchHBpProjectDataBean copy(@NotNull String projectCode, long joinedTimeStamp, long updateTimeStamp, int dataState, int needDays) {
        Intrinsics.checkNotNullParameter(projectCode, "projectCode");
        return new ResearchHBpProjectDataBean(projectCode, joinedTimeStamp, updateTimeStamp, dataState, needDays);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResearchHBpProjectDataBean)) {
            return false;
        }
        ResearchHBpProjectDataBean researchHBpProjectDataBean = (ResearchHBpProjectDataBean) other;
        return Intrinsics.areEqual(this.projectCode, researchHBpProjectDataBean.projectCode) && this.joinedTimeStamp == researchHBpProjectDataBean.joinedTimeStamp && this.updateTimeStamp == researchHBpProjectDataBean.updateTimeStamp && this.dataState == researchHBpProjectDataBean.dataState && this.needDays == researchHBpProjectDataBean.needDays;
    }

    public final int getDataState() {
        return this.dataState;
    }

    public final long getJoinedTimeStamp() {
        return this.joinedTimeStamp;
    }

    public final int getNeedDays() {
        return this.needDays;
    }

    @NotNull
    public final String getProjectCode() {
        return this.projectCode;
    }

    public final long getUpdateTimeStamp() {
        return this.updateTimeStamp;
    }

    public int hashCode() {
        return (((((((this.projectCode.hashCode() * 31) + Long.hashCode(this.joinedTimeStamp)) * 31) + Long.hashCode(this.updateTimeStamp)) * 31) + Integer.hashCode(this.dataState)) * 31) + Integer.hashCode(this.needDays);
    }

    @NotNull
    public String toString() {
        return "ResearchHBpProjectDataBean(projectCode=" + this.projectCode + ", joinedTimeStamp=" + this.joinedTimeStamp + ", updateTimeStamp=" + this.updateTimeStamp + ", dataState=" + this.dataState + ", needDays=" + this.needDays + ")";
    }

    public ResearchHBpProjectDataBean(@NotNull String projectCode, long j2, long j3, int i, int i2) {
        Intrinsics.checkNotNullParameter(projectCode, "projectCode");
        this.projectCode = projectCode;
        this.joinedTimeStamp = j2;
        this.updateTimeStamp = j3;
        this.dataState = i;
        this.needDays = i2;
    }

    public /* synthetic */ ResearchHBpProjectDataBean(String str, long j2, long j3, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "hbp" : str, (i3 & 2) != 0 ? 0L : j2, (i3 & 4) == 0 ? j3 : 0L, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2);
    }
}
