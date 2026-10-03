package com.heytap.health.wallet.bean;

import io.protostuff.Tag;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class MultiActivateCardInfoRspVo implements Serializable {
    private static final long serialVersionUID = 338863596231052731L;

    @Tag(1)
    private List<MultiActivateCardInfo> iotMultiActivateCardInfos;

    public List<MultiActivateCardInfo> getIotMultiActivateCardInfos() {
        return this.iotMultiActivateCardInfos;
    }

    public String toString() {
        return "MultiActivateCardInfoListRspVo{multiActivateCardInfos=" + this.iotMultiActivateCardInfos + '}';
    }
}
