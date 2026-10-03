package com.heytap.health.wallet.network.bus.rsp;

import androidx.annotation.Keep;
import io.protostuff.Exclude;
import io.protostuff.Tag;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class CardDeleteData {

    @Tag(2)
    private String reason;

    @Tag(1)
    private Integer reasonId;

    @Exclude
    private boolean select;

    public String getReason() {
        return this.reason;
    }

    public Integer getReasonId() {
        return this.reasonId;
    }

    public boolean isSelect() {
        return this.select;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public void setReasonId(Integer num) {
        this.reasonId = num;
    }

    public void setSelect(boolean z) {
        this.select = z;
    }
}
