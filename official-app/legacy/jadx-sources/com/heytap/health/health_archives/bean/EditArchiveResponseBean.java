package com.heytap.health.health_archives.bean;

import androidx.annotation.Keep;
import com.heytap.databaseengine.model.healtharchive.IndicatorStat;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/heytap/health/health_archives/bean/EditArchiveResponseBean;", "", "docId", "", "structData", "indicatorDetailList", "", "Lcom/heytap/databaseengine/model/healtharchive/HealthIndicatorDetail;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDocId", "()Ljava/lang/String;", "setDocId", "(Ljava/lang/String;)V", "getIndicatorDetailList", "()Ljava/util/List;", "setIndicatorDetailList", "(Ljava/util/List;)V", "getStructData", "setStructData", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class EditArchiveResponseBean {

    @Nullable
    private String docId;

    @Nullable
    private List<IndicatorStat> indicatorDetailList;

    @Nullable
    private String structData;

    public EditArchiveResponseBean() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditArchiveResponseBean copy$default(EditArchiveResponseBean editArchiveResponseBean, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = editArchiveResponseBean.docId;
        }
        if ((i & 2) != 0) {
            str2 = editArchiveResponseBean.structData;
        }
        if ((i & 4) != 0) {
            list = editArchiveResponseBean.indicatorDetailList;
        }
        return editArchiveResponseBean.copy(str, str2, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDocId() {
        return this.docId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStructData() {
        return this.structData;
    }

    @Nullable
    public final List<IndicatorStat> component3() {
        return this.indicatorDetailList;
    }

    @NotNull
    public final EditArchiveResponseBean copy(@Nullable String docId, @Nullable String structData, @Nullable List<IndicatorStat> indicatorDetailList) {
        return new EditArchiveResponseBean(docId, structData, indicatorDetailList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditArchiveResponseBean)) {
            return false;
        }
        EditArchiveResponseBean editArchiveResponseBean = (EditArchiveResponseBean) other;
        return Intrinsics.areEqual(this.docId, editArchiveResponseBean.docId) && Intrinsics.areEqual(this.structData, editArchiveResponseBean.structData) && Intrinsics.areEqual(this.indicatorDetailList, editArchiveResponseBean.indicatorDetailList);
    }

    @Nullable
    public final String getDocId() {
        return this.docId;
    }

    @Nullable
    public final List<IndicatorStat> getIndicatorDetailList() {
        return this.indicatorDetailList;
    }

    @Nullable
    public final String getStructData() {
        return this.structData;
    }

    public int hashCode() {
        String str = this.docId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.structData;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<IndicatorStat> list = this.indicatorDetailList;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final void setDocId(@Nullable String str) {
        this.docId = str;
    }

    public final void setIndicatorDetailList(@Nullable List<IndicatorStat> list) {
        this.indicatorDetailList = list;
    }

    public final void setStructData(@Nullable String str) {
        this.structData = str;
    }

    @NotNull
    public String toString() {
        return "EditArchiveResponseBean(docId=" + this.docId + ", structData=" + this.structData + ", indicatorDetailList=" + this.indicatorDetailList + ")";
    }

    public EditArchiveResponseBean(@Nullable String str, @Nullable String str2, @Nullable List<IndicatorStat> list) {
        this.docId = str;
        this.structData = str2;
        this.indicatorDetailList = list;
    }

    public /* synthetic */ EditArchiveResponseBean(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}
