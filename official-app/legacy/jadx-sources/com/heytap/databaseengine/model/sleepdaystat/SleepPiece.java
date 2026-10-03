package com.heytap.databaseengine.model.sleepdaystat;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;
import com.oplus.aiunit.vision.t04;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0016\u001a\u00020\nHÖ\u0001J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u001a\u001a\u00020\u0007H\u0016J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0004J\u000e\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0004J\b\u0010 \u001a\u00020\u0004H\u0016J\u0019\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\nHÖ\u0001R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/heytap/databaseengine/model/sleepdaystat/SleepPiece;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "ssoid", "", t04.DEVICE_UNIQUE_ID, "startTimestamp", "", "endTimestamp", "sleepType", "", "stageSleepEnd", "", "(Ljava/lang/String;Ljava/lang/String;JJIZ)V", "getSleepType", "()I", "setSleepType", "(I)V", "getStageSleepEnd", "()Z", "setStageSleepEnd", "(Z)V", "describeContents", "getDeviceUniqueId", "getEndTimestamp", "getSsoid", "getStartTimestamp", "setDeviceUniqueId", "", "mDeviceUniqueId", "setSsoid", "mSsoid", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SleepPiece extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SleepPiece> CREATOR = new a();

    @Nullable
    private String deviceUniqueId;
    private long endTimestamp;
    private int sleepType;

    @Nullable
    private String ssoid;
    private boolean stageSleepEnd;
    private long startTimestamp;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SleepPiece> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SleepPiece createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SleepPiece(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SleepPiece[] newArray(int i) {
            return new SleepPiece[i];
        }
    }

    public /* synthetic */ SleepPiece(String str, String str2, long j2, long j3, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, j2, j3, i, (i2 & 32) != 0 ? false : z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @Nullable
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return this.endTimestamp;
    }

    public final int getSleepType() {
        return this.sleepType;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @Nullable
    public String getSsoid() {
        return this.ssoid;
    }

    public final boolean getStageSleepEnd() {
        return this.stageSleepEnd;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    public final void setDeviceUniqueId(@NotNull String mDeviceUniqueId) {
        Intrinsics.checkNotNullParameter(mDeviceUniqueId, "mDeviceUniqueId");
        this.deviceUniqueId = mDeviceUniqueId;
    }

    public final void setSleepType(int i) {
        this.sleepType = i;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setStageSleepEnd(boolean z) {
        this.stageSleepEnd = z;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "SleepPiece(ssoid=" + this.ssoid + ", deviceUniqueId=" + this.deviceUniqueId + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", sleepType=" + this.sleepType + ", stageSleepEnd=" + this.stageSleepEnd + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeInt(this.sleepType);
        parcel.writeInt(this.stageSleepEnd ? 1 : 0);
    }

    public SleepPiece(@Nullable String str, @Nullable String str2, long j2, long j3, int i, boolean z) {
        this.ssoid = str;
        this.deviceUniqueId = str2;
        this.startTimestamp = j2;
        this.endTimestamp = j3;
        this.sleepType = i;
        this.stageSleepEnd = z;
    }
}
