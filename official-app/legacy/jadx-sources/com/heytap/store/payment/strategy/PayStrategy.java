package com.heytap.store.payment.strategy;

import android.app.Activity;
import com.heytap.store.payment.api.PayParams;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/heytap/store/payment/strategy/PayStrategy;", "", "onDestroy", "", "onResume", "toPay", "", "activity", "Landroid/app/Activity;", "payParams", "Lcom/heytap/store/payment/api/PayParams;", "pay_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface PayStrategy {
    void onDestroy();

    void onResume();

    boolean toPay(@NotNull Activity activity, @NotNull PayParams payParams);
}
