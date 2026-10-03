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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0087\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0002\u0010\u0016J\t\u00108\u001a\u00020\u0007HÖ\u0001J\n\u00109\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010:\u001a\u0004\u0018\u00010\u0004H\u0016J\u000e\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u0004J\u000e\u0010>\u001a\u00020<2\u0006\u0010?\u001a\u00020\u0004J\b\u0010@\u001a\u00020\u0004H\u0016J\u0019\u0010A\u001a\u00020<2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\u0015\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0018\"\u0004\b+\u0010\u001aR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0018\"\u0004\b-\u0010\u001aR\u001a\u0010\r\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0018\"\u0004\b/\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0018\"\u0004\b1\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0018\"\u0004\b3\u0010\u001aR\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0018\"\u0004\b5\u0010\u001aR\u001a\u0010\u0010\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0018\"\u0004\b7\u0010\u001a¨\u0006E"}, d2 = {"Lcom/heytap/databaseengine/model/sleepdaystat/SleepDayFrgData;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "ssoid", "", t04.DEVICE_UNIQUE_ID, "date", "", "sleepInTime", "", "sleepOutTime", "totalSleepTime", "totalDeepSleepTime", "totalLightlySleepTime", "totalREMSleepTime", "totalWakeTime", "wakeCount", "deviceType", "sleepUnitDataList", "", "Lcom/heytap/databaseengine/model/sleepdaystat/SleepPiece;", "source", "(Ljava/lang/String;Ljava/lang/String;IJJIIIIIILjava/lang/Integer;Ljava/util/List;I)V", "getDate", "()I", "setDate", "(I)V", "getDeviceType", "()Ljava/lang/Integer;", "setDeviceType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSleepInTime", "()J", "setSleepInTime", "(J)V", "getSleepOutTime", "setSleepOutTime", "getSleepUnitDataList", "()Ljava/util/List;", "setSleepUnitDataList", "(Ljava/util/List;)V", "getSource", "setSource", "getTotalDeepSleepTime", "setTotalDeepSleepTime", "getTotalLightlySleepTime", "setTotalLightlySleepTime", "getTotalREMSleepTime", "setTotalREMSleepTime", "getTotalSleepTime", "setTotalSleepTime", "getTotalWakeTime", "setTotalWakeTime", "getWakeCount", "setWakeCount", "describeContents", "getDeviceUniqueId", "getSsoid", "setDeviceUniqueId", "", "mDeviceUniqueId", "setSsoid", "mSsoid", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SleepDayFrgData extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SleepDayFrgData> CREATOR = new a();
    private int date;

    @Nullable
    private Integer deviceType;

    @Nullable
    private String deviceUniqueId;
    private long sleepInTime;
    private long sleepOutTime;

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
    public static final class a implements Parcelable.Creator<SleepDayFrgData> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SleepDayFrgData createFromParcel(@NotNull Parcel parcel) {
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
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i8 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i8);
            int i9 = 0;
            while (i9 != i8) {
                arrayList.add(SleepPiece.CREATOR.createFromParcel(parcel));
                i9++;
                i8 = i8;
            }
            return new SleepDayFrgData(string, string2, i, j2, j3, i2, i3, i4, i5, i6, i7, numValueOf, arrayList, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SleepDayFrgData[] newArray(int i) {
            return new SleepDayFrgData[i];
        }
    }

    public /* synthetic */ SleepDayFrgData(String str, String str2, int i, long j2, long j3, int i2, int i3, int i4, int i5, int i6, int i7, Integer num, List list, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? null : str, (i9 & 2) != 0 ? null : str2, i, j2, j3, i2, i3, i4, i5, i6, i7, num, (i9 & 4096) != 0 ? new ArrayList() : list, i8);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getDate() {
        return this.date;
    }

    @Nullable
    public final Integer getDeviceType() {
        return this.deviceType;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @Nullable
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public final long getSleepInTime() {
        return this.sleepInTime;
    }

    public final long getSleepOutTime() {
        return this.sleepOutTime;
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

    public final void setDeviceType(@Nullable Integer num) {
        this.deviceType = num;
    }

    public final void setDeviceUniqueId(@NotNull String mDeviceUniqueId) {
        Intrinsics.checkNotNullParameter(mDeviceUniqueId, "mDeviceUniqueId");
        this.deviceUniqueId = mDeviceUniqueId;
    }

    public final void setSleepInTime(long j2) {
        this.sleepInTime = j2;
    }

    public final void setSleepOutTime(long j2) {
        this.sleepOutTime = j2;
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
        return "SleepDayFrgData(ssoid=" + this.ssoid + ", deviceUniqueId=" + this.deviceUniqueId + ", date=" + this.date + ", sleepInTime=" + this.sleepInTime + ", sleepOutTime=" + this.sleepOutTime + ", totalSleepTime=" + this.totalSleepTime + ", totalDeepSleepTime=" + this.totalDeepSleepTime + ", totalLightlySleepTime=" + this.totalLightlySleepTime + ", totalREMSleepTime=" + this.totalREMSleepTime + ", totalWakeTime=" + this.totalWakeTime + ", wakeCount=" + this.wakeCount + ", deviceType=" + this.deviceType + ", sleepUnitDataList=" + this.sleepUnitDataList + ", source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        int iIntValue;
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
        Integer num = this.deviceType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        List<SleepPiece> list = this.sleepUnitDataList;
        parcel.writeInt(list.size());
        Iterator<SleepPiece> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.source);
    }

    public SleepDayFrgData(@Nullable String str, @Nullable String str2, int i, long j2, long j3, int i2, int i3, int i4, int i5, int i6, int i7, @Nullable Integer num, @NotNull List<SleepPiece> sleepUnitDataList, int i8) {
        Intrinsics.checkNotNullParameter(sleepUnitDataList, "sleepUnitDataList");
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
        this.deviceType = num;
        this.sleepUnitDataList = sleepUnitDataList;
        this.source = i8;
    }
}
