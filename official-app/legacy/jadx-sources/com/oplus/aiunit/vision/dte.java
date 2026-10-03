package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.cardiovascular.R$string;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u000eR\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/dte;", "Lcom/oplus/aiunit/vision/pn9;", "", "a", "I", "b", "()I", "pressValue", "", "Z", "d", "()Z", "isValid", "", "()F", ParserTag.TAG_PERCENT, "Lkotlin/Pair;", "c", "()Lkotlin/Pair;", "stateStringId", "<init>", "(IZ)V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
public final class dte implements pn9 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int pressValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean isValid;

    public dte(int i, boolean z) {
        this.pressValue = i;
        this.isValid = z;
    }

    public final float a() {
        int i = this.pressValue;
        if (i < 0.0f) {
            return 0.0f;
        }
        float f = i;
        if (0.0f <= f && f <= 60.0f) {
            return ((i - 0.0f) / 60) * 0.5f;
        }
        float f2 = i;
        if (60.0f <= f2 && f2 <= 100.0f) {
            return (((i - 60) / (100.0f - 60)) * 0.5f) + 0.5f;
        }
        return 1.0f;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getPressValue() {
        return this.pressValue;
    }

    @NotNull
    public final Pair<Integer, Integer> c() {
        int i = this.pressValue;
        if (i >= 0) {
            if (!(i >= 0 && i < 30)) {
                if (30 <= i && i < 60) {
                    return TuplesKt.to(Integer.valueOf(R$string.health_cardiovascular_stress_normal), Integer.valueOf(R$string.health_cardiovascular_press_hint_2));
                }
                return 60 <= i && i < 80 ? TuplesKt.to(Integer.valueOf(R$string.health_cardiovascular_stress_medium), Integer.valueOf(R$string.health_cardiovascular_press_hint_3)) : TuplesKt.to(Integer.valueOf(R$string.health_cardiovascular_stress_high), Integer.valueOf(R$string.health_cardiovascular_press_hint_4));
            }
        }
        return TuplesKt.to(Integer.valueOf(R$string.health_cardiovascular_stress_relax), Integer.valueOf(R$string.health_cardiovascular_press_hint_1));
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }
}
