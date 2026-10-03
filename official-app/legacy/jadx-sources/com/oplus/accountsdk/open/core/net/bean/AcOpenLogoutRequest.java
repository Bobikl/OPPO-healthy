package com.oplus.accountsdk.open.core.net.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcOpenLogoutRequest {
    public int checkType;
    public boolean needValidateTicket;
    public String sceneId;
    public String secondaryToken;
    public String ticket;
    public String verificationId;

    public AcOpenLogoutRequest(String str, String str2, String str3, String str4, boolean z, int i) {
        this.ticket = str;
        this.sceneId = str2;
        this.verificationId = str3;
        this.secondaryToken = str4;
        this.needValidateTicket = z;
        this.checkType = i;
    }
}
