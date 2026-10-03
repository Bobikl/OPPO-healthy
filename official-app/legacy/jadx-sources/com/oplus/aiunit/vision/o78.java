package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.bloodsugar.BloodSugar;
import com.heytap.databaseengine.model.bloodsugar.BloodSugarStat;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b'\u0010(R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010$\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010 \u001a\u0004\b\u000b\u0010!\"\u0004\b\"\u0010#R\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010 \u001a\u0004\b\u0003\u0010!\"\u0004\b%\u0010#¨\u0006)"}, d2 = {"Lcom/oplus/aiunit/vision/o78;", "", "Lcom/heytap/databaseengine/model/bloodsugar/BloodSugarStat;", "a", "Lcom/heytap/databaseengine/model/bloodsugar/BloodSugarStat;", "d", "()Lcom/heytap/databaseengine/model/bloodsugar/BloodSugarStat;", "j", "(Lcom/heytap/databaseengine/model/bloodsugar/BloodSugarStat;)V", "lastBloodSugarStat", "Lcom/heytap/databaseengine/model/bloodsugar/BloodSugar;", "b", "Lcom/heytap/databaseengine/model/bloodsugar/BloodSugar;", "c", "()Lcom/heytap/databaseengine/model/bloodsugar/BloodSugar;", "i", "(Lcom/heytap/databaseengine/model/bloodsugar/BloodSugar;)V", "lastBloodSugar", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "Ljava/util/List;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/util/List;", "lineDataList", "", "Z", "f", "()Z", MapSchema.FIELD_NAME_KEY, "(Z)V", "isNoData", "", "J", "()J", b2n.g, "(J)V", "chartStartTime", b2n.f, "chartEndTime", "<init>", "()V", "blood_glucose_release"}, k = 1, mv = {1, 8, 0})
public final class o78 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public BloodSugarStat lastBloodSugarStat;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public BloodSugar lastBloodSugar;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<TimeStampedData> lineDataList = new ArrayList();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean isNoData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public long chartStartTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public long chartEndTime;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getChartEndTime() {
        return this.chartEndTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getChartStartTime() {
        return this.chartStartTime;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final BloodSugar getLastBloodSugar() {
        return this.lastBloodSugar;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final BloodSugarStat getLastBloodSugarStat() {
        return this.lastBloodSugarStat;
    }

    @NotNull
    public final List<TimeStampedData> e() {
        return this.lineDataList;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsNoData() {
        return this.isNoData;
    }

    public final void g(long j2) {
        this.chartEndTime = j2;
    }

    public final void h(long j2) {
        this.chartStartTime = j2;
    }

    public final void i(@Nullable BloodSugar bloodSugar) {
        this.lastBloodSugar = bloodSugar;
    }

    public final void j(@Nullable BloodSugarStat bloodSugarStat) {
        this.lastBloodSugarStat = bloodSugarStat;
    }

    public final void k(boolean z) {
        this.isNoData = z;
    }
}
