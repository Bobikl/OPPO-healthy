package com.platform.usercenter.account.api.provider;

import com.alibaba.android.arouter.facade.template.IProvider;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public interface ICommonExtProvider extends IProvider {
    int getAppIconId();

    String getBuzRegion();

    String getOpenId();

    String getRegisterID();

    default boolean getSwitchStatus(String str) {
        return true;
    }

    default String getWifiSsid() {
        return "";
    }

    default String instantVerson() {
        return "";
    }

    void refreshWhiteList();

    default void upload(Map<String, String> map) {
    }
}
