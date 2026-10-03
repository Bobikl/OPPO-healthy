package com.platform.sdk.center.pay;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;
import com.client.platform.opensdk.pay.PayRequest;
import com.client.platform.opensdk.pay.PayTask;
import com.client.platform.opensdk.pay.Utils;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import com.heytap.store.base.core.util.statistics.bean.UtmBean;
import com.heytap.usercenter.accountsdk.AccountAgent;
import com.oplus.aiunit.vision.pbe;
import com.oplus.aiunit.vision.sae;
import com.oplus.aiunit.vision.sbe;
import com.oplus.pay.opensdk.model.PreOrderParameters;
import com.platform.sdk.center.pay.PayTaskHelper;
import com.platform.sdk.center.utils.AcAppUtils;
import com.platform.sdk.center.utils.AcKeyguardUtils;
import com.platform.usercenter.account.mba.OutsideApk;
import com.platform.usercenter.basic.provider.UCCommonXor8Provider;
import com.platform.usercenter.tools.ApkInfoHelper;
import com.platform.usercenter.tools.device.UCDeviceInfoUtil;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.thread.BackgroundExecutor;
import com.platform.usercenter.uws.view.observer.UwsBaseObserver;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class PayTaskHelper {
    private static final String TAG = "PayTaskHelper";
    private static BroadcastReceiver mReceiver;
    private static Set responseSet;

    public class a extends BroadcastReceiver {
        public final /* synthetic */ PayTaskCallback a;

        public a(PayTaskCallback payTaskCallback) {
            this.a = payTaskCallback;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
            try {
                String stringExtra = intent.getStringExtra(AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE);
                PayTaskHelper.sendResultBroadcast(context, stringExtra);
                JSONObject jSONObject = new JSONObject(stringExtra);
                PayTaskCallback payTaskCallback = this.a;
                if (payTaskCallback != null) {
                    payTaskCallback.onPayTaskReusult(true, new JSONObject(stringExtra), "");
                }
                String strOptString = jSONObject.optString("order");
                if (PayTaskHelper.responseSet != null && PayTaskHelper.responseSet.size() > 0) {
                    PayTaskHelper.responseSet.remove(strOptString);
                    UCLogUtil.d(PayTaskHelper.TAG, "responseSet remove");
                }
            } catch (Exception e2) {
                UCLogUtil.e(PayTaskHelper.TAG, e2);
                PayTaskCallback payTaskCallback2 = this.a;
                if (payTaskCallback2 != null) {
                    payTaskCallback2.onPayTaskReusult(false, null, e2.getMessage());
                }
            }
            if (PayTaskHelper.responseSet == null || PayTaskHelper.responseSet.size() > 0) {
                return;
            }
            PayTaskHelper.unRegisterReceiver(context);
        }
    }

    public class b implements AcKeyguardUtils.KeyguardDismissCallback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ JSONObject f20263c;
        public final /* synthetic */ PayTaskCallback d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ PayObserverOperate f20264e;

        public b(Context context, String str, JSONObject jSONObject, PayTaskCallback payTaskCallback, PayObserverOperate payObserverOperate) {
            this.a = context;
            this.b = str;
            this.f20263c = jSONObject;
            this.d = payTaskCallback;
            this.f20264e = payObserverOperate;
        }

        @Override // com.platform.sdk.center.utils.AcKeyguardUtils.KeyguardDismissCallback
        public final void onDismissFailed() {
            UCLogUtil.d(PayTaskHelper.TAG, "requestDismissKeyguard DismissCancelled");
        }

        @Override // com.platform.sdk.center.utils.AcKeyguardUtils.KeyguardDismissCallback
        public final void onDismissSucceeded() {
            PayTaskHelper.pay(this.a, this.b, this.f20263c, this.d, this.f20264e);
        }
    }

    @NonNull
    private static BroadcastReceiver getBroadcastReceiver(PayTaskCallback payTaskCallback) {
        return new a(payTaskCallback);
    }

    public static int getPayApkVersionCode(Context context) {
        return Utils.getPayApkVersionCode(context);
    }

    private static PayRequest getPayRequest(Context context, JSONObject jSONObject, String str) {
        PayRequest payRequest = new PayRequest();
        Set set = responseSet;
        if (set == null) {
            responseSet = new HashSet();
        } else {
            set.clear();
        }
        String str2 = (String) jSONObject.get("partner_order");
        payRequest.mPartnerOrder = str2;
        responseSet.add(str2);
        payRequest.mAmount = Double.parseDouble((String) jSONObject.get("amount"));
        payRequest.mAppVersion = ApkInfoHelper.getVersionName(context, ApkInfoHelper.getPackageName(context));
        payRequest.mProductName = (String) jSONObject.get(SensorsBean.PRODUCT_NAME);
        payRequest.mNotifyUrl = (String) jSONObject.get("notify_url");
        payRequest.mChannelId = jSONObject.optString(Fields.CHANNEL_ID_FIELD);
        payRequest.mProductDesc = jSONObject.optString("product_desc", "");
        payRequest.mSource = jSONObject.optString("source", UtmBean.UC);
        payRequest.mAttach = jSONObject.optString("attach", "");
        payRequest.mCount = 1;
        int iOptInt = jSONObject.optInt("paytype", 2);
        payRequest.mType = iOptInt;
        payRequest.mCurrencyName = iOptInt == 2 ? "人民币" : "可币";
        payRequest.mExchangeRatio = 1.0f;
        payRequest.mChargeLimit = 0.01f;
        payRequest.mAppCode = jSONObject.optString(UCCommonXor8Provider.getNormalStrByDecryptXOR8("ixxWkglm"), "3012");
        payRequest.mPartnerId = jSONObject.optString("partner_id");
        payRequest.mIsSinglePay = jSONObject.optBoolean("singlepay", false);
        payRequest.mPackageName = jSONObject.optString("package_name", context.getPackageName());
        payRequest.mToken = str;
        payRequest.mSign = jSONObject.optString("sign");
        payRequest.mCountryCode = UCDeviceInfoUtil.getCurRegion();
        payRequest.mCurrencyCode = jSONObject.optString(DeepLinkInterpreter.KEY_CURRENCY, sae.CURRENCY);
        payRequest.mTagKey = jSONObject.optString(UCCommonXor8Provider.getNormalStrByDecryptXOR8("ixxWcmq"));
        payRequest.mAutoOrderChannel = jSONObject.optString("auto_order_channel");
        payRequest.mAutoRenew = jSONObject.optInt("auto_renew");
        payRequest.isAutoRenewToPayCenter = jSONObject.optBoolean("auto_renew_to_pay_center");
        payRequest.signAgreementNotifyUrl = jSONObject.optString("sign_agreement_notify_url");
        payRequest.renewalExtra = jSONObject.optString("renewalExtra");
        payRequest.creditEnable = jSONObject.optString("creditEnable");
        return payRequest;
    }

    private static PreOrderParameters getPreOrderParameters(Context context, JSONObject jSONObject, String str) {
        PreOrderParameters preOrderParameters = new PreOrderParameters();
        Set set = responseSet;
        if (set == null) {
            responseSet = new HashSet();
        } else {
            set.clear();
        }
        preOrderParameters.prePayToken = jSONObject.optString(sbe.PAY_SDK_PREPAYTOKEN);
        responseSet.add(jSONObject.optString("partner_order"));
        preOrderParameters.mCountryCode = UCDeviceInfoUtil.getCurRegion();
        preOrderParameters.mToken = str;
        preOrderParameters.mCurrencyName = jSONObject.optInt("paytype", 2) == 2 ? "人民币" : "可币";
        preOrderParameters.mPackageName = jSONObject.optString("package_name", context.getPackageName());
        preOrderParameters.mAppVersion = ApkInfoHelper.getVersionName(context, ApkInfoHelper.getPackageName(context));
        preOrderParameters.mChannelId = jSONObject.optString(Fields.CHANNEL_ID_FIELD);
        preOrderParameters.mAttach = jSONObject.optString("attach", "");
        preOrderParameters.mAutoOrderChannel = jSONObject.optString("auto_order_channel");
        preOrderParameters.acrossScreen = jSONObject.optString("acrossScreen");
        preOrderParameters.userRegisterCountry = AccountAgent.reqAccountCountry(context);
        return preOrderParameters;
    }

    @Deprecated
    public static boolean isSupportAliRenew(Context context) {
        return PayTask.isSupportARenew(context);
    }

    @Deprecated
    public static boolean isSupportWechatRenew(Context context) {
        return PayTask.isSupportWechatRenew(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$requestDismissKeyguard$0(Context context, String str, JSONObject jSONObject, PayTaskCallback payTaskCallback, PayObserverOperate payObserverOperate) {
        UCLogUtil.d(TAG, "runOnUiThread run");
        AcKeyguardUtils.a(context, new b(context, str, jSONObject, payTaskCallback, payObserverOperate));
    }

    private static void onPay(Context context, JSONObject jSONObject, String str) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject("pay_params");
        if (jSONObject2.optInt("orderType") != 1) {
            pbe.INSTANCE.a(context, getPayRequest(context, jSONObject2, str), false);
        } else {
            pbe.INSTANCE.b(context, getPreOrderParameters(context, jSONObject2, str), false);
        }
    }

    public static void pay(Context context, String str, JSONObject jSONObject, PayTaskCallback payTaskCallback, PayObserverOperate payObserverOperate) {
        UCLogUtil.d(TAG, "pay");
        if (AcKeyguardUtils.a(context)) {
            UCLogUtil.d(TAG, "not isKeyguardLocked");
            requestDismissKeyguard(context, str, jSONObject, payTaskCallback, payObserverOperate);
            return;
        }
        String strPayPackageName = OutsideApk.payPackageName(context);
        if (!AcAppUtils.checkEnable(context, strPayPackageName)) {
            AcAppUtils.showMBADialog(context, strPayPackageName);
            if (payTaskCallback != null) {
                payTaskCallback.onPayTaskReusult(false, null, "app has disabled");
                return;
            }
            return;
        }
        try {
            registerReceiver(context, payTaskCallback, payObserverOperate);
            onPay(context, jSONObject, str);
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            if (payTaskCallback != null) {
                payTaskCallback.onPayTaskReusult(false, null, e2.getMessage());
            }
        }
    }

    private static void registerReceiver(final Context context, PayTaskCallback payTaskCallback, PayObserverOperate payObserverOperate) {
        unRegisterReceiver(context);
        mReceiver = getBroadcastReceiver(payTaskCallback);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(sae.ACTION_PAY_RESPONSE);
        intentFilter.addAction("nearme.pay.response.order");
        if (Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(mReceiver, intentFilter);
        } else {
            context.registerReceiver(mReceiver, intentFilter, 2);
        }
        if (payObserverOperate != null) {
            payObserverOperate.addObserver(new UwsBaseObserver() { // from class: com.platform.sdk.center.pay.PayTaskHelper.1
                @Override // com.platform.usercenter.uws.view.observer.UwsBaseObserver, androidx.lifecycle.DefaultLifecycleObserver
                public final void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
                    PayTaskHelper.unRegisterReceiver(context);
                }
            });
        } else {
            UCLogUtil.w(TAG, "observerOperate observerOperate == null");
        }
    }

    private static void requestDismissKeyguard(final Context context, final String str, final JSONObject jSONObject, final PayTaskCallback payTaskCallback, final PayObserverOperate payObserverOperate) {
        BackgroundExecutor.runOnUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.hce
            @Override // java.lang.Runnable
            public final void run() {
                PayTaskHelper.lambda$requestDismissKeyguard$0(context, str, jSONObject, payTaskCallback, payObserverOperate);
            }
        }, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sendResultBroadcast(Context context, String str) {
        Intent intent = new Intent("com.heytap.vip.sdk.nearme_pay_response");
        intent.setPackage(context.getPackageName());
        intent.putExtra(AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, str);
        context.sendBroadcast(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void unRegisterReceiver(Context context) {
        try {
            BroadcastReceiver broadcastReceiver = mReceiver;
            if (broadcastReceiver != null) {
                context.unregisterReceiver(broadcastReceiver);
                mReceiver = null;
            }
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
        }
    }
}
