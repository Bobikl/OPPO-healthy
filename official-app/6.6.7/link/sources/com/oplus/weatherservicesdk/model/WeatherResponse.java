package com.oplus.weatherservicesdk.model;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class WeatherResponse<JsonResult> {
    private static final long serialVersionUID = 1;
    public JsonResult data;
    public int errorCode;
    public String errorMessage;
    public String mRequestID;

    public WeatherResponse() {
    }

    public WeatherResponse(String str, int i, String str2, JsonResult jsonresult) {
        this.mRequestID = str;
        this.errorCode = i;
        this.errorMessage = str2;
        this.data = jsonresult;
    }
}
