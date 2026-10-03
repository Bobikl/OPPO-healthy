package com.oppo.store.web.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import com.heytap.store.base.core.util.DisplayUtil;
import com.heytap.store.platform.tools.SizeUtils;
import com.oplus.mydevices.sdk.compat.DeviceInfoCompat;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oppo.store.web.browser.R;
import com.oppo.store.web.widget.LoadingDialog;
import com.platform.account.webview.constant.Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.internal.datachannel.CardAction;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001#B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0006\u0010\u0019\u001a\u00020\u0018J\b\u0010\u001a\u001a\u00020\u0018H\u0002J\u0012\u0010\u001b\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u000e\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u000eJ;\u0010 \u001a\u00020\u00182\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u0018H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0018\u00010\nR\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/oppo/store/web/widget/LoadingDialog;", "Landroidx/appcompat/app/AlertDialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "canceled", "", "content", "", "countDownTimer", "Lcom/oppo/store/web/widget/LoadingDialog$MyCountDownTimer;", "countdown", "currentScreenWidth", "disMissTypeListener", "Lcom/oppo/store/web/widget/DisMissTypeListener;", "isCountdown", "", "prefix", "suffix", DeviceInfoCompat.DeviceType.TV, "Landroid/widget/TextView;", "defaultDrawable", "Landroid/graphics/drawable/Drawable;", "dismiss", "", "hideLoading", "initPadAttributes", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setFinishListener", "listener", ClickApiEntity.SET_TEXT, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", CardAction.LIFE_CIRCLE_VALUE_SHOW, "MyCountDownTimer", "webbrowser-impl_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LoadingDialog extends AlertDialog {
    private int canceled;

    @NotNull
    private String content;

    @Nullable
    private MyCountDownTimer countDownTimer;
    private int countdown;
    private int currentScreenWidth;

    @Nullable
    private DisMissTypeListener disMissTypeListener;
    private boolean isCountdown;

    @NotNull
    private String prefix;

    @NotNull
    private String suffix;

    @Nullable
    private TextView tv;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"Lcom/oppo/store/web/widget/LoadingDialog$MyCountDownTimer;", "Landroid/os/CountDownTimer;", "millisInFuture", "", "(Lcom/oppo/store/web/widget/LoadingDialog;J)V", Constants.JsbConstants.METHOD_FINISH, "", "onTick", "millis", "webbrowser-impl_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class MyCountDownTimer extends CountDownTimer {
        public MyCountDownTimer(long j2) {
            super(j2, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            LoadingDialog.this.canceled = 1;
            LoadingDialog.this.dismiss();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millis) {
            int i = (int) (millis / ((long) 1000));
            TextView textView = LoadingDialog.this.tv;
            if (textView == null) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            String str = LoadingDialog.this.prefix;
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append(i);
            sb.append(LoadingDialog.this.suffix);
            textView.setText(sb.toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingDialog(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.content = "";
        this.canceled = 2;
        this.prefix = "";
        this.suffix = "";
    }

    private final Drawable defaultDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius(SizeUtils.INSTANCE.dp2px(24.0f));
        return gradientDrawable;
    }

    private final void initPadAttributes() {
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setBackgroundDrawable(defaultDrawable());
            }
            int i = this.currentScreenWidth;
            SizeUtils sizeUtils = SizeUtils.INSTANCE;
            attributes.width = Integer.min(i - sizeUtils.dp2px(32.0f), sizeUtils.dp2px(328.0f));
            window.setAttributes(attributes);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-0, reason: not valid java name */
    public static final void m5265onCreate$lambda0(LoadingDialog this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int screenWidth = DisplayUtil.getScreenWidth(this$0.getContext());
        if (screenWidth != this$0.currentScreenWidth) {
            this$0.currentScreenWidth = screenWidth;
            this$0.initPadAttributes();
        }
    }

    public static /* synthetic */ void setText$default(LoadingDialog loadingDialog, String str, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        loadingDialog.setText(str, str2, str3, num);
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        DisMissTypeListener disMissTypeListener;
        int i = this.canceled;
        if (i != 0 && (disMissTypeListener = this.disMissTypeListener) != null) {
            disMissTypeListener.cancel(i);
        }
        super.dismiss();
        MyCountDownTimer myCountDownTimer = this.countDownTimer;
        if (myCountDownTimer != null) {
            myCountDownTimer.cancel();
        }
    }

    public final void hideLoading() {
        this.canceled = 0;
        dismiss();
    }

    @Override // androidx.appcompat.app.AlertDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        ViewTreeObserver viewTreeObserver;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_js_loading_dialog);
        this.tv = (TextView) findViewById(R.id.tvContent);
        View viewFindViewById = findViewById(R.id.container);
        if (viewFindViewById != null && (viewTreeObserver = viewFindViewById.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.oplus.aiunit.vision.k3b
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    LoadingDialog.m5265onCreate$lambda0(this.i);
                }
            });
        }
        this.currentScreenWidth = DisplayUtil.getScreenWidth(getContext());
        initPadAttributes();
    }

    public final void setFinishListener(@NotNull DisMissTypeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.disMissTypeListener = listener;
    }

    public final void setText(@Nullable String content, @Nullable String prefix, @Nullable String suffix, @Nullable Integer countdown) {
        if (!(content == null || content.length() == 0)) {
            this.isCountdown = false;
            this.content = content;
            return;
        }
        if (prefix == null) {
            prefix = "";
        }
        this.prefix = prefix;
        if (suffix == null) {
            suffix = "";
        }
        this.suffix = suffix;
        this.countdown = countdown != null ? countdown.intValue() : 0;
        this.isCountdown = true;
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        this.canceled = 2;
        if (this.isCountdown) {
            MyCountDownTimer myCountDownTimer = new MyCountDownTimer(((long) this.countdown) * 1000);
            this.countDownTimer = myCountDownTimer;
            myCountDownTimer.start();
        } else {
            TextView textView = this.tv;
            if (textView == null) {
                return;
            }
            textView.setText(this.content);
        }
    }
}
