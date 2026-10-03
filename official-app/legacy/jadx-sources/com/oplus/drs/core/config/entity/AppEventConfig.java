package com.oplus.drs.core.config.entity;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class AppEventConfig {
    private final String appId;
    private final List<Event> events;
    private final List<String> packages;
    private final int v;

    public static class Event {
        private final int code;
        private final int grade;
        private final String group;
        private final String name;
        private final int networkType;
        private final int status;
        private final int uploadType;

        public Event(int i, int i2, int i3, int i4, String str, String str2, int i5) {
            this.code = i;
            this.grade = i2;
            this.networkType = i3;
            this.uploadType = i4;
            this.group = str;
            this.name = str2;
            this.status = i5;
        }

        public int getCode() {
            return this.code;
        }

        public int getGrade() {
            return this.grade;
        }

        public String getGroup() {
            return this.group;
        }

        public String getName() {
            return this.name;
        }

        public int getNetworkType() {
            return this.networkType;
        }

        public int getStatus() {
            return this.status;
        }

        public int getUploadType() {
            return this.uploadType;
        }
    }

    public AppEventConfig(String str, int i, List<String> list, List<Event> list2) {
        this.appId = str;
        this.v = i;
        this.packages = list;
        this.events = list2;
    }

    public String getAppId() {
        return this.appId;
    }

    public List<Event> getEvents() {
        return this.events;
    }

    public List<String> getPackages() {
        return this.packages;
    }

    public int getV() {
        return this.v;
    }

    @NonNull
    public String toString() {
        return "AppEventConfig{appId=" + this.appId + ", v=" + this.v + ", packages=" + this.packages + ", events=...}";
    }
}
