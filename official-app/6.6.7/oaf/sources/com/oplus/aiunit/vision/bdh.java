package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.health.sleep_breath_rate.SleepBRHistoryActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b.\u0010/R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\"\u0010\u0017\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR\"\u0010\u0019\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0018\u0010\u000fR\"\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\u001a\u0010\u0005\"\u0004\b\u001b\u0010\u0007R\"\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001d\u0010\u0005\"\u0004\b\u001e\u0010\u0007R(\u0010&\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\"\u001a\u0004\b\n\u0010#\"\u0004\b$\u0010%R\"\u0010-\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*\"\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/oplus/aiunit/vision/bdh;", "", "", "a", "J", "()J", "j", "(J)V", "curDayMinTimestamp", "", "b", "F", "f", "()F", "p", "(F)V", "minValue", "c", "e", "o", "maxValue", "d", "n", "lowThreshold", "m", "highThreshold", "h", "r", SleepBRHistoryActivity.SLEEP_START_TIME, "g", "q", SleepBRHistoryActivity.SLEEP_END_TIME, "", "Lcom/oplus/aiunit/vision/d3k;", "Ljava/util/List;", "()Ljava/util/List;", "k", "(Ljava/util/List;)V", "dataList", "", "i", "Z", "()Z", "l", "(Z)V", "isEmpty", "<init>", "()V", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
public final class bdh {
    public static final int $stable = 8;
    public long a;
    public float b;
    public float c;
    public float d;
    public float e;
    public long f;
    public long g;

    @NotNull
    public List<d3k> h = new ArrayList();
    public boolean i = true;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getA() {
        return this.a;
    }

    @NotNull
    public final List<d3k> b() {
        return this.h;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getC() {
        return this.c;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getB() {
        return this.b;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getG() {
        return this.g;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getF() {
        return this.f;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getI() {
        return this.i;
    }

    public final void j(long j) {
        this.a = j;
    }

    public final void k(@NotNull List<d3k> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.h = list;
    }

    public final void l(boolean z) {
        this.i = z;
    }

    public final void m(float f) {
        this.e = f;
    }

    public final void n(float f) {
        this.d = f;
    }

    public final void o(float f) {
        this.c = f;
    }

    public final void p(float f) {
        this.b = f;
    }

    public final void q(long j) {
        this.g = j;
    }

    public final void r(long j) {
        this.f = j;
    }
}
