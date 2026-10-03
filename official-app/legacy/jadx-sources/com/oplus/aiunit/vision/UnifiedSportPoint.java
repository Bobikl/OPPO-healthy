package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.core.widget.charts.RecordCombinedLineChart;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.kik, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\bD\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b_\u0010`J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001c\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R$\u0010#\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\n\u0010 \"\u0004\b!\u0010\"R$\u0010*\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010-\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010%\u001a\u0004\b\u001e\u0010'\"\u0004\b,\u0010)R$\u00101\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010%\u001a\u0004\b/\u0010'\"\u0004\b0\u0010)R$\u00105\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u001f\u001a\u0004\b3\u0010 \"\u0004\b4\u0010\"R$\u00107\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001f\u001a\u0004\b+\u0010 \"\u0004\b6\u0010\"R$\u0010:\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010%\u001a\u0004\b8\u0010'\"\u0004\b9\u0010)R$\u0010=\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010%\u001a\u0004\b;\u0010'\"\u0004\b<\u0010)R$\u0010@\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001f\u001a\u0004\b>\u0010 \"\u0004\b?\u0010\"R$\u0010D\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010%\u001a\u0004\bB\u0010'\"\u0004\bC\u0010)R$\u0010H\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010%\u001a\u0004\bF\u0010'\"\u0004\bG\u0010)R$\u0010L\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010%\u001a\u0004\bJ\u0010'\"\u0004\bK\u0010)R$\u0010N\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010%\u001a\u0004\bE\u0010'\"\u0004\bM\u0010)R$\u0010P\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010%\u001a\u0004\b\u0012\u0010'\"\u0004\bO\u0010)R$\u0010Q\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010%\u001a\u0004\bA\u0010'\"\u0004\b\u000b\u0010)R$\u0010S\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010%\u001a\u0004\b.\u0010'\"\u0004\bR\u0010)R$\u0010U\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010\u001f\u001a\u0004\b2\u0010 \"\u0004\bT\u0010\"R$\u0010Z\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010V\u001a\u0004\bI\u0010W\"\u0004\bX\u0010YR$\u0010\\\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010%\u001a\u0004\b\u0019\u0010'\"\u0004\b[\u0010)R$\u0010^\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010V\u001a\u0004\b$\u0010W\"\u0004\b]\u0010Y¨\u0006a"}, d2 = {"Lcom/oplus/aiunit/vision/kik;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "u", "()J", "R", "(J)V", "timestamp", "", "b", "Ljava/lang/Double;", "j", "()Ljava/lang/Double;", "G", "(Ljava/lang/Double;)V", "latitude", "c", MapSchema.FIELD_NAME_KEY, "H", "longitude", "", "d", "Ljava/lang/Float;", "()Ljava/lang/Float;", "x", "(Ljava/lang/Float;)V", "altitude", MapSchema.FIELD_NAME_ENTRY, "Ljava/lang/Integer;", "i", "()Ljava/lang/Integer;", UserInfo.SEX_FEMALE, "(Ljava/lang/Integer;)V", RecordCombinedLineChart.KEY_HEART_RATE, "f", "A", "cadence", b2n.f, LogFieldKey.LEVEL_KEY, "I", "pace", b2n.g, LogFieldKey.PROCESS_NAME_KEY, "M", "speed", "C", "distance", "s", SecureGcmConstants.MESSAGE_KEY, "state", "r", "O", "stanceTime", "v", "S", "verticalOscillation", LogFieldKey.MESSAGE_KEY, "q", "N", "stanceBalance", "n", "w", ExifInterface.GPS_DIRECTION_TRUE, "verticalRatio", "o", "t", "Q", "stride", "K", "runningPower", "y", "badmintonFreq", "rowingFreq", "D", "ellipticalFreq", ExifInterface.LONGITUDE_EAST, "fatBurningRate", "Ljava/lang/String;", "()Ljava/lang/String;", "L", "(Ljava/lang/String;)V", "sensorState", "z", "bikeCadence", c8l.KEY_B, "cadenceSensor", "<init>", "(JLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class UnifiedSportPoint {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public Double latitude;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public Double longitude;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public Float altitude;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public Integer heartRate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public Integer cadence;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    public Integer pace;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    public Float speed;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    public Float distance;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public Integer state;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    public Integer stanceTime;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public Float verticalOscillation;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @Nullable
    public Integer stanceBalance;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public Integer verticalRatio;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    @Nullable
    public Integer stride;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    @Nullable
    public Integer runningPower;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
    @Nullable
    public Integer badmintonFreq;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata and from toString */
    @Nullable
    public Integer rowingFreq;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata and from toString */
    @Nullable
    public Integer ellipticalFreq;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata and from toString */
    @Nullable
    public Float fatBurningRate;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata and from toString */
    @Nullable
    public String sensorState;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata and from toString */
    @Nullable
    public Integer bikeCadence;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata and from toString */
    @Nullable
    public String cadenceSensor;

    public UnifiedSportPoint() {
        this(0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388607, null);
    }

    public final void A(@Nullable Integer num) {
        this.cadence = num;
    }

    public final void B(@Nullable String str) {
        this.cadenceSensor = str;
    }

    public final void C(@Nullable Float f) {
        this.distance = f;
    }

    public final void D(@Nullable Integer num) {
        this.ellipticalFreq = num;
    }

    public final void E(@Nullable Float f) {
        this.fatBurningRate = f;
    }

    public final void F(@Nullable Integer num) {
        this.heartRate = num;
    }

    public final void G(@Nullable Double d) {
        this.latitude = d;
    }

    public final void H(@Nullable Double d) {
        this.longitude = d;
    }

    public final void I(@Nullable Integer num) {
        this.pace = num;
    }

    public final void J(@Nullable Integer num) {
        this.rowingFreq = num;
    }

    public final void K(@Nullable Integer num) {
        this.runningPower = num;
    }

    public final void L(@Nullable String str) {
        this.sensorState = str;
    }

    public final void M(@Nullable Float f) {
        this.speed = f;
    }

    public final void N(@Nullable Integer num) {
        this.stanceBalance = num;
    }

    public final void O(@Nullable Integer num) {
        this.stanceTime = num;
    }

    public final void P(@Nullable Integer num) {
        this.state = num;
    }

    public final void Q(@Nullable Integer num) {
        this.stride = num;
    }

    public final void R(long j2) {
        this.timestamp = j2;
    }

    public final void S(@Nullable Float f) {
        this.verticalOscillation = f;
    }

    public final void T(@Nullable Integer num) {
        this.verticalRatio = num;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Float getAltitude() {
        return this.altitude;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getBadmintonFreq() {
        return this.badmintonFreq;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getBikeCadence() {
        return this.bikeCadence;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getCadence() {
        return this.cadence;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCadenceSensor() {
        return this.cadenceSensor;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifiedSportPoint)) {
            return false;
        }
        UnifiedSportPoint unifiedSportPoint = (UnifiedSportPoint) other;
        return this.timestamp == unifiedSportPoint.timestamp && Intrinsics.areEqual((Object) this.latitude, (Object) unifiedSportPoint.latitude) && Intrinsics.areEqual((Object) this.longitude, (Object) unifiedSportPoint.longitude) && Intrinsics.areEqual((Object) this.altitude, (Object) unifiedSportPoint.altitude) && Intrinsics.areEqual(this.heartRate, unifiedSportPoint.heartRate) && Intrinsics.areEqual(this.cadence, unifiedSportPoint.cadence) && Intrinsics.areEqual(this.pace, unifiedSportPoint.pace) && Intrinsics.areEqual((Object) this.speed, (Object) unifiedSportPoint.speed) && Intrinsics.areEqual((Object) this.distance, (Object) unifiedSportPoint.distance) && Intrinsics.areEqual(this.state, unifiedSportPoint.state) && Intrinsics.areEqual(this.stanceTime, unifiedSportPoint.stanceTime) && Intrinsics.areEqual((Object) this.verticalOscillation, (Object) unifiedSportPoint.verticalOscillation) && Intrinsics.areEqual(this.stanceBalance, unifiedSportPoint.stanceBalance) && Intrinsics.areEqual(this.verticalRatio, unifiedSportPoint.verticalRatio) && Intrinsics.areEqual(this.stride, unifiedSportPoint.stride) && Intrinsics.areEqual(this.runningPower, unifiedSportPoint.runningPower) && Intrinsics.areEqual(this.badmintonFreq, unifiedSportPoint.badmintonFreq) && Intrinsics.areEqual(this.rowingFreq, unifiedSportPoint.rowingFreq) && Intrinsics.areEqual(this.ellipticalFreq, unifiedSportPoint.ellipticalFreq) && Intrinsics.areEqual((Object) this.fatBurningRate, (Object) unifiedSportPoint.fatBurningRate) && Intrinsics.areEqual(this.sensorState, unifiedSportPoint.sensorState) && Intrinsics.areEqual(this.bikeCadence, unifiedSportPoint.bikeCadence) && Intrinsics.areEqual(this.cadenceSensor, unifiedSportPoint.cadenceSensor);
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Float getDistance() {
        return this.distance;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getEllipticalFreq() {
        return this.ellipticalFreq;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Float getFatBurningRate() {
        return this.fatBurningRate;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.timestamp) * 31;
        Double d = this.latitude;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.longitude;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Float f = this.altitude;
        int iHashCode4 = (iHashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.heartRate;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.cadence;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.pace;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f2 = this.speed;
        int iHashCode8 = (iHashCode7 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.distance;
        int iHashCode9 = (iHashCode8 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Integer num4 = this.state;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.stanceTime;
        int iHashCode11 = (iHashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Float f4 = this.verticalOscillation;
        int iHashCode12 = (iHashCode11 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Integer num6 = this.stanceBalance;
        int iHashCode13 = (iHashCode12 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.verticalRatio;
        int iHashCode14 = (iHashCode13 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.stride;
        int iHashCode15 = (iHashCode14 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.runningPower;
        int iHashCode16 = (iHashCode15 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.badmintonFreq;
        int iHashCode17 = (iHashCode16 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.rowingFreq;
        int iHashCode18 = (iHashCode17 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.ellipticalFreq;
        int iHashCode19 = (iHashCode18 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Float f5 = this.fatBurningRate;
        int iHashCode20 = (iHashCode19 + (f5 == null ? 0 : f5.hashCode())) * 31;
        String str = this.sensorState;
        int iHashCode21 = (iHashCode20 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num13 = this.bikeCadence;
        int iHashCode22 = (iHashCode21 + (num13 == null ? 0 : num13.hashCode())) * 31;
        String str2 = this.cadenceSensor;
        return iHashCode22 + (str2 != null ? str2.hashCode() : 0);
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getHeartRate() {
        return this.heartRate;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final Double getLatitude() {
        return this.latitude;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final Double getLongitude() {
        return this.longitude;
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public final Integer getPace() {
        return this.pace;
    }

    @Nullable
    /* JADX INFO: renamed from: m, reason: from getter */
    public final Integer getRowingFreq() {
        return this.rowingFreq;
    }

    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public final Integer getRunningPower() {
        return this.runningPower;
    }

    @Nullable
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getSensorState() {
        return this.sensorState;
    }

    @Nullable
    /* JADX INFO: renamed from: p, reason: from getter */
    public final Float getSpeed() {
        return this.speed;
    }

    @Nullable
    /* JADX INFO: renamed from: q, reason: from getter */
    public final Integer getStanceBalance() {
        return this.stanceBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: r, reason: from getter */
    public final Integer getStanceTime() {
        return this.stanceTime;
    }

    @Nullable
    /* JADX INFO: renamed from: s, reason: from getter */
    public final Integer getState() {
        return this.state;
    }

    @Nullable
    /* JADX INFO: renamed from: t, reason: from getter */
    public final Integer getStride() {
        return this.stride;
    }

    @NotNull
    public String toString() {
        return "UnifiedSportPoint(timestamp=" + this.timestamp + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", altitude=" + this.altitude + ", heartRate=" + this.heartRate + ", cadence=" + this.cadence + ", pace=" + this.pace + ", speed=" + this.speed + ", distance=" + this.distance + ", state=" + this.state + ", stanceTime=" + this.stanceTime + ", verticalOscillation=" + this.verticalOscillation + ", stanceBalance=" + this.stanceBalance + ", verticalRatio=" + this.verticalRatio + ", stride=" + this.stride + ", runningPower=" + this.runningPower + ", badmintonFreq=" + this.badmintonFreq + ", rowingFreq=" + this.rowingFreq + ", ellipticalFreq=" + this.ellipticalFreq + ", fatBurningRate=" + this.fatBurningRate + ", sensorState=" + this.sensorState + ", bikeCadence=" + this.bikeCadence + ", cadenceSensor=" + this.cadenceSensor + ")";
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: v, reason: from getter */
    public final Float getVerticalOscillation() {
        return this.verticalOscillation;
    }

    @Nullable
    /* JADX INFO: renamed from: w, reason: from getter */
    public final Integer getVerticalRatio() {
        return this.verticalRatio;
    }

    public final void x(@Nullable Float f) {
        this.altitude = f;
    }

    public final void y(@Nullable Integer num) {
        this.badmintonFreq = num;
    }

    public final void z(@Nullable Integer num) {
        this.bikeCadence = num;
    }

    public UnifiedSportPoint(long j2, @Nullable Double d, @Nullable Double d2, @Nullable Float f, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Float f2, @Nullable Float f3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Float f4, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Float f5, @Nullable String str, @Nullable Integer num13, @Nullable String str2) {
        this.timestamp = j2;
        this.latitude = d;
        this.longitude = d2;
        this.altitude = f;
        this.heartRate = num;
        this.cadence = num2;
        this.pace = num3;
        this.speed = f2;
        this.distance = f3;
        this.state = num4;
        this.stanceTime = num5;
        this.verticalOscillation = f4;
        this.stanceBalance = num6;
        this.verticalRatio = num7;
        this.stride = num8;
        this.runningPower = num9;
        this.badmintonFreq = num10;
        this.rowingFreq = num11;
        this.ellipticalFreq = num12;
        this.fatBurningRate = f5;
        this.sensorState = str;
        this.bikeCadence = num13;
        this.cadenceSensor = str2;
    }

    public /* synthetic */ UnifiedSportPoint(long j2, Double d, Double d2, Float f, Integer num, Integer num2, Integer num3, Float f2, Float f3, Integer num4, Integer num5, Float f4, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Float f5, String str, Integer num13, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j2, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : d2, (i & 8) != 0 ? null : f, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : num3, (i & 128) != 0 ? null : f2, (i & 256) != 0 ? null : f3, (i & 512) != 0 ? null : num4, (i & 1024) != 0 ? null : num5, (i & 2048) != 0 ? null : f4, (i & 4096) != 0 ? null : num6, (i & 8192) != 0 ? null : num7, (i & 16384) != 0 ? null : num8, (i & 32768) != 0 ? null : num9, (i & 65536) != 0 ? null : num10, (i & 131072) != 0 ? null : num11, (i & 262144) != 0 ? null : num12, (i & 524288) != 0 ? null : f5, (i & 1048576) != 0 ? null : str, (i & 2097152) != 0 ? null : num13, (i & 4194304) != 0 ? null : str2);
    }
}
