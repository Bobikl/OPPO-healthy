package com.heytap.databaseengine.model.healtharchive;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bHÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R&\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u0006."}, d2 = {"Lcom/heytap/databaseengine/model/healtharchive/ArchiveStructData;", "Landroid/os/Parcelable;", "fileIndex", "", "url", "", "clientFileId", "quality", "", "pageData", "Lcom/heytap/databaseengine/model/healtharchive/ArchivePageData;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getClientFileId", "()Ljava/lang/String;", "setClientFileId", "(Ljava/lang/String;)V", "getFileIndex", "()I", "setFileIndex", "(I)V", "getPageData", "()Ljava/util/List;", "setPageData", "(Ljava/util/List;)V", "getQuality", "setQuality", "getUrl", "setUrl", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ArchiveStructData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ArchiveStructData> CREATOR = new a();

    @Nullable
    private String clientFileId;
    private int fileIndex;

    @SerializedName("page_data")
    @Nullable
    private List<ArchivePageData> pageData;

    @Nullable
    private List<String> quality;

    @Nullable
    private String url;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ArchiveStructData> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArchiveStructData createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList2.add(ArchivePageData.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new ArchiveStructData(i, string, string2, arrayListCreateStringArrayList, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ArchiveStructData[] newArray(int i) {
            return new ArchiveStructData[i];
        }
    }

    public ArchiveStructData() {
        this(0, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArchiveStructData copy$default(ArchiveStructData archiveStructData, int i, String str, String str2, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = archiveStructData.fileIndex;
        }
        if ((i2 & 2) != 0) {
            str = archiveStructData.url;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = archiveStructData.clientFileId;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            list = archiveStructData.quality;
        }
        List list3 = list;
        if ((i2 & 16) != 0) {
            list2 = archiveStructData.pageData;
        }
        return archiveStructData.copy(i, str3, str4, list3, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getFileIndex() {
        return this.fileIndex;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getClientFileId() {
        return this.clientFileId;
    }

    @Nullable
    public final List<String> component4() {
        return this.quality;
    }

    @Nullable
    public final List<ArchivePageData> component5() {
        return this.pageData;
    }

    @NotNull
    public final ArchiveStructData copy(int fileIndex, @Nullable String url, @Nullable String clientFileId, @Nullable List<String> quality, @Nullable List<ArchivePageData> pageData) {
        return new ArchiveStructData(fileIndex, url, clientFileId, quality, pageData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArchiveStructData)) {
            return false;
        }
        ArchiveStructData archiveStructData = (ArchiveStructData) other;
        return this.fileIndex == archiveStructData.fileIndex && Intrinsics.areEqual(this.url, archiveStructData.url) && Intrinsics.areEqual(this.clientFileId, archiveStructData.clientFileId) && Intrinsics.areEqual(this.quality, archiveStructData.quality) && Intrinsics.areEqual(this.pageData, archiveStructData.pageData);
    }

    @Nullable
    public final String getClientFileId() {
        return this.clientFileId;
    }

    public final int getFileIndex() {
        return this.fileIndex;
    }

    @Nullable
    public final List<ArchivePageData> getPageData() {
        return this.pageData;
    }

    @Nullable
    public final List<String> getQuality() {
        return this.quality;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.fileIndex) * 31;
        String str = this.url;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.clientFileId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.quality;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<ArchivePageData> list2 = this.pageData;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setClientFileId(@Nullable String str) {
        this.clientFileId = str;
    }

    public final void setFileIndex(int i) {
        this.fileIndex = i;
    }

    public final void setPageData(@Nullable List<ArchivePageData> list) {
        this.pageData = list;
    }

    public final void setQuality(@Nullable List<String> list) {
        this.quality = list;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    @NotNull
    public String toString() {
        return "ArchiveStructData(fileIndex=" + this.fileIndex + ", url=" + this.url + ", clientFileId=" + this.clientFileId + ", quality=" + this.quality + ", pageData=" + this.pageData + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.fileIndex);
        parcel.writeString(this.url);
        parcel.writeString(this.clientFileId);
        parcel.writeStringList(this.quality);
        List<ArchivePageData> list = this.pageData;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<ArchivePageData> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }

    public ArchiveStructData(int i, @Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable List<ArchivePageData> list2) {
        this.fileIndex = i;
        this.url = str;
        this.clientFileId = str2;
        this.quality = list;
        this.pageData = list2;
    }

    public /* synthetic */ ArchiveStructData(int i, String str, String str2, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : list, (i2 & 16) == 0 ? list2 : null);
    }
}
