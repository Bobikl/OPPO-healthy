package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\t\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\bB#\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/oplus/aiunit/vision/go0;", "", "", "currentStep", "Lcom/oplus/aiunit/vision/fo0;", "b", "lastGpsUpdateTime", "currentTime", "a", "", "c", "", "Z", "isStepSport", "", "I", "autoPauseTrigger", "J", "rideCheckInterval", "d", "lastCheckStep", "", MapSchema.FIELD_NAME_ENTRY, "Ljava/util/List;", "gpsValidUpdateTimeList", "f", "gpsInvalidUpdateTimeList", "<init>", "(ZIJ)V", "Companion", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class go0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean isStepSport;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int autoPauseTrigger;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long rideCheckInterval;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long lastCheckStep;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Long> gpsValidUpdateTimeList;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final List<Long> gpsInvalidUpdateTimeList;
    public static final int $stable = 8;

    public go0(boolean z, int i, long j2) {
        this.isStepSport = z;
        this.autoPauseTrigger = i;
        this.rideCheckInterval = j2;
        this.gpsValidUpdateTimeList = new ArrayList();
        this.gpsInvalidUpdateTimeList = new ArrayList();
    }

    @NotNull
    public final fo0 a(long lastGpsUpdateTime, long currentTime) {
        if (!this.isStepSport && currentTime - lastGpsUpdateTime > this.rideCheckInterval) {
            return fo0.b.INSTANCE;
        }
        return fo0.a.INSTANCE;
    }

    @NotNull
    public final fo0 b(long currentStep) {
        if (!this.isStepSport) {
            return fo0.a.INSTANCE;
        }
        fo0 fo0Var = currentStep - this.lastCheckStep < ((long) this.autoPauseTrigger) ? fo0.b.INSTANCE : fo0.a.INSTANCE;
        this.lastCheckStep = currentStep;
        return fo0Var;
    }

    public final void c(long currentStep) {
        this.lastCheckStep = currentStep;
    }

    public /* synthetic */ go0(boolean z, int i, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i2 & 2) != 0 ? 5 : i, (i2 & 4) != 0 ? 3000L : j2);
    }
}
