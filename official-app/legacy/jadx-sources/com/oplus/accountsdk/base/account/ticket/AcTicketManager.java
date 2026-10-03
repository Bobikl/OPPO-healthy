package com.oplus.accountsdk.base.account.ticket;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.oplus.accountsdk.base.account.beans.AcApiResponse;
import com.oplus.accountsdk.base.account.ticket.api.bean.AcTicketResponse;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.aiunit.vision.qi;
import com.oplus.aiunit.vision.v9;
import com.platform.usercenter.account.ams.ipc.ResponseEnum;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcTicketManager {
    private static final String TAG = "AcTicketManager";
    private static volatile v9 sIdAgent;
    private static volatile v9 sOpenAgent;

    private AcTicketManager() {
    }

    @NonNull
    @WorkerThread
    public static AcApiResponse<AcTicketResponse> generateTicket(@NonNull Context context, @NonNull AcTicketParam acTicketParam) {
        return generateTicket(context, acTicketParam, false);
    }

    private static synchronized v9 getAgent(boolean z) {
        AcLogUtil.d(TAG, "getAgent isOpen=" + z);
        if (z) {
            if (sOpenAgent == null) {
                sOpenAgent = (v9) qi.a("com.oplus.accountsdk.open.AcOpenTicketManager", v9.class);
            }
            return sOpenAgent;
        }
        if (sIdAgent == null) {
            sIdAgent = (v9) qi.a("com.oplus.accountsdk.service.account.ticket.AcIdTicketManager", v9.class);
        }
        return sIdAgent;
    }

    @NonNull
    @WorkerThread
    public static AcApiResponse<AcTicketResponse> generateTicket(@NonNull Context context, @NonNull AcTicketParam acTicketParam, boolean z) {
        AcLogUtil.i(TAG, "generateTicket start, isOpen=" + z);
        v9 agent = getAgent(z);
        if (agent != null) {
            return agent.generateTicket(context, acTicketParam);
        }
        AcLogUtil.e(TAG, "agent is null, isOpen=" + z);
        return new AcApiResponse<>(ResponseEnum.ERROR_NOT_TICKET_AGENT, null);
    }
}
