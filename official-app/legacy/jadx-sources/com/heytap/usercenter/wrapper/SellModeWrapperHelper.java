package com.heytap.usercenter.wrapper;

import android.content.Context;
import com.heytap.usercenter.accountsdk.AccountAgent;
import com.heytap.usercenter.accountsdk.AccountAgentWrapper;

/* JADX INFO: loaded from: classes19.dex */
public class SellModeWrapperHelper {
    public static boolean isSellMode(Context context) {
        return SellModeAccountAgentWrapper.isSellMode(context);
    }

    public static void register(Context context) {
        AccountAgent.register(context, new SellModeAccountAgentWrapper(new AccountAgentWrapper()));
    }
}
