package com.heytap.health.health_archives.bean;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/health_archives/bean/HealthFileResponseBean;", "", "clientFileId", "", "fileUrl", "qualityIssues", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getClientFileId", "()Ljava/lang/String;", "setClientFileId", "(Ljava/lang/String;)V", "getFileUrl", "setFileUrl", "getQualityIssues", "()Ljava/util/List;", "setQualityIssues", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HealthFileResponseBean {

    @Nullable
    private String clientFileId;

    @Nullable
    private String fileUrl;

    @Nullable
    private List<String> qualityIssues;

    public HealthFileResponseBean() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HealthFileResponseBean copy$default(HealthFileResponseBean healthFileResponseBean, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = healthFileResponseBean.clientFileId;
        }
        if ((i & 2) != 0) {
            str2 = healthFileResponseBean.fileUrl;
        }
        if ((i & 4) != 0) {
            list = healthFileResponseBean.qualityIssues;
        }
        return healthFileResponseBean.copy(str, str2, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClientFileId() {
        return this.clientFileId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFileUrl() {
        return this.fileUrl;
    }

    @Nullable
    public final List<String> component3() {
        return this.qualityIssues;
    }

    @NotNull
    public final HealthFileResponseBean copy(@Nullable String clientFileId, @Nullable String fileUrl, @Nullable List<String> qualityIssues) {
        return new HealthFileResponseBean(clientFileId, fileUrl, qualityIssues);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthFileResponseBean)) {
            return false;
        }
        HealthFileResponseBean healthFileResponseBean = (HealthFileResponseBean) other;
        return Intrinsics.areEqual(this.clientFileId, healthFileResponseBean.clientFileId) && Intrinsics.areEqual(this.fileUrl, healthFileResponseBean.fileUrl) && Intrinsics.areEqual(this.qualityIssues, healthFileResponseBean.qualityIssues);
    }

    @Nullable
    public final String getClientFileId() {
        return this.clientFileId;
    }

    @Nullable
    public final String getFileUrl() {
        return this.fileUrl;
    }

    @Nullable
    public final List<String> getQualityIssues() {
        return this.qualityIssues;
    }

    public int hashCode() {
        String str = this.clientFileId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fileUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.qualityIssues;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final void setClientFileId(@Nullable String str) {
        this.clientFileId = str;
    }

    public final void setFileUrl(@Nullable String str) {
        this.fileUrl = str;
    }

    public final void setQualityIssues(@Nullable List<String> list) {
        this.qualityIssues = list;
    }

    @NotNull
    public String toString() {
        return "HealthFileResponseBean(clientFileId=" + this.clientFileId + ", fileUrl=" + this.fileUrl + ", qualityIssues=" + this.qualityIssues + ")";
    }

    public HealthFileResponseBean(@Nullable String str, @Nullable String str2, @Nullable List<String> list) {
        this.clientFileId = str;
        this.fileUrl = str2;
        this.qualityIssues = list;
    }

    public /* synthetic */ HealthFileResponseBean(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}
