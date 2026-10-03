package com.heytap.health.health_archives.bean;

import androidx.annotation.Keep;
import com.heytap.databaseengine.model.healtharchive.HealthArchiveFile;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000fJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003Ji\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u00100\u001a\u00020\u00052\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0003HÖ\u0001J\t\u00103\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010\u0017R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017¨\u00064"}, d2 = {"Lcom/heytap/health/health_archives/bean/HealthCommitArchiveBean;", "", "action", "", "isPdf", "", "pdfClientFileId", "", "localPath", "docId", "imageList", "", "Lcom/heytap/databaseengine/model/healtharchive/HealthArchiveFile;", "needSave", "taskId", "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;)V", "getAction", "()I", "setAction", "(I)V", "getDocId", "()Ljava/lang/String;", "setDocId", "(Ljava/lang/String;)V", "getImageList", "()Ljava/util/List;", "setImageList", "(Ljava/util/List;)V", "()Z", "setPdf", "(Z)V", "getLocalPath", "setLocalPath", "getNeedSave", "setNeedSave", "getPdfClientFileId", "setPdfClientFileId", "getTaskId", "setTaskId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HealthCommitArchiveBean {
    private int action;

    @Nullable
    private String docId;

    @Nullable
    private List<HealthArchiveFile> imageList;
    private boolean isPdf;

    @Nullable
    private String localPath;
    private boolean needSave;

    @Nullable
    private String pdfClientFileId;

    @Nullable
    private String taskId;

    public HealthCommitArchiveBean() {
        this(0, false, null, null, null, null, false, null, 255, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsPdf() {
        return this.isPdf;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPdfClientFileId() {
        return this.pdfClientFileId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLocalPath() {
        return this.localPath;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDocId() {
        return this.docId;
    }

    @Nullable
    public final List<HealthArchiveFile> component6() {
        return this.imageList;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getNeedSave() {
        return this.needSave;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTaskId() {
        return this.taskId;
    }

    @NotNull
    public final HealthCommitArchiveBean copy(int action, boolean isPdf, @Nullable String pdfClientFileId, @Nullable String localPath, @Nullable String docId, @Nullable List<HealthArchiveFile> imageList, boolean needSave, @Nullable String taskId) {
        return new HealthCommitArchiveBean(action, isPdf, pdfClientFileId, localPath, docId, imageList, needSave, taskId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthCommitArchiveBean)) {
            return false;
        }
        HealthCommitArchiveBean healthCommitArchiveBean = (HealthCommitArchiveBean) other;
        return this.action == healthCommitArchiveBean.action && this.isPdf == healthCommitArchiveBean.isPdf && Intrinsics.areEqual(this.pdfClientFileId, healthCommitArchiveBean.pdfClientFileId) && Intrinsics.areEqual(this.localPath, healthCommitArchiveBean.localPath) && Intrinsics.areEqual(this.docId, healthCommitArchiveBean.docId) && Intrinsics.areEqual(this.imageList, healthCommitArchiveBean.imageList) && this.needSave == healthCommitArchiveBean.needSave && Intrinsics.areEqual(this.taskId, healthCommitArchiveBean.taskId);
    }

    public final int getAction() {
        return this.action;
    }

    @Nullable
    public final String getDocId() {
        return this.docId;
    }

    @Nullable
    public final List<HealthArchiveFile> getImageList() {
        return this.imageList;
    }

    @Nullable
    public final String getLocalPath() {
        return this.localPath;
    }

    public final boolean getNeedSave() {
        return this.needSave;
    }

    @Nullable
    public final String getPdfClientFileId() {
        return this.pdfClientFileId;
    }

    @Nullable
    public final String getTaskId() {
        return this.taskId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.action) * 31;
        boolean z = this.isPdf;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        String str = this.pdfClientFileId;
        int iHashCode2 = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.localPath;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.docId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<HealthArchiveFile> list = this.imageList;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        boolean z2 = this.needSave;
        int i2 = (iHashCode5 + (z2 ? 1 : z2)) * 31;
        String str4 = this.taskId;
        return i2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean isPdf() {
        return this.isPdf;
    }

    public final void setAction(int i) {
        this.action = i;
    }

    public final void setDocId(@Nullable String str) {
        this.docId = str;
    }

    public final void setImageList(@Nullable List<HealthArchiveFile> list) {
        this.imageList = list;
    }

    public final void setLocalPath(@Nullable String str) {
        this.localPath = str;
    }

    public final void setNeedSave(boolean z) {
        this.needSave = z;
    }

    public final void setPdf(boolean z) {
        this.isPdf = z;
    }

    public final void setPdfClientFileId(@Nullable String str) {
        this.pdfClientFileId = str;
    }

    public final void setTaskId(@Nullable String str) {
        this.taskId = str;
    }

    @NotNull
    public String toString() {
        return "HealthCommitArchiveBean(action=" + this.action + ", isPdf=" + this.isPdf + ", pdfClientFileId=" + this.pdfClientFileId + ", localPath=" + this.localPath + ", docId=" + this.docId + ", imageList=" + this.imageList + ", needSave=" + this.needSave + ", taskId=" + this.taskId + ")";
    }

    public HealthCommitArchiveBean(int i, boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<HealthArchiveFile> list, boolean z2, @Nullable String str4) {
        this.action = i;
        this.isPdf = z;
        this.pdfClientFileId = str;
        this.localPath = str2;
        this.docId = str3;
        this.imageList = list;
        this.needSave = z2;
        this.taskId = str4;
    }

    public /* synthetic */ HealthCommitArchiveBean(int i, boolean z, String str, String str2, String str3, List list, boolean z2, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : list, (i2 & 64) != 0 ? false : z2, (i2 & 128) != 0 ? null : str4);
    }
}
