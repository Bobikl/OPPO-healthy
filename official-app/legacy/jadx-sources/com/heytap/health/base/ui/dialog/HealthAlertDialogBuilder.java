package com.heytap.health.base.ui.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.exifinterface.media.ExifInterface;
import com.coui.appcompat.dialog.COUIAlertDialogBuilder;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.health.base.ui.dialog.HealthAlertDialogBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015B\u0019\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0017J\u001a\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\t\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\n\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\u000b\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\f\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\r\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/base/ui/dialog/HealthAlertDialogBuilder;", "Lcom/coui/appcompat/dialog/COUIAlertDialogBuilder;", "", "textId", "Landroid/content/DialogInterface$OnClickListener;", "listener", "L", "", "text", "M", "R", ExifInterface.GPS_DIRECTION_TRUE, "N", SecureGcmConstants.MESSAGE_KEY, "Landroid/content/Context;", "context", "Landroid/content/DialogInterface;", "dialogInterface", "", "i0", "<init>", "(Landroid/content/Context;)V", "dialogStyleResId", "(Landroid/content/Context;I)V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class HealthAlertDialogBuilder extends COUIAlertDialogBuilder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthAlertDialogBuilder(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void j0(DialogInterface.OnClickListener onClickListener, HealthAlertDialogBuilder this$0, DialogInterface dialog, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (onClickListener != null) {
            onClickListener.onClick(dialog, i);
        }
        Context context = this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(dialog, "dialog");
        this$0.i0(context, dialog);
    }

    public static final void k0(DialogInterface.OnClickListener onClickListener, HealthAlertDialogBuilder this$0, DialogInterface dialog, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (onClickListener != null) {
            onClickListener.onClick(dialog, i);
        }
        Context context = this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(dialog, "dialog");
        this$0.i0(context, dialog);
    }

    public static final void l0(DialogInterface.OnClickListener onClickListener, HealthAlertDialogBuilder this$0, DialogInterface dialog, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (onClickListener != null) {
            onClickListener.onClick(dialog, i);
        }
        Context context = this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(dialog, "dialog");
        this$0.i0(context, dialog);
    }

    public static final void m0(DialogInterface.OnClickListener onClickListener, HealthAlertDialogBuilder this$0, DialogInterface dialog, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (onClickListener != null) {
            onClickListener.onClick(dialog, i);
        }
        Context context = this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(dialog, "dialog");
        this$0.i0(context, dialog);
    }

    public static final void n0(DialogInterface.OnClickListener onClickListener, HealthAlertDialogBuilder this$0, DialogInterface dialog, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (onClickListener != null) {
            onClickListener.onClick(dialog, i);
        }
        Context context = this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(dialog, "dialog");
        this$0.i0(context, dialog);
    }

    public static final void o0(DialogInterface.OnClickListener onClickListener, HealthAlertDialogBuilder this$0, DialogInterface dialog, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (onClickListener != null) {
            onClickListener.onClick(dialog, i);
        }
        Context context = this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(dialog, "dialog");
        this$0.i0(context, dialog);
    }

    @Override // com.coui.appcompat.dialog.COUIAlertDialogBuilder, androidx.appcompat.app.AlertDialog.Builder
    @NotNull
    /* JADX INFO: renamed from: L */
    public COUIAlertDialogBuilder setNegativeButton(int textId, @Nullable final DialogInterface.OnClickListener listener) {
        COUIAlertDialogBuilder negativeButton = super.setNegativeButton(textId, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.wj8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HealthAlertDialogBuilder.j0(listener, this, dialogInterface, i);
            }
        });
        Intrinsics.checkNotNullExpressionValue(negativeButton, "super.setNegativeButton(…ontext, dialog)\n        }");
        return negativeButton;
    }

    @Override // com.coui.appcompat.dialog.COUIAlertDialogBuilder, androidx.appcompat.app.AlertDialog.Builder
    @NotNull
    /* JADX INFO: renamed from: M */
    public COUIAlertDialogBuilder setNegativeButton(@Nullable CharSequence text, @Nullable final DialogInterface.OnClickListener listener) {
        COUIAlertDialogBuilder negativeButton = super.setNegativeButton(text, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.zj8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HealthAlertDialogBuilder.k0(listener, this, dialogInterface, i);
            }
        });
        Intrinsics.checkNotNullExpressionValue(negativeButton, "super.setNegativeButton(…ontext, dialog)\n        }");
        return negativeButton;
    }

    @Override // com.coui.appcompat.dialog.COUIAlertDialogBuilder, androidx.appcompat.app.AlertDialog.Builder
    @NotNull
    /* JADX INFO: renamed from: N */
    public COUIAlertDialogBuilder setNeutralButton(int textId, @Nullable final DialogInterface.OnClickListener listener) {
        COUIAlertDialogBuilder neutralButton = super.setNeutralButton(textId, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.ak8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HealthAlertDialogBuilder.l0(listener, this, dialogInterface, i);
            }
        });
        Intrinsics.checkNotNullExpressionValue(neutralButton, "super.setNeutralButton(\n…ontext, dialog)\n        }");
        return neutralButton;
    }

    @Override // com.coui.appcompat.dialog.COUIAlertDialogBuilder, androidx.appcompat.app.AlertDialog.Builder
    @NotNull
    /* JADX INFO: renamed from: P */
    public COUIAlertDialogBuilder setNeutralButton(@Nullable CharSequence text, @Nullable final DialogInterface.OnClickListener listener) {
        COUIAlertDialogBuilder neutralButton = super.setNeutralButton(text, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.yj8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HealthAlertDialogBuilder.m0(listener, this, dialogInterface, i);
            }
        });
        Intrinsics.checkNotNullExpressionValue(neutralButton, "super.setNeutralButton(\n…ontext, dialog)\n        }");
        return neutralButton;
    }

    @Override // com.coui.appcompat.dialog.COUIAlertDialogBuilder, androidx.appcompat.app.AlertDialog.Builder
    @NotNull
    /* JADX INFO: renamed from: R */
    public COUIAlertDialogBuilder setPositiveButton(int textId, @Nullable final DialogInterface.OnClickListener listener) {
        COUIAlertDialogBuilder positiveButton = super.setPositiveButton(textId, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.vj8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HealthAlertDialogBuilder.n0(listener, this, dialogInterface, i);
            }
        });
        Intrinsics.checkNotNullExpressionValue(positiveButton, "super.setPositiveButton(…ontext, dialog)\n        }");
        return positiveButton;
    }

    @Override // com.coui.appcompat.dialog.COUIAlertDialogBuilder, androidx.appcompat.app.AlertDialog.Builder
    @NotNull
    /* JADX INFO: renamed from: T */
    public COUIAlertDialogBuilder setPositiveButton(@Nullable CharSequence text, @Nullable final DialogInterface.OnClickListener listener) {
        COUIAlertDialogBuilder positiveButton = super.setPositiveButton(text, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.xj8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HealthAlertDialogBuilder.o0(listener, this, dialogInterface, i);
            }
        });
        Intrinsics.checkNotNullExpressionValue(positiveButton, "super.setPositiveButton(…ontext, dialog)\n        }");
        return positiveButton;
    }

    public final void i0(Context context, DialogInterface dialogInterface) {
        if (context == null) {
            return;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
        }
        dialogInterface.dismiss();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthAlertDialogBuilder(@NotNull Context context, int i) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
