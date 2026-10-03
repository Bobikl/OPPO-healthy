package com.heytap.databaseengine.model.bloodsugar;

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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001d\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003BO\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0002\u0010\u000fJ\t\u0010%\u001a\u00020\tHÖ\u0001J\b\u0010&\u001a\u00020\u0005H\u0016J\b\u0010'\u001a\u00020\u000bH\u0016J\b\u0010(\u001a\u00020\u0005H\u0016J\b\u0010)\u001a\u00020\u000bH\u0016J\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0005J\b\u0010-\u001a\u00020\u0005H\u0016J\u0019\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\tHÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0017\"\u0004\b$\u0010\u0019¨\u00062"}, d2 = {"Lcom/heytap/databaseengine/model/bloodsugar/BloodSugarWarning;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "()V", "ssoid", "", "dataClient", "clientModel", "warningType", "", "timestamp", "", "value", "", "syncStatus", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/Double;I)V", "getClientModel", "()Ljava/lang/String;", "setClientModel", "(Ljava/lang/String;)V", "getDataClient", "setDataClient", "getSyncStatus", "()I", "setSyncStatus", "(I)V", "getTimestamp", "()J", "setTimestamp", "(J)V", "getValue", "()Ljava/lang/Double;", "setValue", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getWarningType", "setWarningType", "describeContents", "getDeviceUniqueId", "getEndTimestamp", "getSsoid", "getStartTimestamp", "setSsoid", "", "mSsoid", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BloodSugarWarning extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BloodSugarWarning> CREATOR = new a();

    @Nullable
    private String clientModel;

    @NotNull
    private String dataClient;

    @NotNull
    private String ssoid;
    private int syncStatus;
    private long timestamp;

    @Nullable
    private Double value;
    private int warningType;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BloodSugarWarning> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BloodSugarWarning createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BloodSugarWarning(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BloodSugarWarning[] newArray(int i) {
            return new BloodSugarWarning[i];
        }
    }

    public /* synthetic */ BloodSugarWarning(String str, String str2, String str3, int i, long j2, Double d, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0L : j2, (i3 & 32) != 0 ? null : d, (i3 & 64) != 0 ? 0 : i2);
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

    @Override // com.heytap.databaseengine.model.SportHealthData
    /* JADX INFO: renamed from: getEndTimestamp, reason: from getter */
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return this.timestamp;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final Double getValue() {
        return this.value;
    }

    public final int getWarningType() {
        return this.warningType;
    }

    public final void setClientModel(@Nullable String str) {
        this.clientModel = str;
    }

    public final void setDataClient(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataClient = str;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public final void setTimestamp(long j2) {
        this.timestamp = j2;
    }

    public final void setValue(@Nullable Double d) {
        this.value = d;
    }

    public final void setWarningType(int i) {
        this.warningType = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "BloodSugarWarning(ssoid='" + this.ssoid + "', dataClient='" + this.dataClient + "', clientModel=" + this.clientModel + ", warningType=" + this.warningType + ", timestamp=" + this.timestamp + ", value=" + this.value + ", syncStatus=" + this.syncStatus + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.dataClient);
        parcel.writeString(this.clientModel);
        parcel.writeInt(this.warningType);
        parcel.writeLong(this.timestamp);
        Double d = this.value;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeInt(this.syncStatus);
    }

    public BloodSugarWarning(@NotNull String ssoid, @NotNull String dataClient, @Nullable String str, int i, long j2, @Nullable Double d, int i2) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.ssoid = ssoid;
        this.dataClient = dataClient;
        this.clientModel = str;
        this.warningType = i;
        this.timestamp = j2;
        this.value = d;
        this.syncStatus = i2;
    }

    public BloodSugarWarning() {
        this("", "", null, 0, 0L, Double.valueOf(0.0d), 0);
    }
}
