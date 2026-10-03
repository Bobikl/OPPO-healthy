package com.platform.usercenter.basic.provider;

import com.platform.usercenter.basic.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class OpenIdBean {
    private final String apid;
    private final String auid;
    private final String duid;
    private final String guid;
    private final String ouid;

    public OpenIdBean(String str, String str2, String str3, String str4, String str5) {
        this.guid = str;
        this.ouid = str2;
        this.duid = str3;
        this.auid = str4;
        this.apid = str5;
    }

    public String getApid() {
        return this.apid;
    }

    public String getAuid() {
        return this.auid;
    }

    public String getDuid() {
        return this.duid;
    }

    public String getGuid() {
        return this.guid;
    }

    public String getOuid() {
        return this.ouid;
    }

    public String toString() {
        return "OpenIdBean{guid='" + this.guid + "', ouid='" + this.ouid + "', duid='" + this.duid + "', auid='" + this.auid + "', apid='" + this.apid + "'}";
    }
}
