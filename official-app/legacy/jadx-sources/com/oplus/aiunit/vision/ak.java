package com.oplus.aiunit.vision;

import com.oplus.account.netrequest.annotation.AcNeedEncrypt;
import com.oplus.accountsdk.base.account.ticket.api.bean.AcTicketRequest;
import com.oplus.accountsdk.base.account.ticket.api.bean.AcTicketResponse;
import com.oplus.accountsdk.base.common.net.data.AcSdkNetResponse;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface ak {
    @AcNeedEncrypt
    @m1e("/identity/v1/ticket/generate")
    xr2<AcSdkNetResponse<AcTicketResponse, Object>> a(@oi8 Map<String, String> map, @av1 AcTicketRequest acTicketRequest);
}
