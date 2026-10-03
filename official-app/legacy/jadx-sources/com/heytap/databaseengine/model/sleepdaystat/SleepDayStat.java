package com.heytap.databaseengine.model.sleepdaystat;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;
import com.oplus.aiunit.vision.t04;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B¹\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010\u001c\u001a\u00020\t\u0012\u0006\u0010\u001d\u001a\u00020\t¢\u0006\u0002\u0010\u001eJ\t\u0010M\u001a\u00020\u0007HÖ\u0001J\n\u0010N\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010O\u001a\u0004\u0018\u00010\u0004H\u0016J\u000e\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020\u0004J\u000e\u0010S\u001a\u00020Q2\u0006\u0010T\u001a\u00020\u0004J\b\u0010U\u001a\u00020\u0004H\u0016J\u0019\u0010V\u001a\u00020Q2\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0019\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\u001d\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010*\"\u0004\b.\u0010,R\u001a\u0010\u0013\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010$\"\u0004\b0\u0010&R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010*\"\u0004\b6\u0010,R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010*\"\u0004\b<\u0010,R\u001a\u0010\u001a\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010$\"\u0004\b>\u0010&R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010$\"\u0004\b@\u0010&R\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010$\"\u0004\bB\u0010&R\u001a\u0010\r\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010$\"\u0004\bD\u0010&R\u001a\u0010\u000e\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010$\"\u0004\bF\u0010&R\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010$\"\u0004\bH\u0010&R\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010$\"\u0004\bJ\u0010&R\u001a\u0010\u0010\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010$\"\u0004\bL\u0010&¨\u0006Z"}, d2 = {"Lcom/heytap/databaseengine/model/sleepdaystat/SleepDayStat;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "ssoid", "", t04.DEVICE_UNIQUE_ID, "date", "", "sleepInTime", "", "sleepOutTime", "totalSleepTime", "totalDeepSleepTime", "totalLightlySleepTime", "totalREMSleepTime", "totalWakeTime", "wakeCount", "calibrated", "", "score", "sleepMainData", "Lcom/heytap/databaseengine/model/sleepdaystat/SleepMainData;", "sleepDayFrgDataList", "", "Lcom/heytap/databaseengine/model/sleepdaystat/SleepDayFrgData;", "dataVersion", "source", "standardTime", "restInTime", "restOutTime", "(Ljava/lang/String;Ljava/lang/String;IJJIIIIIIZILcom/heytap/databaseengine/model/sleepdaystat/SleepMainData;Ljava/util/List;IIIJJ)V", "getCalibrated", "()Z", "setCalibrated", "(Z)V", "getDataVersion", "()I", "setDataVersion", "(I)V", "getDate", "setDate", "getRestInTime", "()J", "setRestInTime", "(J)V", "getRestOutTime", "setRestOutTime", "getScore", "setScore", "getSleepDayFrgDataList", "()Ljava/util/List;", "setSleepDayFrgDataList", "(Ljava/util/List;)V", "getSleepInTime", "setSleepInTime", "getSleepMainData", "()Lcom/heytap/databaseengine/model/sleepdaystat/SleepMainData;", "setSleepMainData", "(Lcom/heytap/databaseengine/model/sleepdaystat/SleepMainData;)V", "getSleepOutTime", "setSleepOutTime", "getSource", "setSource", "getStandardTime", "setStandardTime", "getTotalDeepSleepTime", "setTotalDeepSleepTime", "getTotalLightlySleepTime", "setTotalLightlySleepTime", "getTotalREMSleepTime", "setTotalREMSleepTime", "getTotalSleepTime", "setTotalSleepTime", "getTotalWakeTime", "setTotalWakeTime", "getWakeCount", "setWakeCount", "describeContents", "getDeviceUniqueId", "getSsoid", "setDeviceUniqueId", "", "mDeviceUniqueId", "setSsoid", "mSsoid", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SleepDayStat extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SleepDayStat> CREATOR = new a();

    /* JADX INFO: renamed from: calibrated, reason: from kotlin metadata and from toString */
    private boolean calibration;
    private int dataVersion;
    private int date;

    @Nullable
    private String deviceUniqueId;
    private long restInTime;
    private long restOutTime;
    private int score;

    @NotNull
    private List<SleepDayFrgData> sleepDayFrgDataList;
    private long sleepInTime;

    @Nullable
    private SleepMainData sleepMainData;
    private long sleepOutTime;
    private int source;

    @Nullable
    private String ssoid;
    private int standardTime;
    private int totalDeepSleepTime;
    private int totalLightlySleepTime;
    private int totalREMSleepTime;
    private int totalSleepTime;
    private int totalWakeTime;
    private int wakeCount;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SleepDayStat> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SleepDayStat createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            int i7 = parcel.readInt();
            int i8 = 0;
            boolean z = parcel.readInt() != 0;
            int i9 = parcel.readInt();
            SleepMainData sleepMainDataCreateFromParcel = parcel.readInt() == 0 ? null : SleepMainData.CREATOR.createFromParcel(parcel);
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            while (i8 != i10) {
                arrayList.add(SleepDayFrgData.CREATOR.createFromParcel(parcel));
                i8++;
                i10 = i10;
            }
            return new SleepDayStat(string, string2, i, j2, j3, i2, i3, i4, i5, i6, i7, z, i9, sleepMainDataCreateFromParcel, arrayList, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SleepDayStat[] newArray(int i) {
            return new SleepDayStat[i];
        }
    }

    public /* synthetic */ SleepDayStat(String str, String str2, int i, long j2, long j3, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8, SleepMainData sleepMainData, List list, int i9, int i10, int i11, long j4, long j5, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, i, j2, j3, i2, i3, i4, i5, i6, i7, z, i8, (i12 & 8192) != 0 ? null : sleepMainData, (i12 & 16384) != 0 ? new ArrayList() : list, i9, i10, i11, j4, j5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: getCalibrated, reason: from getter */
    public final boolean getCalibration() {
        return this.calibration;
    }

    public final int getDataVersion() {
        return this.dataVersion;
    }

    public final int getDate() {
        return this.date;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @Nullable
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public final long getRestInTime() {
        return this.restInTime;
    }

    public final long getRestOutTime() {
        return this.restOutTime;
    }

    public final int getScore() {
        return this.score;
    }

    @NotNull
    public final List<SleepDayFrgData> getSleepDayFrgDataList() {
        return this.sleepDayFrgDataList;
    }

    public final long getSleepInTime() {
        return this.sleepInTime;
    }

    @Nullable
    public final SleepMainData getSleepMainData() {
        return this.sleepMainData;
    }

    public final long getSleepOutTime() {
        return this.sleepOutTime;
    }

    public final int getSource() {
        return this.source;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @Nullable
    public String getSsoid() {
        return this.ssoid;
    }

    public final int getStandardTime() {
        return this.standardTime;
    }

    public final int getTotalDeepSleepTime() {
        return this.totalDeepSleepTime;
    }

    public final int getTotalLightlySleepTime() {
        return this.totalLightlySleepTime;
    }

    public final int getTotalREMSleepTime() {
        return this.totalREMSleepTime;
    }

    public final int getTotalSleepTime() {
        return this.totalSleepTime;
    }

    public final int getTotalWakeTime() {
        return this.totalWakeTime;
    }

    public final int getWakeCount() {
        return this.wakeCount;
    }

    public final void setCalibrated(boolean z) {
        this.calibration = z;
    }

    public final void setDataVersion(int i) {
        this.dataVersion = i;
    }

    public final void setDate(int i) {
        this.date = i;
    }

    public final void setDeviceUniqueId(@NotNull String mDeviceUniqueId) {
        Intrinsics.checkNotNullParameter(mDeviceUniqueId, "mDeviceUniqueId");
        this.deviceUniqueId = mDeviceUniqueId;
    }

    public final void setRestInTime(long j2) {
        this.restInTime = j2;
    }

    public final void setRestOutTime(long j2) {
        this.restOutTime = j2;
    }

    public final void setScore(int i) {
        this.score = i;
    }

    public final void setSleepDayFrgDataList(@NotNull List<SleepDayFrgData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.sleepDayFrgDataList = list;
    }

    public final void setSleepInTime(long j2) {
        this.sleepInTime = j2;
    }

    public final void setSleepMainData(@Nullable SleepMainData sleepMainData) {
        this.sleepMainData = sleepMainData;
    }

    public final void setSleepOutTime(long j2) {
        this.sleepOutTime = j2;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setStandardTime(int i) {
        this.standardTime = i;
    }

    public final void setTotalDeepSleepTime(int i) {
        this.totalDeepSleepTime = i;
    }

    public final void setTotalLightlySleepTime(int i) {
        this.totalLightlySleepTime = i;
    }

    public final void setTotalREMSleepTime(int i) {
        this.totalREMSleepTime = i;
    }

    public final void setTotalSleepTime(int i) {
        this.totalSleepTime = i;
    }

    public final void setTotalWakeTime(int i) {
        this.totalWakeTime = i;
    }

    public final void setWakeCount(int i) {
        this.wakeCount = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "SleepDayStat(ssoid=" + this.ssoid + ", deviceUniqueId=" + this.deviceUniqueId + ", date=" + this.date + ", sleepInTime=" + this.sleepInTime + ", sleepOutTime=" + this.sleepOutTime + ", totalSleepTime=" + this.totalSleepTime + ", totalDeepSleepTime=" + this.totalDeepSleepTime + ", totalLightlySleepTime=" + this.totalLightlySleepTime + ", totalREMSleepTime=" + this.totalREMSleepTime + ", totalWakeTime=" + this.totalWakeTime + ", wakeCount=" + this.wakeCount + ", calibration=" + this.calibration + ", score=" + this.score + ", sleepMainData=" + this.sleepMainData + ", sleepDayFrgDataList=" + this.sleepDayFrgDataList + ", dataVersion=" + this.dataVersion + ", source=" + this.source + ", standardTime=" + this.standardTime + ", restInTime=" + this.restInTime + ", restOutTime=" + this.restOutTime + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeInt(this.date);
        parcel.writeLong(this.sleepInTime);
        parcel.writeLong(this.sleepOutTime);
        parcel.writeInt(this.totalSleepTime);
        parcel.writeInt(this.totalDeepSleepTime);
        parcel.writeInt(this.totalLightlySleepTime);
        parcel.writeInt(this.totalREMSleepTime);
        parcel.writeInt(this.totalWakeTime);
        parcel.writeInt(this.wakeCount);
        parcel.writeInt(this.calibration ? 1 : 0);
        parcel.writeInt(this.score);
        SleepMainData sleepMainData = this.sleepMainData;
        if (sleepMainData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sleepMainData.writeToParcel(parcel, flags);
        }
        List<SleepDayFrgData> list = this.sleepDayFrgDataList;
        parcel.writeInt(list.size());
        Iterator<SleepDayFrgData> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.dataVersion);
        parcel.writeInt(this.source);
        parcel.writeInt(this.standardTime);
        parcel.writeLong(this.restInTime);
        parcel.writeLong(this.restOutTime);
    }

    public SleepDayStat(@Nullable String str, @Nullable String str2, int i, long j2, long j3, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8, @Nullable SleepMainData sleepMainData, @NotNull List<SleepDayFrgData> sleepDayFrgDataList, int i9, int i10, int i11, long j4, long j5) {
        Intrinsics.checkNotNullParameter(sleepDayFrgDataList, "sleepDayFrgDataList");
        this.ssoid = str;
        this.deviceUniqueId = str2;
        this.date = i;
        this.sleepInTime = j2;
        this.sleepOutTime = j3;
        this.totalSleepTime = i2;
        this.totalDeepSleepTime = i3;
        this.totalLightlySleepTime = i4;
        this.totalREMSleepTime = i5;
        this.totalWakeTime = i6;
        this.wakeCount = i7;
        this.calibration = z;
        this.score = i8;
        this.sleepMainData = sleepMainData;
        this.sleepDayFrgDataList = sleepDayFrgDataList;
        this.dataVersion = i9;
        this.source = i10;
        this.standardTime = i11;
        this.restInTime = j4;
        this.restOutTime = j5;
    }
}
