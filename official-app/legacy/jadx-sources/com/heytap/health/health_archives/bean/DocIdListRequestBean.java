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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/health_archives/bean/DocIdListRequestBean;", "", "docIdList", "", "", "(Ljava/util/List;)V", "getDocIdList", "()Ljava/util/List;", "setDocIdList", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DocIdListRequestBean {

    @Nullable
    private List<String> docIdList;

    /* JADX WARN: Multi-variable type inference failed */
    public DocIdListRequestBean() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocIdListRequestBean copy$default(DocIdListRequestBean docIdListRequestBean, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = docIdListRequestBean.docIdList;
        }
        return docIdListRequestBean.copy(list);
    }

    @Nullable
    public final List<String> component1() {
        return this.docIdList;
    }

    @NotNull
    public final DocIdListRequestBean copy(@Nullable List<String> docIdList) {
        return new DocIdListRequestBean(docIdList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DocIdListRequestBean) && Intrinsics.areEqual(this.docIdList, ((DocIdListRequestBean) other).docIdList);
    }

    @Nullable
    public final List<String> getDocIdList() {
        return this.docIdList;
    }

    public int hashCode() {
        List<String> list = this.docIdList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setDocIdList(@Nullable List<String> list) {
        this.docIdList = list;
    }

    @NotNull
    public String toString() {
        return "DocIdListRequestBean(docIdList=" + this.docIdList + ")";
    }

    public DocIdListRequestBean(@Nullable List<String> list) {
        this.docIdList = list;
    }

    public /* synthetic */ DocIdListRequestBean(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
