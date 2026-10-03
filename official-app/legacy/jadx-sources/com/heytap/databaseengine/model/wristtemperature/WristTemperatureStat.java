package com.heytap.databaseengine.model.wristtemperature;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.wristtemperature.DBWristTemperatureStat;
import com.oplus.aiunit.vision.v05;
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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b%\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u0095\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t¢\u0006\u0002\u0010\u0015J\t\u00106\u001a\u00020\tHÖ\u0001J\b\u00107\u001a\u00020\u0005H\u0016J\u000e\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0005J\b\u0010;\u001a\u00020\u0005H\u0016J\u0019\u0010<\u001a\u0002092\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0011\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\f\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\u001a\u0010\u000f\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0017\"\u0004\b'\u0010\u0019R\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019R\u001a\u0010\u0014\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0017\"\u0004\b-\u0010\u0019R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u0010\r\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0017\"\u0004\b5\u0010\u0019¨\u0006@"}, d2 = {"Lcom/heytap/databaseengine/model/wristtemperature/WristTemperatureStat;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "()V", "ssoid", "", "dataClient", "clientModel", "date", "", "timezone", "dayBaseLineWristTemperature", "confidence", "wristTemperature", "min", "max", DBWristTemperatureStat.SYMPTOMS, DBWristTemperatureStat.ACTIONS, "updateTimestamp", "", "syncStatus", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIIIIIIJI)V", "getActions", "()I", "setActions", "(I)V", "getClientModel", "()Ljava/lang/String;", "setClientModel", "(Ljava/lang/String;)V", "getConfidence", "setConfidence", "getDataClient", "setDataClient", "getDate", "setDate", "getDayBaseLineWristTemperature", "setDayBaseLineWristTemperature", "getMax", "setMax", "getMin", "setMin", "getSymptoms", "setSymptoms", "getSyncStatus", "setSyncStatus", "getTimezone", "setTimezone", "getUpdateTimestamp", "()J", "setUpdateTimestamp", "(J)V", "getWristTemperature", "setWristTemperature", "describeContents", "getSsoid", "setSsoid", "", "mSsoid", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WristTemperatureStat extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WristTemperatureStat> CREATOR = new a();
    private int actions;

    @Nullable
    private String clientModel;
    private int confidence;

    @Nullable
    private String dataClient;
    private int date;
    private int dayBaseLineWristTemperature;
    private int max;
    private int min;

    @NotNull
    private String ssoid;
    private int symptoms;
    private int syncStatus;

    @NotNull
    private String timezone;
    private long updateTimestamp;
    private int wristTemperature;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WristTemperatureStat> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WristTemperatureStat createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WristTemperatureStat(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final WristTemperatureStat[] newArray(int i) {
            return new WristTemperatureStat[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WristTemperatureStat(String str, String str2, String str3, int i, String str4, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        String strR;
        String str5 = (i10 & 1) != 0 ? "" : str;
        String str6 = (i10 & 2) != 0 ? null : str2;
        String str7 = (i10 & 4) != 0 ? null : str3;
        int i11 = (i10 & 8) != 0 ? 0 : i;
        if ((i10 & 16) != 0) {
            strR = v05.r(null);
            Intrinsics.checkNotNullExpressionValue(strR, "getTimeZone(null)");
        } else {
            strR = str4;
        }
        this(str5, str6, str7, i11, strR, (i10 & 32) != 0 ? 0 : i2, (i10 & 64) != 0 ? 0 : i3, (i10 & 128) != 0 ? 0 : i4, (i10 & 256) != 0 ? 0 : i5, (i10 & 512) != 0 ? 0 : i6, (i10 & 1024) != 0 ? 0 : i7, (i10 & 2048) != 0 ? 0 : i8, (i10 & 4096) != 0 ? 0L : j2, (i10 & 8192) == 0 ? i9 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getActions() {
        return this.actions;
    }

    @Nullable
    public final String getClientModel() {
        return this.clientModel;
    }

    public final int getConfidence() {
        return this.confidence;
    }

    @Nullable
    public final String getDataClient() {
        return this.dataClient;
    }

    public final int getDate() {
        return this.date;
    }

    public final int getDayBaseLineWristTemperature() {
        return this.dayBaseLineWristTemperature;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public final int getSymptoms() {
        return this.symptoms;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    @NotNull
    public final String getTimezone() {
        return this.timezone;
    }

    public final long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public final int getWristTemperature() {
        return this.wristTemperature;
    }

    public final void setActions(int i) {
        this.actions = i;
    }

    public final void setClientModel(@Nullable String str) {
        this.clientModel = str;
    }

    public final void setConfidence(int i) {
        this.confidence = i;
    }

    public final void setDataClient(@Nullable String str) {
        this.dataClient = str;
    }

    public final void setDate(int i) {
        this.date = i;
    }

    public final void setDayBaseLineWristTemperature(int i) {
        this.dayBaseLineWristTemperature = i;
    }

    public final void setMax(int i) {
        this.max = i;
    }

    public final void setMin(int i) {
        this.min = i;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setSymptoms(int i) {
        this.symptoms = i;
    }

    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public final void setTimezone(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.timezone = str;
    }

    public final void setUpdateTimestamp(long j2) {
        this.updateTimestamp = j2;
    }

    public final void setWristTemperature(int i) {
        this.wristTemperature = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "WristTemperatureStat(ssoid='" + this.ssoid + "', clientModel=" + this.clientModel + ", date=" + this.date + ", timezone='" + this.timezone + "', dayBaseLineWristTemperature=" + this.dayBaseLineWristTemperature + ", confidence=" + this.confidence + ", wristTemperature=" + this.wristTemperature + ", min=" + this.min + ", max=" + this.max + ", symptoms=" + this.symptoms + ", actions=" + this.actions + ", updateTimestamp=" + this.updateTimestamp + ", syncStatus=" + this.syncStatus + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.dataClient);
        parcel.writeString(this.clientModel);
        parcel.writeInt(this.date);
        parcel.writeString(this.timezone);
        parcel.writeInt(this.dayBaseLineWristTemperature);
        parcel.writeInt(this.confidence);
        parcel.writeInt(this.wristTemperature);
        parcel.writeInt(this.min);
        parcel.writeInt(this.max);
        parcel.writeInt(this.symptoms);
        parcel.writeInt(this.actions);
        parcel.writeLong(this.updateTimestamp);
        parcel.writeInt(this.syncStatus);
    }

    public WristTemperatureStat(@NotNull String ssoid, @Nullable String str, @Nullable String str2, int i, @NotNull String timezone, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        this.ssoid = ssoid;
        this.dataClient = str;
        this.clientModel = str2;
        this.date = i;
        this.timezone = timezone;
        this.dayBaseLineWristTemperature = i2;
        this.confidence = i3;
        this.wristTemperature = i4;
        this.min = i5;
        this.max = i6;
        this.symptoms = i7;
        this.actions = i8;
        this.updateTimestamp = j2;
        this.syncStatus = i9;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WristTemperatureStat() {
        String strR = v05.r(null);
        Intrinsics.checkNotNullExpressionValue(strR, "getTimeZone(null)");
        this("", "", null, 0, strR, 0, 0, 0, 0, 0, 0, 0, 0L, 0);
    }
}
