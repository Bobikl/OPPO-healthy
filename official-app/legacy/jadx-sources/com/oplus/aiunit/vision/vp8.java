package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.assistantscreen.ControlCenter;
import com.oplus.cardwidget.domain.pack.BaseDataPack;
import com.oplus.smartenginehelper.dsl.DSLCoder;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/vp8;", "Lcom/oplus/cardwidget/domain/pack/BaseDataPack;", "Lcom/oplus/smartenginehelper/dsl/DSLCoder;", "coder", "", "onPack", "Lcom/oplus/aiunit/vision/kp8;", "a", "Lcom/oplus/aiunit/vision/kp8;", "healthCardData", "<init>", "(Lcom/oplus/aiunit/vision/kp8;)V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public final class vp8 extends BaseDataPack {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final HealthCardData healthCardData;

    public vp8(@NotNull HealthCardData healthCardData) {
        Intrinsics.checkNotNullParameter(healthCardData, "healthCardData");
        this.healthCardData = healthCardData;
    }

    @Override // com.oplus.cardwidget.domain.pack.BaseDataPack
    public boolean onPack(@NotNull DSLCoder coder) throws JSONException {
        Intrinsics.checkNotNullParameter(coder, "coder");
        z7b.f(ControlCenter.TAG, "onPack, current HealthCardData: " + this.healthCardData);
        coder.setCustomData("day_act_view", "title", this.healthCardData.getTitle());
        coder.setCustomData("day_act_view", "noDataTip", this.healthCardData.getNoDataTip());
        coder.setCustomData("day_act_view", "stepMaxProgress", Integer.valueOf(this.healthCardData.getStepMax()));
        coder.setCustomData("day_act_view", "stepCurProgress", Integer.valueOf(this.healthCardData.getStepCurProgress()));
        coder.setCustomData("day_act_view", "consumeMaxProgress", Integer.valueOf(this.healthCardData.getConsume()));
        coder.setCustomData("day_act_view", "consumeCurProgress", Integer.valueOf(this.healthCardData.getConsume()));
        coder.setCustomData("day_act_view", "exerciseMaxProgress", Integer.valueOf(this.healthCardData.getExercise()));
        coder.setCustomData("day_act_view", "exerciseCurProgress", Integer.valueOf(this.healthCardData.getExercise()));
        coder.setCustomData("day_act_view", "actMaxProgress", Integer.valueOf(this.healthCardData.getAct()));
        coder.setCustomData("day_act_view", "actCurProgress", Integer.valueOf(this.healthCardData.getAct()));
        coder.setCustomData("day_act_view", "spo2Title", this.healthCardData.getSpo2Title());
        coder.setCustomData("day_act_view", "spo2NoData", Boolean.valueOf(this.healthCardData.getSpo2NoData()));
        coder.setCustomData("day_act_view", "spo2Value", this.healthCardData.getSpo2Value());
        coder.setCustomData("day_act_view", "spo2Unit", this.healthCardData.getSpo2Unit());
        coder.setCustomData("day_act_view", "spo2LastData", this.healthCardData.getSpo2LastData());
        coder.setCustomData("day_act_view", "heartRateTitle", this.healthCardData.getHeartRateTitle());
        coder.setCustomData("day_act_view", "heartRateNoData", Boolean.valueOf(this.healthCardData.getHeartRateNoData()));
        coder.setCustomData("day_act_view", "heartRateValue", this.healthCardData.getHeartRateValue());
        coder.setCustomData("day_act_view", "heartRateUnit", this.healthCardData.getHeartRateUnit());
        coder.setCustomData("day_act_view", "heartRateLastData", this.healthCardData.getHeartRateLastData());
        coder.setCustomData("day_act_view", "sleepTitle", this.healthCardData.getSleepTitle());
        coder.setCustomData("day_act_view", "sleepTime", Integer.valueOf(this.healthCardData.getSleepTime()));
        coder.setCustomData("day_act_view", "sleepLastData", this.healthCardData.getSleepLastData());
        coder.setCustomData("day_act_view", "hourUnit", this.healthCardData.getHourUnit());
        coder.setCustomData("day_act_view", "minuteUnit", this.healthCardData.getMinuteUnit());
        return true;
    }
}
