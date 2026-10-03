package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.UserInfo;
import com.oplus.accountsdk.open.core.net.bean.AcOpenAccountInfoResponse;
import com.oplus.accountsdk.open.core.storage.table.AcOpenAccountInfo;
import com.platform.usercenter.account.ams.ipc.AcAccountInfo;

/* JADX INFO: loaded from: classes6.dex */
public class eh {
    public static AcOpenAccountInfo a(AcOpenAccountInfoResponse acOpenAccountInfoResponse) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (acOpenAccountInfoResponse != null) {
            return new AcOpenAccountInfo(acOpenAccountInfoResponse.getAvatarUrl(), acOpenAccountInfoResponse.getUserName(), acOpenAccountInfoResponse.getAccountName(), acOpenAccountInfoResponse.getSsoid(), c(acOpenAccountInfoResponse.getSex()), acOpenAccountInfoResponse.getClassifyByAge() == null ? "" : acOpenAccountInfoResponse.getClassifyByAge(), acOpenAccountInfoResponse.getStatus() == null ? "" : acOpenAccountInfoResponse.getStatus(), acOpenAccountInfoResponse.getMaskedMobile() == null ? "" : acOpenAccountInfoResponse.getMaskedMobile(), acOpenAccountInfoResponse.getMaskedEmail() == null ? "" : acOpenAccountInfoResponse.getMaskedEmail(), acOpenAccountInfoResponse.getCountry() == null ? "" : acOpenAccountInfoResponse.getCountry(), !acOpenAccountInfoResponse.getNameHasModified() ? 1 : 0, acOpenAccountInfoResponse.getRegisterTime() == null ? "" : acOpenAccountInfoResponse.getRegisterTime(), jCurrentTimeMillis);
        }
        return null;
    }

    public static AcAccountInfo b(AcOpenAccountInfo acOpenAccountInfo) {
        if (acOpenAccountInfo == null) {
            return null;
        }
        AcAccountInfo acAccountInfo = new AcAccountInfo(acOpenAccountInfo.getAvatarUrl(), acOpenAccountInfo.getUserName(), acOpenAccountInfo.getAccountName(), acOpenAccountInfo.getSsoid());
        acAccountInfo.setCountry(acOpenAccountInfo.getCountry());
        acAccountInfo.setClassifyByAge(acOpenAccountInfo.getClassifyByAge());
        acAccountInfo.setMaskedEmail(acOpenAccountInfo.getMaskedEmail());
        acAccountInfo.setSex(acOpenAccountInfo.getSex());
        acAccountInfo.setMaskedMobile(acOpenAccountInfo.getMaskedMobile());
        acAccountInfo.setNameHasModified(acOpenAccountInfo.getNameHasModified() == 1);
        acAccountInfo.setRegisterTime(acOpenAccountInfo.getRegisterTime());
        acAccountInfo.setStatus(acOpenAccountInfo.getStatus());
        return acAccountInfo;
    }

    public static String c(String str) {
        if (str == null) {
            return "";
        }
        if (str.equalsIgnoreCase("1")) {
            return "M";
        }
        return str.equalsIgnoreCase("0") ? UserInfo.SEX_FEMALE : str;
    }
}
