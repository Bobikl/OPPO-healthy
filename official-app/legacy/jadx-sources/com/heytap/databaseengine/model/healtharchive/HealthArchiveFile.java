package com.heytap.databaseengine.model.healtharchive;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.log.consts.LogSenderConst;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b/\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0081\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0002\u0010\u0013J\t\u00102\u001a\u00020\u0004HÆ\u0003J\t\u00103\u001a\u00020\u0011HÆ\u0003J\t\u00104\u001a\u00020\u0011HÆ\u0003J\t\u00105\u001a\u00020\u0004HÆ\u0003J\t\u00106\u001a\u00020\u0004HÆ\u0003J\t\u00107\u001a\u00020\bHÆ\u0003J\t\u00108\u001a\u00020\nHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000fHÆ\u0003J\u0085\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001J\t\u0010>\u001a\u00020\bHÖ\u0001J\u0013\u0010?\u001a\u00020\u00112\b\u0010@\u001a\u0004\u0018\u00010AHÖ\u0003J\t\u0010B\u001a\u00020\bHÖ\u0001J\b\u0010C\u001a\u00020\u0004H\u0016J\u0019\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010&\"\u0004\b'\u0010(R\u001a\u0010\u0012\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010&\"\u0004\b)\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001bR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006I"}, d2 = {"Lcom/heytap/databaseengine/model/healtharchive/HealthArchiveFile;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "clientFileId", "", LogSenderConst.FILENAME, "docId", "fileIndex", "", "originalUrl", "Lcom/heytap/databaseengine/model/healtharchive/FileInfo;", "localPath", "cropUrl", "enhanceUrl", "pdfImageUrl", "", "isMedicalDoc", "", "isPdf", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/heytap/databaseengine/model/healtharchive/FileInfo;Ljava/lang/String;Lcom/heytap/databaseengine/model/healtharchive/FileInfo;Lcom/heytap/databaseengine/model/healtharchive/FileInfo;Ljava/util/List;ZZ)V", "getClientFileId", "()Ljava/lang/String;", "setClientFileId", "(Ljava/lang/String;)V", "getCropUrl", "()Lcom/heytap/databaseengine/model/healtharchive/FileInfo;", "setCropUrl", "(Lcom/heytap/databaseengine/model/healtharchive/FileInfo;)V", "getDocId", "setDocId", "getEnhanceUrl", "setEnhanceUrl", "getFileIndex", "()I", "setFileIndex", "(I)V", "getFileName", "setFileName", "()Z", "setMedicalDoc", "(Z)V", "setPdf", "getLocalPath", "setLocalPath", "getOriginalUrl", "setOriginalUrl", "getPdfImageUrl", "()Ljava/util/List;", "setPdfImageUrl", "(Ljava/util/List;)V", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HealthArchiveFile extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HealthArchiveFile> CREATOR = new a();

    @NotNull
    private String clientFileId;

    @Nullable
    private FileInfo cropUrl;

    @NotNull
    private String docId;

    @Nullable
    private FileInfo enhanceUrl;
    private int fileIndex;

    @NotNull
    private String fileName;
    private boolean isMedicalDoc;
    private boolean isPdf;

    @Nullable
    private String localPath;

    @NotNull
    private FileInfo originalUrl;

    @Nullable
    private List<FileInfo> pdfImageUrl;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HealthArchiveFile> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HealthArchiveFile createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            Parcelable.Creator<FileInfo> creator = FileInfo.CREATOR;
            FileInfo fileInfoCreateFromParcel = creator.createFromParcel(parcel);
            String string4 = parcel.readString();
            ArrayList arrayList = null;
            FileInfo fileInfoCreateFromParcel2 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
            FileInfo fileInfoCreateFromParcel3 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(FileInfo.CREATOR.createFromParcel(parcel));
                }
            }
            return new HealthArchiveFile(string, string2, string3, i, fileInfoCreateFromParcel, string4, fileInfoCreateFromParcel2, fileInfoCreateFromParcel3, arrayList, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HealthArchiveFile[] newArray(int i) {
            return new HealthArchiveFile[i];
        }
    }

    public HealthArchiveFile() {
        this(null, null, null, 0, null, null, null, null, null, false, false, 2047, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClientFileId() {
        return this.clientFileId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsMedicalDoc() {
        return this.isMedicalDoc;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsPdf() {
        return this.isPdf;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDocId() {
        return this.docId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getFileIndex() {
        return this.fileIndex;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final FileInfo getOriginalUrl() {
        return this.originalUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLocalPath() {
        return this.localPath;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final FileInfo getCropUrl() {
        return this.cropUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final FileInfo getEnhanceUrl() {
        return this.enhanceUrl;
    }

    @Nullable
    public final List<FileInfo> component9() {
        return this.pdfImageUrl;
    }

    @NotNull
    public final HealthArchiveFile copy(@NotNull String clientFileId, @NotNull String fileName, @NotNull String docId, int fileIndex, @NotNull FileInfo originalUrl, @Nullable String localPath, @Nullable FileInfo cropUrl, @Nullable FileInfo enhanceUrl, @Nullable List<FileInfo> pdfImageUrl, boolean isMedicalDoc, boolean isPdf) {
        Intrinsics.checkNotNullParameter(clientFileId, "clientFileId");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(docId, "docId");
        Intrinsics.checkNotNullParameter(originalUrl, "originalUrl");
        return new HealthArchiveFile(clientFileId, fileName, docId, fileIndex, originalUrl, localPath, cropUrl, enhanceUrl, pdfImageUrl, isMedicalDoc, isPdf);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthArchiveFile)) {
            return false;
        }
        HealthArchiveFile healthArchiveFile = (HealthArchiveFile) other;
        return Intrinsics.areEqual(this.clientFileId, healthArchiveFile.clientFileId) && Intrinsics.areEqual(this.fileName, healthArchiveFile.fileName) && Intrinsics.areEqual(this.docId, healthArchiveFile.docId) && this.fileIndex == healthArchiveFile.fileIndex && Intrinsics.areEqual(this.originalUrl, healthArchiveFile.originalUrl) && Intrinsics.areEqual(this.localPath, healthArchiveFile.localPath) && Intrinsics.areEqual(this.cropUrl, healthArchiveFile.cropUrl) && Intrinsics.areEqual(this.enhanceUrl, healthArchiveFile.enhanceUrl) && Intrinsics.areEqual(this.pdfImageUrl, healthArchiveFile.pdfImageUrl) && this.isMedicalDoc == healthArchiveFile.isMedicalDoc && this.isPdf == healthArchiveFile.isPdf;
    }

    @NotNull
    public final String getClientFileId() {
        return this.clientFileId;
    }

    @Nullable
    public final FileInfo getCropUrl() {
        return this.cropUrl;
    }

    @NotNull
    public final String getDocId() {
        return this.docId;
    }

    @Nullable
    public final FileInfo getEnhanceUrl() {
        return this.enhanceUrl;
    }

    public final int getFileIndex() {
        return this.fileIndex;
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    @Nullable
    public final String getLocalPath() {
        return this.localPath;
    }

    @NotNull
    public final FileInfo getOriginalUrl() {
        return this.originalUrl;
    }

    @Nullable
    public final List<FileInfo> getPdfImageUrl() {
        return this.pdfImageUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = ((((((((this.clientFileId.hashCode() * 31) + this.fileName.hashCode()) * 31) + this.docId.hashCode()) * 31) + Integer.hashCode(this.fileIndex)) * 31) + this.originalUrl.hashCode()) * 31;
        String str = this.localPath;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        FileInfo fileInfo = this.cropUrl;
        int iHashCode3 = (iHashCode2 + (fileInfo == null ? 0 : fileInfo.hashCode())) * 31;
        FileInfo fileInfo2 = this.enhanceUrl;
        int iHashCode4 = (iHashCode3 + (fileInfo2 == null ? 0 : fileInfo2.hashCode())) * 31;
        List<FileInfo> list = this.pdfImageUrl;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z = this.isMedicalDoc;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode5 + r1) * 31;
        boolean z2 = this.isPdf;
        return i + (z2 ? 1 : z2);
    }

    public final boolean isMedicalDoc() {
        return this.isMedicalDoc;
    }

    public final boolean isPdf() {
        return this.isPdf;
    }

    public final void setClientFileId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clientFileId = str;
    }

    public final void setCropUrl(@Nullable FileInfo fileInfo) {
        this.cropUrl = fileInfo;
    }

    public final void setDocId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.docId = str;
    }

    public final void setEnhanceUrl(@Nullable FileInfo fileInfo) {
        this.enhanceUrl = fileInfo;
    }

    public final void setFileIndex(int i) {
        this.fileIndex = i;
    }

    public final void setFileName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fileName = str;
    }

    public final void setLocalPath(@Nullable String str) {
        this.localPath = str;
    }

    public final void setMedicalDoc(boolean z) {
        this.isMedicalDoc = z;
    }

    public final void setOriginalUrl(@NotNull FileInfo fileInfo) {
        Intrinsics.checkNotNullParameter(fileInfo, "<set-?>");
        this.originalUrl = fileInfo;
    }

    public final void setPdf(boolean z) {
        this.isPdf = z;
    }

    public final void setPdfImageUrl(@Nullable List<FileInfo> list) {
        this.pdfImageUrl = list;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "HealthArchiveFile(ssoid='" + getSsoid() + "', clientFileId='" + this.clientFileId + "', fileName='" + this.fileName + "', docId='" + this.docId + "', fileIndex='" + this.fileIndex + "', localPath='" + this.localPath + "',originalUrl='" + this.originalUrl + "', cropUrl='" + this.cropUrl + "', enhanceUrl='" + this.enhanceUrl + "', pdfImageUrl='" + this.pdfImageUrl + "', isPdf='" + this.isPdf + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.clientFileId);
        parcel.writeString(this.fileName);
        parcel.writeString(this.docId);
        parcel.writeInt(this.fileIndex);
        this.originalUrl.writeToParcel(parcel, flags);
        parcel.writeString(this.localPath);
        FileInfo fileInfo = this.cropUrl;
        if (fileInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fileInfo.writeToParcel(parcel, flags);
        }
        FileInfo fileInfo2 = this.enhanceUrl;
        if (fileInfo2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fileInfo2.writeToParcel(parcel, flags);
        }
        List<FileInfo> list = this.pdfImageUrl;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<FileInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, flags);
            }
        }
        parcel.writeInt(this.isMedicalDoc ? 1 : 0);
        parcel.writeInt(this.isPdf ? 1 : 0);
    }

    public /* synthetic */ HealthArchiveFile(String str, String str2, String str3, int i, FileInfo fileInfo, String str4, FileInfo fileInfo2, FileInfo fileInfo3, List list, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) == 0 ? str3 : "", (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? new FileInfo(0, null, null, 7, null) : fileInfo, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : fileInfo2, (i2 & 128) != 0 ? null : fileInfo3, (i2 & 256) == 0 ? list : null, (i2 & 512) != 0 ? false : z, (i2 & 1024) == 0 ? z2 : false);
    }

    public HealthArchiveFile(@NotNull String clientFileId, @NotNull String fileName, @NotNull String docId, int i, @NotNull FileInfo originalUrl, @Nullable String str, @Nullable FileInfo fileInfo, @Nullable FileInfo fileInfo2, @Nullable List<FileInfo> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(clientFileId, "clientFileId");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(docId, "docId");
        Intrinsics.checkNotNullParameter(originalUrl, "originalUrl");
        this.clientFileId = clientFileId;
        this.fileName = fileName;
        this.docId = docId;
        this.fileIndex = i;
        this.originalUrl = originalUrl;
        this.localPath = str;
        this.cropUrl = fileInfo;
        this.enhanceUrl = fileInfo2;
        this.pdfImageUrl = list;
        this.isMedicalDoc = z;
        this.isPdf = z2;
    }
}
