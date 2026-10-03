package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.g0c, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 JE\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014¨\u0006!"}, d2 = {"Lcom/oplus/aiunit/vision/g0c;", "", "", "startTime", "", "duration", "", "cal", "pace", "dis", "step", "a", "", "toString", "hashCode", "other", "", "equals", "J", b2n.f, "()J", "b", "I", MapSchema.FIELD_NAME_ENTRY, "()I", "c", "D", "()D", "d", "f", b2n.g, "<init>", "(JIDIDJ)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class MiniAppMovingData {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final long startTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int duration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final double cal;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final int pace;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final double dis;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public final long step;

    public MiniAppMovingData() {
        this(0L, 0, 0.0d, 0, 0.0d, 0L, 63, null);
    }

    @NotNull
    public final MiniAppMovingData a(long startTime, int duration, double cal, int pace, double dis, long step) {
        return new MiniAppMovingData(startTime, duration, cal, pace, dis, step);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getCal() {
        return this.cal;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getDis() {
        return this.dis;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiniAppMovingData)) {
            return false;
        }
        MiniAppMovingData miniAppMovingData = (MiniAppMovingData) other;
        return this.startTime == miniAppMovingData.startTime && this.duration == miniAppMovingData.duration && Double.compare(this.cal, miniAppMovingData.cal) == 0 && this.pace == miniAppMovingData.pace && Double.compare(this.dis, miniAppMovingData.dis) == 0 && this.step == miniAppMovingData.step;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getPace() {
        return this.pace;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getStep() {
        return this.step;
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.startTime) * 31) + Integer.hashCode(this.duration)) * 31) + Double.hashCode(this.cal)) * 31) + Integer.hashCode(this.pace)) * 31) + Double.hashCode(this.dis)) * 31) + Long.hashCode(this.step);
    }

    @NotNull
    public String toString() {
        return "MiniAppMovingData(startTime=" + this.startTime + ", duration=" + this.duration + ", cal=" + this.cal + ", pace=" + this.pace + ", dis=" + this.dis + ", step=" + this.step + ")";
    }

    public MiniAppMovingData(long j2, int i, double d, int i2, double d2, long j3) {
        this.startTime = j2;
        this.duration = i;
        this.cal = d;
        this.pace = i2;
        this.dis = d2;
        this.step = j3;
    }

    public /* synthetic */ MiniAppMovingData(long j2, int i, double d, int i2, double d2, long j3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j2, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0.0d : d, (i3 & 8) == 0 ? i2 : 0, (i3 & 16) == 0 ? d2 : 0.0d, (i3 & 32) == 0 ? j3 : 0L);
    }
}
