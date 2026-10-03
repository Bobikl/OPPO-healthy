package com.oplus.accountsdk.open.core.storage.table;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.oplus.aiunit.vision.xa;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
@Entity(tableName = "ac_open_account_token_tb")
@Keep
public class AcOpenAccountToken implements Serializable {

    @NonNull
    private String accessToken;

    @NonNull
    private String deviceId;

    @Nullable
    private String idToken;

    @NonNull
    private String primaryToken;

    @Nullable
    private String refreshTicket;

    @NonNull
    private String refreshToken;

    @NonNull
    private String secondaryToken;

    @NonNull
    @PrimaryKey
    private String ssoid;

    public AcOpenAccountToken(@NonNull String str, @Nullable String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull String str6, @Nullable String str7, @NonNull String str8) {
        this.ssoid = str;
        this.idToken = str2;
        this.accessToken = str3;
        this.refreshToken = str4;
        this.secondaryToken = str5;
        this.primaryToken = str6;
        this.refreshTicket = str7;
        this.deviceId = str8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AcOpenAccountToken acOpenAccountToken = (AcOpenAccountToken) obj;
        if (!this.ssoid.equals(acOpenAccountToken.ssoid)) {
            return false;
        }
        String str = this.idToken;
        if (str == null ? acOpenAccountToken.idToken != null : !str.equals(acOpenAccountToken.idToken)) {
            return false;
        }
        if (!this.accessToken.equals(acOpenAccountToken.accessToken) || !this.refreshToken.equals(acOpenAccountToken.refreshToken) || !this.secondaryToken.equals(acOpenAccountToken.secondaryToken) || !this.primaryToken.equals(acOpenAccountToken.primaryToken)) {
            return false;
        }
        String str2 = this.refreshTicket;
        if (str2 != null) {
            return str2.equals(acOpenAccountToken.refreshTicket);
        }
        return acOpenAccountToken.refreshTicket == null;
    }

    @NonNull
    public String getAccessToken() {
        return this.accessToken;
    }

    @NonNull
    public String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    public String getIdToken() {
        return this.idToken;
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
    public String getRefreshToken() {
        return this.refreshToken;
    }

    @NonNull
    public String getSecondaryToken() {
        return this.secondaryToken;
    }

    @NonNull
    public String getSsoid() {
        return this.ssoid;
    }

    public int hashCode() {
        int iHashCode = this.ssoid.hashCode() * 31;
        String str = this.idToken;
        int iHashCode2 = (((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.accessToken.hashCode()) * 31) + this.refreshToken.hashCode()) * 31) + this.secondaryToken.hashCode()) * 31) + this.primaryToken.hashCode()) * 31;
        String str2 = this.refreshTicket;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public void setAccessToken(@NonNull String str) {
        this.accessToken = str;
    }

    public void setDeviceId(@NonNull String str) {
        this.deviceId = str;
    }

    public void setIdToken(@Nullable String str) {
        this.idToken = str;
    }

    public void setPrimaryToken(@NonNull String str) {
        this.primaryToken = str;
    }

    public void setRefreshTicket(@Nullable String str) {
        this.refreshTicket = str;
    }

    public void setRefreshToken(@NonNull String str) {
        this.refreshToken = str;
    }

    public void setSecondaryToken(@NonNull String str) {
        this.secondaryToken = str;
    }

    public void setSsoid(@NonNull String str) {
        this.ssoid = str;
    }

    public String toString() {
        return xa.d(this);
    }
}
