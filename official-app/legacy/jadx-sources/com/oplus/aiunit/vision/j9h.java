package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b.\u0010/R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\"\u0010\u0017\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR\"\u0010\u0019\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0018\u0010\u000fR\"\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\u001a\u0010\u0005\"\u0004\b\u001b\u0010\u0007R\"\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001d\u0010\u0005\"\u0004\b\u001e\u0010\u0007R(\u0010&\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\"\u001a\u0004\b\n\u0010#\"\u0004\b$\u0010%R\"\u0010-\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*\"\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/oplus/aiunit/vision/j9h;", "", "", "a", "J", "()J", "j", "(J)V", "curDayMinTimestamp", "", "b", UserInfo.SEX_FEMALE, "f", "()F", LogFieldKey.PROCESS_NAME_KEY, "(F)V", "minValue", "c", MapSchema.FIELD_NAME_ENTRY, "o", "maxValue", "d", "n", "lowThreshold", LogFieldKey.MESSAGE_KEY, "highThreshold", b2n.g, "r", "sleepStartTime", b2n.f, "q", "sleepEndTime", "", "Lcom/oplus/aiunit/vision/bzj;", "Ljava/util/List;", "()Ljava/util/List;", MapSchema.FIELD_NAME_KEY, "(Ljava/util/List;)V", "dataList", "", "i", "Z", "()Z", LogFieldKey.LEVEL_KEY, "(Z)V", "isEmpty", "<init>", "()V", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
public final class j9h {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public long curDayMinTimestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public float minValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public float maxValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public float lowThreshold;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public float highThreshold;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public long sleepStartTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public long sleepEndTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public List<TimeStampedCandleData> dataList = new ArrayList();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean isEmpty = true;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCurDayMinTimestamp() {
        return this.curDayMinTimestamp;
    }

    @NotNull
    public final List<TimeStampedCandleData> b() {
        return this.dataList;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getHighThreshold() {
        return this.highThreshold;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getLowThreshold() {
        return this.lowThreshold;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getMaxValue() {
        return this.maxValue;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getMinValue() {
        return this.minValue;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getSleepEndTime() {
        return this.sleepEndTime;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getSleepStartTime() {
        return this.sleepStartTime;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsEmpty() {
        return this.isEmpty;
    }

    public final void j(long j2) {
        this.curDayMinTimestamp = j2;
    }

    public final void k(@NotNull List<TimeStampedCandleData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dataList = list;
    }

    public final void l(boolean z) {
        this.isEmpty = z;
    }

    public final void m(float f) {
        this.highThreshold = f;
    }

    public final void n(float f) {
        this.lowThreshold = f;
    }

    public final void o(float f) {
        this.maxValue = f;
    }

    public final void p(float f) {
        this.minValue = f;
    }

    public final void q(long j2) {
        this.sleepEndTime = j2;
    }

    public final void r(long j2) {
        this.sleepStartTime = j2;
    }
}
