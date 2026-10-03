package com.heytap.msp.bean;

import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public class BizRequest<R> implements Serializable {
    private static final long serialVersionUID = 7586111481076697329L;
    private int appMinCode;
    private String appMinVersion;
    private String methodName;
    private String methodParams;
    private String methodParams2;
    private String methodParamsClass;
    private String methodParamsClass2;
    private int moduleMinCode;
    private String moduleMinVersion;
    private transient R originalRequest;
    private boolean silentMode = false;

    public int getAppMinCode() {
        return this.appMinCode;
    }

    public String getAppMinVersion() {
        return this.appMinVersion;
    }

    public String getMethodName() {
        return this.methodName;
    }

    public String getMethodParams() {
        return this.methodParams;
    }

    public String getMethodParams2() {
        return this.methodParams2;
    }

    public String getMethodParamsClass() {
        return this.methodParamsClass;
    }

    public String getMethodParamsClass2() {
        return this.methodParamsClass2;
    }

    public int getModuleMinCode() {
        return this.moduleMinCode;
    }

    public String getModuleMinVersion() {
        return this.moduleMinVersion;
    }

    public R getOriginalRequest() {
        return this.originalRequest;
    }

    public boolean isSilentMode() {
        return this.silentMode;
    }

    public void setAppMinCode(int i) {
        this.appMinCode = i;
    }

    public void setAppMinVersion(String str) {
        this.appMinVersion = str;
    }

    public void setMethodName(String str) {
        this.methodName = str;
    }

    public void setMethodParams(String str) {
        this.methodParams = str;
    }

    public void setMethodParams2(String str) {
        this.methodParams2 = str;
    }

    public void setMethodParamsClass(String str) {
        this.methodParamsClass = str;
    }

    public void setMethodParamsClass2(String str) {
        this.methodParamsClass2 = str;
    }

    public void setModuleMinCode(int i) {
        this.moduleMinCode = i;
    }

    public void setModuleMinVersion(String str) {
        this.moduleMinVersion = str;
    }

    public void setOriginalRequest(R r) {
        this.originalRequest = r;
    }

    public void setSilentMode(boolean z) {
        this.silentMode = z;
    }

    public String toString() {
        return "BizRequest{methodName='" + this.methodName + "', methodParams='" + this.methodParams + "', methodParamsClass='" + this.methodParamsClass + "', AppMinVersion='" + this.appMinVersion + "', ModuleMinVersion='" + this.moduleMinVersion + "', silentMode=" + this.silentMode + '}';
    }
}
