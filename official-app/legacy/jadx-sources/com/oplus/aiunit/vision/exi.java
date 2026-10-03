package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.stress.Stress;
import com.heytap.databaseengine.model.stress.StressDataStat;
import com.heytap.health.core.widget.charts.data.HealthSingleBarEntry;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\f\u001a\u0004\b\u0003\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u001b\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/oplus/aiunit/vision/exi;", "", "Lcom/heytap/databaseengine/model/stress/StressDataStat;", "a", "Lcom/heytap/databaseengine/model/stress/StressDataStat;", "b", "()Lcom/heytap/databaseengine/model/stress/StressDataStat;", "f", "(Lcom/heytap/databaseengine/model/stress/StressDataStat;)V", "curStat", "", "Lcom/heytap/databaseengine/model/stress/Stress;", "Ljava/util/List;", "c", "()Ljava/util/List;", b2n.f, "(Ljava/util/List;)V", "dbList", "Lcom/heytap/health/core/widget/charts/data/HealthSingleBarEntry;", MapSchema.FIELD_NAME_ENTRY, "chartList", "", "d", "Z", "()Z", b2n.g, "(Z)V", "isEmpty", "<init>", "()V", "stress_release"}, k = 1, mv = {1, 8, 0})
public final class exi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public StressDataStat curStat;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public List<Stress> dbList = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<HealthSingleBarEntry> chartList = new ArrayList();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean isEmpty = true;

    @NotNull
    public final List<HealthSingleBarEntry> a() {
        return this.chartList;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final StressDataStat getCurStat() {
        return this.curStat;
    }

    @NotNull
    public final List<Stress> c() {
        return this.dbList;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsEmpty() {
        return this.isEmpty;
    }

    public final void e(@NotNull List<HealthSingleBarEntry> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.chartList = list;
    }

    public final void f(@Nullable StressDataStat stressDataStat) {
        this.curStat = stressDataStat;
    }

    public final void g(@NotNull List<Stress> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dbList = list;
    }

    public final void h(boolean z) {
        this.isEmpty = z;
    }
}
