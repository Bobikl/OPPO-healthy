package com.oplus.utrace.utils;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\bH\u0002J\u0014\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rR\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/oplus/utrace/utils/Interval;", "", "window", "", "(J)V", "checkTime", "execTime", "check", "", "checkInternal", "exec", "", "block", "Lkotlin/Function0;", "Companion", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Interval {
    public static final long DEFAULT_WINDOW = 60000;
    private static final long MIN_CHECK_INTERVAL = 1000;
    private long checkTime;
    private long execTime;
    private final long window;

    public Interval() {
        this(0L, 1, null);
    }

    private final boolean checkInternal() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.checkTime < 1000) {
            return false;
        }
        this.checkTime = jCurrentTimeMillis;
        long j = this.window;
        if (jCurrentTimeMillis / j == this.execTime / j) {
            return false;
        }
        this.execTime = jCurrentTimeMillis;
        return true;
    }

    public final boolean check() {
        return checkInternal();
    }

    public final void exec(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (checkInternal()) {
            block.invoke();
        }
    }

    public Interval(long j) {
        this.window = j;
    }

    public /* synthetic */ Interval(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 60000L : j);
    }
}
