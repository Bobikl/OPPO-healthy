package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.location.HMapLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/zai;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/oplus/aiunit/vision/zai$a;", "Lcom/oplus/aiunit/vision/zai$b;", "Lcom/oplus/aiunit/vision/zai$c;", "Lcom/oplus/aiunit/vision/zai$d;", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class zai {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.zai$a, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/zai$a;", "Lcom/oplus/aiunit/vision/zai;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/oplus/aiunit/vision/lji;", "a", "Lcom/oplus/aiunit/vision/lji;", "()Lcom/oplus/aiunit/vision/lji;", "data", "<init>", "(Lcom/oplus/aiunit/vision/lji;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class DataUpdate extends zai {
        public static final int $stable = lji.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final lji data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DataUpdate(@NotNull lji data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final lji getData() {
            return this.data;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DataUpdate) && Intrinsics.areEqual(this.data, ((DataUpdate) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        @NotNull
        public String toString() {
            return "DataUpdate(data=" + this.data + ")";
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.zai$b, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/zai$b;", "Lcom/oplus/aiunit/vision/zai;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "I", "()I", "power", "<init>", "(I)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class GpsPowerChange extends zai {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public final int power;

        public GpsPowerChange(int i) {
            super(null);
            this.power = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getPower() {
            return this.power;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GpsPowerChange) && this.power == ((GpsPowerChange) other).power;
        }

        public int hashCode() {
            return Integer.hashCode(this.power);
        }

        @NotNull
        public String toString() {
            return "GpsPowerChange(power=" + this.power + ")";
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.zai$c, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/zai$c;", "Lcom/oplus/aiunit/vision/zai;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/heytap/health/location/HMapLocation;", "a", "Lcom/heytap/health/location/HMapLocation;", "()Lcom/heytap/health/location/HMapLocation;", "location", "<init>", "(Lcom/heytap/health/location/HMapLocation;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class LocationUpdate extends zai {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final HMapLocation location;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocationUpdate(@NotNull HMapLocation location) {
            super(null);
            Intrinsics.checkNotNullParameter(location, "location");
            this.location = location;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final HMapLocation getLocation() {
            return this.location;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LocationUpdate) && Intrinsics.areEqual(this.location, ((LocationUpdate) other).location);
        }

        public int hashCode() {
            return this.location.hashCode();
        }

        @NotNull
        public String toString() {
            return "LocationUpdate(location=" + this.location + ")";
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.zai$d, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/zai$d;", "Lcom/oplus/aiunit/vision/zai;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "I", "()I", "seconds", "<init>", "(I)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class PaceUpdate extends zai {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public final int seconds;

        public PaceUpdate(int i) {
            super(null);
            this.seconds = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getSeconds() {
            return this.seconds;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PaceUpdate) && this.seconds == ((PaceUpdate) other).seconds;
        }

        public int hashCode() {
            return Integer.hashCode(this.seconds);
        }

        @NotNull
        public String toString() {
            return "PaceUpdate(seconds=" + this.seconds + ")";
        }
    }

    public zai() {
    }

    public /* synthetic */ zai(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
