package com.heytap.store.payment.strategy;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import com.heytap.store.base.core.state.UrlConfig;
import com.heytap.store.base.core.util.GsonUtils;
import com.heytap.store.pay.PayCallBack;
import com.heytap.store.payment.PaySuccessActivity;
import com.heytap.store.payment.api.PayParams;
import com.heytap.store.payment.data.CheckPayStatus;
import com.heytap.store.payment.data.PaySuccessMoreLink;
import com.heytap.store.payment.data.PaymentRepository;
import com.heytap.store.payment.p006const.PayConsKt;
import com.heytap.store.payment.strategy.AbstractPayService;
import com.heytap.store.platform.htrouter.launcher.business.HTAliasRouter;
import com.heytap.store.platform.tools.ToastUtils;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.vc;
import io.protostuff.MapSchema;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u0010H\u0014J\u000e\u0010 \u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001bJ\b\u0010!\u001a\u0004\u0018\u00010\u0018J\"\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010&H&J\b\u0010'\u001a\u00020\u001dH\u0016J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018J\u0018\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/heytap/store/payment/strategy/AbstractPayService;", "Lcom/heytap/store/payment/strategy/PayStrategy;", "()V", "activityReference", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "getActivityReference", "()Ljava/lang/ref/WeakReference;", "setActivityReference", "(Ljava/lang/ref/WeakReference;)V", "isToPay", "", "()Z", "setToPay", "(Z)V", "maxTimes", "", "payParams", "Lcom/heytap/store/payment/api/PayParams;", "getPayParams", "()Lcom/heytap/store/payment/api/PayParams;", "setPayParams", "(Lcom/heytap/store/payment/api/PayParams;)V", "resultCallBack", "Lcom/heytap/store/pay/PayCallBack;", "retryTimes", "skuId", "", "checkPay", "", "serial", "payStatus", "getPaySuccessMoreLink", "getResultCallBack", "onActivityResult", vc.KEY_REQUEST_CODE, "resultCode", "data", "Landroid/content/Intent;", "onDestroy", "setResultCallBack", "toPay", "activity", "pay_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class AbstractPayService implements PayStrategy {
    public WeakReference<Activity> activityReference;
    private boolean isToPay;
    public PayParams payParams;

    @Nullable
    private PayCallBack resultCallBack;
    private int retryTimes;

    @NotNull
    private String skuId = "";
    private int maxTimes = 1;

    /* JADX INFO: renamed from: com.heytap.store.payment.strategy.AbstractPayService$checkPay$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"com/heytap/store/payment/strategy/AbstractPayService$checkPay$1", "Lcom/oplus/aiunit/vision/bed;", "Lcom/heytap/store/payment/data/CheckPayStatus;", "Lcom/oplus/aiunit/vision/cv5;", "d", "", "onSubscribe", "t", "onNext", "", MapSchema.FIELD_NAME_ENTRY, "onError", "onComplete", "pay_release"}, k = 1, mv = {1, 6, 0})
    public static final class AnonymousClass1 implements bed<CheckPayStatus> {
        final /* synthetic */ int $payStatus;
        final /* synthetic */ String $serial;
        final /* synthetic */ AbstractPayService this$0;

        public AnonymousClass1(String str, AbstractPayService abstractPayService, int i) {
            this.$serial = str;
            this.this$0 = abstractPayService;
            this.$payStatus = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: onNext$lambda-0, reason: not valid java name */
        public static final void m5026onNext$lambda0(AbstractPayService this$0, String serial, int i) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(serial, "$serial");
            this$0.checkPay(serial, i);
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onComplete() {
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onError(@NotNull Throwable e2) {
            Intrinsics.checkNotNullParameter(e2, "e");
            if (UrlConfig.DEBUG) {
                Log.d("payTest", "checkPay serial " + this.$serial + "status error " + e2);
            }
            PayCallBack payCallBack = this.this$0.resultCallBack;
            if (payCallBack == null) {
                return;
            }
            payCallBack.callBack(PayCallBack.INSTANCE.getPAY_FIAL(), new HashMap());
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onSubscribe(@NotNull cv5 d) {
            Intrinsics.checkNotNullParameter(d, "d");
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onNext(@NotNull CheckPayStatus t) {
            String str;
            String str2;
            String str3;
            String str4;
            Intrinsics.checkNotNullParameter(t, "t");
            if (UrlConfig.DEBUG) {
                Log.d("payTest", "checkPay serial :" + this.$serial + " status back:" + ((Object) GsonUtils.toJsonString(t)));
            }
            if (this.this$0.retryTimes < this.this$0.maxTimes && this.$payStatus == PayCallBack.INSTANCE.getPAY_SUCCESS()) {
                CheckPayStatus.PayStatus payStatus = t.data;
                if (!Intrinsics.areEqual(payStatus == null ? null : payStatus.status, "SUCCESS")) {
                    Handler handler = new Handler();
                    final AbstractPayService abstractPayService = this.this$0;
                    final String str5 = this.$serial;
                    final int i = this.$payStatus;
                    handler.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.o6
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractPayService.AnonymousClass1.m5026onNext$lambda0(abstractPayService, str5, i);
                        }
                    }, 1000L);
                    this.this$0.retryTimes++;
                    return;
                }
            }
            AbstractPayService abstractPayService2 = this.this$0;
            CheckPayStatus.PayStatus payStatus2 = t.data;
            String str6 = "";
            if (payStatus2 == null || (str = payStatus2.skuId) == null) {
                str = "";
            }
            abstractPayService2.skuId = str;
            CheckPayStatus.PayStatus payStatus3 = t.data;
            if (Intrinsics.areEqual(payStatus3 == null ? null : payStatus3.status, "SUCCESS")) {
                PayCallBack payCallBack = this.this$0.resultCallBack;
                if (payCallBack != null) {
                    int pay_success = PayCallBack.INSTANCE.getPAY_SUCCESS();
                    Pair[] pairArr = new Pair[1];
                    CheckPayStatus.PayStatus payStatus4 = t.data;
                    if (payStatus4 != null && (str4 = payStatus4.link) != null) {
                        str6 = str4;
                    }
                    pairArr[0] = TuplesKt.to("link", str6);
                    payCallBack.callBack(pay_success, MapsKt__MapsKt.mutableMapOf(pairArr));
                }
                if (this.this$0.getPayParams().getCallBackOnly()) {
                    return;
                }
                this.this$0.getPaySuccessMoreLink(this.$serial);
                return;
            }
            CheckPayStatus.PayStatus payStatus5 = t.data;
            if (Intrinsics.areEqual(payStatus5 != null ? payStatus5.status : null, "PROC")) {
                PayCallBack payCallBack2 = this.this$0.resultCallBack;
                if (payCallBack2 == null) {
                    return;
                }
                int pay_cancel = PayCallBack.INSTANCE.getPAY_CANCEL();
                Pair[] pairArr2 = new Pair[1];
                CheckPayStatus.PayStatus payStatus6 = t.data;
                if (payStatus6 != null && (str3 = payStatus6.link) != null) {
                    str6 = str3;
                }
                pairArr2[0] = TuplesKt.to("link", str6);
                payCallBack2.callBack(pay_cancel, MapsKt__MapsKt.mutableMapOf(pairArr2));
                return;
            }
            PayCallBack payCallBack3 = this.this$0.resultCallBack;
            if (payCallBack3 != null) {
                int pay_fial = PayCallBack.INSTANCE.getPAY_FIAL();
                Pair[] pairArr3 = new Pair[1];
                CheckPayStatus.PayStatus payStatus7 = t.data;
                if (payStatus7 != null && (str2 = payStatus7.link) != null) {
                    str6 = str2;
                }
                pairArr3[0] = TuplesKt.to("link", str6);
                payCallBack3.callBack(pay_fial, MapsKt__MapsKt.mutableMapOf(pairArr3));
            }
            String str7 = t.errorMsg;
            if (str7 == null) {
                return;
            }
            ToastUtils.show$default(ToastUtils.INSTANCE, str7, 0, 0, 0, 14, (Object) null);
        }
    }

    public static /* synthetic */ void checkPay$default(AbstractPayService abstractPayService, String str, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkPay");
        }
        if ((i2 & 2) != 0) {
            i = PayCallBack.INSTANCE.getPAY_FIAL();
        }
        abstractPayService.checkPay(str, i);
    }

    public void checkPay(@NotNull String serial, int payStatus) {
        Intrinsics.checkNotNullParameter(serial, "serial");
        if (!(serial.length() == 0)) {
            PaymentRepository.INSTANCE.checkPay(serial, new AnonymousClass1(serial, this, payStatus));
            return;
        }
        if (UrlConfig.DEBUG) {
            Log.d("payTest", Intrinsics.stringPlus("checkPay status no serial:", Integer.valueOf(payStatus)));
        }
        PayCallBack payCallBack = this.resultCallBack;
        if (payCallBack == null) {
            return;
        }
        payCallBack.callBack(payStatus, new HashMap());
    }

    @NotNull
    public final WeakReference<Activity> getActivityReference() {
        WeakReference<Activity> weakReference = this.activityReference;
        if (weakReference != null) {
            return weakReference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("activityReference");
        return null;
    }

    @NotNull
    public final PayParams getPayParams() {
        PayParams payParams = this.payParams;
        if (payParams != null) {
            return payParams;
        }
        Intrinsics.throwUninitializedPropertyAccessException("payParams");
        return null;
    }

    public final void getPaySuccessMoreLink(@NotNull final String serial) {
        Intrinsics.checkNotNullParameter(serial, "serial");
        PaymentRepository.INSTANCE.getMoreLink(serial, new bed<PaySuccessMoreLink>() { // from class: com.heytap.store.payment.strategy.AbstractPayService.getPaySuccessMoreLink.1
            @Override // com.oplus.aiunit.vision.bed
            public void onComplete() {
            }

            @Override // com.oplus.aiunit.vision.bed
            public void onError(@NotNull Throwable e2) {
                Intrinsics.checkNotNullParameter(e2, "e");
                if (UrlConfig.DEBUG) {
                    Log.d("payTest", Intrinsics.stringPlus("getPaySuccessMoreLink error ", e2));
                }
            }

            @Override // com.oplus.aiunit.vision.bed
            public void onSubscribe(@NotNull cv5 d) {
                Intrinsics.checkNotNullParameter(d, "d");
            }

            @Override // com.oplus.aiunit.vision.bed
            public void onNext(@NotNull PaySuccessMoreLink t) throws InterruptedException {
                Intrinsics.checkNotNullParameter(t, "t");
                Integer num = t.meta.code;
                if (num != null && num.intValue() == 200) {
                    String moreLink = t.details.moreLink;
                    if (!(moreLink == null || moreLink.length() == 0)) {
                        ToastUtils.show$default(ToastUtils.INSTANCE, "支付成功", 0, 0, 0, 14, (Object) null);
                        Activity activity = AbstractPayService.this.getActivityReference().get();
                        if (activity == null) {
                            return;
                        }
                        HTAliasRouter companion = HTAliasRouter.INSTANCE.getInstance();
                        Intrinsics.checkNotNullExpressionValue(moreLink, "moreLink");
                        HTAliasRouter.navigation$default(companion, moreLink, activity, null, null, null, 0, false, 124, null);
                        activity.finish();
                        return;
                    }
                    Activity activity2 = AbstractPayService.this.getActivityReference().get();
                    if (activity2 == null) {
                        return;
                    }
                    AbstractPayService abstractPayService = AbstractPayService.this;
                    String str = serial;
                    Intent intent = new Intent(activity2, (Class<?>) PaySuccessActivity.class);
                    intent.putExtra(PayConsKt.ORDERPRICE, abstractPayService.getPayParams().getAmount());
                    intent.putExtra(PayConsKt.SKUID, abstractPayService.skuId);
                    intent.putExtra("serial", str);
                    intent.putExtra("channel", abstractPayService.getPayParams().getChannel());
                    activity2.startActivity(intent);
                    activity2.finish();
                }
            }
        });
    }

    @Nullable
    public final PayCallBack getResultCallBack() {
        return this.resultCallBack;
    }

    /* JADX INFO: renamed from: isToPay, reason: from getter */
    public final boolean getIsToPay() {
        return this.isToPay;
    }

    public abstract void onActivityResult(int requestCode, int resultCode, @Nullable Intent data);

    @Override // com.heytap.store.payment.strategy.PayStrategy
    public void onDestroy() {
        this.resultCallBack = null;
    }

    public final void setActivityReference(@NotNull WeakReference<Activity> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.activityReference = weakReference;
    }

    public final void setPayParams(@NotNull PayParams payParams) {
        Intrinsics.checkNotNullParameter(payParams, "<set-?>");
        this.payParams = payParams;
    }

    @NotNull
    public final AbstractPayService setResultCallBack(@NotNull PayCallBack resultCallBack) {
        Intrinsics.checkNotNullParameter(resultCallBack, "resultCallBack");
        this.resultCallBack = resultCallBack;
        return this;
    }

    public final void setToPay(boolean z) {
        this.isToPay = z;
    }

    @Override // com.heytap.store.payment.strategy.PayStrategy
    public boolean toPay(@NotNull Activity activity, @NotNull PayParams payParams) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(payParams, "payParams");
        setActivityReference(new WeakReference<>(activity));
        this.isToPay = true;
        setPayParams(payParams);
        return true;
    }
}
