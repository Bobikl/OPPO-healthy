package com.heytap.usercenter.accountsdk;

import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.json.JsonUtil;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AppInfo {
    private static final String TAG = "AppInfo";
    public int appVersion;
    public String bizTraceId;
    public String packageName;

    public static AppInfo fromGson(String str) {
        return (AppInfo) JsonUtil.stringToClass(str, AppInfo.class);
    }

    public static String toJson(AppInfo appInfo) {
        return JsonUtil.toJson(appInfo);
    }

    public int getAppVersion() {
        return this.appVersion;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public void setAppVersion(int i) {
        this.appVersion = i;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }
}
