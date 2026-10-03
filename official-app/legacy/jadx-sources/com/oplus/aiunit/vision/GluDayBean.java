package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengine.model.bloodsugar.BloodSugarStat;
import com.heytap.databaseengine.model.bloodsugar.BloodSugarWarning;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.s78, reason: from toString */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b;\u0010<J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\tR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0019\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\"\u0010 \u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010#\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\"\u0010)\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010%\u001a\u0004\b\u0006\u0010&\"\u0004\b'\u0010(R$\u0010/\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010+\u001a\u0004\b\f\u0010,\"\u0004\b-\u0010.R\"\u00106\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R(\u0010:\u001a\b\u0012\u0004\u0012\u0002070\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u0007\u001a\u0004\b\u0010\u0010\t\"\u0004\b8\u00109¨\u0006="}, d2 = {"Lcom/oplus/aiunit/vision/s78;", "", "", "toString", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "a", "Ljava/util/List;", b2n.f, "()Ljava/util/List;", "lineDataList", "Lcom/oplus/aiunit/vision/bzj;", "b", "d", "candleDataList", "", "c", "J", "f", "()J", "n", "(J)V", "chartStartTime", MapSchema.FIELD_NAME_ENTRY, LogFieldKey.MESSAGE_KEY, "chartEndTime", "", UserInfo.SEX_FEMALE, b2n.g, "()F", "o", "(F)V", "maxValue", "i", LogFieldKey.PROCESS_NAME_KEY, "minValue", "", "D", "()D", MapSchema.FIELD_NAME_KEY, "(D)V", "averageValue", "Lcom/heytap/databaseengine/model/bloodsugar/BloodSugarStat;", "Lcom/heytap/databaseengine/model/bloodsugar/BloodSugarStat;", "()Lcom/heytap/databaseengine/model/bloodsugar/BloodSugarStat;", LogFieldKey.LEVEL_KEY, "(Lcom/heytap/databaseengine/model/bloodsugar/BloodSugarStat;)V", "bloodSugarStat", "", "Z", "j", "()Z", "q", "(Z)V", "isNoData", "Lcom/heytap/databaseengine/model/bloodsugar/BloodSugarWarning;", "setBloodSugarWarningList", "(Ljava/util/List;)V", "bloodSugarWarningList", "<init>", "()V", "blood_glucose_release"}, k = 1, mv = {1, 8, 0})
public final class GluDayBean {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public long chartStartTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long chartEndTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public float maxValue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public float minValue;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    public double averageValue;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public BloodSugarStat bloodSugarStat;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<TimeStampedData> lineDataList = new ArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<TimeStampedCandleData> candleDataList = new ArrayList();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    public boolean isNoData = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<BloodSugarWarning> bloodSugarWarningList = new ArrayList();

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getAverageValue() {
        return this.averageValue;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final BloodSugarStat getBloodSugarStat() {
        return this.bloodSugarStat;
    }

    @NotNull
    public final List<BloodSugarWarning> c() {
        return this.bloodSugarWarningList;
    }

    @NotNull
    public final List<TimeStampedCandleData> d() {
        return this.candleDataList;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getChartEndTime() {
        return this.chartEndTime;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getChartStartTime() {
        return this.chartStartTime;
    }

    @NotNull
    public final List<TimeStampedData> g() {
        return this.lineDataList;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getMaxValue() {
        return this.maxValue;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getMinValue() {
        return this.minValue;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsNoData() {
        return this.isNoData;
    }

    public final void k(double d) {
        this.averageValue = d;
    }

    public final void l(@Nullable BloodSugarStat bloodSugarStat) {
        this.bloodSugarStat = bloodSugarStat;
    }

    public final void m(long j2) {
        this.chartEndTime = j2;
    }

    public final void n(long j2) {
        this.chartStartTime = j2;
    }

    public final void o(float f) {
        this.maxValue = f;
    }

    public final void p(float f) {
        this.minValue = f;
    }

    public final void q(boolean z) {
        this.isNoData = z;
    }

    @NotNull
    public String toString() {
        int size = this.lineDataList.size();
        int size2 = this.candleDataList.size();
        mq8 mq8Var = mq8.INSTANCE;
        return "GluDayBean(lineDataList=" + size + ", candleDataList=" + size2 + ", chartStartTime=" + mq8Var.y(this.chartStartTime, "yyy-MM-dd HH:mm") + ", chartEndTime=" + mq8Var.y(this.chartEndTime, "yyy-MM-dd HH:mm") + ", maxValue=" + this.maxValue + ", minValue=" + this.minValue + ", averageValue=" + this.averageValue + ", isNoData=" + this.isNoData + ")";
    }
}
