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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011¨\u0006 "}, d2 = {"Lcom/heytap/health/health_archives/bean/StructureStateBean;", "", "dayno", "", "successDocs", "", "Lcom/heytap/health/health_archives/bean/StructureStateBean$SuccessResp;", "failDocs", "Lcom/heytap/health/health_archives/bean/StructureStateBean$FailResp;", "(ILjava/util/List;Ljava/util/List;)V", "getDayno", "()I", "setDayno", "(I)V", "getFailDocs", "()Ljava/util/List;", "setFailDocs", "(Ljava/util/List;)V", "getSuccessDocs", "setSuccessDocs", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "FailResp", "SuccessResp", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class StructureStateBean {
    private int dayno;

    @Nullable
    private List<FailResp> failDocs;

    @Nullable
    private List<SuccessResp> successDocs;

    @Keep
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/health_archives/bean/StructureStateBean$FailResp;", "", "docId", "", "errorCode", "", "(Ljava/lang/String;I)V", "getDocId", "()Ljava/lang/String;", "setDocId", "(Ljava/lang/String;)V", "getErrorCode", "()I", "setErrorCode", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class FailResp {

        @NotNull
        private String docId;
        private int errorCode;

        /* JADX WARN: Multi-variable type inference failed */
        public FailResp() {
            this(null, 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ FailResp copy$default(FailResp failResp, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = failResp.docId;
            }
            if ((i2 & 2) != 0) {
                i = failResp.errorCode;
            }
            return failResp.copy(str, i);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDocId() {
            return this.docId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getErrorCode() {
            return this.errorCode;
        }

        @NotNull
        public final FailResp copy(@NotNull String docId, int errorCode) {
            Intrinsics.checkNotNullParameter(docId, "docId");
            return new FailResp(docId, errorCode);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FailResp)) {
                return false;
            }
            FailResp failResp = (FailResp) other;
            return Intrinsics.areEqual(this.docId, failResp.docId) && this.errorCode == failResp.errorCode;
        }

        @NotNull
        public final String getDocId() {
            return this.docId;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        public int hashCode() {
            return (this.docId.hashCode() * 31) + Integer.hashCode(this.errorCode);
        }

        public final void setDocId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.docId = str;
        }

        public final void setErrorCode(int i) {
            this.errorCode = i;
        }

        @NotNull
        public String toString() {
            return "FailResp(docId=" + this.docId + ", errorCode=" + this.errorCode + ")";
        }

        public FailResp(@NotNull String docId, int i) {
            Intrinsics.checkNotNullParameter(docId, "docId");
            this.docId = docId;
            this.errorCode = i;
        }

        public /* synthetic */ FailResp(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? HealthBusinessCode.ASYNC_STRUCT_ERROR.getCode() : i);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/health_archives/bean/StructureStateBean$SuccessResp;", "", "docId", "", "owner", "(Ljava/lang/String;Ljava/lang/String;)V", "getDocId", "()Ljava/lang/String;", "setDocId", "(Ljava/lang/String;)V", "getOwner", "setOwner", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class SuccessResp {

        @NotNull
        private String docId;

        @Nullable
        private String owner;

        /* JADX WARN: Multi-variable type inference failed */
        public SuccessResp() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SuccessResp copy$default(SuccessResp successResp, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = successResp.docId;
            }
            if ((i & 2) != 0) {
                str2 = successResp.owner;
            }
            return successResp.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDocId() {
            return this.docId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getOwner() {
            return this.owner;
        }

        @NotNull
        public final SuccessResp copy(@NotNull String docId, @Nullable String owner) {
            Intrinsics.checkNotNullParameter(docId, "docId");
            return new SuccessResp(docId, owner);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SuccessResp)) {
                return false;
            }
            SuccessResp successResp = (SuccessResp) other;
            return Intrinsics.areEqual(this.docId, successResp.docId) && Intrinsics.areEqual(this.owner, successResp.owner);
        }

        @NotNull
        public final String getDocId() {
            return this.docId;
        }

        @Nullable
        public final String getOwner() {
            return this.owner;
        }

        public int hashCode() {
            int iHashCode = this.docId.hashCode() * 31;
            String str = this.owner;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final void setDocId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.docId = str;
        }

        public final void setOwner(@Nullable String str) {
            this.owner = str;
        }

        @NotNull
        public String toString() {
            return "SuccessResp(docId=" + this.docId + ", owner=" + this.owner + ")";
        }

        public SuccessResp(@NotNull String docId, @Nullable String str) {
            Intrinsics.checkNotNullParameter(docId, "docId");
            this.docId = docId;
            this.owner = str;
        }

        public /* synthetic */ SuccessResp(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2);
        }
    }

    public StructureStateBean() {
        this(0, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StructureStateBean copy$default(StructureStateBean structureStateBean, int i, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = structureStateBean.dayno;
        }
        if ((i2 & 2) != 0) {
            list = structureStateBean.successDocs;
        }
        if ((i2 & 4) != 0) {
            list2 = structureStateBean.failDocs;
        }
        return structureStateBean.copy(i, list, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDayno() {
        return this.dayno;
    }

    @Nullable
    public final List<SuccessResp> component2() {
        return this.successDocs;
    }

    @Nullable
    public final List<FailResp> component3() {
        return this.failDocs;
    }

    @NotNull
    public final StructureStateBean copy(int dayno, @Nullable List<SuccessResp> successDocs, @Nullable List<FailResp> failDocs) {
        return new StructureStateBean(dayno, successDocs, failDocs);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StructureStateBean)) {
            return false;
        }
        StructureStateBean structureStateBean = (StructureStateBean) other;
        return this.dayno == structureStateBean.dayno && Intrinsics.areEqual(this.successDocs, structureStateBean.successDocs) && Intrinsics.areEqual(this.failDocs, structureStateBean.failDocs);
    }

    public final int getDayno() {
        return this.dayno;
    }

    @Nullable
    public final List<FailResp> getFailDocs() {
        return this.failDocs;
    }

    @Nullable
    public final List<SuccessResp> getSuccessDocs() {
        return this.successDocs;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.dayno) * 31;
        List<SuccessResp> list = this.successDocs;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<FailResp> list2 = this.failDocs;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setDayno(int i) {
        this.dayno = i;
    }

    public final void setFailDocs(@Nullable List<FailResp> list) {
        this.failDocs = list;
    }

    public final void setSuccessDocs(@Nullable List<SuccessResp> list) {
        this.successDocs = list;
    }

    @NotNull
    public String toString() {
        return "StructureStateBean(dayno=" + this.dayno + ", successDocs=" + this.successDocs + ", failDocs=" + this.failDocs + ")";
    }

    public StructureStateBean(int i, @Nullable List<SuccessResp> list, @Nullable List<FailResp> list2) {
        this.dayno = i;
        this.successDocs = list;
        this.failDocs = list2;
    }

    public /* synthetic */ StructureStateBean(int i, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? null : list2);
    }
}
