package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.oplus.accountsdk.base.account.beans.AcIdTokenPayload;
import com.oplus.accountsdk.base.common.util.AcBase64Helper;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.platform.usercenter.account.ams.ipc.AcAuthResponse;

/* JADX INFO: loaded from: classes6.dex */
public class ni {
    public static String a(AcAuthResponse acAuthResponse) {
        if (acAuthResponse == null || TextUtils.isEmpty(acAuthResponse.getIdToken())) {
            AcLogUtil.e("AcParseIdTokenUtils", "parseIdToCountry: idToken is null");
            return "";
        }
        String[] strArrSplit = acAuthResponse.getIdToken().split("\\.");
        AcIdTokenPayload acIdTokenPayload = (AcIdTokenPayload) xa.c(AcBase64Helper.base64Decode(strArrSplit[1]), AcIdTokenPayload.class);
        if (acIdTokenPayload == null) {
            AcLogUtil.e("AcParseIdTokenUtils", "parseIdToCountry: idToken is format error");
            return "";
        }
        acIdTokenPayload.ssoid = "";
        strArrSplit[1] = AcBase64Helper.base64Encode(xa.d(acIdTokenPayload));
        return String.join("\\.", strArrSplit);
    }

    public static String b(AcAuthResponse acAuthResponse) {
        AcIdTokenPayload acIdTokenPayloadD = d(acAuthResponse);
        return acIdTokenPayloadD != null ? acIdTokenPayloadD.brand : "";
    }

    public static String c(AcAuthResponse acAuthResponse) {
        AcIdTokenPayload acIdTokenPayloadD = d(acAuthResponse);
        return acIdTokenPayloadD != null ? acIdTokenPayloadD.country : "";
    }

    public static AcIdTokenPayload d(AcAuthResponse acAuthResponse) {
        if (acAuthResponse != null && !TextUtils.isEmpty(acAuthResponse.getIdToken())) {
            return (AcIdTokenPayload) xa.c(AcBase64Helper.base64Decode(acAuthResponse.getIdToken().split("\\.")[1]), AcIdTokenPayload.class);
        }
        AcLogUtil.e("AcParseIdTokenUtils", "parseIdToCountry: idToken is null");
        return null;
    }
}
