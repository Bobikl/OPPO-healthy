package com.heytap.nearx.uikit.widget.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.heytap.nearx.uikit.R$style;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Deprecated(message = "已过时")
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0015\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u000bH\u0010¢\u0006\u0002\b6J\u0012\u00107\u001a\u0002042\b\u00108\u001a\u0004\u0018\u000109H\u0014J\b\u0010:\u001a\u000204H\u0016J\b\u0010;\u001a\u000204H\u0014J\u000e\u0010<\u001a\u0002042\u0006\u0010=\u001a\u00020\u000bJ\u0010\u0010>\u001a\u0002042\u0006\u0010?\u001a\u00020\u0018H\u0016R\u001a\u0010\r\u001a\u00020\u0006X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u000bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\u000bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0014\"\u0004\b+\u0010\u0016R$\u0010,\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010\u0016R$\u00100\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u0010\u0016¨\u0006@"}, d2 = {"Lcom/heytap/nearx/uikit/widget/dialog/SpinnerDialog;", "Lcom/heytap/nearx/uikit/widget/dialog/AlertDialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cancelable", "", "cancelListener", "Landroid/content/DialogInterface$OnCancelListener;", "(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;)V", "nx_theme", "", "(Landroid/content/Context;I)V", "mHasStarted", "getMHasStarted", "()Z", "setMHasStarted", "(Z)V", "mMax", "getMMax", "()I", "setMMax", "(I)V", "mMessage", "", "getMMessage", "()Ljava/lang/CharSequence;", "setMMessage", "(Ljava/lang/CharSequence;)V", "mMessageView", "Landroid/widget/TextView;", "getMMessageView", "()Landroid/widget/TextView;", "setMMessageView", "(Landroid/widget/TextView;)V", "mProgress", "Landroid/view/View;", "getMProgress", "()Landroid/view/View;", "setMProgress", "(Landroid/view/View;)V", "mProgressVal", "getMProgressVal", "setMProgressVal", "max", "getMax", "setMax", "value", "progress", "getProgress", ClickApiEntity.SET_PROGRESS, "createDialog", "", "deleteDialogOption", "createDialog$nearx_release", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "setBtnTextColor", "color", "setMessage", "message", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class SpinnerDialog extends AlertDialog {
    private boolean mHasStarted;
    private int mMax;

    @Nullable
    private CharSequence mMessage;

    @Nullable
    private TextView mMessageView;

    @Nullable
    private View mProgress;
    private int mProgressVal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpinnerDialog(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.heytap.nearx.uikit.widget.dialog.AlertDialog
    /* JADX INFO: renamed from: createDialog$nearx_release, reason: merged with bridge method [inline-methods] */
    public void createDialog(int deleteDialogOption) {
        Context context = getContext();
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        this.mAlert = new AlertController(context, this, window);
        setCanceledOnTouchOutside(false);
        Window window2 = getWindow();
        Intrinsics.checkNotNull(window2);
        window2.setWindowAnimations(R$style.NXColorDialogAnimation);
    }

    public final boolean getMHasStarted() {
        return this.mHasStarted;
    }

    public final int getMMax() {
        return this.mMax;
    }

    @Nullable
    public final CharSequence getMMessage() {
        return this.mMessage;
    }

    @Nullable
    public final TextView getMMessageView() {
        return this.mMessageView;
    }

    @Nullable
    public final View getMProgress() {
        return this.mProgress;
    }

    public final int getMProgressVal() {
        return this.mProgressVal;
    }

    public int getMax() {
        return -1;
    }

    public int getProgress() {
        return -1;
    }

    @Override // com.heytap.nearx.uikit.widget.dialog.AlertDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        int i = this.mMax;
        if (i > 0) {
            setMax(i);
        }
        int i2 = this.mProgressVal;
        if (i2 > 0) {
            setProgress(i2);
        }
        CharSequence charSequence = this.mMessage;
        if (charSequence != null) {
            setMessage(charSequence);
        }
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        this.mHasStarted = true;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onStop() {
        super.onStop();
        this.mHasStarted = false;
    }

    public final void setBtnTextColor(int color) {
        Button button = this.mAlert.mButtonNeutral;
        if (button == null) {
            return;
        }
        button.setTextColor(color);
    }

    public final void setMHasStarted(boolean z) {
        this.mHasStarted = z;
    }

    public final void setMMax(int i) {
        this.mMax = i;
    }

    public final void setMMessage(@Nullable CharSequence charSequence) {
        this.mMessage = charSequence;
    }

    public final void setMMessageView(@Nullable TextView textView) {
        this.mMessageView = textView;
    }

    public final void setMProgress(@Nullable View view) {
        this.mProgress = view;
    }

    public final void setMProgressVal(int i) {
        this.mProgressVal = i;
    }

    public void setMax(int i) {
    }

    @Override // com.heytap.nearx.uikit.widget.dialog.AlertDialog
    public void setMessage(@NotNull CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.mProgress == null) {
            this.mMessage = message;
            return;
        }
        TextView textView = this.mMessageView;
        if (textView == null) {
            return;
        }
        textView.setText(message);
    }

    public void setProgress(int i) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpinnerDialog(@NotNull Context context, boolean z, @NotNull DialogInterface.OnCancelListener cancelListener) {
        super(context, AlertDialog.resolveDialogTheme(context, 0));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cancelListener, "cancelListener");
        setCancelable(z);
        setOnCancelListener(cancelListener);
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        this.mAlert = new AlertController(context, this, window);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpinnerDialog(@NotNull Context context, int i) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
