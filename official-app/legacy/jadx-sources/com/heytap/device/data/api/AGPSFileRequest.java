package com.heytap.device.data.api;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class AGPSFileRequest {
    public static final int AGPS_TYPE_BEIDOU = 5;
    public static final int AGPS_TYPE_BEIDOU_3DAY = 301;
    public static final int AGPS_TYPE_GALILEO = 6;
    public static final int AGPS_TYPE_GALILEO_3DAY = 300;
    public static final int AGPS_TYPE_GPS_AND_GL = 4;
    public static final int AGPS_TYPE_IONOSPHERE = 303;
    public static final int AGPS_TYPE_RTO = 304;
    public static final int AGPS_TYPE_WATCH4 = 302;
    public String deviceUniqueId;
    public int resourceType;
}
