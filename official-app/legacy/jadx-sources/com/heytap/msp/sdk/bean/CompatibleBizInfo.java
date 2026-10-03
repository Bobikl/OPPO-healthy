package com.heytap.msp.sdk.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public class CompatibleBizInfo implements Serializable {
    private static final long serialVersionUID = -3433944415711374331L;

    @JSONField(name = SpeechConstant.KEY_APP_VERSION)
    String bizAppVersion;
    String bizNo;
    String bizSdkVersion;

    public CompatibleBizInfo() {
    }

    public CompatibleBizInfo(String str, String str2, String str3) {
        this.bizAppVersion = str;
        this.bizNo = str2;
        this.bizSdkVersion = str3;
    }

    public String getBizAppVersion() {
        return this.bizAppVersion;
    }

    public String getBizNo() {
        return this.bizNo;
    }

    public String getBizSdkVersion() {
        return this.bizSdkVersion;
    }

    public void setBizAppVersion(String str) {
        this.bizAppVersion = str;
    }

    public void setBizNo(String str) {
        this.bizNo = str;
    }

    public void setBizSdkVersion(String str) {
        this.bizSdkVersion = str;
    }
}
