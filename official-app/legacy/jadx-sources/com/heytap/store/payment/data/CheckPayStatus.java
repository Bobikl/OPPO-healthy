package com.heytap.store.payment.data;

import com.heytap.store.base.core.data.IBean;

/* JADX INFO: loaded from: classes5.dex */
public class CheckPayStatus implements IBean {
    public PayStatus data;
    public String errorCode;
    public String errorMsg;

    public static class PayStatus implements IBean {
        public String link;
        public String orderNo;
        public String payGateway;
        public String paymentNo;
        public String skuId;
        public String status;
    }
}
