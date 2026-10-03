package com.platform.usercenter.network.data;

import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.json.JsonUtil;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class HeaderOpenIdBean {
    private final String apid;
    private final String auid;
    private final String duid;
    private final String guid;
    private final String ouid;

    public HeaderOpenIdBean(String str, String str2, String str3, String str4, String str5) {
        this.guid = str;
        this.ouid = str2;
        this.duid = str3;
        this.auid = str4;
        this.apid = str5;
    }

    public static HeaderOpenIdBean createFromJson(String str) {
        return (HeaderOpenIdBean) JsonUtil.stringToClass(str, HeaderOpenIdBean.class);
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
