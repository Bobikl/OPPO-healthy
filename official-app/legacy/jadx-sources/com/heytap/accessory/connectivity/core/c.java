package com.heytap.accessory.connectivity.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.heytap.accessory.accessorymanager.ConnectConfig;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.platform.services.FrameworkService;
import com.oplus.aiunit.vision.xx0;

/* JADX INFO: loaded from: classes14.dex */
public class c {
    public static final String a = "c";
    public static Handler b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static com.heytap.accessory.connectivity.core.b f2519c;
    public static c d;

    public static final class b extends Handler {
        public static final String a = "b";

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                if (!PlatformUtils.getContext().getPackageName().equals("com.heytap.accessory")) {
                    com.heytap.accessory.base.logging.a.c(a, "use oaf transport in third app, so server will not start!");
                    return;
                }
                com.heytap.accessory.base.logging.a.a(a, "AF_DISCOVERY_INIT");
                c.f2519c.a(2);
                c.f2519c.a(4);
                c.f2519c.a(1);
                return;
            }
            if (i == 10) {
                String str = a;
                com.heytap.accessory.base.logging.a.a(str, "AF_DISCOVERY_CONNECT_TO_DEVICE");
                if (message.obj instanceof ConnectConfig) {
                    c.f2519c.a((ConnectConfig) message.obj);
                    return;
                } else {
                    com.heytap.accessory.base.logging.a.b(str, "msg obj type error, stop connect.");
                    return;
                }
            }
            if (i != 11) {
                com.heytap.accessory.base.logging.a.e(a, "Unknown msg received " + message.what);
                return;
            }
            com.heytap.accessory.base.logging.a.a(a, "AF_DISCOVERY_DISCONNECT_FROM_DEVICE");
            Object obj = message.obj;
            if (obj instanceof ConnectConfig) {
                ConnectConfig connectConfig = (ConnectConfig) obj;
                c.f2519c.b(connectConfig.getAddress(), connectConfig.getTransportType(), connectConfig.getUidType());
            }
        }

        public b(Looper looper) {
            super(looper);
        }
    }

    static {
        String simpleName = c.class.getSimpleName();
        Looper looperB = com.heytap.accessory.base.thread.a.b().b("daemon");
        if (looperB != null) {
            b = new b(looperB);
            com.heytap.accessory.connectivity.core.b.a(looperB);
        } else {
            com.heytap.accessory.base.logging.a.e(simpleName, "getLoop TYPE_DAEMON failed!");
        }
        f2519c = com.heytap.accessory.connectivity.core.b.e();
    }

    public c() {
        Handler handler = b;
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage();
            messageObtainMessage.what = 1;
            b.sendMessage(messageObtainMessage);
        }
    }

    public static c b() {
        if (d == null) {
            d = new c();
        }
        return d;
    }

    public boolean a(int i, String str, int i2) {
        Message messageObtainMessage = b.obtainMessage();
        messageObtainMessage.what = 10;
        messageObtainMessage.obj = str;
        messageObtainMessage.arg1 = i;
        messageObtainMessage.arg2 = i2;
        if (FrameworkService.isRegisterIntentSent()) {
            b.sendMessage(messageObtainMessage);
            return true;
        }
        com.heytap.accessory.base.logging.a.a(a, "RegisterIntent was not sent. Connect later");
        b.sendMessageDelayed(messageObtainMessage, xx0.SCROLL_DELAYED);
        return true;
    }

    public boolean b(ConnectConfig connectConfig) {
        Message messageObtainMessage = b.obtainMessage();
        messageObtainMessage.what = 11;
        messageObtainMessage.obj = connectConfig;
        b.sendMessage(messageObtainMessage);
        return true;
    }

    public boolean a(ConnectConfig connectConfig) {
        Message messageObtainMessage = b.obtainMessage();
        messageObtainMessage.what = 10;
        messageObtainMessage.obj = connectConfig;
        if (FrameworkService.isRegisterIntentSent()) {
            b.sendMessage(messageObtainMessage);
            return true;
        }
        com.heytap.accessory.base.logging.a.a(a, "RegisterIntent was not sent. Connect later");
        b.sendMessageDelayed(messageObtainMessage, xx0.SCROLL_DELAYED);
        return true;
    }

    public boolean a(int i, String str) {
        Message messageObtainMessage = b.obtainMessage();
        messageObtainMessage.what = 11;
        messageObtainMessage.obj = str;
        messageObtainMessage.arg1 = i;
        b.sendMessage(messageObtainMessage);
        return true;
    }
}
