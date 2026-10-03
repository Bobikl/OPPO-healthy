package com.health.sleep_breath_rate.day.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.heytap.health.base.livedata.OLiveData;
import com.oplus.aiunit.vision.q15;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR$\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/health/sleep_breath_rate/day/viewmodel/SleepBRDayControlModel;", "Landroidx/lifecycle/ViewModel;", "", "curSelectTime", "", "u", "i", "J", "v", "()J", "A", "(J)V", "borderStartTime", "j", "getBorderEndTime", "z", "borderEndTime", "", "<set-?>", "k", "Z", "x", "()Z", "isFirstDay", "l", "y", "isLastDay", "Lcom/heytap/health/base/livedata/OLiveData;", "m", "Lcom/heytap/health/base/livedata/OLiveData;", "w", "()Lcom/heytap/health/base/livedata/OLiveData;", "refreshViewOLive", "<init>", "()V", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
public final class SleepBRDayControlModel extends ViewModel {
    public static final int $stable = 8;
    public long i;
    public long j;
    public boolean k;
    public boolean l;

    @NotNull
    public final OLiveData<Long> m = new OLiveData<>();

    public final void A(long j) {
        this.i = j;
    }

    public final void u(long curSelectTime) {
        long j = this.i;
        this.k = curSelectTime <= j || j == 0;
        long j2 = this.j;
        this.l = curSelectTime >= j2 || j2 == 0;
        String strA = q15.a(j, "yyyy-MM-dd HH:mm:ss");
        String strA2 = q15.a(this.j, "yyyy-MM-dd HH:mm:ss");
        String strA3 = q15.a(curSelectTime, "yyyy-MM-dd HH:mm:ss");
        boolean z = this.k;
        boolean z2 = this.l;
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
        this.m.postValue(Long.valueOf(curSelectTime));
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final long getI() {
        return this.i;
    }

    @NotNull
    public final OLiveData<Long> w() {
        return this.m;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getK() {
        return this.k;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final boolean getL() {
        return this.l;
    }

    public final void z(long j) {
        this.j = j;
    }
}
