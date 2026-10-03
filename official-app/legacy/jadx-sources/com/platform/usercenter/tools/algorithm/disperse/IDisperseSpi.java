package com.platform.usercenter.tools.algorithm.disperse;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public interface IDisperseSpi {

    public static class DisperseParam {
        public int batchCount;
        public String deviceId;
        public int escapeHour;
        public long lastTriggerTime;
        public Map<String, String> map;
        public long nextTriggerTime;
        public int triggerRate;

        public DisperseParam(String str) {
            this.deviceId = str;
        }
    }

    DisperseResponse disperse(DisperseParam disperseParam);
}
