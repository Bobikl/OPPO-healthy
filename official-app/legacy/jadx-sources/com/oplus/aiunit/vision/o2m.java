package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.heytap.health.healthbase.bean.HealthChartDayBean;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B-\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0003\u0010\r\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\b\"\u0004\b\f\u0010\nR*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/o2m;", "Lcom/heytap/health/healthbase/bean/HealthChartDayBean;", "", "toString", "", "a", "J", "b", "()J", MapSchema.FIELD_NAME_ENTRY, "(J)V", "startTimestamp", "d", "endTimestamp", "", "Lcom/oplus/aiunit/vision/m4m;", "c", "Ljava/util/List;", "()Ljava/util/List;", "f", "(Ljava/util/List;)V", "wristList", "<init>", "(JJLjava/util/List;)V", "wrist_temperature_release"}, k = 1, mv = {1, 8, 0})
public final class o2m extends HealthChartDayBean {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public long startTimestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long endTimestamp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public List<WristValue> wristList;

    public o2m() {
        this(0L, 0L, null, 7, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    @Nullable
    public final List<WristValue> c() {
        return this.wristList;
    }

    public final void d(long j2) {
        this.endTimestamp = j2;
    }

    public final void e(long j2) {
        this.startTimestamp = j2;
    }

    public final void f(@Nullable List<WristValue> list) {
        this.wristList = list;
    }

    @NotNull
    public String toString() {
        return "WristDayBean startTimestamp=" + this.startTimestamp + ",endTimestamp=" + this.endTimestamp;
    }

    public /* synthetic */ o2m(long j2, long j3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j2, (i & 2) != 0 ? 0L : j3, (i & 4) != 0 ? null : list);
    }

    public o2m(@NonNull long j2, @NonNull long j3, @Nullable List<WristValue> list) {
        this.startTimestamp = j2;
        this.endTimestamp = j3;
        this.wristList = list;
    }
}
