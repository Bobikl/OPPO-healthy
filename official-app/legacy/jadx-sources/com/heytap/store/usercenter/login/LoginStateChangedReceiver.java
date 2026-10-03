package com.heytap.store.usercenter.login;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.heytap.store.usercenter.OStoreUserCenterProxy;
import com.heytap.usercenter.accountsdk.utils.UCAccountXor8Provider;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes14.dex */
public class LoginStateChangedReceiver extends BroadcastReceiver {
    public static final String ACTION_GET_SIGN = "com.heytap.store.ACTION_GET_SIGN";
    public static final String ACTION_LOGIN = "com.heytap.store.ACTION_LOGIN";
    public static final String ACTION_LOGOUT = "com.heytap.store.ACTION_LOGOUT";
    public static final String ACTION_MSP_LOGOUT = "com.heytap.msp.usercenter.account_logout";
    public static final String ACTION_USER_CENT_LOGOUT = "com.oppo.usercenter.account_logout";
    private boolean isRegisteredTag = false;

    public interface OnLoginStateChangedListener {
        void onLoginSuccess();

        void onLogout();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (action.equals(ACTION_LOGIN) || action.equals(UCAccountXor8Provider.ACTION_USERCENTER_ACCOUNT_LOGIN)) {
            OStoreUserCenterProxy.INSTANCE.getInstance().notifyLogin();
        } else if (action.equals(ACTION_LOGOUT) || action.equals("com.oppo.usercenter.account_logout") || action.equals(ACTION_MSP_LOGOUT)) {
            OStoreUserCenterProxy.INSTANCE.getInstance().notifyLoginOut();
        }
    }

    public void reg(Context context) {
        if (this.isRegisteredTag) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_LOGIN);
        intentFilter.addAction(ACTION_LOGOUT);
        intentFilter.addAction(ACTION_GET_SIGN);
        LocalBroadcastManager.getInstance(context).registerReceiver(this, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction(UCAccountXor8Provider.ACTION_USERCENTER_ACCOUNT_LOGIN);
        intentFilter2.addAction("com.oppo.usercenter.account_logout");
        intentFilter2.addAction(ACTION_MSP_LOGOUT);
        intentFilter2.addAction(ACTION_LOGIN);
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(this, intentFilter2, 2);
        } else {
            context.registerReceiver(this, intentFilter2);
        }
        this.isRegisteredTag = true;
    }

    public void unReg(Context context) {
        if (this.isRegisteredTag) {
            LocalBroadcastManager.getInstance(context).unregisterReceiver(this);
            context.unregisterReceiver(this);
            this.isRegisteredTag = false;
        }
    }
}
