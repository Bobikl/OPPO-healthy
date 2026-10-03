package com.heytap.health.wallet.network.bus.rsp;

import androidx.annotation.Keep;
import io.protostuff.Tag;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class PreDeleteCheckRspVo {

    @Tag(5)
    private Boolean canJumpFill;

    @Tag(1)
    private List<CardDeleteData> cardDeleteReasonDTOList;

    @Tag(4)
    private String disclaimerUrl;

    @Tag(3)
    private String refundChannel;

    @Tag(2)
    private String refundType;

    public Boolean getCanJumpFill() {
        return this.canJumpFill;
    }

    public List<CardDeleteData> getCardDeleteReasonDTOList() {
        return this.cardDeleteReasonDTOList;
    }

    public String getDisclaimerUrl() {
        return this.disclaimerUrl;
    }

    public String getRefundChannel() {
        return this.refundChannel;
    }

    public String getRefundType() {
        return this.refundType;
    }

    public void setCanJumpFill(Boolean bool) {
        this.canJumpFill = bool;
    }

    public void setCardDeleteReasonDTOList(List<CardDeleteData> list) {
        this.cardDeleteReasonDTOList = list;
    }

    public void setDisclaimerUrl(String str) {
        this.disclaimerUrl = str;
    }

    public void setRefundChannel(String str) {
        this.refundChannel = str;
    }

    public void setRefundType(String str) {
        this.refundType = str;
    }

    public String toString() {
        return "PreDeleteCheckRspVo{cardDeleteReasonDTOList=" + this.cardDeleteReasonDTOList + ", refundType='" + this.refundType + "', refundChannel='" + this.refundChannel + "', disclaimerUrl='" + this.disclaimerUrl + "', canJumpFill=" + this.canJumpFill + '}';
    }
}
