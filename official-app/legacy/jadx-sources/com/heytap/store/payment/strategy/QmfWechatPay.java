package com.heytap.store.payment.strategy;

import android.app.Activity;
import android.content.Intent;
import com.heytap.store.payment.WXPayMiniTransitActivity;
import com.heytap.store.payment.api.PayParams;
import com.oplus.aiunit.vision.vc;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0012"}, d2 = {"Lcom/heytap/store/payment/strategy/QmfWechatPay;", "Lcom/heytap/store/payment/strategy/AbstractPayService;", "()V", "onActivityResult", "", vc.KEY_REQUEST_CODE, "", "resultCode", "data", "Landroid/content/Intent;", "onDestroy", "onResume", "toPay", "", "activity", "Landroid/app/Activity;", "payParams", "Lcom/heytap/store/payment/api/PayParams;", "pay_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class QmfWechatPay extends AbstractPayService {
    @Override // com.heytap.store.payment.strategy.AbstractPayService
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
    }

    @Override // com.heytap.store.payment.strategy.AbstractPayService, com.heytap.store.payment.strategy.PayStrategy
    public void onDestroy() {
    }

    @Override // com.heytap.store.payment.strategy.PayStrategy
    public void onResume() {
        if (getIsToPay()) {
            AbstractPayService.checkPay$default(this, getPayParams().getSerial(), 0, 2, null);
        }
    }

    @Override // com.heytap.store.payment.strategy.AbstractPayService, com.heytap.store.payment.strategy.PayStrategy
    public boolean toPay(@NotNull Activity activity, @NotNull PayParams payParams) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(payParams, "payParams");
        super.toPay(activity, payParams);
        WXPayMiniTransitActivity.INSTANCE.toPay(activity, payParams);
        return true;
    }
}
