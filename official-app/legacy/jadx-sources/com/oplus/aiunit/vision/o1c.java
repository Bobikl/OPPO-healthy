package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.health.cervical_vertebra.R$string;
import com.heytap.health.cervical_vertebra.datamodel.Procedure;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/o1c;", "", "Lcom/heytap/health/cervical_vertebra/datamodel/Procedure;", "procedure", "Landroid/content/Context;", "context", "", "b", "", "status", "a", "<init>", "()V", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0})
public final class o1c {

    @NotNull
    public static final o1c INSTANCE = new o1c();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Procedure.values().length];
            try {
                iArr[Procedure.PREPARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Procedure.ROTATE_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Procedure.ROTATE_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Procedure.FORWARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Procedure.BACKWARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Procedure.LEFT_FLEXION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Procedure.RIGHT_FLEXION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Procedure.END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public final String a(int status, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (status == 1) {
            String string = context.getString(R$string.health_cervical_vertebra_evaluate_status_init);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…bra_evaluate_status_init)");
            return string;
        }
        if (status == 2) {
            String string2 = context.getString(R$string.health_cervical_vertebra_evaluate_status_evaluating);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…aluate_status_evaluating)");
            return string2;
        }
        if (status != 3) {
            return "";
        }
        String string3 = context.getString(R$string.health_cervical_vertebra_evaluate_status_failure);
        Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…_evaluate_status_failure)");
        return string3;
    }

    @NotNull
    public final String b(@NotNull Procedure procedure, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(procedure, "procedure");
        Intrinsics.checkNotNullParameter(context, "context");
        switch (a.$EnumSwitchMapping$0[procedure.ordinal()]) {
            case 1:
                String string = context.getString(R$string.health_cervical_vertebra_action_prepare);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…_vertebra_action_prepare)");
                return string;
            case 2:
                String string2 = context.getString(R$string.health_cervical_vertebra_action_rotate_left);
                Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…tebra_action_rotate_left)");
                return string2;
            case 3:
                String string3 = context.getString(R$string.health_cervical_vertebra_action_rotate_right);
                Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…ebra_action_rotate_right)");
                return string3;
            case 4:
                String string4 = context.getString(R$string.health_cervical_vertebra_action_forward);
                Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…_vertebra_action_forward)");
                return string4;
            case 5:
                String string5 = context.getString(R$string.health_cervical_vertebra_action_backward);
                Intrinsics.checkNotNullExpressionValue(string5, "context.getString(R.stri…vertebra_action_backward)");
                return string5;
            case 6:
                String string6 = context.getString(R$string.health_cervical_vertebra_action_left_flexion);
                Intrinsics.checkNotNullExpressionValue(string6, "context.getString(R.stri…ebra_action_left_flexion)");
                return string6;
            case 7:
                String string7 = context.getString(R$string.health_cervical_vertebra_action_right_flexion);
                Intrinsics.checkNotNullExpressionValue(string7, "context.getString(R.stri…bra_action_right_flexion)");
                return string7;
            case 8:
                return "";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
