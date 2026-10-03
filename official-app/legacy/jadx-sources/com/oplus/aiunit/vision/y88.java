package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.record.details.bean.SportSummaryBean;
import io.protostuff.MapSchema;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\r\b\u0007\u0018\u0000 /2\u00020\u0001:\u0002\r\u000eB\u001f\u0012\u0006\u0010 \u001a\u00020\u0010\u0012\u0006\u0010\"\u001a\u00020\u0007\u0012\u0006\u0010%\u001a\u00020#¢\u0006\u0004\b-\u0010.J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007J\u0016\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007J\u0016\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007J\"\u0010\u0013\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u0007J\u0016\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010J\u0006\u0010\u0019\u001a\u00020\u0002J\u0006\u0010\u001a\u001a\u00020\u0002J\u001e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0010R\u0014\u0010 \u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010$R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010&R\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010&R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010)R\u0016\u0010+\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0016\u0010,\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001f¨\u00060"}, d2 = {"Lcom/oplus/aiunit/vision/y88;", "", "", "value", "", LogFieldKey.LEVEL_KEY, "j", "", "distance", SportSummaryBean.CALORIES, "duration", "Lcom/oplus/aiunit/vision/m88;", "c", "a", "b", "", "", "paceData", "currentDistance", b2n.f, "last1kmSec", "count", MapSchema.FIELD_NAME_KEY, MapSchema.FIELD_NAME_ENTRY, "f", "i", b2n.g, "currentDuration", "avgPace", "Lcom/oplus/aiunit/vision/y88$b;", "d", "I", "goalType", "D", "goalDoubleValue", "", "J", "goalLongValue", "Z", "flagGoalCompleted", "flagHalfGoalCompleted", "Ljava/util/Map;", "paceMap", "kmCount", "last1kmSeconds", "<init>", "(IDJ)V", "Companion", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class y88 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int goalType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final double goalDoubleValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long goalLongValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean flagGoalCompleted;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean flagHalfGoalCompleted;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Map<Integer, Integer> paceMap = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int kmCount;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int last1kmSeconds;
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.y88$b, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\n\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/y88$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "paceMap", "I", "()I", "bestPace", "<init>", "(Ljava/util/Map;I)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class FinalPaceResult {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final Map<Integer, Integer> paceMap;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final int bestPace;

        public FinalPaceResult(@NotNull Map<Integer, Integer> paceMap, int i) {
            Intrinsics.checkNotNullParameter(paceMap, "paceMap");
            this.paceMap = paceMap;
            this.bestPace = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getBestPace() {
            return this.bestPace;
        }

        @NotNull
        public final Map<Integer, Integer> b() {
            return this.paceMap;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FinalPaceResult)) {
                return false;
            }
            FinalPaceResult finalPaceResult = (FinalPaceResult) other;
            return Intrinsics.areEqual(this.paceMap, finalPaceResult.paceMap) && this.bestPace == finalPaceResult.bestPace;
        }

        public int hashCode() {
            return (this.paceMap.hashCode() * 31) + Integer.hashCode(this.bestPace);
        }

        @NotNull
        public String toString() {
            return "FinalPaceResult(paceMap=" + this.paceMap + ", bestPace=" + this.bestPace + ")";
        }
    }

    public y88(int i, double d, long j2) {
        this.goalType = i;
        this.goalDoubleValue = d;
        this.goalLongValue = j2;
    }

    @NotNull
    public final m88 a(double distance, double duration) {
        if (this.flagGoalCompleted || 2 != this.goalType) {
            return m88.d.INSTANCE;
        }
        if (!this.flagHalfGoalCompleted && ((int) duration) >= (this.goalLongValue * ((long) 60)) / ((long) 2)) {
            this.flagHalfGoalCompleted = true;
            return m88.b.INSTANCE;
        }
        if (duration < this.goalLongValue * ((long) 60)) {
            return m88.d.INSTANCE;
        }
        this.flagGoalCompleted = true;
        return new m88.Completed(distance, (int) duration);
    }

    @NotNull
    public final m88 b(double distance, double duration) {
        int i = this.kmCount;
        if (distance - ((double) i) < 1.0d) {
            return m88.d.INSTANCE;
        }
        int i2 = i == 0 ? (int) duration : (int) (duration - ((double) this.last1kmSeconds));
        int i3 = (int) duration;
        this.last1kmSeconds = i3;
        this.paceMap.put(Integer.valueOf(this.kmCount), Integer.valueOf(i2));
        int i4 = this.kmCount;
        int i5 = i4 + 1;
        this.kmCount = i4 + 1;
        double d = i5;
        double d2 = this.goalDoubleValue;
        if (!(d == d2 / ((double) 2))) {
            if (!(d == d2)) {
                return new m88.KmReached(i5, i3);
            }
        }
        return m88.d.INSTANCE;
    }

    @NotNull
    public final m88 c(double distance, double calories, double duration) {
        int i;
        if (this.flagGoalCompleted || -1 == (i = this.goalType)) {
            return m88.d.INSTANCE;
        }
        if (i == 0) {
            if (!this.flagHalfGoalCompleted && distance >= this.goalDoubleValue / ((double) 2)) {
                this.flagHalfGoalCompleted = true;
                return m88.b.INSTANCE;
            }
            if (distance < this.goalDoubleValue) {
                return m88.d.INSTANCE;
            }
            this.flagGoalCompleted = true;
            return new m88.Completed(distance, (int) duration);
        }
        if (i != 1) {
            return m88.d.INSTANCE;
        }
        if (!this.flagHalfGoalCompleted && calories >= this.goalDoubleValue / ((double) 2)) {
            this.flagHalfGoalCompleted = true;
            return m88.b.INSTANCE;
        }
        if (calories < this.goalDoubleValue) {
            return m88.d.INSTANCE;
        }
        this.flagGoalCompleted = true;
        return new m88.Completed(distance, (int) duration);
    }

    @NotNull
    public final FinalPaceResult d(double currentDistance, double currentDuration, int avgPace) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.paceMap);
        int iIntValue = 0;
        if (this.kmCount != 0) {
            double dDoubleValue = new BigDecimal(currentDistance).setScale(2, RoundingMode.DOWN).doubleValue();
            int i = this.kmCount;
            if (dDoubleValue - ((double) i) > 0.009d) {
                linkedHashMap.put(Integer.valueOf(this.kmCount), Integer.valueOf((int) Math.rint((currentDuration - ((double) this.last1kmSeconds)) / (dDoubleValue - ((double) i)))));
            }
        } else {
            linkedHashMap.put(0, Integer.valueOf(avgPace));
        }
        if (!linkedHashMap.isEmpty()) {
            Collection collectionValues = linkedHashMap.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "resultPaceMap.values");
            Object objM5738minOrThrow = CollectionsKt___CollectionsKt.m5738minOrThrow((Iterable<? extends Object>) collectionValues);
            Intrinsics.checkNotNullExpressionValue(objM5738minOrThrow, "resultPaceMap.values.min()");
            iIntValue = ((Number) objM5738minOrThrow).intValue();
        }
        return new FinalPaceResult(linkedHashMap, iIntValue);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getKmCount() {
        return this.kmCount;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getLast1kmSeconds() {
        return this.last1kmSeconds;
    }

    public final void g(@NotNull Map<Integer, Integer> paceData, double currentDistance) {
        Intrinsics.checkNotNullParameter(paceData, "paceData");
        if (new BigDecimal(currentDistance).setScale(2, RoundingMode.DOWN).doubleValue() % ((double) 1) > 0.0d) {
            this.kmCount = paceData.size() - 1;
            paceData.remove(Integer.valueOf(paceData.size() - 1));
        } else {
            this.kmCount = paceData.size();
        }
        this.paceMap.clear();
        this.paceMap.putAll(paceData);
        if (!this.paceMap.isEmpty()) {
            this.last1kmSeconds = 0;
            int size = this.paceMap.size();
            for (int i = 0; i < size; i++) {
                Integer num = this.paceMap.get(Integer.valueOf(i));
                if (num != null) {
                    this.last1kmSeconds += num.intValue();
                }
            }
        }
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getFlagGoalCompleted() {
        return this.flagGoalCompleted;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getFlagHalfGoalCompleted() {
        return this.flagHalfGoalCompleted;
    }

    public final void j(boolean value) {
        this.flagGoalCompleted = value;
    }

    public final void k(int last1kmSec, int count) {
        this.last1kmSeconds = last1kmSec;
        this.kmCount = count;
        for (int i = 0; i < count; i++) {
            this.paceMap.put(Integer.valueOf(i), Integer.valueOf(i * 2 * 60));
        }
    }

    public final void l(boolean value) {
        this.flagHalfGoalCompleted = value;
    }
}
