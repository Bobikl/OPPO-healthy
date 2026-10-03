package com.oplus.aiunit.model;

import com.lifesense.plugin.ble.data.IBManagerConfig;
import com.oplus.aiunit.vision.ymi;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
public interface kr8 {
    public static final int ACT_GOAL_DEFAULT = 12;
    public static final int BEST_100MI_PACE = 35;
    public static final int BEST_100M_PACE = 40;
    public static final int BEST_PACE_LIMIT_SEC = 120;
    public static final int BEST_PACE_LIMIT_SEC_BT = 180;
    public static final int BEST_PACE_LIMIT_SEC_BY_LAP = 40;
    public static final double BEST_RIDE_SPEED_LIMIT_KM = 99.9d;
    public static final double BEST_RIDE_SPEED_LIMIT_KM_BT = 62.5d;
    public static final int BEST_STEPRATE_LIMIT = 300;
    public static final int BEST_SWIM_SPEED_LIMIT_MIL = 40;
    public static final double CALORIES_LIMIT = 9999.0d;
    public static final int CAL_GOAL_DEFAULT = 300000;
    public static final double DAY_CALORIES_LIMIT = 9999.0d;
    public static final double DAY_DISTANCE_LIMIT = 999.9d;
    public static final double DAY_DURATION_LIMIT = 23.9d;
    public static final int DAY_STEP_LIMIT = 99999;
    public static final String INTENT_EXTRA_STABLE_NOTIFY = "NotifyPermanent";
    public static final int MAX_ALTITUDE = 8848;
    public static final int MAX_ALTITUDE_BT = 30000;
    public static final int MAX_CLIMB_SPEED = 96;
    public static final int MAX_HEARTRATE = 220;
    public static final int MAX_OPEN_WATER_SWIM_STROKE_FREQ = 200;
    public static final int MAX_ROPE_SKIPPING_SPEED = 400;
    public static final int MAX_STRIDE = 300;
    public static final int MAX_STRIDE_BT = 999;
    public static final int MAX_SWIM_STROKE_FREQ = 100;
    public static final String MIAO_RECOM = "miao_recom";
    public static final int MIN_ALTITUDE = -422;
    public static final int MIN_ALTITUDE_BT = -1400;
    public static final int MIN_CLIMB_SPEED = 0;
    public static final int MIN_HEARTRATE = 40;
    public static final int MIN_OPEN_WATER_SWIM_STROKE_FREQ = 0;
    public static final int MIN_STRIDE = 0;
    public static final int MIN_SWIM_STROKE_FREQ = 0;
    public static final String SHARE_COMMON_QR_URL = "https://hd.opposhop.cn/bp/61995a7b03086a34?nightModelEnable=true&utm_source=jiankang&utm_medium=weixinfenxiang";
    public static final int SKI_SPEED_LIMIT_KM = 255;
    public static final int SKI_SPEED_LIMIT_KM_BT = 160;
    public static final double SPEED_LIMIT = 99.9d;
    public static final String SP_APP_SHELVES_STATUS_NOTIFY = "SPAppShelvesNotify";
    public static final String SP_APP_UPDATE_STATUS_NOTIFY = "SPAppUpdateNotify";
    public static final String SP_ASSESSMENT_DETAIL_STATUS_NOTIFY = "SPAssessmentDetailNotify";
    public static final String SP_COMMUNITY_STATUS_NOTIFY = "SPCommunityStatusNotify";
    public static final String SP_ECG_DETAIL_STATUS_NOTIFY = "SPEcgDetailNotify";
    public static final String SP_HEART_RATE_STATUS_NOTIFY = "SPHeartRateNotify";
    public static final String SP_KEY_FORCE_STABLE_NOTIFY = "SPNotifyPermanent";
    public static final String SP_MEDAL_RECORD_STATUS_NOTIFY = "SPMedalRecordNotify";
    public static final String SP_OPERATION_ACTIVITY_STATUS_NOTIFY = "SPOperationActivityStatusNotify";
    public static final String SP_QUESTIONNAIRE_STATUS_NOTIFY = "SPQuestionnaireStatusNotify";
    public static final String SP_SLEEP_STATUS_NOTIFY = "SPSleepNotify";
    public static final String SP_SPORT_STATUS_NOTIFY = "SPSportNotify";
    public static final String SP_STATUS_ALIVE = "SPAliveNotify";
    public static final String SP_WATCHFACE_UPDATE_STATUS_NOTIFY = "SPWatchfaceUpdateNotify";
    public static final String SP_WEEKLY_REPORT_STATUS_NOTIFY = "SPWeeklyReportNotify";
    public static final String STEP_CARD_SHARE_BRAND_LOGO = "share_brand_logo";
    public static final String STEP_CARD_SHARE_BRAND_SLOGAN = "share_brand_slogan";
    public static final String STEP_CARD_SHARE_QR_DESC = "share_qr_desc";
    public static final String STEP_CARD_SHARE_QR_URL = "share_qr_url";
    public static final int STEP_GOAL_DEFAULT = 8000;
    public static final int STEP_GOAL_MAX = 20000;
    public static final int STEP_GOAL_MIN = 2000;
    public static final int TIME_GOAL_DEFAULT = 30;
    public static final String TOTAL_DISTANCE_LIMIT = "99999+";
    public static final int WORST_100MI_PACE = 540;
    public static final int WORST_100M_PACE = 600;
    public static final int WORST_PACE_LIMIT_SEC = 3000;
    public static final int WORST_PACE_LIMIT_SEC_BT = 3600;
    public static final int WORST_PACE_LIMIT_SEC_BY_LAP = 1500;
    public static final int WORST_PACE_LIMIT_SEC_FOR_BAND = 3000;
    public static final int WORST_RIDE_SPEED_LIMIT_KM = 0;
    public static final int WORST_STEPRATE_LIMIT = 0;
    public static final int WORST_SWIM_SPEED_LIMIT_MIL = 1200;
    public static final boolean WS_DEVICE_CONNECTED = false;
    public static final String WS_SYNC_SLEEP_OUT_NOTIFY = "ws_sync_sleep_out_notify";

    static long a(long j) {
        long j2;
        if (ymi.I()) {
            j2 = 180;
            if (j >= 180) {
                j2 = 3600;
                if (j <= 3600) {
                    return j;
                }
            }
        } else {
            j2 = 120;
            if (j >= 120) {
                j2 = IBManagerConfig.MIN_PAUSES_TIME;
                if (j <= IBManagerConfig.MIN_PAUSES_TIME) {
                    return j;
                }
            }
        }
        return j2;
    }
}