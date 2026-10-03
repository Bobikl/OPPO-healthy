package com.platform.usercenter.basic.core.mvvm;

import androidx.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.network.trace.ITraceController;
import com.platform.usercenter.network.trace.LogScope;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class CoreResponseAndError<Result, ErrorData> implements ITraceController {
    public int code;
    public Result data;
    public ErrorResp<ErrorData> error;
    private ErrorData errorData;

    @SerializedName(alternate = {"msg"}, value = "message")
    public String message;
    public boolean success;

    @Keep
    public static class ErrorResp<ErrorData> {
        public int code;
        public ErrorData errorData;

        @SerializedName(alternate = {"msg"}, value = "message")
        public String message;
    }

    private CoreResponseAndError(int i, String str, ErrorData errordata) {
        this.code = i;
        this.message = str;
        this.errorData = errordata;
    }

    public static <Result, ErrorData> CoreResponseAndError<Result, ErrorData> error(int i, String str, ErrorData errordata) {
        return new CoreResponseAndError<>(i, str, errordata);
    }

    public int getCode() {
        return this.code;
    }

    public Result getData() {
        return this.data;
    }

    public ErrorResp<ErrorData> getError() {
        return this.error;
    }

    public ErrorData getErrorData() {
        return this.errorData;
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

    public void setData(Result result) {
        this.data = result;
    }

    public void setError(ErrorResp<ErrorData> errorResp) {
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
}
