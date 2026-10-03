package com.heytap.msp.okipc.exception;

import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class IPCServerTimeoutException extends IPCServerException {
    private long timeInMillis;

    public IPCServerTimeoutException() {
        this(0L);
    }

    @Override // com.heytap.msp.okipc.exception.IPCServerException
    public IPCServerExceptionType getExceptionType() {
        return IPCServerExceptionType.TIMEOUT;
    }

    public long getTimeInMillis() {
        return this.timeInMillis;
    }

    @Override // com.heytap.msp.okipc.exception.IPCServerException
    public void readFrom(JSONObject jSONObject) {
        this.timeInMillis = jSONObject.optLong(ClickApiEntity.TIME, 0L);
    }

    public void setTimeInMillis(long j2) {
        this.timeInMillis = j2;
    }

    @Override // com.heytap.msp.okipc.exception.IPCServerException
    public void writeTo(JSONObject jSONObject) {
        try {
            jSONObject.put(ClickApiEntity.TIME, this.timeInMillis);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public IPCServerTimeoutException(long j2) {
        this.timeInMillis = j2;
    }
}
