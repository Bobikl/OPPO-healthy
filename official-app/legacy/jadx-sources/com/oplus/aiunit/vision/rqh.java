package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR\"\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0005\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\"\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0005\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\"\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\u001a\u0010\tR\"\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0005\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u001c\u0010\tR\"\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u001e\u0010\t¨\u0006\""}, d2 = {"Lcom/oplus/aiunit/vision/rqh;", "", "", "a", "", "I", b2n.g, "()I", "setTotalSleepAverageTime", "(I)V", "totalSleepAverageTime", "b", MapSchema.FIELD_NAME_ENTRY, "j", "totalDeepSleepAverageTime", "c", "f", MapSchema.FIELD_NAME_KEY, "totalLightSleepAverageTime", "d", b2n.f, LogFieldKey.LEVEL_KEY, "totalRemSleepAverageTime", "i", LogFieldKey.MESSAGE_KEY, "totalWakeSleepAverageTime", "setDeepSleepScale", "deepSleepScale", "setLightSleepScale", "lightSleepScale", "setRemSleepScale", "remSleepScale", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class rqh {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int totalSleepAverageTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int totalDeepSleepAverageTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int totalLightSleepAverageTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int totalRemSleepAverageTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int totalWakeSleepAverageTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int deepSleepScale;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int lightSleepScale;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int remSleepScale;

    public final void a() {
        int i = this.totalDeepSleepAverageTime;
        int i2 = this.totalLightSleepAverageTime + i + this.totalRemSleepAverageTime;
        this.totalSleepAverageTime = i2;
        if (i2 > 0) {
            if (i > 0) {
                this.deepSleepScale = (int) Math.ceil((i * 100.0f) / i2);
            }
            int i3 = this.totalRemSleepAverageTime;
            if (i3 > 0) {
                this.remSleepScale = (int) Math.ceil((i3 * 100.0f) / this.totalSleepAverageTime);
            }
        }
        this.lightSleepScale = (100 - this.deepSleepScale) - this.remSleepScale;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getDeepSleepScale() {
        return this.deepSleepScale;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getLightSleepScale() {
        return this.lightSleepScale;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getRemSleepScale() {
        return this.remSleepScale;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getTotalDeepSleepAverageTime() {
        return this.totalDeepSleepAverageTime;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getTotalLightSleepAverageTime() {
        return this.totalLightSleepAverageTime;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getTotalRemSleepAverageTime() {
        return this.totalRemSleepAverageTime;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getTotalSleepAverageTime() {
        return this.totalSleepAverageTime;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getTotalWakeSleepAverageTime() {
        return this.totalWakeSleepAverageTime;
    }

    public final void j(int i) {
        this.totalDeepSleepAverageTime = i;
    }

    public final void k(int i) {
        this.totalLightSleepAverageTime = i;
    }

    public final void l(int i) {
        this.totalRemSleepAverageTime = i;
    }

    public final void m(int i) {
        this.totalWakeSleepAverageTime = i;
    }
}
