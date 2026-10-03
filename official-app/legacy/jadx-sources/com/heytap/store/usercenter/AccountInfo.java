package com.heytap.store.usercenter;

import androidx.autofill.HintConstants;
import com.oplus.accountsdk.open.core.web.executor.AcOpenGetTokenExecutor;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010!\u001a\u00020\"J\b\u0010#\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b¨\u0006$"}, d2 = {"Lcom/heytap/store/usercenter/AccountInfo;", "", "()V", AcOpenGetTokenExecutor.ACCOUNT_NAME_KEY, "", "getAccountName", "()Ljava/lang/String;", "setAccountName", "(Ljava/lang/String;)V", "authToken", "getAuthToken", "setAuthToken", "avatarUrl", "getAvatarUrl", "setAvatarUrl", "classifyByAge", "getClassifyByAge", "setClassifyByAge", "country", "getCountry", "setCountry", "deviceId", "getDeviceId", "setDeviceId", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "getPhoneNumber", "setPhoneNumber", "sex", "getSex", "setSex", "ssoid", "getSsoid", "setSsoid", "isChildAccount", "", "toString", "usercenterservices_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AccountInfo {

    @NotNull
    private String accountName = "";

    @NotNull
    private String avatarUrl = "";

    @NotNull
    private String country = "";

    @NotNull
    private String authToken = "";

    @NotNull
    private String sex = "";

    @NotNull
    private String phoneNumber = "";

    @NotNull
    private String ssoid = "";

    @NotNull
    private String deviceId = "";

    @NotNull
    private String classifyByAge = "";

    @NotNull
    public final String getAccountName() {
        return this.accountName;
    }

    @NotNull
    public final String getAuthToken() {
        return this.authToken;
    }

    @NotNull
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @NotNull
    public final String getClassifyByAge() {
        return this.classifyByAge;
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @NotNull
    public final String getSex() {
        return this.sex;
    }

    @NotNull
    public final String getSsoid() {
        return this.ssoid;
    }

    public final boolean isChildAccount() {
        return Intrinsics.areEqual(this.classifyByAge, "CHILD");
    }

    public final void setAccountName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.accountName = str;
    }

    public final void setAuthToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.authToken = str;
    }

    public final void setAvatarUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.avatarUrl = str;
    }

    public final void setClassifyByAge(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.classifyByAge = str;
    }

    public final void setCountry(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.country = str;
    }

    public final void setDeviceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceId = str;
    }

    public final void setPhoneNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.phoneNumber = str;
    }

    public final void setSex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sex = str;
    }

    public final void setSsoid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ssoid = str;
    }

    @NotNull
    public String toString() {
        return "AccountInfo(accountName='" + this.accountName + "', authToken='" + this.authToken + "', sex='" + this.sex + "', phoneNumber='" + this.phoneNumber + "', ssoid='" + this.ssoid + "', deviceId='" + this.deviceId + "', classifyByAge='" + this.classifyByAge + "')";
    }
}
