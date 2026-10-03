package com.heytap.databaseengine.model.healtharchive;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001J\b\u0010\u001d\u001a\u00020\u0006H\u0016J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006#"}, d2 = {"Lcom/heytap/databaseengine/model/healtharchive/FileInfo;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "fileIndex", "", "clientFileId", "", "url", "(ILjava/lang/String;Ljava/lang/String;)V", "getClientFileId", "()Ljava/lang/String;", "setClientFileId", "(Ljava/lang/String;)V", "getFileIndex", "()I", "setFileIndex", "(I)V", "getUrl", "setUrl", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FileInfo extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FileInfo> CREATOR = new a();

    @Nullable
    private String clientFileId;
    private int fileIndex;

    @Nullable
    private String url;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FileInfo> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FileInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FileInfo(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FileInfo[] newArray(int i) {
            return new FileInfo[i];
        }
    }

    public FileInfo() {
        this(0, null, null, 7, null);
    }

    public static /* synthetic */ FileInfo copy$default(FileInfo fileInfo, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fileInfo.fileIndex;
        }
        if ((i2 & 2) != 0) {
            str = fileInfo.clientFileId;
        }
        if ((i2 & 4) != 0) {
            str2 = fileInfo.url;
        }
        return fileInfo.copy(i, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getFileIndex() {
        return this.fileIndex;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getClientFileId() {
        return this.clientFileId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final FileInfo copy(int fileIndex, @Nullable String clientFileId, @Nullable String url) {
        return new FileInfo(fileIndex, clientFileId, url);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileInfo)) {
            return false;
        }
        FileInfo fileInfo = (FileInfo) other;
        return this.fileIndex == fileInfo.fileIndex && Intrinsics.areEqual(this.clientFileId, fileInfo.clientFileId) && Intrinsics.areEqual(this.url, fileInfo.url);
    }

    @Nullable
    public final String getClientFileId() {
        return this.clientFileId;
    }

    public final int getFileIndex() {
        return this.fileIndex;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.fileIndex) * 31;
        String str = this.clientFileId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setClientFileId(@Nullable String str) {
        this.clientFileId = str;
    }

    public final void setFileIndex(int i) {
        this.fileIndex = i;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "FileInfo(fileIndex='" + this.fileIndex + "', clientFileId='" + this.clientFileId + "', url='" + this.url + "'')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.fileIndex);
        parcel.writeString(this.clientFileId);
        parcel.writeString(this.url);
    }

    public /* synthetic */ FileInfo(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2);
    }

    public FileInfo(int i, @Nullable String str, @Nullable String str2) {
        this.fileIndex = i;
        this.clientFileId = str;
        this.url = str2;
    }
}
