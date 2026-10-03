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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u0095\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\u0018\u001a\u00020\b¢\u0006\u0002\u0010\u0019J\t\u0010<\u001a\u00020\bHÖ\u0001J\n\u0010=\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010>\u001a\u0004\u0018\u00010\u0005H\u0016J\u000e\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u0005J\u000e\u0010B\u001a\u00020@2\u0006\u0010C\u001a\u00020\u0005J\b\u0010D\u001a\u00020\u0005H\u0016J\u0019\u0010E\u001a\u00020@2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\u001a\u0010\r\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\u001a\u0010\f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R\u001a\u0010\u000e\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010!R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010\u0018\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001b\"\u0004\b1\u0010\u001dR\u001a\u0010\u0011\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001b\"\u0004\b3\u0010\u001dR\u001a\u0010\u0012\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001b\"\u0004\b5\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001b\"\u0004\b7\u0010\u001dR\u001a\u0010\u0013\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001b\"\u0004\b9\u0010\u001dR\u001a\u0010\u0014\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001b\"\u0004\b;\u0010\u001d¨\u0006I"}, d2 = {"Lcom/heytap/databaseengine/model/sleepdaystat/SleepMainData;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "()V", "ssoid", "", t04.DEVICE_UNIQUE_ID, "date", "", "sleep3HoursBeforeTime", "", "sleepInTime", "sleepOutTime", "sleepInTimeMinutesOffset", "sleepOutTimeMinutesOffset", "totalSleepTime", "totalDeepSleepTime", "totalLightlySleepTime", "totalREMSleepTime", "totalWakeTime", "wakeCount", "sleepUnitDataList", "", "Lcom/heytap/databaseengine/model/sleepdaystat/SleepPiece;", "source", "(Ljava/lang/String;Ljava/lang/String;IJJJJJIIIIIILjava/util/List;I)V", "getDate", "()I", "setDate", "(I)V", "getSleep3HoursBeforeTime", "()J", "setSleep3HoursBeforeTime", "(J)V", "getSleepInTime", "setSleepInTime", "getSleepInTimeMinutesOffset", "setSleepInTimeMinutesOffset", "getSleepOutTime", "setSleepOutTime", "getSleepOutTimeMinutesOffset", "setSleepOutTimeMinutesOffset", "getSleepUnitDataList", "()Ljava/util/List;", "setSleepUnitDataList", "(Ljava/util/List;)V", "getSource", "setSource", "getTotalDeepSleepTime", "setTotalDeepSleepTime", "getTotalLightlySleepTime", "setTotalLightlySleepTime", "getTotalREMSleepTime", "setTotalREMSleepTime", "getTotalSleepTime", "setTotalSleepTime", "getTotalWakeTime", "setTotalWakeTime", "getWakeCount", "setWakeCount", "describeContents", "getDeviceUniqueId", "getSsoid", "setDeviceUniqueId", "", "mDeviceUniqueId", "setSsoid", "mSsoid", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SleepMainData extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SleepMainData> CREATOR = new a();
    private int date;

    @Nullable
    private String deviceUniqueId;
    private long sleep3HoursBeforeTime;
    private long sleepInTime;
    private long sleepInTimeMinutesOffset;
    private long sleepOutTime;
    private long sleepOutTimeMinutesOffset;

    @NotNull
    private List<SleepPiece> sleepUnitDataList;
    private int source;

    @Nullable
    private String ssoid;
    private int totalDeepSleepTime;
    private int totalLightlySleepTime;
    private int totalREMSleepTime;
    private int totalSleepTime;
    private int totalWakeTime;
    private int wakeCount;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SleepMainData> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SleepMainData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            long j4 = parcel.readLong();
            long j5 = parcel.readLong();
            long j6 = parcel.readLong();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            int i7 = parcel.readInt();
            int i8 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i8);
            for (int i9 = 0; i9 != i8; i9++) {
                arrayList.add(SleepPiece.CREATOR.createFromParcel(parcel));
            }
            return new SleepMainData(string, string2, i, j2, j3, j4, j5, j6, i2, i3, i4, i5, i6, i7, arrayList, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SleepMainData[] newArray(int i) {
            return new SleepMainData[i];
        }
    }

    public /* synthetic */ SleepMainData(String str, String str2, int i, long j2, long j3, long j4, long j5, long j6, int i2, int i3, int i4, int i5, int i6, int i7, List list, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? null : str, (i9 & 2) != 0 ? null : str2, i, j2, j3, j4, j5, j6, i2, i3, i4, i5, i6, i7, (i9 & 16384) != 0 ? new ArrayList() : list, i8);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getDate() {
        return this.date;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @Nullable
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public final long getSleep3HoursBeforeTime() {
        return this.sleep3HoursBeforeTime;
    }

    public final long getSleepInTime() {
        return this.sleepInTime;
    }

    public final long getSleepInTimeMinutesOffset() {
        return this.sleepInTimeMinutesOffset;
    }

    public final long getSleepOutTime() {
        return this.sleepOutTime;
    }

    public final long getSleepOutTimeMinutesOffset() {
        return this.sleepOutTimeMinutesOffset;
    }

    @NotNull
    public final List<SleepPiece> getSleepUnitDataList() {
        return this.sleepUnitDataList;
    }

    public final int getSource() {
        return this.source;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @Nullable
    public String getSsoid() {
        return this.ssoid;
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

    public final void setDate(int i) {
        this.date = i;
    }

    public final void setDeviceUniqueId(@NotNull String mDeviceUniqueId) {
        Intrinsics.checkNotNullParameter(mDeviceUniqueId, "mDeviceUniqueId");
        this.deviceUniqueId = mDeviceUniqueId;
    }

    public final void setSleep3HoursBeforeTime(long j2) {
        this.sleep3HoursBeforeTime = j2;
    }

    public final void setSleepInTime(long j2) {
        this.sleepInTime = j2;
    }

    public final void setSleepInTimeMinutesOffset(long j2) {
        this.sleepInTimeMinutesOffset = j2;
    }

    public final void setSleepOutTime(long j2) {
        this.sleepOutTime = j2;
    }

    public final void setSleepOutTimeMinutesOffset(long j2) {
        this.sleepOutTimeMinutesOffset = j2;
    }

    public final void setSleepUnitDataList(@NotNull List<SleepPiece> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.sleepUnitDataList = list;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
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
        return "SleepMainData(ssoid=" + this.ssoid + ", deviceUniqueId=" + this.deviceUniqueId + ", date=" + this.date + ", sleep3HoursBeforeTime=" + this.sleep3HoursBeforeTime + ", sleepInTime=" + this.sleepInTime + ", sleepOutTime=" + this.sleepOutTime + ", sleepInTimeMinutesOffset=" + this.sleepInTimeMinutesOffset + ", sleepOutTimeMinutesOffset=" + this.sleepOutTimeMinutesOffset + ", totalSleepTime=" + this.totalSleepTime + ", totalDeepSleepTime=" + this.totalDeepSleepTime + ", totalLightlySleepTime=" + this.totalLightlySleepTime + ", totalREMSleepTime=" + this.totalREMSleepTime + ", totalWakeTime=" + this.totalWakeTime + ", wakeCount=" + this.wakeCount + ", sleepUnitDataList=" + this.sleepUnitDataList + ", source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeInt(this.date);
        parcel.writeLong(this.sleep3HoursBeforeTime);
        parcel.writeLong(this.sleepInTime);
        parcel.writeLong(this.sleepOutTime);
        parcel.writeLong(this.sleepInTimeMinutesOffset);
        parcel.writeLong(this.sleepOutTimeMinutesOffset);
        parcel.writeInt(this.totalSleepTime);
        parcel.writeInt(this.totalDeepSleepTime);
        parcel.writeInt(this.totalLightlySleepTime);
        parcel.writeInt(this.totalREMSleepTime);
        parcel.writeInt(this.totalWakeTime);
        parcel.writeInt(this.wakeCount);
        List<SleepPiece> list = this.sleepUnitDataList;
        parcel.writeInt(list.size());
        Iterator<SleepPiece> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.source);
    }

    public SleepMainData(@Nullable String str, @Nullable String str2, int i, long j2, long j3, long j4, long j5, long j6, int i2, int i3, int i4, int i5, int i6, int i7, @NotNull List<SleepPiece> sleepUnitDataList, int i8) {
        Intrinsics.checkNotNullParameter(sleepUnitDataList, "sleepUnitDataList");
        this.ssoid = str;
        this.deviceUniqueId = str2;
        this.date = i;
        this.sleep3HoursBeforeTime = j2;
        this.sleepInTime = j3;
        this.sleepOutTime = j4;
        this.sleepInTimeMinutesOffset = j5;
        this.sleepOutTimeMinutesOffset = j6;
        this.totalSleepTime = i2;
        this.totalDeepSleepTime = i3;
        this.totalLightlySleepTime = i4;
        this.totalREMSleepTime = i5;
        this.totalWakeTime = i6;
        this.wakeCount = i7;
        this.sleepUnitDataList = sleepUnitDataList;
        this.source = i8;
    }

    public SleepMainData() {
        this(null, null, 0, 0L, 0L, 0L, 0L, 0L, 0, 0, 0, 0, 0, 0, new ArrayList(), 1);
    }
}
