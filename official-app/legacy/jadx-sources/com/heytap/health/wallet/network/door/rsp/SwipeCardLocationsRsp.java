package com.heytap.health.wallet.network.door.rsp;

import androidx.annotation.Keep;
import com.heytap.health.wallet.network.door.params.SwipeCardWithLocationVO;
import io.protostuff.Tag;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class SwipeCardLocationsRsp {

    @Tag(1)
    private List<SwipeCardWithLocationVO> cardWithLocationList;

    @Tag(2)
    private Long updateTimestamp;

    public List<SwipeCardWithLocationVO> getCardWithLocationList() {
        return this.cardWithLocationList;
    }

    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public void setCardWithLocationList(List<SwipeCardWithLocationVO> list) {
        this.cardWithLocationList = list;
    }

    public void setUpdateTimestamp(Long l2) {
        this.updateTimestamp = l2;
    }
}
