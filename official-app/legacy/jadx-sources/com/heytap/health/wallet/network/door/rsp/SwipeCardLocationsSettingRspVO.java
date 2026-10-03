package com.heytap.health.wallet.network.door.rsp;

import androidx.annotation.Keep;
import io.protostuff.Tag;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class SwipeCardLocationsSettingRspVO {

    @Tag(1)
    private Boolean result;

    @Tag(2)
    private Long updateTimestamp;

    public Boolean getResult() {
        return this.result;
    }

    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public void setResult(Boolean bool) {
        this.result = bool;
    }

    public void setUpdateTimestamp(Long l2) {
        this.updateTimestamp = l2;
    }
}
