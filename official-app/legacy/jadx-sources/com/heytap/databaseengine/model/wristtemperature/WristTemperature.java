package com.heytap.databaseengine.model.wristtemperature;

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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003Bk\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f¢\u0006\u0002\u0010\u0011J\t\u0010$\u001a\u00020\fHÖ\u0001J\b\u0010%\u001a\u00020\u0005H\u0016J\b\u0010&\u001a\u00020\u0007H\u0016J\b\u0010'\u001a\u00020\u0005H\u0016J\b\u0010(\u001a\u00020\u0007H\u0016J\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0007J\u000e\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020\u0005J\u000e\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u00020\u0007J\b\u00100\u001a\u00020\u0005H\u0016J\u0019\u00101\u001a\u00020*2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\fHÖ\u0001R\u001a\u0010\u000f\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R\u001a\u0010\u0010\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015¨\u00065"}, d2 = {"Lcom/heytap/databaseengine/model/wristtemperature/WristTemperature;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "()V", "ssoid", "", "startTimestamp", "", "endTimestamp", "dataClient", "clientModel", "value", "", "confidence", "status", "baseLine", "syncStatus", "(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;IIIII)V", "getBaseLine", "()I", "setBaseLine", "(I)V", "getClientModel", "()Ljava/lang/String;", "setClientModel", "(Ljava/lang/String;)V", "getConfidence", "setConfidence", "getDataClient", "setDataClient", "getStatus", "setStatus", "getSyncStatus", "setSyncStatus", "getValue", "setValue", "describeContents", "getDeviceUniqueId", "getEndTimestamp", "getSsoid", "getStartTimestamp", "setEndTimestamp", "", "mEndTimestamp", "setSsoid", "mSsoid", "setStartTimestamp", "mStartTimestamp", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WristTemperature extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WristTemperature> CREATOR = new a();
    private int baseLine;

    @Nullable
    private String clientModel;
    private int confidence;

    @NotNull
    private String dataClient;
    private long endTimestamp;

    @NotNull
    private String ssoid;
    private long startTimestamp;
    private int status;
    private int syncStatus;
    private int value;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WristTemperature> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WristTemperature createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WristTemperature(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final WristTemperature[] newArray(int i) {
            return new WristTemperature[i];
        }
    }

    public /* synthetic */ WristTemperature(String str, long j2, long j3, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? 0L : j2, (i6 & 4) == 0 ? j3 : 0L, (i6 & 8) == 0 ? str2 : "", (i6 & 16) != 0 ? null : str3, (i6 & 32) != 0 ? 0 : i, (i6 & 64) != 0 ? 0 : i2, (i6 & 128) != 0 ? 0 : i3, (i6 & 256) != 0 ? 0 : i4, (i6 & 512) == 0 ? i5 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getBaseLine() {
        return this.baseLine;
    }

    @Nullable
    public final String getClientModel() {
        return this.clientModel;
    }

    public final int getConfidence() {
        return this.confidence;
    }

    @NotNull
    public final String getDataClient() {
        return this.dataClient;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getDeviceUniqueId() {
        return this.dataClient;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return this.endTimestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    public final int getValue() {
        return this.value;
    }

    public final void setBaseLine(int i) {
        this.baseLine = i;
    }

    public final void setClientModel(@Nullable String str) {
        this.clientModel = str;
    }

    public final void setConfidence(int i) {
        this.confidence = i;
    }

    public final void setDataClient(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataClient = str;
    }

    public final void setEndTimestamp(long mEndTimestamp) {
        this.endTimestamp = mEndTimestamp;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setStartTimestamp(long mStartTimestamp) {
        this.startTimestamp = mStartTimestamp;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public final void setValue(int i) {
        this.value = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "WristTemperature(ssoid='" + this.ssoid + "', startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", dataClient='" + this.dataClient + "', clientModel=" + this.clientModel + ", value=" + this.value + ", confidence=" + this.confidence + ", status=" + this.status + ", baseLine=" + this.baseLine + ", syncStatus=" + this.syncStatus + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeString(this.dataClient);
        parcel.writeString(this.clientModel);
        parcel.writeInt(this.value);
        parcel.writeInt(this.confidence);
        parcel.writeInt(this.status);
        parcel.writeInt(this.baseLine);
        parcel.writeInt(this.syncStatus);
    }

    public WristTemperature(@NotNull String ssoid, long j2, long j3, @NotNull String dataClient, @Nullable String str, int i, int i2, int i3, int i4, int i5) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.ssoid = ssoid;
        this.startTimestamp = j2;
        this.endTimestamp = j3;
        this.dataClient = dataClient;
        this.clientModel = str;
        this.value = i;
        this.confidence = i2;
        this.status = i3;
        this.baseLine = i4;
        this.syncStatus = i5;
    }

    public WristTemperature() {
        this("", 0L, 0L, "", null, 0, 0, 0, 0, 0);
    }
}
