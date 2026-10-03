package com.heytap.nearx.uikit.widget.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.view.Window;
import android.view.WindowManager;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Deprecated(message = "用 NearAlertDialogBuilder 替换")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0012B-\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tB\u001f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0010¢\u0006\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/heytap/nearx/uikit/widget/dialog/NearAlertDialog;", "Lcom/heytap/nearx/uikit/widget/dialog/AlertDialog;", "context", "Landroid/content/Context;", "nx_theme", "", "createThemeContextWrapper", "", "mDeleteDialogOption", "(Landroid/content/Context;IZI)V", "cancelable", "cancelListener", "Landroid/content/DialogInterface$OnCancelListener;", "(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;)V", "createDialog", "", "deleteDialogOption", "createDialog$nearx_release", "Builder", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class NearAlertDialog extends AlertDialog {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/heytap/nearx/uikit/widget/dialog/NearAlertDialog$Builder;", "Lcom/heytap/nearx/uikit/widget/dialog/AlertDialog$Builder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "nx_theme", "", "(Landroid/content/Context;I)V", "create", "Lcom/heytap/nearx/uikit/widget/dialog/AlertDialog;", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static class Builder extends AlertDialog.Builder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        @Override // com.heytap.nearx.uikit.widget.dialog.AlertDialog.Builder
        @NotNull
        public AlertDialog create() {
            Context context = this.P.mContext;
            Intrinsics.checkNotNullExpressionValue(context, "P.mContext");
            NearAlertDialog nearAlertDialog = new NearAlertDialog(context, this.mTheme, false, this.mDeleteDialogOption);
            this.P.apply(nearAlertDialog.mAlert);
            nearAlertDialog.setCancelable(this.P.mCancelable);
            nearAlertDialog.setOnCancelListener(this.P.mOnCancelListener);
            nearAlertDialog.setOnDismissListener(this.P.mOnDismissListener);
            DialogInterface.OnKeyListener onKeyListener = this.P.mOnKeyListener;
            if (onKeyListener != null) {
                nearAlertDialog.setOnKeyListener(onKeyListener);
            }
            return nearAlertDialog;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull Context context, int i) {
            super(context, i);
            Intrinsics.checkNotNullParameter(context, "context");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "用 NearAlertDialogBuilder 替换")
    @JvmOverloads
    public NearAlertDialog(@NotNull Context context) {
        this(context, 0, false, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.heytap.nearx.uikit.widget.dialog.AlertDialog
    /* JADX INFO: renamed from: createDialog$nearx_release, reason: merged with bridge method [inline-methods] */
    public void createDialog(int deleteDialogOption) {
        if (deleteDialogOption > 0) {
            this.mAlert = new AlertController(getContext(), this, getWindow(), deleteDialogOption);
            setCanceledOnTouchOutside(true);
        } else {
            this.mAlert = new AlertController(getContext(), this, getWindow());
            setCanceledOnTouchOutside(false);
        }
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window == null ? null : window.getAttributes();
        if (attributes == null) {
            return;
        }
        attributes.gravity = 87;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "用 NearAlertDialogBuilder 替换")
    @JvmOverloads
    public NearAlertDialog(@NotNull Context context, int i) {
        this(context, i, false, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "用 NearAlertDialogBuilder 替换")
    @JvmOverloads
    public NearAlertDialog(@NotNull Context context, int i, boolean z) {
        this(context, i, z, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "用 NearAlertDialogBuilder 替换")
    @JvmOverloads
    public NearAlertDialog(@NotNull Context context, int i, boolean z, int i2) {
        super(context, i, z, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        createDialog(i2);
    }

    public /* synthetic */ NearAlertDialog(Context context, int i, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? true : z, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "用 NearAlertDialogBuilder 替换")
    public NearAlertDialog(@NotNull Context context, boolean z, @NotNull DialogInterface.OnCancelListener cancelListener) {
        super(context, z, cancelListener);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cancelListener, "cancelListener");
        this.mAlert = new AlertController(context, this, getWindow());
    }
}
