package com.heytap.databaseengine.model.sunshine;

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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n¢\u0006\u0002\u0010\u000eJ\t\u0010#\u001a\u00020\u0004HÂ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0004HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J[\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\nHÆ\u0001J\t\u0010,\u001a\u00020\nHÖ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\b\u00101\u001a\u00020\u0004H\u0016J\b\u00102\u001a\u00020\u0006H\u0016J\b\u00103\u001a\u00020\u0004H\u0016J\b\u00104\u001a\u00020\u0006H\u0016J\t\u00105\u001a\u00020\nHÖ\u0001J\u000e\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u0004J\b\u00109\u001a\u00020\u0004H\u0016J\u0019\u0010:\u001a\u0002072\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\nHÖ\u0001R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\r\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001a\u0010\f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001c¨\u0006>"}, d2 = {"Lcom/heytap/databaseengine/model/sunshine/SunshineDetail;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "ssoid", "", "dataCreatedTimestamp", "", "dataClient", "clientModel", "sunBathing", "", "lightIntensity", "vitaminDIngestion", "display", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;IIII)V", "getClientModel", "()Ljava/lang/String;", "setClientModel", "(Ljava/lang/String;)V", "getDataClient", "setDataClient", "getDataCreatedTimestamp", "()J", "setDataCreatedTimestamp", "(J)V", "getDisplay", "()I", "setDisplay", "(I)V", "getLightIntensity", "setLightIntensity", "getSunBathing", "setSunBathing", "getVitaminDIngestion", "setVitaminDIngestion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "", "other", "", "getDeviceUniqueId", "getEndTimestamp", "getSsoid", "getStartTimestamp", "hashCode", "setSsoid", "", "mSsoid", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SunshineDetail extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SunshineDetail> CREATOR = new a();

    @Nullable
    private String clientModel;

    @NotNull
    private String dataClient;
    private long dataCreatedTimestamp;
    private int display;
    private int lightIntensity;

    @NotNull
    private String ssoid;
    private int sunBathing;
    private int vitaminDIngestion;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SunshineDetail> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SunshineDetail createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SunshineDetail(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SunshineDetail[] newArray(int i) {
            return new SunshineDetail[i];
        }
    }

    public SunshineDetail() {
        this(null, 0L, null, null, 0, 0, 0, 0, 255, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getSsoid() {
        return this.ssoid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDataClient() {
        return this.dataClient;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getClientModel() {
        return this.clientModel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSunBathing() {
        return this.sunBathing;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getLightIntensity() {
        return this.lightIntensity;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getVitaminDIngestion() {
        return this.vitaminDIngestion;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getDisplay() {
        return this.display;
    }

    @NotNull
    public final SunshineDetail copy(@NotNull String ssoid, long dataCreatedTimestamp, @NotNull String dataClient, @Nullable String clientModel, int sunBathing, int lightIntensity, int vitaminDIngestion, int display) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        return new SunshineDetail(ssoid, dataCreatedTimestamp, dataClient, clientModel, sunBathing, lightIntensity, vitaminDIngestion, display);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SunshineDetail)) {
            return false;
        }
        SunshineDetail sunshineDetail = (SunshineDetail) other;
        return Intrinsics.areEqual(this.ssoid, sunshineDetail.ssoid) && this.dataCreatedTimestamp == sunshineDetail.dataCreatedTimestamp && Intrinsics.areEqual(this.dataClient, sunshineDetail.dataClient) && Intrinsics.areEqual(this.clientModel, sunshineDetail.clientModel) && this.sunBathing == sunshineDetail.sunBathing && this.lightIntensity == sunshineDetail.lightIntensity && this.vitaminDIngestion == sunshineDetail.vitaminDIngestion && this.display == sunshineDetail.display;
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

    public final int getLightIntensity() {
        return this.lightIntensity;
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

    public final int getSunBathing() {
        return this.sunBathing;
    }

    public final int getVitaminDIngestion() {
        return this.vitaminDIngestion;
    }

    public int hashCode() {
        int iHashCode = ((((this.ssoid.hashCode() * 31) + Long.hashCode(this.dataCreatedTimestamp)) * 31) + this.dataClient.hashCode()) * 31;
        String str = this.clientModel;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.sunBathing)) * 31) + Integer.hashCode(this.lightIntensity)) * 31) + Integer.hashCode(this.vitaminDIngestion)) * 31) + Integer.hashCode(this.display);
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

    public final void setLightIntensity(int i) {
        this.lightIntensity = i;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setSunBathing(int i) {
        this.sunBathing = i;
    }

    public final void setVitaminDIngestion(int i) {
        this.vitaminDIngestion = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "SunshineDetail(clientModel=" + this.clientModel + ", ssoid='" + this.ssoid + "', dataCreatedTimestamp=" + this.dataCreatedTimestamp + ", dataClient='" + this.dataClient + "', sunBathing=" + this.sunBathing + ", lightIntensity=" + this.lightIntensity + ", vitaminDIngestion=" + this.vitaminDIngestion + ", display=" + this.display + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeString(this.dataClient);
        parcel.writeString(this.clientModel);
        parcel.writeInt(this.sunBathing);
        parcel.writeInt(this.lightIntensity);
        parcel.writeInt(this.vitaminDIngestion);
        parcel.writeInt(this.display);
    }

    public /* synthetic */ SunshineDetail(String str, long j2, String str2, String str3, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? 0L : j2, (i5 & 4) != 0 ? "" : str2, (i5 & 8) != 0 ? null : str3, (i5 & 16) != 0 ? 0 : i, (i5 & 32) != 0 ? 0 : i2, (i5 & 64) != 0 ? 0 : i3, (i5 & 128) != 0 ? 1 : i4);
    }

    public SunshineDetail(@NotNull String ssoid, long j2, @NotNull String dataClient, @Nullable String str, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.ssoid = ssoid;
        this.dataCreatedTimestamp = j2;
        this.dataClient = dataClient;
        this.clientModel = str;
        this.sunBathing = i;
        this.lightIntensity = i2;
        this.vitaminDIngestion = i3;
        this.display = i4;
    }
}
