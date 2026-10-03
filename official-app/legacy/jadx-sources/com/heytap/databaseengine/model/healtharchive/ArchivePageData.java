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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003Jf\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010-J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020\u0003HÖ\u0001J\t\u00104\u001a\u00020\u0005HÖ\u0001J\u0019\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u0003HÖ\u0001R \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u0011¨\u0006:"}, d2 = {"Lcom/heytap/databaseengine/model/healtharchive/ArchivePageData;", "Landroid/os/Parcelable;", "sectionOrder", "", "sectionType", "", "tableName", "briefSummarize", "combineIndex", "complexTable", "tableData", "", "Lcom/heytap/databaseengine/model/healtharchive/ArchiveSectionData;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "getBriefSummarize", "()Ljava/lang/String;", "setBriefSummarize", "(Ljava/lang/String;)V", "getCombineIndex", "()Ljava/lang/Integer;", "setCombineIndex", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getComplexTable", "setComplexTable", "getSectionOrder", "()I", "setSectionOrder", "(I)V", "getSectionType", "setSectionType", "getTableData", "()Ljava/util/List;", "setTableData", "(Ljava/util/List;)V", "getTableName", "setTableName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/heytap/databaseengine/model/healtharchive/ArchivePageData;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ArchivePageData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ArchivePageData> CREATOR = new a();

    @SerializedName("brief_summarize")
    @Nullable
    private String briefSummarize;

    @SerializedName("combine_index")
    @Nullable
    private Integer combineIndex;

    @SerializedName("complex_table")
    @Nullable
    private Integer complexTable;

    @SerializedName("section_order")
    private int sectionOrder;

    @SerializedName("section_type")
    @Nullable
    private String sectionType;

    @SerializedName("table_data")
    @Nullable
    private List<ArchiveSectionData> tableData;

    @SerializedName("table_name")
    @Nullable
    private String tableName;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ArchivePageData> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArchivePageData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(ArchiveSectionData.CREATOR.createFromParcel(parcel));
                }
            }
            return new ArchivePageData(i, string, string2, string3, numValueOf, numValueOf2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ArchivePageData[] newArray(int i) {
            return new ArchivePageData[i];
        }
    }

    public ArchivePageData() {
        this(0, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArchivePageData copy$default(ArchivePageData archivePageData, int i, String str, String str2, String str3, Integer num, Integer num2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = archivePageData.sectionOrder;
        }
        if ((i2 & 2) != 0) {
            str = archivePageData.sectionType;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = archivePageData.tableName;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = archivePageData.briefSummarize;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            num = archivePageData.combineIndex;
        }
        Integer num3 = num;
        if ((i2 & 32) != 0) {
            num2 = archivePageData.complexTable;
        }
        Integer num4 = num2;
        if ((i2 & 64) != 0) {
            list = archivePageData.tableData;
        }
        return archivePageData.copy(i, str4, str5, str6, num3, num4, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSectionOrder() {
        return this.sectionOrder;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSectionType() {
        return this.sectionType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTableName() {
        return this.tableName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBriefSummarize() {
        return this.briefSummarize;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getCombineIndex() {
        return this.combineIndex;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getComplexTable() {
        return this.complexTable;
    }

    @Nullable
    public final List<ArchiveSectionData> component7() {
        return this.tableData;
    }

    @NotNull
    public final ArchivePageData copy(int sectionOrder, @Nullable String sectionType, @Nullable String tableName, @Nullable String briefSummarize, @Nullable Integer combineIndex, @Nullable Integer complexTable, @Nullable List<ArchiveSectionData> tableData) {
        return new ArchivePageData(sectionOrder, sectionType, tableName, briefSummarize, combineIndex, complexTable, tableData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArchivePageData)) {
            return false;
        }
        ArchivePageData archivePageData = (ArchivePageData) other;
        return this.sectionOrder == archivePageData.sectionOrder && Intrinsics.areEqual(this.sectionType, archivePageData.sectionType) && Intrinsics.areEqual(this.tableName, archivePageData.tableName) && Intrinsics.areEqual(this.briefSummarize, archivePageData.briefSummarize) && Intrinsics.areEqual(this.combineIndex, archivePageData.combineIndex) && Intrinsics.areEqual(this.complexTable, archivePageData.complexTable) && Intrinsics.areEqual(this.tableData, archivePageData.tableData);
    }

    @Nullable
    public final String getBriefSummarize() {
        return this.briefSummarize;
    }

    @Nullable
    public final Integer getCombineIndex() {
        return this.combineIndex;
    }

    @Nullable
    public final Integer getComplexTable() {
        return this.complexTable;
    }

    public final int getSectionOrder() {
        return this.sectionOrder;
    }

    @Nullable
    public final String getSectionType() {
        return this.sectionType;
    }

    @Nullable
    public final List<ArchiveSectionData> getTableData() {
        return this.tableData;
    }

    @Nullable
    public final String getTableName() {
        return this.tableName;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.sectionOrder) * 31;
        String str = this.sectionType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tableName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.briefSummarize;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.combineIndex;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.complexTable;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<ArchiveSectionData> list = this.tableData;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final void setBriefSummarize(@Nullable String str) {
        this.briefSummarize = str;
    }

    public final void setCombineIndex(@Nullable Integer num) {
        this.combineIndex = num;
    }

    public final void setComplexTable(@Nullable Integer num) {
        this.complexTable = num;
    }

    public final void setSectionOrder(int i) {
        this.sectionOrder = i;
    }

    public final void setSectionType(@Nullable String str) {
        this.sectionType = str;
    }

    public final void setTableData(@Nullable List<ArchiveSectionData> list) {
        this.tableData = list;
    }

    public final void setTableName(@Nullable String str) {
        this.tableName = str;
    }

    @NotNull
    public String toString() {
        return "ArchivePageData(sectionOrder=" + this.sectionOrder + ", sectionType=" + this.sectionType + ", tableName=" + this.tableName + ", briefSummarize=" + this.briefSummarize + ", combineIndex=" + this.combineIndex + ", complexTable=" + this.complexTable + ", tableData=" + this.tableData + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.sectionOrder);
        parcel.writeString(this.sectionType);
        parcel.writeString(this.tableName);
        parcel.writeString(this.briefSummarize);
        Integer num = this.combineIndex;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.complexTable;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        List<ArchiveSectionData> list = this.tableData;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<ArchiveSectionData> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }

    public ArchivePageData(int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Integer num2, @Nullable List<ArchiveSectionData> list) {
        this.sectionOrder = i;
        this.sectionType = str;
        this.tableName = str2;
        this.briefSummarize = str3;
        this.combineIndex = num;
        this.complexTable = num2;
        this.tableData = list;
    }

    public /* synthetic */ ArchivePageData(int i, String str, String str2, String str3, Integer num, Integer num2, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : num2, (i2 & 64) == 0 ? list : null);
    }
}
