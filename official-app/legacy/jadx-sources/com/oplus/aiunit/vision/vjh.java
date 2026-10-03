package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0014\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u0016\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\f\u001a\u0004\b\u000b\u0010\u000e\"\u0004\b\u0015\u0010\u0010R\"\u0010\u0019\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0003\u0010\u000e\"\u0004\b\u0018\u0010\u0010R$\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/oplus/aiunit/vision/vjh;", "", "", "a", "Z", "f", "()Z", MapSchema.FIELD_NAME_KEY, "(Z)V", "isNoData", "", "b", "I", "d", "()I", "j", "(I)V", "minHeartRate", "c", "i", "maxHeartRate", b2n.g, "intervalLow", MapSchema.FIELD_NAME_ENTRY, b2n.f, "intervalHigh", "Lcom/oplus/aiunit/vision/lhh;", "Lcom/oplus/aiunit/vision/lhh;", "()Lcom/oplus/aiunit/vision/lhh;", LogFieldKey.LEVEL_KEY, "(Lcom/oplus/aiunit/vision/lhh;)V", "sleepHRAverageBean", "<init>", "()V", "sleep_heartrate_release"}, k = 1, mv = {1, 8, 0})
public final class vjh {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean isNoData = true;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int minHeartRate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int maxHeartRate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int intervalLow;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int intervalHigh;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public lhh sleepHRAverageBean;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getIntervalHigh() {
        return this.intervalHigh;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getIntervalLow() {
        return this.intervalLow;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMinHeartRate() {
        return this.minHeartRate;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final lhh getSleepHRAverageBean() {
        return this.sleepHRAverageBean;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsNoData() {
        return this.isNoData;
    }

    public final void g(int i) {
        this.intervalHigh = i;
    }

    public final void h(int i) {
        this.intervalLow = i;
    }

    public final void i(int i) {
        this.maxHeartRate = i;
    }

    public final void j(int i) {
        this.minHeartRate = i;
    }

    public final void k(boolean z) {
        this.isNoData = z;
    }

    public final void l(@Nullable lhh lhhVar) {
        this.sleepHRAverageBean = lhhVar;
    }
}
