package com.heytap.usercenter.accountsdk.model;

import com.platform.usercenter.basic.annotation.Keep;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AccountEntity {
    public String accountName;
    public String authToken;
    public String avatar;
    public String deviceId;
    public String ssoid;

    @NotNull
    public String toString() {
        return "AccountEntity{accountName='" + this.accountName + "', authToken='" + this.authToken + "', ssoid='" + this.ssoid + "', deviceId='" + this.deviceId + "', avatar='" + this.avatar + "'}";
    }
}
