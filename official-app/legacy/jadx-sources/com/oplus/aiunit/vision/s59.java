package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.cardiovascular.R$string;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/s59;", "Lcom/oplus/aiunit/vision/pn9;", "", "a", "I", "()I", "heartRateValue", "", "b", "Z", MapSchema.FIELD_NAME_ENTRY, "()Z", "isValid", "Lkotlin/Pair;", "c", "()Lkotlin/Pair;", "minMaxValue", "", "d", "()F", ParserTag.TAG_PERCENT, "hintStringId", "<init>", "(IZ)V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
public final class s59 implements pn9 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int heartRateValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean isValid;

    public s59(int i, boolean z) {
        this.heartRateValue = i;
        this.isValid = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getHeartRateValue() {
        return this.heartRateValue;
    }

    public final int b() {
        int i = this.heartRateValue;
        if (i <= 50) {
            return R$string.health_cardiovascular_heart_rate_hint_low;
        }
        return i >= 100 ? R$string.health_cardiovascular_heart_rate_hint_ligh : R$string.health_cardiovascular_heart_rate_hint;
    }

    @NotNull
    public final Pair<Integer, Integer> c() {
        int i;
        int i2 = this.heartRateValue;
        if (i2 < 40) {
            i = ((i2 / 10) * 10) - 40;
        } else {
            if (i2 > 120) {
                i = (((i2 / 10) * 10) + (i2 % 10 != 0 ? 10 : 0)) - 120;
            } else {
                i = 0;
            }
        }
        return TuplesKt.to(Integer.valueOf(40 + i), Integer.valueOf(120 + i));
    }

    public final float d() {
        Pair<Integer, Integer> pairC = c();
        int iIntValue = pairC.component1().intValue();
        int iIntValue2 = pairC.component2().intValue();
        int i = this.heartRateValue;
        if (i < iIntValue) {
            return 0.0f;
        }
        boolean z = false;
        if (iIntValue <= i && i <= iIntValue2) {
            z = true;
        }
        if (z) {
            return (i - iIntValue) / (iIntValue2 - iIntValue);
        }
        return 1.0f;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }
}
