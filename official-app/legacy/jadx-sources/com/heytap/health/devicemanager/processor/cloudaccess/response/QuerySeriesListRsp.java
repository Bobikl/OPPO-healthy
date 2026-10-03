package com.heytap.health.devicemanager.processor.cloudaccess.response;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class QuerySeriesListRsp {
    public List<DeviceSeriesListBean> deviceSeriesList;

    @Keep
    public static class DeviceSeriesListBean {
        public String deviceSeriesCode;
        public String deviceSeriesName;
        public int deviceType;
        public String imageUrl;
    }
}
