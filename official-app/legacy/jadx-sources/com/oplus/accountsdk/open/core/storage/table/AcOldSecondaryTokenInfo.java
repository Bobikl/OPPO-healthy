package com.oplus.accountsdk.open.core.storage.table;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import com.oplus.aiunit.vision.xa;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
@Entity(foreignKeys = {@ForeignKey(childColumns = {"userId"}, entity = AcOldAccountInfo.class, onDelete = 5, onUpdate = 5, parentColumns = {"ssoid"})}, indices = {@Index(unique = true, value = {"pkg", "pkgSign"}), @Index({"userId"})}, primaryKeys = {"pkg", "pkgSign"}, tableName = "secondary_token_tb")
@Keep
public class AcOldSecondaryTokenInfo implements Serializable {

    @Nullable
    private String json;

    @NonNull
    private String pkg;

    @NonNull
    private String pkgSign;

    @NonNull
    private String secondaryToken;

    @NonNull
    private String userId;

    @NonNull
    private String userTime;

    public AcOldSecondaryTokenInfo(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @Nullable String str6) {
        this.userId = str;
        this.pkg = str2;
        this.pkgSign = str3;
        this.secondaryToken = str4;
        this.userTime = str5;
        this.json = str6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AcOldSecondaryTokenInfo acOldSecondaryTokenInfo = (AcOldSecondaryTokenInfo) obj;
        if (!this.userId.equals(acOldSecondaryTokenInfo.userId) || !this.pkg.equals(acOldSecondaryTokenInfo.pkg) || !this.pkgSign.equals(acOldSecondaryTokenInfo.pkgSign) || !this.secondaryToken.equals(acOldSecondaryTokenInfo.secondaryToken) || !this.userTime.equals(acOldSecondaryTokenInfo.userTime)) {
            return false;
        }
        String str = this.json;
        if (str != null) {
            return str.equals(acOldSecondaryTokenInfo.json);
        }
        return acOldSecondaryTokenInfo.json == null;
    }

    @Nullable
    public String getJson() {
        return this.json;
    }

    @NonNull
    public String getPkg() {
        return this.pkg;
    }

    @NonNull
    public String getPkgSign() {
        return this.pkgSign;
    }

    @NonNull
    public String getSecondaryToken() {
        return this.secondaryToken;
    }

    @NonNull
    public String getUserId() {
        return this.userId;
    }

    @NonNull
    public String getUserTime() {
        return this.userTime;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.userId.hashCode() * 31) + this.pkg.hashCode()) * 31) + this.pkgSign.hashCode()) * 31) + this.secondaryToken.hashCode()) * 31) + this.userTime.hashCode()) * 31;
        String str = this.json;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public void setJson(@Nullable String str) {
        this.json = str;
    }

    public void setPkg(@NonNull String str) {
        this.pkg = str;
    }

    public void setPkgSign(@NonNull String str) {
        this.pkgSign = str;
    }

    public void setSecondaryToken(@NonNull String str) {
        this.secondaryToken = str;
    }

    public void setUserId(@NonNull String str) {
        this.userId = str;
    }

    public void setUserTime(@NonNull String str) {
        this.userTime = str;
    }

    public String toString() {
        return xa.d(this);
    }
}
