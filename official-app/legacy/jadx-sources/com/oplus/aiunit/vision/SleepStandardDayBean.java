package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.newsleep.SleepAdvice;
import com.heytap.databaseengine.model.sleepdaystat.SleepMainData;
import com.heytap.health.sleep.snore.SnoreHistoryActivity;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.xph, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b<\u0010=J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\u0010\u0010\nR\"\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\nR\"\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0018\u0010\nR\"\u0010 \u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0012\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\b\"\u0004\b\u001b\u0010\nR\"\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\b\"\u0004\b!\u0010\nR\"\u0010'\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u0005\u0010\u001d\"\u0004\b$\u0010\u001fR\"\u0010-\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010)\u001a\u0004\b\u0016\u0010*\"\u0004\b+\u0010,R$\u00104\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u0010;\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lcom/oplus/aiunit/vision/xph;", "", "", "toString", "", "a", "J", "c", "()J", MapSchema.FIELD_NAME_KEY, "(J)V", "curMinTime", "b", "getCurDayStartTime", "j", SnoreHistoryActivity.CUR_DAY_START_TIME, "i", "beforeMinTime", "d", "getSleepInTime", LogFieldKey.MESSAGE_KEY, "sleepInTime", MapSchema.FIELD_NAME_ENTRY, "getSleepOutTime", "o", "sleepOutTime", "", "f", "I", "()I", "q", "(I)V", "totalSleepTime", b2n.f, "getAdviceInTime", "adviceInTime", b2n.g, "getAdviceOutTime", "adviceOutTime", "adviceSleepTime", "", "Z", "()Z", LogFieldKey.PROCESS_NAME_KEY, "(Z)V", "isStandard", "Lcom/heytap/databaseengine/model/newsleep/SleepAdvice;", "Lcom/heytap/databaseengine/model/newsleep/SleepAdvice;", "getSleepAdvice", "()Lcom/heytap/databaseengine/model/newsleep/SleepAdvice;", LogFieldKey.LEVEL_KEY, "(Lcom/heytap/databaseengine/model/newsleep/SleepAdvice;)V", "sleepAdvice", "Lcom/heytap/databaseengine/model/sleepdaystat/SleepMainData;", "Lcom/heytap/databaseengine/model/sleepdaystat/SleepMainData;", "getSleepMainData", "()Lcom/heytap/databaseengine/model/sleepdaystat/SleepMainData;", "n", "(Lcom/heytap/databaseengine/model/sleepdaystat/SleepMainData;)V", "sleepMainData", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class SleepStandardDayBean {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public long curMinTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public long curDayStartTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public long beforeMinTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public long sleepInTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public long sleepOutTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public int totalSleepTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    public long adviceInTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    public long adviceOutTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    public int adviceSleepTime;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean isStandard;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    public SleepAdvice sleepAdvice;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public SleepMainData sleepMainData;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAdviceSleepTime() {
        return this.adviceSleepTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getBeforeMinTime() {
        return this.beforeMinTime;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getCurMinTime() {
        return this.curMinTime;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getTotalSleepTime() {
        return this.totalSleepTime;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsStandard() {
        return this.isStandard;
    }

    public final void f(long j2) {
        this.adviceInTime = j2;
    }

    public final void g(long j2) {
        this.adviceOutTime = j2;
    }

    public final void h(int i) {
        this.adviceSleepTime = i;
    }

    public final void i(long j2) {
        this.beforeMinTime = j2;
    }

    public final void j(long j2) {
        this.curDayStartTime = j2;
    }

    public final void k(long j2) {
        this.curMinTime = j2;
    }

    public final void l(@Nullable SleepAdvice sleepAdvice) {
        this.sleepAdvice = sleepAdvice;
    }

    public final void m(long j2) {
        this.sleepInTime = j2;
    }

    public final void n(@Nullable SleepMainData sleepMainData) {
        this.sleepMainData = sleepMainData;
    }

    public final void o(long j2) {
        this.sleepOutTime = j2;
    }

    public final void p(boolean z) {
        this.isStandard = z;
    }

    public final void q(int i) {
        this.totalSleepTime = i;
    }

    @NotNull
    public String toString() {
        return "SleepStandardDayBean(curMinTime=" + this.curMinTime + ", curDayStartTime=" + this.curDayStartTime + ", beforeMinTime=" + this.beforeMinTime + ", sleepInTime=" + this.sleepInTime + ", sleepOutTime=" + this.sleepOutTime + ", totalSleepTime=" + this.totalSleepTime + ", adviceInTime=" + this.adviceInTime + ", adviceOutTime=" + this.adviceOutTime + ", adviceSleepTime=" + this.adviceSleepTime + ", isStandard=" + this.isStandard + ", sleepAdvice=" + this.sleepAdvice + ", sleepMainData=" + this.sleepMainData + ")";
    }
}
