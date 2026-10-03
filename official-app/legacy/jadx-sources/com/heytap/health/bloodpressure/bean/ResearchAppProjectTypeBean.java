package com.heytap.health.bloodpressure.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/bloodpressure/bean/ResearchAppProjectTypeBean;", "", "event", "", "params", "Lcom/heytap/health/bloodpressure/bean/ProjectTypeBean;", "(Ljava/lang/String;Lcom/heytap/health/bloodpressure/bean/ProjectTypeBean;)V", "getEvent", "()Ljava/lang/String;", "setEvent", "(Ljava/lang/String;)V", "getParams", "()Lcom/heytap/health/bloodpressure/bean/ProjectTypeBean;", "setParams", "(Lcom/heytap/health/bloodpressure/bean/ProjectTypeBean;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "blood_pressure_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ResearchAppProjectTypeBean {
    public static final int $stable = 8;

    @NotNull
    private String event;

    @NotNull
    private ProjectTypeBean params;

    public ResearchAppProjectTypeBean(@NotNull String event, @NotNull ProjectTypeBean params) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(params, "params");
        this.event = event;
        this.params = params;
    }

    public static /* synthetic */ ResearchAppProjectTypeBean copy$default(ResearchAppProjectTypeBean researchAppProjectTypeBean, String str, ProjectTypeBean projectTypeBean, int i, Object obj) {
        if ((i & 1) != 0) {
            str = researchAppProjectTypeBean.event;
        }
        if ((i & 2) != 0) {
            projectTypeBean = researchAppProjectTypeBean.params;
        }
        return researchAppProjectTypeBean.copy(str, projectTypeBean);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEvent() {
        return this.event;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ProjectTypeBean getParams() {
        return this.params;
    }

    @NotNull
    public final ResearchAppProjectTypeBean copy(@NotNull String event, @NotNull ProjectTypeBean params) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(params, "params");
        return new ResearchAppProjectTypeBean(event, params);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResearchAppProjectTypeBean)) {
            return false;
        }
        ResearchAppProjectTypeBean researchAppProjectTypeBean = (ResearchAppProjectTypeBean) other;
        return Intrinsics.areEqual(this.event, researchAppProjectTypeBean.event) && Intrinsics.areEqual(this.params, researchAppProjectTypeBean.params);
    }

    @NotNull
    public final String getEvent() {
        return this.event;
    }

    @NotNull
    public final ProjectTypeBean getParams() {
        return this.params;
    }

    public int hashCode() {
        return (this.event.hashCode() * 31) + this.params.hashCode();
    }

    public final void setEvent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.event = str;
    }

    public final void setParams(@NotNull ProjectTypeBean projectTypeBean) {
        Intrinsics.checkNotNullParameter(projectTypeBean, "<set-?>");
        this.params = projectTypeBean;
    }

    @NotNull
    public String toString() {
        return "ResearchAppProjectTypeBean(event=" + this.event + ", params=" + this.params + ")";
    }
}
