package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import com.client.platform.opensdk.pay.PayRequest;
import com.heytap.msp.bean.BizResponse;
import com.heytap.msp.bean.Response;
import com.heytap.msp.sdk.SdkAgent;
import com.heytap.msp.sdk.base.BaseSdkAgent;
import com.heytap.msp.sdk.base.callback.Callback;
import com.heytap.msp.sdk.base.common.DialogResourceConfig;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.pay.opensdk.model.PreOrderParameters;
import com.oplus.pay.opensdk.msp.R$string;
import com.oplus.pay.opensdk.msp.pay.PayConstant;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u0014\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007JH\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eJ0\u0010\u0013\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eH\u0002J0\u0010\u0014\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eH\u0002R(\u0010\u001d\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0016\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/oplus/aiunit/vision/n8c;", "", "Landroid/content/Context;", "context", "", "a", "", "isPreOder", "Lcom/client/platform/opensdk/pay/PayRequest;", "request", "Lcom/oplus/pay/opensdk/model/PreOrderParameters;", "preOrderParameters", "Landroid/content/Intent;", TraceConstants.KEY_ACTION, "Lcom/heytap/msp/sdk/base/callback/Callback;", "Lcom/heytap/msp/bean/BizResponse;", "", "callback", "d", "b", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getHasInited", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "setHasInited", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", "getHasInited$annotations", "()V", "hasInited", "<init>", "paysdk_release"}, k = 1, mv = {1, 8, 0})
public final class n8c {

    @NotNull
    public static final n8c INSTANCE = new n8c();

    @NotNull
    public static AtomicBoolean a = new AtomicBoolean(false);

    @JvmStatic
    public static final synchronized void a(@Nullable Context context) {
        if (a.get()) {
            return;
        }
        try {
            SdkAgent.init(context);
            Context context2 = BaseSdkAgent.getInstance().getContext();
            if (context2 == null) {
                return;
            }
            BaseSdkAgent.getInstance().setDialogResourceConfig(PayConstant.ModuleInfo.BIZ_NO, new DialogResourceConfig(context2.getResources().getString(R$string.tx_pay_app_install_title), context2.getResources().getString(R$string.tx_pay_app_install_content), context2.getResources().getString(R$string.tx_pay_app_install_positive), context2.getResources().getString(R$string.tx_pay_app_install_nagative)));
            a.set(true);
        } catch (Throwable th) {
            pce.c("MspPaySdk init error：" + th.getMessage());
        }
    }

    public final void b(PayRequest request, Intent intent, Callback<BizResponse<String>> callback) {
        pce.f("msp#pay");
        new cde(new xff(intent)).execute(request, PayConstant.MethodName.PAY, Response.class, callback, String.class);
    }

    public final void c(Intent intent, PreOrderParameters preOrderParameters, Callback<BizResponse<String>> callback) {
        pce.f("msp#payPreOrder");
        new cde(new xff(intent)).execute(preOrderParameters, PayConstant.MethodName.PAY_PRE_ORDER, Response.class, callback, String.class);
    }

    public final void d(@NotNull Context context, boolean isPreOder, @Nullable PayRequest request, @Nullable PreOrderParameters preOrderParameters, @Nullable Intent intent, @NotNull Callback<BizResponse<String>> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        a(context);
        if (isPreOder) {
            c(intent, preOrderParameters, callback);
        } else {
            b(request, intent, callback);
        }
    }
}
