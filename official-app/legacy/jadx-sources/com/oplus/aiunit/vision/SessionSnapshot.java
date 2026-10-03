package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.zvg, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0019\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u0015\u0012\u0006\u0010\u001d\u001a\u00020\u0004\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\"0!¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0017\u0010\u0019\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0017\u0010\u001b\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006)"}, d2 = {"Lcom/oplus/aiunit/vision/zvg;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "D", "b", "()D", "distance", "I", b2n.f, "()I", "stepCount", "c", "calorie", "", "d", "J", "()J", "duration", MapSchema.FIELD_NAME_ENTRY, "lastUpdateTs", "f", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "Ljava/lang/String;", "()Ljava/lang/String;", "sessionId", "", "Lcom/oplus/aiunit/vision/r6k;", b2n.g, "Ljava/util/List;", "()Ljava/util/List;", "track", "<init>", "(DIDJJILjava/lang/String;Ljava/util/List;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SessionSnapshot {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final double distance;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int stepCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final double calorie;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final long duration;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final long lastUpdateTs;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public final int sportMode;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    public final String sessionId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<TrackPoint> track;

    public SessionSnapshot(double d, int i, double d2, long j2, long j3, int i2, @NotNull String sessionId, @NotNull List<TrackPoint> track) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(track, "track");
        this.distance = d;
        this.stepCount = i;
        this.calorie = d2;
        this.duration = j2;
        this.lastUpdateTs = j3;
        this.sportMode = i2;
        this.sessionId = sessionId;
        this.track = track;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getCalorie() {
        return this.calorie;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getLastUpdateTs() {
        return this.lastUpdateTs;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionSnapshot)) {
            return false;
        }
        SessionSnapshot sessionSnapshot = (SessionSnapshot) other;
        return Double.compare(this.distance, sessionSnapshot.distance) == 0 && this.stepCount == sessionSnapshot.stepCount && Double.compare(this.calorie, sessionSnapshot.calorie) == 0 && this.duration == sessionSnapshot.duration && this.lastUpdateTs == sessionSnapshot.lastUpdateTs && this.sportMode == sessionSnapshot.sportMode && Intrinsics.areEqual(this.sessionId, sessionSnapshot.sessionId) && Intrinsics.areEqual(this.track, sessionSnapshot.track);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getSportMode() {
        return this.sportMode;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getStepCount() {
        return this.stepCount;
    }

    @NotNull
    public final List<TrackPoint> h() {
        return this.track;
    }

    public int hashCode() {
        return (((((((((((((Double.hashCode(this.distance) * 31) + Integer.hashCode(this.stepCount)) * 31) + Double.hashCode(this.calorie)) * 31) + Long.hashCode(this.duration)) * 31) + Long.hashCode(this.lastUpdateTs)) * 31) + Integer.hashCode(this.sportMode)) * 31) + this.sessionId.hashCode()) * 31) + this.track.hashCode();
    }

    @NotNull
    public String toString() {
        return "SessionSnapshot(distance=" + this.distance + ", stepCount=" + this.stepCount + ", calorie=" + this.calorie + ", duration=" + this.duration + ", lastUpdateTs=" + this.lastUpdateTs + ", sportMode=" + this.sportMode + ", sessionId=" + this.sessionId + ", track=" + this.track + ")";
    }
}
