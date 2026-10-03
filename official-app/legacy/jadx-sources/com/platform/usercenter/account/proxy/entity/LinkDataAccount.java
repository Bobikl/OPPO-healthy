package com.platform.usercenter.account.proxy.entity;

import com.platform.usercenter.basic.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class LinkDataAccount {
    public String downloadUrl;
    public List<LinkDetail> linkDetail;
    public String trackId;

    @Keep
    public static class LinkDetail {
        public String appVersion;
        public String enter_from;
        public String linkType;
        public String linkUrl;
        public String osVersion;
        public String packageName;

        public String toString() {
            return "LinkDetail{linkType='" + this.linkType + "', appVersion='" + this.appVersion + "', packageName='" + this.packageName + "', linkUrl='" + this.linkUrl + "', osVersion='" + this.osVersion + "', enter_from='" + this.enter_from + "'}";
        }
    }

    public String toString() {
        return "LinkDataAccount{trackId='" + this.trackId + "', downloadUrl='" + this.downloadUrl + "', linkDetail=" + this.linkDetail + '}';
    }
}
