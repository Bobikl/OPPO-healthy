package com.heytap.health.core.provider.bean;

import androidx.annotation.Keep;
import com.heytap.store.apm.PageTrackBean;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u0012\n\u0002\b'\b\u0007\u0018\u00002\u00020\u0001B÷\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\b\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!¢\u0006\u0002\u0010\"J\b\u0010G\u001a\u00020\u0003H\u0016R\u0011\u0010\u0015\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0011\u0010\u0017\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u001c\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010)R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u001b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b2\u0010$R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0014\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b5\u0010$R\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b6\u0010$R\u0011\u0010\u001f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b7\u0010$R\u0011\u0010\u001e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b8\u0010$R\u0011\u0010\u0016\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b9\u0010$R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010)R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b;\u0010$R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b<\u00101R\u0011\u0010\u001a\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b=\u0010$R\u0011\u0010\u0018\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b>\u0010$R\u0011\u0010\u0019\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b?\u0010$R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010)R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010)\"\u0004\bB\u0010CR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010)R\u0011\u0010\u0013\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bE\u0010$R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bF\u00101¨\u0006H"}, d2 = {"Lcom/heytap/health/core/provider/bean/SportRecord;", "", "clientDataId", "", "startTimestamp", "", "endTimestamp", "sportType", "", "sportName", "totalDistance", "totalCalories", PageTrackBean.TOTAL_TIME, "avgHeartRate", "hrZone", "", "maxHeartRate", "avgPace", "avgSpeed", "totalSteps", "lap", "avgEllipticalFreq", "rowingTotalNum", "avgRowingFreq", "totalBadminton", "totalBatting", "tennisServe", "forehandCount", "backhandCount", "totalClimb", "ropeCount", "ropeAvgSpeed", "byteArray", "", "(Ljava/lang/String;JJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/util/List;IILjava/lang/String;IIIIIIIIIILjava/lang/String;II[B)V", "getAvgEllipticalFreq", "()I", "getAvgHeartRate", "getAvgPace", "getAvgRowingFreq", "getAvgSpeed", "()Ljava/lang/String;", "getBackhandCount", "getByteArray", "()[B", "setByteArray", "([B)V", "getClientDataId", "getEndTimestamp", "()J", "getForehandCount", "getHrZone", "()Ljava/util/List;", "getLap", "getMaxHeartRate", "getRopeAvgSpeed", "getRopeCount", "getRowingTotalNum", "getSportName", "getSportType", "getStartTimestamp", "getTennisServe", "getTotalBadminton", "getTotalBatting", "getTotalCalories", "getTotalClimb", "setTotalClimb", "(Ljava/lang/String;)V", "getTotalDistance", "getTotalSteps", "getTotalTime", "toString", "operations_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SportRecord {
    private final int avgEllipticalFreq;
    private final int avgHeartRate;
    private final int avgPace;
    private final int avgRowingFreq;

    @NotNull
    private final String avgSpeed;
    private final int backhandCount;

    @Nullable
    private byte[] byteArray;

    @NotNull
    private final String clientDataId;
    private final long endTimestamp;
    private final int forehandCount;

    @Nullable
    private final List<Integer> hrZone;
    private final int lap;
    private final int maxHeartRate;
    private final int ropeAvgSpeed;
    private final int ropeCount;
    private final int rowingTotalNum;

    @NotNull
    private final String sportName;
    private final int sportType;
    private final long startTimestamp;
    private final int tennisServe;
    private final int totalBadminton;
    private final int totalBatting;

    @NotNull
    private final String totalCalories;

    @Nullable
    private String totalClimb;

    @NotNull
    private final String totalDistance;
    private final int totalSteps;
    private final long totalTime;

    public SportRecord(@NotNull String clientDataId, long j2, long j3, int i, @NotNull String sportName, @NotNull String totalDistance, @NotNull String totalCalories, long j4, int i2, @Nullable List<Integer> list, int i3, int i4, @NotNull String avgSpeed, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, @Nullable String str, int i15, int i16, @Nullable byte[] bArr) {
        Intrinsics.checkNotNullParameter(clientDataId, "clientDataId");
        Intrinsics.checkNotNullParameter(sportName, "sportName");
        Intrinsics.checkNotNullParameter(totalDistance, "totalDistance");
        Intrinsics.checkNotNullParameter(totalCalories, "totalCalories");
        Intrinsics.checkNotNullParameter(avgSpeed, "avgSpeed");
        this.clientDataId = clientDataId;
        this.startTimestamp = j2;
        this.endTimestamp = j3;
        this.sportType = i;
        this.sportName = sportName;
        this.totalDistance = totalDistance;
        this.totalCalories = totalCalories;
        this.totalTime = j4;
        this.avgHeartRate = i2;
        this.hrZone = list;
        this.maxHeartRate = i3;
        this.avgPace = i4;
        this.avgSpeed = avgSpeed;
        this.totalSteps = i5;
        this.lap = i6;
        this.avgEllipticalFreq = i7;
        this.rowingTotalNum = i8;
        this.avgRowingFreq = i9;
        this.totalBadminton = i10;
        this.totalBatting = i11;
        this.tennisServe = i12;
        this.forehandCount = i13;
        this.backhandCount = i14;
        this.totalClimb = str;
        this.ropeCount = i15;
        this.ropeAvgSpeed = i16;
        this.byteArray = bArr;
    }

    public final int getAvgEllipticalFreq() {
        return this.avgEllipticalFreq;
    }

    public final int getAvgHeartRate() {
        return this.avgHeartRate;
    }

    public final int getAvgPace() {
        return this.avgPace;
    }

    public final int getAvgRowingFreq() {
        return this.avgRowingFreq;
    }

    @NotNull
    public final String getAvgSpeed() {
        return this.avgSpeed;
    }

    public final int getBackhandCount() {
        return this.backhandCount;
    }

    @Nullable
    public final byte[] getByteArray() {
        return this.byteArray;
    }

    @NotNull
    public final String getClientDataId() {
        return this.clientDataId;
    }

    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    public final int getForehandCount() {
        return this.forehandCount;
    }

    @Nullable
    public final List<Integer> getHrZone() {
        return this.hrZone;
    }

    public final int getLap() {
        return this.lap;
    }

    public final int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public final int getRopeAvgSpeed() {
        return this.ropeAvgSpeed;
    }

    public final int getRopeCount() {
        return this.ropeCount;
    }

    public final int getRowingTotalNum() {
        return this.rowingTotalNum;
    }

    @NotNull
    public final String getSportName() {
        return this.sportName;
    }

    public final int getSportType() {
        return this.sportType;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    public final int getTennisServe() {
        return this.tennisServe;
    }

    public final int getTotalBadminton() {
        return this.totalBadminton;
    }

    public final int getTotalBatting() {
        return this.totalBatting;
    }

    @NotNull
    public final String getTotalCalories() {
        return this.totalCalories;
    }

    @Nullable
    public final String getTotalClimb() {
        return this.totalClimb;
    }

    @NotNull
    public final String getTotalDistance() {
        return this.totalDistance;
    }

    public final int getTotalSteps() {
        return this.totalSteps;
    }

    public final long getTotalTime() {
        return this.totalTime;
    }

    public final void setByteArray(@Nullable byte[] bArr) {
        this.byteArray = bArr;
    }

    public final void setTotalClimb(@Nullable String str) {
        this.totalClimb = str;
    }

    @NotNull
    public String toString() {
        String str = this.clientDataId;
        long j2 = this.startTimestamp;
        long j3 = this.endTimestamp;
        int i = this.sportType;
        String str2 = this.sportName;
        String str3 = this.totalDistance;
        String str4 = this.totalCalories;
        long j4 = this.totalTime;
        int i2 = this.avgHeartRate;
        List<Integer> list = this.hrZone;
        int i3 = this.maxHeartRate;
        int i4 = this.avgPace;
        String str5 = this.avgSpeed;
        int i5 = this.totalSteps;
        int i6 = this.lap;
        int i7 = this.avgEllipticalFreq;
        int i8 = this.rowingTotalNum;
        int i9 = this.avgRowingFreq;
        int i10 = this.totalBadminton;
        int i11 = this.totalBatting;
        int i12 = this.tennisServe;
        int i13 = this.forehandCount;
        int i14 = this.backhandCount;
        String str6 = this.totalClimb;
        int i15 = this.ropeCount;
        int i16 = this.ropeAvgSpeed;
        byte[] bArr = this.byteArray;
        return "SportRecord(clientDataId='" + str + "', startTimestamp=" + j2 + ", endTimestamp=" + j3 + ", sportType=" + i + ", sportName='" + str2 + "', totalDistance='" + str3 + "', totalCalories='" + str4 + "', totalTime=" + j4 + ", avgHeartRate=" + i2 + ", hrZone=" + list + ", maxHeartRate=" + i3 + ", avgPace=" + i4 + ", avgSpeed='" + str5 + "', totalSteps=" + i5 + ", lap=" + i6 + ", avgEllipticalFreq=" + i7 + ", rowingTotalNum=" + i8 + ", avgRowingFreq=" + i9 + ", totalBadminton=" + i10 + ", totalBatting=" + i11 + ", tennisServe=" + i12 + ", forehandCount=" + i13 + ", backhandCount=" + i14 + ", totalClimb=" + str6 + ", ropeCount=" + i15 + ", ropeAvgSpeed=" + i16 + ", byteArray=" + (bArr != null ? Integer.valueOf(bArr.length) : null) + ")";
    }

    public /* synthetic */ SportRecord(String str, long j2, long j3, int i, String str2, String str3, String str4, long j4, int i2, List list, int i3, int i4, String str5, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, String str6, int i15, int i16, byte[] bArr, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j2, j3, i, str2, str3, str4, j4, i2, list, i3, i4, str5, i5, i6, i7, i8, i9, i10, i11, (i17 & 1048576) != 0 ? 0 : i12, (i17 & 2097152) != 0 ? 0 : i13, (i17 & 4194304) != 0 ? 0 : i14, (i17 & 8388608) != 0 ? null : str6, (i17 & 16777216) != 0 ? 0 : i15, (i17 & 33554432) != 0 ? 0 : i16, (i17 & 67108864) != 0 ? null : bArr);
    }
}
