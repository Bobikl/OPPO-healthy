package com.heytap.store.pay;

import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/heytap/store/pay/PayCheckCallBack;", "", "callBack", "", "list", "", "Lcom/heytap/store/pay/PayCheckDataBean;", "pay-service_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface PayCheckCallBack {
    void callBack(@Nullable List<PayCheckDataBean> list);
}
