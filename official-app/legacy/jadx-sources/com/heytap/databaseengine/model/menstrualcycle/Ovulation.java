package com.heytap.databaseengine.model.menstrualcycle;

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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b!\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003Bk\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0002\u0010\u0011J\t\u0010*\u001a\u00020\tHÖ\u0001J\b\u0010+\u001a\u00020\u0005H\u0016J\b\u0010,\u001a\u00020\u0005H\u0016J\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0005J\b\u00100\u001a\u00020\u0005H\u0016J\u0019\u00101\u001a\u00020.2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\tHÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u000f\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\r\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010\u001b¨\u00065"}, d2 = {"Lcom/heytap/databaseengine/model/menstrualcycle/Ovulation;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "()V", "ssoid", "", "dataClient", "clientModel", "ovulaDate", "", "ovulationPreType", "ovulaDateAlgorTime", "", "ovulaBeginDate", "ovulaEndDate", "display", "syncStatus", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJIIII)V", "getClientModel", "()Ljava/lang/String;", "setClientModel", "(Ljava/lang/String;)V", "getDataClient", "setDataClient", "getDisplay", "()I", "setDisplay", "(I)V", "getOvulaBeginDate", "setOvulaBeginDate", "getOvulaDate", "setOvulaDate", "getOvulaDateAlgorTime", "()J", "setOvulaDateAlgorTime", "(J)V", "getOvulaEndDate", "setOvulaEndDate", "getOvulationPreType", "setOvulationPreType", "getSyncStatus", "setSyncStatus", "describeContents", "getDeviceUniqueId", "getSsoid", "setSsoid", "", "mSsoid", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Ovulation extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Ovulation> CREATOR = new a();

    @Nullable
    private String clientModel;

    @NotNull
    private String dataClient;
    private int display;
    private int ovulaBeginDate;
    private int ovulaDate;
    private long ovulaDateAlgorTime;
    private int ovulaEndDate;
    private int ovulationPreType;

    @NotNull
    private String ssoid;
    private int syncStatus;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Ovulation> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Ovulation createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Ovulation(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ovulation[] newArray(int i) {
            return new Ovulation[i];
        }
    }

    public /* synthetic */ Ovulation(String str, String str2, String str3, int i, int i2, long j2, int i3, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? 0 : i, (i7 & 16) != 0 ? 0 : i2, (i7 & 32) != 0 ? 0L : j2, (i7 & 64) != 0 ? 0 : i3, (i7 & 128) != 0 ? 0 : i4, (i7 & 256) != 0 ? 1 : i5, (i7 & 512) != 0 ? 0 : i6);
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

    public final int getOvulaBeginDate() {
        return this.ovulaBeginDate;
    }

    public final int getOvulaDate() {
        return this.ovulaDate;
    }

    public final long getOvulaDateAlgorTime() {
        return this.ovulaDateAlgorTime;
    }

    public final int getOvulaEndDate() {
        return this.ovulaEndDate;
    }

    public final int getOvulationPreType() {
        return this.ovulationPreType;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
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

    public final void setOvulaBeginDate(int i) {
        this.ovulaBeginDate = i;
    }

    public final void setOvulaDate(int i) {
        this.ovulaDate = i;
    }

    public final void setOvulaDateAlgorTime(long j2) {
        this.ovulaDateAlgorTime = j2;
    }

    public final void setOvulaEndDate(int i) {
        this.ovulaEndDate = i;
    }

    public final void setOvulationPreType(int i) {
        this.ovulationPreType = i;
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
        return "Ovulation(ssoid='" + this.ssoid + "', dataClient='" + this.dataClient + "', clientModel=" + this.clientModel + ", ovulaDate=" + this.ovulaDate + ", ovulationPreType=" + this.ovulationPreType + ", ovulaDateAlgorTime=" + this.ovulaDateAlgorTime + ", ovulaBeginDate=" + this.ovulaBeginDate + ", ovulaEndDate=" + this.ovulaEndDate + ", display=" + this.display + ", syncStatus=" + this.syncStatus + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.dataClient);
        parcel.writeString(this.clientModel);
        parcel.writeInt(this.ovulaDate);
        parcel.writeInt(this.ovulationPreType);
        parcel.writeLong(this.ovulaDateAlgorTime);
        parcel.writeInt(this.ovulaBeginDate);
        parcel.writeInt(this.ovulaEndDate);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
    }

    public Ovulation(@NotNull String ssoid, @NotNull String dataClient, @Nullable String str, int i, int i2, long j2, int i3, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.ssoid = ssoid;
        this.dataClient = dataClient;
        this.clientModel = str;
        this.ovulaDate = i;
        this.ovulationPreType = i2;
        this.ovulaDateAlgorTime = j2;
        this.ovulaBeginDate = i3;
        this.ovulaEndDate = i4;
        this.display = i5;
        this.syncStatus = i6;
    }

    public Ovulation() {
        this("", "", null, 0, 0, 0L, 0, 0, 1, 0);
    }
}
