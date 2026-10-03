package com.heytap.databaseengine.model.physicalMental;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0002\u0010\u000fJ\t\u0010&\u001a\u00020\nHÖ\u0001J\b\u0010'\u001a\u00020\u0004H\u0016J\b\u0010(\u001a\u00020\u0006H\u0016J\b\u0010)\u001a\u00020\u0004H\u0016J\b\u0010*\u001a\u00020\u0006H\u0016J\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0004J\b\u0010.\u001a\u00020\u0004H\u0016J\u0019\u0010/\u001a\u00020,2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\nHÖ\u0001R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000e\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001a\u0010\r\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001d¨\u00063"}, d2 = {"Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalStatus;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "ssoid", "", "dataCreatedTimestamp", "", "dataClient", "clientModel", "type", "", "value", "stress", "stressState", "display", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;IIIII)V", "getClientModel", "()Ljava/lang/String;", "setClientModel", "(Ljava/lang/String;)V", "getDataClient", "setDataClient", "getDataCreatedTimestamp", "()J", "setDataCreatedTimestamp", "(J)V", "getDisplay", "()I", "setDisplay", "(I)V", "getStress", "setStress", "getStressState", "setStressState", "getType", "setType", "getValue", "setValue", "describeContents", "getDeviceUniqueId", "getEndTimestamp", "getSsoid", "getStartTimestamp", "setSsoid", "", "mSsoid", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PhysicalMentalStatus extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PhysicalMentalStatus> CREATOR = new a();

    @Nullable
    private String clientModel;

    @NotNull
    private String dataClient;
    private long dataCreatedTimestamp;
    private int display;

    @NotNull
    private String ssoid;
    private int stress;
    private int stressState;
    private int type;
    private int value;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhysicalMentalStatus> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PhysicalMentalStatus createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PhysicalMentalStatus(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PhysicalMentalStatus[] newArray(int i) {
            return new PhysicalMentalStatus[i];
        }
    }

    public PhysicalMentalStatus() {
        this(null, 0L, null, null, 0, 0, 0, 0, 0, FrameMetricsAggregator.EVERY_DURATION, null);
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

    public final int getStress() {
        return this.stress;
    }

    public final int getStressState() {
        return this.stressState;
    }

    public final int getType() {
        return this.type;
    }

    public final int getValue() {
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

    public final void setStress(int i) {
        this.stress = i;
    }

    public final void setStressState(int i) {
        this.stressState = i;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setValue(int i) {
        this.value = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "PhysicalMentalStatus(ssoid='" + this.ssoid + "', dataCreatedTimestamp=" + this.dataCreatedTimestamp + ", dataClient='" + this.dataClient + "', clientModel=" + this.clientModel + ", type=" + this.type + ", value=" + this.value + ", stress=" + this.stress + ", stressState=" + this.stressState + ", display=" + this.display + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeString(this.dataClient);
        parcel.writeString(this.clientModel);
        parcel.writeInt(this.type);
        parcel.writeInt(this.value);
        parcel.writeInt(this.stress);
        parcel.writeInt(this.stressState);
        parcel.writeInt(this.display);
    }

    public /* synthetic */ PhysicalMentalStatus(String str, long j2, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? 0L : j2, (i6 & 4) != 0 ? "" : str2, (i6 & 8) != 0 ? null : str3, (i6 & 16) != 0 ? 0 : i, (i6 & 32) != 0 ? 0 : i2, (i6 & 64) != 0 ? 0 : i3, (i6 & 128) != 0 ? 0 : i4, (i6 & 256) != 0 ? 1 : i5);
    }

    public PhysicalMentalStatus(@NotNull String ssoid, long j2, @NotNull String dataClient, @Nullable String str, int i, int i2, int i3, int i4, int i5) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.ssoid = ssoid;
        this.dataCreatedTimestamp = j2;
        this.dataClient = dataClient;
        this.clientModel = str;
        this.type = i;
        this.value = i2;
        this.stress = i3;
        this.stressState = i4;
        this.display = i5;
    }
}
