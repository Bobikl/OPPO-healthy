package com.oplus.accountsdk.open.core.storage.table;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.oplus.aiunit.vision.xa;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
@Entity(tableName = "ac_open_account_info_tb")
@Keep
public class AcOpenAccountInfo implements Serializable {

    @NonNull
    private String accountName;

    @NonNull
    private String avatarUrl;

    @NonNull
    private String classifyByAge;

    @NonNull
    private String country;
    private long lastRequestTimestamp;

    @NonNull
    private String maskedEmail;

    @NonNull
    private String maskedMobile;
    private int nameHasModified;

    @NonNull
    private String registerTime;

    @NonNull
    private String sex;

    @NonNull
    @PrimaryKey
    private String ssoid;

    @NonNull
    private String status;

    @NonNull
    private String userName;

    public AcOpenAccountInfo(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull String str6, @NonNull String str7, @NonNull String str8, @NonNull String str9, @NonNull String str10, int i, @NonNull String str11, long j2) {
        this.avatarUrl = str;
        this.userName = str2;
        this.accountName = str3;
        this.ssoid = str4;
        this.sex = str5;
        this.classifyByAge = str6;
        this.status = str7;
        this.maskedMobile = str8;
        this.maskedEmail = str9;
        this.country = str10;
        this.nameHasModified = i;
        this.registerTime = str11;
        this.lastRequestTimestamp = j2;
    }

    @NonNull
    public String getAccountName() {
        return this.accountName;
    }

    @NonNull
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    @NonNull
    public String getClassifyByAge() {
        return this.classifyByAge;
    }

    @NonNull
    public String getCountry() {
        return this.country;
    }

    public long getLastRequestTimestamp() {
        return this.lastRequestTimestamp;
    }

    @NonNull
    public String getMaskedEmail() {
        return this.maskedEmail;
    }

    @NonNull
    public String getMaskedMobile() {
        return this.maskedMobile;
    }

    public int getNameHasModified() {
        return this.nameHasModified;
    }

    @NonNull
    public String getRegisterTime() {
        return this.registerTime;
    }

    @NonNull
    public String getSex() {
        return this.sex;
    }

    @NonNull
    public String getSsoid() {
        return this.ssoid;
    }

    @NonNull
    public String getStatus() {
        return this.status;
    }

    @NonNull
    public String getUserName() {
        return this.userName;
    }

    public void setAccountName(@NonNull String str) {
        this.accountName = str;
    }

    public void setAvatarUrl(@NonNull String str) {
        this.avatarUrl = str;
    }

    public void setClassifyByAge(@NonNull String str) {
        this.classifyByAge = str;
    }

    public void setCountry(@NonNull String str) {
        this.country = str;
    }

    public void setLastRequestTimestamp(long j2) {
        this.lastRequestTimestamp = j2;
    }

    public void setMaskedEmail(@NonNull String str) {
        this.maskedEmail = str;
    }

    public void setMaskedMobile(@NonNull String str) {
        this.maskedMobile = str;
    }

    public void setNameHasModified(int i) {
        this.nameHasModified = i;
    }

    public void setRegisterTime(@NonNull String str) {
        this.registerTime = str;
    }

    public void setSex(@NonNull String str) {
        this.sex = str;
    }

    public void setSsoid(@NonNull String str) {
        this.ssoid = str;
    }

    public void setStatus(@NonNull String str) {
        this.status = str;
    }

    public void setUserName(@NonNull String str) {
        this.userName = str;
    }

    public String toString() {
        return xa.d(this);
    }
}
