package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.oplus.accountsdk.base.account.beans.AcApiResponse;
import com.oplus.accountsdk.base.account.ticket.AcTicketParam;
import com.oplus.accountsdk.base.account.ticket.api.bean.AcTicketResponse;

/* JADX INFO: loaded from: classes6.dex */
public interface v9 {
    @NonNull
    @WorkerThread
    AcApiResponse<AcTicketResponse> generateTicket(@NonNull Context context, @NonNull AcTicketParam acTicketParam);
}
