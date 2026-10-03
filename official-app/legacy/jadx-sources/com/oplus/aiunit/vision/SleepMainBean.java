package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.core.widget.charts.data.SleepUnitData;
import com.heytap.health.sleep.snore.SnoreHistoryActivity;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.jkh, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b3\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\r\u0012\f\u0010K\u001a\b\u0012\u0004\u0012\u00020J0I¢\u0006\u0004\bL\u0010MJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\"\u0010\u001c\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\"\u0010\u001f\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u0013R\"\u0010\"\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u000f\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R\"\u0010%\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0007\u001a\u0004\b#\u0010\t\"\u0004\b$\u0010\u000bR\"\u0010)\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0007\u001a\u0004\b'\u0010\t\"\u0004\b(\u0010\u000bR\"\u0010,\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0007\u001a\u0004\b*\u0010\t\"\u0004\b+\u0010\u000bR\"\u0010/\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0007\u001a\u0004\b-\u0010\t\"\u0004\b.\u0010\u000bR\"\u00102\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0007\u001a\u0004\b0\u0010\t\"\u0004\b1\u0010\u000bR\"\u00105\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0007\u001a\u0004\b3\u0010\t\"\u0004\b4\u0010\u000bR\"\u00108\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0007\u001a\u0004\b6\u0010\t\"\u0004\b7\u0010\u000bR\"\u0010:\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b9\u0010\u000bR\"\u0010=\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010\u0007\u001a\u0004\b\u0015\u0010\t\"\u0004\b<\u0010\u000bR\"\u0010@\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010\u0007\u001a\u0004\b\u0019\u0010\t\"\u0004\b?\u0010\u000bR(\u0010H\u001a\b\u0012\u0004\u0012\u00020B0A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\b&\u0010E\"\u0004\bF\u0010G¨\u0006N"}, d2 = {"Lcom/oplus/aiunit/vision/jkh;", "", "", "a", "", "toString", "", "I", "getDate", "()I", "setDate", "(I)V", "date", "", "b", "J", "getCurDayStartTime", "()J", "setCurDayStartTime", "(J)V", SnoreHistoryActivity.CUR_DAY_START_TIME, "c", "getCurDayEndTime", "setCurDayEndTime", SnoreHistoryActivity.CUR_DAY_END_TIME, "d", MapSchema.FIELD_NAME_ENTRY, "setSleep3HoursBeforeTime", "sleep3HoursBeforeTime", "f", "setSleepInTime", "sleepInTime", b2n.f, "setSleepOutTime", "sleepOutTime", LogFieldKey.LEVEL_KEY, "setTotalSleepTime", "totalSleepTime", b2n.g, "i", "setTotalDeepSleepTime", "totalDeepSleepTime", "j", "setTotalLightlySleepTime", "totalLightlySleepTime", MapSchema.FIELD_NAME_KEY, "setTotalREMSleepTime", "totalREMSleepTime", LogFieldKey.MESSAGE_KEY, "setTotalWakeTime", "totalWakeTime", "n", "setWakeCount", "wakeCount", "getSource", "setSource", "source", "setDeepSleepScale", "deepSleepScale", "o", "setLightlySleepScale", "lightlySleepScale", LogFieldKey.PROCESS_NAME_KEY, "setRemSleepScale", "remSleepScale", "", "Lcom/heytap/health/core/widget/charts/data/SleepUnitData;", "q", "Ljava/util/List;", "()Ljava/util/List;", "setSleepUnitDataList", "(Ljava/util/List;)V", "sleepUnitDataList", "", "Lcom/oplus/aiunit/vision/ihh;", "sleepFrgBeanList", "<init>", "(JJLjava/util/List;)V", "sleep_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepMainBean.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepMainBean.kt\ncom/heytap/health/sleep/bean/SleepMainBean\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,105:1\n1855#2,2:106\n*S KotlinDebug\n*F\n+ 1 SleepMainBean.kt\ncom/heytap/health/sleep/bean/SleepMainBean\n*L\n60#1:106,2\n*E\n"})
public final class SleepMainBean {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public int date;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long curDayStartTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public long curDayEndTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long sleep3HoursBeforeTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public long sleepInTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public long sleepOutTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    public int totalSleepTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int totalDeepSleepTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int totalLightlySleepTime;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int totalREMSleepTime;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int totalWakeTime;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int wakeCount;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    public int source;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int deepSleepScale;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int lightlySleepScale;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int remSleepScale;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public List<SleepUnitData> sleepUnitDataList;

