package com.lifesense.weidong.lzsimplenetlibs.base;

/* JADX INFO: loaded from: classes5.dex */
public class BaseResponse {
    public static final String TAG = "BaseResponse";
    public String content;
    public int mRet;
    public long responseTime;
    public BaseRequest mRequest = null;
    public String mMsg = "";

    public String getContent() {
        return this.content;
    }

    public long getResponseTime() {
        return this.responseTime;
    }

    public String getmMsg() {
        return this.mMsg;
    }

    public BaseRequest getmRequest() {
        return this.mRequest;
    }

    public int getmRet() {
        return this.mRet;
    }

    public void parse() {
    }

    public void setContent(String str) {
        this.content = str;
    }

    public BaseResponse setResponseTime(long j2) {
        this.responseTime = j2;
        return this;
    }

    public void setmMsg(String str) {
        this.mMsg = str;
    }

    public void setmRequest(BaseRequest baseRequest) {
        this.mRequest = baseRequest;
    }

    public void setmRet(int i) {
        this.mRet = i;
    }
}
