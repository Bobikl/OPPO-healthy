package com.heytap.weather.vo;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MethodUrlParamsVO {
    private Long cacheExpired;
    private String method;
    private List<ParamVO> paramVOS;
    private String path;

    public Long getCacheExpired() {
        return this.cacheExpired;
    }

    public String getMethod() {
        return this.method;
    }

    public List<ParamVO> getParamVOS() {
        return this.paramVOS;
    }

    public String getPath() {
        return this.path;
    }

    public void setCacheExpired(Long l2) {
        this.cacheExpired = l2;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setParamVOS(List<ParamVO> list) {
        this.paramVOS = list;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public String toString() {
        return "MethodUrlParamsVO{method=" + this.method + ", path=" + this.path + ", paramVOS=" + this.paramVOS + '}';
    }
}
