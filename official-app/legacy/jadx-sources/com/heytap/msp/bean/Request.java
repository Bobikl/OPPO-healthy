package com.heytap.msp.bean;

import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public class Request implements Serializable {
    private static final long serialVersionUID = 1868908311524506429L;
    private BaseRequest baseRequest;
    private BizRequest bizRequest;
    private transient boolean isFromInternal;
    private int startType;

    @Deprecated
    public Request() {
        this.baseRequest = new BaseRequest();
        this.bizRequest = new BizRequest();
        this.startType = 1;
        this.isFromInternal = false;
    }

    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public BizRequest getBizRequest() {
        return this.bizRequest;
    }

    public String getRequestId() {
        BaseRequest baseRequest = this.baseRequest;
        return baseRequest != null ? baseRequest.getRequestId() : "0";
    }

    public int getStartType() {
        return this.startType;
    }

    public boolean isFromInternal() {
        return this.isFromInternal;
    }

    public void setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
    }

    public void setBizRequest(BizRequest bizRequest) {
        this.bizRequest = bizRequest;
    }

    public void setFromInternal(boolean z) {
        this.isFromInternal = z;
    }

    public void setStartType(int i) {
        this.startType = i;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        BaseRequest baseRequest = this.baseRequest;
        if (baseRequest != null) {
            stringBuffer.append(baseRequest.toString());
            stringBuffer.append(" | ");
        }
        BizRequest bizRequest = this.bizRequest;
        if (bizRequest != null) {
            stringBuffer.append(bizRequest.toString());
        }
        return stringBuffer.toString();
    }

    @Deprecated
    public Request(BizRequest bizRequest) {
        this.baseRequest = new BaseRequest();
        new BizRequest();
        this.startType = 1;
        this.isFromInternal = false;
        this.bizRequest = bizRequest;
    }

    public Request(BizRequest bizRequest, BaseRequest baseRequest) {
        this.baseRequest = new BaseRequest();
        new BizRequest();
        this.startType = 1;
        this.isFromInternal = false;
        this.bizRequest = bizRequest;
        this.baseRequest = baseRequest;
    }
}
