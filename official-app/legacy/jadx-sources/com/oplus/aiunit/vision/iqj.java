package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes18.dex */
public class iqj {
    public static final String BROADCAST_ACTION_CALL_ABORT = "oplusos.intent.action.telecom.CALL_ABNORMAL_ABORT";
    public static final String BROADCAST_ACTION_CONNECTION_CHANGE = "oplusos.intent.action.health.DEVICE_CONNECTION_STATE_CHANGED";
    public static final String CLIENT_PACKAGE = "com.android.server.telecom";
    public static final int CMD_FROM_PHONE = 1;
    public static final int CMD_FROM_WEARABLE_DEVICE = 2;
    public static final int CMD_ID_PHONE_SMS = 3;
    public static final String CONNECT_MAC_ADDRESS = "connect_mac_address";
    public static final String CONNECT_STATUS = "connect_status";
    public static final String CONNECT_TYPE = "connect_type";
    public static final int CONNECT_TYPE_WATCH = 1;
    public static final String EXTRA_HIDE_CALL_UI = "oplusos.telecom.extra.HIDE_UI";
    public static final String OPPO_DISCONNECT_CAUSE_CODE = "oplus_disconnectCause";
    public static final String PATH_PHONE_SMS = "/telecom/phonesms";
    public static final String PATH_PHONE_TELECOM = "/telecom/phonetelecom";
    public static final int PHONE_EVENT_AUDIO_STATE = 7;
    public static final int PHONE_EVENT_CALL_DISCONNECTED = 5;
    public static final int PHONE_EVENT_CHANGE_VIDEO = 2;
    public static final int PHONE_EVENT_MERGE_CALL = 3;
    public static final int PHONE_EVENT_MUTE_CALL = 6;
    public static final int PHONE_EVENT_SEPARATE_CALL = 4;
    public static final int PHONE_EVENT_SILENCE_RINGER = 1;
    public static final String PROTOCOL_VERSION = "version";
    public static final int SERVICE_ID_PHONE_SMS = 7;
    public static final int SERVICE_ID_PHONE_TELECOM = 6;
    public static final int STATUS_CONNECTED = 1;
    public static final int STATUS_DISCONNECTED = 0;
    public static final int WEAR_EVENT_ANSWER_CALL = 101;
    public static final int WEAR_EVENT_AUDIO_LIST_INQUIRE = 108;
    public static final int WEAR_EVENT_GET_PHONE_MUIT_STATE = 104;
    public static final int WEAR_EVENT_MUTE_CALL = 103;
    public static final int WEAR_EVENT_SET_AUDIO_STATE = 106;
    public static final int WEAR_EVENT_SHOW_INCALLUI = 105;
    public static final int WEAR_EVENT_SILENCE_RINGER = 102;
    public static final int WEAR_EVENT_SUPPORTED_SET_AUDIO_STATE = 107;

    public static int a(int i) {
        if (i == 1) {
            return 101;
        }
        if (i == 2) {
            return 102;
        }
        if (i == 3) {
            return 103;
        }
        if (i != 4) {
            return i != 6 ? -1 : 105;
        }
        return 104;
    }

    public static int b(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 5;
            case 3:
            case 4:
                return 6;
            case 5:
                return 11;
            case 6:
            case 7:
                return 12;
            default:
                return -1;
        }
    }
}
