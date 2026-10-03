package com.heytap.store.payment.service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.finshell.sdk.android.FinShellApi;
import com.finshell.sdk.android.model.OrderRequest;
import com.heytap.store.base.core.state.UrlConfig;
import com.heytap.store.base.core.util.app.AppConfig;
import com.heytap.store.base.core.util.deeplink.DeeplinkHelper;
import com.heytap.store.pay.IStorePayService;
import com.heytap.store.pay.PayCallBack;
import com.heytap.store.pay.PayCheckCallBack;
import com.heytap.store.pay.PayCheckDataBean;
import com.heytap.store.payment.HeytapPayActivity;
import com.heytap.store.payment.PaymentActivity;
import com.heytap.store.payment.api.PayParams;
import com.heytap.store.payment.api.PaymentApiServices;
import com.heytap.store.payment.applike.RouterConstKt;
import com.heytap.store.payment.data.HeytapSdkForm;
import com.heytap.store.payment.data.Meta;
import com.heytap.store.payment.data.Operation;
import com.heytap.store.payment.strategy.AbstractPayService;
import com.heytap.store.payment.strategy.PayStrategyFactory;
import com.heytap.store.payment.strategy.PayType;
import com.heytap.store.payment.utils.Util;
import com.heytap.store.platform.htrouter.facade.annotations.Route;
import com.heytap.store.platform.tools.GsonUtils;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.e30;
import com.oplus.aiunit.vision.ifg;
import com.oplus.aiunit.vision.ovf;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Route(path = RouterConstKt.SERVICE_PATH)
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0012H\u0002J(\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u0012H\u0002J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eJ \u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J(\u0010 \u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$H\u0016J(\u0010%\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u0012H\u0016J0\u0010%\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u0012H\u0016JV\u0010%\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\u0006\u0010\n\u001a\u00020\u0012H\u0016¨\u0006."}, d2 = {"Lcom/heytap/store/payment/service/StorePayServiceImpl;", "Lcom/heytap/store/pay/IStorePayService;", "()V", "checkPayMethodIsSupport", "", "activity", "Landroid/app/Activity;", "checkList", "", "Lcom/heytap/store/pay/PayCheckDataBean;", "callBack", "Lcom/heytap/store/pay/PayCheckCallBack;", "init", "context", "Landroid/content/Context;", "isPaying", "", "payCheckFailCallBack", "Lcom/heytap/store/pay/PayCallBack;", "prepayResultParse", "it", "Lcom/heytap/store/payment/data/Operation;", "payParams", "Lcom/heytap/store/payment/api/PayParams;", "setToken", "token", "", "startHeytapPayWeb", "url", "heytapSdkForm", "Lcom/heytap/store/payment/data/HeytapSdkForm;", "json", "startPayMainPage", "serial", "channel", Const.Batch.ARGUMENTS, "Landroid/os/Bundle;", "toPay", "paymentCode", "payMsg", "qishu", "fqType", "", "isFree", NotificationCompat.CATEGORY_RECOMMENDATION, "Companion", "pay_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class StorePayServiceImpl implements IStorePayService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static boolean mPaying;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/heytap/store/payment/service/StorePayServiceImpl$Companion;", "", "()V", "mPaying", "", "getMPaying", "()Z", "setMPaying", "(Z)V", "pay_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean getMPaying() {
            return StorePayServiceImpl.mPaying;
        }

        public final void setMPaying(boolean z) {
            StorePayServiceImpl.mPaying = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void payCheckFailCallBack(PayCallBack callBack) {
        callBack.callBack(PayCallBack.INSTANCE.getPAY_FIAL(), new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepayResultParse(Activity activity, Operation it, PayParams payParams, PayCallBack callBack) {
        AbstractPayService strategy;
        AbstractPayService resultCallBack;
        String str;
        String isNewPayMode = Util.INSTANCE.parseIsNewPayMode(payParams, it.msg);
        if (TextUtils.isEmpty(it.msg)) {
            Meta meta = it.meta;
            String str2 = "";
            if (meta != null && (str = meta.errorMessage) != null) {
                str2 = str;
            }
            if (!TextUtils.isEmpty(str2)) {
                payCheckFailCallBack(callBack);
            }
            if (Intrinsics.areEqual("订单已支付", str2) || Intrinsics.areEqual("订单已经支付", str2)) {
                payCheckFailCallBack(callBack);
                return;
            }
            return;
        }
        String str3 = it.msg;
        if (Intrinsics.areEqual(str3, "订单已取消")) {
            payCheckFailCallBack(callBack);
            return;
        }
        if (Intrinsics.areEqual(str3, "订单已支付")) {
            payCheckFailCallBack(callBack);
            return;
        }
        if (isNewPayMode == null) {
            isNewPayMode = it.msg;
            Intrinsics.checkNotNullExpressionValue(isNewPayMode, "it.msg");
        }
        payParams.setPayMsg(isNewPayMode);
        if (activity == null || (strategy = PayStrategyFactory.INSTANCE.getInstance().getStrategy(payParams.getPayMethod())) == null || (resultCallBack = strategy.setResultCallBack(callBack)) == null) {
            return;
        }
        resultCallBack.toPay(activity, payParams);
    }

    @Override // com.heytap.store.pay.IStorePayService
    public void checkPayMethodIsSupport(@NotNull Activity activity, @Nullable List<PayCheckDataBean> checkList, @NotNull PayCheckCallBack callBack) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        Util.INSTANCE.checkPayMethodIsSupport(activity, checkList);
        callBack.callBack(checkList);
    }

    @Override // com.heytap.store.platform.htrouter.facade.template.IProvider
    public void init(@Nullable Context context) {
    }

    @Override // com.heytap.store.pay.IStorePayService
    public boolean isPaying() {
        return mPaying;
    }

    @Override // com.heytap.store.pay.IStorePayService
    public void setToken(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
    }

    @Override // com.heytap.store.pay.IStorePayService
    public void startHeytapPayWeb(@NotNull Activity activity, @NotNull String url, @NotNull String json) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(json, "json");
        startHeytapPayWeb(activity, url, (HeytapSdkForm) GsonUtils.INSTANCE.fromJson(json, HeytapSdkForm.class));
    }

    @Override // com.heytap.store.pay.IStorePayService
    public void startPayMainPage(@NotNull Activity activity, @NotNull String serial, @NotNull String channel, @NotNull Bundle arguments) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(serial, "serial");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intent intent = new Intent(activity, (Class<?>) PaymentActivity.class);
        intent.putExtra("serial", serial);
        intent.putExtra("channel", channel);
        activity.startActivity(intent);
    }

    @Override // com.heytap.store.pay.IStorePayService
    public void toPay(@NotNull Activity activity, @NotNull String paymentCode, @NotNull String payMsg, @NotNull PayCallBack callBack) {
        AbstractPayService resultCallBack;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(paymentCode, "paymentCode");
        Intrinsics.checkNotNullParameter(payMsg, "payMsg");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        mPaying = true;
        PayParams payParams = new PayParams();
        payParams.setPayMsg(payMsg);
        payParams.setCallBackOnly(true);
        payParams.setPayMethod(paymentCode);
        if (UrlConfig.DEBUG) {
            Log.d("payTest", Intrinsics.stringPlus("toPay payParams :", payParams));
            Log.d("payTest", Intrinsics.stringPlus("toPay payMsg :", payMsg));
        }
        AbstractPayService strategy = PayStrategyFactory.INSTANCE.getInstance().getStrategy(paymentCode);
        if (strategy == null || (resultCallBack = strategy.setResultCallBack(callBack)) == null) {
            return;
        }
        resultCallBack.toPay(activity, payParams);
    }

    public final void startHeytapPayWeb(@NotNull Activity activity, @NotNull String url, @NotNull HeytapSdkForm heytapSdkForm) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(heytapSdkForm, "heytapSdkForm");
        Boolean bool = AppConfig.getInstance().sdkEnv;
        Intrinsics.checkNotNullExpressionValue(bool, "getInstance().sdkEnv");
        if (bool.booleanValue()) {
            HeytapPayActivity.INSTANCE.toPay(activity, url);
            return;
        }
        String str = heytapSdkForm.appId;
        String str2 = heytapSdkForm.prePayId;
        String str3 = heytapSdkForm.mchId;
        String str4 = heytapSdkForm.nonce;
        String str5 = heytapSdkForm.sign;
        String str6 = heytapSdkForm.ext;
        String str7 = heytapSdkForm.timestamp;
        FinShellApi.registerApp(activity.getApplication(), str);
        if (UrlConfig.CRASH_LOG) {
            DeeplinkHelper.INSTANCE.navigation(activity, url, (252 & 4) != 0 ? null : null, (252 & 8) != 0 ? false : false, (252 & 16) != 0 ? 3 : 0, (252 & 32) != 0 ? null : null, (252 & 64) != 0 ? null : null, (252 & 128) != 0 ? null : null);
        } else if (FinShellApi.isSupport(activity.getApplication())) {
            FinShellApi.send(activity.getApplication(), new OrderRequest(str2, str3, str4, str5, str6, str7));
        } else {
            DeeplinkHelper.INSTANCE.navigation(activity, url, (252 & 4) != 0 ? null : null, (252 & 8) != 0 ? false : false, (252 & 16) != 0 ? 3 : 0, (252 & 32) != 0 ? null : null, (252 & 64) != 0 ? null : null, (252 & 128) != 0 ? null : null);
        }
    }

    @Override // com.heytap.store.pay.IStorePayService
    public void toPay(@NotNull Activity activity, @NotNull String serial, @NotNull String paymentCode, @NotNull String payMsg, @NotNull PayCallBack callBack) {
        AbstractPayService resultCallBack;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(serial, "serial");
        Intrinsics.checkNotNullParameter(paymentCode, "paymentCode");
        Intrinsics.checkNotNullParameter(payMsg, "payMsg");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        mPaying = true;
        PayParams payParams = new PayParams();
        payParams.setPayMsg(payMsg);
        payParams.setSerial(serial);
        payParams.setPayMethod(paymentCode);
        payParams.setCallBackOnly(true);
        payParams.setNoToast(true);
        if (UrlConfig.DEBUG) {
            Log.d("payTest", Intrinsics.stringPlus("toPay payParams :", payParams));
            Log.d("payTest", Intrinsics.stringPlus("toPay payMsg :", payMsg));
        }
        AbstractPayService strategy = PayStrategyFactory.INSTANCE.getInstance().getStrategy(paymentCode);
        if (strategy == null || (resultCallBack = strategy.setResultCallBack(callBack)) == null) {
            return;
        }
        resultCallBack.toPay(activity, payParams);
    }

    @Override // com.heytap.store.pay.IStorePayService
    public void toPay(@NotNull final Activity activity, @NotNull String serial, @NotNull String paymentCode, @NotNull String payMsg, @NotNull String qishu, int fqType, int isFree, @NotNull List<String> recommendation, @NotNull final PayCallBack callBack) {
        AbstractPayService resultCallBack;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(serial, "serial");
        Intrinsics.checkNotNullParameter(paymentCode, "paymentCode");
        Intrinsics.checkNotNullParameter(payMsg, "payMsg");
        Intrinsics.checkNotNullParameter(qishu, "qishu");
        Intrinsics.checkNotNullParameter(recommendation, "recommendation");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        if (!(payMsg.length() == 0)) {
            toPay(activity, serial, paymentCode, payMsg, callBack);
            return;
        }
        final PayParams payParams = new PayParams();
        payParams.setSerial(serial);
        payParams.setPayMethod(paymentCode);
        payParams.setQiShu(qishu);
        payParams.setFqType(String.valueOf(fqType));
        payParams.setFree(isFree == 1);
        payParams.setRecommendPayMethods(recommendation);
        payParams.setOnlyOne(Boolean.valueOf(recommendation.size() == 1));
        payParams.setCallBackOnly(true);
        payParams.setNoToast(true);
        Util.INSTANCE.filterRecommendPayMethod(activity, payParams);
        if (Intrinsics.areEqual(payParams.getPayMethod(), PayType.QMF_WECHAT_PAY.getPayMethod())) {
            AbstractPayService strategy = PayStrategyFactory.INSTANCE.getInstance().getStrategy(payParams.getPayMethod());
            if (strategy == null || (resultCallBack = strategy.setResultCallBack(callBack)) == null) {
                return;
            }
            resultCallBack.toPay(activity, payParams);
            return;
        }
        ((PaymentApiServices) ovf.e(ovf.INSTANCE, PaymentApiServices.class, null, 2, null)).getPrepayOrder(payParams.toMap()).B(ifg.b()).r(e30.a()).subscribe(new bed<Operation>() { // from class: com.heytap.store.payment.service.StorePayServiceImpl.toPay.1
            @Override // com.oplus.aiunit.vision.bed
            public void onComplete() {
            }

            @Override // com.oplus.aiunit.vision.bed
            public void onError(@NotNull Throwable e2) {
                Intrinsics.checkNotNullParameter(e2, "e");
                StorePayServiceImpl.this.payCheckFailCallBack(callBack);
            }

            @Override // com.oplus.aiunit.vision.bed
            public void onSubscribe(@NotNull cv5 d) {
                Intrinsics.checkNotNullParameter(d, "d");
            }

            @Override // com.oplus.aiunit.vision.bed
            public void onNext(@NotNull Operation t) {
                Intrinsics.checkNotNullParameter(t, "t");
                Integer num = t.meta.code;
                if (num != null && num.intValue() == 403) {
                    StorePayServiceImpl.this.payCheckFailCallBack(callBack);
                } else {
                    StorePayServiceImpl.this.prepayResultParse(activity, t, payParams, callBack);
                }
                if (UrlConfig.DEBUG) {
                    Log.d("payTest", Intrinsics.stringPlus("getPrepayOrder ", t));
                }
            }
        });
    }
}
