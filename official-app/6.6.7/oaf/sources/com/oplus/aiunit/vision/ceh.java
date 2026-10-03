package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u0003\u001a\u00020\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u000f\u001a\u00020\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\"\u0010\u0012\u001a\u00020\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/ceh;", "Lcom/oplus/aiunit/vision/dq8;", "", "curDayTime", "", "r", "p", "J", "getCurDayTime", "()J", "setCurDayTime", "(J)V", "q", "getCurDayStartTime", "setCurDayStartTime", "curDayStartTime", "getCurDayEndTime", "setCurDayEndTime", "curDayEndTime", "<init>", "()V", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
public abstract class ceh extends dq8 {
    public static final int $stable = 8;
    public long p;
    public long q;
    public long r;

    public final void r(long curDayTime) {
        this.p = curDayTime;
        pr8 pr8Var = pr8.INSTANCE;
        this.q = pr8Var.o(curDayTime);
        this.r = pr8Var.n(curDayTime);
    }
}
