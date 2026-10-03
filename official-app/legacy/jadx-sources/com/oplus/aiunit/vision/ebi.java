package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.home.compose.HeadMetricField;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.SetsKt__SetsKt;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/ebi;", "", "", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "Lcom/oplus/aiunit/vision/th8;", "a", "Lcom/oplus/aiunit/vision/th8;", "RUN_SET", "b", "DISTANCE_SET", "c", "DURATION_SET", "", "d", "Ljava/util/Set;", "DISTANCE_SPORTS", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ebi {
    public static final int $stable;

    @NotNull
    public static final ebi INSTANCE = new ebi();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final HeadMetricSet RUN_SET;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final HeadMetricSet DISTANCE_SET;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final HeadMetricSet DURATION_SET;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Set<Integer> DISTANCE_SPORTS;

    static {
        HeadMetricField headMetricField = HeadMetricField.MONTH_RUN_DISTANCE;
        HeadMetricField headMetricField2 = HeadMetricField.TOTAL_TIME;
        RUN_SET = new HeadMetricSet(headMetricField, headMetricField2, HeadMetricField.TOTAL_RUN_DISTANCE);
        DISTANCE_SET = new HeadMetricSet(HeadMetricField.MONTH_DISTANCE, headMetricField2, HeadMetricField.TOTAL_DISTANCE);
        DURATION_SET = new HeadMetricSet(HeadMetricField.MONTH_TIME, HeadMetricField.TOTAL_CALORIES, headMetricField2);
        DISTANCE_SPORTS = SetsKt__SetsKt.setOf((Object[]) new Integer[]{101, 102, 104, 36, 37, 506});
        $stable = 8;
    }

    @NotNull
    public final HeadMetricSet a(int sportMode) {
        if (sportMode == 100) {
            return RUN_SET;
        }
        return DISTANCE_SPORTS.contains(Integer.valueOf(sportMode)) ? DISTANCE_SET : DURATION_SET;
    }
}
