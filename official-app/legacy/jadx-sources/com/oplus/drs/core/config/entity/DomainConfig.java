package com.oplus.drs.core.config.entity;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class DomainConfig {
    private final List<AppHostConfig> app;
    private final String bizHost;
    private final String techHost;
    private final int v;

    public static class AppHostConfig {
        private final String appId;
        private final String bizHost;
        private final String techHost;

        public AppHostConfig(String str, String str2, String str3) {
            this.appId = str;
            this.bizHost = str2;
            this.techHost = str3;
        }

        public String getAppId() {
            return this.appId;
        }

        public String getBizHost() {
            return this.bizHost;
        }

        public String getTechHost() {
            return this.techHost;
        }

        @NonNull
        public String toString() {
            return "AppHostConfig{appId=" + this.appId + ", bizHost='" + this.bizHost + "', techHost='" + this.techHost + "'}";
        }
    }

    public DomainConfig(int i, String str, String str2, List<AppHostConfig> list) {
        this.v = i;
        this.bizHost = str;
        this.techHost = str2;
        this.app = list;
    }

    public List<AppHostConfig> getApp() {
        return this.app;
    }

    public String getBizHost() {
        return this.bizHost;
    }

    public String getTechHost() {
        return this.techHost;
    }

    public int getV() {
        return this.v;
    }

    @NonNull
    public String toString() {
        return "DomainConfig{v=" + this.v + ", bizHost='" + this.bizHost + "', techHost='" + this.techHost + "', app=" + this.app + '}';
    }
}
