package com.heytap.weather.vo;

import com.heytap.weather.constant.BusinessConstants$SdkReturnCode;

/* JADX INFO: loaded from: classes3.dex */
public class WeatherVO {
    private Exception exception;
    private Object object;
    private BusinessConstants$SdkReturnCode sdkReturnCode;

    public Exception getException() {
        return this.exception;
    }

    public Object getObject() {
        return this.object;
    }

    public BusinessConstants$SdkReturnCode getSdkReturnCode() {
        return this.sdkReturnCode;
    }

    public void setException(Exception exc) {
        this.exception = exc;
    }

    public void setObject(Object obj) {
        this.object = obj;
    }

    public void setSdkReturnCode(BusinessConstants$SdkReturnCode businessConstants$SdkReturnCode) {
        this.sdkReturnCode = businessConstants$SdkReturnCode;
    }
}
