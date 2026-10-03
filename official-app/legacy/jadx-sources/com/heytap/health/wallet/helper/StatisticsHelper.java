package com.heytap.health.wallet.helper;

import android.text.TextUtils;
import com.heytap.health.base.track.quality.QualityTrack;
import com.heytap.health.base.track.quality.Scenes;
import com.oplus.aiunit.vision.d04;
import java.util.HashMap;

/* JADX INFO: loaded from: classes18.dex */
public class StatisticsHelper {
    public static final String EVENT_TOPUP_START = "7901";
    public static String V_PAGE_CARD_DETAIL = "7009";
    public static String V_PAGE_DEPOSIT_PAY = "7004";
    public static String V_PAGE_OPEN_CARD = "7003";
    public static String V_PAGE_RESUME_OPEN = "7012";
    public static HashMap<String, Scenes> a = new HashMap<String, Scenes>() { // from class: com.heytap.health.wallet.helper.StatisticsHelper.1
        {
            put("issuecard", Scenes.WALLET_BUS_OPEN);
            put("topup", Scenes.WALLET_BUS_RECHARGE);
            put("issueTopup", Scenes.WALLET_BUS_OPEN_RECHARGE);
            put("shiftout", Scenes.WALLET_BUS_MOVE_OUT);
            put("shiftin", Scenes.WALLET_BUS_MOVE_IN);
            put("deleteapp", Scenes.WALLET_BUS_DELETE);
            put("THIRD_DELETE", Scenes.WALLET_BUS_THIRD_DELETE);
            put("TAIINSTALL", Scenes.WALLET_COMMAND_TAI_INSTALL);
            put("OPENAPIENABLE", Scenes.WALLET_COMMAND_OPENAPI_ENABLE);
            put("OPENAPIDISABLE", Scenes.WALLET_COMMAND_OPENAPI_DISABLE);
        }
    };

    public enum CardPackageFailReason {
        BLE_MODE,
        BLUETOOTH_DISCONNECT,
        NFC_OFF,
        GGET_CPLC_FAIL,
        NETWORK_DISCONNECT
    }

    public static Scenes a(String str) {
        return a.get(str);
    }

    public static void b(Scenes scenes, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            QualityTrack.INSTANCE.e(scenes, "CallBack Error");
        } else if (str.equalsIgnoreCase(String.valueOf(d04.COMMANDS_EXECUTE_FAILED))) {
            QualityTrack.INSTANCE.e(scenes, str2);
        } else {
            QualityTrack.INSTANCE.e(scenes, "Server Error");
        }
    }
}
