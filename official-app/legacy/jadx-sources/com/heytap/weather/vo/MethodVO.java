package com.heytap.weather.vo;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MethodVO {
    private String host;
    private List<MethodUrlParamsVO> methodUrlParamsVOS;

    public String getHost() {
        return this.host;
    }

    public List<MethodUrlParamsVO> getMethodUrlParamsVOS() {
        return this.methodUrlParamsVOS;
    }

    public void setHost(String str) {
        this.host = str;
    }

    public void setMethodUrlParamsVOS(List<MethodUrlParamsVO> list) {
        this.methodUrlParamsVOS = list;
    }

    public String toString() {
        return "MethodVO{host=" + this.host + ", methodUrlParamsVOS=" + this.methodUrlParamsVOS + '}';
    }
}
