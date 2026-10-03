package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\u0013\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R*\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u0003\u0010\u001b\"\u0004\b\u0014\u0010\u001c¨\u0006 "}, d2 = {"Lcom/oplus/aiunit/vision/gvh;", "", "", "a", "I", "c", "()I", "f", "(I)V", "minValue", "b", MapSchema.FIELD_NAME_ENTRY, "maxValue", "", "J", "getSleepStartTime", "()J", b2n.g, "(J)V", "sleepStartTime", "d", "getSleepEndTime", b2n.f, "sleepEndTime", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "Ljava/util/List;", "()Ljava/util/List;", "(Ljava/util/List;)V", "dataList", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class gvh {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int minValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int maxValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public long sleepStartTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long sleepEndTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public List<TimeStampedData> dataList;

    @Nullable
    public final List<TimeStampedData> a() {
        return this.dataList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getMaxValue() {
        return this.maxValue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMinValue() {
        return this.minValue;
    }

    public final void d(@Nullable List<TimeStampedData> list) {
        this.dataList = list;
    }

    public final void e(int i) {
        this.maxValue = i;
    }

    public final void f(int i) {
        this.minValue = i;
    }

    public final void g(long j2) {
        this.sleepEndTime = j2;
    }

    public final void h(long j2) {
        this.sleepStartTime = j2;
    }
}
