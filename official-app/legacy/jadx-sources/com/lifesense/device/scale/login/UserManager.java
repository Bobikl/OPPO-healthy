package com.lifesense.device.scale.login;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class UserManager {
    public static UserManager instance;
    public String accessToken;
    public Context context;
    public User user;
    public String userId;

    public UserManager(Context context) {
        this.context = context.getApplicationContext();
    }

    public static UserManager getInstance(Context context) {
        if (instance == null) {
            synchronized (UserManager.class) {
                if (instance == null) {
                    instance = new UserManager(context);
                }
            }
        }
        return instance;
    }

    public void clearUserInfo() {
        this.user = null;
        this.userId = null;
        this.accessToken = null;
    }

    public String getAccessToken() {
        if (TextUtils.isEmpty(this.accessToken)) {
            return null;
        }
        return this.accessToken;
    }

    public User getUser() {
        User user = this.user;
        if (user != null) {
            return user;
        }
        return null;
    }

    public String getUserId() {
        if (TextUtils.isEmpty(this.userId)) {
            return null;
        }
        return this.userId;
    }

    public boolean haveUserInfo() {
        return (getUser() == null || TextUtils.isEmpty(getUserId()) || TextUtils.isEmpty(getAccessToken())) ? false : true;
    }

    public void saveUserInfo(String str, String str2, User user) {
        this.userId = str;
        this.accessToken = str2;
        User user2 = new User();
        user2.setId(Long.valueOf(Long.parseLong(str)));
        this.user = user2;
    }
}
