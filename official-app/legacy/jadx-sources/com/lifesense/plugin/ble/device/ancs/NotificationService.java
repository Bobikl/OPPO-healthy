package com.lifesense.plugin.ble.device.ancs;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import androidx.core.app.NotificationCompat;
import com.lifesense.plugin.ble.data.LSAppCategory;
import com.lifesense.plugin.ble.data.tracker.ATTextMessage;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"NewApi"})
public class NotificationService extends NotificationListenerService {
    private static final String TAG = "NLS";
    private static boolean isBindSuccess;
    private static l mPhoneMessageListener;
    private static Map notificationUnreadMap = new HashMap();
    public static String oldTitle = "";
    public static String oldMessage = "";
    public static long lastReceiveTime = 0;

    private void addUnread(String str, int i) {
        notificationUnreadMap.put(str, Integer.valueOf(i));
    }

    private int getUnread() {
        Iterator it = notificationUnreadMap.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
        }
        return iIntValue;
    }

    private synchronized void handleNotificationMessage(ATTextMessage aTTextMessage) {
        int unread;
        if (aTTextMessage != null) {
            try {
                if (mPhoneMessageListener != null && aTTextMessage.getMsgCategory() != null) {
                    String title = aTTextMessage.getTitle();
                    String content = aTTextMessage.getContent();
                    if (oldMessage.equals(content) && oldTitle.equals(title) && System.currentTimeMillis() - lastReceiveTime < 500) {
                        com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Message_Remind, true, "notification message same ; title=" + title + " ; text=" + content, aTTextMessage.getMsgCategory().toString());
                        return;
                    }
                    oldMessage = content;
                    oldTitle = title;
                    lastReceiveTime = System.currentTimeMillis();
                    LSAppCategory msgCategory = aTTextMessage.getMsgCategory();
                    LSAppCategory lSAppCategory = LSAppCategory.Wechat;
                    if (msgCategory == lSAppCategory) {
                        addUnread(title, c.e(content));
                        unread = getUnread();
                    } else {
                        unread = 0;
                    }
                    com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Message_Remind, true, "NLS<< unreadCount=" + unread + " ; sender=" + title + "; type:" + aTTextMessage.getMsgCategory().toString(), null);
                    String title2 = aTTextMessage.getTitle();
                    String content2 = aTTextMessage.getContent();
                    a aVar = new a(title2, content2, aTTextMessage.getMsgCategory().getValue());
                    aVar.c(unread);
                    if (aVar.f() == lSAppCategory.getValue()) {
                        c.d(content2);
                        aVar.c(c.b(content2, title2));
                    }
                    mPhoneMessageListener.a(this, aVar);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private void handleSmsMessageNotification(StatusBarNotification statusBarNotification) {
        Bundle bundle = statusBarNotification.getNotification().extras;
        String string = bundle.getString(NotificationCompat.EXTRA_TITLE);
        String string2 = bundle.getCharSequence(NotificationCompat.EXTRA_TEXT) != null ? bundle.getCharSequence(NotificationCompat.EXTRA_TEXT).toString() : "text unknown";
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sbn >> " + statusBarNotification.toString());
        stringBuffer.append(" ; extras >>" + bundle.toString());
        stringBuffer.append(" ; title >> " + string);
        stringBuffer.append(" ; text >> " + string2);
        stringBuffer.append(" ; text2 >> " + ((Object) statusBarNotification.getNotification().tickerText));
        com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Message_Remind, true, stringBuffer.toString(), null);
    }

    public static boolean isServiceBindSuccess() {
        return isBindSuccess;
    }

    private void logMessage(String str, boolean z) {
        String str2 = "NLS:" + str + "...........";
        if (z) {
            com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Notification_Service, true, str2, null);
        }
    }

    private void removeUnread(String str) {
        if (notificationUnreadMap.containsKey(str)) {
            notificationUnreadMap.remove(str);
        }
    }

    public static void setPhoneMessageListener(l lVar) {
        mPhoneMessageListener = lVar;
    }

    @Override // android.service.notification.NotificationListenerService, android.app.Service
    public IBinder onBind(Intent intent) {
        isBindSuccess = true;
        logMessage("onBind", true);
        return super.onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        logMessage("onCreate", true);
        isBindSuccess = false;
    }

    @Override // android.service.notification.NotificationListenerService, android.app.Service
    public void onDestroy() {
        isBindSuccess = false;
        logMessage("onDestroy", true);
        super.onDestroy();
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationPosted(StatusBarNotification statusBarNotification) {
        isBindSuccess = true;
        try {
            if (mPhoneMessageListener != null && statusBarNotification != null && statusBarNotification.getNotification() != null) {
                String packageName = statusBarNotification.getPackageName();
                LSAppCategory lSAppCategoryA = c.a(getApplicationContext(), statusBarNotification.getPackageName());
                LSAppCategory lSAppCategory = LSAppCategory.Unknown;
                if (lSAppCategoryA == lSAppCategory) {
                    return;
                }
                if (lSAppCategoryA == LSAppCategory.Other && !com.lifesense.plugin.ble.device.a.a.g.a().c(packageName)) {
                    logMessage("no permission send this app message,undefine:" + packageName, false);
                    return;
                }
                ATTextMessage aTTextMessageA = c.a(getApplicationContext(), statusBarNotification.getPackageName(), statusBarNotification.getNotification());
                if (aTTextMessageA == null || aTTextMessageA.getMsgCategory() == lSAppCategory) {
                    return;
                }
                handleNotificationMessage(aTTextMessageA);
                return;
            }
            com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Warning_Message, false, "phone message listener is null", null);
        } catch (Exception e2) {
            com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Message_Remind, false, "notification posted message,has exception..., data obj >> " + statusBarNotification.toString() + "; exception obj >> { " + e2.toString() + " }", null);
            e2.printStackTrace();
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationRemoved(StatusBarNotification statusBarNotification) {
        if (statusBarNotification != null) {
            try {
                if (statusBarNotification.getNotification() != null && statusBarNotification.getNotification().extras != null) {
                    if (LSAppCategory.Wechat == c.a(this, statusBarNotification.getPackageName())) {
                        removeUnread(statusBarNotification.getNotification().extras.getString(NotificationCompat.EXTRA_TITLE));
                    }
                }
            } catch (Exception e2) {
                com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Message_Remind, false, "notification remove message,has exception..., data obj >> " + statusBarNotification.toString() + "; exception obj >> { " + e2.toString() + " }", null);
                e2.printStackTrace();
            }
        }
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        isBindSuccess = true;
        logMessage("onRebind", true);
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        isBindSuccess = false;
        logMessage("onStartCommand", true);
        super.onStartCommand(intent, i, i2);
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        isBindSuccess = false;
        logMessage("onTaskRemoved", true);
        super.onTaskRemoved(intent);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        isBindSuccess = false;
        logMessage("onUnbind", true);
        try {
            startService(intent);
            return super.onUnbind(intent);
        } catch (Exception e2) {
            e2.printStackTrace();
            logMessage("failed to start notifiation service,has exception....", true);
            return super.onUnbind(intent);
        }
    }
}
