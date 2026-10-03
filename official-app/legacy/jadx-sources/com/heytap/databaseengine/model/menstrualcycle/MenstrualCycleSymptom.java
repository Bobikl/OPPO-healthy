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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003BW\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b¢\u0006\u0002\u0010\u000fJ\t\u0010'\u001a\u00020\u000bHÖ\u0001J\b\u0010(\u001a\u00020\u0005H\u0016J\b\u0010)\u001a\u00020\tH\u0016J\b\u0010*\u001a\u00020\u0005H\u0016J\b\u0010+\u001a\u00020\tH\u0016J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0005J\b\u0010/\u001a\u00020\u0005H\u0016J\u0019\u00100\u001a\u00020-2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u000bHÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001a\u0010\r\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u001e\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u00064"}, d2 = {"Lcom/heytap/databaseengine/model/menstrualcycle/MenstrualCycleSymptom;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "()V", "ssoid", "", "dataClient", "clientModel", "dataCreatedTimestamp", "", "type", "", "value", "updateTimestamp", "syncStatus", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/Integer;JI)V", "getClientModel", "()Ljava/lang/String;", "setClientModel", "(Ljava/lang/String;)V", "getDataClient", "setDataClient", "getDataCreatedTimestamp", "()J", "setDataCreatedTimestamp", "(J)V", "getSyncStatus", "()I", "setSyncStatus", "(I)V", "getType", "setType", "getUpdateTimestamp", "setUpdateTimestamp", "getValue", "()Ljava/lang/Integer;", "setValue", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "describeContents", "getDeviceUniqueId", "getEndTimestamp", "getSsoid", "getStartTimestamp", "setSsoid", "", "mSsoid", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MenstrualCycleSymptom extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MenstrualCycleSymptom> CREATOR = new a();

    @Nullable
    private String clientModel;

    @NotNull
    private String dataClient;
    private long dataCreatedTimestamp;

    @NotNull
    private String ssoid;
    private int syncStatus;
    private int type;
    private long updateTimestamp;

    @Nullable
    private Integer value;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MenstrualCycleSymptom> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MenstrualCycleSymptom createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MenstrualCycleSymptom(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MenstrualCycleSymptom[] newArray(int i) {
            return new MenstrualCycleSymptom[i];
        }
    }

    public /* synthetic */ MenstrualCycleSymptom(String str, String str2, String str3, long j2, int i, Integer num, long j3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? 0L : j2, (i3 & 16) != 0 ? 0 : i, num, (i3 & 64) != 0 ? 0L : j3, (i3 & 128) != 0 ? 0 : i2);
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

    public final int getType() {
        return this.type;
    }

    public final long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    @Nullable
    public final Integer getValue() {
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

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUpdateTimestamp(long j2) {
        this.updateTimestamp = j2;
    }

    public final void setValue(@Nullable Integer num) {
        this.value = num;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "MenstrualCycleSymptom(ssoid='" + this.ssoid + "', dataClient='" + this.dataClient + "', clientModel=" + this.clientModel + ", dataCreatedTimestamp=" + ptb.a(this.dataCreatedTimestamp) + ", type=" + this.type + ", value=" + this.value + ", updateTimestamp=" + ptb.a(this.updateTimestamp) + ", syncStatus=" + this.syncStatus + "\n)";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.dataClient);
        parcel.writeString(this.clientModel);
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeInt(this.type);
        Integer num = this.value;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeLong(this.updateTimestamp);
        parcel.writeInt(this.syncStatus);
    }

    public MenstrualCycleSymptom(@NotNull String ssoid, @NotNull String dataClient, @Nullable String str, long j2, int i, @Nullable Integer num, long j3, int i2) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.ssoid = ssoid;
        this.dataClient = dataClient;
        this.clientModel = str;
        this.dataCreatedTimestamp = j2;
        this.type = i;
        this.value = num;
        this.updateTimestamp = j3;
        this.syncStatus = i2;
    }

    public MenstrualCycleSymptom() {
        this("", "", null, 0L, 0, null, 0L, 0);
    }
}
