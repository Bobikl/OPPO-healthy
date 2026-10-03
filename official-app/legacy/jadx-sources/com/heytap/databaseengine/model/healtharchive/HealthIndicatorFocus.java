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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0002\u0010\rJ\t\u0010 \u001a\u00020\u0004HÂ\u0003J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010$\u001a\u00020\u0004HÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003JS\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\b\u0010.\u001a\u00020\u0004H\u0016J\t\u0010/\u001a\u00020)HÖ\u0001J\b\u00100\u001a\u00020\u0004H\u0016J\u0019\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020)HÖ\u0001R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001b¨\u00066"}, d2 = {"Lcom/heytap/databaseengine/model/healtharchive/HealthIndicatorFocus;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "ssoid", "", "name", "indicatorDetail", "Lcom/heytap/databaseengine/model/healtharchive/HealthIndicatorDetail;", "owner", "summary", "dataCreatedTimestamp", "", "modifiedTimestamp", "(Ljava/lang/String;Ljava/lang/String;Lcom/heytap/databaseengine/model/healtharchive/HealthIndicatorDetail;Ljava/lang/String;Ljava/lang/String;JJ)V", "getDataCreatedTimestamp", "()J", "setDataCreatedTimestamp", "(J)V", "getIndicatorDetail", "()Lcom/heytap/databaseengine/model/healtharchive/HealthIndicatorDetail;", "setIndicatorDetail", "(Lcom/heytap/databaseengine/model/healtharchive/HealthIndicatorDetail;)V", "getModifiedTimestamp", "setModifiedTimestamp", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getOwner", "setOwner", "getSummary", "setSummary", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "getSsoid", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HealthIndicatorFocus extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HealthIndicatorFocus> CREATOR = new a();
    private long dataCreatedTimestamp;

    @Nullable
    private IndicatorStat indicatorDetail;
    private long modifiedTimestamp;

    @NotNull
    private String name;

    @Nullable
    private String owner;

    @NotNull
    private String ssoid;

    @NotNull
    private String summary;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HealthIndicatorFocus> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HealthIndicatorFocus createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HealthIndicatorFocus(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : IndicatorStat.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HealthIndicatorFocus[] newArray(int i) {
            return new HealthIndicatorFocus[i];
        }
    }

    public HealthIndicatorFocus() {
        this(null, null, null, null, null, 0L, 0L, 127, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getSsoid() {
        return this.ssoid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final IndicatorStat getIndicatorDetail() {
        return this.indicatorDetail;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOwner() {
        return this.owner;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @NotNull
    public final HealthIndicatorFocus copy(@NotNull String ssoid, @NotNull String name, @Nullable IndicatorStat indicatorDetail, @Nullable String owner, @NotNull String summary, long dataCreatedTimestamp, long modifiedTimestamp) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(summary, "summary");
        return new HealthIndicatorFocus(ssoid, name, indicatorDetail, owner, summary, dataCreatedTimestamp, modifiedTimestamp);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthIndicatorFocus)) {
            return false;
        }
        HealthIndicatorFocus healthIndicatorFocus = (HealthIndicatorFocus) other;
        return Intrinsics.areEqual(this.ssoid, healthIndicatorFocus.ssoid) && Intrinsics.areEqual(this.name, healthIndicatorFocus.name) && Intrinsics.areEqual(this.indicatorDetail, healthIndicatorFocus.indicatorDetail) && Intrinsics.areEqual(this.owner, healthIndicatorFocus.owner) && Intrinsics.areEqual(this.summary, healthIndicatorFocus.summary) && this.dataCreatedTimestamp == healthIndicatorFocus.dataCreatedTimestamp && this.modifiedTimestamp == healthIndicatorFocus.modifiedTimestamp;
    }

    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    @Nullable
    public final IndicatorStat getIndicatorDetail() {
        return this.indicatorDetail;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getOwner() {
        return this.owner;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    @NotNull
    public final String getSummary() {
        return this.summary;
    }

    public int hashCode() {
        int iHashCode = ((this.ssoid.hashCode() * 31) + this.name.hashCode()) * 31;
        IndicatorStat indicatorStat = this.indicatorDetail;
        int iHashCode2 = (iHashCode + (indicatorStat == null ? 0 : indicatorStat.hashCode())) * 31;
        String str = this.owner;
        return ((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.summary.hashCode()) * 31) + Long.hashCode(this.dataCreatedTimestamp)) * 31) + Long.hashCode(this.modifiedTimestamp);
    }

    public final void setDataCreatedTimestamp(long j2) {
        this.dataCreatedTimestamp = j2;
    }

    public final void setIndicatorDetail(@Nullable IndicatorStat indicatorStat) {
        this.indicatorDetail = indicatorStat;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setOwner(@Nullable String str) {
        this.owner = str;
    }

    public final void setSummary(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.summary = str;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "HealthIndicatorFocus(ssoid='" + this.ssoid + "', name=" + this.name + ", indicatorDetail='" + this.indicatorDetail + "', summary='" + this.summary + "',   owner='" + this.owner + "', dataCreatedTimestamp='" + this.dataCreatedTimestamp + "',  modifiedTimestamp='" + this.modifiedTimestamp + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.name);
        IndicatorStat indicatorStat = this.indicatorDetail;
        if (indicatorStat == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            indicatorStat.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.owner);
        parcel.writeString(this.summary);
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeLong(this.modifiedTimestamp);
    }

    public /* synthetic */ HealthIndicatorFocus(String str, String str2, IndicatorStat indicatorStat, String str3, String str4, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : indicatorStat, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? 0L : j2, (i & 64) != 0 ? 0L : j3);
    }

    public HealthIndicatorFocus(@NotNull String ssoid, @NotNull String name, @Nullable IndicatorStat indicatorStat, @Nullable String str, @NotNull String summary, long j2, long j3) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(summary, "summary");
        this.ssoid = ssoid;
        this.name = name;
        this.indicatorDetail = indicatorStat;
        this.owner = str;
        this.summary = summary;
        this.dataCreatedTimestamp = j2;
        this.modifiedTimestamp = j3;
    }
}
