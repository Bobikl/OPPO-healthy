package com.heytap.health.bloodpressure.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.store.business.rn.service.RnConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/bloodpressure/bean/ProjectTypeBean;", "", RnConstant.KEY_PAGE, "", "(Ljava/lang/String;)V", "getPage", "()Ljava/lang/String;", "setPage", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "blood_pressure_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ProjectTypeBean {
    public static final int $stable = 8;

    @Nullable
    private String page;

    public ProjectTypeBean(@Nullable String str) {
        this.page = str;
    }

    public static /* synthetic */ ProjectTypeBean copy$default(ProjectTypeBean projectTypeBean, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = projectTypeBean.page;
        }
        return projectTypeBean.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPage() {
        return this.page;
    }

    @NotNull
    public final ProjectTypeBean copy(@Nullable String page) {
        return new ProjectTypeBean(page);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ProjectTypeBean) && Intrinsics.areEqual(this.page, ((ProjectTypeBean) other).page);
    }

    @Nullable
    public final String getPage() {
        return this.page;
    }

    public int hashCode() {
        String str = this.page;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setPage(@Nullable String str) {
        this.page = str;
    }

    @NotNull
    public String toString() {
        return "ProjectTypeBean(page=" + this.page + ")";
    }
}
