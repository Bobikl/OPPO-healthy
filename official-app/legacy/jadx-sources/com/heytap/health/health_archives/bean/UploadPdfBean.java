package com.heytap.health.health_archives.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0002\u0010\rJ\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J_\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\bHÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001a\u0010\f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00062"}, d2 = {"Lcom/heytap/health/health_archives/bean/UploadPdfBean;", "", "clientFileId", "", "docId", "uploadTime", "", "errorCode", "", "originalUrl", "pdfMd5", "localPath", "pdfPages", "(Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getClientFileId", "()Ljava/lang/String;", "setClientFileId", "(Ljava/lang/String;)V", "getDocId", "setDocId", "getErrorCode", "()I", "setErrorCode", "(I)V", "getLocalPath", "setLocalPath", "getOriginalUrl", "setOriginalUrl", "getPdfMd5", "setPdfMd5", "getPdfPages", "setPdfPages", "getUploadTime", "()J", "setUploadTime", "(J)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UploadPdfBean {

    @Nullable
    private String clientFileId;

    @Nullable
    private String docId;
    private int errorCode;

    @NotNull
    private String localPath;

    @Nullable
    private String originalUrl;

    @NotNull
    private String pdfMd5;
    private int pdfPages;
    private long uploadTime;

    public UploadPdfBean() {
        this(null, null, 0L, 0, null, null, null, 0, 255, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClientFileId() {
        return this.clientFileId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDocId() {
        return this.docId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getUploadTime() {
        return this.uploadTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOriginalUrl() {
        return this.originalUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPdfMd5() {
        return this.pdfMd5;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLocalPath() {
        return this.localPath;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getPdfPages() {
        return this.pdfPages;
    }

    @NotNull
    public final UploadPdfBean copy(@Nullable String clientFileId, @Nullable String docId, long uploadTime, int errorCode, @Nullable String originalUrl, @NotNull String pdfMd5, @NotNull String localPath, int pdfPages) {
        Intrinsics.checkNotNullParameter(pdfMd5, "pdfMd5");
        Intrinsics.checkNotNullParameter(localPath, "localPath");
        return new UploadPdfBean(clientFileId, docId, uploadTime, errorCode, originalUrl, pdfMd5, localPath, pdfPages);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadPdfBean)) {
            return false;
        }
        UploadPdfBean uploadPdfBean = (UploadPdfBean) other;
        return Intrinsics.areEqual(this.clientFileId, uploadPdfBean.clientFileId) && Intrinsics.areEqual(this.docId, uploadPdfBean.docId) && this.uploadTime == uploadPdfBean.uploadTime && this.errorCode == uploadPdfBean.errorCode && Intrinsics.areEqual(this.originalUrl, uploadPdfBean.originalUrl) && Intrinsics.areEqual(this.pdfMd5, uploadPdfBean.pdfMd5) && Intrinsics.areEqual(this.localPath, uploadPdfBean.localPath) && this.pdfPages == uploadPdfBean.pdfPages;
    }

    @Nullable
    public final String getClientFileId() {
        return this.clientFileId;
    }

    @Nullable
    public final String getDocId() {
        return this.docId;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getLocalPath() {
        return this.localPath;
    }

    @Nullable
    public final String getOriginalUrl() {
        return this.originalUrl;
    }

    @NotNull
    public final String getPdfMd5() {
        return this.pdfMd5;
    }

    public final int getPdfPages() {
        return this.pdfPages;
    }

    public final long getUploadTime() {
        return this.uploadTime;
    }

    public int hashCode() {
        String str = this.clientFileId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.docId;
        int iHashCode2 = (((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Long.hashCode(this.uploadTime)) * 31) + Integer.hashCode(this.errorCode)) * 31;
        String str3 = this.originalUrl;
        return ((((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.pdfMd5.hashCode()) * 31) + this.localPath.hashCode()) * 31) + Integer.hashCode(this.pdfPages);
    }

    public final void setClientFileId(@Nullable String str) {
        this.clientFileId = str;
    }

    public final void setDocId(@Nullable String str) {
        this.docId = str;
    }

    public final void setErrorCode(int i) {
        this.errorCode = i;
    }

    public final void setLocalPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.localPath = str;
    }

    public final void setOriginalUrl(@Nullable String str) {
        this.originalUrl = str;
    }

    public final void setPdfMd5(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pdfMd5 = str;
    }

    public final void setPdfPages(int i) {
        this.pdfPages = i;
    }

    public final void setUploadTime(long j2) {
        this.uploadTime = j2;
    }

    @NotNull
    public String toString() {
        return "UploadPdfBean(clientFileId=" + this.clientFileId + ", docId=" + this.docId + ", uploadTime=" + this.uploadTime + ", errorCode=" + this.errorCode + ", originalUrl=" + this.originalUrl + ", pdfMd5=" + this.pdfMd5 + ", localPath=" + this.localPath + ", pdfPages=" + this.pdfPages + ")";
    }

    public UploadPdfBean(@Nullable String str, @Nullable String str2, long j2, int i, @Nullable String str3, @NotNull String pdfMd5, @NotNull String localPath, int i2) {
        Intrinsics.checkNotNullParameter(pdfMd5, "pdfMd5");
        Intrinsics.checkNotNullParameter(localPath, "localPath");
        this.clientFileId = str;
        this.docId = str2;
        this.uploadTime = j2;
        this.errorCode = i;
        this.originalUrl = str3;
        this.pdfMd5 = pdfMd5;
        this.localPath = localPath;
        this.pdfPages = i2;
    }

    public /* synthetic */ UploadPdfBean(String str, String str2, long j2, int i, String str3, String str4, String str5, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? 0L : j2, (i3 & 8) != 0 ? -1 : i, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? "" : str4, (i3 & 64) != 0 ? "" : str5, (i3 & 128) != 0 ? 0 : i2);
    }
}
