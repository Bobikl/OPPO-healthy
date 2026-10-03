package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/m88;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/oplus/aiunit/vision/m88$a;", "Lcom/oplus/aiunit/vision/m88$b;", "Lcom/oplus/aiunit/vision/m88$c;", "Lcom/oplus/aiunit/vision/m88$d;", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class m88 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.m88$a, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/m88$a;", "Lcom/oplus/aiunit/vision/m88;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "D", "()D", "distance", "b", "I", "()I", "durationSeconds", "<init>", "(DI)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Completed extends m88 {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public final double distance;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final int durationSeconds;

        public Completed(double d, int i) {
            super(null);
            this.distance = d;
            this.durationSeconds = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final double getDistance() {
            return this.distance;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getDurationSeconds() {
            return this.durationSeconds;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Completed)) {
                return false;
            }
            Completed completed = (Completed) other;
            return Double.compare(this.distance, completed.distance) == 0 && this.durationSeconds == completed.durationSeconds;
        }

        public int hashCode() {
            return (Double.hashCode(this.distance) * 31) + Integer.hashCode(this.durationSeconds);
        }

        @NotNull
        public String toString() {
            return "Completed(distance=" + this.distance + ", durationSeconds=" + this.durationSeconds + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/m88$b;", "Lcom/oplus/aiunit/vision/m88;", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends m88 {
        public static final int $stable = 0;

        @NotNull
        public static final b INSTANCE = new b();

        public b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.m88$c, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/m88$c;", "Lcom/oplus/aiunit/vision/m88;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "I", "b", "()I", "km", "durationSeconds", "<init>", "(II)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class KmReached extends m88 {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public final int km;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final int durationSeconds;

        public KmReached(int i, int i2) {
            super(null);
            this.km = i;
            this.durationSeconds = i2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getDurationSeconds() {
            return this.durationSeconds;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getKm() {
            return this.km;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof KmReached)) {
                return false;
            }
            KmReached kmReached = (KmReached) other;
            return this.km == kmReached.km && this.durationSeconds == kmReached.durationSeconds;
        }

        public int hashCode() {
            return (Integer.hashCode(this.km) * 31) + Integer.hashCode(this.durationSeconds);
        }

        @NotNull
        public String toString() {
            return "KmReached(km=" + this.km + ", durationSeconds=" + this.durationSeconds + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/m88$d;", "Lcom/oplus/aiunit/vision/m88;", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class d extends m88 {
        public static final int $stable = 0;

        @NotNull
        public static final d INSTANCE = new d();

        public d() {
            super(null);
        }
    }

    public m88() {
    }

    public /* synthetic */ m88(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
