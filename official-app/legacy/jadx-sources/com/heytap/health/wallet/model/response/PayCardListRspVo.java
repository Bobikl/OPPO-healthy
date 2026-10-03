package com.heytap.health.wallet.model.response;

import androidx.annotation.Keep;
import io.protostuff.Tag;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class PayCardListRspVo {

    @Tag(1)
    private List<PayCardInfo> payCardList;

    public List<PayCardInfo> getPayCardList() {
        return this.payCardList;
    }

    public void setPayCardList(List<PayCardInfo> list) {
        this.payCardList = list;
    }

    public String toString() {
        return "PayCardListRspVo{payCardList=" + this.payCardList + '}';
    }
}
