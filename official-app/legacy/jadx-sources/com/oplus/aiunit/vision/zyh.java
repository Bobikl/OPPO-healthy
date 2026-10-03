package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.core.widget.charts.data.SnoreLevelData;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b'\u0010(R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000f\u0010\bR\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\"\u0010\u001a\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001d\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\"\u0010\u001f\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\r\u0010\u0017\"\u0004\b\u001e\u0010\u0019R*\u0010&\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u001a\u0004\b\u0003\u0010#\"\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/oplus/aiunit/vision/zyh;", "", "", "a", "J", b2n.g, "()J", LogFieldKey.PROCESS_NAME_KEY, "(J)V", "startTime", "b", "j", "endTime", "c", MapSchema.FIELD_NAME_ENTRY, LogFieldKey.MESSAGE_KEY, "lastWeekStartTime", "d", LogFieldKey.LEVEL_KEY, "lastWeekEndTime", "", "I", "f", "()I", "n", "(I)V", "leftIndex", b2n.f, "o", "rightIndex", MapSchema.FIELD_NAME_KEY, "lastRangeLeftIndex", "", "Lcom/heytap/health/core/widget/charts/data/SnoreLevelData;", "Ljava/util/List;", "()Ljava/util/List;", "i", "(Ljava/util/List;)V", "dataList", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class zyh {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public long startTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long endTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public long lastWeekStartTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long lastWeekEndTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int leftIndex;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int rightIndex;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int lastRangeLeftIndex;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public List<SnoreLevelData> dataList;

    @Nullable
    public final List<SnoreLevelData> a() {
        return this.dataList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getLastRangeLeftIndex() {
        return this.lastRangeLeftIndex;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getLastWeekEndTime() {
        return this.lastWeekEndTime;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getLastWeekStartTime() {
        return this.lastWeekStartTime;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getLeftIndex() {
        return this.leftIndex;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getRightIndex() {
        return this.rightIndex;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    public final void i(@Nullable List<SnoreLevelData> list) {
        this.dataList = list;
    }

    public final void j(long j2) {
        this.endTime = j2;
    }

    public final void k(int i) {
        this.lastRangeLeftIndex = i;
    }

    public final void l(long j2) {
        this.lastWeekEndTime = j2;
    }

    public final void m(long j2) {
        this.lastWeekStartTime = j2;
    }

    public final void n(int i) {
        this.leftIndex = i;
    }

    public final void o(int i) {
        this.rightIndex = i;
    }

    public final void p(long j2) {
        this.startTime = j2;
    }
}
