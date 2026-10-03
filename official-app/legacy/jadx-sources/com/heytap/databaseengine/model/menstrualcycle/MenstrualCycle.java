package com.heytap.databaseengine.model.menstrualcycle;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;
import com.oplus.aiunit.vision.ptb;
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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\b\u0007\u0018\u0000 82\u00020\u00012\u00020\u0002:\u00019Bc\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0011\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010*\u001a\u00020\u0005\u0012\b\b\u0002\u0010/\u001a\u00020\u0011\u0012\b\b\u0002\u00102\u001a\u00020\u0011¢\u0006\u0004\b5\u00106B\t\b\u0016¢\u0006\u0004\b5\u00107J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0005J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0017\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\"\u0010\u001c\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\"\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010'\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\"\u0010*\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001a\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010/\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001d\u001a\u0004\b0\u0010\u001f\"\u0004\b1\u0010!R\"\u00102\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u001d\u001a\u0004\b3\u0010\u001f\"\u0004\b4\u0010!¨\u0006:"}, d2 = {"Lcom/heytap/databaseengine/model/menstrualcycle/MenstrualCycle;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "getSsoid", "", "getStartTimestamp", "getEndTimestamp", "getDeviceUniqueId", "mSsoid", "", "setSsoid", "mStartTimestamp", "setStartTimestamp", "mEndTimestamp", "setEndTimestamp", "toString", "", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "writeToParcel", "ssoid", "Ljava/lang/String;", "startTimestamp", "J", "endTimestamp", "stopType", "I", "getStopType", "()I", "setStopType", "(I)V", "dataClient", "getDataClient", "()Ljava/lang/String;", "setDataClient", "(Ljava/lang/String;)V", "clientModel", "getClientModel", "setClientModel", "updateTimestamp", "getUpdateTimestamp", "()J", "setUpdateTimestamp", "(J)V", "display", "getDisplay", "setDisplay", "syncStatus", "getSyncStatus", "setSyncStatus", "<init>", "(Ljava/lang/String;JJILjava/lang/String;Ljava/lang/String;JII)V", "()V", "Companion", "a", "databaseengine_release"}, k = 1, mv = {1, 8, 0})
public final class MenstrualCycle extends SportHealthData implements Parcelable {
    public static final int STOP_TYPE_NOT_SET = -1;

    @Nullable
    private String clientModel;

    @NotNull
    private String dataClient;
    private int display;
    private long endTimestamp;

    @NotNull
    private String ssoid;
    private long startTimestamp;
    private int stopType;
    private int syncStatus;
    private long updateTimestamp;

    @NotNull
    public static final Parcelable.Creator<MenstrualCycle> CREATOR = new b();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<MenstrualCycle> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MenstrualCycle createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MenstrualCycle(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MenstrualCycle[] newArray(int i) {
            return new MenstrualCycle[i];
        }
    }

    public /* synthetic */ MenstrualCycle(String str, long j2, long j3, int i, String str2, String str3, long j4, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0L : j2, (i4 & 4) != 0 ? 0L : j3, (i4 & 8) != 0 ? 0 : i, (i4 & 16) == 0 ? str2 : "", (i4 & 32) != 0 ? null : str3, (i4 & 64) == 0 ? j4 : 0L, (i4 & 128) != 0 ? 1 : i2, (i4 & 256) == 0 ? i3 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getClientModel() {
        return this.clientModel;
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

    public final int getDisplay() {
        return this.display;
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

    public final int getStopType() {
        return this.stopType;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    public final long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public final void setClientModel(@Nullable String str) {
        this.clientModel = str;
    }

    public final void setDataClient(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataClient = str;
    }

    public final void setDisplay(int i) {
        this.display = i;
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

    public final void setStopType(int i) {
        this.stopType = i;
    }

    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public final void setUpdateTimestamp(long j2) {
        this.updateTimestamp = j2;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "MenstrualCycle(ssoid='" + this.ssoid + "', startTimestamp=" + ptb.a(this.startTimestamp) + ", endTimestamp=" + ptb.a(this.endTimestamp) + ", stopType=" + this.stopType + ", dataClient='" + this.dataClient + "', clientModel=" + this.clientModel + ", updateTimestamp=" + this.updateTimestamp + ", display=" + this.display + ", syncStatus=" + this.syncStatus + ")\n";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeInt(this.stopType);
        parcel.writeString(this.dataClient);
        parcel.writeString(this.clientModel);
        parcel.writeLong(this.updateTimestamp);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
    }

    public MenstrualCycle(@NotNull String ssoid, long j2, long j3, int i, @NotNull String dataClient, @Nullable String str, long j4, int i2, int i3) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.ssoid = ssoid;
        this.startTimestamp = j2;
        this.endTimestamp = j3;
        this.stopType = i;
        this.dataClient = dataClient;
        this.clientModel = str;
        this.updateTimestamp = j4;
        this.display = i2;
        this.syncStatus = i3;
    }

    public MenstrualCycle() {
        this("", 0L, 0L, 0, "", null, 0L, 1, 0);
    }
}
