package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import com.coui.appcompat.dialog.COUIAlertDialogBuilder;
import com.heytap.health.watchface.R$string;
import com.support.dialog.R$style;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J2\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J2\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/ks5;", "", "Landroid/content/Context;", "context", "", "text", "Landroid/content/DialogInterface$OnClickListener;", "onItemClickListener", "Landroidx/appcompat/app/AlertDialog;", "c", "", "positiveTextRes", "onPositiveListener", "negativeTextRes", "onNegativeListener", MapSchema.FIELD_NAME_ENTRY, "positiveText", "negativeText", "f", "<init>", "()V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ks5 {

    @NotNull
    public static final ks5 INSTANCE = new ks5();

    public static final void d(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    public static final void g(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface dialogInterface, int i) {
        if (i == 0) {
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i);
            }
        } else if (onClickListener2 != null) {
            onClickListener2.onClick(dialogInterface, i);
        }
    }

    @NotNull
    public final AlertDialog c(@NotNull Context context, @NotNull CharSequence text, @Nullable DialogInterface.OnClickListener onItemClickListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        String string = context.getString(R$string.watch_face_cancel);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.watch_face_cancel)");
        return f(context, text, onItemClickListener, string, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.hs5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ks5.d(dialogInterface, i);
            }
        });
    }

    @NotNull
    public final AlertDialog e(@NotNull Context context, int positiveTextRes, @Nullable DialogInterface.OnClickListener onPositiveListener, int negativeTextRes, @Nullable DialogInterface.OnClickListener onNegativeListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(positiveTextRes);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(positiveTextRes)");
        String string2 = context.getString(negativeTextRes);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(negativeTextRes)");
        return f(context, string, onPositiveListener, string2, onNegativeListener);
    }

    @NotNull
    public final AlertDialog f(@NotNull Context context, @NotNull CharSequence positiveText, @Nullable final DialogInterface.OnClickListener onPositiveListener, @NotNull CharSequence negativeText, @Nullable final DialogInterface.OnClickListener onNegativeListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(positiveText, "positiveText");
        Intrinsics.checkNotNullParameter(negativeText, "negativeText");
        COUIAlertDialogBuilder cOUIAlertDialogBuilder = new COUIAlertDialogBuilder(context, R$style.COUIAlertDialog_Bottom);
        cOUIAlertDialogBuilder.setItems(new CharSequence[]{positiveText, negativeText}, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.is5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ks5.g(onPositiveListener, onNegativeListener, dialogInterface, i);
            }
        });
        cOUIAlertDialogBuilder.create();
        AlertDialog alertDialogShow = cOUIAlertDialogBuilder.show();
        Intrinsics.checkNotNullExpressionValue(alertDialogShow, "COUIAlertDialogBuilder(c…  it.show()\n            }");
        return alertDialogShow;
    }
}
