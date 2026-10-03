package com.heytap.store.payment.data;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public class WechatPayModel implements Serializable {
    private String appid;
    private String noncestr;

    @SerializedName("package")
    private String packageX;
    private String partnerid;
    private String prepayid;
    private String sign;
    private String timestamp;

    public String getAppid() {
        return this.appid;
    }

    public String getNoncestr() {
        return this.noncestr;
    }

    public String getPackageX() {
        return this.packageX;
    }

    public String getPartnerid() {
        return this.partnerid;
    }

    public String getPrepayid() {
        return this.prepayid;
    }

    public String getSign() {
        return this.sign;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setAppid(String str) {
        this.appid = str;
    }

    public void setNoncestr(String str) {
        this.noncestr = str;
    }

    public void setPackageX(String str) {
        this.packageX = str;
    }

    public void setPartnerid(String str) {
        this.partnerid = str;
    }

    public void setPrepayid(String str) {
        this.prepayid = str;
    }

    public void setSign(String str) {
        this.sign = str;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }

    public String toString() {
        return "WechatPayModel{appid='" + this.appid + "', noncestr='" + this.noncestr + "', packageX='" + this.packageX + "', partnerid='" + this.partnerid + "', prepayid='" + this.prepayid + "', sign='" + this.sign + "', timestamp='" + this.timestamp + "'}";
    }
}
