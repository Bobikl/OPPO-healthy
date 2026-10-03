package com.lifesense.device.scale.application.interfaces.domain;

/* JADX INFO: loaded from: classes4.dex */
public class HistoryDataNotify {
    public String deviceId;
    public HistoryDataState historyDataState;
    public int precent;

    public enum HistoryDataState {
        START,
        SYNCING,
        END
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public HistoryDataState getHistoryDataState() {
        return this.historyDataState;
    }

    public int getPrecent() {
        return this.precent;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setHistoryDataState(HistoryDataState historyDataState) {
        this.historyDataState = historyDataState;
    }

    public void setPrecent(int i) {
        this.precent = i;
    }

    public String toString() {
        return "HistoryDataNotify{deviceId='" + this.deviceId + "', historyDataState=" + this.historyDataState + ", precent=" + this.precent + '}';
    }
}