    public SleepMainBean(long j2, long j3, @NotNull List<? extends ihh> sleepFrgBeanList) {
        Intrinsics.checkNotNullParameter(sleepFrgBeanList, "sleepFrgBeanList");
        this.sleepUnitDataList = new ArrayList();
        this.date = v05.i(j3);
        this.curDayStartTime = j2;
        this.curDayEndTime = j3;
        for (ihh ihhVar : sleepFrgBeanList) {
            long j4 = this.sleepInTime;
            if (j4 == 0 || j4 > ihhVar.j()) {
                this.sleepInTime = ihhVar.j();
            }
            if (ihhVar.d() > this.sleepOutTime) {
                this.sleepOutTime = ihhVar.d();
            }
            this.totalSleepTime += ihhVar.n();
            this.totalDeepSleepTime += ihhVar.k();
            this.totalLightlySleepTime += ihhVar.l();
            this.totalREMSleepTime += ihhVar.m();
            this.totalWakeTime += ihhVar.o();
            this.wakeCount += ihhVar.p();
            List<SleepUnitData> list = this.sleepUnitDataList;
            List<SleepUnitData> listI = ihhVar.i();
            Intrinsics.checkNotNullExpressionValue(listI, "it.sleepUnitDataList");
            list.addAll(listI);
        }
        this.sleep3HoursBeforeTime = Math.max(this.sleepInTime - 10800000, j2);
        this.source = 1;
        a();
    }

    public final void a() {
        int i = this.totalSleepTime;
        if (i > 0) {
            int i2 = this.totalDeepSleepTime;
            if (i2 > 0) {
                this.deepSleepScale = (int) Math.ceil((i2 * 100.0f) / i);
            }
            int i3 = this.totalREMSleepTime;
            if (i3 > 0) {
                this.remSleepScale = (int) Math.ceil((i3 * 100.0f) / this.totalSleepTime);
            }
        }
        this.lightlySleepScale = (100 - this.deepSleepScale) - this.remSleepScale;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getDeepSleepScale() {
        return this.deepSleepScale;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getLightlySleepScale() {
        return this.lightlySleepScale;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getRemSleepScale() {
        return this.remSleepScale;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getSleep3HoursBeforeTime() {
        return this.sleep3HoursBeforeTime;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getSleepInTime() {
        return this.sleepInTime;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getSleepOutTime() {
        return this.sleepOutTime;
    }

    @NotNull
    public final List<SleepUnitData> h() {
        return this.sleepUnitDataList;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getTotalDeepSleepTime() {
        return this.totalDeepSleepTime;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getTotalLightlySleepTime() {
        return this.totalLightlySleepTime;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getTotalREMSleepTime() {
        return this.totalREMSleepTime;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getTotalSleepTime() {
        return this.totalSleepTime;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getTotalWakeTime() {
        return this.totalWakeTime;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getWakeCount() {
        return this.wakeCount;
    }

    @NotNull
    public String toString() {
        return "SleepMainBean(date=" + this.date + ", sleep3HoursBeforeTime=" + v05.s(this.sleep3HoursBeforeTime, "yyy-MMM-dd HH:mm") + ", sleepInTime=" + v05.s(this.sleepInTime, "yyy-MMM-dd HH:mm") + ", sleepOutTime=" + v05.s(this.sleepOutTime, "yyy-MMM-dd HH:mm") + ", totalSleepTime=" + this.totalSleepTime + ", source=" + this.source + ")";
    }
}
