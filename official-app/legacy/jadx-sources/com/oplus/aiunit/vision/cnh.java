package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b-\u0010.R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0018\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\"\u0010\u001a\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012\"\u0004\b\u0019\u0010\u0014R\"\u0010\u001d\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u0003\u0010\u0012\"\u0004\b\u001c\u0010\u0014R(\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b\u001b\u0010 \"\u0004\b!\u0010\"R(\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\n\u0010 \"\u0004\b$\u0010\"R$\u0010,\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)\"\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/oplus/aiunit/vision/cnh;", "", "", "a", "I", b2n.g, "()I", "q", "(I)V", "beforeSleepAverageScore", "b", "d", LogFieldKey.MESSAGE_KEY, "afterSleepAverageScore", "", "c", "J", b2n.f, "()J", LogFieldKey.PROCESS_NAME_KEY, "(J)V", "beforeChartLowestVisibleTime", MapSchema.FIELD_NAME_ENTRY, "n", "beforeChartHighestVisibleTime", LogFieldKey.LEVEL_KEY, "afterChartLowestVisibleTime", "f", "j", "afterChartHighestVisibleTime", "", "Ljava/util/List;", "()Ljava/util/List;", "o", "(Ljava/util/List;)V", "beforeChartList", MapSchema.FIELD_NAME_KEY, "afterChartList", "Lcom/oplus/aiunit/vision/cnh$a;", "i", "Lcom/oplus/aiunit/vision/cnh$a;", "()Lcom/oplus/aiunit/vision/cnh$a;", "r", "(Lcom/oplus/aiunit/vision/cnh$a;)V", "maxScore", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class cnh {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int beforeSleepAverageScore;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int afterSleepAverageScore;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public long beforeChartLowestVisibleTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long beforeChartHighestVisibleTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public long afterChartLowestVisibleTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public long afterChartHighestVisibleTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public List<Integer> beforeChartList = new ArrayList();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public List<Integer> afterChartList = new ArrayList();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public a maxScore;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/cnh$a;", "", "", "a", "I", "()I", "c", "(I)V", "sleepScore", "", "b", "J", "()J", "d", "(J)V", "timestamp", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public int sleepScore;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public long timestamp;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getSleepScore() {
            return this.sleepScore;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        public final void c(int i) {
            this.sleepScore = i;
        }

        public final void d(long j2) {
            this.timestamp = j2;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAfterChartHighestVisibleTime() {
        return this.afterChartHighestVisibleTime;
    }

    @NotNull
    public final List<Integer> b() {
        return this.afterChartList;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getAfterChartLowestVisibleTime() {
        return this.afterChartLowestVisibleTime;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getAfterSleepAverageScore() {
        return this.afterSleepAverageScore;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getBeforeChartHighestVisibleTime() {
        return this.beforeChartHighestVisibleTime;
    }

    @NotNull
    public final List<Integer> f() {
        return this.beforeChartList;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getBeforeChartLowestVisibleTime() {
        return this.beforeChartLowestVisibleTime;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getBeforeSleepAverageScore() {
        return this.beforeSleepAverageScore;
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final a getMaxScore() {
        return this.maxScore;
    }

    public final void j(long j2) {
        this.afterChartHighestVisibleTime = j2;
    }

    public final void k(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.afterChartList = list;
    }

    public final void l(long j2) {
        this.afterChartLowestVisibleTime = j2;
    }

    public final void m(int i) {
        this.afterSleepAverageScore = i;
    }

    public final void n(long j2) {
        this.beforeChartHighestVisibleTime = j2;
    }

    public final void o(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.beforeChartList = list;
    }

    public final void p(long j2) {
        this.beforeChartLowestVisibleTime = j2;
    }

    public final void q(int i) {
        this.beforeSleepAverageScore = i;
    }

    public final void r(@Nullable a aVar) {
        this.maxScore = aVar;
    }
}
