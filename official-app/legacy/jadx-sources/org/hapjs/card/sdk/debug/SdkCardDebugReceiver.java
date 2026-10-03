package org.hapjs.card.sdk.debug;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.nearme.instant.xcard.CardClient;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.hapjs.card.api.debug.CardDebugController;
import org.hapjs.card.api.debug.CardDebugHost;

/* JADX INFO: loaded from: classes11.dex */
public final class SdkCardDebugReceiver extends BroadcastReceiver {
    private static final String ACTION_DEBUG = "org.hapjs.intent.action.DEBUG_CARD";
    private static final int MSG_ON_RECEIVE = 0;
    private static final String PERMISSION_DEBUG = "org.hapjs.permission.DEBUG_CARD";
    private static final String TAG = "SdkCardDebugReceiver";
    private static CardDebugHost sCardDebugHost;
    private static boolean sIsAsyncInitializing;
    private static SdkCardDebugReceiver sSdkCardDebugReceiver;
    private static Set<MsgData> sPendingMsg = new HashSet();
    private static Handler sHandler = new Handler(Looper.getMainLooper()) { // from class: org.hapjs.card.sdk.debug.SdkCardDebugReceiver.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z;
            if (message.what != 0) {
                return;
            }
            MsgData msgData = (MsgData) message.obj;
            synchronized (SdkCardDebugReceiver.class) {
                z = !SdkCardDebugReceiver.sPendingMsg.remove(msgData);
            }
            if (z) {
                return;
            }
            SdkCardDebugReceiver.handleReceive(msgData.context, msgData.intent);
        }
    };

    public static class MsgData {
        Context context;
        Intent intent;

        public MsgData(Context context, Intent intent) {
            this.context = context;
            this.intent = intent;
        }
    }

    private static ActivityInfo getReceiverInfo(Context context) {
        try {
            return context.getPackageManager().getReceiverInfo(new ComponentName(context, (Class<?>) SdkCardDebugReceiver.class), 512);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleReceive(Context context, Intent intent) {
        CardDebugController cardDebugController;
        if (intent == null || intent.getExtras() == null || intent.getExtras().isEmpty()) {
            Log.e(TAG, "handleReceive intent is null");
            return;
        }
        if (sCardDebugHost == null) {
            Log.e(TAG, "debug is disable");
            return;
        }
        if (CardClient.getInstance() == null) {
            Log.e(TAG, "cardClient hasn't init");
            return;
        }
        try {
            cardDebugController = CardClient.getInstance().getCardDebugController();
        } catch (AbstractMethodError unused) {
            Log.e(TAG, "getCardDebugController error");
            cardDebugController = null;
        }
        if (cardDebugController == null) {
            Log.e(TAG, "the core platform unsupport debug");
        } else {
            cardDebugController.setCardDebugHost(sCardDebugHost);
            cardDebugController.handleDebugMessage(context, intent);
        }
    }

    public static synchronized void onAsyncInitStatus(boolean z) {
        sIsAsyncInitializing = z;
        if (!z && sHandler.hasMessages(0)) {
            sHandler.removeMessages(0);
            Iterator<MsgData> it = sPendingMsg.iterator();
            while (it.hasNext()) {
                sHandler.obtainMessage(0, it.next()).sendToTarget();
            }
        }
    }

    public static synchronized void register(Context context) {
        if (getReceiverInfo(context) != null) {
            setReceiverEnabled(context, true);
            return;
        }
        sSdkCardDebugReceiver = new SdkCardDebugReceiver();
        try {
            context.getApplicationContext().registerReceiver(sSdkCardDebugReceiver, new IntentFilter("org.hapjs.intent.action.DEBUG_CARD"), "org.hapjs.permission.DEBUG_CARD", null, 2);
        } catch (Exception e2) {
            Log.e(TAG, "registerReceiver error", e2);
        }
    }

    public static void setCardDebugHost(CardDebugHost cardDebugHost) {
        sCardDebugHost = cardDebugHost;
    }

    private static void setReceiverEnabled(Context context, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) SdkCardDebugReceiver.class), z ? 1 : 2, 1);
        } catch (Exception e2) {
            Log.e(TAG, "set debug enable", e2);
        }
    }

    public static synchronized void unregister(Context context) {
        if (sSdkCardDebugReceiver != null) {
            try {
                context.getApplicationContext().unregisterReceiver(sSdkCardDebugReceiver);
            } catch (Exception e2) {
                Log.e(TAG, "unregisterReceiver error", e2);
            }
            sSdkCardDebugReceiver = null;
        } else if (getReceiverInfo(context) != null) {
            setReceiverEnabled(context, false);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        synchronized (SdkCardDebugReceiver.class) {
            if (sIsAsyncInitializing) {
                MsgData msgData = new MsgData(context, intent);
                sPendingMsg.add(msgData);
                sHandler.sendMessageDelayed(sHandler.obtainMessage(0, msgData), 5000L);
            } else {
                handleReceive(context, intent);
            }
        }
    }
}
