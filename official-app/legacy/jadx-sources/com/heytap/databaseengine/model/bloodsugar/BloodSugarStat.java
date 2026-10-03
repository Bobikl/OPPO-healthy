package com.heytap.databaseengine.model.bloodsugar;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.databaseengine.model.SportHealthData;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b5\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003BÉ\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t¢\u0006\u0002\u0010\u001aJ\t\u0010K\u001a\u00020\tHÖ\u0001J\b\u0010L\u001a\u00020\u0005H\u0016J\u000e\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\u0005J\b\u0010P\u001a\u00020\u0005H\u0016J\u0019\u0010Q\u001a\u00020N2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\tHÖ\u0001R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010\u0016\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010'\"\u0004\b/\u0010)R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u0010\u0015\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\b9\u00101\"\u0004\b:\u00103R\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00106\"\u0004\b<\u00108R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b=\u0010\u001c\"\u0004\b>\u0010\u001eR\u001e\u0010\r\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b?\u0010\u001c\"\u0004\b@\u0010\u001eR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\bA\u00101\"\u0004\bB\u00103R\u001a\u0010\u0013\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010'\"\u0004\bD\u0010)R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010'\"\u0004\bF\u0010)R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010!\"\u0004\bH\u0010#R\u001a\u0010\u000f\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010'\"\u0004\bJ\u0010)¨\u0006U"}, d2 = {"Lcom/heytap/databaseengine/model/bloodsugar/BloodSugarStat;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "()V", "ssoid", "", "dataClient", "clientModel", "date", "", "timezone", Element.ELEMENT_NAME_AVERAGE, "", "min", "max", "warningCounts", "highCounts", "normalCounts", "lowCounts", "normalPercent", "lowThreshold", "highThreshold", "goalAchieved", "deviceActiveTime", "", "syncStatus", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IDDIJI)V", "getAverage", "()Ljava/lang/Double;", "setAverage", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getClientModel", "()Ljava/lang/String;", "setClientModel", "(Ljava/lang/String;)V", "getDataClient", "setDataClient", "getDate", "()I", "setDate", "(I)V", "getDeviceActiveTime", "()J", "setDeviceActiveTime", "(J)V", "getGoalAchieved", "setGoalAchieved", "getHighCounts", "()Ljava/lang/Integer;", "setHighCounts", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getHighThreshold", "()D", "setHighThreshold", "(D)V", "getLowCounts", "setLowCounts", "getLowThreshold", "setLowThreshold", "getMax", "setMax", "getMin", "setMin", "getNormalCounts", "setNormalCounts", "getNormalPercent", "setNormalPercent", "getSyncStatus", "setSyncStatus", "getTimezone", "setTimezone", "getWarningCounts", "setWarningCounts", "describeContents", "getSsoid", "setSsoid", "", "mSsoid", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BloodSugarStat extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BloodSugarStat> CREATOR = new a();

    @Nullable
    private Double average;

    @Nullable
    private String clientModel;

    @Nullable
    private String dataClient;
    private int date;
    private long deviceActiveTime;
    private int goalAchieved;

    @Nullable
    private Integer highCounts;
    private double highThreshold;

    @Nullable
    private Integer lowCounts;
    private double lowThreshold;

    @Nullable
    private Double max;

    @Nullable
    private Double min;

    @Nullable
    private Integer normalCounts;
    private int normalPercent;

    @NotNull
    private String ssoid;
    private int syncStatus;

    @NotNull
    private String timezone;
    private int warningCounts;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BloodSugarStat> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BloodSugarStat createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BloodSugarStat(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readDouble(), parcel.readDouble(), parcel.readInt(), parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BloodSugarStat[] newArray(int i) {
            return new BloodSugarStat[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BloodSugarStat(String str, String str2, String str3, int i, String str4, Double d, Double d2, Double d3, int i2, Integer num, Integer num2, Integer num3, int i3, double d4, double d5, int i4, long j2, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        String strR;
        String str5 = (i6 & 1) != 0 ? "" : str;
        String str6 = (i6 & 2) != 0 ? null : str2;
        String str7 = (i6 & 4) != 0 ? null : str3;
        int i7 = (i6 & 8) != 0 ? 0 : i;
        if ((i6 & 16) != 0) {
            strR = v05.r(null);
            Intrinsics.checkNotNullExpressionValue(strR, "getTimeZone(null)");
        } else {
            strR = str4;
        }
        this(str5, str6, str7, i7, strR, (i6 & 32) != 0 ? null : d, (i6 & 64) != 0 ? null : d2, (i6 & 128) != 0 ? null : d3, (i6 & 256) != 0 ? 0 : i2, (i6 & 512) != 0 ? null : num, (i6 & 1024) != 0 ? null : num2, (i6 & 2048) == 0 ? num3 : null, (i6 & 4096) != 0 ? 0 : i3, (i6 & 8192) != 0 ? 0.0d : d4, (i6 & 16384) == 0 ? d5 : 0.0d, (32768 & i6) != 0 ? 0 : i4, (i6 & 65536) != 0 ? 0L : j2, (i6 & 131072) == 0 ? i5 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Double getAverage() {
        return this.average;
    }

    @Nullable
    public final String getClientModel() {
        return this.clientModel;
    }

    @Nullable
    public final String getDataClient() {
        return this.dataClient;
    }

    public final int getDate() {
        return this.date;
    }

    public final long getDeviceActiveTime() {
        return this.deviceActiveTime;
    }

    public final int getGoalAchieved() {
        return this.goalAchieved;
    }

    @Nullable
    public final Integer getHighCounts() {
        return this.highCounts;
    }

    public final double getHighThreshold() {
        return this.highThreshold;
    }

    @Nullable
    public final Integer getLowCounts() {
        return this.lowCounts;
    }

    public final double getLowThreshold() {
        return this.lowThreshold;
    }

    @Nullable
    public final Double getMax() {
        return this.max;
    }

    @Nullable
    public final Double getMin() {
        return this.min;
    }

    @Nullable
    public final Integer getNormalCounts() {
        return this.normalCounts;
    }

    public final int getNormalPercent() {
        return this.normalPercent;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    @NotNull
    public final String getTimezone() {
        return this.timezone;
    }

    public final int getWarningCounts() {
        return this.warningCounts;
    }

    public final void setAverage(@Nullable Double d) {
        this.average = d;
    }

    public final void setClientModel(@Nullable String str) {
        this.clientModel = str;
    }

    public final void setDataClient(@Nullable String str) {
        this.dataClient = str;
    }

    public final void setDate(int i) {
        this.date = i;
    }

    public final void setDeviceActiveTime(long j2) {
        this.deviceActiveTime = j2;
    }

    public final void setGoalAchieved(int i) {
        this.goalAchieved = i;
    }

    public final void setHighCounts(@Nullable Integer num) {
        this.highCounts = num;
    }

    public final void setHighThreshold(double d) {
        this.highThreshold = d;
    }

    public final void setLowCounts(@Nullable Integer num) {
        this.lowCounts = num;
    }

    public final void setLowThreshold(double d) {
        this.lowThreshold = d;
    }

    public final void setMax(@Nullable Double d) {
        this.max = d;
    }

    public final void setMin(@Nullable Double d) {
        this.min = d;
    }

    public final void setNormalCounts(@Nullable Integer num) {
        this.normalCounts = num;
    }

    public final void setNormalPercent(int i) {
        this.normalPercent = i;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public final void setTimezone(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.timezone = str;
    }

    public final void setWarningCounts(int i) {
        this.warningCounts = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "BloodSugarStat(ssoid='" + this.ssoid + "', dataClient=" + this.dataClient + ", clientModel=" + this.clientModel + ", date=" + this.date + ", timezone='" + this.timezone + "', average=" + this.average + ", min=" + this.min + ", max=" + this.max + ", warningCounts=" + this.warningCounts + ", highCounts=" + this.highCounts + ", normalCounts=" + this.normalCounts + ", lowCounts=" + this.lowCounts + ", normalPercent=" + this.normalPercent + ", lowThreshold=" + this.lowThreshold + ", highThreshold=" + this.highThreshold + ", goalAchieved=" + this.goalAchieved + ", deviceActiveTime=" + this.deviceActiveTime + ", syncStatus=" + this.syncStatus + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.dataClient);
        parcel.writeString(this.clientModel);
        parcel.writeInt(this.date);
        parcel.writeString(this.timezone);
        Double d = this.average;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.min;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        Double d3 = this.max;
        if (d3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d3.doubleValue());
        }
        parcel.writeInt(this.warningCounts);
        Integer num = this.highCounts;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.normalCounts;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.lowCounts;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeInt(this.normalPercent);
        parcel.writeDouble(this.lowThreshold);
        parcel.writeDouble(this.highThreshold);
        parcel.writeInt(this.goalAchieved);
        parcel.writeLong(this.deviceActiveTime);
        parcel.writeInt(this.syncStatus);
    }

    public BloodSugarStat(@NotNull String ssoid, @Nullable String str, @Nullable String str2, int i, @NotNull String timezone, @Nullable Double d, @Nullable Double d2, @Nullable Double d3, int i2, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, int i3, double d4, double d5, int i4, long j2, int i5) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        this.ssoid = ssoid;
        this.dataClient = str;
        this.clientModel = str2;
        this.date = i;
        this.timezone = timezone;
        this.average = d;
        this.min = d2;
        this.max = d3;
        this.warningCounts = i2;
        this.highCounts = num;
        this.normalCounts = num2;
        this.lowCounts = num3;
        this.normalPercent = i3;
        this.lowThreshold = d4;
        this.highThreshold = d5;
        this.goalAchieved = i4;
        this.deviceActiveTime = j2;
        this.syncStatus = i5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BloodSugarStat() {
        String strR = v05.r(null);
        Intrinsics.checkNotNullExpressionValue(strR, "getTimeZone(null)");
        this("", null, null, 0, strR, null, null, null, 0, 0, 0, 0, 0, 0.0d, 0.0d, 0, 0L, 0);
    }
}
