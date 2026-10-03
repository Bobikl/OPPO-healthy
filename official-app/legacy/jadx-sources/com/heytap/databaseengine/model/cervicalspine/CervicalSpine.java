package com.heytap.databaseengine.model.cervicalspine;

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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003Bi\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0002\u0010\u0012J\t\u0010'\u001a\u00020\fHÖ\u0001J\b\u0010(\u001a\u00020\u0007H\u0016J\n\u0010)\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010*\u001a\u00020\u0007H\u0016J\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0007J\u000e\u0010.\u001a\u00020,2\u0006\u0010/\u001a\u00020\u0005J\u000e\u00100\u001a\u00020,2\u0006\u00101\u001a\u00020\u0007J\b\u00102\u001a\u00020\u0005H\u0016J\u0019\u00103\u001a\u00020,2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\fHÖ\u0001R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0010\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u001a\u0010\u000f\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001c¨\u00067"}, d2 = {"Lcom/heytap/databaseengine/model/cervicalspine/CervicalSpine;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "()V", "ssoid", "", "startTimestamp", "", "endTimestamp", "dataClient", "clientModel", "lowHeadSeconds", "", "wearSeconds", "goodSeconds", "mildSeconds", "heavySeconds", "lowHeadPercent", "(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;IIIIII)V", "getClientModel", "()Ljava/lang/String;", "setClientModel", "(Ljava/lang/String;)V", "getDataClient", "setDataClient", "getGoodSeconds", "()I", "setGoodSeconds", "(I)V", "getHeavySeconds", "setHeavySeconds", "getLowHeadPercent", "setLowHeadPercent", "getLowHeadSeconds", "setLowHeadSeconds", "getMildSeconds", "setMildSeconds", "getWearSeconds", "setWearSeconds", "describeContents", "getEndTimestamp", "getSsoid", "getStartTimestamp", "setEndTimestamp", "", "mEndTimestamp", "setSsoid", "mSsoid", "setStartTimestamp", "mStartTimestamp", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CervicalSpine extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CervicalSpine> CREATOR = new a();

    @Nullable
    private String clientModel;

    @Nullable
    private String dataClient;
    private long endTimestamp;
    private int goodSeconds;
    private int heavySeconds;
    private int lowHeadPercent;
    private int lowHeadSeconds;
    private int mildSeconds;

    @Nullable
    private String ssoid;
    private long startTimestamp;
    private int wearSeconds;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CervicalSpine> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CervicalSpine createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CervicalSpine(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CervicalSpine[] newArray(int i) {
            return new CervicalSpine[i];
        }
    }

    public /* synthetic */ CervicalSpine(String str, long j2, long j3, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, j2, j3, (i7 & 8) != 0 ? null : str2, (i7 & 16) != 0 ? null : str3, i, i2, i3, i4, i5, i6);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getClientModel() {
        return this.clientModel;
    }

    @Nullable
    public final String getDataClient() {
        return this.dataClient;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return this.endTimestamp;
    }

    public final int getGoodSeconds() {
        return this.goodSeconds;
    }

    public final int getHeavySeconds() {
        return this.heavySeconds;
    }

    public final int getLowHeadPercent() {
        return this.lowHeadPercent;
    }

    public final int getLowHeadSeconds() {
        return this.lowHeadSeconds;
    }

    public final int getMildSeconds() {
        return this.mildSeconds;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @Nullable
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    public final int getWearSeconds() {
        return this.wearSeconds;
    }

    public final void setClientModel(@Nullable String str) {
        this.clientModel = str;
    }

    public final void setDataClient(@Nullable String str) {
        this.dataClient = str;
    }

    public final void setEndTimestamp(long mEndTimestamp) {
        this.endTimestamp = mEndTimestamp;
    }

    public final void setGoodSeconds(int i) {
        this.goodSeconds = i;
    }

    public final void setHeavySeconds(int i) {
        this.heavySeconds = i;
    }

    public final void setLowHeadPercent(int i) {
        this.lowHeadPercent = i;
    }

    public final void setLowHeadSeconds(int i) {
        this.lowHeadSeconds = i;
    }

    public final void setMildSeconds(int i) {
        this.mildSeconds = i;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setStartTimestamp(long mStartTimestamp) {
        this.startTimestamp = mStartTimestamp;
    }

    public final void setWearSeconds(int i) {
        this.wearSeconds = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "CervicalSpine(ssoid=" + this.ssoid + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", dataClient=" + this.dataClient + ", clientModel=" + this.clientModel + ", lowHeadSeconds=" + this.lowHeadSeconds + ", wearSeconds=" + this.wearSeconds + ", goodSeconds=" + this.goodSeconds + ", mildSeconds=" + this.mildSeconds + ", heavySeconds=" + this.heavySeconds + ", lowHeadPercent=" + this.lowHeadPercent + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeString(this.dataClient);
        parcel.writeString(this.clientModel);
        parcel.writeInt(this.lowHeadSeconds);
        parcel.writeInt(this.wearSeconds);
        parcel.writeInt(this.goodSeconds);
        parcel.writeInt(this.mildSeconds);
        parcel.writeInt(this.heavySeconds);
        parcel.writeInt(this.lowHeadPercent);
    }

    public CervicalSpine(@Nullable String str, long j2, long j3, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, int i5, int i6) {
        this.ssoid = str;
        this.startTimestamp = j2;
        this.endTimestamp = j3;
        this.dataClient = str2;
        this.clientModel = str3;
        this.lowHeadSeconds = i;
        this.wearSeconds = i2;
        this.goodSeconds = i3;
        this.mildSeconds = i4;
        this.heavySeconds = i5;
        this.lowHeadPercent = i6;
    }

    public CervicalSpine() {
        this(null, 0L, 0L, null, null, 0, 0, 0, 0, 0, 0);
    }
}
