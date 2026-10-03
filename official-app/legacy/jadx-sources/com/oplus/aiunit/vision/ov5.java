package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/ov5;", "", "", "distance", "", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "", "b", "", "a", "Ljava/text/DecimalFormat;", "Ljava/text/DecimalFormat;", "formatter", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ov5 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final DecimalFormat formatter;

    public ov5() {
        NumberFormat numberFormat = NumberFormat.getInstance();
        Intrinsics.checkNotNull(numberFormat, "null cannot be cast to non-null type java.text.DecimalFormat");
        DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(2);
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        this.formatter = decimalFormat;
    }

    public final void a(double distance, int sportMode) {
        if (distance >= 100.0d || sportMode == 3) {
            this.formatter.setMinimumFractionDigits(1);
            this.formatter.setMaximumFractionDigits(1);
        } else {
            this.formatter.setMinimumFractionDigits(2);
            this.formatter.setMaximumFractionDigits(2);
        }
    }

    @NotNull
    public final String b(double distance, int sportMode) {
        a(distance, sportMode);
        String str = this.formatter.format(distance);
        Intrinsics.checkNotNullExpressionValue(str, "formatter.format(distance)");
        return str;
    }
}
