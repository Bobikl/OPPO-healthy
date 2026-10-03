package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/heytap/databaseengine/model/SleepBedTimeData;", "Landroid/os/Parcelable;", "()V", "type", "", "dataTimestamp", "", "(IJ)V", "getDataTimestamp", "()J", "setDataTimestamp", "(J)V", "getType", "()I", "setType", "(I)V", "describeContents", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SleepBedTimeData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SleepBedTimeData> CREATOR = new a();
    private long dataTimestamp;
    private int type;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SleepBedTimeData> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SleepBedTimeData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SleepBedTimeData(parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SleepBedTimeData[] newArray(int i) {
            return new SleepBedTimeData[i];
        }
    }

    public SleepBedTimeData(int i, long j2) {
        this.type = i;
        this.dataTimestamp = j2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final long getDataTimestamp() {
        return this.dataTimestamp;
    }

    public final int getType() {
        return this.type;
    }

    public final void setDataTimestamp(long j2) {
        this.dataTimestamp = j2;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "SleepBedTimeData(type=" + this.type + ", dataTimestamp=" + this.dataTimestamp + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.type);
        parcel.writeLong(this.dataTimestamp);
    }

    public /* synthetic */ SleepBedTimeData(int i, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? 1546272000000L : j2);
    }

    public SleepBedTimeData() {
        this(0, 0L);
    }
}
