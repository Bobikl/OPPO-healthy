package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.health.hrv.R$string;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000¨\u0006\u0007"}, d2 = {"", "value", "b", "(Ljava/lang/Integer;)I", "level", "", "a", "hrv_release"}, k = 2, mv = {1, 8, 0})
public final class nh9 {
    @NotNull
    public static final String a(int i) {
        Context contextA = b78.a();
        if (i == 1) {
            String string = contextA.getString(R$string.health_hrv_status_stress_over_v1);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_status_stress_over_v1)");
            return string;
        }
        if (i == 2) {
            String string2 = contextA.getString(R$string.health_hrv_status_normal_v1);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…lth_hrv_status_normal_v1)");
            return string2;
        }
        if (i == 3) {
            String string3 = contextA.getString(R$string.health_hrv_status_good);
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.string.health_hrv_status_good)");
            return string3;
        }
        if (i != 4) {
            String string4 = contextA.getString(R$string.health_hrv_status_no_data);
            Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…ealth_hrv_status_no_data)");
            return string4;
        }
        String string5 = contextA.getString(R$string.health_hrv_status_excellent);
        Intrinsics.checkNotNullExpressionValue(string5, "context.getString(R.stri…lth_hrv_status_excellent)");
        return string5;
    }

    public static final int b(@Nullable Integer num) {
        if (num == null) {
            return 0;
        }
        int iIntValue = num.intValue();
        if (1 <= iIntValue && iIntValue < 26) {
            return 1;
        }
        if (26 <= iIntValue && iIntValue < 51) {
            return 2;
        }
        if (51 <= iIntValue && iIntValue < 76) {
            return 3;
        }
        return 76 <= iIntValue && iIntValue < 101 ? 4 : 0;
    }
}
