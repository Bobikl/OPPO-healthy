package com.heytap.databaseengine.model.healtharchive;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengineservice.db.table.healtharchives.DBIndicatorStat;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b0\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00104\u001a\u00020\fHÆ\u0003J\t\u00105\u001a\u00020\u0011HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010<\u001a\u00020\fHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008f\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\t\u0010?\u001a\u00020\fHÖ\u0001J\u0013\u0010@\u001a\u00020\u00112\b\u0010A\u001a\u0004\u0018\u00010BH\u0096\u0002J\b\u0010C\u001a\u00020\fH\u0016J\t\u0010D\u001a\u00020\u0003HÖ\u0001J\u0019\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\fHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0016R\u001a\u0010\u000f\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0014\"\u0004\b-\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0014\"\u0004\b/\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010%\"\u0004\b1\u0010'¨\u0006J"}, d2 = {"Lcom/heytap/databaseengine/model/healtharchive/IndicatorTrend;", "Landroid/os/Parcelable;", "docId", "", ClickApiEntity.TIME, "", "value", "originalValue", "originalName", "institute", "range", "valueState", "", DBIndicatorStat.REMIND, "unit", "riskRank", "isUniform", "", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IZ)V", "getDocId", "()Ljava/lang/String;", "setDocId", "(Ljava/lang/String;)V", "getInstitute", "setInstitute", "()Z", "setUniform", "(Z)V", "getOriginalName", "setOriginalName", "getOriginalValue", "setOriginalValue", "getRange", "setRange", "getRemind", "setRemind", "getRiskRank", "()I", "setRiskRank", "(I)V", "getTime", "()J", "setTime", "(J)V", "getUnit", "setUnit", "getValue", "setValue", "getValueState", "setValueState", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class IndicatorTrend implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IndicatorTrend> CREATOR = new a();

    @NotNull
    private String docId;

    @Nullable
    private String institute;
    private boolean isUniform;

    @Nullable
    private String originalName;

    @Nullable
    private String originalValue;

    @Nullable
    private String range;

    @Nullable
    private String remind;
    private int riskRank;
    private long time;

    @Nullable
    private String unit;

    @Nullable
    private String value;
    private int valueState;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IndicatorTrend> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IndicatorTrend createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IndicatorTrend(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final IndicatorTrend[] newArray(int i) {
            return new IndicatorTrend[i];
        }
    }

    public IndicatorTrend() {
        this(null, 0L, null, null, null, null, null, 0, null, null, 0, false, 4095, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDocId() {
        return this.docId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getRiskRank() {
        return this.riskRank;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIsUniform() {
        return this.isUniform;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOriginalValue() {
        return this.originalValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOriginalName() {
        return this.originalName;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getInstitute() {
        return this.institute;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRange() {
        return this.range;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getValueState() {
        return this.valueState;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRemind() {
        return this.remind;
    }

    @NotNull
    public final IndicatorTrend copy(@NotNull String docId, long time, @Nullable String value, @Nullable String originalValue, @Nullable String originalName, @Nullable String institute, @Nullable String range, int valueState, @Nullable String remind, @Nullable String unit, int riskRank, boolean isUniform) {
        Intrinsics.checkNotNullParameter(docId, "docId");
        return new IndicatorTrend(docId, time, value, originalValue, originalName, institute, range, valueState, remind, unit, riskRank, isUniform);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof IndicatorTrend)) {
            return super.equals(other);
        }
        IndicatorTrend indicatorTrend = (IndicatorTrend) other;
        return Intrinsics.areEqual(this.docId, indicatorTrend.docId) && this.time == indicatorTrend.time && Intrinsics.areEqual(this.value, indicatorTrend.value) && Intrinsics.areEqual(this.institute, indicatorTrend.institute) && Intrinsics.areEqual(this.range, indicatorTrend.range) && this.valueState == indicatorTrend.valueState && this.riskRank == indicatorTrend.riskRank && Intrinsics.areEqual(this.originalName, indicatorTrend.originalName) && this.isUniform == indicatorTrend.isUniform;
    }

    @NotNull
    public final String getDocId() {
        return this.docId;
    }

    @Nullable
    public final String getInstitute() {
        return this.institute;
    }

    @Nullable
    public final String getOriginalName() {
        return this.originalName;
    }

    @Nullable
    public final String getOriginalValue() {
        return this.originalValue;
    }

    @Nullable
    public final String getRange() {
        return this.range;
    }

    @Nullable
    public final String getRemind() {
        return this.remind;
    }

    public final int getRiskRank() {
        return this.riskRank;
    }

    public final long getTime() {
        return this.time;
    }

    @Nullable
    public final String getUnit() {
        return this.unit;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public final int getValueState() {
        return this.valueState;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public final boolean isUniform() {
        return this.isUniform;
    }

    public final void setDocId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.docId = str;
    }

    public final void setInstitute(@Nullable String str) {
        this.institute = str;
    }

    public final void setOriginalName(@Nullable String str) {
        this.originalName = str;
    }

    public final void setOriginalValue(@Nullable String str) {
        this.originalValue = str;
    }

    public final void setRange(@Nullable String str) {
        this.range = str;
    }

    public final void setRemind(@Nullable String str) {
        this.remind = str;
    }

    public final void setRiskRank(int i) {
        this.riskRank = i;
    }

    public final void setTime(long j2) {
        this.time = j2;
    }

    public final void setUniform(boolean z) {
        this.isUniform = z;
    }

    public final void setUnit(@Nullable String str) {
        this.unit = str;
    }

    public final void setValue(@Nullable String str) {
        this.value = str;
    }

    public final void setValueState(int i) {
        this.valueState = i;
    }

    @NotNull
    public String toString() {
        return "IndicatorTrend(docId=" + this.docId + ", time=" + this.time + ", value=" + this.value + ", originalValue=" + this.originalValue + ", originalName=" + this.originalName + ", institute=" + this.institute + ", range=" + this.range + ", valueState=" + this.valueState + ", remind=" + this.remind + ", unit=" + this.unit + ", riskRank=" + this.riskRank + ", isUniform=" + this.isUniform + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.docId);
        parcel.writeLong(this.time);
        parcel.writeString(this.value);
        parcel.writeString(this.originalValue);
        parcel.writeString(this.originalName);
        parcel.writeString(this.institute);
        parcel.writeString(this.range);
        parcel.writeInt(this.valueState);
        parcel.writeString(this.remind);
        parcel.writeString(this.unit);
        parcel.writeInt(this.riskRank);
        parcel.writeInt(this.isUniform ? 1 : 0);
    }

    public IndicatorTrend(@NotNull String docId, long j2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i, @Nullable String str6, @Nullable String str7, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(docId, "docId");
        this.docId = docId;
        this.time = j2;
        this.value = str;
        this.originalValue = str2;
        this.originalName = str3;
        this.institute = str4;
        this.range = str5;
        this.valueState = i;
        this.remind = str6;
        this.unit = str7;
        this.riskRank = i2;
        this.isUniform = z;
    }

    public /* synthetic */ IndicatorTrend(String str, long j2, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0L : j2, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? null : str4, (i3 & 32) != 0 ? null : str5, (i3 & 64) != 0 ? null : str6, (i3 & 128) != 0 ? 0 : i, (i3 & 256) != 0 ? null : str7, (i3 & 512) == 0 ? str8 : null, (i3 & 1024) == 0 ? i2 : 0, (i3 & 2048) != 0 ? true : z);
    }
}
