package com.heytap.health.sleep.formula;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.sleep.formula.formula.OsaSleepBean;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/heytap/health/sleep/formula/SnoreSleepBean;", "Lcom/heytap/health/sleep/formula/formula/OsaSleepBean;", "()V", "sleepInTime", "", "getSleepInTime", "()J", "setSleepInTime", "(J)V", "sleepOutTime", "getSleepOutTime", "setSleepOutTime", "sleep_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SnoreSleepBean extends OsaSleepBean {
    public static final int $stable = 8;
    private long sleepInTime;
    private long sleepOutTime;

    public final long getSleepInTime() {
        return this.sleepInTime;
    }

    public final long getSleepOutTime() {
        return this.sleepOutTime;
    }

    public final void setSleepInTime(long j2) {
        this.sleepInTime = j2;
    }

    public final void setSleepOutTime(long j2) {
        this.sleepOutTime = j2;
    }
}
