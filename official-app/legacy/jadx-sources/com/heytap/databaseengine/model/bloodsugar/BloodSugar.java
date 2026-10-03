package com.heytap.databaseengine.model.bloodsugar;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.bloodsugar.DBBloodSugar;
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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\"\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003Bc\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0002\u0010\u0011J\t\u0010+\u001a\u00020\tHÖ\u0001J\b\u0010,\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020\u000eH\u0016J\b\u0010.\u001a\u00020\u0005H\u0016J\b\u0010/\u001a\u00020\u000eH\u0016J\u000e\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0005J\b\u00103\u001a\u00020\u0005H\u0016J\u0019\u00104\u001a\u0002012\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\tHÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\u001a\u0010\f\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u00068"}, d2 = {"Lcom/heytap/databaseengine/model/bloodsugar/BloodSugar;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "()V", "ssoid", "", "dataClient", "clientModel", "type", "", "value", "", DBBloodSugar.TREND, "dataCreatedTimestamp", "", "display", "syncStatus", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Double;IJII)V", "getClientModel", "()Ljava/lang/String;", "setClientModel", "(Ljava/lang/String;)V", "getDataClient", "setDataClient", "getDataCreatedTimestamp", "()J", "setDataCreatedTimestamp", "(J)V", "getDisplay", "()I", "setDisplay", "(I)V", "getSyncStatus", "setSyncStatus", "getTrend", "setTrend", "getType", "setType", "getValue", "()Ljava/lang/Double;", "setValue", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "describeContents", "getDeviceUniqueId", "getEndTimestamp", "getSsoid", "getStartTimestamp", "setSsoid", "", "mSsoid", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class BloodSugar extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BloodSugar> CREATOR = new a();

    @Nullable
    private String clientModel;

    @NotNull
    private String dataClient;
    private long dataCreatedTimestamp;
    private int display;

    @NotNull
    private String ssoid;
    private int syncStatus;
    private int trend;
    private int type;

    @Nullable
    private Double value;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BloodSugar> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BloodSugar createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BloodSugar(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BloodSugar[] newArray(int i) {
            return new BloodSugar[i];
        }
    }

    public /* synthetic */ BloodSugar(String str, String str2, String str3, int i, Double d, int i2, long j2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? "" : str2, (i5 & 4) != 0 ? null : str3, (i5 & 8) != 0 ? 0 : i, (i5 & 16) != 0 ? null : d, (i5 & 32) != 0 ? 0 : i2, (i5 & 64) != 0 ? 0L : j2, (i5 & 128) != 0 ? 1 : i3, (i5 & 256) != 0 ? 0 : i4);
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

    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
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
        return this.dataCreatedTimestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return this.dataCreatedTimestamp;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    public final int getTrend() {
        return this.trend;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final Double getValue() {
        return this.value;
    }

    public final void setClientModel(@Nullable String str) {
        this.clientModel = str;
    }

    public final void setDataClient(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataClient = str;
    }

    public final void setDataCreatedTimestamp(long j2) {
        this.dataCreatedTimestamp = j2;
    }

    public final void setDisplay(int i) {
        this.display = i;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public final void setTrend(int i) {
        this.trend = i;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setValue(@Nullable Double d) {
        this.value = d;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "BloodSugar(ssoid='" + this.ssoid + "', dataClient='" + this.dataClient + "', clientModel=" + this.clientModel + ", type=" + this.type + ", value=" + this.value + ", trend=" + this.trend + ", dataCreatedTimestamp=" + this.dataCreatedTimestamp + ", display=" + this.display + ", syncStatus=" + this.syncStatus + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.dataClient);
        parcel.writeString(this.clientModel);
        parcel.writeInt(this.type);
        Double d = this.value;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeInt(this.trend);
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
    }

    public BloodSugar(@NotNull String ssoid, @NotNull String dataClient, @Nullable String str, int i, @Nullable Double d, int i2, long j2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.ssoid = ssoid;
        this.dataClient = dataClient;
        this.clientModel = str;
        this.type = i;
        this.value = d;
        this.trend = i2;
        this.dataCreatedTimestamp = j2;
        this.display = i3;
        this.syncStatus = i4;
    }

    public BloodSugar() {
        this("", "", null, 0, Double.valueOf(0.0d), 0, 0L, 1, 0);
    }
}
