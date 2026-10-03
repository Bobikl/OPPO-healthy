package com.platform.usercenter.account.ams.ipc;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcAccountInfo {

    @NonNull
    private final String accountName;

    @NonNull
    private final String avatarUrl;

    @Nullable
    private String classifyByAge;

    @Nullable
    private String country;

    @Nullable
    private String extraInfoJson;

    @Nullable
    private String maskedEmail;

    @Nullable
    private String maskedMobile;
    private boolean nameHasModified;

    @Nullable
    private String registerTime;

    @Nullable
    private String sex;

    @NonNull
    private final String ssoid;

    @Nullable
    private String status;

    @NonNull
    private final String userName;

    public AcAccountInfo(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        this.avatarUrl = str;
        this.userName = str2;
        this.accountName = str3;
        this.ssoid = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AcAccountInfo acAccountInfo = (AcAccountInfo) obj;
        return this.nameHasModified == acAccountInfo.nameHasModified && Objects.equals(this.avatarUrl, acAccountInfo.avatarUrl) && Objects.equals(this.userName, acAccountInfo.userName) && Objects.equals(this.accountName, acAccountInfo.accountName) && Objects.equals(this.ssoid, acAccountInfo.ssoid) && Objects.equals(this.sex, acAccountInfo.sex) && Objects.equals(this.classifyByAge, acAccountInfo.classifyByAge) && Objects.equals(this.status, acAccountInfo.status) && Objects.equals(this.maskedMobile, acAccountInfo.maskedMobile) && Objects.equals(this.maskedEmail, acAccountInfo.maskedEmail) && Objects.equals(this.country, acAccountInfo.country) && Objects.equals(this.registerTime, acAccountInfo.registerTime) && Objects.equals(this.extraInfoJson, acAccountInfo.extraInfoJson);
    }

    @NonNull
    public String getAccountName() {
        return this.accountName;
    }

    @NonNull
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    @Nullable
    public String getClassifyByAge() {
        return this.classifyByAge;
    }

    @Nullable
    public String getCountry() {
        return this.country;
    }

    public String getExtraInfoJson() {
        return this.extraInfoJson;
    }

    @Nullable
    public String getMaskedEmail() {
        return this.maskedEmail;
    }

    @Nullable
    public String getMaskedMobile() {
        return this.maskedMobile;
    }

    public boolean getNameHasModified() {
        return this.nameHasModified;
    }

    @Nullable
    public String getRegisterTime() {
        return this.registerTime;
    }

    @Nullable
    public String getSex() {
        return this.sex;
    }

    @NonNull
    public String getSsoid() {
        return this.ssoid;
    }

    @Nullable
    public String getStatus() {
        return this.status;
    }

    @NonNull
    public String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        return Objects.hash(this.avatarUrl, this.userName, this.accountName, this.ssoid, this.sex, this.classifyByAge, this.status, this.maskedMobile, this.maskedEmail, this.country, Boolean.valueOf(this.nameHasModified), this.registerTime, this.extraInfoJson);
    }

    public void setClassifyByAge(@Nullable String str) {
        this.classifyByAge = str;
    }

    public void setCountry(@Nullable String str) {
        this.country = str;
    }

    public void setExtraInfoJson(String str) {
        this.extraInfoJson = str;
    }

    public void setMaskedEmail(@Nullable String str) {
        this.maskedEmail = str;
    }

    public void setMaskedMobile(@Nullable String str) {
        this.maskedMobile = str;
    }

    public void setNameHasModified(boolean z) {
        this.nameHasModified = z;
    }

    public void setRegisterTime(@Nullable String str) {
        this.registerTime = str;
    }

    public void setSex(@Nullable String str) {
        this.sex = str;
    }

    public void setStatus(@Nullable String str) {
        this.status = str;
    }
}
