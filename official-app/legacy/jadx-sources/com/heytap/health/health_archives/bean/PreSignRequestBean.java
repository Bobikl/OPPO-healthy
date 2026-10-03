package com.heytap.health.health_archives.bean;

import androidx.annotation.Keep;
import com.heytap.log.consts.LogSenderConst;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.webview.extension.protocol.Const;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0091\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020\u0007HÖ\u0001J\t\u0010A\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u000e\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0017\"\u0004\b-\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0013\"\u0004\b/\u0010\u0015¨\u0006B"}, d2 = {"Lcom/heytap/health/health_archives/bean/PreSignRequestBean;", "", LogSenderConst.FILENAME, "", "md5", "clientFileId", Fields.FILE_TYPE, "", "fileFolder", "fileSource", "fileRemark", "version", "key", "filePath", "classifyCode", Const.Scheme.SCHEME_FILE, "Ljava/io/File;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/io/File;)V", "getClassifyCode", "()I", "setClassifyCode", "(I)V", "getClientFileId", "()Ljava/lang/String;", "setClientFileId", "(Ljava/lang/String;)V", "getFile", "()Ljava/io/File;", "setFile", "(Ljava/io/File;)V", "getFileFolder", "setFileFolder", "getFileName", "setFileName", "getFilePath", "setFilePath", "getFileRemark", "setFileRemark", "getFileSource", "setFileSource", "getFileType", "setFileType", "getKey", "setKey", "getMd5", "setMd5", "getVersion", "setVersion", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PreSignRequestBean {
    private transient int classifyCode;

    @Nullable
    private String clientFileId;

    @Nullable
    private transient File file;

    @Nullable
    private String fileFolder;

    @Nullable
    private String fileName;

    @Nullable
    private String filePath;

    @Nullable
    private String fileRemark;
    private int fileSource;
    private int fileType;

    @Nullable
    private String key;

    @Nullable
    private String md5;
    private int version;

    public PreSignRequestBean() {
        this(null, null, null, 0, null, 0, null, 0, null, null, 0, null, 4095, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getClassifyCode() {
        return this.classifyCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getClientFileId() {
        return this.clientFileId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getFileType() {
        return this.fileType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFileFolder() {
        return this.fileFolder;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getFileSource() {
        return this.fileSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFileRemark() {
        return this.fileRemark;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final PreSignRequestBean copy(@Nullable String fileName, @Nullable String md5, @Nullable String clientFileId, int fileType, @Nullable String fileFolder, int fileSource, @Nullable String fileRemark, int version, @Nullable String key, @Nullable String filePath, int classifyCode, @Nullable File file) {
        return new PreSignRequestBean(fileName, md5, clientFileId, fileType, fileFolder, fileSource, fileRemark, version, key, filePath, classifyCode, file);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreSignRequestBean)) {
            return false;
        }
        PreSignRequestBean preSignRequestBean = (PreSignRequestBean) other;
        return Intrinsics.areEqual(this.fileName, preSignRequestBean.fileName) && Intrinsics.areEqual(this.md5, preSignRequestBean.md5) && Intrinsics.areEqual(this.clientFileId, preSignRequestBean.clientFileId) && this.fileType == preSignRequestBean.fileType && Intrinsics.areEqual(this.fileFolder, preSignRequestBean.fileFolder) && this.fileSource == preSignRequestBean.fileSource && Intrinsics.areEqual(this.fileRemark, preSignRequestBean.fileRemark) && this.version == preSignRequestBean.version && Intrinsics.areEqual(this.key, preSignRequestBean.key) && Intrinsics.areEqual(this.filePath, preSignRequestBean.filePath) && this.classifyCode == preSignRequestBean.classifyCode && Intrinsics.areEqual(this.file, preSignRequestBean.file);
    }

    public final int getClassifyCode() {
        return this.classifyCode;
    }

    @Nullable
    public final String getClientFileId() {
        return this.clientFileId;
    }

    @Nullable
    public final File getFile() {
        return this.file;
    }

    @Nullable
    public final String getFileFolder() {
        return this.fileFolder;
    }

    @Nullable
    public final String getFileName() {
        return this.fileName;
    }

    @Nullable
    public final String getFilePath() {
        return this.filePath;
    }

    @Nullable
    public final String getFileRemark() {
        return this.fileRemark;
    }

    public final int getFileSource() {
        return this.fileSource;
    }

    public final int getFileType() {
        return this.fileType;
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final String getMd5() {
        return this.md5;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.fileName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.md5;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clientFileId;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.fileType)) * 31;
        String str4 = this.fileFolder;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.fileSource)) * 31;
        String str5 = this.fileRemark;
        int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + Integer.hashCode(this.version)) * 31;
        String str6 = this.key;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.filePath;
        int iHashCode7 = (((iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31) + Integer.hashCode(this.classifyCode)) * 31;
        File file = this.file;
        return iHashCode7 + (file != null ? file.hashCode() : 0);
    }

    public final void setClassifyCode(int i) {
        this.classifyCode = i;
    }

    public final void setClientFileId(@Nullable String str) {
        this.clientFileId = str;
    }

    public final void setFile(@Nullable File file) {
        this.file = file;
    }

    public final void setFileFolder(@Nullable String str) {
        this.fileFolder = str;
    }

    public final void setFileName(@Nullable String str) {
        this.fileName = str;
    }

    public final void setFilePath(@Nullable String str) {
        this.filePath = str;
    }

    public final void setFileRemark(@Nullable String str) {
        this.fileRemark = str;
    }

    public final void setFileSource(int i) {
        this.fileSource = i;
    }

    public final void setFileType(int i) {
        this.fileType = i;
    }

    public final void setKey(@Nullable String str) {
        this.key = str;
    }

    public final void setMd5(@Nullable String str) {
        this.md5 = str;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    @NotNull
    public String toString() {
        return "PreSignRequestBean(fileName=" + this.fileName + ", md5=" + this.md5 + ", clientFileId=" + this.clientFileId + ", fileType=" + this.fileType + ", fileFolder=" + this.fileFolder + ", fileSource=" + this.fileSource + ", fileRemark=" + this.fileRemark + ", version=" + this.version + ", key=" + this.key + ", filePath=" + this.filePath + ", classifyCode=" + this.classifyCode + ", file=" + this.file + ")";
    }

    public PreSignRequestBean(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, @Nullable String str4, int i2, @Nullable String str5, int i3, @Nullable String str6, @Nullable String str7, int i4, @Nullable File file) {
        this.fileName = str;
        this.md5 = str2;
        this.clientFileId = str3;
        this.fileType = i;
        this.fileFolder = str4;
        this.fileSource = i2;
        this.fileRemark = str5;
        this.version = i3;
        this.key = str6;
        this.filePath = str7;
        this.classifyCode = i4;
        this.file = file;
    }

    public /* synthetic */ PreSignRequestBean(String str, String str2, String str3, int i, String str4, int i2, String str5, int i3, String str6, String str7, int i4, File file, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? null : str, (i5 & 2) != 0 ? null : str2, (i5 & 4) != 0 ? null : str3, (i5 & 8) != 0 ? 0 : i, (i5 & 16) != 0 ? null : str4, (i5 & 32) != 0 ? 0 : i2, (i5 & 64) != 0 ? null : str5, (i5 & 128) == 0 ? i3 : 0, (i5 & 256) != 0 ? null : str6, (i5 & 512) != 0 ? null : str7, (i5 & 1024) != 0 ? -1 : i4, (i5 & 2048) == 0 ? file : null);
    }
}
