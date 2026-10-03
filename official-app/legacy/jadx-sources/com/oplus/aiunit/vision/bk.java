package com.oplus.aiunit.vision;

import com.oplus.accountsdk.base.account.beans.AcApiResponse;
import com.oplus.accountsdk.base.account.ticket.AcTicketParam;
import com.oplus.accountsdk.base.account.ticket.api.bean.AcTicketRequest;
import com.oplus.accountsdk.base.account.ticket.api.bean.AcTicketResponse;
import com.oplus.accountsdk.base.common.constants.AcBaseConstants;
import com.oplus.accountsdk.base.common.net.data.AcSdkNetResponse;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.platform.usercenter.account.ams.ipc.ResponseEnum;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class bk {
    public AcApiResponse<AcTicketResponse> a(s7 s7Var, AcTicketParam acTicketParam, String str) {
        ak akVar = (ak) s7Var.getAcNetRequestService(ak.class);
        HashMap map = new HashMap();
        map.put(AcBaseConstants.a.X_SDK_DEVICE_ID, acTicketParam.getDeviceId());
        map.put(AcBaseConstants.a.HEADER_BIZ_APPK, acTicketParam.getAppK());
        map.put(AcBaseConstants.a.HEADER_BIZ_TRACE_ID, str);
        AcSdkNetResponse acSdkNetResponseRetrofitCallSync = s7Var.retrofitCallSync(akVar.a(map, new AcTicketRequest(acTicketParam.getUserToken(), acTicketParam.getSource(), acTicketParam.getGuid())));
        if (acSdkNetResponseRetrofitCallSync.isSuccess()) {
            AcLogUtil.i("AcTicketRepo", "generateTicket success", str);
            return new AcApiResponse<>(ResponseEnum.SUCCESS, (AcTicketResponse) acSdkNetResponseRetrofitCallSync.getData());
        }
        AcLogUtil.e("AcTicketRepo", "generateTicket failed, code=" + acSdkNetResponseRetrofitCallSync.getCode() + ", msg=" + acSdkNetResponseRetrofitCallSync.getErrorMessage(), str);
        return new AcApiResponse<>(acSdkNetResponseRetrofitCallSync.getCode(), acSdkNetResponseRetrofitCallSync.getErrorMessage(), null);
    }
}
