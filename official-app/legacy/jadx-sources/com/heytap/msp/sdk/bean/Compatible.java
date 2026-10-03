package com.heytap.msp.sdk.bean;

import com.heytap.msp.sdk.base.common.util.SensitiveInfoUtils;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public class Compatible implements Serializable {
    private static final String APP = "OMS";
    private String bizNo;
    private long expireIn;
    private String route;

    public String getBizNo() {
        return this.bizNo;
    }

    public long getExpireIn() {
        return this.expireIn;
    }

    public String getRoute() {
        return this.route;
    }

    public boolean routeApp() {
        return APP.equalsIgnoreCase(this.route);
    }

    public void setBizNo(String str) {
        this.bizNo = str;
    }

    public void setExpireIn(long j2) {
        this.expireIn = j2;
    }

    public void setRoute(String str) {
        this.route = str;
    }

    public String toString() {
        return "Compatible{bizNo='" + SensitiveInfoUtils.bizNoReplace(this.bizNo) + "', route='" + this.route + "', expireIn=" + this.expireIn + '}';
    }
}
