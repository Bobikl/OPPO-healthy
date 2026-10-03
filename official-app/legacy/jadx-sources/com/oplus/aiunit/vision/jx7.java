package com.oplus.aiunit.vision;

import android.os.SystemClock;
import android.util.Log;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0016\u0010\r\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/jx7;", "", "", "a", "", "fps", "", "b", "(Ljava/lang/Integer;)V", "", "Ljava/lang/Long;", "invalidateGap", "J", "lastInvalidateTime", "<init>", "()V", "Companion", "rsview.1.1.0_release"}, k = 1, mv = {1, 9, 0})
public final class jx7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public Long invalidateGap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long lastInvalidateTime;

    public final boolean a() {
        if (this.invalidateGap == null) {
            return true;
        }
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        Long l2 = this.invalidateGap;
        boolean z = false;
        if (l2 != null) {
            z = jElapsedRealtimeNanos - this.lastInvalidateTime >= l2.longValue();
        }
        if (z) {
            this.lastInvalidateTime = jElapsedRealtimeNanos;
        }
        return z;
    }

    public final void b(@Nullable Integer fps) {
        if (fps == null || fps.intValue() <= 0) {
            this.invalidateGap = null;
            Log.d("FpsControl", "invalidateGap null");
            return;
        }
        Long lValueOf = Long.valueOf(960000000 / ((long) fps.intValue()));
        this.invalidateGap = lValueOf;
        Log.d("FpsControl", "fps:" + fps + ", invalidateGap:" + lValueOf);
    }
}
