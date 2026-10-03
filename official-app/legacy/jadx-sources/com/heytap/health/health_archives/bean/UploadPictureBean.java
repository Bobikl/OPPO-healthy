package com.heytap.health.health_archives.bean;

import androidx.annotation.Keep;
import com.heytap.log.consts.LogSenderConst;
import com.heytap.webview.extension.protocol.Const;
import java.io.File;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b5\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f¢\u0006\u0002\u0010\u0013J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u000eHÆ\u0003J\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011HÆ\u0003J\t\u00108\u001a\u00020\fHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010?\u001a\u00020\fHÆ\u0003J\t\u0010@\u001a\u00020\u000eHÆ\u0003J\u0095\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\fHÆ\u0001J\u0013\u0010B\u001a\u00020\u000e2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020\fHÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0012\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017R\u001a\u0010\u000f\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001bR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010'\"\u0004\b,\u0010)R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0015\"\u0004\b.\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0015\"\u0004\b0\u0010\u0017R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u0006F"}, d2 = {"Lcom/heytap/health/health_archives/bean/UploadPictureBean;", "", "clientFileId", "", LogSenderConst.FILENAME, Const.Scheme.SCHEME_FILE, "Ljava/io/File;", "fileMd5", "docId", "originalUrl", "localPath", "invalidCode", "", "isAddPhoto", "", "hasUploadedOcs", "qualityIssues", "", "dataSource", "(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZLjava/util/List;I)V", "getClientFileId", "()Ljava/lang/String;", "setClientFileId", "(Ljava/lang/String;)V", "getDataSource", "()I", "setDataSource", "(I)V", "getDocId", "setDocId", "getFile", "()Ljava/io/File;", "setFile", "(Ljava/io/File;)V", "getFileMd5", "setFileMd5", "getFileName", "setFileName", "getHasUploadedOcs", "()Z", "setHasUploadedOcs", "(Z)V", "getInvalidCode", "setInvalidCode", "setAddPhoto", "getLocalPath", "setLocalPath", "getOriginalUrl", "setOriginalUrl", "getQualityIssues", "()Ljava/util/List;", "setQualityIssues", "(Ljava/util/List;)V", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UploadPictureBean {

    @NotNull
    private String clientFileId;
    private int dataSource;

    @Nullable
    private String docId;

    @Nullable
    private File file;

    @Nullable
    private String fileMd5;

    @Nullable
    private String fileName;
    private boolean hasUploadedOcs;
    private int invalidCode;
    private boolean isAddPhoto;

    @Nullable
    private String localPath;

    @Nullable
    private String originalUrl;

    @Nullable
    private List<String> qualityIssues;

    public UploadPictureBean() {
        this(null, null, null, null, null, null, null, 0, false, false, null, 0, 4095, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClientFileId() {
        return this.clientFileId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getHasUploadedOcs() {
        return this.hasUploadedOcs;
    }

    @Nullable
    public final List<String> component11() {
        return this.qualityIssues;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getDataSource() {
        return this.dataSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFileMd5() {
        return this.fileMd5;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDocId() {
        return this.docId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOriginalUrl() {
        return this.originalUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLocalPath() {
        return this.localPath;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getInvalidCode() {
        return this.invalidCode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsAddPhoto() {
        return this.isAddPhoto;
    }

    @NotNull
    public final UploadPictureBean copy(@NotNull String clientFileId, @Nullable String fileName, @Nullable File file, @Nullable String fileMd5, @Nullable String docId, @Nullable String originalUrl, @Nullable String localPath, int invalidCode, boolean isAddPhoto, boolean hasUploadedOcs, @Nullable List<String> qualityIssues, int dataSource) {
        Intrinsics.checkNotNullParameter(clientFileId, "clientFileId");
        return new UploadPictureBean(clientFileId, fileName, file, fileMd5, docId, originalUrl, localPath, invalidCode, isAddPhoto, hasUploadedOcs, qualityIssues, dataSource);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadPictureBean)) {
            return false;
        }
        UploadPictureBean uploadPictureBean = (UploadPictureBean) other;
        return Intrinsics.areEqual(this.clientFileId, uploadPictureBean.clientFileId) && Intrinsics.areEqual(this.fileName, uploadPictureBean.fileName) && Intrinsics.areEqual(this.file, uploadPictureBean.file) && Intrinsics.areEqual(this.fileMd5, uploadPictureBean.fileMd5) && Intrinsics.areEqual(this.docId, uploadPictureBean.docId) && Intrinsics.areEqual(this.originalUrl, uploadPictureBean.originalUrl) && Intrinsics.areEqual(this.localPath, uploadPictureBean.localPath) && this.invalidCode == uploadPictureBean.invalidCode && this.isAddPhoto == uploadPictureBean.isAddPhoto && this.hasUploadedOcs == uploadPictureBean.hasUploadedOcs && Intrinsics.areEqual(this.qualityIssues, uploadPictureBean.qualityIssues) && this.dataSource == uploadPictureBean.dataSource;
    }

    @NotNull
    public final String getClientFileId() {
        return this.clientFileId;
    }

    public final int getDataSource() {
        return this.dataSource;
    }

    @Nullable
    public final String getDocId() {
        return this.docId;
    }

    @Nullable
    public final File getFile() {
        return this.file;
    }

    @Nullable
    public final String getFileMd5() {
        return this.fileMd5;
    }

    @Nullable
    public final String getFileName() {
        return this.fileName;
    }

    public final boolean getHasUploadedOcs() {
        return this.hasUploadedOcs;
    }

    public final int getInvalidCode() {
        return this.invalidCode;
    }

    @Nullable
    public final String getLocalPath() {
        return this.localPath;
    }

    @Nullable
    public final String getOriginalUrl() {
        return this.originalUrl;
    }

    @Nullable
    public final List<String> getQualityIssues() {
        return this.qualityIssues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        int iHashCode = this.clientFileId.hashCode() * 31;
        String str = this.fileName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        File file = this.file;
        int iHashCode3 = (iHashCode2 + (file == null ? 0 : file.hashCode())) * 31;
        String str2 = this.fileMd5;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.docId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.originalUrl;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.localPath;
        int iHashCode7 = (((iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31) + Integer.hashCode(this.invalidCode)) * 31;
        boolean z = this.isAddPhoto;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode7 + r1) * 31;
        boolean z2 = this.hasUploadedOcs;
        int i2 = (i + (z2 ? 1 : z2)) * 31;
        List<String> list = this.qualityIssues;
        return ((i2 + (list != null ? list.hashCode() : 0)) * 31) + Integer.hashCode(this.dataSource);
    }

    public final boolean isAddPhoto() {
        return this.isAddPhoto;
    }

    public final void setAddPhoto(boolean z) {
        this.isAddPhoto = z;
    }

    public final void setClientFileId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clientFileId = str;
    }

    public final void setDataSource(int i) {
        this.dataSource = i;
    }

    public final void setDocId(@Nullable String str) {
        this.docId = str;
    }

    public final void setFile(@Nullable File file) {
        this.file = file;
    }

    public final void setFileMd5(@Nullable String str) {
        this.fileMd5 = str;
    }

    public final void setFileName(@Nullable String str) {
        this.fileName = str;
    }

    public final void setHasUploadedOcs(boolean z) {
        this.hasUploadedOcs = z;
    }

    public final void setInvalidCode(int i) {
        this.invalidCode = i;
    }

    public final void setLocalPath(@Nullable String str) {
        this.localPath = str;
    }

    public final void setOriginalUrl(@Nullable String str) {
        this.originalUrl = str;
    }

    public final void setQualityIssues(@Nullable List<String> list) {
        this.qualityIssues = list;
    }

    @NotNull
    public String toString() {
        return "UploadPictureBean(clientFileId=" + this.clientFileId + ", fileName=" + this.fileName + ", file=" + this.file + ", fileMd5=" + this.fileMd5 + ", docId=" + this.docId + ", originalUrl=" + this.originalUrl + ", localPath=" + this.localPath + ", invalidCode=" + this.invalidCode + ", isAddPhoto=" + this.isAddPhoto + ", hasUploadedOcs=" + this.hasUploadedOcs + ", qualityIssues=" + this.qualityIssues + ", dataSource=" + this.dataSource + ")";
    }

    public UploadPictureBean(@NotNull String clientFileId, @Nullable String str, @Nullable File file, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i, boolean z, boolean z2, @Nullable List<String> list, int i2) {
        Intrinsics.checkNotNullParameter(clientFileId, "clientFileId");
        this.clientFileId = clientFileId;
        this.fileName = str;
        this.file = file;
        this.fileMd5 = str2;
        this.docId = str3;
        this.originalUrl = str4;
        this.localPath = str5;
        this.invalidCode = i;
        this.isAddPhoto = z;
        this.hasUploadedOcs = z2;
        this.qualityIssues = list;
        this.dataSource = i2;
    }

    public /* synthetic */ UploadPictureBean(String str, String str2, File file, String str3, String str4, String str5, String str6, int i, boolean z, boolean z2, List list, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : file, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? null : str4, (i3 & 32) != 0 ? null : str5, (i3 & 64) != 0 ? null : str6, (i3 & 128) != 0 ? -1 : i, (i3 & 256) != 0 ? false : z, (i3 & 512) != 0 ? false : z2, (i3 & 1024) == 0 ? list : null, (i3 & 2048) == 0 ? i2 : 0);
    }
}
