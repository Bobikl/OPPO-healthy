package com.heytap.health.health.insight;

import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/health/insight/Zone;", "", "color", "", "from", "", TypedValues.TransitionType.S_TO, "(JFF)V", "getColor", "()J", "getFrom", "()F", "getTo", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "health_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Zone {
    private final long color;
    private final float from;
    private final float to;

    public Zone(long j2, float f, float f2) {
        this.color = j2;
        this.from = f;
        this.to = f2;
    }

    public static /* synthetic */ Zone copy$default(Zone zone, long j2, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            j2 = zone.color;
        }
        if ((i & 2) != 0) {
            f = zone.from;
        }
        if ((i & 4) != 0) {
            f2 = zone.to;
        }
        return zone.copy(j2, f, f2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getFrom() {
        return this.from;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getTo() {
        return this.to;
    }

    @NotNull
    public final Zone copy(long color, float from, float to) {
        return new Zone(color, from, to);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Zone)) {
            return false;
        }
        Zone zone = (Zone) other;
        return this.color == zone.color && Float.compare(this.from, zone.from) == 0 && Float.compare(this.to, zone.to) == 0;
    }

    public final long getColor() {
        return this.color;
    }

    public final float getFrom() {
        return this.from;
    }

    public final float getTo() {
        return this.to;
    }

    public int hashCode() {
        return (((Long.hashCode(this.color) * 31) + Float.hashCode(this.from)) * 31) + Float.hashCode(this.to);
    }

    @NotNull
    public String toString() {
        return "Zone(color=" + this.color + ", from=" + this.from + ", to=" + this.to + ")";
    }
}
