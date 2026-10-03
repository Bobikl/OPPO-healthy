package com.heytap.usercenter.accountsdk.model;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class BasicUserInfo implements Serializable {
    private static final String TAG = "BasicUserInfo";
    public String accountName;
    public String avatarUrl;
    public String boundEmail;
    public String boundPhone;
    public String classifyByAge;
    public String country;
    public String countryCallingCode;
    public String gender;
    public String jsonString;
    public String registerTime;
    public String ssoid;
    public String status;
    public String userName;
    public boolean userNameNeedModify;
    public long validTime;

    public static BasicUserInfo fromJson(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return (BasicUserInfo) new Gson().fromJson(str, BasicUserInfo.class);
            } catch (Exception e2) {
                UCLogUtil.e(e2);
            }
        }
        return null;
    }

    public String toJson() {
        try {
            return new Gson().toJson(this);
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            return null;
        }
    }

    public String toString() {
        return toJson();
    }
}
