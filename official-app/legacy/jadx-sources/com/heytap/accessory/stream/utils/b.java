package com.heytap.accessory.stream.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.UserManager;
import android.text.TextUtils;
import com.heytap.accessory.base.AccessoryManager;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.stream.model.CtrlResponse;
import com.heytap.accessory.utils.XmlReader;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.lifesense.plugin.ble.device.proto.d;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class b {
    public static final String a = "b";
    public static final float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f2760c;
    public static Context d;

    static {
        float fMaxMemory = Runtime.getRuntime().maxMemory();
        b = fMaxMemory;
        f2760c = fMaxMemory * 0.85f;
    }

    public static void a(Handler handler, int i, Bundle bundle) {
        Message messageObtainMessage = handler.obtainMessage(i);
        messageObtainMessage.setData(bundle);
        handler.sendMessage(messageObtainMessage);
    }

    public static int b(int i) {
        String str;
        int i2 = d.DEVICE_PAIR_TIME_OUT_180;
        if (i == 1) {
            str = "WIFI";
        } else if (i == 2) {
            str = XmlReader.TRANSPORT_BT;
        } else if (i != 4) {
            com.heytap.accessory.base.logging.a.e(a, "unsupported transport time, return default ctrl timeout");
            i2 = 10000;
            str = null;
        } else {
            str = XmlReader.TRANSPORT_BLE;
        }
        com.heytap.accessory.base.logging.a.a(a, "getCtrlTimeout transport: " + str + " " + i2 + "ms");
        return i2;
    }

    public static int c(int i) {
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

    public static int d(int i) {
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

    public static String e(int i) {
        switch (i) {
            case 1:
                return "Data read/write failed";
            case 2:
                return "Stream read/write failed";
            case 3:
                return "Invalid command was dropped";
            case 4:
                return "Time out";
            case 5:
                return "Connection lost";
            case 6:
                return "Invalid Stream requested";
            case 7:
                return "Provider is busy";
            case 8:
                return "Consumer is busy";
            case 9:
                return "User rejected the request";
            case 10:
                return "Stream Transfer service is busy.";
            case 11:
                return "Space not available";
            default:
                return "";
        }
    }

    public static int f(int i) {
        String str;
        int i2 = d.DEVICE_PAIR_TIME_OUT_180;
        if (i == 1) {
            str = "WIFI";
        } else if (i == 2) {
            str = XmlReader.TRANSPORT_BT;
        } else if (i != 4) {
            com.heytap.accessory.base.logging.a.e(a, "unsupported transport time, return default setup timeout");
            i2 = 10000;
            str = null;
        } else {
            str = XmlReader.TRANSPORT_BLE;
        }
        com.heytap.accessory.base.logging.a.a(a, "getSetupTimeout transport: " + str + " " + i2 + "ms");
        return i2;
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

    public static boolean b() {
        return ((float) (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())) > f2760c;
    }

    public static String a(CtrlResponse ctrlResponse) {
        if (ctrlResponse.a().equalsIgnoreCase("streamtransfer-setup-rsp")) {
            return "Setup Failed " + e(ctrlResponse.b());
        }
        if (ctrlResponse.a().equalsIgnoreCase("streamtransfer-cancel-rsp")) {
            return "Transfer Canceled " + e(ctrlResponse.b());
        }
        com.heytap.accessory.base.logging.a.e(a, "Error message not resolved for" + ctrlResponse.a());
        return "Transfer Failed " + e(ctrlResponse.b());
    }

    public static int a(long j2, int i, int i2, int i3) {
        int iV;
        com.heytap.accessory.base.bean.b bVarA = AccessoryManager.h().a(j2);
        int iC = c(i);
        if (bVarA != null && bVarA.v() != 0 && (iV = (bVarA.v() - i2) - i3) < iC) {
            iC = iV;
        }
        com.heytap.accessory.base.logging.a.a(a, "actually packet Length " + iC);
        return iC;
    }

    public static int a(int i) {
        int i2 = i - 1;
        com.heytap.accessory.base.logging.a.a(a, "getChunk " + i2);
        return i2;
    }

    public static void a(Context context) {
        d = context;
    }

    public static Context a() {
        return d;
    }

    public static void a(String str, long j2, String str2, int i) {
        JSONArray jSONArray;
        if (PlatformUtils.isOplusDevice()) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.getDefault());
            SharedPreferences sharedPreferences = PlatformUtils.getContext().getSharedPreferences(PlatformUtils.STREAM_PREFS, 0);
            String string = sharedPreferences.getString(str, "");
            try {
                if (TextUtils.isEmpty(string)) {
                    jSONArray = new JSONArray();
                } else {
                    jSONArray = new JSONArray(string);
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(SpeechConstant.KEY_TTS_TIMESTAMP, simpleDateFormat.format(new Date()));
                jSONObject.put("currentSaveBytes", j2);
                jSONObject.put("profileName", str2);
                jSONObject.put("transportType", i);
                jSONArray.put(jSONObject);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(str, jSONArray.toString());
                editorEdit.apply();
            } catch (JSONException unused) {
                com.heytap.accessory.base.logging.a.e(a, "oomStatistic JSONException");
            }
        }
    }
}
