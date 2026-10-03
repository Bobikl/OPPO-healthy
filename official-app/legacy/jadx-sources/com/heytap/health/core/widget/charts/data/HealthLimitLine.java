package com.heytap.health.core.widget.charts.data;

import com.github.mikephil.charting.components.LimitLine;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0014B\u0019\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\"\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u0007\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/core/widget/charts/data/HealthLimitLine;", "Lcom/github/mikephil/charting/components/LimitLine;", "", "value", "", "c", "b", "a", UserInfo.SEX_FEMALE, "Lcom/heytap/health/core/widget/charts/data/HealthLimitLine$LimitLabelPosition2;", "Lcom/heytap/health/core/widget/charts/data/HealthLimitLine$LimitLabelPosition2;", "()Lcom/heytap/health/core/widget/charts/data/HealthLimitLine$LimitLabelPosition2;", "d", "(Lcom/heytap/health/core/widget/charts/data/HealthLimitLine$LimitLabelPosition2;)V", "limitLabelPosition2", "limit", "", Feedback.WIDGET_LABEL, "<init>", "(FLjava/lang/String;)V", "LimitLabelPosition2", "lib_chart_release"}, k = 1, mv = {1, 8, 0})
public final class HealthLimitLine extends LimitLine {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public float value;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public LimitLabelPosition2 limitLabelPosition2;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/health/core/widget/charts/data/HealthLimitLine$LimitLabelPosition2;", "", "(Ljava/lang/String;I)V", "LEFT", "TOP", "RIGHT", "BOTTOM", "lib_chart_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum LimitLabelPosition2 {
        LEFT,
        TOP,
        RIGHT,
        BOTTOM
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthLimitLine(float f, @NotNull String label) {
        super(f, label);
        Intrinsics.checkNotNullParameter(label, "label");
        this.limitLabelPosition2 = LimitLabelPosition2.LEFT;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final LimitLabelPosition2 getLimitLabelPosition2() {
        return this.limitLabelPosition2;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    public final void c(float value) {
        this.value = value;
    }

    public final void d(@NotNull LimitLabelPosition2 limitLabelPosition2) {
        Intrinsics.checkNotNullParameter(limitLabelPosition2, "<set-?>");
        this.limitLabelPosition2 = limitLabelPosition2;
    }
}
