package com.heytap.health.operation.ecg.data;

import androidx.annotation.Keep;
import com.heytap.health.operation.ecg.helper.EcgHelper;
import com.oplus.ocs.OmsConfig;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class HlwReqHead {
    public static final String FI_CHECKDATAINTERFERENCE = "OPPO001104004";
    public static final String FI_EXPERTREADING = "OPPO001001002";
    public static final String FI_QUERYCONFIG = "OPPO001104003";
    public static final String FI_QUERYREPORT = "OPPO001006001";
    public static final String FI_QUERYSERVICETIMES = "OPPO001005002";
    public static final String FI_QUERYSFFX = "OPPO001104005";
    private String appId;
    private String functionId;
    private String terminalId;
    private String terminalType;
    private String transTime;
    private String userNo;
    private String version;

    public HlwReqHead(String str) {
        this.functionId = "OOPO001001002";
        this.transTime = "20200106092238";
        this.terminalId = "1AF21821-9A3F-41B4-BA95-C5CC2CB29070";
        this.appId = "com.oppo.hm505";
        this.version = OmsConfig.VERSION_NAME;
        this.terminalType = "1";
        this.userNo = EcgHelper.w();
        this.functionId = str;
    }

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

    public String getUserNo() {
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

    public void setUserNo(String str) {
        this.userNo = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public HlwReqHead() {
        this.functionId = "OOPO001001002";
        this.transTime = "20200106092238";
        this.terminalId = "1AF21821-9A3F-41B4-BA95-C5CC2CB29070";
        this.appId = "com.oppo.hm505";
        this.version = OmsConfig.VERSION_NAME;
        this.terminalType = "1";
        this.userNo = EcgHelper.w();
    }
}
