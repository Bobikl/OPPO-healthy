package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\tB\u001b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/b2e;", "", "", "currentDistance", "", "currentStep", "", "isStepSport", "", "a", "(DJZ)Ljava/lang/Integer;", "I", "queueCapacity", "b", "autoPauseTrigger", "Ljava/util/LinkedList;", "c", "Ljava/util/LinkedList;", "distanceQueue", "d", "J", "lastStepForPace", "<init>", "(II)V", "Companion", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class b2e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int queueCapacity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int autoPauseTrigger;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LinkedList<Double> distanceQueue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long lastStepForPace;
    public static final int $stable = 8;

    public b2e(int i, int i2) {
        this.queueCapacity = i;
        this.autoPauseTrigger = i2;
        this.distanceQueue = new LinkedList<>();
    }

    @Nullable
    public final Integer a(double currentDistance, long currentStep, boolean isStepSport) {
        int size;
        double dDoubleValue;
        int i;
        int size2 = this.distanceQueue.size();
        Integer numValueOf = null;
        if (size2 == 0) {
            this.distanceQueue.add(Double.valueOf(currentDistance));
            this.lastStepForPace = currentStep;
            return null;
        }
        if (size2 == this.queueCapacity) {
            size = this.distanceQueue.size();
            Double dPoll = this.distanceQueue.poll();
            dDoubleValue = dPoll != null ? dPoll.doubleValue() : 0.0d;
            this.distanceQueue.add(Double.valueOf(currentDistance));
        } else {
            size = this.distanceQueue.size();
            Double dPeek = this.distanceQueue.peek();
            dDoubleValue = dPeek != null ? dPeek.doubleValue() : 0.0d;
            this.distanceQueue.add(Double.valueOf(currentDistance));
        }
        double d = currentDistance - dDoubleValue;
        if (this.distanceQueue.size() > 1) {
            if (!isStepSport || currentStep - this.lastStepForPace >= this.autoPauseTrigger) {
                i = (int) (((double) (size * 5)) / d);
            } else {
                this.distanceQueue.clear();
                i = 0;
            }
            numValueOf = Integer.valueOf(i);
        }
        this.lastStepForPace = currentStep;
        return numValueOf;
    }

    public /* synthetic */ b2e(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 4 : i, (i3 & 2) != 0 ? 5 : i2);
    }
}
