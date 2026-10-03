package com.heytap.store.payment.strategy;

import android.app.Activity;
import android.content.Intent;
import com.heytap.store.payment.api.PayParams;
import com.oplus.aiunit.vision.vc;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/heytap/store/payment/strategy/OPPOPay;", "Lcom/heytap/store/payment/strategy/AbstractPayService;", "()V", "OPPO_PAY", "", "mode", "onActivityResult", "", vc.KEY_REQUEST_CODE, "", "resultCode", "data", "Landroid/content/Intent;", "onResume", "toPay", "", "activity", "Landroid/app/Activity;", "payParams", "Lcom/heytap/store/payment/api/PayParams;", "pay_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OPPOPay extends AbstractPayService {

    @NotNull
    private final String mode = "00";

    @NotNull
    private final String OPPO_PAY = "29";

    @Override // com.heytap.store.payment.strategy.AbstractPayService
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
    }

    @Override // com.heytap.store.payment.strategy.PayStrategy
    public void onResume() {
    }

    @Override // com.heytap.store.payment.strategy.AbstractPayService, com.heytap.store.payment.strategy.PayStrategy
    public boolean toPay(@NotNull Activity activity, @NotNull PayParams payParams) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(payParams, "payParams");
        super.toPay(activity, payParams);
        return true;
    }
}
