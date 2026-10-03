package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes6.dex */
public class cxe {
    public static final int ASSIGN_NUMBER_ERROR = 300;
    public static final int DONT_HAVE_APPID = 101;
    public static final int DONT_HAVE_APP_KEY = 102;
    public static final int DONT_HAVE_APP_SECRET = 103;
    public static final int DONT_HAVE_CALLING_PKG = 107;
    public static final int DONT_HAVE_EVENT_GROUP = 104;
    public static final int DONT_HAVE_EVENT_ID = 105;
    public static final int DONT_HAVE_EVENT_INFO = 106;
    public static final int DONT_HAVE_EVENT_RULES = 400;
    public static final int DONT_HAVE_REQUEST = 100;
    public static final int FAILED_TO_SAMPLING_HIT = 500;
    public static final int FAILED_TO_SAVE_TO_DB = 600;
    public static final int ILLEGAL_CALLING_PKG = 200;
    public static final String MSG_ASSIGN_NUMBER_ERROR = "Failed to assign sequence number";
    public static final String MSG_DONT_HAVE_APPID = "Missing required parameter: AppId";
    public static final String MSG_DONT_HAVE_APP_KEY = "Missing required parameter: AppKey";
    public static final String MSG_DONT_HAVE_APP_SECRET = "Missing required parameter: AppSecret";
    public static final String MSG_DONT_HAVE_CALLING_PKG = "Missing required parameter: CallingPkg";
    public static final String MSG_DONT_HAVE_EVENT_GROUP = "Missing required parameter: EventGroup";
    public static final String MSG_DONT_HAVE_EVENT_ID = "Missing required parameter: EventId";
    public static final String MSG_DONT_HAVE_EVENT_INFO = "Missing required parameter: EventInfo";
    public static final String MSG_DONT_HAVE_REQUEST = "IPC request is null";
    public static final String MSG_FAILED_TO_SAMPLING_HIT = "Failed to sampling hit";
    public static final String MSG_FAILED_TO_SAVE_TO_DB = "Failed to save to db";
    public static final String MSG_ILLEGAL_CALLING_PKG = "Illegal calling package";
    public static final String MSG_NOT_IN_WHITE_LIST = "Dont have event rules";
    public static final String MSG_QUOTA_EXCEEDED = "Ingest quota exceeded";
    public static final String MSG_SERVER_BUSY = "Ingest backpressure (server_busy)";
    public static final String MSG_SUC = "Success";
    public static final String MSG_UNKNOWN = "Unknown cause";
    public static final int QUOTA_EXCEEDED = 602;
    public static final int SERVER_BUSY = 601;
    public static final int SUC = 0;
    public static final int UNKNOWN = -1;

    public static String a(int i) {
        if (i == 0) {
            return MSG_SUC;
        }
        if (i == 200) {
            return MSG_ILLEGAL_CALLING_PKG;
        }
        if (i == 300) {
            return MSG_ASSIGN_NUMBER_ERROR;
        }
        if (i == 400) {
            return MSG_NOT_IN_WHITE_LIST;
        }
        if (i == 500) {
            return MSG_FAILED_TO_SAMPLING_HIT;
        }
        switch (i) {
            case 100:
                return MSG_DONT_HAVE_REQUEST;
            case 101:
                return MSG_DONT_HAVE_APPID;
            case 102:
                return MSG_DONT_HAVE_APP_KEY;
            case 103:
                return MSG_DONT_HAVE_APP_SECRET;
            case 104:
                return MSG_DONT_HAVE_EVENT_GROUP;
            case 105:
                return MSG_DONT_HAVE_EVENT_ID;
            case 106:
                return MSG_DONT_HAVE_EVENT_INFO;
            case 107:
                return MSG_DONT_HAVE_CALLING_PKG;
            default:
                switch (i) {
                    case 600:
                        return MSG_FAILED_TO_SAVE_TO_DB;
                    case 601:
                        return MSG_SERVER_BUSY;
                    case 602:
                        return MSG_QUOTA_EXCEEDED;
                    default:
                        return "Unknown error code: " + i;
                }
        }
    }
}
