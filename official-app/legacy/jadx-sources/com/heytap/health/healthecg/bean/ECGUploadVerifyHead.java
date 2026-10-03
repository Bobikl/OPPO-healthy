package com.heytap.health.healthecg.bean;

import androidx.annotation.Keep;
import com.oplus.ocs.OmsConfig;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class ECGUploadVerifyHead {
    private String functionId = "OOPO001001002";
    private String transTime = "20200106092238";
    private String terminalId = "1AF21821-9A3F-41B4-BA95-C5CC2CB29070";
    private String appId = "com.oppo.hm505";
    private String version = OmsConfig.VERSION_NAME;
    private String terminalType = "1";
    private int userNo = 999998;

    public String getAppId() {
        return this.appId;
    }

    public String getFunctionId() {
        return this.functionId;
    }

    public String getTerminalId() {
        return this.terminalId;
    }

    public String getTerminalType() {
        return this.terminalType;
    }

    public String getTransTime() {
        return this.transTime;
    }

    public int getUserNo() {
        return this.userNo;
    }

    public String getVersion() {
        return this.version;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setFunctionId(String str) {
        this.functionId = str;
    }

    public void setTerminalId(String str) {
        this.terminalId = str;
    }

    public void setTerminalType(String str) {
        this.terminalType = str;
    }

    public void setTransTime(String str) {
        this.transTime = str;
    }

    public void setUserNo(int i) {
        this.userNo = i;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
