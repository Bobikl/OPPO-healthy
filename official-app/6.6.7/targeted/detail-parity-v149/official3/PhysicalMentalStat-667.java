package com.heytap.databaseengine.model.physicalMental;

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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\bG\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B÷\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0006¢\u0006\u0002\u0010\u001eJ\t\u0010S\u001a\u00020\u0006HÖ\u0001J\b\u0010T\u001a\u00020\u0004H\u0016J\b\u0010U\u001a\u00020\u0004H\u0016J\u000e\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u0004J\b\u0010Y\u001a\u00020\u0004H\u0016J\u0019\u0010Z\u001a\u00020W2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u001c\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u001a\u0010\u0017\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\u001a\u0010\f\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R\u001a\u0010\u0016\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"R\u001a\u0010\u0015\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010 \"\u0004\b,\u0010\"R\u001a\u0010\u0013\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\"R\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010 \"\u0004\b0\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u0010\u0007\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00102\"\u0004\b6\u00104R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010 \"\u0004\b8\u0010\"R\u001a\u0010\u001b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010 \"\u0004\b:\u0010\"R\u001a\u0010\u001a\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010 \"\u0004\b<\u0010\"R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010 \"\u0004\b>\u0010\"R\u001a\u0010\u0019\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010 \"\u0004\b@\u0010\"R\u001a\u0010\u0010\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010 \"\u0004\bB\u0010\"R\u001a\u0010\u0011\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001a\u0010\n\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010 \"\u0004\bH\u0010\"R\u001a\u0010\u0018\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010 \"\u0004\bJ\u0010\"R\u001a\u0010\r\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010 \"\u0004\bL\u0010\"R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010D\"\u0004\bN\u0010FR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010 \"\u0004\bP\u0010\"R\u001a\u0010\u0012\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010 \"\u0004\bR\u0010\"¨\u0006^"}, d2 = {"Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalStat;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "ssoid", "", "date", "", "dataClient", "clientModel", "avgHrv", "minHrv", "maxHrv", "avgStress", "minStress", "minStressTimestamp", "", "maxStress", "maxStressTimestamp", "stressState", "baseLineLow", "baseLineMiddle", "baseLineHigh", "baseHrv", "avgSleepHrv", "minSleepHrv", "maxSleepHrv", "hrvReasonableRangeLow", "hrvReasonableRangeHigh", "avgRestingHeartRate", "stressReminder", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIIIIJIJIIIIIIIIIIII)V", "getAvgHrv", "()I", "setAvgHrv", "(I)V", "getAvgRestingHeartRate", "setAvgRestingHeartRate", "getAvgSleepHrv", "setAvgSleepHrv", "getAvgStress", "setAvgStress", "getBaseHrv", "setBaseHrv", "getBaseLineHigh", "setBaseLineHigh", "getBaseLineLow", "setBaseLineLow", "getBaseLineMiddle", "setBaseLineMiddle", "getClientModel", "()Ljava/lang/String;", "setClientModel", "(Ljava/lang/String;)V", "getDataClient", "setDataClient", "getDate", "setDate", "getHrvReasonableRangeHigh", "setHrvReasonableRangeHigh", "getHrvReasonableRangeLow", "setHrvReasonableRangeLow", "getMaxHrv", "setMaxHrv", "getMaxSleepHrv", "setMaxSleepHrv", "getMaxStress", "setMaxStress", "getMaxStressTimestamp", "()J", "setMaxStressTimestamp", "(J)V", "getMinHrv", "setMinHrv", "getMinSleepHrv", "setMinSleepHrv", "getMinStress", "setMinStress", "getMinStressTimestamp", "setMinStressTimestamp", "getStressReminder", "setStressReminder", "getStressState", "setStressState", "describeContents", "getDeviceUniqueId", "getSsoid", "setSsoid", "", "mSsoid", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PhysicalMentalStat extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PhysicalMentalStat> CREATOR = new a();
    private int avgHrv;
    private int avgRestingHeartRate;
    private int avgSleepHrv;
    private int avgStress;
    private int baseHrv;
    private int baseLineHigh;
    private int baseLineLow;
    private int baseLineMiddle;

    @Nullable
    private String clientModel;

    @NotNull
    private String dataClient;
    private int date;
    private int hrvReasonableRangeHigh;
    private int hrvReasonableRangeLow;
    private int maxHrv;
    private int maxSleepHrv;
    private int maxStress;
    private long maxStressTimestamp;
    private int minHrv;
    private int minSleepHrv;
    private int minStress;
    private long minStressTimestamp;

    @NotNull
    private String ssoid;
    private int stressReminder;
    private int stressState;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhysicalMentalStat> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PhysicalMentalStat createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PhysicalMentalStat(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PhysicalMentalStat[] newArray(int i) {
            return new PhysicalMentalStat[i];
        }
    }

    public PhysicalMentalStat() {
        this(null, 0, null, null, 0, 0, 0, 0, 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16777215, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getAvgHrv() {
        return this.avgHrv;
    }

    public final int getAvgRestingHeartRate() {
        return this.avgRestingHeartRate;
    }

    public final int getAvgSleepHrv() {
        return this.avgSleepHrv;
    }

    public final int getAvgStress() {
        return this.avgStress;
    }

    public final int getBaseHrv() {
        return this.baseHrv;
    }

    public final int getBaseLineHigh() {
        return this.baseLineHigh;
    }

    public final int getBaseLineLow() {
        return this.baseLineLow;
    }

    public final int getBaseLineMiddle() {
        return this.baseLineMiddle;
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

    public final int getHrvReasonableRangeHigh() {
        return this.hrvReasonableRangeHigh;
    }

    public final int getHrvReasonableRangeLow() {
        return this.hrvReasonableRangeLow;
    }

    public final int getMaxHrv() {
        return this.maxHrv;
    }

    public final int getMaxSleepHrv() {
        return this.maxSleepHrv;
    }

    public final int getMaxStress() {
        return this.maxStress;
    }

    public final long getMaxStressTimestamp() {
        return this.maxStressTimestamp;
    }

    public final int getMinHrv() {
        return this.minHrv;
    }

    public final int getMinSleepHrv() {
        return this.minSleepHrv;
    }

    public final int getMinStress() {
        return this.minStress;
    }

    public final long getMinStressTimestamp() {
        return this.minStressTimestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public final int getStressReminder() {
        return this.stressReminder;
    }

    public final int getStressState() {
        return this.stressState;
    }

    public final void setAvgHrv(int i) {
        this.avgHrv = i;
    }

    public final void setAvgRestingHeartRate(int i) {
        this.avgRestingHeartRate = i;
    }

    public final void setAvgSleepHrv(int i) {
        this.avgSleepHrv = i;
    }

    public final void setAvgStress(int i) {
        this.avgStress = i;
    }

    public final void setBaseHrv(int i) {
        this.baseHrv = i;
    }

    public final void setBaseLineHigh(int i) {
        this.baseLineHigh = i;
    }

    public final void setBaseLineLow(int i) {
        this.baseLineLow = i;
    }

    public final void setBaseLineMiddle(int i) {
        this.baseLineMiddle = i;
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

    public final void setHrvReasonableRangeHigh(int i) {
        this.hrvReasonableRangeHigh = i;
    }

    public final void setHrvReasonableRangeLow(int i) {
        this.hrvReasonableRangeLow = i;
    }

    public final void setMaxHrv(int i) {
        this.maxHrv = i;
    }

    public final void setMaxSleepHrv(int i) {
        this.maxSleepHrv = i;
    }

    public final void setMaxStress(int i) {
        this.maxStress = i;
    }

    public final void setMaxStressTimestamp(long j2) {
        this.maxStressTimestamp = j2;
    }

    public final void setMinHrv(int i) {
        this.minHrv = i;
    }

    public final void setMinSleepHrv(int i) {
        this.minSleepHrv = i;
    }

    public final void setMinStress(int i) {
        this.minStress = i;
    }

    public final void setMinStressTimestamp(long j2) {
        this.minStressTimestamp = j2;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setStressReminder(int i) {
        this.stressReminder = i;
    }

    public final void setStressState(int i) {
        this.stressState = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "PhysicalMentalStat(ssoid='" + this.ssoid + "', date=" + this.date + ", dataClient='" + this.dataClient + "', clientModel=" + this.clientModel + ", avgHrv=" + this.avgHrv + ", minHrv=" + this.minHrv + ", maxHrv=" + this.maxHrv + ", avgStress=" + this.avgStress + ", minStress=" + this.minStress + ", minStressTimestamp=" + this.minStressTimestamp + ", maxStress=" + this.maxStress + ", maxStressTimestamp=" + this.maxStressTimestamp + ", stressState=" + this.stressState + ", baseLineLow=" + this.baseLineLow + ", baseLineMiddle=" + this.baseLineMiddle + ", baseLineHigh=" + this.baseLineHigh + ", baseHrv=" + this.baseHrv + ", avgSleepHrv=" + this.avgSleepHrv + ", minSleepHrv=" + this.minSleepHrv + ", maxSleepHrv=" + this.maxSleepHrv + ", hrvReasonableRangeLow=" + this.hrvReasonableRangeLow + ", hrvReasonableRangeHigh=" + this.hrvReasonableRangeHigh + ", avgRestingHeartRate=" + this.avgRestingHeartRate + ", stressReminder=" + this.stressReminder + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeInt(this.date);
        parcel.writeString(this.dataClient);
        parcel.writeString(this.clientModel);
        parcel.writeInt(this.avgHrv);
        parcel.writeInt(this.minHrv);
        parcel.writeInt(this.maxHrv);
        parcel.writeInt(this.avgStress);
        parcel.writeInt(this.minStress);
        parcel.writeLong(this.minStressTimestamp);
        parcel.writeInt(this.maxStress);
        parcel.writeLong(this.maxStressTimestamp);
        parcel.writeInt(this.stressState);
        parcel.writeInt(this.baseLineLow);
        parcel.writeInt(this.baseLineMiddle);
        parcel.writeInt(this.baseLineHigh);
        parcel.writeInt(this.baseHrv);
        parcel.writeInt(this.avgSleepHrv);
        parcel.writeInt(this.minSleepHrv);
        parcel.writeInt(this.maxSleepHrv);
        parcel.writeInt(this.hrvReasonableRangeLow);
        parcel.writeInt(this.hrvReasonableRangeHigh);
        parcel.writeInt(this.avgRestingHeartRate);
        parcel.writeInt(this.stressReminder);
    }

    public /* synthetic */ PhysicalMentalStat(String str, int i, String str2, String str3, int i2, int i3, int i4, int i5, int i6, long j2, int i7, long j3, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, DefaultConstructorMarker defaultConstructorMarker) {
        this((i20 & 1) != 0 ? "" : str, (i20 & 2) != 0 ? 0 : i, (i20 & 4) == 0 ? str2 : "", (i20 & 8) != 0 ? null : str3, (i20 & 16) != 0 ? 0 : i2, (i20 & 32) != 0 ? 0 : i3, (i20 & 64) != 0 ? 0 : i4, (i20 & 128) != 0 ? 0 : i5, (i20 & 256) != 0 ? 0 : i6, (i20 & 512) != 0 ? 0L : j2, (i20 & 1024) != 0 ? 0 : i7, (i20 & 2048) == 0 ? j3 : 0L, (i20 & 4096) != 0 ? 0 : i8, (i20 & 8192) != 0 ? 0 : i9, (i20 & 16384) != 0 ? 0 : i10, (i20 & 32768) != 0 ? 0 : i11, (i20 & 65536) != 0 ? 0 : i12, (i20 & 131072) != 0 ? 0 : i13, (i20 & 262144) != 0 ? 0 : i14, (i20 & 524288) != 0 ? 0 : i15, (i20 & 1048576) != 0 ? 0 : i16, (i20 & 2097152) != 0 ? 0 : i17, (i20 & 4194304) != 0 ? 0 : i18, (i20 & 8388608) != 0 ? 0 : i19);
    }

    public PhysicalMentalStat(@NotNull String ssoid, int i, @NotNull String dataClient, @Nullable String str, int i2, int i3, int i4, int i5, int i6, long j2, int i7, long j3, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.ssoid = ssoid;
        this.date = i;
        this.dataClient = dataClient;
        this.clientModel = str;
        this.avgHrv = i2;
        this.minHrv = i3;
        this.maxHrv = i4;
        this.avgStress = i5;
        this.minStress = i6;
        this.minStressTimestamp = j2;
        this.maxStress = i7;
        this.maxStressTimestamp = j3;
        this.stressState = i8;
        this.baseLineLow = i9;
        this.baseLineMiddle = i10;
        this.baseLineHigh = i11;
        this.baseHrv = i12;
        this.avgSleepHrv = i13;
        this.minSleepHrv = i14;
        this.maxSleepHrv = i15;
        this.hrvReasonableRangeLow = i16;
        this.hrvReasonableRangeHigh = i17;
        this.avgRestingHeartRate = i18;
        this.stressReminder = i19;
    }
}