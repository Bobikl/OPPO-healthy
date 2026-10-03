package com.heytap.usercenter.accountsdk;

import android.annotation.SuppressLint;
import androidx.annotation.Keep;
import com.platform.usercenter.tools.log.UCLogUtil;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@SuppressLint({"StaticFieldLeak"})
public class AccountAgentClient {
    private static final String TAG = "AccountAgentClient";
    private static volatile AccountAgentClient sAgentClient = null;
    private static volatile boolean sIsInit = false;
    private AccountSDKConfig mClientConfig;
    private b mEngine;

    private AccountAgentClient() {
    }

    public static AccountAgentClient get() {
        if (sAgentClient == null) {
            synchronized (AccountAgentClient.class) {
                if (sAgentClient == null) {
                    sAgentClient = new AccountAgentClient();
                }
            }
        }
        return sAgentClient;
    }

    public AccountSDKConfig getConfig() {
        return this.mClientConfig;
    }

    public void init(AccountSDKConfig accountSDKConfig) {
        init(accountSDKConfig, "");
    }

    public boolean isForeground() {
        b bVar = this.mEngine;
        if (bVar == null) {
            return false;
        }
        return bVar.b();
    }

    public synchronized void init(AccountSDKConfig accountSDKConfig, String str) {
        try {
            if (accountSDKConfig == null) {
                throw new IllegalArgumentException("please init accountSdk");
            }
            this.mClientConfig = accountSDKConfig;
            if (sIsInit) {
                UCLogUtil.w(TAG, "AccountAgentClient is already init");
            } else {
                b bVar = new b(accountSDKConfig);
                this.mEngine = bVar;
                bVar.a();
                sIsInit = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
