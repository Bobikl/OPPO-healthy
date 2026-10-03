package com.oplus.accountsdk.open.core.storage.table;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: classes6.dex */
@Entity(tableName = "user_tb")
@Keep
public class AcOldAccountInfo {

    @NonNull
    private String accountName;

    @NonNull
    private String alive;
    private long autoTokenExpirationTime;

    @Nullable
    private String avatar;

    @Nullable
    private String country;

    @Nullable
    private String deviceId;
    private int isNameModified;
    private int isNeed2Bind;

    @Nullable
    private String json;

    @NonNull
    private String loginStatus;

    @NonNull
    private String primaryToken;

    @Nullable
    private String refreshTicket;

    @NonNull
    @PrimaryKey
    private String ssoid;

    @NonNull
    private String userName;

    @NonNull
    private String userTime;

    public AcOldAccountInfo(@NonNull String str, @NonNull String str2, @Nullable String str3, @NonNull String str4, @Nullable String str5, int i, int i2, long j2, @Nullable String str6, @Nullable String str7, @NonNull String str8, @NonNull String str9, @NonNull String str10, @NonNull String str11, @Nullable String str12) {
        this.ssoid = str;
        this.primaryToken = str2;
        this.refreshTicket = str3;
        this.userName = str4;
        this.country = str5;
        this.isNeed2Bind = i;
        this.isNameModified = i2;
        this.autoTokenExpirationTime = j2;
        this.avatar = str6;
        this.deviceId = str7;
        this.accountName = str8;
        this.alive = str9;
        this.loginStatus = str10;
        this.userTime = str11;
        this.json = str12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AcOldAccountInfo acOldAccountInfo = (AcOldAccountInfo) obj;
        if (this.isNeed2Bind != acOldAccountInfo.isNeed2Bind || this.isNameModified != acOldAccountInfo.isNameModified || this.autoTokenExpirationTime != acOldAccountInfo.autoTokenExpirationTime || !this.ssoid.equals(acOldAccountInfo.ssoid) || !this.userName.equals(acOldAccountInfo.userName) || !this.primaryToken.equals(acOldAccountInfo.primaryToken)) {
            return false;
        }
        String str = this.refreshTicket;
        if (str == null ? acOldAccountInfo.refreshTicket != null : !str.equals(acOldAccountInfo.refreshTicket)) {
            return false;
        }
        String str2 = this.country;
        if (str2 == null ? acOldAccountInfo.country != null : !str2.equals(acOldAccountInfo.country)) {
            return false;
        }
        String str3 = this.avatar;
        if (str3 == null ? acOldAccountInfo.avatar != null : !str3.equals(acOldAccountInfo.avatar)) {
            return false;
        }
        String str4 = this.deviceId;
        if (str4 == null ? acOldAccountInfo.deviceId != null : !str4.equals(acOldAccountInfo.deviceId)) {
            return false;
        }
        if (!this.accountName.equals(acOldAccountInfo.accountName) || !this.loginStatus.equals(acOldAccountInfo.loginStatus) || !this.userTime.equals(acOldAccountInfo.userTime)) {
            return false;
        }
        String str5 = this.json;
        if (str5 != null) {
            return str5.equals(acOldAccountInfo.json);
        }
        return acOldAccountInfo.json == null;
    }

    @NonNull
    public String getAccountName() {
        return this.accountName;
    }

    @NonNull
    public String getAlive() {
        return this.alive;
    }

    public long getAutoTokenExpirationTime() {
        return this.autoTokenExpirationTime;
    }

    @Nullable
    public String getAvatar() {
        return this.avatar;
    }

    @Nullable
    public String getCountry() {
        return this.country;
    }

    @Nullable
    public String getDeviceId() {
        return this.deviceId;
    }

    public int getIsNameModified() {
        return this.isNameModified;
    }

    public int getIsNeed2Bind() {
        return this.isNeed2Bind;
    }

    @Nullable
    public String getJson() {
        return this.json;
    }

    @NonNull
    public String getLoginStatus() {
        return this.loginStatus;
    }

    @NonNull
    public String getPrimaryToken() {
        return this.primaryToken;
    }

    @Nullable
    public String getRefreshTicket() {
        return this.refreshTicket;
    }

    @NonNull
    public String getSsoid() {
        return this.ssoid;
    }

    @NonNull
    public String getUserName() {
        return this.userName;
    }

    @NonNull
    public String getUserTime() {
        return this.userTime;
    }

    public int hashCode() {
        int iHashCode = ((((this.ssoid.hashCode() * 31) + this.userName.hashCode()) * 31) + this.primaryToken.hashCode()) * 31;
        String str = this.refreshTicket;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.country;
        int iHashCode3 = (((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.isNeed2Bind) * 31) + this.isNameModified) * 31;
        long j2 = this.autoTokenExpirationTime;
        int i = (iHashCode3 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str3 = this.avatar;
        int iHashCode4 = (((((((i + (str3 != null ? str3.hashCode() : 0)) * 31) + this.accountName.hashCode()) * 31) + this.loginStatus.hashCode()) * 31) + this.userTime.hashCode()) * 31;
        String str4 = this.json;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public void setAccountName(@NonNull String str) {
        this.accountName = str;
    }

    public void setAlive(@NonNull String str) {
        this.alive = str;
    }

    public void setAutoTokenExpirationTime(long j2) {
        this.autoTokenExpirationTime = j2;
    }

    public void setAvatar(@Nullable String str) {
        this.avatar = str;
    }

    public void setCountry(@Nullable String str) {
        this.country = str;
    }

    public void setDeviceId(@Nullable String str) {
        this.deviceId = str;
    }

    public void setIsNameModified(int i) {
        this.isNameModified = i;
    }

    public void setIsNeed2Bind(int i) {
        this.isNeed2Bind = i;
    }

    public void setJson(@Nullable String str) {
        this.json = str;
    }

    public void setLoginStatus(@NonNull String str) {
        this.loginStatus = str;
    }

    public void setPrimaryToken(@NonNull String str) {
        this.primaryToken = str;
    }

    public void setRefreshTicket(@Nullable String str) {
        this.refreshTicket = str;
    }

    public void setSsoid(@NonNull String str) {
        this.ssoid = str;
    }

    public void setUserName(@NonNull String str) {
        this.userName = str;
    }

    public void setUserTime(@NonNull String str) {
        this.userTime = str;
    }
}
