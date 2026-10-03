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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/health_archives/bean/QueryStructureRequestBean;", "", "dayno", "", "docIdList", "", "", "(ILjava/util/List;)V", "getDayno", "()I", "setDayno", "(I)V", "getDocIdList", "()Ljava/util/List;", "setDocIdList", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class QueryStructureRequestBean {
    private int dayno;

    @Nullable
    private List<String> docIdList;

    /* JADX WARN: Multi-variable type inference failed */
    public QueryStructureRequestBean() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryStructureRequestBean copy$default(QueryStructureRequestBean queryStructureRequestBean, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = queryStructureRequestBean.dayno;
        }
        if ((i2 & 2) != 0) {
            list = queryStructureRequestBean.docIdList;
        }
        return queryStructureRequestBean.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDayno() {
        return this.dayno;
    }

    @Nullable
    public final List<String> component2() {
        return this.docIdList;
    }

    @NotNull
    public final QueryStructureRequestBean copy(int dayno, @Nullable List<String> docIdList) {
        return new QueryStructureRequestBean(dayno, docIdList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryStructureRequestBean)) {
            return false;
        }
        QueryStructureRequestBean queryStructureRequestBean = (QueryStructureRequestBean) other;
        return this.dayno == queryStructureRequestBean.dayno && Intrinsics.areEqual(this.docIdList, queryStructureRequestBean.docIdList);
    }

    public final int getDayno() {
        return this.dayno;
    }

    @Nullable
    public final List<String> getDocIdList() {
        return this.docIdList;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.dayno) * 31;
        List<String> list = this.docIdList;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final void setDayno(int i) {
        this.dayno = i;
    }

    public final void setDocIdList(@Nullable List<String> list) {
        this.docIdList = list;
    }

    @NotNull
    public String toString() {
        return "QueryStructureRequestBean(dayno=" + this.dayno + ", docIdList=" + this.docIdList + ")";
    }

    public QueryStructureRequestBean(int i, @Nullable List<String> list) {
        this.dayno = i;
        this.docIdList = list;
    }

    public /* synthetic */ QueryStructureRequestBean(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : list);
    }
}
