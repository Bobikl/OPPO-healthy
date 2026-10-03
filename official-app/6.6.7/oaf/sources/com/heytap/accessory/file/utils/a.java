package com.heytap.accessory.file.utils;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.UserManager;
import androidx.annotation.NonNull;
import com.heytap.accessory.base.AccessoryManager;
import com.heytap.accessory.file.model.CancelRequest;
import com.heytap.accessory.file.model.CtrlResponse;
import com.heytap.accessory.file.model.SetupRequest;
import com.heytap.accessory.utils.XmlReader;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class a {
    public static final String a = "a";
    public static Context b;

    public static boolean a(CancelRequest cancelRequest, SetupRequest setupRequest) {
        if (setupRequest != null) {
            return cancelRequest.d() == setupRequest.l();
        }
        com.heytap.accessory.base.logging.a.e(a, "Cancel request was received after request was dropped.Cancel Request:" + cancelRequest.toString());
        return false;
    }

    public static int b() {
        return 60000;
    }

    public static int c(int i) {
        int i2;
        String str;
        if (i != 1) {
            i2 = 10000;
            if (i == 2) {
                str = XmlReader.TRANSPORT_BT;
            } else if (i != 4) {
                com.heytap.accessory.base.logging.a.e(a, "unsupported transport time, return default ctrl timeout");
                str = null;
            } else {
                i2 = 15000;
                str = XmlReader.TRANSPORT_BLE;
            }
        } else {
            i2 = 30000;
            str = XmlReader.TRANSPORT_WIFI;
        }
        com.heytap.accessory.base.logging.a.a(a, "getCtrlTimeout transport: " + str + " " + i2 + "ms");
        return i2;
    }

    public static int d(int i) {
        if (i == 1) {
            return 64888;
        }
        if (i == 2) {
            return 32768;
        }
        if (i == 4) {
            return 4680;
        }
        com.heytap.accessory.base.logging.a.e(a, "unsupported transport time, return default packet length");
        return 32768;
    }

    public static int e(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 20;
        }
        if (i == 4) {
            return 10;
        }
        com.heytap.accessory.base.logging.a.e(a, "unsupported transport time, return default send delay(interval)");
        return 180;
    }

    public static String f(int i) {
        switch (i) {
            case 1:
                return "Data read/write failed";
            case 2:
                return "File read/write failed";
            case 3:
                return "Invalid command was dropped";
            case 4:
                return "Time out";
            case 5:
                return "Connection lost";
            case 6:
                return "Invalid file requested";
            case 7:
                return "Provider is busy";
            case 8:
                return "Consumer is busy";
            case 9:
                return "User rejected the request";
            case 10:
                return "File Transfer service is busy.";
            case 11:
                return "Space not available";
            default:
                return "";
        }
    }

    public static int g(int i) {
        int i2;
        String str;
        if (i != 1) {
            i2 = 10000;
            if (i == 2) {
                str = XmlReader.TRANSPORT_BT;
            } else if (i != 4) {
                com.heytap.accessory.base.logging.a.e(a, "unsupported transport time, return default setup timeout");
                str = null;
            } else {
                i2 = 15000;
                str = XmlReader.TRANSPORT_BLE;
            }
        } else {
            i2 = 30000;
            str = XmlReader.TRANSPORT_WIFI;
        }
        com.heytap.accessory.base.logging.a.a(a, "getSetupTimeout transport: " + str + " " + i2 + "ms");
        return i2;
    }

    public static int b(int i) {
        int i2 = i - 1;
        com.heytap.accessory.base.logging.a.a(a, "getChunk " + i2);
        return i2;
    }

    public static boolean a(CtrlResponse ctrlResponse, SetupRequest setupRequest) {
        if (setupRequest != null) {
            return ctrlResponse.f() == setupRequest.l();
        }
        com.heytap.accessory.base.logging.a.e(a, "Response was received after request was dropped.Response:" + ctrlResponse.toString());
        return false;
    }

    public static boolean c() {
        if (a() == null) {
            return true;
        }
        if (((UserManager) a().getSystemService(UserManager.class)).isUserUnlocked()) {
            com.heytap.accessory.base.logging.a.a(a, "User is unlocked");
            return true;
        }
        com.heytap.accessory.base.logging.a.a(a, "User is locked");
        return false;
    }

    public static void a(Handler handler, int i, int i2) {
        Message messageObtainMessage = handler.obtainMessage(i);
        messageObtainMessage.setData(a(i2));
        handler.sendMessage(messageObtainMessage);
    }

    public static void a(Handler handler, int i, @NonNull Bundle bundle) {
        Message messageObtainMessage = handler.obtainMessage(i);
        messageObtainMessage.setData(bundle);
        handler.sendMessage(messageObtainMessage);
    }

    public static String a(CtrlResponse ctrlResponse) {
        if (ctrlResponse.b().equalsIgnoreCase("filetransfer-setup-rsp")) {
            return "Setup Failed " + f(ctrlResponse.c());
        }
        if (ctrlResponse.b().equalsIgnoreCase("filetransfer-cancel-rsp")) {
            return "Transfer Canceled " + f(ctrlResponse.c());
        }
        com.heytap.accessory.base.logging.a.e(a, "Error message not resolved for" + ctrlResponse.b());
        return "Transfer Failed " + f(ctrlResponse.c());
    }

    public static int a(long j, int i, int i2, int i3) {
        int iC;
        com.heytap.accessory.base.bean.b bVarA = AccessoryManager.h().a(j);
        int iD = d(i);
        if (bVarA != null && bVarA.c() != 0 && (iC = (bVarA.c() - i2) - i3) < iD) {
            iD = iC;
        }
        com.heytap.accessory.base.logging.a.a(a, "actually packet Length " + iD);
        return iD;
    }

    public static void a(Context context) {
        b = context;
    }

    public static Context a() {
        return b;
    }

    public static Bundle a(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("transId", i);
        return bundle;
    }
}
