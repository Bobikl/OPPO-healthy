package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import com.heytap.health.account.sdk.AccountLog;
import com.heytap.msp.sdk.base.common.util.DeviceUtils;
import com.heytap.usercenter.accountsdk.AccountAgentClient;
import com.heytap.usercenter.accountsdk.AccountSDKConfig;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes15.dex */
public class em {
    public static String a() {
        return new SimpleDateFormat("yyMMddHH", Locale.US).format(new Date()) + DeviceUtils.getUuid();
    }

    public static void b(Context context) {
        v9g v9gVarX = v9g.x("health_account_config");
        String strA = "";
        String strE = v9gVarX.E("guid", "");
        if (strE.matches("^[0-9a-zA-Z]+$")) {
            AccountLog.d("AccountAgentUtil", "get GUID");
            strA = strE;
        } else if (DeviceUtils.isOwnBrand()) {
            AccountLog.d("AccountAgentUtil", "own set NULL");
        } else {
            AccountLog.d("AccountAgentUtil", "gen GUID");
            strA = a();
            v9gVarX.U("guid", strA);
        }
        int i = !qe0.E() ? 1 : 0;
        AccountLog.d("AccountAgentUtil", "set guid to Lib: " + strA);
        AccountAgentClient.get().init(new AccountSDKConfig.Builder().context(context).guid(strA).ouid(strA).area("CN").brand(Build.BRAND).env(AccountSDKConfig.ENV.values()[i]).create());
    }
}
