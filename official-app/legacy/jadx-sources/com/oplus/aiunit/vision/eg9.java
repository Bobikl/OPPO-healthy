package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.physicalMental.PhysicalMentalStat;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0003\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/oplus/aiunit/vision/eg9;", "", "", "a", "J", "c", "()J", b2n.f, "(J)V", "curMinTime", "b", "f", "curMaxTime", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "Ljava/util/List;", "()Ljava/util/List;", "setChartDataList", "(Ljava/util/List;)V", "chartDataList", "Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalStat;", "d", "Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalStat;", "()Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalStat;", b2n.g, "(Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalStat;)V", "curStat", "", MapSchema.FIELD_NAME_ENTRY, "Z", "()Z", "i", "(Z)V", "isEmpty", "<init>", "()V", "hrv_release"}, k = 1, mv = {1, 8, 0})
public final class eg9 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public long curMinTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long curMaxTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PhysicalMentalStat curStat;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<TimeStampedData> chartDataList = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isEmpty = true;

    @NotNull
    public final List<TimeStampedData> a() {
        return this.chartDataList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getCurMaxTime() {
        return this.curMaxTime;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getCurMinTime() {
        return this.curMinTime;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final PhysicalMentalStat getCurStat() {
        return this.curStat;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsEmpty() {
        return this.isEmpty;
    }

    public final void f(long j2) {
        this.curMaxTime = j2;
    }

    public final void g(long j2) {
        this.curMinTime = j2;
    }

    public final void h(@Nullable PhysicalMentalStat physicalMentalStat) {
        this.curStat = physicalMentalStat;
    }

    public final void i(boolean z) {
        this.isEmpty = z;
    }
}
