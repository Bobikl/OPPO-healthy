package com.platform.sdk.center.sdk.mvvm.model.data;

import com.google.gson.Gson;
import com.platform.usercenter.account.proxy.entity.LinkDataAccount;
import com.platform.usercenter.basic.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcInfo {
    public String account;
    public String avatar;
    public String avatarStyle;
    public ButtonInfo button;
    public String buttonName;
    public int drawRightsValue;
    public boolean isVip;
    public String loginGuide;
    public String notLogInTitle;
    public String payUrl;
    public String portalUrl;
    public String prompt;
    public String ssoid;
    public String userId;
    public String userName;
    public List<VipType> vipTypes;

    @Keep
    public static class ButtonInfo {
        public String buttonIcon;
        public String buttonText;
        public List<ButtonUrl> buttonUrl;
    }

    @Keep
    public static class ButtonUrl {
        public LinkDataAccount linkInfo;
        public String provider;
    }

    @Keep
    public static class VipType {
        public String avatarStyle;
        public String expireDays;
        public String expireTime;
        public String hasExpiredDays;
        public int iconHeight;
        public int iconWidth;
        public String isCurrentVip;
        public LinkDataAccount url;
        public String vipCode;
        public String vipIcon;
        public String vipName;
    }

    public String toString() {
        return new Gson().toJson(this);
    }
}
