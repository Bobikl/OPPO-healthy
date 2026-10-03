package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.healthbase.util.HealthFrgType;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0006R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\f\u0010\u0006R\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u0016\u0010\u001f\"\u0004\b \u0010!R\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\b\u0010\u001f\"\u0004\b#\u0010!¨\u0006'"}, d2 = {"Lcom/oplus/aiunit/vision/d79;", "", "", "Lcom/oplus/aiunit/vision/b79;", "a", "Ljava/util/List;", "()Ljava/util/List;", "dayWarnList", "b", "d", "monthWarnList", "Lcom/oplus/aiunit/vision/f79;", "c", "mergeLabelList", "", "I", b2n.f, "()I", MapSchema.FIELD_NAME_KEY, "(I)V", "warningCount", "Lcom/heytap/health/healthbase/util/HealthFrgType;", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/health/healthbase/util/HealthFrgType;", "f", "()Lcom/heytap/health/healthbase/util/HealthFrgType;", "j", "(Lcom/heytap/health/healthbase/util/HealthFrgType;)V", "type", "", "J", "()J", "i", "(J)V", "startTime", b2n.g, "endTime", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class d79 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int warningCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public long startTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public long endTime;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<HeartRateWarnDayBean> dayWarnList = new ArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<HeartRateWarnDayBean> monthWarnList = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<HeartRateWarnLabelBean> mergeLabelList = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public HealthFrgType type = HealthFrgType.DAY;

    @NotNull
    public final List<HeartRateWarnDayBean> a() {
        return this.dayWarnList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final List<HeartRateWarnLabelBean> c() {
        return this.mergeLabelList;
    }

    @NotNull
    public final List<HeartRateWarnDayBean> d() {
        return this.monthWarnList;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final HealthFrgType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getWarningCount() {
        return this.warningCount;
    }

    public final void h(long j2) {
        this.endTime = j2;
    }

    public final void i(long j2) {
        this.startTime = j2;
    }

    public final void j(@NotNull HealthFrgType healthFrgType) {
        Intrinsics.checkNotNullParameter(healthFrgType, "<set-?>");
        this.type = healthFrgType;
    }

    public final void k(int i) {
        this.warningCount = i;
    }
}
