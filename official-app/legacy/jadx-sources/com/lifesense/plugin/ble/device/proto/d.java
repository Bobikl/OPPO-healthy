package com.lifesense.plugin.ble.device.proto;

/* JADX INFO: loaded from: classes5.dex */
public interface d {
    public static final String COMMAND_VERSION = "AA01";
    public static final int CONNECTION_REQUEST_TIME = 60000;
    public static final int CONNECT_TIMEOUT = 120000;
    public static final String DEVICE_MODEL_PEDOMETER = "4";
    public static final int DEVICE_PAIR_TIME_OUT = 30000;
    public static final int DEVICE_PAIR_TIME_OUT_180 = 180000;
    public static final int DISCOVER_SERVICE_TIMEOUT = 120000;
    public static final int ENABLE_RECONNECT_COUNT = 3;
    public static final int MAX_FRAME_FOR_EACH_CONNECTION_INTERVAL = 6;
    public static final int MAX_RECONNECT_COUNT = 3;
    public static final int MAX_SURVIVAL_TIME_FOR_MESSAGE_WORKER = 70000;
    public static final int RECONNECT_TIME_ON_PAIRING_MODE = 1000;
    public static final int RECONNECT_TIME_ON_SYNC_DATA_MODE = 5000;
    public static final int RESEND_DATA_TIME_WITHOUT_ACK = 3000;
    public static final int RESTART_BLUETOOTH_PERIOD = 10000;
    public static final String[] SUPPORT_BACKGROUND_UPGRADE_MODELS = {"415", "417", "418", "422", "428"};
    public static final String[] UPGRADE_FILE_NAME_SUFFIXS = {".HEX", ".LSF", ".BIN"};
}
