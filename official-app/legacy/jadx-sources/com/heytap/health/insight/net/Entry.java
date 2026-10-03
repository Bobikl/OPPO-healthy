package com.heytap.health.insight.net;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/insight/net/Entry;", "", "color", "", "x", "", "y", "ys", "", "Lcom/heytap/health/insight/net/StackValues;", "(JFFLjava/util/List;)V", "getColor", "()J", "getX", "()F", "getY", "getYs", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "health_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Entry {
    private final long color;
    private final float x;
    private final float y;

    @Nullable
    private final List<StackValues> ys;

    public Entry(long j2, float f, float f2, @Nullable List<StackValues> list) {
        this.color = j2;
        this.x = f;
        this.y = f2;
        this.ys = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Entry copy$default(Entry entry, long j2, float f, float f2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j2 = entry.color;
        }
        long j3 = j2;
        if ((i & 2) != 0) {
            f = entry.x;
        }
        float f3 = f;
        if ((i & 4) != 0) {
            f2 = entry.y;
        }
        float f4 = f2;
        if ((i & 8) != 0) {
            list = entry.ys;
        }
        return entry.copy(j3, f3, f4, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getY() {
        return this.y;
    }

    @Nullable
    public final List<StackValues> component4() {
        return this.ys;
    }

    @NotNull
    public final Entry copy(long color, float x, float y, @Nullable List<StackValues> ys) {
        return new Entry(color, x, y, ys);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) other;
        return this.color == entry.color && Float.compare(this.x, entry.x) == 0 && Float.compare(this.y, entry.y) == 0 && Intrinsics.areEqual(this.ys, entry.ys);
    }

    public final long getColor() {
        return this.color;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    @Nullable
    public final List<StackValues> getYs() {
        return this.ys;
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.color) * 31) + Float.hashCode(this.x)) * 31) + Float.hashCode(this.y)) * 31;
        List<StackValues> list = this.ys;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "Entry(color=" + this.color + ", x=" + this.x + ", y=" + this.y + ", ys=" + this.ys + ")";
    }
}
