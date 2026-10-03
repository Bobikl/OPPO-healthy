package com.health.sleep_breath_rate.day.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.sleep.snore.SnoreHistoryActivity;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.x05;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR$\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/health/sleep_breath_rate/day/viewmodel/SleepBRDayControlModel;", "Landroidx/lifecycle/ViewModel;", "", "curSelectTime", "", "u", "i", "J", "v", "()J", "A", "(J)V", SnoreHistoryActivity.BORDER_START_TIME, "j", "getBorderEndTime", "z", SnoreHistoryActivity.BORDER_END_TIME, "", "<set-?>", MapSchema.FIELD_NAME_KEY, "Z", "x", "()Z", "isFirstDay", LogFieldKey.LEVEL_KEY, "y", "isLastDay", "Lcom/heytap/health/base/livedata/OLiveData;", LogFieldKey.MESSAGE_KEY, "Lcom/heytap/health/base/livedata/OLiveData;", "w", "()Lcom/heytap/health/base/livedata/OLiveData;", "refreshViewOLive", "<init>", "()V", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
public final class SleepBRDayControlModel extends ViewModel {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public long borderStartTime;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public long borderEndTime;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean isFirstDay;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public boolean isLastDay;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final OLiveData<Long> refreshViewOLive = new OLiveData<>();

    public final void A(long j2) {
        this.borderStartTime = j2;
    }

    public final void u(long curSelectTime) {
        long j2 = this.borderStartTime;
        this.isFirstDay = curSelectTime <= j2 || j2 == 0;
        long j3 = this.borderEndTime;
        this.isLastDay = curSelectTime >= j3 || j3 == 0;
        String strA = x05.a(j2, "yyyy-MM-dd HH:mm:ss");
        String strA2 = x05.a(this.borderEndTime, "yyyy-MM-dd HH:mm:ss");
        String strA3 = x05.a(curSelectTime, "yyyy-MM-dd HH:mm:ss");
        boolean z = this.isFirstDay;
        boolean z2 = this.isLastDay;
        StringBuilder sb = new StringBuilder();
        sb.append("setCurSleepDayBean startTimestamp:");
        sb.append(strA);
        sb.append("/endTimestamp:");
        sb.append(strA2);
        sb.append("/curDataTime:");
        sb.append(strA3);
        sb.append("/");
        sb.append(z);
        sb.append("/");
        sb.append(z2);
        this.refreshViewOLive.postValue(Long.valueOf(curSelectTime));
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final long getBorderStartTime() {
        return this.borderStartTime;
    }

    @NotNull
    public final OLiveData<Long> w() {
        return this.refreshViewOLive;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getIsFirstDay() {
        return this.isFirstDay;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final boolean getIsLastDay() {
        return this.isLastDay;
    }

    public final void z(long j2) {
        this.borderEndTime = j2;
    }
}
