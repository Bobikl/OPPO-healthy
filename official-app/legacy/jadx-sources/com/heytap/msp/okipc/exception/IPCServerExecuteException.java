package com.heytap.msp.okipc.exception;

import com.heytap.log.formatter.LogFieldKey;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class IPCServerExecuteException extends IPCServerException {
    private static final int MAX_STACKTRACE_SIZE = 1024;
    private String path;
    private Throwable throwable;
    private String throwableMessage;
    private String throwableType;

    public IPCServerExecuteException() {
        this(null, null);
    }

    @Override // com.heytap.msp.okipc.exception.IPCServerException
    public IPCServerExceptionType getExceptionType() {
        return IPCServerExceptionType.EXECUTE_ERROR;
    }

    public String getPath() {
        return this.path;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    @Override // com.heytap.msp.okipc.exception.IPCServerException
    public void readFrom(JSONObject jSONObject) {
        this.path = jSONObject.optString("path");
        this.throwableType = jSONObject.optString("throwableType");
        this.throwableMessage = jSONObject.optString("throwableMessage");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("stacktrace");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return;
        }
        RuntimeException runtimeException = new RuntimeException(this.throwableType != null ? "[" + this.throwableType + "] " + this.throwableMessage : this.throwableMessage);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[jSONArrayOptJSONArray.length()];
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                stackTraceElementArr[i] = new StackTraceElement(jSONObjectOptJSONObject.optString("c", ""), jSONObjectOptJSONObject.optString(LogFieldKey.MESSAGE_KEY, ""), jSONObjectOptJSONObject.optString("f", null), jSONObjectOptJSONObject.optInt(LogFieldKey.LEVEL_KEY, -1));
            }
        }
        runtimeException.setStackTrace(stackTraceElementArr);
        this.throwable = runtimeException;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setThrowable(Throwable th) {
        this.throwable = th;
    }

    @Override // com.heytap.msp.okipc.exception.IPCServerException
    public void writeTo(JSONObject jSONObject) {
        try {
            jSONObject.put("path", this.path);
            Throwable th = this.throwable;
            jSONObject.put("throwableType", th != null ? th.getClass().getCanonicalName() : null);
            Throwable th2 = this.throwable;
            jSONObject.put("throwableMessage", th2 != null ? th2.getMessage() : null);
            JSONArray jSONArray = new JSONArray();
            Throwable th3 = this.throwable;
            if (th3 != null) {
                int length = 0;
                for (StackTraceElement stackTraceElement : th3.getStackTrace()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("c", stackTraceElement.getClassName());
                    jSONObject2.put(LogFieldKey.MESSAGE_KEY, stackTraceElement.getMethodName());
                    jSONObject2.put("f", stackTraceElement.getFileName());
                    jSONObject2.put(LogFieldKey.LEVEL_KEY, stackTraceElement.getLineNumber());
                    length += jSONObject2.toString().length();
                    if (length > 1024) {
                        break;
                    }
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("stacktrace", jSONArray);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public IPCServerExecuteException(String str, Throwable th) {
        this.path = str;
        this.throwable = th;
    }
}
