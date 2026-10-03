package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import com.heytap.health.base.ui.dialog.HealthAlertDialogBuilder;
import com.support.dialog.R$style;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ6\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tJ&\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ2\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\t¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/es5;", "", "Landroid/content/Context;", "context", "", "titleRes", "Landroid/view/View;", "view", "neutralRes", "Landroid/content/DialogInterface$OnClickListener;", "listener", "", "d", "positiveRes", "negativeRes", "positiveListener", "negativeListener", "f", MapSchema.FIELD_NAME_ENTRY, "", "positiveText", "onPositiveListener", "negativeText", "onNegativeListener", "Landroidx/appcompat/app/AlertDialog;", "b", "<init>", "()V", "recordfilemanager_impl_release"}, k = 1, mv = {1, 8, 0})
public final class es5 {

    @NotNull
    public static final es5 INSTANCE = new es5();

    public static final void c(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface dialogInterface, int i) {
        if (i == 0) {
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i);
            }
        } else if (onClickListener2 != null) {
            onClickListener2.onClick(dialogInterface, i);
        }
    }

    @NotNull
    public final AlertDialog b(@NotNull Context context, @NotNull CharSequence positiveText, @Nullable final DialogInterface.OnClickListener onPositiveListener, @NotNull CharSequence negativeText, @Nullable final DialogInterface.OnClickListener onNegativeListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(positiveText, "positiveText");
        Intrinsics.checkNotNullParameter(negativeText, "negativeText");
        HealthAlertDialogBuilder healthAlertDialogBuilder = new HealthAlertDialogBuilder(context, R$style.COUIAlertDialog_Bottom);
        healthAlertDialogBuilder.setItems(new CharSequence[]{positiveText, negativeText}, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.ds5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                es5.c(onPositiveListener, onNegativeListener, dialogInterface, i);
            }
        });
        healthAlertDialogBuilder.create();
        AlertDialog alertDialogShow = healthAlertDialogBuilder.show();
        Intrinsics.checkNotNullExpressionValue(alertDialogShow, "HealthAlertDialogBuilder…  it.show()\n            }");
        return alertDialogShow;
    }

    public final void d(@NotNull Context context, int titleRes, @NotNull View view, int neutralRes, @NotNull DialogInterface.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(listener, "listener");
        new HealthAlertDialogBuilder(context).setTitle(titleRes).setView(view).setPositiveButton(neutralRes, listener).setCancelable(true).show();
    }

    public final void e(@NotNull Context context, int titleRes, int positiveRes, @NotNull DialogInterface.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        new HealthAlertDialogBuilder(context).setTitle(titleRes).setPositiveButton(positiveRes, listener).setCancelable(true).show();
    }

    public final void f(@NotNull Context context, int titleRes, int positiveRes, int negativeRes, @NotNull DialogInterface.OnClickListener positiveListener, @NotNull DialogInterface.OnClickListener negativeListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(positiveListener, "positiveListener");
        Intrinsics.checkNotNullParameter(negativeListener, "negativeListener");
        new HealthAlertDialogBuilder(context).setTitle(titleRes).setPositiveButton(positiveRes, positiveListener).setNeutralButton(negativeRes, negativeListener).create().show();
    }
}
