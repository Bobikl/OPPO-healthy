package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.HeartRate;
import com.heytap.health.core.widget.charts.data.HealthCandleEntry;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0005\u001a\u0004\b\u0004\u0010\u0007\"\u0004\b\r\u0010\tR$\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010 \u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/oplus/aiunit/vision/r29;", "", "", "Lcom/heytap/databaseengine/model/HeartRate;", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "i", "(Ljava/util/List;)V", "heartRateList", "Lcom/heytap/health/core/widget/charts/data/HealthCandleEntry;", "b", b2n.f, "candleEntryList", "Lcom/oplus/aiunit/vision/c49;", "Lcom/oplus/aiunit/vision/c49;", "()Lcom/oplus/aiunit/vision/c49;", b2n.g, "(Lcom/oplus/aiunit/vision/c49;)V", "heartRateDataStatusBean", "", "f", "()Z", "isEmpty", "", MapSchema.FIELD_NAME_ENTRY, "()J", "lastDataTime", "", "d", "()I", "lastData", "<init>", "()V", "heartrate_release"}, k = 1, mv = {1, 8, 0})
public final class r29 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public List<HeartRate> heartRateList = new ArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public List<HealthCandleEntry> candleEntryList = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public c49 heartRateDataStatusBean;

    @NotNull
    public final List<HealthCandleEntry> a() {
        return this.candleEntryList;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final c49 getHeartRateDataStatusBean() {
        return this.heartRateDataStatusBean;
    }

    @NotNull
    public final List<HeartRate> c() {
        return this.heartRateList;
    }

    public final int d() {
        if (f()) {
            return 0;
        }
        List<HeartRate> list = this.heartRateList;
        return list.get(list.size() - 1).getHeartRateValue();
    }

    public final long e() {
        if (f()) {
            return 0L;
        }
        List<HeartRate> list = this.heartRateList;
        return list.get(list.size() - 1).getDataCreatedTimestamp();
    }

    public final boolean f() {
        return this.heartRateList.isEmpty();
    }

    public final void g(@NotNull List<HealthCandleEntry> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.candleEntryList = list;
    }

    public final void h(@Nullable c49 c49Var) {
        this.heartRateDataStatusBean = c49Var;
    }

    public final void i(@NotNull List<HeartRate> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.heartRateList = list;
    }
}
