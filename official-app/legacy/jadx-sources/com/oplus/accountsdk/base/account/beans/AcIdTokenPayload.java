package com.oplus.accountsdk.base.account.beans;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcIdTokenPayload {
    public String brand;
    public String country;
    public String idc;

    @SerializedName("id")
    public String ssoid;

    public AcIdTokenPayload(String str, String str2, String str3, String str4) {
        this.ssoid = str;
        this.brand = str2;
        this.country = str3;
        this.idc = str4;
    }
}
