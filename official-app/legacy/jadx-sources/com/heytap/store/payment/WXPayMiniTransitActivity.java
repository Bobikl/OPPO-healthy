package com.heytap.store.payment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.heytap.store.payment.api.PayParams;
import com.heytap.store.payment.strategy.AbstractPayService;
import com.heytap.store.payment.strategy.PayStrategyFactory;
import com.heytap.store.payment.utils.Util;
import com.heytap.store.platform.tools.ToastUtils;
import com.heytap.store.sdk.R;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\u0012\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\fH\u0014J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/heytap/store/payment/WXPayMiniTransitActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "nextResumed", "", "payParams", "Lcom/heytap/store/payment/api/PayParams;", "getPayParams", "()Lcom/heytap/store/payment/api/PayParams;", "setPayParams", "(Lcom/heytap/store/payment/api/PayParams;)V", "exit", "", "finish", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setStatusBarTint", "activity", "Landroid/app/Activity;", "Companion", "pay_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class WXPayMiniTransitActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String INTENT_PAY_PARAMS = "payParams";
    private boolean nextResumed;

    @Nullable
    private PayParams payParams;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/heytap/store/payment/WXPayMiniTransitActivity$Companion;", "", "()V", "INTENT_PAY_PARAMS", "", "toPay", "", "activity", "Landroid/app/Activity;", "params", "Lcom/heytap/store/payment/api/PayParams;", "pay_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void toPay(@NotNull Activity activity, @NotNull PayParams params) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(params, "params");
            Intent intent = new Intent(activity, (Class<?>) WXPayMiniTransitActivity.class);
            intent.putExtra("payParams", params);
            activity.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void exit() {
        AbstractPayService strategy;
        PayParams payParams = this.payParams;
        if (payParams != null && (strategy = PayStrategyFactory.INSTANCE.getInstance().getStrategy(payParams.getPayMethod())) != null && strategy.getResultCallBack() != null) {
            strategy.onResume();
        }
        finish();
    }

    private final void setStatusBarTint(Activity activity) {
        activity.getWindow().addFlags(Integer.MIN_VALUE);
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() | 8192);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Nullable
    public final PayParams getPayParams() {
        return this.payParams;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        overridePendingTransition(0, 0);
        super.onCreate(savedInstanceState);
        setStatusBarTint(this);
        setContentView(R.layout.activity_wxpay_webview);
        Serializable serializableExtra = getIntent().getSerializableExtra("payParams");
        this.payParams = serializableExtra instanceof PayParams ? (PayParams) serializableExtra : null;
        Util util = Util.INSTANCE;
        if (util.checkWXAppIsInstall(this)) {
            util.wxChatPayJumpToMiniGram(this, this.payParams, new Function1<Boolean, Unit>() { // from class: com.heytap.store.payment.WXPayMiniTransitActivity.onCreate.1
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z) {
                    if (z) {
                        return;
                    }
                    WXPayMiniTransitActivity.this.exit();
                }
            });
            return;
        }
        if (!isFinishing()) {
            ToastUtils.show$default(ToastUtils.INSTANCE, "未安装微信，请选择其他支付方式", 0, 0, 0, 14, (Object) null);
        }
        exit();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.nextResumed) {
            exit();
        }
        this.nextResumed = true;
    }

    public final void setPayParams(@Nullable PayParams payParams) {
        this.payParams = payParams;
    }
}
