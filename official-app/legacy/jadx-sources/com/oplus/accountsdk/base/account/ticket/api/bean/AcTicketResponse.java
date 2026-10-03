package com.oplus.accountsdk.base.account.ticket.api.bean;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcTicketResponse {

    @Nullable
    private boolean isOverseaOP;

    @Nullable
    private String ticket;
    private String userCountry;

    public AcTicketResponse(String str, String str2) {
        this.ticket = str;
        this.userCountry = str2;
    }

    @Nullable
    public String getTicket() {
        return this.ticket;
    }

    @Nullable
    public String getUserCountry() {
        return this.userCountry;
    }

    public boolean isOverseaOP() {
        return this.isOverseaOP;
    }

    public void setAccountBranchIsOp(@Nullable boolean z) {
        this.isOverseaOP = z;
    }

    public void setTicket(String str) {
        this.ticket = str;
    }
}
