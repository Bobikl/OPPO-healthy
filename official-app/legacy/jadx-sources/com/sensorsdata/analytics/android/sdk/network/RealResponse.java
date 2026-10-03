package com.sensorsdata.analytics.android.sdk.network;

import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class RealResponse {
    public int code;
    public long contentLength;
    public String errorMsg;
    public Exception exception;
    public String location;
    public String result;

    public String toString() {
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[5];
        objArr[0] = Integer.valueOf(this.code);
        objArr[1] = this.result;
        objArr[2] = this.location;
        objArr[3] = this.errorMsg;
        Exception exc = this.exception;
        objArr[4] = exc == null ? "" : exc.getMessage();
        return String.format(locale, "code:%d\nresult:%s\nlocation:%s\nerrorMsg:%s\nexception:%s", objArr);
    }
}
