package com.oplus.omes.srp.sysintegrity.cmm;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.lnm;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class BaseRequestParam {
    public static final String ACTION_GET_CERTS = "getCerts";
    public static final String ACTION_GET_SEV_INFO = "serviceInfo";
    public static final String ACTION_GET_TOKEN = "token";
    public static final String ACTION_GET_VERSION = "version";
    public static final int LATEST_VERSION = 1;
    public static final int VERSION_V1 = 1;
    public String action;
    public int version;

    public static String build(String str) {
        BaseRequestParam baseRequestParam = new BaseRequestParam();
        baseRequestParam.setAction(str);
        return baseRequestParam.toJson();
    }

    public String getAction() {
        return this.action;
    }

    public int getVersion() {
        return this.version;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public String toJson() {
        return lnm.c_a.toJson(this);
    }
}
