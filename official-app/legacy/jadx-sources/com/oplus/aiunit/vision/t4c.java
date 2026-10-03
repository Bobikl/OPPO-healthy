package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.sport.model.MovingGoal;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u001e\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\tH\u0002R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/t4c;", "", "Lcom/oplus/aiunit/vision/lji;", "data", "Lcom/heytap/health/sport/model/MovingGoal;", "goal", "Lcom/oplus/aiunit/vision/s4c;", "target", "c", "", "seconds", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "d", MapSchema.FIELD_NAME_ENTRY, "", "a", "", "b", "Lcom/oplus/aiunit/vision/ov5;", "Lcom/oplus/aiunit/vision/ov5;", "distanceFormatter", "<init>", "(Lcom/oplus/aiunit/vision/ov5;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class t4c {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ov5 distanceFormatter;

    public t4c(@NotNull ov5 distanceFormatter) {
        Intrinsics.checkNotNullParameter(distanceFormatter, "distanceFormatter");
        this.distanceFormatter = distanceFormatter;
    }

    public final double a(lji data, MovingGoal goal) {
        double mDistance;
        double doubleValue;
        int goalType = goal.getGoalType();
        if (goalType == 0) {
            if (goal.getDoubleValue() == 0.0d) {
                return 0.0d;
            }
            mDistance = data.getMDistance();
            doubleValue = goal.getDoubleValue();
        } else if (goalType == 1) {
            if (goal.getDoubleValue() == 0.0d) {
                return 0.0d;
            }
            mDistance = data.getMCalories();
            doubleValue = goal.getDoubleValue();
        } else {
            if (goalType != 2) {
                return -1.0d;
            }
            if (goal.getLongValue() == 0) {
                return 0.0d;
            }
            mDistance = data.getMDuration();
            doubleValue = goal.getLongValue();
        }
        return mDistance / doubleValue;
    }

    public final String b(lji data, int sportMode) {
        if (sportMode != 3) {
            String strQ = nji.q(data.getMDistance() == 0.0d ? 0 : MovingData.INSTANCE.d((int) (data.getMDuration() / data.getMDistance())));
            Intrinsics.checkNotNullExpressionValue(strQ, "{\n            SportsForm…)\n            )\n        }");
            return strQ;
        }
        double dE = data.getMDuration() == 0.0d ? 0.0d : MovingData.INSTANCE.e((data.getMDistance() * 3600.0d) / data.getMDuration());
        String strM = dE < 0.1d ? "--" : nji.m(dE);
        Intrinsics.checkNotNullExpressionValue(strM, "{\n            val tempSp…aces(tempSpeed)\n        }");
        return strM;
    }

    @NotNull
    public final MovingData c(@NotNull lji data, @NotNull MovingGoal goal, @NotNull MovingData target) {
        String strR;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(goal, "goal");
        Intrinsics.checkNotNullParameter(target, "target");
        if (goal.getGoalType() == 2) {
            strR = nji.p(MovingData.INSTANCE.c((int) data.getMDuration()));
            Intrinsics.checkNotNullExpressionValue(strR, "{\n            SportsForm…ation.toInt()))\n        }");
        } else {
            strR = nji.r(MovingData.INSTANCE.c((int) data.getMDuration()));
            Intrinsics.checkNotNullExpressionValue(strR, "{\n            SportsForm…ation.toInt()))\n        }");
        }
        target.n(strR);
        MovingData.Companion companion = MovingData.INSTANCE;
        target.m(this.distanceFormatter.b(companion.b(data.getMDistance()), goal.getSportMode()));
        target.l(String.valueOf((int) companion.a(data.getMCalories())));
        String strI = nji.i(companion.f((int) data.getStep()));
        Intrinsics.checkNotNullExpressionValue(strI, "formattingIntNum(MovingD…Check(data.step.toInt()))");
        target.r(strI);
        target.p(a(data, goal));
        target.k(b(data, goal.getSportMode()));
        return target;
    }

    @NotNull
    public final MovingData d(int seconds, int sportMode, @NotNull MovingData target) {
        String strQ;
        Intrinsics.checkNotNullParameter(target, "target");
        if (sportMode == 3) {
            double dE = seconds == 0 ? 0.0d : MovingData.INSTANCE.e(3600.0d / ((double) seconds));
            strQ = dE < 0.1d ? "--" : nji.m(dE);
            Intrinsics.checkNotNullExpressionValue(strQ, "{\n            val tempSp…aces(tempSpeed)\n        }");
        } else {
            strQ = nji.q(MovingData.INSTANCE.d(seconds));
            Intrinsics.checkNotNullExpressionValue(strQ, "{\n            SportsForm…Check(seconds))\n        }");
        }
        target.q(strQ);
        return target;
    }

    @NotNull
    public final MovingData e(int sportMode, @NotNull MovingData target) {
        Intrinsics.checkNotNullParameter(target, "target");
        if (sportMode == 3) {
            target.q("--");
            target.k("--");
        } else {
            target.q("--'--\"");
            target.k("--'--\"");
        }
        return target;
    }

    public /* synthetic */ t4c(ov5 ov5Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ov5() : ov5Var);
    }
}
