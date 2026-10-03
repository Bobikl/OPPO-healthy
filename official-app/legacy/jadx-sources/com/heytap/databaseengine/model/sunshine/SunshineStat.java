package com.heytap.databaseengine.model.sunshine;

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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b3\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0089\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b¢\u0006\u0002\u0010\u0013J\t\u00102\u001a\u00020\u0004HÂ\u0003J\t\u00103\u001a\u00020\bHÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J\t\u00107\u001a\u00020\u0004HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u00109\u001a\u00020\bHÆ\u0003J\t\u0010:\u001a\u00020\bHÆ\u0003J\t\u0010;\u001a\u00020\bHÆ\u0003J\t\u0010<\u001a\u00020\bHÆ\u0003J\t\u0010=\u001a\u00020\bHÆ\u0003J\t\u0010>\u001a\u00020\u000eHÆ\u0003J\u008d\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\bHÆ\u0001J\t\u0010@\u001a\u00020\bHÖ\u0001J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010DHÖ\u0003J\b\u0010E\u001a\u00020\u0004H\u0016J\b\u0010F\u001a\u00020\u0004H\u0016J\t\u0010G\u001a\u00020\bHÖ\u0001J\u000e\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u0004J\b\u0010K\u001a\u00020\u0004H\u0016J\u0019\u0010L\u001a\u00020I2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\bHÖ\u0001R\u001a\u0010\u000f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001a\u0010\u0011\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u001a\u0010\u0010\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0015\"\u0004\b'\u0010\u0017R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R\u001a\u0010\f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0015\"\u0004\b-\u0010\u0017R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006P"}, d2 = {"Lcom/heytap/databaseengine/model/sunshine/SunshineStat;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "ssoid", "", "dataClient", "clientModel", "date", "", "totalDuration", "targetDuration", "vitaminD", "vitaminDIngestion", "vitaminDIngestionTime", "", "avgVD", "goalComplete", "favoriteTime", "sunshineType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIJIIII)V", "getAvgVD", "()I", "setAvgVD", "(I)V", "getClientModel", "()Ljava/lang/String;", "setClientModel", "(Ljava/lang/String;)V", "getDataClient", "setDataClient", "getDate", "setDate", "getFavoriteTime", "setFavoriteTime", "getGoalComplete", "setGoalComplete", "getSunshineType", "setSunshineType", "getTargetDuration", "setTargetDuration", "getTotalDuration", "setTotalDuration", "getVitaminD", "setVitaminD", "getVitaminDIngestion", "setVitaminDIngestion", "getVitaminDIngestionTime", "()J", "setVitaminDIngestionTime", "(J)V", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "getDeviceUniqueId", "getSsoid", "hashCode", "setSsoid", "", "mSsoid", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SunshineStat extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SunshineStat> CREATOR = new a();
    private int avgVD;

    @Nullable
    private String clientModel;

    @NotNull
    private String dataClient;
    private int date;
    private int favoriteTime;
    private int goalComplete;

    @NotNull
    private String ssoid;

    /* JADX INFO: renamed from: sunshineType, reason: from kotlin metadata and from toString */
    private int sunlightType;
    private int targetDuration;
    private int totalDuration;
    private int vitaminD;
    private int vitaminDIngestion;
    private long vitaminDIngestionTime;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SunshineStat> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SunshineStat createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SunshineStat(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SunshineStat[] newArray(int i) {
            return new SunshineStat[i];
        }
    }

    public SunshineStat() {
        this(null, null, null, 0, 0, 0, 0, 0, 0L, 0, 0, 0, 0, 8191, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getSsoid() {
        return this.ssoid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getAvgVD() {
        return this.avgVD;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getGoalComplete() {
        return this.goalComplete;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getFavoriteTime() {
        return this.favoriteTime;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getSunlightType() {
        return this.sunlightType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDataClient() {
        return this.dataClient;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getClientModel() {
        return this.clientModel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTotalDuration() {
        return this.totalDuration;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTargetDuration() {
        return this.targetDuration;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getVitaminD() {
        return this.vitaminD;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getVitaminDIngestion() {
        return this.vitaminDIngestion;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getVitaminDIngestionTime() {
        return this.vitaminDIngestionTime;
    }

    @NotNull
    public final SunshineStat copy(@NotNull String ssoid, @NotNull String dataClient, @Nullable String clientModel, int date, int totalDuration, int targetDuration, int vitaminD, int vitaminDIngestion, long vitaminDIngestionTime, int avgVD, int goalComplete, int favoriteTime, int sunshineType) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        return new SunshineStat(ssoid, dataClient, clientModel, date, totalDuration, targetDuration, vitaminD, vitaminDIngestion, vitaminDIngestionTime, avgVD, goalComplete, favoriteTime, sunshineType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SunshineStat)) {
            return false;
        }
        SunshineStat sunshineStat = (SunshineStat) other;
        return Intrinsics.areEqual(this.ssoid, sunshineStat.ssoid) && Intrinsics.areEqual(this.dataClient, sunshineStat.dataClient) && Intrinsics.areEqual(this.clientModel, sunshineStat.clientModel) && this.date == sunshineStat.date && this.totalDuration == sunshineStat.totalDuration && this.targetDuration == sunshineStat.targetDuration && this.vitaminD == sunshineStat.vitaminD && this.vitaminDIngestion == sunshineStat.vitaminDIngestion && this.vitaminDIngestionTime == sunshineStat.vitaminDIngestionTime && this.avgVD == sunshineStat.avgVD && this.goalComplete == sunshineStat.goalComplete && this.favoriteTime == sunshineStat.favoriteTime && this.sunlightType == sunshineStat.sunlightType;
    }

    public final int getAvgVD() {
        return this.avgVD;
    }

    @Nullable
    public final String getClientModel() {
        return this.clientModel;
    }

    @NotNull
    public final String getDataClient() {
        return this.dataClient;
    }

    public final int getDate() {
        return this.date;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getDeviceUniqueId() {
        return this.dataClient;
    }

    public final int getFavoriteTime() {
        return this.favoriteTime;
    }

    public final int getGoalComplete() {
        return this.goalComplete;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public final int getSunshineType() {
        return this.sunlightType;
    }

    public final int getTargetDuration() {
        return this.targetDuration;
    }

    public final int getTotalDuration() {
        return this.totalDuration;
    }

    public final int getVitaminD() {
        return this.vitaminD;
    }

    public final int getVitaminDIngestion() {
        return this.vitaminDIngestion;
    }

    public final long getVitaminDIngestionTime() {
        return this.vitaminDIngestionTime;
    }

    public int hashCode() {
        int iHashCode = ((this.ssoid.hashCode() * 31) + this.dataClient.hashCode()) * 31;
        String str = this.clientModel;
        return ((((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.date)) * 31) + Integer.hashCode(this.totalDuration)) * 31) + Integer.hashCode(this.targetDuration)) * 31) + Integer.hashCode(this.vitaminD)) * 31) + Integer.hashCode(this.vitaminDIngestion)) * 31) + Long.hashCode(this.vitaminDIngestionTime)) * 31) + Integer.hashCode(this.avgVD)) * 31) + Integer.hashCode(this.goalComplete)) * 31) + Integer.hashCode(this.favoriteTime)) * 31) + Integer.hashCode(this.sunlightType);
    }

    public final void setAvgVD(int i) {
        this.avgVD = i;
    }

    public final void setClientModel(@Nullable String str) {
        this.clientModel = str;
    }

    public final void setDataClient(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataClient = str;
    }

    public final void setDate(int i) {
        this.date = i;
    }

    public final void setFavoriteTime(int i) {
        this.favoriteTime = i;
    }

    public final void setGoalComplete(int i) {
        this.goalComplete = i;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setSunshineType(int i) {
        this.sunlightType = i;
    }

    public final void setTargetDuration(int i) {
        this.targetDuration = i;
    }

    public final void setTotalDuration(int i) {
        this.totalDuration = i;
    }

    public final void setVitaminD(int i) {
        this.vitaminD = i;
    }

    public final void setVitaminDIngestion(int i) {
        this.vitaminDIngestion = i;
    }

    public final void setVitaminDIngestionTime(long j2) {
        this.vitaminDIngestionTime = j2;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "SunshineStat(avgVD=" + this.avgVD + ", ssoid='" + this.ssoid + "', dataClient='" + this.dataClient + "', clientModel=" + this.clientModel + ", date=" + this.date + ", totalDuration=" + this.totalDuration + ", targetDuration=" + this.targetDuration + ", vitaminD=" + this.vitaminD + ", vitaminDIngestion=" + this.vitaminDIngestion + ", vitaminDIngestionTime=" + this.vitaminDIngestionTime + ", goalComplete=" + this.goalComplete + ", favoriteTime=" + this.favoriteTime + ", sunlightType=" + this.sunlightType + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.dataClient);
        parcel.writeString(this.clientModel);
        parcel.writeInt(this.date);
        parcel.writeInt(this.totalDuration);
        parcel.writeInt(this.targetDuration);
        parcel.writeInt(this.vitaminD);
        parcel.writeInt(this.vitaminDIngestion);
        parcel.writeLong(this.vitaminDIngestionTime);
        parcel.writeInt(this.avgVD);
        parcel.writeInt(this.goalComplete);
        parcel.writeInt(this.favoriteTime);
        parcel.writeInt(this.sunlightType);
    }

    public /* synthetic */ SunshineStat(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, long j2, int i6, int i7, int i8, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) == 0 ? str2 : "", (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? 0 : i, (i10 & 16) != 0 ? 0 : i2, (i10 & 32) != 0 ? 20 : i3, (i10 & 64) != 0 ? 0 : i4, (i10 & 128) != 0 ? 0 : i5, (i10 & 256) != 0 ? 0L : j2, (i10 & 512) != 0 ? 0 : i6, (i10 & 1024) != 0 ? 0 : i7, (i10 & 2048) != 0 ? 0 : i8, (i10 & 4096) == 0 ? i9 : 0);
    }

    public SunshineStat(@NotNull String ssoid, @NotNull String dataClient, @Nullable String str, int i, int i2, int i3, int i4, int i5, long j2, int i6, int i7, int i8, int i9) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.ssoid = ssoid;
        this.dataClient = dataClient;
        this.clientModel = str;
        this.date = i;
        this.totalDuration = i2;
        this.targetDuration = i3;
        this.vitaminD = i4;
        this.vitaminDIngestion = i5;
        this.vitaminDIngestionTime = j2;
        this.avgVD = i6;
        this.goalComplete = i7;
        this.favoriteTime = i8;
        this.sunlightType = i9;
    }
}
