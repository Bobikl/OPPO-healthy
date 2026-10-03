package com.oplus.accountsdk.service.old.heytap.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class IpcAccountEntity {
    public String accountName;
    public String authToken;
    public String avatar;
    public String country;
    public String deviceId;
    public boolean isNameModified;
    public boolean isNeed2Bind;
    public String showUserName;
    public String ssoid;

    @NotNull
    public String toString() {
        return "IpcAccountEntity{accountName='" + this.accountName + "', ssoid='" + this.ssoid + "', isNeed2Bind=" + this.isNeed2Bind + ", isNameModified=" + this.isNameModified + ", avatar='" + this.avatar + "', country='" + this.country + "', authToken='" + this.authToken + "', showUserName='" + this.showUserName + "', deviceId='" + this.deviceId + "'}";
    }
}
