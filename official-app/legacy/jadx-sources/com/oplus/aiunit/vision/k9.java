package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import com.oplus.accountsdk.base.account.ILogoutCallback;
import com.oplus.accountsdk.base.account.config.AcAccountConfig;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k9 {
    private static final String TAG = "AcIAccountManager";

    public abstract il9 createClient(String str);

    public abstract Intent getAccountSettingIntent(Context context);

    public abstract int getSdkVersion();

    public abstract void init(Context context, AcAccountConfig acAccountConfig);

    public abstract boolean isOpen();

    public abstract void registerLoginCallback(ls9 ls9Var);

    public abstract void registerLogoutCallback(ILogoutCallback iLogoutCallback);

    public abstract void unregisterLoginCallback(ls9 ls9Var);

    public abstract void unregisterLogoutCallback(ILogoutCallback iLogoutCallback);
}
