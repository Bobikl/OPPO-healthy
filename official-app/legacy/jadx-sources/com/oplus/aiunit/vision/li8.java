package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.cardiovascular.R$string;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/li8;", "Lcom/oplus/aiunit/vision/pn9;", "Landroid/content/Context;", "context", "", "b", "a", "Ljava/lang/String;", "validItems", "focusItems", "", "c", "J", "()J", ClickApiEntity.TIME, "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
public final class li8 implements pn9 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final String validItems;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String focusItems;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long time;

    public li8(@Nullable String str, @Nullable String str2, long j2) {
        this.validItems = str;
        this.focusItems = str2;
        this.time = j2;
    }

    @NotNull
    public final String a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        StringBuilder sb = new StringBuilder();
        t23 t23Var = t23.INSTANCE;
        String str = this.focusItems;
        if (str == null) {
            str = "";
        }
        boolean z = false;
        int size = t23.g(t23Var, str, false, 2, null).size();
        String str2 = this.validItems;
        if (str2 == null) {
            str2 = "";
        }
        int size2 = t23.g(t23Var, str2, false, 2, null).size() - size;
        String str3 = this.validItems;
        String str4 = str3 != null ? str3 : "";
        boolean z2 = true;
        int size3 = t23Var.f(str4, true).size();
        if (size > 0) {
            sb.append(context.getString(R$string.health_cardiovascular_detail_header_measure_detail, Integer.valueOf(size)));
            sb.append(context.getString(R$string.health_cardiovascular_detail_risk));
            z = true;
        }
        if (size2 > 0) {
            if (z) {
                sb.append("、");
            }
            sb.append(context.getString(R$string.health_cardiovascular_detail_header_measure_detail, Integer.valueOf(size2)));
            sb.append(context.getString(R$string.health_cardiovascular_stress_normal));
        } else {
            z2 = z;
        }
        if (size3 > 0) {
            if (z2) {
                sb.append("、");
            }
            sb.append(context.getString(R$string.health_cardiovascular_detail_header_measure_detail, Integer.valueOf(size3)));
            sb.append(context.getString(R$string.health_cardiovascular_detail_invalid));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "textMeasureDetail.toString()");
        return string;
    }

    @NotNull
    public final String b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.focusItems;
        if (!(str == null || str.length() == 0)) {
            String string = context.getString(R$string.health_cardiovascular_detail_risk);
            Intrinsics.checkNotNullExpressionValue(string, "{\n            //有疑似风险指标\n…ar_detail_risk)\n        }");
            return string;
        }
        String str2 = this.validItems;
        if (str2 == null || str2.length() == 0) {
            String string2 = context.getString(R$string.health_cardiovascular_detail_invalid);
            Intrinsics.checkNotNullExpressionValue(string2, "{\n            //所有值都未测得\n…detail_invalid)\n        }");
            return string2;
        }
        String string3 = context.getString(R$string.health_cardiovascular_detail_normal);
        Intrinsics.checkNotNullExpressionValue(string3, "{\n            //有测得的数据\n …_detail_normal)\n        }");
        return string3;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getTime() {
        return this.time;
    }
}
