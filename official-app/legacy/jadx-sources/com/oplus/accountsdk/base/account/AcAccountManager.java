package com.oplus.accountsdk.base.account;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.Keep;
import com.oplus.accountsdk.base.account.clients.AcAccountClientWrapper;
import com.oplus.accountsdk.base.account.config.AcAccountConfig;
import com.oplus.accountsdk.base.account.config.AcOpenAccountConfig;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.aiunit.vision.i8;
import com.oplus.aiunit.vision.il9;
import com.oplus.aiunit.vision.k9;
import com.oplus.aiunit.vision.ls9;
import com.oplus.aiunit.vision.nl9;
import com.oplus.aiunit.vision.qi;
import com.oplus.aiunit.vision.rj;
import com.platform.usercenter.account.ams.ipc.utils.AcIpcLogUtil;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcAccountManager {
    private static final String TAG = "AcAccountManager";
    private static k9 accountManager = null;
    private static final ConcurrentHashMap<String, il9> clientMap = new ConcurrentHashMap<>();
    private static AcAccountConfig hostConfig = null;
    private static boolean isGuest = false;

    public class a implements AcIpcLogUtil.IAcLogImpl {
        @Override // com.platform.usercenter.account.ams.ipc.utils.AcIpcLogUtil.IAcLogImpl
        public void d(String str, String str2) {
            AcLogUtil.d(str, str2);
        }

        @Override // com.platform.usercenter.account.ams.ipc.utils.AcIpcLogUtil.IAcLogImpl
        public void e(String str, String str2) {
            AcLogUtil.e(str, str2);
        }

        @Override // com.platform.usercenter.account.ams.ipc.utils.AcIpcLogUtil.IAcLogImpl
        public void i(String str, String str2) {
            AcLogUtil.i(str, str2);
        }

        @Override // com.platform.usercenter.account.ams.ipc.utils.AcIpcLogUtil.IAcLogImpl
        public void w(String str, String str2) {
            AcLogUtil.w(str, str2);
        }
    }

    public static Intent getAccountSettingIntent(Context context) {
        if (getAndAssertAccountManager("getAccountSettingIntent") != null) {
            return accountManager.getAccountSettingIntent(context);
        }
        return null;
    }

    private static k9 getAndAssertAccountManager(String str) {
        if (accountManager == null) {
            AcLogUtil.i(TAG, "accountManager is null ,invoke method = " + str, true);
        }
        return accountManager;
    }

    public static il9 getClient(String str) {
        il9 il9VarCreateClient;
        AcLogUtil.i(TAG, "getClient,appI=" + str, true);
        ConcurrentHashMap<String, il9> concurrentHashMap = clientMap;
        il9 acAccountClientWrapper = concurrentHashMap.get(str);
        if (acAccountClientWrapper == null && getAndAssertAccountManager("getClient") != null) {
            synchronized (AcAccountManager.class) {
                acAccountClientWrapper = concurrentHashMap.get(str);
                if (acAccountClientWrapper == null && (il9VarCreateClient = accountManager.createClient(str)) != null) {
                    acAccountClientWrapper = new AcAccountClientWrapper(il9VarCreateClient);
                    concurrentHashMap.put(str, acAccountClientWrapper);
                }
            }
        }
        return acAccountClientWrapper;
    }

    public static int getSdkVersion() {
        if (getAndAssertAccountManager("getSdkVersion") != null) {
            return accountManager.getSdkVersion();
        }
        return 0;
    }

    public static void init(Context context, AcAccountConfig acAccountConfig) {
        AcLogUtil.init(context);
        AcLogUtil.i(TAG, "init config=" + acAccountConfig.toString() + " pkg: " + context.getPackageName(), true);
        AcIpcLogUtil.setLogImpl(new a());
        boolean z = acAccountConfig instanceof AcOpenAccountConfig;
        Context applicationContext = context.getApplicationContext();
        i8.b(acAccountConfig.getAppI(), acAccountConfig);
        AcAccountConfig acAccountConfig2 = hostConfig;
        if (acAccountConfig2 != null && acAccountConfig2.isHost() && !acAccountConfig.isHost()) {
            AcLogUtil.i(TAG, "init is intercept ,hostConfig = " + hostConfig.toString(), true);
            return;
        }
        AcAccountConfig acAccountConfig3 = hostConfig;
        hostConfig = acAccountConfig;
        k9 k9Var = accountManager;
        if (k9Var == null || k9Var.isOpen() != z) {
            k9 k9Var2 = accountManager;
            if (k9Var2 != null && k9Var2.isOpen() != z && acAccountConfig3 != null) {
                i8.sHostChangeEvent.offer(rj.a(acAccountConfig3.getAppI(), acAccountConfig.getAppI()));
            }
            accountManager = (k9) qi.a(z ? "com.oplus.accountsdk.open.AcOpenAccountManager" : "com.oplus.accountsdk.service.account.AcIDAccountManager", k9.class);
        }
        if (getAndAssertAccountManager("init") == null) {
            return;
        }
        accountManager.init(applicationContext, acAccountConfig);
        resetClient();
    }

    public static boolean isGuest() {
        return isGuest;
    }

    public static void registerLoginCallback(ls9 ls9Var) {
        if (getAndAssertAccountManager("registerLoginCallback") != null) {
            accountManager.registerLoginCallback(ls9Var);
        }
    }

    public static void registerLogoutCallback(ILogoutCallback iLogoutCallback) {
        if (getAndAssertAccountManager("registerLogoutCallback") != null) {
            accountManager.registerLogoutCallback(iLogoutCallback);
        }
    }

    private static void resetClient() {
        k9 k9Var;
        for (Map.Entry<String, il9> entry : clientMap.entrySet()) {
            String key = entry.getKey();
            il9 value = entry.getValue();
            if ((value instanceof AcAccountClientWrapper) && (k9Var = accountManager) != null) {
                il9 il9VarCreateClient = k9Var.createClient(key);
                ((AcAccountClientWrapper) value).setClient(il9VarCreateClient);
                AcLogUtil.i(TAG, "reset clientWrapper-" + key + " to " + il9VarCreateClient.getClass().getName(), true);
            }
        }
    }

    public static void setAcNetAvailable(nl9 nl9Var) {
    }

    public static void setGuest(boolean z) {
        isGuest = z;
    }

    public static void unregisterLoginCallback(ls9 ls9Var) {
        if (getAndAssertAccountManager("unregisterLoginCallback") != null) {
            accountManager.unregisterLoginCallback(ls9Var);
        }
    }

    public static void unregisterLogoutCallback(ILogoutCallback iLogoutCallback) {
        if (getAndAssertAccountManager("unregisterLogoutCallback") != null) {
            accountManager.unregisterLogoutCallback(iLogoutCallback);
        }
    }
}
