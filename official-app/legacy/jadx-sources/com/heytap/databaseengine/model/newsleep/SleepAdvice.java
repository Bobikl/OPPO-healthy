package com.heytap.databaseengine.model.newsleep;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.newsleep.DBSleepAdvice;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003BU\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0002\u0010\u000fJ\t\u0010$\u001a\u00020\nHÖ\u0001J\b\u0010%\u001a\u00020\u0005H\u0016J\b\u0010&\u001a\u00020\bH\u0016J\b\u0010'\u001a\u00020\u0005H\u0016J\b\u0010(\u001a\u00020\bH\u0016J\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0005J\b\u0010,\u001a\u00020\u0005H\u0016J\u0019\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\nHÖ\u0001R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\r\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u0013¨\u00061"}, d2 = {"Lcom/heytap/databaseengine/model/newsleep/SleepAdvice;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "()V", "ssoid", "", "dataClient", "dataTimestamp", "", DBSleepAdvice.BEDTIME, "", "outBedtime", "duration", DBSleepAdvice.BURDEN, "syncStatus", "(Ljava/lang/String;Ljava/lang/String;JIIIII)V", "getBedtime", "()I", "setBedtime", "(I)V", "getBurden", "setBurden", "getDataClient", "()Ljava/lang/String;", "setDataClient", "(Ljava/lang/String;)V", "getDataTimestamp", "()J", "setDataTimestamp", "(J)V", "getDuration", "setDuration", "getOutBedtime", "setOutBedtime", "getSyncStatus", "setSyncStatus", "describeContents", "getDeviceUniqueId", "getEndTimestamp", "getSsoid", "getStartTimestamp", "setSsoid", "", "mSsoid", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SleepAdvice extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SleepAdvice> CREATOR = new a();
    private int bedtime;
    private int burden;

    @NotNull
    private String dataClient;
    private long dataTimestamp;
    private int duration;
    private int outBedtime;

    @NotNull
    private String ssoid;
    private int syncStatus;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SleepAdvice> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SleepAdvice createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SleepAdvice(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SleepAdvice[] newArray(int i) {
            return new SleepAdvice[i];
        }
    }

    public /* synthetic */ SleepAdvice(String str, String str2, long j2, int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? 0L : j2, (i6 & 8) != 0 ? 0 : i, (i6 & 16) != 0 ? 0 : i2, (i6 & 32) != 0 ? 0 : i3, (i6 & 64) != 0 ? 0 : i4, (i6 & 128) != 0 ? 0 : i5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getBedtime() {
        return this.bedtime;
    }

    public final int getBurden() {
        return this.burden;
    }

    @NotNull
    public final String getDataClient() {
        return this.dataClient;
    }

    public final long getDataTimestamp() {
        return this.dataTimestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getDeviceUniqueId() {
        return this.dataClient;
    }

    public final int getDuration() {
        return this.duration;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return this.dataTimestamp;
    }

    public final int getOutBedtime() {
        return this.outBedtime;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return this.dataTimestamp;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    public final void setBedtime(int i) {
        this.bedtime = i;
    }

    public final void setBurden(int i) {
        this.burden = i;
    }

    public final void setDataClient(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataClient = str;
    }

    public final void setDataTimestamp(long j2) {
        this.dataTimestamp = j2;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setOutBedtime(int i) {
        this.outBedtime = i;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "SleepAdvice(ssoid='" + this.ssoid + "', dataClient='" + this.dataClient + "', dataTimestamp=" + this.dataTimestamp + ", bedtime=" + this.bedtime + ", outBedtime=" + this.outBedtime + ", duration=" + this.duration + ", burden=" + this.burden + ", syncStatus=" + this.syncStatus + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.dataClient);
        parcel.writeLong(this.dataTimestamp);
        parcel.writeInt(this.bedtime);
        parcel.writeInt(this.outBedtime);
        parcel.writeInt(this.duration);
        parcel.writeInt(this.burden);
        parcel.writeInt(this.syncStatus);
    }

    public SleepAdvice(@NotNull String ssoid, @NotNull String dataClient, long j2, int i, int i2, int i3, int i4, int i5) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.ssoid = ssoid;
        this.dataClient = dataClient;
        this.dataTimestamp = j2;
        this.bedtime = i;
        this.outBedtime = i2;
        this.duration = i3;
        this.burden = i4;
        this.syncStatus = i5;
    }

    public SleepAdvice() {
        this("", "", 0L, 0, 0, 0, 0, 0);
    }
}
