package com.heytap.theme.watch.domain.dto.request.order;

import io.protostuff.Tag;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public class QueryOrderParam implements Serializable {
    private static final long serialVersionUID = -2010483825709402115L;

    @Tag(1)
    private String orderId;

    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }
}
