package com.platform.usercenter.tools.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.platform.usercenter.basic.provider.UCCommonXor8Provider;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes9.dex */
public class HomeKeyDispacherHelper {
    private static final String TAG = "HomeKeyDispacherHelper";
    private final HomeKeyDispatcherListener mHomeKeyDispatcherListener;
    private final HomeKeyEventBroadCastReceiver mHomeKeyReceiver = new HomeKeyEventBroadCastReceiver();

    public interface HomeKeyDispatcherListener {
        void onHomeKeyPress();
    }

    public class HomeKeyEventBroadCastReceiver extends BroadcastReceiver {
        static final String SYSTEM_REASON = "reason";
        static final String SYSTEM_RECENT_APPS = "recentapps";
        final String SYSTEM_HOME_K = UCCommonXor8Provider.getProviderHomeKeyXor8();

        public HomeKeyEventBroadCastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
            try {
                if (intent.getAction().equals("android.intent.action.CLOSE_SYSTEM_DIALOGS")) {
                    String stringExtra = intent.getStringExtra("reason");
                    if (!this.SYSTEM_HOME_K.equals(stringExtra)) {
                        SYSTEM_RECENT_APPS.equals(stringExtra);
                    } else if (HomeKeyDispacherHelper.this.mHomeKeyDispatcherListener != null) {
                        UCLogUtil.d(HomeKeyDispacherHelper.TAG, "HomeKeyPress");
                        HomeKeyDispacherHelper.this.mHomeKeyDispatcherListener.onHomeKeyPress();
                    }
                }
            } catch (Exception e2) {
                UCLogUtil.e(HomeKeyDispacherHelper.TAG, e2);
            }
        }
    }

    public HomeKeyDispacherHelper(HomeKeyDispatcherListener homeKeyDispatcherListener) {
        this.mHomeKeyDispatcherListener = homeKeyDispatcherListener;
    }

    public void registerHomeKeyPress(Context context) {
        try {
            UCLogUtil.d(TAG, "registerHomeKeyPress");
            context.registerReceiver(this.mHomeKeyReceiver, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
        }
    }

    public void unRegisterHomeKeyPress(Context context) {
        try {
            UCLogUtil.d(TAG, "unRegisterHomeKeyPress");
            context.unregisterReceiver(this.mHomeKeyReceiver);
        } catch (Exception unused) {
        }
    }
}
