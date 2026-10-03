package com.heytap.health.account;

import androidx.annotation.Keep;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class AccountUserInfo {
    public String accountName;
    public String avatarUrl;
    public String birthday;
    public int bloodPressureType;
    public String boundEmail;
    public String boundPhone;
    public String classifyByAge;
    public String country;
    public String height;
    public String jsonString;
    public String sex;
    public String ssoid;
    public String status;
    public String userName;
    public boolean userNameNeedModify;
    public String weight;

    public static final AccountUserInfo cover(String str) {
        return (AccountUserInfo) new Gson().fromJson(str, AccountUserInfo.class);
    }
}
