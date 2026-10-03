package com.heytap.databaseengine.model.sunshine;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.sunshine.DBVitamin;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0002\u0010\u000eJ\t\u0010#\u001a\u00020\u0004HÂ\u0003J\t\u0010$\u001a\u00020\u0004HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J[\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001J\t\u0010,\u001a\u00020\bHÖ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\b\u00101\u001a\u00020\u0004H\u0016J\b\u00102\u001a\u00020\fH\u0016J\b\u00103\u001a\u00020\u0004H\u0016J\b\u00104\u001a\u00020\fH\u0016J\t\u00105\u001a\u00020\bHÖ\u0001J\u000e\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u0004J\b\u00109\u001a\u00020\u0004H\u0016J\u0019\u0010:\u001a\u0002072\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\bHÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\r\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001c¨\u0006>"}, d2 = {"Lcom/heytap/databaseengine/model/sunshine/Vitamin;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "ssoid", "", "dataClient", "clientModel", "vitaminNameCode", "", DBVitamin.DOSAGE, "source", "dataCreatedTimestamp", "", "display", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIJI)V", "getClientModel", "()Ljava/lang/String;", "setClientModel", "(Ljava/lang/String;)V", "getDataClient", "setDataClient", "getDataCreatedTimestamp", "()J", "setDataCreatedTimestamp", "(J)V", "getDisplay", "()I", "setDisplay", "(I)V", "getDosage", "setDosage", "getSource", "setSource", "getVitaminNameCode", "setVitaminNameCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "", "other", "", "getDeviceUniqueId", "getEndTimestamp", "getSsoid", "getStartTimestamp", "hashCode", "setSsoid", "", "mSsoid", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Vitamin extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Vitamin> CREATOR = new a();

    @Nullable
    private String clientModel;

    @NotNull
    private String dataClient;
    private long dataCreatedTimestamp;
    private int display;
    private int dosage;
    private int source;

    @NotNull
    private String ssoid;
    private int vitaminNameCode;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Vitamin> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Vitamin createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Vitamin(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Vitamin[] newArray(int i) {
            return new Vitamin[i];
        }
    }

    public Vitamin() {
        this(null, null, null, 0, 0, 0, 0L, 0, 255, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getSsoid() {
        return this.ssoid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDataClient() {
        return this.dataClient;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getClientModel() {
        return this.clientModel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getVitaminNameCode() {
        return this.vitaminNameCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getDosage() {
        return this.dosage;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getDisplay() {
        return this.display;
    }

    @NotNull
    public final Vitamin copy(@NotNull String ssoid, @NotNull String dataClient, @Nullable String clientModel, int vitaminNameCode, int dosage, int source, long dataCreatedTimestamp, int display) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        return new Vitamin(ssoid, dataClient, clientModel, vitaminNameCode, dosage, source, dataCreatedTimestamp, display);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vitamin)) {
            return false;
        }
        Vitamin vitamin = (Vitamin) other;
        return Intrinsics.areEqual(this.ssoid, vitamin.ssoid) && Intrinsics.areEqual(this.dataClient, vitamin.dataClient) && Intrinsics.areEqual(this.clientModel, vitamin.clientModel) && this.vitaminNameCode == vitamin.vitaminNameCode && this.dosage == vitamin.dosage && this.source == vitamin.source && this.dataCreatedTimestamp == vitamin.dataCreatedTimestamp && this.display == vitamin.display;
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

    public final int getDosage() {
        return this.dosage;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return this.dataCreatedTimestamp;
    }

    public final int getSource() {
        return this.source;
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

    public final int getVitaminNameCode() {
        return this.vitaminNameCode;
    }

    public int hashCode() {
        int iHashCode = ((this.ssoid.hashCode() * 31) + this.dataClient.hashCode()) * 31;
        String str = this.clientModel;
        return ((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.vitaminNameCode)) * 31) + Integer.hashCode(this.dosage)) * 31) + Integer.hashCode(this.source)) * 31) + Long.hashCode(this.dataCreatedTimestamp)) * 31) + Integer.hashCode(this.display);
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

    public final void setDosage(int i) {
        this.dosage = i;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setVitaminNameCode(int i) {
        this.vitaminNameCode = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "Vitamin(ssoid='" + this.ssoid + "', dataClient='" + this.dataClient + "', clientModel=" + this.clientModel + ", vitaminNameCode=" + this.vitaminNameCode + ", dosage=" + this.dosage + ", source=" + this.source + ", dataCreatedTimestamp=" + this.dataCreatedTimestamp + ", display=" + this.display + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.dataClient);
        parcel.writeString(this.clientModel);
        parcel.writeInt(this.vitaminNameCode);
        parcel.writeInt(this.dosage);
        parcel.writeInt(this.source);
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeInt(this.display);
    }

    public /* synthetic */ Vitamin(String str, String str2, String str3, int i, int i2, int i3, long j2, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? "" : str2, (i5 & 4) != 0 ? null : str3, (i5 & 8) != 0 ? 0 : i, (i5 & 16) != 0 ? 0 : i2, (i5 & 32) != 0 ? 0 : i3, (i5 & 64) != 0 ? 0L : j2, (i5 & 128) != 0 ? 1 : i4);
    }

    public Vitamin(@NotNull String ssoid, @NotNull String dataClient, @Nullable String str, int i, int i2, int i3, long j2, int i4) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.ssoid = ssoid;
        this.dataClient = dataClient;
        this.clientModel = str;
        this.vitaminNameCode = i;
        this.dosage = i2;
        this.source = i3;
        this.dataCreatedTimestamp = j2;
        this.display = i4;
    }
}
