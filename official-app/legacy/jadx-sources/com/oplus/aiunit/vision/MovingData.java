package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.s4c, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0001\u000eBY\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b-\u0010.J\b\u0010\u0003\u001a\u00020\u0002H\u0016J[\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\t\u0010\u000f\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b\"\u0010\u0017R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010)\u001a\u0004\b#\u0010*\"\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/oplus/aiunit/vision/s4c;", "", "", "toString", "step", "calorie", "distance", "duration", "speed", "avgSpeed", "", "progress", "", "gpsPower", "a", "hashCode", "other", "", "equals", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "r", "(Ljava/lang/String;)V", "b", "d", LogFieldKey.LEVEL_KEY, "c", MapSchema.FIELD_NAME_ENTRY, LogFieldKey.MESSAGE_KEY, "f", "n", "i", "q", MapSchema.FIELD_NAME_KEY, b2n.f, "D", b2n.g, "()D", LogFieldKey.PROCESS_NAME_KEY, "(D)V", "I", "()I", "o", "(I)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DI)V", "Companion", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class MovingData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public String step;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public String calorie;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public String distance;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public String duration;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public String speed;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    public String avgSpeed;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    public double progress;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    public int gpsPower;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.s4c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/s4c$a;", "", "", "seconds", "c", "", "kcal", "a", "km", "b", "kmH", MapSchema.FIELD_NAME_ENTRY, "d", "step", "f", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final double a(double kcal) {
            return RangesKt___RangesKt.coerceAtMost(RangesKt___RangesKt.coerceAtLeast(kcal, 0.0d), 99999.0d);
        }

        public final double b(double km) {
            return RangesKt___RangesKt.coerceAtMost(RangesKt___RangesKt.coerceAtLeast(km, 0.0d), 999.99d);
        }

        public final int c(int seconds) {
            return RangesKt___RangesKt.coerceAtMost(RangesKt___RangesKt.coerceAtLeast(seconds, 0), 359999);
        }

        public final int d(int seconds) {
            if (seconds <= 0) {
                return 0;
            }
            return RangesKt___RangesKt.coerceAtMost(RangesKt___RangesKt.coerceAtLeast(seconds, 120), 3000);
        }

        public final double e(double kmH) {
            return RangesKt___RangesKt.coerceAtMost(RangesKt___RangesKt.coerceAtLeast(kmH, 0.0d), 99.9d);
        }

        public final int f(int step) {
            return RangesKt___RangesKt.coerceAtMost(RangesKt___RangesKt.coerceAtLeast(step, 0), 99999);
        }
    }

    public MovingData() {
        this(null, null, null, null, null, null, 0.0d, 0, 255, null);
    }

    @NotNull
    public final MovingData a(@NotNull String step, @NotNull String calorie, @Nullable String distance, @NotNull String duration, @NotNull String speed, @NotNull String avgSpeed, double progress, int gpsPower) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(calorie, "calorie");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(speed, "speed");
        Intrinsics.checkNotNullParameter(avgSpeed, "avgSpeed");
        return new MovingData(step, calorie, distance, duration, speed, avgSpeed, progress, gpsPower);
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAvgSpeed() {
        return this.avgSpeed;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCalorie() {
        return this.calorie;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDistance() {
        return this.distance;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MovingData)) {
            return false;
        }
        MovingData movingData = (MovingData) other;
        return Intrinsics.areEqual(this.step, movingData.step) && Intrinsics.areEqual(this.calorie, movingData.calorie) && Intrinsics.areEqual(this.distance, movingData.distance) && Intrinsics.areEqual(this.duration, movingData.duration) && Intrinsics.areEqual(this.speed, movingData.speed) && Intrinsics.areEqual(this.avgSpeed, movingData.avgSpeed) && Double.compare(this.progress, movingData.progress) == 0 && this.gpsPower == movingData.gpsPower;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getGpsPower() {
        return this.gpsPower;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final double getProgress() {
        return this.progress;
    }

    public int hashCode() {
        int iHashCode = ((this.step.hashCode() * 31) + this.calorie.hashCode()) * 31;
        String str = this.distance;
        return ((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.duration.hashCode()) * 31) + this.speed.hashCode()) * 31) + this.avgSpeed.hashCode()) * 31) + Double.hashCode(this.progress)) * 31) + Integer.hashCode(this.gpsPower);
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSpeed() {
        return this.speed;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getStep() {
        return this.step;
    }

    public final void k(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.avgSpeed = str;
    }

    public final void l(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.calorie = str;
    }

    public final void m(@Nullable String str) {
        this.distance = str;
    }

    public final void n(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.duration = str;
    }

    public final void o(int i) {
        this.gpsPower = i;
    }

    public final void p(double d) {
        this.progress = d;
    }

    public final void q(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.speed = str;
    }

    public final void r(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.step = str;
    }

    @NotNull
    public String toString() {
        return "MovingData(step=" + this.step + ", calorie=" + this.calorie + ", distance=" + this.distance + ", duration=" + this.duration + ", speed=" + this.speed + ", avgSpeed=" + this.avgSpeed + ", progress=" + this.progress + ", gpsPower=" + this.gpsPower + ")";
    }

    public MovingData(@NotNull String step, @NotNull String calorie, @Nullable String str, @NotNull String duration, @NotNull String speed, @NotNull String avgSpeed, double d, int i) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(calorie, "calorie");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(speed, "speed");
        Intrinsics.checkNotNullParameter(avgSpeed, "avgSpeed");
        this.step = step;
        this.calorie = calorie;
        this.distance = str;
        this.duration = duration;
        this.speed = speed;
        this.avgSpeed = avgSpeed;
        this.progress = d;
        this.gpsPower = i;
    }

    public /* synthetic */ MovingData(String str, String str2, String str3, String str4, String str5, String str6, double d, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "0" : str, (i2 & 2) != 0 ? "0" : str2, (i2 & 4) != 0 ? "0.00" : str3, (i2 & 8) != 0 ? "00:00" : str4, (i2 & 16) != 0 ? "--'--\"" : str5, (i2 & 32) != 0 ? "--'--\"" : str6, (i2 & 64) != 0 ? -1.0d : d, (i2 & 128) != 0 ? -1 : i);
    }
}
