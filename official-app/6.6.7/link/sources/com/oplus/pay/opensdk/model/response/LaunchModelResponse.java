package com.oplus.pay.opensdk.model.response;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
public class LaunchModelResponse {
    public AppRouteConfigResDTO appRouteConfigResDTO;

    @Keep
    public class AppRouteConfigResDTO {
        public String launchModel = "";
        public int installedTotal = 0;
        public int numerator = 0;
        public int denominator = 0;

        public AppRouteConfigResDTO() {
        }
    }
}
