package com.oplus.statistics.data;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class SettingKeyBean {
    public static final String DEFAULE_VALUE = "default_value";
    public static final String HTTP_POST_KEY = "http_post_key";
    public static final String METHOD_NAME = "method_name";
    public static final String SETTING_KEY = "setting_key";
    public String a;
    public String b;
    public String c;
    public String d;

    public SettingKeyBean() {
    }

    public SettingKeyBean(String str, String str2) {
        this.a = str;
        this.c = str2;
    }

    public String getDefaultValue() {
        return this.d;
    }

    public String getHttpPostKey() {
        return this.b;
    }

    public String getMethodName() {
        return this.c;
    }

    public String getSettingKey() {
        return this.a;
    }

    public void setDefaultValue(String str) {
        this.d = str;
    }

    public void setHttpPostKey(String str) {
        this.b = str;
    }

    public void setMethodName(String str) {
        this.c = str;
    }

    public void setSettingKey(String str) {
        this.a = str;
    }

    public SettingKeyBean(String str, String str2, String str3) {
        this.a = str;
        this.c = str2;
        this.b = str3;
    }
}
