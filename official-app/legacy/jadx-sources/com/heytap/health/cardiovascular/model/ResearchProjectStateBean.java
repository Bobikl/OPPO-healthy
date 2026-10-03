package com.heytap.health.cardiovascular.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/heytap/health/cardiovascular/model/ResearchProjectStateBean;", "", "code", "", "data", "Lcom/heytap/health/cardiovascular/model/ResearchProjectDataBean;", "message", "", "serverTime", "", "(ILcom/heytap/health/cardiovascular/model/ResearchProjectDataBean;Ljava/lang/String;J)V", "getCode", "()I", "getData", "()Lcom/heytap/health/cardiovascular/model/ResearchProjectDataBean;", "getMessage", "()Ljava/lang/String;", "getServerTime", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ResearchProjectStateBean {
    public static final int $stable = 0;
    private final int code;

    @NotNull
    private final ResearchProjectDataBean data;

    @NotNull
    private final String message;
    private final long serverTime;

    public ResearchProjectStateBean(int i, @NotNull ResearchProjectDataBean data, @NotNull String message, long j2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = i;
        this.data = data;
        this.message = message;
        this.serverTime = j2;
    }

    public static /* synthetic */ ResearchProjectStateBean copy$default(ResearchProjectStateBean researchProjectStateBean, int i, ResearchProjectDataBean researchProjectDataBean, String str, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = researchProjectStateBean.code;
        }
        if ((i2 & 2) != 0) {
            researchProjectDataBean = researchProjectStateBean.data;
        }
        ResearchProjectDataBean researchProjectDataBean2 = researchProjectDataBean;
        if ((i2 & 4) != 0) {
            str = researchProjectStateBean.message;
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            j2 = researchProjectStateBean.serverTime;
        }
        return researchProjectStateBean.copy(i, researchProjectDataBean2, str2, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ResearchProjectDataBean getData() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getServerTime() {
        return this.serverTime;
    }

    @NotNull
    public final ResearchProjectStateBean copy(int code, @NotNull ResearchProjectDataBean data, @NotNull String message, long serverTime) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(message, "message");
        return new ResearchProjectStateBean(code, data, message, serverTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResearchProjectStateBean)) {
            return false;
        }
        ResearchProjectStateBean researchProjectStateBean = (ResearchProjectStateBean) other;
        return this.code == researchProjectStateBean.code && Intrinsics.areEqual(this.data, researchProjectStateBean.data) && Intrinsics.areEqual(this.message, researchProjectStateBean.message) && this.serverTime == researchProjectStateBean.serverTime;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final ResearchProjectDataBean getData() {
        return this.data;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final long getServerTime() {
        return this.serverTime;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.code) * 31) + this.data.hashCode()) * 31) + this.message.hashCode()) * 31) + Long.hashCode(this.serverTime);
    }

    @NotNull
    public String toString() {
        return "ResearchProjectStateBean(code=" + this.code + ", data=" + this.data + ", message=" + this.message + ", serverTime=" + this.serverTime + ")";
    }
}
