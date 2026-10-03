package com.heytap.store.entity.bean;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class ZhichiUserToken implements Serializable {
    private String customerServiceType;
    private String groupId;
    private String token;
    private String userIdStr;
    private String zhiChiUrl;

    public String getCustomerServiceType() {
        return this.customerServiceType;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public String getToken() {
        return this.token;
    }

    public String getUserIdStr() {
        return this.userIdStr;
    }

    public String getZhiChiUrl() {
        return this.zhiChiUrl;
    }

    public void setCustomerServiceType(String str) {
        this.customerServiceType = str;
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setUserIdStr(String str) {
        this.userIdStr = str;
    }

    public void setZhiChiUrl(String str) {
        this.zhiChiUrl = str;
    }
}
