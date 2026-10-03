package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.sleep.snore.SnoreHistoryActivity;
import io.protostuff.MapSchema;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 )2\u00020\u0001:\u0002\u000b\rB\u0007¢\u0006\u0004\b&\u0010'B\u0019\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b&\u0010(J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\f\u001a\u0004\b\u000b\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010 \u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0016\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\f\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R\"\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b$\u0010\u0010¨\u0006*"}, d2 = {"Lcom/oplus/aiunit/vision/ss8;", "", "", "curTime", "", "rangeDay", "divideHour", "", "isSlide", "", "f", "a", "J", "b", "()J", b2n.f, "(J)V", SnoreHistoryActivity.BORDER_START_TIME, "setBorderEndTime", SnoreHistoryActivity.BORDER_END_TIME, "Lcom/heytap/health/base/livedata/OLiveData;", "Lcom/oplus/aiunit/vision/ss8$b;", "c", "Lcom/heytap/health/base/livedata/OLiveData;", MapSchema.FIELD_NAME_ENTRY, "()Lcom/heytap/health/base/livedata/OLiveData;", "pageLiveData", "d", "I", "()I", "setCurrentItemIndex", "(I)V", "currentItemIndex", "getLastDaySleepStartTime", "setLastDaySleepStartTime", "lastDaySleepStartTime", "setLastRequestTime", "lastRequestTime", "<init>", "()V", "(JJ)V", "Companion", "health_base_release"}, k = 1, mv = {1, 8, 0})
public final class ss8 {

    @NotNull
    public static final String TAG = "HealthPageDateUtils";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public long borderStartTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long borderEndTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OLiveData<b> pageLiveData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int currentItemIndex;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public long lastDaySleepStartTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public long lastRequestTime;
    public static final int $stable = 8;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/ss8$b;", "", "", "a", "J", "sendStartTimestamp", "b", "sendEndTimestamp", "<init>", "()V", "health_base_release"}, k = 1, mv = {1, 8, 0})
    public static final class b {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        public long sendStartTimestamp;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @JvmField
        public long sendEndTimestamp;
    }

    public ss8() {
        this.pageLiveData = new OLiveData<>();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getBorderEndTime() {
        return this.borderEndTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getBorderStartTime() {
        return this.borderStartTime;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCurrentItemIndex() {
        return this.currentItemIndex;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getLastRequestTime() {
        return this.lastRequestTime;
    }

    @NotNull
    public final OLiveData<b> e() {
        return this.pageLiveData;
    }

    public final void f(long curTime, int rangeDay, int divideHour, boolean isSlide) {
        mq8 mq8Var = mq8.INSTANCE;
        a7b.f(TAG, "getRequestTimeRange:" + mq8Var.q(curTime, "yyy-MM-dd HH:mm") + "/borderStartTime:" + mq8Var.q(this.borderStartTime, "yyy-MM-dd HH:mm") + "/borderEndTime:" + mq8Var.q(this.borderEndTime, "yyy-MM-dd HH:mm"));
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        this.lastRequestTime = curTime;
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(curTime), zoneIdSystemDefault);
        LocalDateTime localDateTimeWithNano = localDateTimeOfInstant.getHour() >= divideHour ? LocalDateTime.of(localDateTimeOfInstant.toLocalDate(), LocalTime.MIN).withHour(divideHour).withMinute(0).withSecond(0).withNano(0) : LocalDateTime.of(localDateTimeOfInstant.toLocalDate().minusDays(1L), LocalTime.MIN).withHour(divideHour).withMinute(0).withSecond(0).withNano(0);
        if (isSlide) {
            if (curTime >= this.lastDaySleepStartTime || curTime <= this.borderStartTime) {
                a7b.f(TAG, "time range error");
                return;
            }
        } else if (curTime > this.lastDaySleepStartTime || curTime < this.borderStartTime) {
            a7b.f(TAG, "time range error");
            return;
        }
        long j2 = rangeDay / 2;
        long epochMilli = LocalDateTime.of(localDateTimeWithNano.toLocalDate().minusDays(j2), LocalTime.MIN).withHour(divideHour).withMinute(0).withSecond(0).withNano(0).atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
        long epochMilli2 = LocalDateTime.of(localDateTimeWithNano.toLocalDate().plusDays(j2 + 1), LocalTime.MIN).withHour(divideHour).withMinute(0).withSecond(0).withNano(0).atZone(zoneIdSystemDefault).toInstant().toEpochMilli() - 1;
        long j3 = this.borderStartTime;
        if (epochMilli < j3) {
            epochMilli = j3;
        }
        long j4 = this.borderEndTime;
        if (epochMilli2 > j4) {
            epochMilli2 = j4;
        }
        this.currentItemIndex = RangesKt___RangesKt.coerceAtLeast((int) (localDateTimeWithNano.toLocalDate().toEpochDay() - LocalDateTime.ofInstant(Instant.ofEpochMilli(epochMilli), zoneIdSystemDefault).toLocalDate().toEpochDay()), 0);
        String strQ = mq8Var.q(epochMilli, "yyy-MM-dd HH:mm");
        String strQ2 = mq8Var.q(epochMilli2, "yyy-MM-dd HH:mm");
        int i = this.currentItemIndex;
        StringBuilder sb = new StringBuilder();
        sb.append("result:");
        sb.append(strQ);
        sb.append("/sendEndTimestamp:");
        sb.append(strQ2);
        sb.append("/currentItemIndex:");
        sb.append(i);
        OLiveData<b> oLiveData = this.pageLiveData;
        b bVar = new b();
        bVar.sendStartTimestamp = epochMilli;
        bVar.sendEndTimestamp = epochMilli2;
        oLiveData.postValue(bVar);
    }

    public final void g(long j2) {
        this.borderStartTime = j2;
    }

    public ss8(long j2, long j3) {
        this();
        this.borderStartTime = j2;
        this.borderEndTime = j3;
        this.lastDaySleepStartTime = mq8.INSTANCE.o(j3);
    }
}
