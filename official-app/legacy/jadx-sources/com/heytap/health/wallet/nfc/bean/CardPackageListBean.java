package com.heytap.health.wallet.nfc.bean;

import com.heytap.health.wallet.bean.CardPackageRspVo;

/* JADX INFO: loaded from: classes18.dex */
public class CardPackageListBean extends CardPackageRspVo {
    private String title;
    private int viewType;

    public String getTitle() {
        return this.title;
    }

    public int getViewType() {
        return this.viewType;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setViewType(int i) {
        this.viewType = i;
    }
}
