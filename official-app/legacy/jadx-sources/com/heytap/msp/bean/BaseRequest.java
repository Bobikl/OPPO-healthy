package com.heytap.msp.bean;

import java.io.Serializable;
import java.util.UUID;

/* JADX INFO: loaded from: classes19.dex */
public class BaseRequest implements Serializable {
    private static final long serialVersionUID = 4147607963192486525L;
    private String appID;
    private String appId;
    private String appPackageName;
    private String appSign;
    private String baseSdkVersion;
    private String bizNo;
    private String callingPackageName;
    private String originAppPackageName;
    private String sdkVersion;
    private String traceId = "";
    private String requestId = getUuid();

    public static String getUuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public String getAppID() {
        return this.appID;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppPackageName() {
        return this.appPackageName;
    }

    public String getAppSign() {
        return this.appSign;
    }

    public String getBaseSdkVersion() {
        return this.baseSdkVersion;
    }

    public String getBizNo() {
        return this.bizNo;
    }

    public String getCallingPackageName() {
        return this.callingPackageName;
    }

    public String getOriginAppPackageName() {
        return this.originAppPackageName;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public void setAppID(String str) {
        this.appID = str;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAppPackageName(String str) {
        this.appPackageName = str;
    }

    public void setAppSign(String str) {
        this.appSign = str;
    }

    public void setBaseSdkVersion(String str) {
        this.baseSdkVersion = str;
    }

    public void setBizNo(String str) {
        this.bizNo = str;
    }

    public void setCallingPackageName(String str) {
        this.callingPackageName = str;
    }

    public void setOriginAppPackageName(String str) {
        this.originAppPackageName = str;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    public void setTraceId(String str) {
        this.traceId = str;
    }

    public String toString() {
        return "BaseRequest{bizNo='" + com.heytap.msp.comm.a.b(this.bizNo) + "', appPackageName='" + this.appPackageName + "', appID='" + this.appID + "', originAppPackageName='" + this.originAppPackageName + "', sdkVersion='" + this.sdkVersion + "', baseSdkVersion='" + this.baseSdkVersion + "', appSign='" + com.heytap.msp.comm.a.a(this.appSign) + "', requestId='" + this.requestId + "'}";
    }
}
