package com.heytap.databaseengine.model.healtharchive;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
import com.google.gson.annotations.SerializedName;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003Jq\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u00020\u0003HÖ\u0001J\t\u00107\u001a\u00020\fHÖ\u0001J\u0019\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0003HÖ\u0001R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$¨\u0006="}, d2 = {"Lcom/heytap/databaseengine/model/healtharchive/ArchiveSectionData;", "Landroid/os/Parcelable;", "order", "", "column1", "Lcom/heytap/databaseengine/model/healtharchive/ArchiveValueLocation;", "column2", "column3", "column4", "column5", "column6", "descriptionUrl", "", "valueState", "(ILcom/heytap/databaseengine/model/healtharchive/ArchiveValueLocation;Lcom/heytap/databaseengine/model/healtharchive/ArchiveValueLocation;Lcom/heytap/databaseengine/model/healtharchive/ArchiveValueLocation;Lcom/heytap/databaseengine/model/healtharchive/ArchiveValueLocation;Lcom/heytap/databaseengine/model/healtharchive/ArchiveValueLocation;Lcom/heytap/databaseengine/model/healtharchive/ArchiveValueLocation;Ljava/lang/String;I)V", "getColumn1", "()Lcom/heytap/databaseengine/model/healtharchive/ArchiveValueLocation;", "setColumn1", "(Lcom/heytap/databaseengine/model/healtharchive/ArchiveValueLocation;)V", "getColumn2", "setColumn2", "getColumn3", "setColumn3", "getColumn4", "setColumn4", "getColumn5", "setColumn5", "getColumn6", "setColumn6", "getDescriptionUrl", "()Ljava/lang/String;", "setDescriptionUrl", "(Ljava/lang/String;)V", "getOrder", "()I", "setOrder", "(I)V", "getValueState", "setValueState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ArchiveSectionData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ArchiveSectionData> CREATOR = new a();

    @SerializedName(alternate = {"field_keys"}, value = "ne_name")
    @Nullable
    private ArchiveValueLocation column1;

    @SerializedName(alternate = {"field_text"}, value = "ne_value")
    @Nullable
    private ArchiveValueLocation column2;

    @SerializedName("ne_unit")
    @Nullable
    private ArchiveValueLocation column3;

    @SerializedName("ne_refer")
    @Nullable
    private ArchiveValueLocation column4;

    @SerializedName("ne_remind")
    @Nullable
    private ArchiveValueLocation column5;

    @SerializedName("drug_freq")
    @Nullable
    private ArchiveValueLocation column6;

    @Nullable
    private String descriptionUrl;
    private int order;
    private int valueState;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ArchiveSectionData> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArchiveSectionData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ArchiveSectionData(parcel.readInt(), parcel.readInt() == 0 ? null : ArchiveValueLocation.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ArchiveValueLocation.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ArchiveValueLocation.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ArchiveValueLocation.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ArchiveValueLocation.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ArchiveValueLocation.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ArchiveSectionData[] newArray(int i) {
            return new ArchiveSectionData[i];
        }
    }

    public ArchiveSectionData() {
        this(0, null, null, null, null, null, null, null, 0, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ArchiveValueLocation getColumn1() {
        return this.column1;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ArchiveValueLocation getColumn2() {
        return this.column2;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ArchiveValueLocation getColumn3() {
        return this.column3;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ArchiveValueLocation getColumn4() {
        return this.column4;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ArchiveValueLocation getColumn5() {
        return this.column5;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ArchiveValueLocation getColumn6() {
        return this.column6;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDescriptionUrl() {
        return this.descriptionUrl;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getValueState() {
        return this.valueState;
    }

    @NotNull
    public final ArchiveSectionData copy(int order, @Nullable ArchiveValueLocation column1, @Nullable ArchiveValueLocation column2, @Nullable ArchiveValueLocation column3, @Nullable ArchiveValueLocation column4, @Nullable ArchiveValueLocation column5, @Nullable ArchiveValueLocation column6, @Nullable String descriptionUrl, int valueState) {
        return new ArchiveSectionData(order, column1, column2, column3, column4, column5, column6, descriptionUrl, valueState);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArchiveSectionData)) {
            return false;
        }
        ArchiveSectionData archiveSectionData = (ArchiveSectionData) other;
        return this.order == archiveSectionData.order && Intrinsics.areEqual(this.column1, archiveSectionData.column1) && Intrinsics.areEqual(this.column2, archiveSectionData.column2) && Intrinsics.areEqual(this.column3, archiveSectionData.column3) && Intrinsics.areEqual(this.column4, archiveSectionData.column4) && Intrinsics.areEqual(this.column5, archiveSectionData.column5) && Intrinsics.areEqual(this.column6, archiveSectionData.column6) && Intrinsics.areEqual(this.descriptionUrl, archiveSectionData.descriptionUrl) && this.valueState == archiveSectionData.valueState;
    }

    @Nullable
    public final ArchiveValueLocation getColumn1() {
        return this.column1;
    }

    @Nullable
    public final ArchiveValueLocation getColumn2() {
        return this.column2;
    }

    @Nullable
    public final ArchiveValueLocation getColumn3() {
        return this.column3;
    }

    @Nullable
    public final ArchiveValueLocation getColumn4() {
        return this.column4;
    }

    @Nullable
    public final ArchiveValueLocation getColumn5() {
        return this.column5;
    }

    @Nullable
    public final ArchiveValueLocation getColumn6() {
        return this.column6;
    }

    @Nullable
    public final String getDescriptionUrl() {
        return this.descriptionUrl;
    }

    public final int getOrder() {
        return this.order;
    }

    public final int getValueState() {
        return this.valueState;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.order) * 31;
        ArchiveValueLocation archiveValueLocation = this.column1;
        int iHashCode2 = (iHashCode + (archiveValueLocation == null ? 0 : archiveValueLocation.hashCode())) * 31;
        ArchiveValueLocation archiveValueLocation2 = this.column2;
        int iHashCode3 = (iHashCode2 + (archiveValueLocation2 == null ? 0 : archiveValueLocation2.hashCode())) * 31;
        ArchiveValueLocation archiveValueLocation3 = this.column3;
        int iHashCode4 = (iHashCode3 + (archiveValueLocation3 == null ? 0 : archiveValueLocation3.hashCode())) * 31;
        ArchiveValueLocation archiveValueLocation4 = this.column4;
        int iHashCode5 = (iHashCode4 + (archiveValueLocation4 == null ? 0 : archiveValueLocation4.hashCode())) * 31;
        ArchiveValueLocation archiveValueLocation5 = this.column5;
        int iHashCode6 = (iHashCode5 + (archiveValueLocation5 == null ? 0 : archiveValueLocation5.hashCode())) * 31;
        ArchiveValueLocation archiveValueLocation6 = this.column6;
        int iHashCode7 = (iHashCode6 + (archiveValueLocation6 == null ? 0 : archiveValueLocation6.hashCode())) * 31;
        String str = this.descriptionUrl;
        return ((iHashCode7 + (str != null ? str.hashCode() : 0)) * 31) + Integer.hashCode(this.valueState);
    }

    public final void setColumn1(@Nullable ArchiveValueLocation archiveValueLocation) {
        this.column1 = archiveValueLocation;
    }

    public final void setColumn2(@Nullable ArchiveValueLocation archiveValueLocation) {
        this.column2 = archiveValueLocation;
    }

    public final void setColumn3(@Nullable ArchiveValueLocation archiveValueLocation) {
        this.column3 = archiveValueLocation;
    }

    public final void setColumn4(@Nullable ArchiveValueLocation archiveValueLocation) {
        this.column4 = archiveValueLocation;
    }

    public final void setColumn5(@Nullable ArchiveValueLocation archiveValueLocation) {
        this.column5 = archiveValueLocation;
    }

    public final void setColumn6(@Nullable ArchiveValueLocation archiveValueLocation) {
        this.column6 = archiveValueLocation;
    }

    public final void setDescriptionUrl(@Nullable String str) {
        this.descriptionUrl = str;
    }

    public final void setOrder(int i) {
        this.order = i;
    }

    public final void setValueState(int i) {
        this.valueState = i;
    }

    @NotNull
    public String toString() {
        return "ArchiveSectionData(order=" + this.order + ", column1=" + this.column1 + ", column2=" + this.column2 + ", column3=" + this.column3 + ", column4=" + this.column4 + ", column5=" + this.column5 + ", column6=" + this.column6 + ", descriptionUrl=" + this.descriptionUrl + ", valueState=" + this.valueState + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.order);
        ArchiveValueLocation archiveValueLocation = this.column1;
        if (archiveValueLocation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            archiveValueLocation.writeToParcel(parcel, flags);
        }
        ArchiveValueLocation archiveValueLocation2 = this.column2;
        if (archiveValueLocation2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            archiveValueLocation2.writeToParcel(parcel, flags);
        }
        ArchiveValueLocation archiveValueLocation3 = this.column3;
        if (archiveValueLocation3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            archiveValueLocation3.writeToParcel(parcel, flags);
        }
        ArchiveValueLocation archiveValueLocation4 = this.column4;
        if (archiveValueLocation4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            archiveValueLocation4.writeToParcel(parcel, flags);
        }
        ArchiveValueLocation archiveValueLocation5 = this.column5;
        if (archiveValueLocation5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            archiveValueLocation5.writeToParcel(parcel, flags);
        }
        ArchiveValueLocation archiveValueLocation6 = this.column6;
        if (archiveValueLocation6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            archiveValueLocation6.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.descriptionUrl);
        parcel.writeInt(this.valueState);
    }

    public ArchiveSectionData(int i, @Nullable ArchiveValueLocation archiveValueLocation, @Nullable ArchiveValueLocation archiveValueLocation2, @Nullable ArchiveValueLocation archiveValueLocation3, @Nullable ArchiveValueLocation archiveValueLocation4, @Nullable ArchiveValueLocation archiveValueLocation5, @Nullable ArchiveValueLocation archiveValueLocation6, @Nullable String str, int i2) {
        this.order = i;
        this.column1 = archiveValueLocation;
        this.column2 = archiveValueLocation2;
        this.column3 = archiveValueLocation3;
        this.column4 = archiveValueLocation4;
        this.column5 = archiveValueLocation5;
        this.column6 = archiveValueLocation6;
        this.descriptionUrl = str;
        this.valueState = i2;
    }

    public /* synthetic */ ArchiveSectionData(int i, ArchiveValueLocation archiveValueLocation, ArchiveValueLocation archiveValueLocation2, ArchiveValueLocation archiveValueLocation3, ArchiveValueLocation archiveValueLocation4, ArchiveValueLocation archiveValueLocation5, ArchiveValueLocation archiveValueLocation6, String str, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? null : archiveValueLocation, (i3 & 4) != 0 ? null : archiveValueLocation2, (i3 & 8) != 0 ? null : archiveValueLocation3, (i3 & 16) != 0 ? null : archiveValueLocation4, (i3 & 32) != 0 ? null : archiveValueLocation5, (i3 & 64) != 0 ? null : archiveValueLocation6, (i3 & 128) != 0 ? null : str, (i3 & 256) != 0 ? 0 : i2);
    }
}
