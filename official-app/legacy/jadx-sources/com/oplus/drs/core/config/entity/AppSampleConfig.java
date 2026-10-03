package com.oplus.drs.core.config.entity;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class AppSampleConfig {
    private final String appId;
    private final Map<String, EventCodeList> events;
    private final int sample;
    private final int v;

    public static class EventCodeList {
        private final List<Integer> codes;

        public EventCodeList(List<Integer> list) {
            this.codes = list;
        }

        public List<Integer> getCodes() {
            return this.codes;
        }

        @NonNull
        public String toString() {
            return "EventCodeList{c=" + this.codes + '}';
        }
    }

    public static class EventSample {
        private final int code;
        private final int sample;

        public EventSample(int i, int i2) {
            this.code = i;
            this.sample = i2;
        }

        public int getCode() {
            return this.code;
        }

        public int getSample() {
            return this.sample;
        }

        @NonNull
        public String toString() {
            return "EventSample{code=" + this.code + ", sample=" + this.sample + '}';
        }
    }

    public AppSampleConfig(String str, int i, int i2, Map<String, EventCodeList> map) {
        this.appId = str;
        this.v = i;
        this.sample = i2;
        this.events = map;
    }

    public String getAppId() {
        return this.appId;
    }

    public Map<String, EventCodeList> getEvents() {
        return this.events;
    }

    public int getSample() {
        return this.sample;
    }

    public int getV() {
        return this.v;
    }

    @NonNull
    public String toString() {
        return "AppSampleConfig{appId='" + this.appId + "', v=" + this.v + ", sample=" + this.sample + ", events=...}";
    }
}
