package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/wjh;", "", "", "sleepInTime", "a", "sleepOutTime", "b", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class wjh {
    public static final int $stable = 0;

    @NotNull
    public static final wjh INSTANCE = new wjh();

    public final int a(int sleepInTime) {
        if (sleepInTime >= 1200) {
            return sleepInTime;
        }
        if (sleepInTime >= 720) {
            return sleepInTime + weg.WINDOW_NIGHT_END;
        }
        return -1;
    }

    public final int b(int sleepOutTime) {
        return sleepOutTime < 1200 ? sleepOutTime + weg.WINDOW_NIGHT_END : sleepOutTime;
    }
}
