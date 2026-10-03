package com.oplus.aiunit.vision;

import com.heytap.health.base.base.BaseApplication;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class jx4 {
    public static final int DATA_SYNC_INTERVAL = 7200000;
    public static final String DATA_SYNC_LOG_TAG = "Data-Sync";
    public static final String HEALTH_ECG_FILE_URI = "health_ecg_record";
    public static final String PREFIX_ECG_DATA = "EcgData:";
    public static final String RECORD_SAVE_PATH = BaseApplication.a().getExternalFilesDir("") + "/sport_record/";
    public static final String SPORT_RECORD_FILE_URI = "health_sport_record";
    public static final String SPORT_RECORD_FILE_URI_OLD = "sport_record_LS";
    public static final int SPORT_RECORD_SYNC_MIN_INVALID_TIME_ = 259200000;
    public static final int SPORT_RECORD_SYNC_RETRY_COUNT = 3;
    public static final int TIME_UNSET = -1;

    public static List<Integer> a() {
        return hy4.a(gl4.managerApi.getCurrentConnectId()).h6();
    }
}
