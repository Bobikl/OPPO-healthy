package com.oplus.accountsdk.base.account.ticket.api.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcTicketRequest {

    @NonNull
    private final String guid;

    @NonNull
    private final String source;

    @Nullable
    private final String userToken;

    public AcTicketRequest(@Nullable String str, @NonNull String str2, @NonNull String str3) {
        this.userToken = str;
        this.source = str2;
        this.guid = str3;
    }
}
