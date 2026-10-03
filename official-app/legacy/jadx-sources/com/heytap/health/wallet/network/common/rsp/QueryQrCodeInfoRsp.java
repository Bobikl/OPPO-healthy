package com.heytap.health.wallet.network.common.rsp;

import androidx.annotation.Keep;
import io.protostuff.Tag;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class QueryQrCodeInfoRsp implements Serializable {
    private static final long serialVersionUID = -5880614572663999602L;

    @Tag(2)
    private List<QrCodeCardInfo> qrCodeCardInfoList;

    @Tag(1)
    private String vouchStatus;

    public List<QrCodeCardInfo> getQrCodeCardInfoList() {
        return this.qrCodeCardInfoList;
    }

    public String getVouchStatus() {
        return this.vouchStatus;
    }

    public void setQrCodeCardInfoList(List<QrCodeCardInfo> list) {
        this.qrCodeCardInfoList = list;
    }

    public void setVouchStatus(String str) {
        this.vouchStatus = str;
    }
}
