package com.heytap.health.wallet.healthcloud.request;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class RfFileListDownloadReq {
    private List aidList;
    private String model;

    public List getAidList() {
        return this.aidList;
    }

    public String getModel() {
        return this.model;
    }

    public void setAidList(List list) {
        this.aidList = list;
    }

    public void setModel(String str) {
        this.model = str;
    }
}
