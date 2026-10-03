package com.platform.usercenter.basic.core.mvvm;

import androidx.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.network.trace.ITraceController;
import com.platform.usercenter.network.trace.LogScope;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class CoreResponse<T> implements ITraceController {

    @SerializedName(alternate = {"result"}, value = "code")
    public int code;
    public T data;
    public ErrorResp error;

    @SerializedName(alternate = {"msg", "resultMsg", "errMsg"}, value = "message")
    public String message;
    public boolean success;

    @Keep
    public static class ErrorResp {
        public int code;

        @SerializedName(alternate = {"msg"}, value = "message")
        public String message;
    }

    private CoreResponse(int i, String str, T t) {
        this.code = i;
        this.message = str;
        this.data = t;
    }

    public static <T> CoreResponse<T> error(int i, String str) {
        return new CoreResponse<>(i, str, null);
    }

    public static <T> CoreResponse<T> success(T t) {
        return new CoreResponse<>(t);
    }

    public int getCode() {
        return this.code;
    }

    public T getData() {
        return this.data;
    }

    public ErrorResp getError() {
        return this.error;
    }

    public String getMessage() {
        return this.message;
    }

    public boolean isSuccess() {
        return this.success;
    }

    @Override // com.platform.usercenter.network.trace.ITraceController
    @NonNull
    public LogScope logControl() {
        return this.success ? LogScope.LOG_CLEARTEXT_PART : LogScope.LOG_ALL;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setData(T t) {
        this.data = t;
    }

    public void setError(ErrorResp errorResp) {
        this.error = errorResp;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setSuccess(boolean z) {
        this.success = z;
    }

    @Override // com.platform.usercenter.network.trace.ITraceController
    public boolean traceControl(@NonNull Map<String, String> map) {
        return !this.success;
    }

    public static <T> CoreResponse<T> error(int i, String str, T t) {
        return new CoreResponse<>(i, str, t);
    }

    private CoreResponse(T t) {
        this.data = t;
    }
}
