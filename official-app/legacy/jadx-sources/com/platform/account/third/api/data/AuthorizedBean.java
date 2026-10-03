package com.platform.account.third.api.data;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AuthorizedBean implements Serializable {
    private String accessToken;
    private String birthday;
    private String code;
    private String email;
    private String id;
    private String name;
    private String photoUrl;

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public String getCode() {
        return this.code;
    }

    public String getEmail() {
        return this.email;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getPhotoUrl() {
        return this.photoUrl;
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setBirthday(String str) {
        this.birthday = str;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPhotoUrl(String str) {
        this.photoUrl = str;
    }

    @NonNull
    public String toString() {
        return "AuthorizedBean{code='" + this.code + "', accessToken='" + this.accessToken + "', id='" + this.id + "', name='" + this.name + "', birthday='" + this.birthday + "', email='" + this.email + "', photoUrl='" + this.photoUrl + "'}";
    }
}
