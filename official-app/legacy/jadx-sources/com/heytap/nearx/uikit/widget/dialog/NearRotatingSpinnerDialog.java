package com.heytap.nearx.uikit.widget.dialog;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.widget.dialog.NearRotatingSpinnerDialog;
import com.heytap.nearx.uikit.widget.progress.NearCircleProgressBar;
import com.oplus.aiunit.vision.yqk;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.internal.datachannel.CardAction;

/* JADX INFO: loaded from: classes18.dex */
@Deprecated(message = "用 NearAlertDialogBuilder + R.style.NearAlertDialog_Rotating 替换")
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u0000 82\u00020\u0001:\u00018B\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010'\u001a\u00020\u0006H\u0007J\b\u0010(\u001a\u00020\u0006H\u0007J\b\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020*H\u0016J\u0012\u0010,\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010.H\u0014J\u0010\u0010/\u001a\u00020*2\u0006\u00100\u001a\u00020\tH\u0016J\u0010\u00101\u001a\u00020*2\u0006\u00102\u001a\u00020\u0006H\u0007J\u0010\u00103\u001a\u00020*2\u0006\u00102\u001a\u00020\u0006H\u0007J\u0012\u00104\u001a\u00020*2\b\u00105\u001a\u0004\u0018\u00010%H\u0016J\u0010\u00104\u001a\u00020*2\u0006\u00106\u001a\u00020\u0006H\u0016J\b\u00107\u001a\u00020*H\u0016R\u001a\u0010\r\u001a\u00020\u000eX\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\tX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/heytap/nearx/uikit/widget/dialog/NearRotatingSpinnerDialog;", "Lcom/heytap/nearx/uikit/widget/dialog/SpinnerDialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "nx_theme", "", "(Landroid/content/Context;I)V", "cancelable", "", "cancelListener", "Landroid/content/DialogInterface$OnCancelListener;", "(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;)V", "mBody", "Landroid/widget/LinearLayout;", "getMBody", "()Landroid/widget/LinearLayout;", "setMBody", "(Landroid/widget/LinearLayout;)V", "mCancelListener", "getMCancelListener", "()Landroid/content/DialogInterface$OnCancelListener;", "setMCancelListener", "(Landroid/content/DialogInterface$OnCancelListener;)V", "mCancelable", "getMCancelable", "()Z", "setMCancelable", "(Z)V", "mIsCanceledOnTouchOutside", "mNearCircleProgressBar", "Lcom/heytap/nearx/uikit/widget/progress/NearCircleProgressBar;", "mParentPanel", "Landroid/view/ViewGroup;", "mTitle", "Landroid/widget/TextView;", "mTitleContent", "", "mTitleResId", "getLoadingCircleBackgroundColor", "getLoadingCircleColor", "handleTitle", "", "onAttachedToWindow", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setCanceledOnTouchOutside", "cancel", "setLoadingCircleBackgroundColor", "color", "setLoadingCircleColor", "setTitle", "title", "resId", CardAction.LIFE_CIRCLE_VALUE_SHOW, "Companion", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class NearRotatingSpinnerDialog extends SpinnerDialog {

    @NotNull
    private static final String PROGRESS_JSON_PATH = "loading.json";

    @NotNull
    private static final String PROGRESS_JSON_PATH_NIGHT = "loading_night.json";
    protected LinearLayout mBody;

    @Nullable
    private DialogInterface.OnCancelListener mCancelListener;
    private boolean mCancelable;
    private boolean mIsCanceledOnTouchOutside;

    @Nullable
    private NearCircleProgressBar mNearCircleProgressBar;

    @Nullable
    private ViewGroup mParentPanel;

    @Nullable
    private TextView mTitle;

    @Nullable
    private CharSequence mTitleContent;
    private int mTitleResId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "用 NearAlertDialogBuilder + R.style.NearAlertDialog_Rotating 替换")
    public NearRotatingSpinnerDialog(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mIsCanceledOnTouchOutside = true;
    }

    private final void handleTitle() {
        CharSequence charSequence = this.mTitleContent;
        if (charSequence != null) {
            super.setTitle(charSequence);
            return;
        }
        int i = this.mTitleResId;
        if (i != 0) {
            super.setTitle(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: onCreate$lambda-0, reason: not valid java name */
    public static final void m4694onCreate$lambda0(NearRotatingSpinnerDialog this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DialogInterface.OnCancelListener onCancelListener = this$0.mCancelListener;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
        SensorsDataAutoTrackHelper.trackDialog(dialogInterface, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: show$lambda-2, reason: not valid java name */
    public static final void m4696show$lambda2(NearRotatingSpinnerDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.mIsCanceledOnTouchOutside && this$0.isShowing()) {
            this$0.dismiss();
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    @Deprecated(message = "unused method")
    public final int getLoadingCircleBackgroundColor() {
        return 0;
    }

    @Deprecated(message = "unused method")
    public final int getLoadingCircleColor() {
        return 0;
    }

    @NotNull
    public final LinearLayout getMBody() {
        LinearLayout linearLayout = this.mBody;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBody");
        return null;
    }

    @Nullable
    public final DialogInterface.OnCancelListener getMCancelListener() {
        return this.mCancelListener;
    }

    public final boolean getMCancelable() {
        return this.mCancelable;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewGroup viewGroup = this.mParentPanel;
        if (viewGroup == null || !this.mCancelable) {
            return;
        }
        Intrinsics.checkNotNull(viewGroup);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.heytap.nearx.uikit.widget.dialog.NearRotatingSpinnerDialog.onAttachedToWindow.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                ViewGroup.LayoutParams layoutParams;
                ViewGroup viewGroup2 = NearRotatingSpinnerDialog.this.mParentPanel;
                Intrinsics.checkNotNull(viewGroup2);
                viewGroup2.getViewTreeObserver().removeOnPreDrawListener(this);
                ViewGroup viewGroup3 = NearRotatingSpinnerDialog.this.mParentPanel;
                Intrinsics.checkNotNull(viewGroup3);
                View viewFindViewById = viewGroup3.findViewById(R$id.customPanel);
                ViewGroup viewGroup4 = NearRotatingSpinnerDialog.this.mParentPanel;
                Intrinsics.checkNotNull(viewGroup4);
                View viewFindViewById2 = viewGroup4.findViewById(R$id.custom);
                if (viewFindViewById == null || viewFindViewById2 == null || (layoutParams = viewFindViewById.getLayoutParams()) == null || layoutParams.height != -2) {
                    return false;
                }
                layoutParams.height = viewFindViewById2.getHeight();
                viewFindViewById.setLayoutParams(layoutParams);
                return false;
            }
        });
    }

    @Override // com.heytap.nearx.uikit.widget.dialog.SpinnerDialog, com.heytap.nearx.uikit.widget.dialog.AlertDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.nx_near_progress_dialog_rotating, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R$id.body);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.body)");
        setMBody((LinearLayout) viewFindViewById);
        this.mNearCircleProgressBar = (NearCircleProgressBar) viewInflate.findViewById(R$id.progress);
        Resources resources = getContext().getResources();
        if (this.mCancelable) {
            getMBody().setPadding(0, yqk.a(1.0f, resources), 0, yqk.a(6.5f, resources));
        } else {
            getMBody().setPadding(0, 0, 0, yqk.a(25.5f, resources));
        }
        setView(viewInflate);
        if (this.mCancelable) {
            setButton(-3, getContext().getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.nkc
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    NearRotatingSpinnerDialog.m4694onCreate$lambda0(this.i, dialogInterface, i);
                }
            });
        }
        super.onCreate(savedInstanceState);
        handleTitle();
    }

    @Override // com.heytap.nearx.uikit.widget.dialog.AlertDialog, android.app.Dialog
    public void setCanceledOnTouchOutside(boolean cancel) {
        super.setCanceledOnTouchOutside(cancel);
        this.mIsCanceledOnTouchOutside = cancel;
    }

    @Deprecated(message = "unused method")
    public final void setLoadingCircleBackgroundColor(int color) {
    }

    @Deprecated(message = "unused method")
    public final void setLoadingCircleColor(int color) {
    }

    public final void setMBody(@NotNull LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.mBody = linearLayout;
    }

    public final void setMCancelListener(@Nullable DialogInterface.OnCancelListener onCancelListener) {
        this.mCancelListener = onCancelListener;
    }

    public final void setMCancelable(boolean z) {
        this.mCancelable = z;
    }

    @Override // com.heytap.nearx.uikit.widget.dialog.AlertDialog, androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void setTitle(@Nullable CharSequence title) {
        this.mTitleContent = title;
        super.setTitle(title);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        if (this.mParentPanel == null) {
            this.mParentPanel = (ViewGroup) findViewById(R$id.parentPanel);
        }
        ViewGroup viewGroup = this.mParentPanel;
        if (viewGroup != null) {
            Intrinsics.checkNotNull(viewGroup);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.width = -2;
            ViewGroup viewGroup2 = this.mParentPanel;
            Intrinsics.checkNotNull(viewGroup2);
            viewGroup2.setLayoutParams(layoutParams);
            ViewGroup viewGroup3 = this.mParentPanel;
            Intrinsics.checkNotNull(viewGroup3);
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R$dimen.nx_loading_dialog_min_width);
            ViewGroup viewGroup4 = this.mParentPanel;
            Intrinsics.checkNotNull(viewGroup4);
            int paddingLeft = dimensionPixelSize + viewGroup4.getPaddingLeft();
            ViewGroup viewGroup5 = this.mParentPanel;
            Intrinsics.checkNotNull(viewGroup5);
            viewGroup3.setMinimumWidth(paddingLeft + viewGroup5.getPaddingRight());
            ViewGroup viewGroup6 = this.mParentPanel;
            Intrinsics.checkNotNull(viewGroup6);
            viewGroup6.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.okc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SensorsDataAutoTrackHelper.trackViewOnClick(view);
                }
            });
            ViewGroup viewGroup7 = this.mParentPanel;
            Intrinsics.checkNotNull(viewGroup7);
            ViewParent parent = viewGroup7.getParent();
            if (parent == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
            }
            ((FrameLayout) parent).setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.pkc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NearRotatingSpinnerDialog.m4696show$lambda2(this.i, view);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "用 NearAlertDialogBuilder + R.style.NearAlertDialog_Rotating 替换")
    public NearRotatingSpinnerDialog(@NotNull Context context, int i) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mIsCanceledOnTouchOutside = true;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void setTitle(int resId) {
        this.mTitleResId = resId;
        super.setTitle(resId);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "用 NearAlertDialogBuilder + R.style.NearAlertDialog_Rotating 替换")
    public NearRotatingSpinnerDialog(@NotNull Context context, boolean z, @NotNull DialogInterface.OnCancelListener cancelListener) {
        super(context, AlertDialog.resolveDialogTheme(context, 0));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cancelListener, "cancelListener");
        this.mIsCanceledOnTouchOutside = true;
        this.mCancelable = z;
        this.mCancelListener = cancelListener;
    }
}
