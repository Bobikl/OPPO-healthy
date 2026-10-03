package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.sleep.snore.SnoreHistoryActivity;
import com.heytap.log.formatter.LogFieldKey;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u0003\u001a\u00020\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u000f\u001a\u00020\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\"\u0010\u0012\u001a\u00020\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/zf9;", "Lcom/oplus/aiunit/vision/ap8;", "", "curDayTime", "", "r", LogFieldKey.PROCESS_NAME_KEY, "J", "getCurDayTime", "()J", "setCurDayTime", "(J)V", "q", "getCurDayStartTime", "setCurDayStartTime", SnoreHistoryActivity.CUR_DAY_START_TIME, "getCurDayEndTime", "setCurDayEndTime", SnoreHistoryActivity.CUR_DAY_END_TIME, "<init>", "()V", "hrv_release"}, k = 1, mv = {1, 8, 0})
public abstract class zf9 extends ap8 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public long curDayTime;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public long curDayStartTime;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public long curDayEndTime;

    public final void r(long curDayTime) {
        this.curDayTime = curDayTime;
        mq8 mq8Var = mq8.INSTANCE;
        this.curDayStartTime = mq8Var.o(curDayTime);
        this.curDayEndTime = mq8Var.n(curDayTime);
    }
}
