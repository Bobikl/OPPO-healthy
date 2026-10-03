package com.heytap.health.devicemanager.devicetype.constants;

import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.processor.bean.TreadmillBleLimitBean;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public class Constants {
    public static final String BOARD_ID_9 = "9";
    public static final String DEVICE_SKU_LINING = "FF9F322A";
    public static final int DTW_ST_WATCH_ECG = 1;
    public static final int DTW_ST_WATCH_ONE = 0;
    public static final String HEX_ID = "9A07";
    public static final int ID = 1946;
    public static final String OAF = "AF00";
    public static final String PROJECT_ID_19903 = "19903";
    public static final String TREADMILL_LJJ_DEVICETYPE = "LJ12101";
    public static final String TREADMILL_LJJ_MODEL = "140171";
    public static final String TREADMILL_MODEL_EX = "xxxxxx";
    public static final String TREADMILL_SH_DEVICETYPE = "SH12101";
    public static final String TREADMILL_SH_MODEL = "41E2FB";
    public static final String TREADMILL_XQ_DEVICETYPE = "XQ12101";
    public static final String TREADMILL_XQ_MODEL = "73FA98";
    public static final String TREADMILL_YP_DEVICETYPE = "YP12101";
    public static final String TREADMILL_YP_MODEL = "537CFB";
    public static final Set<String> sBigWatchSet = new HashSet<String>() { // from class: com.heytap.health.devicemanager.devicetype.constants.Constants.1
        {
            DeviceConstants.Companion companion = DeviceConstants.INSTANCE;
            add(companion.m0());
            add(companion.n0());
            add(companion.b0());
            add(companion.c0());
        }
    };
    public static final Set<String> sBigWatch2Set = new HashSet<String>() { // from class: com.heytap.health.devicemanager.devicetype.constants.Constants.2
        {
            DeviceConstants.Companion companion = DeviceConstants.INSTANCE;
            add(companion.b0());
            add(companion.c0());
        }
    };
    public static final Set<String> sSmallWatch2Set = new HashSet<String>() { // from class: com.heytap.health.devicemanager.devicetype.constants.Constants.3
        {
            DeviceConstants.Companion companion = DeviceConstants.INSTANCE;
            add(companion.e0());
            add(companion.d0());
        }
    };
    public static final List<TreadmillBleLimitBean> TREADMILL_BLE_LIMIT_BEANS = new ArrayList<TreadmillBleLimitBean>() { // from class: com.heytap.health.devicemanager.devicetype.constants.Constants.4
        {
            add(new TreadmillBleLimitBean(Constants.TREADMILL_SH_MODEL, Constants.TREADMILL_SH_DEVICETYPE));
            add(new TreadmillBleLimitBean(Constants.TREADMILL_YP_MODEL, Constants.TREADMILL_YP_DEVICETYPE));
            add(new TreadmillBleLimitBean(Constants.TREADMILL_LJJ_MODEL, Constants.TREADMILL_LJJ_DEVICETYPE));
            add(new TreadmillBleLimitBean(Constants.TREADMILL_XQ_MODEL, Constants.TREADMILL_XQ_DEVICETYPE));
        }
    };
    public static final List<String> TREADMILL_TYPES = new ArrayList<String>() { // from class: com.heytap.health.devicemanager.devicetype.constants.Constants.5
        {
            add(Constants.TREADMILL_SH_DEVICETYPE);
            add(Constants.TREADMILL_YP_DEVICETYPE);
            add(Constants.TREADMILL_LJJ_DEVICETYPE);
            add(Constants.TREADMILL_XQ_DEVICETYPE);
        }
    };
    public static final List<String> TREADMILL_MODELIDS = new ArrayList<String>() { // from class: com.heytap.health.devicemanager.devicetype.constants.Constants.6
        {
            add(Constants.TREADMILL_SH_MODEL);
            add(Constants.TREADMILL_YP_MODEL);
            add(Constants.TREADMILL_LJJ_MODEL);
            add(Constants.TREADMILL_XQ_MODEL);
        }
    };
}
