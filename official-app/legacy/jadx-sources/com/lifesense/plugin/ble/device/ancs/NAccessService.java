package com.lifesense.plugin.ble.device.ancs;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Intent;
import android.os.Parcelable;
import android.view.accessibility.AccessibilityEvent;
import com.lifesense.plugin.ble.data.LSAppCategory;
import com.lifesense.plugin.ble.data.tracker.ATTextMessage;

/* JADX INFO: loaded from: classes5.dex */
@TargetApi(14)
public class NAccessService extends AccessibilityService {
    private static final String TAG = "NAS";
    private static boolean isConnected;
    private static l mPhoneMessageListener;

    private synchronized void handleNotificationMessage(ATTextMessage aTTextMessage) {
        if (aTTextMessage != null) {
            try {
                if (mPhoneMessageListener != null && aTTextMessage.getMsgCategory() != null) {
                    String title = aTTextMessage.getTitle();
                    String content = aTTextMessage.getContent();
                    if (NotificationService.oldMessage.equals(content) && NotificationService.oldTitle.equals(title) && System.currentTimeMillis() - NotificationService.lastReceiveTime < 500) {
                        com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Message_Remind, true, "notification message same ; title=" + title + " ; text=" + content, aTTextMessage.getMsgCategory().toString());
                        return;
                    }
                    NotificationService.oldMessage = content;
                    NotificationService.oldTitle = title;
                    NotificationService.lastReceiveTime = System.currentTimeMillis();
                    com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Message_Remind, true, "NAS<< sender=" + title + "; type:" + aTTextMessage.getMsgCategory().toString(), null);
                    String title2 = aTTextMessage.getTitle();
                    String content2 = aTTextMessage.getContent();
                    a aVar = new a(title2, content2, aTTextMessage.getMsgCategory().getValue());
                    aVar.c(0);
                    if (aVar.f() == LSAppCategory.Wechat.getValue()) {
                        c.d(content2);
                        aVar.c(c.b(content2, title2));
                    }
                    mPhoneMessageListener.a(NAccessService.class, aVar);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static boolean isAccessServiceConnected() {
        return isConnected;
    }

    private void logMessage(String str, boolean z) {
        String str2 = "NAS:" + str + "...........";
        if (z) {
            com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Access_Service, true, str2, null);
        }
    }

    public static void sendTestNotifcationMessage(ATTextMessage aTTextMessage) {
        if (aTTextMessage != null) {
            try {
                if (mPhoneMessageListener != null && aTTextMessage.getMsgCategory() != null) {
                    String title = aTTextMessage.getTitle();
                    String content = aTTextMessage.getContent();
                    if (NotificationService.oldMessage.equals(content) && NotificationService.oldTitle.equals(title) && System.currentTimeMillis() - NotificationService.lastReceiveTime < 500) {
                        com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Message_Remind, true, "notification message same ; title=" + title + " ; text=" + content, aTTextMessage.getMsgCategory().toString());
                        return;
                    }
                    NotificationService.oldMessage = content;
                    NotificationService.oldTitle = title;
                    NotificationService.lastReceiveTime = System.currentTimeMillis();
                    com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Message_Remind, true, "NAS-Debug<<" + aTTextMessage.toString(), null);
                    mPhoneMessageListener.a(NAccessService.class, new a(aTTextMessage.getTitle(), aTTextMessage.getContent(), aTTextMessage.getMsgCategory().getValue()));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void setPhoneMessageListener(l lVar) {
        mPhoneMessageListener = lVar;
    }

    @Override // android.accessibilityservice.AccessibilityService
    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        String string;
        LSAppCategory lSAppCategoryA;
        LSAppCategory lSAppCategory;
        if (accessibilityEvent != null) {
            try {
                if (accessibilityEvent.getParcelableData() != null && accessibilityEvent.getPackageName() != null && mPhoneMessageListener != null) {
                    Parcelable parcelableData = accessibilityEvent.getParcelableData();
                    if (!(parcelableData instanceof Notification) || 64 != accessibilityEvent.getEventType() || com.lifesense.plugin.ble.c.f.d(getApplicationContext()) || (lSAppCategoryA = c.a(getApplicationContext(), (string = accessibilityEvent.getPackageName().toString()))) == (lSAppCategory = LSAppCategory.Unknown)) {
                        return;
                    }
                    if (lSAppCategoryA == LSAppCategory.Other && !com.lifesense.plugin.ble.device.a.a.g.a().c(string)) {
                        logMessage("no permission to send this app message,undefine:" + string, false);
                        return;
                    }
                    ATTextMessage aTTextMessageA = c.a(getApplicationContext(), string, (Notification) parcelableData);
                    if (aTTextMessageA != null && aTTextMessageA.getMsgCategory() != lSAppCategory) {
                        handleNotificationMessage(aTTextMessageA);
                        return;
                    }
                    return;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        logMessage("failed to get parcelable data,is null : " + mPhoneMessageListener, false);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        logMessage("onCreate", true);
        isConnected = false;
    }

    @Override // android.app.Service
    public void onDestroy() {
        isConnected = false;
        logMessage("onDestroy", true);
        super.onDestroy();
    }

    @Override // android.accessibilityservice.AccessibilityService
    public void onInterrupt() {
        logMessage("onInterrupt", true);
        isConnected = false;
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        isConnected = false;
        logMessage("onRebind", true);
        super.onRebind(intent);
    }

    @Override // android.accessibilityservice.AccessibilityService
    public void onServiceConnected() {
        isConnected = true;
        super.onServiceConnected();
        logMessage("onServiceConnected", true);
        AccessibilityServiceInfo accessibilityServiceInfo = new AccessibilityServiceInfo();
        accessibilityServiceInfo.eventTypes = 64;
        accessibilityServiceInfo.feedbackType = -1;
        accessibilityServiceInfo.notificationTimeout = 100L;
        setServiceInfo(accessibilityServiceInfo);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        logMessage("onStartCommand", true);
        super.onStartCommand(intent, i, i2);
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        isConnected = false;
        logMessage("onTaskRemoved", true);
        super.onTaskRemoved(intent);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        isConnected = false;
        logMessage("onUnbind", true);
        return super.onUnbind(intent);
    }
}
