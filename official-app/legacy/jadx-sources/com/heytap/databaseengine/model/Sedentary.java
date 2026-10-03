package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0004HÂ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÂ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÂ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\t\u0010\u001a\u001a\u00020\nHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\b\u0010\u001f\u001a\u00020\u0004H\u0016J\b\u0010 \u001a\u00020\u0006H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016J\b\u0010\"\u001a\u00020\u0006H\u0016J\t\u0010#\u001a\u00020\nHÖ\u0001J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0006J\u000e\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020\u0004J\u000e\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020\u0006J\b\u0010+\u001a\u00020\u0004H\u0016J\u0019\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\nHÖ\u0001R\u001a\u0010\b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u00060"}, d2 = {"Lcom/heytap/databaseengine/model/Sedentary;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "ssoid", "", "startTimestamp", "", "endTimestamp", "dataClient", "value", "", "(Ljava/lang/String;JJLjava/lang/String;I)V", "getDataClient", "()Ljava/lang/String;", "setDataClient", "(Ljava/lang/String;)V", "getValue", "()I", "setValue", "(I)V", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "getDeviceUniqueId", "getEndTimestamp", "getSsoid", "getStartTimestamp", "hashCode", "setEndTimestamp", "", "mEndTimestamp", "setSsoid", "mSsoid", "setStartTimestamp", "mStartTimestamp", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Sedentary extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Sedentary> CREATOR = new a();

    @NotNull
    private String dataClient;
    private long endTimestamp;

    @NotNull
    private String ssoid;
    private long startTimestamp;
    private int value;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Sedentary> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Sedentary createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Sedentary(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Sedentary[] newArray(int i) {
            return new Sedentary[i];
        }
    }

    public Sedentary() {
        this(null, 0L, 0L, null, 0, 31, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getSsoid() {
        return this.ssoid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final long getStartTimestamp() {
        return this.startTimestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final long getEndTimestamp() {
        return this.endTimestamp;
    }

    public static /* synthetic */ Sedentary copy$default(Sedentary sedentary, String str, long j2, long j3, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sedentary.ssoid;
        }
        if ((i2 & 2) != 0) {
            j2 = sedentary.startTimestamp;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            j3 = sedentary.endTimestamp;
        }
        long j5 = j3;
        if ((i2 & 8) != 0) {
            str2 = sedentary.dataClient;
        }
        String str3 = str2;
        if ((i2 & 16) != 0) {
            i = sedentary.value;
        }
        return sedentary.copy(str, j4, j5, str3, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDataClient() {
        return this.dataClient;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @NotNull
    public final Sedentary copy(@NotNull String ssoid, long startTimestamp, long endTimestamp, @NotNull String dataClient, int value) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        return new Sedentary(ssoid, startTimestamp, endTimestamp, dataClient, value);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Sedentary)) {
            return false;
        }
        Sedentary sedentary = (Sedentary) other;
        return Intrinsics.areEqual(this.ssoid, sedentary.ssoid) && this.startTimestamp == sedentary.startTimestamp && this.endTimestamp == sedentary.endTimestamp && Intrinsics.areEqual(this.dataClient, sedentary.dataClient) && this.value == sedentary.value;
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

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((((this.ssoid.hashCode() * 31) + Long.hashCode(this.startTimestamp)) * 31) + Long.hashCode(this.endTimestamp)) * 31) + this.dataClient.hashCode()) * 31) + Integer.hashCode(this.value);
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

    public final void setValue(int i) {
        this.value = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "Sedentary(ssoid='" + this.ssoid + "', startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", dataClient='" + this.dataClient + "', value=" + this.value + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeString(this.dataClient);
        parcel.writeInt(this.value);
    }

    public /* synthetic */ Sedentary(String str, long j2, long j3, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0L : j2, (i2 & 4) != 0 ? 0L : j3, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? 0 : i);
    }

    public Sedentary(@NotNull String ssoid, long j2, long j3, @NotNull String dataClient, int i) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.ssoid = ssoid;
        this.startTimestamp = j2;
        this.endTimestamp = j3;
        this.dataClient = dataClient;
        this.value = i;
    }
}
