package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b+\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0083\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0013J\t\u0010,\u001a\u00020\u0004HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010.\u001a\u00020\fHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u00100\u001a\u00020\u0004HÂ\u0003J\t\u00101\u001a\u00020\u0007HÂ\u0003J\t\u00102\u001a\u00020\u0007HÂ\u0003J\t\u00103\u001a\u00020\u0004HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u00105\u001a\u00020\fHÆ\u0003J\t\u00106\u001a\u00020\fHÆ\u0003J\t\u00107\u001a\u00020\u000fHÆ\u0003J\u0087\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0011\u001a\u00020\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u00109\u001a\u00020\fHÖ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\b\u0010>\u001a\u00020\u0007H\u0016J\b\u0010?\u001a\u00020\u0004H\u0016J\b\u0010@\u001a\u00020\u0007H\u0016J\t\u0010A\u001a\u00020\fHÖ\u0001J\u000e\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0007J\u000e\u0010E\u001a\u00020C2\u0006\u0010F\u001a\u00020\u0004J\u000e\u0010G\u001a\u00020C2\u0006\u0010H\u001a\u00020\u0007J\b\u0010I\u001a\u00020\u0004H\u0016J\u0019\u0010J\u001a\u00020C2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\fHÖ\u0001R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0015\"\u0004\b'\u0010\u0017R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006N"}, d2 = {"Lcom/heytap/databaseengine/model/MetadataUnit;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "clientDataId", "", "ssoid", "startTimestamp", "", "endTimestamp", "dataClient", "clientModel", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "", "type", "value", "", "sportName", "abnormalTrack", DBSportMetadata.EXTENSION, "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;IIDLjava/lang/String;ILjava/lang/String;)V", "getAbnormalTrack", "()I", "setAbnormalTrack", "(I)V", "getClientDataId", "()Ljava/lang/String;", "setClientDataId", "(Ljava/lang/String;)V", "getClientModel", "setClientModel", "getDataClient", "setDataClient", "getExtension", "setExtension", "getSportMode", "setSportMode", "getSportName", "setSportName", "getType", "setType", "getValue", "()D", "setValue", "(D)V", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "getEndTimestamp", "getSsoid", "getStartTimestamp", "hashCode", "setEndTimestamp", "", "mEndTimestamp", "setSsoid", "mSsoid", "setStartTimestamp", "mStartTimestamp", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MetadataUnit extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MetadataUnit> CREATOR = new a();
    private int abnormalTrack;

    @NotNull
    private String clientDataId;

    @Nullable
    private String clientModel;

    @NotNull
    private String dataClient;
    private long endTimestamp;

    @Nullable
    private String extension;
    private int sportMode;

    @Nullable
    private String sportName;

    @NotNull
    private String ssoid;
    private long startTimestamp;
    private int type;
    private double value;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MetadataUnit> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MetadataUnit createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MetadataUnit(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readDouble(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MetadataUnit[] newArray(int i) {
            return new MetadataUnit[i];
        }
    }

    public MetadataUnit() {
        this(null, null, 0L, 0L, null, null, 0, 0, 0.0d, null, 0, null, 4095, null);
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final String getSsoid() {
        return this.ssoid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final long getStartTimestamp() {
        return this.startTimestamp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final long getEndTimestamp() {
        return this.endTimestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClientDataId() {
        return this.clientDataId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSportName() {
        return this.sportName;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getAbnormalTrack() {
        return this.abnormalTrack;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getExtension() {
        return this.extension;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDataClient() {
        return this.dataClient;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getClientModel() {
        return this.clientModel;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getSportMode() {
        return this.sportMode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    @NotNull
    public final MetadataUnit copy(@NotNull String clientDataId, @NotNull String ssoid, long startTimestamp, long endTimestamp, @NotNull String dataClient, @Nullable String clientModel, int sportMode, int type, double value, @Nullable String sportName, int abnormalTrack, @Nullable String extension) {
        Intrinsics.checkNotNullParameter(clientDataId, "clientDataId");
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        return new MetadataUnit(clientDataId, ssoid, startTimestamp, endTimestamp, dataClient, clientModel, sportMode, type, value, sportName, abnormalTrack, extension);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetadataUnit)) {
            return false;
        }
        MetadataUnit metadataUnit = (MetadataUnit) other;
        return Intrinsics.areEqual(this.clientDataId, metadataUnit.clientDataId) && Intrinsics.areEqual(this.ssoid, metadataUnit.ssoid) && this.startTimestamp == metadataUnit.startTimestamp && this.endTimestamp == metadataUnit.endTimestamp && Intrinsics.areEqual(this.dataClient, metadataUnit.dataClient) && Intrinsics.areEqual(this.clientModel, metadataUnit.clientModel) && this.sportMode == metadataUnit.sportMode && this.type == metadataUnit.type && Double.compare(this.value, metadataUnit.value) == 0 && Intrinsics.areEqual(this.sportName, metadataUnit.sportName) && this.abnormalTrack == metadataUnit.abnormalTrack && Intrinsics.areEqual(this.extension, metadataUnit.extension);
    }

    public final int getAbnormalTrack() {
        return this.abnormalTrack;
    }

    @NotNull
    public final String getClientDataId() {
        return this.clientDataId;
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
    public long getEndTimestamp() {
        return this.endTimestamp;
    }

    @Nullable
    public final String getExtension() {
        return this.extension;
    }

    public final int getSportMode() {
        return this.sportMode;
    }

    @Nullable
    public final String getSportName() {
        return this.sportName;
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

    public final int getType() {
        return this.type;
    }

    public final double getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.clientDataId.hashCode() * 31) + this.ssoid.hashCode()) * 31) + Long.hashCode(this.startTimestamp)) * 31) + Long.hashCode(this.endTimestamp)) * 31) + this.dataClient.hashCode()) * 31;
        String str = this.clientModel;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.sportMode)) * 31) + Integer.hashCode(this.type)) * 31) + Double.hashCode(this.value)) * 31;
        String str2 = this.sportName;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.abnormalTrack)) * 31;
        String str3 = this.extension;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setAbnormalTrack(int i) {
        this.abnormalTrack = i;
    }

    public final void setClientDataId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clientDataId = str;
    }

    public final void setClientModel(@Nullable String str) {
        this.clientModel = str;
    }

    public final void setDataClient(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataClient = str;
    }

    public final void setEndTimestamp(long mEndTimestamp) {
        this.endTimestamp = mEndTimestamp;
    }

    public final void setExtension(@Nullable String str) {
        this.extension = str;
    }

    public final void setSportMode(int i) {
        this.sportMode = i;
    }

    public final void setSportName(@Nullable String str) {
        this.sportName = str;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setStartTimestamp(long mStartTimestamp) {
        this.startTimestamp = mStartTimestamp;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setValue(double d) {
        this.value = d;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "MetadataUnit(clientDataId='" + this.clientDataId + "', ssoid='" + this.ssoid + "', startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", dataClient='" + this.dataClient + "', clientModel=" + this.clientModel + ", sportMode=" + this.sportMode + ", type=" + this.type + ", value=" + this.value + ", sportName=" + this.sportName + ", abnormalTrack=" + this.abnormalTrack + ", extension=" + this.extension + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.clientDataId);
        parcel.writeString(this.ssoid);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeString(this.dataClient);
        parcel.writeString(this.clientModel);
        parcel.writeInt(this.sportMode);
        parcel.writeInt(this.type);
        parcel.writeDouble(this.value);
        parcel.writeString(this.sportName);
        parcel.writeInt(this.abnormalTrack);
        parcel.writeString(this.extension);
    }

    public /* synthetic */ MetadataUnit(String str, String str2, long j2, long j3, String str3, String str4, int i, int i2, double d, String str5, int i3, String str6, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? 0L : j2, (i4 & 8) == 0 ? j3 : 0L, (i4 & 16) == 0 ? str3 : "", (i4 & 32) != 0 ? null : str4, (i4 & 64) != 0 ? 0 : i, (i4 & 128) != 0 ? 0 : i2, (i4 & 256) != 0 ? 0.0d : d, (i4 & 512) != 0 ? null : str5, (i4 & 1024) == 0 ? i3 : 0, (i4 & 2048) != 0 ? null : str6);
    }

    public MetadataUnit(@NotNull String clientDataId, @NotNull String ssoid, long j2, long j3, @NotNull String dataClient, @Nullable String str, int i, int i2, double d, @Nullable String str2, int i3, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(clientDataId, "clientDataId");
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.clientDataId = clientDataId;
        this.ssoid = ssoid;
        this.startTimestamp = j2;
        this.endTimestamp = j3;
        this.dataClient = dataClient;
        this.clientModel = str;
        this.sportMode = i;
        this.type = i2;
        this.value = d;
        this.sportName = str2;
        this.abnormalTrack = i3;
        this.extension = str3;
    }
}
